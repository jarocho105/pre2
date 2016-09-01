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

//import com.bydan.erp.facturacion.util.ProcesoRecibosConstantesFunciones;
import com.bydan.erp.facturacion.util.report.ProcesoRecibosParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.ProcesoRecibosParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.ProcesoRecibosBean;
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
public class ProcesoRecibosBeanSwingJInternalFrame extends ProcesoRecibosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoRecibosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoRecibos> procesorecibosValidator = new ClassValidator<ProcesoRecibos>(ProcesoRecibos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoRecibos procesorecibos;	
	public ProcesoRecibos procesorecibosAux;
	public ProcesoRecibos procesorecibosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoRecibos procesorecibosTotales;
	public Long idProcesoRecibosActual;
	public Long iIdNuevoProcesoRecibos=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboProvincia="";

	public List<Provincia> provinciasForeignKey;

	public List<Provincia> getprovinciasForeignKey() {
		return provinciasForeignKey;
	}

	public void setprovinciasForeignKey(List<Provincia> provinciasForeignKey) {
		this.provinciasForeignKey = provinciasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Provincia provinciaForeignKey;

	public Provincia getprovinciaForeignKey() {
		return provinciaForeignKey;
	}

	public void setprovinciaForeignKey(Provincia provinciaForeignKey) {
		this.provinciaForeignKey = provinciaForeignKey;
	}

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
	
	public Boolean isPermisoTodoProcesoRecibos;
	public Boolean isPermisoNuevoProcesoRecibos;
	public Boolean isPermisoActualizarProcesoRecibos;
	public Boolean isPermisoActualizarOriginalProcesoRecibos;
	public Boolean isPermisoEliminarProcesoRecibos;
	public Boolean isPermisoGuardarCambiosProcesoRecibos;
	public Boolean isPermisoConsultaProcesoRecibos;
	public Boolean isPermisoBusquedaProcesoRecibos;
	public Boolean isPermisoReporteProcesoRecibos;
	public Boolean isPermisoPaginacionMedioProcesoRecibos;
	public Boolean isPermisoPaginacionAltoProcesoRecibos;
	public Boolean isPermisoPaginacionTodoProcesoRecibos;
	public Boolean isPermisoCopiarProcesoRecibos;
	public Boolean isPermisoVerFormProcesoRecibos;
	public Boolean isPermisoDuplicarProcesoRecibos;
	public Boolean isPermisoOrdenProcesoRecibos;
	
	
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
	
	public ProcesoRecibosParameterReturnGeneral procesorecibosReturnGeneral;
	public ProcesoRecibosParameterReturnGeneral procesorecibosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoRecibos=false;
	public Boolean esParaAccionDesdeFormularioProcesoRecibos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoRecibosSessionBeanAdditional procesorecibosSessionBeanAdditional=null;
	
	public ProcesoRecibosSessionBeanAdditional getProcesoRecibosSessionBeanAdditional() {
		return this.procesorecibosSessionBeanAdditional;
	}
	
	public void setProcesoRecibosSessionBeanAdditional(ProcesoRecibosSessionBeanAdditional procesorecibosSessionBeanAdditional) {
		try {
			this.procesorecibosSessionBeanAdditional=procesorecibosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoRecibosBeanSwingJInternalFrameAdditional procesorecibosBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoRecibosBeanSwingJInternalFrame
	
	public ProcesoRecibosBeanSwingJInternalFrameAdditional getProcesoRecibosBeanSwingJInternalFrameAdditional() {
		return this.procesorecibosBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoRecibosBeanSwingJInternalFrameAdditional(ProcesoRecibosBeanSwingJInternalFrameAdditional procesorecibosBeanSwingJInternalFrameAdditional) {
		try {
			this.procesorecibosBeanSwingJInternalFrameAdditional=procesorecibosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoRecibosLogic procesorecibosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoRecibos procesorecibosBean;
	public ProcesoRecibosConstantesFunciones procesorecibosConstantesFunciones;
	//public ProcesoRecibosParameterReturnGeneral procesorecibosReturnGeneral;
	
	//FK
	
	public ProvinciaLogic provinciaLogic;
	public CiudadLogic ciudadLogic;
	public ZonaLogic zonaLogic;
	public GrupoClienteLogic grupoclienteLogic;
	public VendedorLogic vendedorLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoRecibos> procesoreciboss;	
	//public List<ProcesoRecibos> procesorecibossEliminados;
	//public List<ProcesoRecibos> procesorecibossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoRecibos=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoRecibos=true;
	public Boolean isVisibilidadCeldaCopiarProcesoRecibos=true;
	public Boolean isVisibilidadCeldaVerFormProcesoRecibos=true;
	public Boolean isVisibilidadCeldaOrdenProcesoRecibos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoRecibos=false;
	public Boolean isVisibilidadCeldaModificarProcesoRecibos=false;
	public Boolean isVisibilidadCeldaActualizarProcesoRecibos=false;
	public Boolean isVisibilidadCeldaEliminarProcesoRecibos=false;
	public Boolean isVisibilidadCeldaCancelarProcesoRecibos=false;
	public Boolean isVisibilidadCeldaGuardarProcesoRecibos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoRecibos=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoRecibos=false;
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdGrupoCliente=false;
	public Boolean isVisibilidadFK_IdProvincia=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	public Boolean isVisibilidadFK_IdZona=false;
	
	public Long getiIdNuevoProcesoRecibos() {
		return this.iIdNuevoProcesoRecibos;
	}

	public void setiIdNuevoProcesoRecibos(Long iIdNuevoProcesoRecibos) {
		this.iIdNuevoProcesoRecibos = iIdNuevoProcesoRecibos;
	}
	
	public Long getidProcesoRecibosActual() {
		return this.idProcesoRecibosActual;
	}

	public void setidProcesoRecibosActual(Long idProcesoRecibosActual) {
		this.idProcesoRecibosActual = idProcesoRecibosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoRecibos getprocesorecibos() {
		return this.procesorecibos;
	}

	public void setprocesorecibos(ProcesoRecibos procesorecibos) {
		this.procesorecibos = procesorecibos;
	}
	
	public ProcesoRecibos getprocesorecibosAux() {
		return this.procesorecibosAux;
	}

	public void setprocesorecibosAux(ProcesoRecibos procesorecibosAux) {
		this.procesorecibosAux = procesorecibosAux;
	}				
	
	public ProcesoRecibos getprocesorecibosAnterior() {
		return this.procesorecibosAnterior;
	}

	public void setprocesorecibosAnterior(ProcesoRecibos procesorecibosAnterior) {
		this.procesorecibosAnterior = procesorecibosAnterior;
	}	
	
	public ProcesoRecibos getprocesorecibosTotales() {
		return this.procesorecibosTotales;
	}

	public void setprocesorecibosTotales(ProcesoRecibos procesorecibosTotales) {
		this.procesorecibosTotales = procesorecibosTotales;
	}	
	
	public ProcesoRecibos getprocesorecibosBean() {
		return this.procesorecibosBean;
	}

	public void setprocesorecibosBean(ProcesoRecibos procesorecibosBean) {
		this.procesorecibosBean = procesorecibosBean;
	}	
	
	public ProcesoRecibosParameterReturnGeneral getprocesorecibosReturnGeneral() {
		return this.procesorecibosReturnGeneral;
	}

	public void setprocesorecibosReturnGeneral(ProcesoRecibosParameterReturnGeneral procesorecibosReturnGeneral) {
		this.procesorecibosReturnGeneral = procesorecibosReturnGeneral;
	}	
	
	
	public Long id_provinciaBusquedaProcesoRecibos=-1L;

	public Long getid_provinciaBusquedaProcesoRecibos() {
		return this.id_provinciaBusquedaProcesoRecibos;
	}

	public void setid_provinciaBusquedaProcesoRecibos(Long id_provinciaBusquedaProcesoRecibos) {
		this.id_provinciaBusquedaProcesoRecibos = id_provinciaBusquedaProcesoRecibos;
	}

;
	public Long id_ciudadBusquedaProcesoRecibos=-1L;

	public Long getid_ciudadBusquedaProcesoRecibos() {
		return this.id_ciudadBusquedaProcesoRecibos;
	}

	public void setid_ciudadBusquedaProcesoRecibos(Long id_ciudadBusquedaProcesoRecibos) {
		this.id_ciudadBusquedaProcesoRecibos = id_ciudadBusquedaProcesoRecibos;
	}

;
	public Long id_zonaBusquedaProcesoRecibos=-1L;

	public Long getid_zonaBusquedaProcesoRecibos() {
		return this.id_zonaBusquedaProcesoRecibos;
	}

	public void setid_zonaBusquedaProcesoRecibos(Long id_zonaBusquedaProcesoRecibos) {
		this.id_zonaBusquedaProcesoRecibos = id_zonaBusquedaProcesoRecibos;
	}

;
	public Long id_grupo_clienteBusquedaProcesoRecibos=-1L;

	public Long getid_grupo_clienteBusquedaProcesoRecibos() {
		return this.id_grupo_clienteBusquedaProcesoRecibos;
	}

	public void setid_grupo_clienteBusquedaProcesoRecibos(Long id_grupo_clienteBusquedaProcesoRecibos) {
		this.id_grupo_clienteBusquedaProcesoRecibos = id_grupo_clienteBusquedaProcesoRecibos;
	}

;
	public Long id_vendedorBusquedaProcesoRecibos=-1L;

	public Long getid_vendedorBusquedaProcesoRecibos() {
		return this.id_vendedorBusquedaProcesoRecibos;
	}

	public void setid_vendedorBusquedaProcesoRecibos(Long id_vendedorBusquedaProcesoRecibos) {
		this.id_vendedorBusquedaProcesoRecibos = id_vendedorBusquedaProcesoRecibos;
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

	public Long id_provinciaFK_IdProvincia=-1L;

	public Long getid_provinciaFK_IdProvincia() {
		return this.id_provinciaFK_IdProvincia;
	}

	public void setid_provinciaFK_IdProvincia(Long id_provinciaFK_IdProvincia) {
		this.id_provinciaFK_IdProvincia = id_provinciaFK_IdProvincia;
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
	
	
	public ProcesoRecibosLogic getProcesoRecibosLogic()	{		
		return procesorecibosLogic;
	}

	public void setProcesoRecibosLogic(ProcesoRecibosLogic procesorecibosLogic) {
		this.procesorecibosLogic = procesorecibosLogic;
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
	
	public Boolean getIsEsNuevoProcesoRecibos() {
		return isEsNuevoProcesoRecibos;
	}

	public void setIsEsNuevoProcesoRecibos(Boolean isEsNuevoProcesoRecibos) {
		this.isEsNuevoProcesoRecibos = isEsNuevoProcesoRecibos;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoRecibos() {
		return esParaAccionDesdeFormularioProcesoRecibos;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoRecibos(Boolean esParaAccionDesdeFormularioProcesoRecibos) {
		this.esParaAccionDesdeFormularioProcesoRecibos = esParaAccionDesdeFormularioProcesoRecibos;
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
	
	
	public void cargarCombosProvinciasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.provinciasForeignKey=new ArrayList<Provincia>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProvinciaLogic provinciaLogic=new ProvinciaLogic();

			provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

			if(this.procesorecibosSessionBean==null) {
				this.procesorecibosSessionBean=new ProcesoRecibosSessionBean();
			}

			if(!this.procesorecibosSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

					provinciaLogic.getTodosProvinciasWithConnection(sFinalQuery,new Pagination());

					this.provinciasForeignKey=provinciaLogic.getProvincias();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProvincia(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getEntityWithConnection(procesorecibosSessionBean.getlidProvinciaActual());
					this.provinciasForeignKey.add(provinciaLogic.getProvincia());
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

			if(this.procesorecibosSessionBean==null) {
				this.procesorecibosSessionBean=new ProcesoRecibosSessionBean();
			}

			if(!this.procesorecibosSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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
					ciudadLogic.getEntityWithConnection(procesorecibosSessionBean.getlidCiudadActual());
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

			if(this.procesorecibosSessionBean==null) {
				this.procesorecibosSessionBean=new ProcesoRecibosSessionBean();
			}

			if(!this.procesorecibosSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
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
					zonaLogic.getEntityWithConnection(procesorecibosSessionBean.getlidZonaActual());
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

			if(this.procesorecibosSessionBean==null) {
				this.procesorecibosSessionBean=new ProcesoRecibosSessionBean();
			}

			if(!this.procesorecibosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
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
					grupoclienteLogic.getEntityWithConnection(procesorecibosSessionBean.getlidGrupoClienteActual());
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

			if(this.procesorecibosSessionBean==null) {
				this.procesorecibosSessionBean=new ProcesoRecibosSessionBean();
			}

			if(!this.procesorecibosSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
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
					vendedorLogic.getEntityWithConnection(procesorecibosSessionBean.getlidVendedorActual());
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

	
	
	public void setActualProvinciaForeignKey(Long idProvinciaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(provinciaTemp!=null) {

					if(this.procesorecibos!=null) {
						this.procesorecibos.setProvincia(provinciaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
						this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.setSelectedItem(provinciaTemp);
					}
				} else {
					//jComboBoxid_provinciaProcesoRecibos.setSelectedItem(provinciaTemp);
					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
						if(this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoRecibos") || sFormularioTipoBusqueda.equals("Todos")){
					if(provinciaTemp!=null && jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos!=null) {
						jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(provinciaTemp);
					} else {
						if(jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos!=null) {
							//jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(provinciaTemp);
							if(jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos.getItemCount()>0) {
								jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos.setSelectedIndex(0);
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

	public String getActualProvinciaForeignKeyDescripcion(Long idProvinciaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}


			sDescripcion=ProvinciaConstantesFunciones.getProvinciaDescripcion(provinciaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProvinciaForeignKeyGenerico(Long idProvinciaSeleccionado,JComboBox jComboBoxid_provinciaProcesoRecibosGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}

			if(provinciaTemp!=null) {
				jComboBoxid_provinciaProcesoRecibosGenerico.setSelectedItem(provinciaTemp);
			} else {
				if(jComboBoxid_provinciaProcesoRecibosGenerico!=null && jComboBoxid_provinciaProcesoRecibosGenerico.getItemCount()>0) {
					jComboBoxid_provinciaProcesoRecibosGenerico.setSelectedIndex(0);
				}
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

					if(this.procesorecibos!=null) {
						this.procesorecibos.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
						this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadProcesoRecibos.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
						if(this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoRecibos") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos!=null) {
						jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos!=null) {
							//jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(ciudadTemp);
							if(jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos.getItemCount()>0) {
								jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos.setSelectedIndex(0);
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
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadProcesoRecibosGenerico)throws Exception
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
				jComboBoxid_ciudadProcesoRecibosGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadProcesoRecibosGenerico!=null && jComboBoxid_ciudadProcesoRecibosGenerico.getItemCount()>0) {
					jComboBoxid_ciudadProcesoRecibosGenerico.setSelectedIndex(0);
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

					if(this.procesorecibos!=null) {
						this.procesorecibos.setZona(zonaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
						this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.setSelectedItem(zonaTemp);
					}
				} else {
					//jComboBoxid_zonaProcesoRecibos.setSelectedItem(zonaTemp);
					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
						if(this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoRecibos") || sFormularioTipoBusqueda.equals("Todos")){
					if(zonaTemp!=null && jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos!=null) {
						jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(zonaTemp);
					} else {
						if(jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos!=null) {
							//jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(zonaTemp);
							if(jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos.getItemCount()>0) {
								jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos.setSelectedIndex(0);
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
	public void setActualZonaForeignKeyGenerico(Long idZonaSeleccionado,JComboBox jComboBoxid_zonaProcesoRecibosGenerico)throws Exception
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
				jComboBoxid_zonaProcesoRecibosGenerico.setSelectedItem(zonaTemp);
			} else {
				if(jComboBoxid_zonaProcesoRecibosGenerico!=null && jComboBoxid_zonaProcesoRecibosGenerico.getItemCount()>0) {
					jComboBoxid_zonaProcesoRecibosGenerico.setSelectedIndex(0);
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

					if(this.procesorecibos!=null) {
						this.procesorecibos.setGrupoCliente(grupoclienteTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
						this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.setSelectedItem(grupoclienteTemp);
					}
				} else {
					//jComboBoxid_grupo_clienteProcesoRecibos.setSelectedItem(grupoclienteTemp);
					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
						if(this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoRecibos") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoclienteTemp!=null && jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos!=null) {
						jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(grupoclienteTemp);
					} else {
						if(jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos!=null) {
							//jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(grupoclienteTemp);
							if(jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.getItemCount()>0) {
								jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.setSelectedIndex(0);
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
	public void setActualGrupoClienteForeignKeyGenerico(Long idGrupoClienteSeleccionado,JComboBox jComboBoxid_grupo_clienteProcesoRecibosGenerico)throws Exception
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
				jComboBoxid_grupo_clienteProcesoRecibosGenerico.setSelectedItem(grupoclienteTemp);
			} else {
				if(jComboBoxid_grupo_clienteProcesoRecibosGenerico!=null && jComboBoxid_grupo_clienteProcesoRecibosGenerico.getItemCount()>0) {
					jComboBoxid_grupo_clienteProcesoRecibosGenerico.setSelectedIndex(0);
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

					if(this.procesorecibos!=null) {
						this.procesorecibos.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
						this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorProcesoRecibos.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
						if(this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoRecibos") || sFormularioTipoBusqueda.equals("Todos")){
					if(vendedorTemp!=null && jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos!=null) {
						jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(vendedorTemp);
					} else {
						if(jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos!=null) {
							//jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(vendedorTemp);
							if(jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos.getItemCount()>0) {
								jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos.setSelectedIndex(0);
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
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorProcesoRecibosGenerico)throws Exception
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
				jComboBoxid_vendedorProcesoRecibosGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorProcesoRecibosGenerico!=null && jComboBoxid_vendedorProcesoRecibosGenerico.getItemCount()>0) {
					jComboBoxid_vendedorProcesoRecibosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProvinciaForeignKey(ProcesoRecibos procesorecibos,JComboBox jComboBoxid_provinciaProcesoRecibosGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaAux=new Provincia();

			if(jComboBoxid_provinciaProcesoRecibosGenerico==null) {
				provinciaAux=(Provincia)this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.getSelectedItem();
			} else {
				provinciaAux=(Provincia)jComboBoxid_provinciaProcesoRecibosGenerico.getSelectedItem();
			}

			if(provinciaAux!=null && provinciaAux.getId()!=null) {
				procesorecibos.setid_provincia(provinciaAux.getId());
				procesorecibos.setprovincia_descripcion(ProcesoRecibosConstantesFunciones.getProvinciaDescripcion(provinciaAux));
				procesorecibos.setProvincia(provinciaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(ProcesoRecibos procesorecibos,JComboBox jComboBoxid_ciudadProcesoRecibosGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadProcesoRecibosGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadProcesoRecibosGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				procesorecibos.setid_ciudad(ciudadAux.getId());
				procesorecibos.setciudad_descripcion(ProcesoRecibosConstantesFunciones.getCiudadDescripcion(ciudadAux));
				procesorecibos.setCiudad(ciudadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarZonaForeignKey(ProcesoRecibos procesorecibos,JComboBox jComboBoxid_zonaProcesoRecibosGenerico)throws Exception
	{
		try
		{
			Zona  zonaAux=new Zona();

			if(jComboBoxid_zonaProcesoRecibosGenerico==null) {
				zonaAux=(Zona)this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.getSelectedItem();
			} else {
				zonaAux=(Zona)jComboBoxid_zonaProcesoRecibosGenerico.getSelectedItem();
			}

			if(zonaAux!=null && zonaAux.getId()!=null) {
				procesorecibos.setid_zona(zonaAux.getId());
				procesorecibos.setzona_descripcion(ProcesoRecibosConstantesFunciones.getZonaDescripcion(zonaAux));
				procesorecibos.setZona(zonaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoClienteForeignKey(ProcesoRecibos procesorecibos,JComboBox jComboBoxid_grupo_clienteProcesoRecibosGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteAux=new GrupoCliente();

			if(jComboBoxid_grupo_clienteProcesoRecibosGenerico==null) {
				grupoclienteAux=(GrupoCliente)this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.getSelectedItem();
			} else {
				grupoclienteAux=(GrupoCliente)jComboBoxid_grupo_clienteProcesoRecibosGenerico.getSelectedItem();
			}

			if(grupoclienteAux!=null && grupoclienteAux.getId()!=null) {
				procesorecibos.setid_grupo_cliente(grupoclienteAux.getId());
				procesorecibos.setgrupocliente_descripcion(ProcesoRecibosConstantesFunciones.getGrupoClienteDescripcion(grupoclienteAux));
				procesorecibos.setGrupoCliente(grupoclienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(ProcesoRecibos procesorecibos,JComboBox jComboBoxid_vendedorProcesoRecibosGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorProcesoRecibosGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorProcesoRecibosGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				procesorecibos.setid_vendedor(vendedorAux.getId());
				procesorecibos.setvendedor_descripcion(ProcesoRecibosConstantesFunciones.getVendedorDescripcion(vendedorAux));
				procesorecibos.setVendedor(vendedorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProvinciasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProvincia=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { 
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.addItem(provincia);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { 
					}

					if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoRecibos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos.addItem(provincia);
							}
						}

						if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCiudadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCiudad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { 
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { 
					}

					if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoRecibos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos.addItem(ciudad);
							}
						}

						if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { 
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.addItem(zona);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { 
					}

					if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoRecibos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos.addItem(zona);
							}
						}

						if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { 
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.addItem(grupocliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { 
					}

					if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoRecibos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.addItem(grupocliente);
							}
						}

						if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { 
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { 
					}

					if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoRecibos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos.addItem(vendedor);
							}
						}

						if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameProvinciaForeignKey(Provincia provincia,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.setSelectedItem(provincia);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(provincia);
						} else {
							this.jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCiudadForeignKey(Ciudad ciudad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(ciudad);
						} else {
							this.jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.setSelectedItem(zona);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(zona);
						} else {
							this.jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.setSelectedItem(grupocliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(grupocliente);
						} else {
							this.jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos.setSelectedItem(vendedor);
						} else {
							this.jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoRecibos() throws Exception {
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
		
	public ProcesoRecibosParameterReturnGeneral getProcesoRecibosParameterGeneral() {
		return this.procesorecibosParameterGeneral;
	}
	
	public void setProcesoRecibosParameterGeneral(ProcesoRecibosParameterReturnGeneral procesorecibosParameterGeneral) {
		this.procesorecibosParameterGeneral = procesorecibosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoRecibos() {
		return isPermisoTodoProcesoRecibos;
	}

	public void setIsPermisoTodoProcesoRecibos(Boolean isPermisoTodoProcesoRecibos) {
		this.isPermisoTodoProcesoRecibos = isPermisoTodoProcesoRecibos;
	}

	public Boolean getIsPermisoNuevoProcesoRecibos() {
		return isPermisoNuevoProcesoRecibos;
	}

	public void setIsPermisoNuevoProcesoRecibos(Boolean isPermisoNuevoProcesoRecibos) {
		this.isPermisoNuevoProcesoRecibos = isPermisoNuevoProcesoRecibos;
	}

	public Boolean getIsPermisoActualizarProcesoRecibos() {
		return isPermisoActualizarProcesoRecibos;
	}

	public void setIsPermisoActualizarProcesoRecibos(Boolean isPermisoActualizarProcesoRecibos) {
		this.isPermisoActualizarProcesoRecibos = isPermisoActualizarProcesoRecibos;
	}

	public Boolean getIsPermisoEliminarProcesoRecibos() {
		return isPermisoEliminarProcesoRecibos;
	}

	public void setIsPermisoEliminarProcesoRecibos(Boolean isPermisoEliminarProcesoRecibos) {
		this.isPermisoEliminarProcesoRecibos = isPermisoEliminarProcesoRecibos;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoRecibos() {
		return isPermisoGuardarCambiosProcesoRecibos;
	}

	public void setIsPermisoGuardarCambiosProcesoRecibos(Boolean isPermisoGuardarCambiosProcesoRecibos) {
		this.isPermisoGuardarCambiosProcesoRecibos = isPermisoGuardarCambiosProcesoRecibos;
	}
	
	public Boolean getIsPermisoConsultaProcesoRecibos() {
		return isPermisoConsultaProcesoRecibos;
	}

	public void setIsPermisoConsultaProcesoRecibos(Boolean isPermisoConsultaProcesoRecibos) {
		this.isPermisoConsultaProcesoRecibos = isPermisoConsultaProcesoRecibos;
	}

	public Boolean getIsPermisoBusquedaProcesoRecibos() {
		return isPermisoBusquedaProcesoRecibos;
	}

	public void setIsPermisoBusquedaProcesoRecibos(Boolean isPermisoBusquedaProcesoRecibos) {
		this.isPermisoBusquedaProcesoRecibos = isPermisoBusquedaProcesoRecibos;
	}

	public Boolean getIsPermisoReporteProcesoRecibos() {
		return isPermisoReporteProcesoRecibos;
	}

	public void setIsPermisoReporteProcesoRecibos(Boolean isPermisoReporteProcesoRecibos) {
		this.isPermisoReporteProcesoRecibos = isPermisoReporteProcesoRecibos;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoRecibos() {
		return isPermisoPaginacionMedioProcesoRecibos;
	}

	public void setIsPermisoPaginacionMedioProcesoRecibos(Boolean isPermisoPaginacionMedioProcesoRecibos) {
		this.isPermisoPaginacionMedioProcesoRecibos = isPermisoPaginacionMedioProcesoRecibos;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoRecibos() {
		return isPermisoPaginacionTodoProcesoRecibos;
	}

	public void setIsPermisoPaginacionTodoProcesoRecibos(Boolean isPermisoPaginacionTodoProcesoRecibos) {
		this.isPermisoPaginacionTodoProcesoRecibos = isPermisoPaginacionTodoProcesoRecibos;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoRecibos() {
		return isPermisoPaginacionAltoProcesoRecibos;
	}

	public void setIsPermisoPaginacionAltoProcesoRecibos(Boolean isPermisoPaginacionAltoProcesoRecibos) {
		this.isPermisoPaginacionAltoProcesoRecibos = isPermisoPaginacionAltoProcesoRecibos;
	}
	
	public Boolean getIsPermisoCopiarProcesoRecibos() {
		return isPermisoCopiarProcesoRecibos;
	}

	public void setIsPermisoCopiarProcesoRecibos(Boolean isPermisoCopiarProcesoRecibos) {
		this.isPermisoCopiarProcesoRecibos = isPermisoCopiarProcesoRecibos;
	}
	
	public Boolean getIsPermisoVerFormProcesoRecibos() {
		return isPermisoVerFormProcesoRecibos;
	}

	public void setIsPermisoVerFormProcesoRecibos(Boolean isPermisoVerFormProcesoRecibos) {
		this.isPermisoVerFormProcesoRecibos = isPermisoVerFormProcesoRecibos;
	}
	
	public Boolean getIsPermisoDuplicarProcesoRecibos() {
		return isPermisoDuplicarProcesoRecibos;
	}

	public void setIsPermisoDuplicarProcesoRecibos(Boolean isPermisoDuplicarProcesoRecibos) {
		this.isPermisoDuplicarProcesoRecibos = isPermisoDuplicarProcesoRecibos;
	}
	
	public Boolean getIsPermisoOrdenProcesoRecibos() {
		return isPermisoOrdenProcesoRecibos;
	}

	public void setIsPermisoOrdenProcesoRecibos(Boolean isPermisoOrdenProcesoRecibos) {
		this.isPermisoOrdenProcesoRecibos = isPermisoOrdenProcesoRecibos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoRecibos() {
		return isVisibilidadCeldaNuevoProcesoRecibos;
	}

	public void setIsVisibilidadCeldaNuevoProcesoRecibos(Boolean isVisibilidadCeldaNuevoProcesoRecibos) {
		this.isVisibilidadCeldaNuevoProcesoRecibos = isVisibilidadCeldaNuevoProcesoRecibos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoRecibos() {
		return isVisibilidadCeldaDuplicarProcesoRecibos;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoRecibos(Boolean isVisibilidadCeldaDuplicarProcesoRecibos) {
		this.isVisibilidadCeldaDuplicarProcesoRecibos = isVisibilidadCeldaDuplicarProcesoRecibos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoRecibos() {
		return isVisibilidadCeldaCopiarProcesoRecibos;
	}

	public void setIsVisibilidadCeldaCopiarProcesoRecibos(Boolean isVisibilidadCeldaCopiarProcesoRecibos) {
		this.isVisibilidadCeldaCopiarProcesoRecibos = isVisibilidadCeldaCopiarProcesoRecibos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoRecibos() {
		return isVisibilidadCeldaVerFormProcesoRecibos;
	}

	public void setIsVisibilidadCeldaVerFormProcesoRecibos(Boolean isVisibilidadCeldaVerFormProcesoRecibos) {
		this.isVisibilidadCeldaVerFormProcesoRecibos = isVisibilidadCeldaVerFormProcesoRecibos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoRecibos() {
		return isVisibilidadCeldaOrdenProcesoRecibos;
	}

	public void setIsVisibilidadCeldaOrdenProcesoRecibos(Boolean isVisibilidadCeldaOrdenProcesoRecibos) {
		this.isVisibilidadCeldaOrdenProcesoRecibos = isVisibilidadCeldaOrdenProcesoRecibos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoRecibos() {
		return isVisibilidadCeldaNuevoRelacionesProcesoRecibos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoRecibos(Boolean isVisibilidadCeldaNuevoRelacionesProcesoRecibos) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos = isVisibilidadCeldaNuevoRelacionesProcesoRecibos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoRecibos() {
		return isVisibilidadCeldaModificarProcesoRecibos;
	}

	public void setIsVisibilidadCeldaModificarProcesoRecibos(Boolean isVisibilidadCeldaModificarProcesoRecibos) {
		this.isVisibilidadCeldaModificarProcesoRecibos = isVisibilidadCeldaModificarProcesoRecibos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoRecibos() {
		return isVisibilidadCeldaActualizarProcesoRecibos;
	}

	public void setIsVisibilidadCeldaActualizarProcesoRecibos(Boolean isVisibilidadCeldaActualizarProcesoRecibos) {
		this.isVisibilidadCeldaActualizarProcesoRecibos = isVisibilidadCeldaActualizarProcesoRecibos;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoRecibos() {
		return isVisibilidadCeldaEliminarProcesoRecibos;
	}

	public void setIsVisibilidadCeldaEliminarProcesoRecibos(Boolean isVisibilidadCeldaEliminarProcesoRecibos) {
		this.isVisibilidadCeldaEliminarProcesoRecibos = isVisibilidadCeldaEliminarProcesoRecibos;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoRecibos() {
		return isVisibilidadCeldaCancelarProcesoRecibos;
	}

	public void setIsVisibilidadCeldaCancelarProcesoRecibos(Boolean isVisibilidadCeldaCancelarProcesoRecibos) {
		this.isVisibilidadCeldaCancelarProcesoRecibos = isVisibilidadCeldaCancelarProcesoRecibos;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoRecibos() {
		return isVisibilidadCeldaGuardarProcesoRecibos;
	}

	public void setIsVisibilidadCeldaGuardarProcesoRecibos(Boolean isVisibilidadCeldaGuardarProcesoRecibos) {
		this.isVisibilidadCeldaGuardarProcesoRecibos = isVisibilidadCeldaGuardarProcesoRecibos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoRecibos() {
		return isVisibilidadCeldaGuardarCambiosProcesoRecibos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoRecibos(Boolean isVisibilidadCeldaGuardarCambiosProcesoRecibos) {
		this.isVisibilidadCeldaGuardarCambiosProcesoRecibos = isVisibilidadCeldaGuardarCambiosProcesoRecibos;
	}
		
	public ProcesoRecibosSessionBean getprocesorecibosSessionBean() {
		return this.procesorecibosSessionBean;
	}
	
	public void setprocesorecibosSessionBean(ProcesoRecibosSessionBean procesorecibosSessionBean) {
		this.procesorecibosSessionBean=procesorecibosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoRecibos() {
		return this.isVisibilidadBusquedaProcesoRecibos;
	}

	public void setisVisibilidadBusquedaProcesoRecibos(Boolean isVisibilidadBusquedaProcesoRecibos) {
		this.isVisibilidadBusquedaProcesoRecibos=isVisibilidadBusquedaProcesoRecibos;
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

	public Boolean getisVisibilidadFK_IdProvincia() {
		return this.isVisibilidadFK_IdProvincia;
	}

	public void setisVisibilidadFK_IdProvincia(Boolean isVisibilidadFK_IdProvincia) {
		this.isVisibilidadFK_IdProvincia=isVisibilidadFK_IdProvincia;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(ProcesoRecibos procesorecibos)throws Exception {
		try {
			
				this.setActualParaGuardarProvinciaForeignKey(procesorecibos,null);
				this.setActualParaGuardarCiudadForeignKey(procesorecibos,null);
				this.setActualParaGuardarZonaForeignKey(procesorecibos,null);
				this.setActualParaGuardarGrupoClienteForeignKey(procesorecibos,null);
				this.setActualParaGuardarVendedorForeignKey(procesorecibos,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoRecibos procesorecibos,ProcesoRecibos procesorecibosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoRecibos(procesorecibos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesorecibosAux.setId(procesorecibos.getId());
		procesorecibosAux.setVersionRow(procesorecibos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoRecibos procesorecibosLocal) throws Exception {
		
		if(this.procesorecibosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoRecibos procesorecibosLocal) throws Exception {	
		if(this.procesorecibosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ProvinciaDetalleFormJInternalFrame.class)) {
				ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrameLocal=(ProvinciaBeanSwingJInternalFrame) ((ProvinciaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				provinciaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProvincia(provinciaBeanSwingJInternalFrameLocal.getprovincia(),true);
				provinciaBeanSwingJInternalFrameLocal.actualizarLista(provinciaBeanSwingJInternalFrameLocal.provincia,this.provinciasForeignKey);

				provinciaBeanSwingJInternalFrameLocal.actualizarRelaciones(provinciaBeanSwingJInternalFrameLocal.provincia);

				procesorecibosLocal.setProvincia(provinciaBeanSwingJInternalFrameLocal.provincia);

				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey("Formulario");
				this.setActualProvinciaForeignKey(provinciaBeanSwingJInternalFrameLocal.provincia.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				procesorecibosLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ZonaDetalleFormJInternalFrame.class)) {
				ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrameLocal=(ZonaBeanSwingJInternalFrame) ((ZonaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				zonaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoZona(zonaBeanSwingJInternalFrameLocal.getzona(),true);
				zonaBeanSwingJInternalFrameLocal.actualizarLista(zonaBeanSwingJInternalFrameLocal.zona,this.zonasForeignKey);

				zonaBeanSwingJInternalFrameLocal.actualizarRelaciones(zonaBeanSwingJInternalFrameLocal.zona);

				procesorecibosLocal.setZona(zonaBeanSwingJInternalFrameLocal.zona);

				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey("Formulario");
				this.setActualZonaForeignKey(zonaBeanSwingJInternalFrameLocal.zona.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoClienteDetalleFormJInternalFrame.class)) {
				GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrameLocal=(GrupoClienteBeanSwingJInternalFrame) ((GrupoClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.getgrupocliente(),true);
				grupoclienteBeanSwingJInternalFrameLocal.actualizarLista(grupoclienteBeanSwingJInternalFrameLocal.grupocliente,this.grupoclientesForeignKey);

				grupoclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				procesorecibosLocal.setGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey("Formulario");
				this.setActualGrupoClienteForeignKey(grupoclienteBeanSwingJInternalFrameLocal.grupocliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				procesorecibosLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoRecibosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesorecibosValidator.getInvalidValues(this.procesorecibos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoRecibos procesorecibos,List<ProcesoRecibos> procesoreciboss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoRecibos procesorecibos,List<ProcesoRecibos> procesoreciboss) throws Exception {
		try	{			
			ProcesoRecibosConstantesFunciones.actualizarSelectedLista(procesorecibos,procesoreciboss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoRecibos> procesorecibossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesorecibossLocal=this.procesorecibosLogic.getProcesoReciboss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesorecibossLocal=this.procesoreciboss;
			}
			//ARCHITECTURE
		
			for(ProcesoRecibos procesorecibosLocal:procesorecibossLocal) {
				if(this.permiteMantenimiento(procesorecibosLocal) && procesorecibosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoRecibosConstantesFunciones.getProcesoRecibosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoRecibosConstantesFunciones.NOMBREPROVINCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_provinciaProcesoRecibos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoRecibosConstantesFunciones.NOMBRECIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_ciudadProcesoRecibos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoRecibosConstantesFunciones.NOMBREZONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_zonaProcesoRecibos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoRecibosConstantesFunciones.NOMBREGRUPOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_grupo_clienteProcesoRecibos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoRecibosConstantesFunciones.NOMBREVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_vendedorProcesoRecibos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoRecibosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelcodigoProcesoRecibos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoRecibosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_completoProcesoRecibos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoRecibosConstantesFunciones.CODIGOASIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelcodigo_asientoProcesoRecibos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoRecibosConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnumero_mayorProcesoRecibos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_provinciaProcesoRecibos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_ciudadProcesoRecibos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_zonaProcesoRecibos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_grupo_clienteProcesoRecibos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_vendedorProcesoRecibos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecibos.jLabelcodigoProcesoRecibos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_completoProcesoRecibos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecibos.jLabelcodigo_asientoProcesoRecibos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnumero_mayorProcesoRecibos,"");
		
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
		this.iIdNuevoProcesoRecibos--;	
		
		
		this.procesorecibosAux=new ProcesoRecibos();
		
		this.procesorecibosAux.setId(this.iIdNuevoProcesoRecibos);
		this.procesorecibosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesorecibosLogic.getProcesoReciboss().add(this.procesorecibosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesoreciboss.add(this.procesorecibosAux);
		}
		//ARCHITECTURE
		
		this.procesorecibos=this.procesorecibosAux;
		
		if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoRecibos(this.procesorecibos);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoRecibos(this.procesorecibos);
		}
				
		//this.setDefaultControlesProcesoRecibos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoRecibos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoRecibos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoRecibos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoRecibos(this.procesorecibosBean,this.procesorecibos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoRecibos(this.procesorecibosReturnGeneral,this.procesorecibosBean,false);
		
		if(this.procesorecibosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoRecibos(this.procesorecibosReturnGeneral.getProcesoRecibos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoRecibos(this.procesorecibosReturnGeneral.getProcesoRecibos());
		}
		
		if(this.procesorecibosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoRecibos(this.procesorecibosReturnGeneral.getProcesoRecibos(),classes);//this.procesorecibosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoRecibos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoRecibos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.RecargarFormProcesoRecibos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoRecibos(false);
						
			if(procesorecibosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoRecibos();
			}
			
			this.actualizarVisualTableDatosProcesoRecibos();
			
			this.jTableDatosProcesoRecibos.setRowSelectionInterval(this.getIndiceNuevoProcesoRecibos(), this.getIndiceNuevoProcesoRecibos());
			
			this.seleccionarFilaTablaProcesoRecibosActual();
						
			this.actualizarEstadoCeldasBotonesProcesoRecibos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoRecibos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_provinciaProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarnombre_provinciaProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_ciudadProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarnombre_ciudadProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldnombre_zonaProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarnombre_zonaProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_grupo_clienteProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarnombre_grupo_clienteProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_vendedorProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarnombre_vendedorProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldcodigoProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarcodigoProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_completoProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarnombre_completoProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreacodigo_asientoProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarcodigo_asientoProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanumero_mayorProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarnumero_mayorProcesoRecibos);	
		
		this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarid_provinciaProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarid_ciudadProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarid_zonaProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarid_grupo_clienteProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.setEnabled(isHabilitar && this.procesorecibosConstantesFunciones.activarid_vendedorProcesoRecibos);
	};
	
	public void setDefaultControlesProcesoRecibos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoRecibos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesorecibosSessionBean.setConGuardarRelaciones(true);			
			this.procesorecibosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoRecibos.jTabbedPaneRelacionesProcesoRecibos.setVisible(true);
			
					
		} else {
			//this.procesorecibosSessionBean.setConGuardarRelaciones(false);			
			this.procesorecibosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoRecibos.jTabbedPaneRelacionesProcesoRecibos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoRecibos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoRecibos procesorecibosAux:this.procesorecibosLogic.getProcesoReciboss()) {
				if(procesorecibosAux.getId().equals(this.iIdNuevoProcesoRecibos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoRecibos procesorecibosAux:this.procesoreciboss) {
				if(procesorecibosAux.getId().equals(this.iIdNuevoProcesoRecibos)) {
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
	
	public int getIndiceActualProcesoRecibos(ProcesoRecibos procesorecibos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoRecibos procesorecibosAux:this.procesorecibosLogic.getProcesoReciboss()) {
				if(procesorecibosAux.getId().equals(procesorecibos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoRecibos procesorecibosAux:this.procesoreciboss) {
				if(procesorecibosAux.getId().equals(procesorecibos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoRecibos(ProcesoRecibos procesorecibosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoRecibos procesorecibosAux:this.procesorecibosLogic.getProcesoReciboss()) {
				if(procesorecibosAux.getProcesoRecibosOriginal().getId().equals(procesorecibosOriginal.getId())) {
					existe=true;
					procesorecibosOriginal.setId(procesorecibosAux.getId());
					procesorecibosOriginal.setVersionRow(procesorecibosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoRecibos procesorecibosAux:this.procesoreciboss) {
				if(procesorecibosAux.getProcesoRecibosOriginal().getId().equals(procesorecibosOriginal.getId())) {
					existe=true;
					procesorecibosOriginal.setId(procesorecibosAux.getId());
					procesorecibosOriginal.setVersionRow(procesorecibosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoRecibos(Boolean esParaCancelar) throws Exception {
		procesorecibossAux=new ArrayList<ProcesoRecibos>();
		procesorecibosAux=new ProcesoRecibos();
		
		if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoRecibos procesorecibosAux:this.procesorecibosLogic.getProcesoReciboss()) {
					if(procesorecibosAux.getId()<0) {
						procesorecibossAux.add(procesorecibosAux);
					}		
				}
				this.iIdNuevoProcesoRecibos=0L;
				this.procesorecibosLogic.getProcesoReciboss().removeAll(procesorecibossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoRecibos procesorecibosAux:this.procesoreciboss) {
					if(procesorecibosAux.getId()<0) {
						procesorecibossAux.add(procesorecibosAux);
					}		
				}
				this.iIdNuevoProcesoRecibos=0L;
				this.procesoreciboss.removeAll(procesorecibossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoRecibos 
					&& this.procesorecibosLogic.getProcesoReciboss().size()>0
					) {
					procesorecibosAux=this.procesorecibosLogic.getProcesoReciboss().get(this.procesorecibosLogic.getProcesoReciboss().size() - 1);
				
					if(procesorecibosAux.getId()<0) {
						this.procesorecibosLogic.getProcesoReciboss().remove(procesorecibosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoRecibos && this.procesoreciboss.size()>0) {
					procesorecibosAux=this.procesoreciboss.get(this.procesoreciboss.size() - 1);
				
					if(procesorecibosAux.getId()<0) {
						this.procesoreciboss.remove(procesorecibosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoRecibos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesorecibos.getId()<0) {
				this.procesorecibosLogic.getProcesoReciboss().remove(this.procesorecibos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesorecibos.getId()<0) {
				this.procesoreciboss.remove(this.procesorecibos);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoRecibos(List<ProcesoRecibos> procesorecibossAux) throws Exception {
		ProcesoRecibosConstantesFunciones.setEstadosInicialesProcesoRecibos(procesorecibossAux);
	}
	
	public void setEstadosInicialesProcesoRecibos(ProcesoRecibos procesorecibosAux) throws Exception {
		ProcesoRecibosConstantesFunciones.setEstadosInicialesProcesoRecibos(procesorecibosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoRecibosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoRecibos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoRecibosActual()) {
				if(!this.isEsNuevoProcesoRecibos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoRecibos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoRecibos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoRecibosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Recibos ?", "MANTENIMIENTO DE Proceso Recibos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoRecibos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoRecibos procesorecibos) throws Exception {
		ProcesoRecibosConstantesFunciones.seleccionarAsignar(this.procesorecibos,procesorecibos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoRecibos=this.isPermisoActualizarOriginalProcesoRecibos;
			
			
			this.seleccionarAsignar(procesorecibos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoRecibos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesorecibosSessionBean.setsFuncionBusquedaRapida(this.procesorecibosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoRecibos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoRecibos(esParaCancelar);				
				this.cancelarNuevoProcesoRecibos(esParaCancelar);								
			}
			
			this.procesorecibos=new ProcesoRecibos();
			
			this.inicializarProcesoRecibos();
			
			this.actualizarEstadoCeldasBotonesProcesoRecibos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoRecibos() throws Exception {
		try {
			ProcesoRecibosConstantesFunciones.inicializarProcesoRecibos(this.procesorecibos);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesorecibosLogic.getProcesoReciboss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoReciboss(String sAccionBusqueda,List<ProcesoRecibos> procesorecibossParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoRecibos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoRecibosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoRecibosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoRecibos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Reciboses");		
		parameters.put("busquedapor", ProcesoRecibosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoRecibos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesoRecibosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesoRecibosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesoRecibos=new JRBeanArrayDataSource(ProcesoRecibosJInternalFrame.TraerProcesoRecibosBeans(procesorecibossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoRecibos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoRecibosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoRecibosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoRecibosBean.TraerProcesoRecibosBeans(procesorecibossParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoReciboss(sAccionBusqueda,sTipoArchivoReporte,procesorecibossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoReciboss(sAccionBusqueda,sTipoArchivoReporte,procesorecibossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoRecibosActionPerformed(null);
					//this.generarExcelReporteProcesoReciboss(sAccionBusqueda,sTipoArchivoReporte,procesorecibossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoReciboss(sAccionBusqueda,sTipoArchivoReporte,procesorecibossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoReciboss(sAccionBusqueda,sTipoArchivoReporte,procesorecibossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoReciboss(sAccionBusqueda,sTipoArchivoReporte,procesorecibossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoReciboss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoRecibos> procesorecibossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecibos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoReciboss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoRecibos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoRecibos procesorecibos : procesorecibossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoRecibosConstantesFunciones.generarExcelReporteDataProcesoRecibos("NORMAL",row,workbook,procesorecibos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecibosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recibos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoRecibos(String sTipo,Row row,Workbook workbook) {
		
		ProcesoRecibosConstantesFunciones.generarExcelReporteHeaderProcesoRecibos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoReciboss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoRecibos> procesorecibossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecibos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoReciboss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoRecibos procesorecibos : procesorecibossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoRecibosConstantesFunciones.getProcesoRecibosDescripcion(procesorecibos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_IDPROVINCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDPROVINCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getprovincia_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_IDZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getzona_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_IDGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getgrupocliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getnombre_provincia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getnombre_ciudad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getnombre_zona());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getnombre_grupo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getnombre_vendedor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getcodigo_asiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecibos.getnumero_mayor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecibosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recibos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoReciboss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoRecibos> procesorecibossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoRecibos> procesorecibossRespaldo=null;
		
		classes=ProcesoRecibosConstantesFunciones.getClassesRelationshipsOfProcesoRecibos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesorecibosLogic.setDatosCliente(this.datosCliente);
		this.procesorecibosLogic.setDatosDeep(this.datosDeep);
		this.procesorecibosLogic.setIsConDeep(true);
		
		procesorecibossRespaldo=this.procesorecibosLogic.getProcesoReciboss();
		
		this.procesorecibosLogic.setProcesoReciboss(procesorecibossParaReportes);	
		this.procesorecibosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesorecibossParaReportes=this.procesorecibosLogic.getProcesoReciboss();
		this.procesorecibosLogic.setProcesoReciboss(procesorecibossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecibos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoReciboss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoRecibos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoRecibos procesorecibos : procesorecibossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoRecibos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoRecibosConstantesFunciones.generarExcelReporteDataProcesoRecibos("NORMAL",row,workbook,procesorecibos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoRecibosConstantesFunciones.getProcesoRecibosDescripcion(procesorecibos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecibosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recibos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoRecibos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoRecibos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoRecibos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoRecibos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoRecibos() throws Exception {		
		this.startProcessProcesoRecibos(true);
	}
	
	public void startProcessProcesoRecibos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoRecibos ,this.jPanelParametrosReportesProcesoRecibos, this.jScrollPanelDatosProcesoRecibos,this.jPanelPaginacionProcesoRecibos, this.jScrollPanelDatosEdicionProcesoRecibos, this.jPanelAccionesProcesoRecibos,this.jPanelAccionesFormularioProcesoRecibos,this.jmenuBarProcesoRecibos,this.jmenuBarDetalleProcesoRecibos,this.jTtoolBarProcesoRecibos,this.jTtoolBarDetalleProcesoRecibos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoRecibos=this.jTabbedPaneBusquedasProcesoRecibos; 
		
		final JPanel jPanelParametrosReportesProcesoRecibos=this.jPanelParametrosReportesProcesoRecibos;
		//final JScrollPane jScrollPanelDatosProcesoRecibos=this.jScrollPanelDatosProcesoRecibos;
		final JTable jTableDatosProcesoRecibos=this.jTableDatosProcesoRecibos;		
		final JPanel jPanelPaginacionProcesoRecibos=this.jPanelPaginacionProcesoRecibos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoRecibos=this.jScrollPanelDatosEdicionProcesoRecibos;
		final JPanel jPanelAccionesProcesoRecibos=this.jPanelAccionesProcesoRecibos;
		
		JPanel jPanelCamposAuxiliarProcesoRecibos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoRecibos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
			jPanelCamposAuxiliarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jPanelCamposProcesoRecibos;
			jPanelAccionesFormularioAuxiliarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jPanelAccionesFormularioProcesoRecibos;
		}
		
		final JPanel jPanelCamposProcesoRecibos=jPanelCamposAuxiliarProcesoRecibos;
		final JPanel jPanelAccionesFormularioProcesoRecibos=jPanelAccionesFormularioAuxiliarProcesoRecibos;
		
		
		final JMenuBar jmenuBarProcesoRecibos=this.jmenuBarProcesoRecibos;
		final JToolBar jTtoolBarProcesoRecibos=this.jTtoolBarProcesoRecibos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoRecibos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoRecibos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
			jmenuBarDetalleAuxiliarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jmenuBarDetalleProcesoRecibos;
			jTtoolBarDetalleAuxiliarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jTtoolBarDetalleProcesoRecibos;
		}
		
		final JMenuBar jmenuBarDetalleProcesoRecibos=jmenuBarDetalleAuxiliarProcesoRecibos;
		final JToolBar jTtoolBarDetalleProcesoRecibos=jTtoolBarDetalleAuxiliarProcesoRecibos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoRecibos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoRecibos;
			processRunnable.jTableDatos=jTableDatosProcesoRecibos;
			processRunnable.jPanelCampos=jPanelCamposProcesoRecibos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoRecibos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoRecibos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoRecibos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoRecibos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoRecibos;
			processRunnable.jTtoolBar=jTtoolBarProcesoRecibos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoRecibos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoRecibos ,jPanelParametrosReportesProcesoRecibos,jTableDatosProcesoRecibos, /*jScrollPanelDatosProcesoRecibos,*/jPanelCamposProcesoRecibos,jPanelPaginacionProcesoRecibos, /*jScrollPanelDatosEdicionProcesoRecibos,*/ jPanelAccionesProcesoRecibos,jPanelAccionesFormularioProcesoRecibos,jmenuBarProcesoRecibos,jmenuBarDetalleProcesoRecibos,jTtoolBarProcesoRecibos,jTtoolBarDetalleProcesoRecibos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoRecibos ,jPanelParametrosReportesProcesoRecibos, jScrollPanelDatosProcesoRecibos,jPanelPaginacionProcesoRecibos, jScrollPanelDatosEdicionProcesoRecibos, jPanelAccionesProcesoRecibos,jPanelAccionesFormularioProcesoRecibos,jmenuBarProcesoRecibos,jmenuBarDetalleProcesoRecibos,jTtoolBarProcesoRecibos,jTtoolBarDetalleProcesoRecibos);
						
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
	
	public void finishProcessProcesoRecibos() {// throws Exception 
		this.finishProcessProcesoRecibos(true);
	}
	
	public void finishProcessProcesoRecibos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoRecibos ,this.jPanelParametrosReportesProcesoRecibos, this.jScrollPanelDatosProcesoRecibos,this.jPanelPaginacionProcesoRecibos, this.jScrollPanelDatosEdicionProcesoRecibos, this.jPanelAccionesProcesoRecibos,this.jPanelAccionesFormularioProcesoRecibos,this.jmenuBarProcesoRecibos,this.jmenuBarDetalleProcesoRecibos,this.jTtoolBarProcesoRecibos,this.jTtoolBarDetalleProcesoRecibos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoRecibos=this.jTabbedPaneBusquedasProcesoRecibos; 
		
		final JPanel jPanelParametrosReportesProcesoRecibos=this.jPanelParametrosReportesProcesoRecibos;
		//final JScrollPane jScrollPanelDatosProcesoRecibos=this.jScrollPanelDatosProcesoRecibos;
		final JTable jTableDatosProcesoRecibos=this.jTableDatosProcesoRecibos;		
		final JPanel jPanelPaginacionProcesoRecibos=this.jPanelPaginacionProcesoRecibos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoRecibos=this.jScrollPanelDatosEdicionProcesoRecibos;
		final JPanel jPanelAccionesProcesoRecibos=this.jPanelAccionesProcesoRecibos;
		
		JPanel jPanelCamposAuxiliarProcesoRecibos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoRecibos=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
			jPanelCamposAuxiliarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jPanelCamposProcesoRecibos;
			jPanelAccionesFormularioAuxiliarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jPanelAccionesFormularioProcesoRecibos;
		}
		
		final JPanel jPanelCamposProcesoRecibos=jPanelCamposAuxiliarProcesoRecibos;
		final JPanel jPanelAccionesFormularioProcesoRecibos=jPanelAccionesFormularioAuxiliarProcesoRecibos;
		
		
		final JMenuBar jmenuBarProcesoRecibos=this.jmenuBarProcesoRecibos;		
		final JToolBar jTtoolBarProcesoRecibos=this.jTtoolBarProcesoRecibos;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoRecibos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoRecibos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
			jmenuBarDetalleAuxiliarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jmenuBarDetalleProcesoRecibos;
			jTtoolBarDetalleAuxiliarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jTtoolBarDetalleProcesoRecibos;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoRecibos=jmenuBarDetalleAuxiliarProcesoRecibos;
		final JToolBar jTtoolBarDetalleProcesoRecibos=jTtoolBarDetalleAuxiliarProcesoRecibos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoRecibos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoRecibos;
			processRunnable.jTableDatos=jTableDatosProcesoRecibos;
			processRunnable.jPanelCampos=jPanelCamposProcesoRecibos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoRecibos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoRecibos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoRecibos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoRecibos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoRecibos;
			processRunnable.jTtoolBar=jTtoolBarProcesoRecibos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoRecibos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoRecibos ,jPanelParametrosReportesProcesoRecibos, jTableDatosProcesoRecibos,/*jScrollPanelDatosProcesoRecibos,*/jPanelCamposProcesoRecibos,jPanelPaginacionProcesoRecibos, /*jScrollPanelDatosEdicionProcesoRecibos,*/ jPanelAccionesProcesoRecibos,jPanelAccionesFormularioProcesoRecibos,jmenuBarProcesoRecibos,jmenuBarDetalleProcesoRecibos,jTtoolBarProcesoRecibos,jTtoolBarDetalleProcesoRecibos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoRecibos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoRecibos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoRecibos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoRecibos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoRecibos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoRecibos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoRecibos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoRecibos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoRecibos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesorecibosConstantesFunciones.getsFinalQueryProcesoRecibos();
		String  finalQueryPaginacionTodos=this.procesorecibosConstantesFunciones.getsFinalQueryProcesoRecibos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoRecibosConstantesFunciones.getArrayColumnasGlobalesNoProcesoRecibos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoRecibosConstantesFunciones.getArrayColumnasGlobalesProcesoRecibos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoRecibosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesorecibossEliminados= new ArrayList<ProcesoRecibos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoRecibos();
		
				///*ProcesoRecibosSessionBean*/this.procesorecibosSessionBean=new ProcesoRecibosSessionBean();
			
			if(this.procesorecibosSessionBean==null) {
				this.procesorecibosSessionBean=new ProcesoRecibosSessionBean();
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
					this.iNumeroPaginacion=ProcesoRecibosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoRecibosConstantesFunciones.getClassesForeignKeysOfProcesoRecibos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesorecibos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesorecibossAux= new ArrayList<ProcesoRecibos>();
			
				
			procesorecibosLogic.setDatosCliente(this.datosCliente);
			procesorecibosLogic.setDatosDeep(this.datosDeep);
			procesorecibosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoRecibos")) {
				this.sDetalleReporte=ProcesoRecibosConstantesFunciones.getDetalleIndiceBusquedaProcesoRecibos(id_provinciaBusquedaProcesoRecibos,id_ciudadBusquedaProcesoRecibos,id_zonaBusquedaProcesoRecibos,id_grupo_clienteBusquedaProcesoRecibos,id_vendedorBusquedaProcesoRecibos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesorecibosLogic.getProcesoRecibossBusquedaProcesoRecibos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_provinciaBusquedaProcesoRecibos,id_ciudadBusquedaProcesoRecibos,id_zonaBusquedaProcesoRecibos,id_grupo_clienteBusquedaProcesoRecibos,id_vendedorBusquedaProcesoRecibos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoRecibosConstantesFunciones.getDetalleIndiceBusquedaProcesoRecibos(id_provinciaBusquedaProcesoRecibos,id_ciudadBusquedaProcesoRecibos,id_zonaBusquedaProcesoRecibos,id_grupo_clienteBusquedaProcesoRecibos,id_vendedorBusquedaProcesoRecibos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoRecibosConstantesFunciones.getDetalleIndiceBusquedaProcesoRecibos(id_provinciaBusquedaProcesoRecibos,id_ciudadBusquedaProcesoRecibos,id_zonaBusquedaProcesoRecibos,id_grupo_clienteBusquedaProcesoRecibos,id_vendedorBusquedaProcesoRecibos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesorecibosLogic.getProcesoReciboss()==null||procesorecibosLogic.getProcesoReciboss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesoreciboss==null|| procesoreciboss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesorecibossAux=new ArrayList<ProcesoRecibos>();
						procesorecibossAux.addAll(procesorecibosLogic.getProcesoReciboss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesorecibossAux=new ArrayList<ProcesoRecibos>();
							procesorecibossAux.addAll(procesoreciboss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesorecibosLogic.getProcesoRecibossBusquedaProcesoRecibos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_provinciaBusquedaProcesoRecibos,id_ciudadBusquedaProcesoRecibos,id_zonaBusquedaProcesoRecibos,id_grupo_clienteBusquedaProcesoRecibos,id_vendedorBusquedaProcesoRecibos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoRecibosConstantesFunciones.getDetalleIndiceBusquedaProcesoRecibos(id_provinciaBusquedaProcesoRecibos,id_ciudadBusquedaProcesoRecibos,id_zonaBusquedaProcesoRecibos,id_grupo_clienteBusquedaProcesoRecibos,id_vendedorBusquedaProcesoRecibos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoRecibosConstantesFunciones.getDetalleIndiceBusquedaProcesoRecibos(id_provinciaBusquedaProcesoRecibos,id_ciudadBusquedaProcesoRecibos,id_zonaBusquedaProcesoRecibos,id_grupo_clienteBusquedaProcesoRecibos,id_vendedorBusquedaProcesoRecibos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoReciboss("BusquedaProcesoRecibos",procesorecibosLogic.getProcesoReciboss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoReciboss("BusquedaProcesoRecibos",procesoreciboss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesorecibosLogic.setProcesoReciboss(new ArrayList<ProcesoRecibos>());
						procesorecibosLogic.getProcesoReciboss().addAll(procesorecibossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoreciboss=new ArrayList<ProcesoRecibos>();
							procesoreciboss.addAll(procesorecibossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoRecibos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoRecibos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesorecibosLogic.getProcesoReciboss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoreciboss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesorecibosLogic.getProcesoReciboss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoreciboss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoRecibos procesorecibos) {
		Boolean permite=true;
		
		if(this.procesorecibos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoRecibosConstantesFunciones.getOrderByListaProcesoRecibos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoRecibosConstantesFunciones.getOrderByListaProcesoRecibos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoRecibos procesorecibos:procesorecibosLogic.getProcesoReciboss()) {
				if(procesorecibos.getsType().equals(Constantes2.S_TOTALES)) {
					procesorecibosTotales=procesorecibos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoRecibos procesorecibos:this.procesoreciboss) {
				if(procesorecibos.getsType().equals(Constantes2.S_TOTALES)) {
					procesorecibosTotales=procesorecibos;
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
			this.procesorecibosAux=new ProcesoRecibos();
			this.procesorecibosAux.setsType(Constantes2.S_TOTALES);
			this.procesorecibosAux.setIsNew(false);
			this.procesorecibosAux.setIsChanged(false);
			this.procesorecibosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoRecibosConstantesFunciones.TotalizarValoresFilaProcesoRecibos(this.procesorecibosLogic.getProcesoReciboss(),this.procesorecibosAux);
				
				//this.procesorecibosLogic.getProcesoReciboss().add(this.procesorecibosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoRecibosConstantesFunciones.TotalizarValoresFilaProcesoRecibos(this.procesoreciboss,this.procesorecibosAux);
				
				this.procesoreciboss.add(this.procesorecibosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesorecibosTotales=new ProcesoRecibos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesorecibosLogic.getProcesoReciboss().remove(procesorecibosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoreciboss.remove(procesorecibosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesorecibosTotales=new ProcesoRecibos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoRecibos procesorecibos:procesorecibosLogic.getProcesoReciboss()) {
				if(procesorecibos.getsType().equals(Constantes2.S_TOTALES)) {
					procesorecibosTotales=procesorecibos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoRecibosConstantesFunciones.TotalizarValoresFilaProcesoRecibos(this.procesorecibosLogic.getProcesoReciboss(),procesorecibosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoRecibos procesorecibos:this.procesoreciboss) {
				if(procesorecibos.getsType().equals(Constantes2.S_TOTALES)) {
					procesorecibosTotales=procesorecibos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoRecibosConstantesFunciones.TotalizarValoresFilaProcesoRecibos(this.procesoreciboss,procesorecibosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoRecibossBusquedaProcesoRecibos()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoRecibos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoRecibossFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoRecibossFK_IdGrupoCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoRecibossFK_IdProvincia()throws Exception {
		try {
			sAccionBusqueda="FK_IdProvincia";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoRecibossFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoRecibossFK_IdZona()throws Exception {
		try {
			sAccionBusqueda="FK_IdZona";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoRecibossBusquedaProcesoRecibos(String sFinalQuery,Long id_provincia,Long id_ciudad,Long id_zona,Long id_grupo_cliente,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesorecibosLogic.getProcesoRecibossBusquedaProcesoRecibos(sFinalQuery,this.pagination,id_provincia,id_ciudad,id_zona,id_grupo_cliente,id_vendedor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoRecibossFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesorecibosLogic.getProcesoRecibossFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoRecibossFK_IdGrupoCliente(String sFinalQuery,Long id_grupo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesorecibosLogic.getProcesoRecibossFK_IdGrupoCliente(sFinalQuery,this.pagination,id_grupo_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoRecibossFK_IdProvincia(String sFinalQuery,Long id_provincia)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesorecibosLogic.getProcesoRecibossFK_IdProvincia(sFinalQuery,this.pagination,id_provincia);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoRecibossFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesorecibosLogic.getProcesoRecibossFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoRecibossFK_IdZona(String sFinalQuery,Long id_zona)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesorecibosLogic.getProcesoRecibossFK_IdZona(sFinalQuery,this.pagination,id_zona);
				
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
	
	public void inicializarPermisosProcesoRecibos() {
		this.isPermisoTodoProcesoRecibos=false;
		this.isPermisoNuevoProcesoRecibos=false;
		this.isPermisoActualizarProcesoRecibos=false;
		this.isPermisoActualizarOriginalProcesoRecibos=false;
		this.isPermisoEliminarProcesoRecibos=false;
		this.isPermisoGuardarCambiosProcesoRecibos=false;
		this.isPermisoConsultaProcesoRecibos=true;
		this.isPermisoBusquedaProcesoRecibos=true;
		this.isPermisoReporteProcesoRecibos=true;
		this.isPermisoOrdenProcesoRecibos=false;		
		this.isPermisoPaginacionMedioProcesoRecibos=false;		
		this.isPermisoPaginacionAltoProcesoRecibos=false;		
		this.isPermisoPaginacionTodoProcesoRecibos=false;		
		this.isPermisoCopiarProcesoRecibos=false;		
		this.isPermisoVerFormProcesoRecibos=false;		
		this.isPermisoDuplicarProcesoRecibos=false;
		this.isPermisoOrdenProcesoRecibos=false;
	}
	
	public void setPermisosUsuarioProcesoRecibos(Boolean isPermiso) {
		this.isPermisoTodoProcesoRecibos=isPermiso;
		this.isPermisoNuevoProcesoRecibos=isPermiso;
		this.isPermisoActualizarProcesoRecibos=isPermiso;
		this.isPermisoActualizarOriginalProcesoRecibos=isPermiso;
		this.isPermisoEliminarProcesoRecibos=isPermiso;
		this.isPermisoGuardarCambiosProcesoRecibos=isPermiso;
		this.isPermisoConsultaProcesoRecibos=isPermiso;
		this.isPermisoBusquedaProcesoRecibos=isPermiso;
		this.isPermisoReporteProcesoRecibos=isPermiso;
		this.isPermisoOrdenProcesoRecibos=isPermiso;		
		this.isPermisoPaginacionMedioProcesoRecibos=isPermiso;		
		this.isPermisoPaginacionAltoProcesoRecibos=isPermiso;		
		this.isPermisoPaginacionTodoProcesoRecibos=isPermiso;		
		this.isPermisoCopiarProcesoRecibos=isPermiso;		
		this.isPermisoVerFormProcesoRecibos=isPermiso;		
		this.isPermisoDuplicarProcesoRecibos=isPermiso;
		this.isPermisoOrdenProcesoRecibos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoRecibos(Boolean isPermiso) {
		//this.isPermisoTodoProcesoRecibos=isPermiso;
		this.isPermisoNuevoProcesoRecibos=isPermiso;
		this.isPermisoActualizarProcesoRecibos=isPermiso;
		this.isPermisoActualizarOriginalProcesoRecibos=isPermiso;
		this.isPermisoEliminarProcesoRecibos=isPermiso;
		this.isPermisoGuardarCambiosProcesoRecibos=isPermiso;
		//this.isPermisoConsultaProcesoRecibos=isPermiso;
		//this.isPermisoBusquedaProcesoRecibos=isPermiso;
		//this.isPermisoReporteProcesoRecibos=isPermiso;
		//this.isPermisoOrdenProcesoRecibos=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoRecibos=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoRecibos=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoRecibos=isPermiso;		
		//this.isPermisoCopiarProcesoRecibos=isPermiso;		
		//this.isPermisoDuplicarProcesoRecibos=isPermiso;
		//this.isPermisoOrdenProcesoRecibos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoRecibosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoRecibosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoRecibos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoRecibosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoRecibosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoRecibosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoRecibosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoRecibos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoRecibosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoRecibosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoRecibos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoRecibos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoRecibos=this.isPermisoActualizarProcesoRecibos;
			this.isPermisoEliminarProcesoRecibos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoRecibos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoRecibos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoRecibos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoRecibos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoRecibos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoRecibos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoRecibos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoRecibos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoRecibos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoRecibos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoRecibos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoRecibos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoRecibos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoRecibos.setToolTipText(this.jTableDatosProcesoRecibos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoRecibos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoRecibos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoRecibosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoRecibosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoRecibos() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoRecibosListas()throws Exception {
		try	{						
			
				this.provinciasForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
				this.zonasForeignKey=new ArrayList();
				this.grupoclientesForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoRecibosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoRecibosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyZonaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyProvinciaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.provinciasForeignKey==null||this.provinciasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProvinciaConstantesFunciones.getArrayColumnasGlobalesProvincia(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProvinciaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProvinciaConstantesFunciones.SFINALQUERY;

				this.cargarCombosProvinciasForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoRecibos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyProvincia();
			this.addItemDefectoCombosForeignKeyCiudad();
			this.addItemDefectoCombosForeignKeyZona();
			this.addItemDefectoCombosForeignKeyGrupoCliente();
			this.addItemDefectoCombosForeignKeyVendedor();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyProvincia()throws Exception {
		try {
			if(this.procesorecibosSessionBean==null) {
				this.procesorecibosSessionBean=new ProcesoRecibosSessionBean();
			}

			if(!this.procesorecibosSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
				Provincia provincia=new Provincia();
				ProvinciaConstantesFunciones.setProvinciaDescripcion(provincia,Constantes.SMENSAJE_ESCOJA_OPCION);
				provincia.setId(null);

				if(!ProvinciaConstantesFunciones.ExisteEnLista(this.provinciasForeignKey,provincia,true)) {

					this.provinciasForeignKey.add(0,provincia);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {

			if(!this.procesorecibosSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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

			if(!this.procesorecibosSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
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

			if(!this.procesorecibosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
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

			if(!this.procesorecibosSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoRecibos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoRecibos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoRecibos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoRecibos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoRecibos(ProcesoRecibos procesorecibos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoRecibos(ProcesoRecibos procesorecibos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoRecibos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoRecibos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoRecibos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoRecibos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoRecibos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoRecibos()throws Exception {
		try {
			

			this.cargarCombosFrameProvinciasForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");
			this.cargarCombosFrameZonasForeignKey("Todos");
			this.cargarCombosFrameGrupoClientesForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoRecibos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoRecibos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ProcesoRecibosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoRecibosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoRecibosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesorecibosSessionBean=new ProcesoRecibosSessionBean(); 
		this.procesorecibosConstantesFunciones=new ProcesoRecibosConstantesFunciones(); 
		this.procesorecibosBean=new ProcesoRecibos();//(this.procesorecibosConstantesFunciones); 		
		this.procesorecibosReturnGeneral=new ProcesoRecibosParameterReturnGeneral(); 
		
		this.procesorecibosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesorecibosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoRecibosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoRecibosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoRecibosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoRecibos(true);
			
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
			
			this.procesorecibosConstantesFunciones=new ProcesoRecibosConstantesFunciones(); 
			this.procesorecibosBean=new ProcesoRecibos();//this.procesorecibosConstantesFunciones); 			
			this.procesorecibosReturnGeneral=new ProcesoRecibosParameterReturnGeneral(); 
		
			ProcesoRecibosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Recibos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesorecibos=new ProcesoRecibos();
			this.procesoreciboss = new ArrayList<ProcesoRecibos>();
			this.procesorecibossAux = new ArrayList<ProcesoRecibos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic=new ProcesoRecibosLogic();
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}
			
			//this.procesorecibosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesorecibosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoRecibos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoRecibos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoRecibos);	
					}
					
					if(this.jInternalFrameImportacionProcesoRecibos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoRecibos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoRecibos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoRecibos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoRecibos);
				this.jInternalFrameDetalleFormProcesoRecibos.setVisible(false);
				this.jInternalFrameDetalleFormProcesoRecibos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoRecibos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoRecibos);
					this.jInternalFrameReporteDinamicoProcesoRecibos.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoRecibos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoRecibos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoRecibos);
					this.jInternalFrameImportacionProcesoRecibos.setVisible(false);
					this.jInternalFrameImportacionProcesoRecibos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoRecibos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoRecibos);
					this.jInternalFrameOrderByProcesoRecibos.setVisible(false);
					this.jInternalFrameOrderByProcesoRecibos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoRecibosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoRecibosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesorecibosReturnGeneral=new ProcesoRecibosParameterReturnGeneral();
			
			this.procesorecibosParameterGeneral=new ProcesoRecibosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesorecibosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoRecibosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoRecibosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesorecibosSessionBean.getEsGuardarRelacionado(),this.procesorecibosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoRecibosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesorecibosSessionBean.getEsGuardarRelacionado(),this.procesorecibosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoRecibos=false;
			this.isVisibilidadCeldaDuplicarProcesoRecibos=true;
			this.isVisibilidadCeldaCopiarProcesoRecibos=true;
			this.isVisibilidadCeldaVerFormProcesoRecibos=true;
			this.isVisibilidadCeldaOrdenProcesoRecibos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=false;
			this.isVisibilidadCeldaModificarProcesoRecibos=false;
			this.isVisibilidadCeldaActualizarProcesoRecibos=false;
			this.isVisibilidadCeldaEliminarProcesoRecibos=false;
			this.isVisibilidadCeldaCancelarProcesoRecibos=false;
			this.isVisibilidadCeldaGuardarProcesoRecibos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=false;
			
			
			this.isVisibilidadBusquedaProcesoRecibos=true;
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdGrupoCliente=true;
			this.isVisibilidadFK_IdProvincia=true;
			this.isVisibilidadFK_IdVendedor=true;
			this.isVisibilidadFK_IdZona=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoRecibos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoRecibos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoRecibos(false);
			
			this.setPermisosUsuarioProcesoRecibos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesorecibosSessionBean.getEsGuardarRelacionado() 
				|| (this.procesorecibosSessionBean.getEsGuardarRelacionado() && this.procesorecibosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoRecibosClasesRelacionadas();
			}
			
			if(this.procesorecibosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoRecibosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoRecibos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoRecibos();
			}
			
			if(!this.isPermisoBusquedaProcesoRecibos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoRecibos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoRecibosConstantesFunciones.getTiposSeleccionarProcesoRecibos());
				
				this.tiposColumnasSelect=ProcesoRecibosConstantesFunciones.getTiposSeleccionarProcesoRecibos(true);
				
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
			//if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoRecibos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoRecibos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoRecibos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoRecibos() ;
			
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
			
			this.provinciaLogic=new ProvinciaLogic();
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
				procesorecibosImplementable= (ProcesoRecibosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoRecibosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesorecibosImplementableHome= (ProcesoRecibosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoRecibosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesoreciboss= new ArrayList<ProcesoRecibos>();
			this.procesorecibossEliminados= new ArrayList<ProcesoRecibos>();
						
			this.isEsNuevoProcesoRecibos=false;
			this.esParaAccionDesdeFormularioProcesoRecibos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.provinciasForeignKey=new ArrayList<Provincia>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			this.zonasForeignKey=new ArrayList<Zona>() ;
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>() ;
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoRecibos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoRecibos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoRecibosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoRecibosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoRecibos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoRecibos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoRecibos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoRecibos();
			}
			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoRecibos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoRecibos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoRecibos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoRecibos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoRecibos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoRecibos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoRecibos")) {
				iIndex=this.jInternalFrameDetalleFormProcesoRecibos.jTabbedPaneRelacionesProcesoRecibos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoRecibos.jTabbedPaneRelacionesProcesoRecibos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoRecibos();	
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
	
	public void cargarCombosForeignKeyProcesoRecibos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoRecibos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoRecibos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoRecibosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoRecibos();
		
		this.cargarCombosFrameForeignKeyProcesoRecibos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoRecibos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoRecibos();
		}
	}
	
	

	public void cargarCombosForeignKeyProvincia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProvincia(this.provinciasForeignKey);

		} catch(Exception e) {
			throw e;
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
	
	public void jButtonNuevoProcesoRecibosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesorecibosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoRecibos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			
			
			if(jTableDatosProcesoRecibos.getRowCount()>=1) {
				jTableDatosProcesoRecibos.removeRowSelectionInterval(0, jTableDatosProcesoRecibos.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoRecibos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoRecibos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoRecibos(true);			
			//this.procesorecibos=new ProcesoRecibos();
			//this.procesorecibos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoRecibos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoRecibos() ;
			
			if(ProcesoRecibosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoRecibos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesorecibos);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);				
			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			
			if(this.procesorecibosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoRecibos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoRecibosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoRecibos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoRecibos.getSelectedRows().length;			
			}
			
			procesorecibossSeleccionados=this.getProcesoRecibossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoRecibos--;			
				//ProcesoRecibos procesorecibosAux= new ProcesoRecibos();			
				//procesorecibosAux.setId(this.iIdNuevoProcesoRecibos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoRecibos procesorecibosOrigen=new ProcesoRecibos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoRecibos procesorecibosOrigen : procesorecibossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesorecibosOrigen =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesorecibosOrigen =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoRecibos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesorecibos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoRecibos(procesorecibosOrigen,this.procesorecibos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesorecibosLogic.getProcesoReciboss().add(this.procesorecibosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoreciboss.add(this.procesorecibosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoRecibos(false);
				
				this.jTableDatosProcesoRecibos.setRowSelectionInterval(this.getIndiceNuevoProcesoRecibos(), this.getIndiceNuevoProcesoRecibos());
				
				int iLastRow =  this.jTableDatosProcesoRecibos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoRecibos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoRecibos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoRecibos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();									
		
			ProcesoRecibos procesorecibosOrigen=new ProcesoRecibos();
			ProcesoRecibos procesorecibosDestino=new ProcesoRecibos();
				
			procesorecibossSeleccionados=this.getProcesoRecibossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoRecibos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesorecibossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoRecibos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesorecibosOrigen =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesorecibosOrigen =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesorecibosDestino =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesorecibosDestino =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesorecibosOrigen =procesorecibossSeleccionados.get(0);
				procesorecibosDestino =procesorecibossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoRecibos(procesorecibosOrigen,procesorecibosDestino,true,false);
				
				procesorecibosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesorecibosDestino,procesorecibosLogic.getProcesoReciboss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesorecibosDestino,procesoreciboss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoRecibos(false);
				
				//this.jTableDatosProcesoRecibos.setRowSelectionInterval(this.getIndiceNuevoProcesoRecibos(), this.getIndiceNuevoProcesoRecibos());
				
				int iLastRow =  this.jTableDatosProcesoRecibos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoRecibos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoRecibos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoRecibos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoRecibos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoRecibos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoRecibos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoRecibos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoRecibos.setVisible(!isVisible);
			this.jPanelPaginacionProcesoRecibos.setVisible(!isVisible);
			this.jPanelAccionesProcesoRecibos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoRecibos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoRecibos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoRecibos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoRecibos();
			
			this.abrirFrameOrderByProcesoRecibos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoRecibos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoRecibos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoRecibos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoRecibos.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoRecibos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoRecibos.setSize(this.jInternalFrameDetalleFormProcesoRecibos.iWidthFormulario,this.jInternalFrameDetalleFormProcesoRecibos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoRecibos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoRecibos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoRecibos.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoRecibos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoRecibos.jContentPaneDetalleProcesoRecibos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoRecibos.jTabbedPaneRelacionesProcesoRecibos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoRecibos.jContentPaneDetalleProcesoRecibos.getWidth(),ProcesoRecibosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoRecibos.jTabbedPaneRelacionesProcesoRecibos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoRecibos.jContentPaneDetalleProcesoRecibos.getWidth(),ProcesoRecibosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoRecibos.jTabbedPaneRelacionesProcesoRecibos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoRecibos.jContentPaneDetalleProcesoRecibos.getWidth(),ProcesoRecibosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoRecibos.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoRecibos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoRecibos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoRecibos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoRecibos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoRecibos,false,this);
				} else {
					this.jInternalFrameOrderByProcesoRecibos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoRecibos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoRecibos);
				this.jInternalFrameOrderByProcesoRecibos.setVisible(false);
				this.jInternalFrameOrderByProcesoRecibos.setSelected(false);
				
				this.jInternalFrameOrderByProcesoRecibos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoRecibos"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoRecibos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoRecibos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoRecibos==null) {
				
				this.jInternalFrameImportacionProcesoRecibos=new ImportacionJInternalFrame(ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoRecibos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoRecibos);
				this.jInternalFrameImportacionProcesoRecibos.setVisible(false);
				this.jInternalFrameImportacionProcesoRecibos.setSelected(false);


				this.jInternalFrameImportacionProcesoRecibos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoRecibos"));
				this.jInternalFrameImportacionProcesoRecibos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoRecibos"));
				this.jInternalFrameImportacionProcesoRecibos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoRecibos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoRecibos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoRecibos==null) {
				this.jInternalFrameReporteDinamicoProcesoRecibos=new ReporteDinamicoJInternalFrame(ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoRecibos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoRecibos);
				this.jInternalFrameReporteDinamicoProcesoRecibos.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoRecibos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoRecibos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoRecibos"));
				this.jInternalFrameReporteDinamicoProcesoRecibos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoRecibos"));
				this.jInternalFrameReporteDinamicoProcesoRecibos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoRecibos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoRecibos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoRecibos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoRecibos);
			
	       	this.jInternalFrameDetalleFormProcesoRecibos.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoRecibos.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoRecibos.dispose();
			//this.jInternalFrameDetalleFormProcesoRecibos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoRecibos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoRecibos.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoRecibos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoRecibos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoRecibos.setVisible(true);
	        this.jInternalFrameImportacionProcesoRecibos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoRecibos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoRecibos.setVisible(true);
	        this.jInternalFrameOrderByProcesoRecibos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoRecibos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoRecibos.setVisible(false);
	        this.jInternalFrameOrderByProcesoRecibos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoRecibos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoRecibos.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoRecibos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoRecibos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoRecibos.setVisible(false);
	        this.jInternalFrameImportacionProcesoRecibos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoRecibos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoRecibos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoRecibos(true);
			//this.isEsNuevoProcesoRecibos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoRecibos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoRecibos(false) ;
			
			if(procesorecibosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoRecibosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoRecibos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoRecibos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoRecibosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoRecibos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoRecibos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoRecibos(true);
			//this.isEsNuevoProcesoRecibos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesorecibos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoRecibos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoRecibos(false) ;
			
			if(ProcesoRecibosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoRecibos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoRecibos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaProvincia(List<Provincia> provinciasForeignKey)throws Exception{
		TableColumn tableColumnProvincia=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_IDPROVINCIA));
		TableCellEditor tableCellEditorProvincia =tableColumnProvincia.getCellEditor();

		ProvinciaTableCell provinciaTableCellFk=(ProvinciaTableCell)tableCellEditorProvincia;

		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.setprovinciasForeignKey(provinciasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoRecibos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//provinciaTableCellFk.setRowActual(intSelectedRow);
			//provinciaTableCellFk.setprovinciasForeignKeyActual(provinciasForeignKey);
		//}


		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.RecargarProvinciasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoRecibos.getSelectedRow();

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
		TableColumn tableColumnZona=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_IDZONA));
		TableCellEditor tableCellEditorZona =tableColumnZona.getCellEditor();

		ZonaTableCell zonaTableCellFk=(ZonaTableCell)tableCellEditorZona;

		if(zonaTableCellFk!=null) {
			zonaTableCellFk.setzonasForeignKey(zonasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoRecibos.getSelectedRow();

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
		TableColumn tableColumnGrupoCliente=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_IDGRUPOCLIENTE));
		TableCellEditor tableCellEditorGrupoCliente =tableColumnGrupoCliente.getCellEditor();

		GrupoClienteTableCell grupoclienteTableCellFk=(GrupoClienteTableCell)tableCellEditorGrupoCliente;

		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.setgrupoclientesForeignKey(grupoclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoRecibos.getSelectedRow();

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
		TableColumn tableColumnVendedor=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoRecibos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoRecibos(false);
			
			//if(!this.isEsNuevoProcesoRecibos) {								
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				
			}
			
			if(this.permiteMantenimiento(this.procesorecibos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoRecibos=true;
					this.inicializarActualizarBindingTablaProcesoRecibos(false);
					this.isEsNuevoProcesoRecibos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoRecibos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoRecibos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoRecibos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoRecibos(false);
				
				this.habilitarDeshabilitarControlesProcesoRecibos(false);
			
												
				
				if(ProcesoRecibosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoRecibos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoRecibosActionPerformed(evt,procesorecibosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoRecibos(this.procesorecibos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoRecibos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesorecibosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesorecibos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoRecibos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecibos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				this.procesorecibos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				this.procesorecibos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesorecibos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoRecibosModel) this.jTableDatosProcesoRecibos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoRecibos=true;
				this.inicializarActualizarBindingTablaProcesoRecibos(false);
				this.isEsNuevoProcesoRecibos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoRecibos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoRecibos(false);
				
				this.habilitarDeshabilitarControlesProcesoRecibos(false);
				
				
				
				if(ProcesoRecibosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoRecibos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoRecibos.getRowCount()>=1) {
				jTableDatosProcesoRecibos.removeRowSelectionInterval(0, jTableDatosProcesoRecibos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoRecibos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoRecibos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoRecibos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoRecibos(false) ;
			
			this.isEsNuevoProcesoRecibos=false;
			
			if(ProcesoRecibosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoRecibos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoRecibos(false);
				
				//SI ES MANUAL
				if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoRecibos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoRecibos--;			
			//ProcesoRecibos procesorecibosAux= new ProcesoRecibos();			
			//procesorecibosAux.setId(this.iIdNuevoProcesoRecibos);
			
			if(this.jInternalFrameDetalleFormProcesoRecibos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoRecibos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
			
			this.procesorecibos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesorecibosLogic.getProcesoReciboss().add(this.procesorecibosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesoreciboss.add(this.procesorecibosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoRecibos(false);
			
			this.jTableDatosProcesoRecibos.setRowSelectionInterval(this.getIndiceNuevoProcesoRecibos(), this.getIndiceNuevoProcesoRecibos());
			
			int iLastRow =  this.jTableDatosProcesoRecibos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoRecibos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoRecibos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoRecibos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoRecibos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoRecibos(false);
			
			//SI ES MANUAL
			if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoRecibos();
			}
			
			//this.abrirFrameTreeProcesoRecibos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoRecibos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoRecibos.setFileImportacion(this.jInternalFrameImportacionProcesoRecibos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoRecibos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoRecibos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoRecibos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoRecibos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();		

		procesorecibossSeleccionados=this.getProcesoRecibossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecibos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecibos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoRecibosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoRecibosBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoReciboss("Todos",procesorecibossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecibosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recibos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoRecibos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoRecibos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProvincia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProvincia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProvincia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProvincia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCiudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCiudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCiudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCiudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreZona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreZona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreZona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreZona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGrupoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGrupoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGrupoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGrupoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreVendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreVendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreVendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreVendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoRecibosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoAsiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoAsiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoAsiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoAsiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoRecibos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecibos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecibos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					sNombreCampoCategoria="nombre_provincia";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoria="nombre_ciudad";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoria="nombre_zona";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoria="nombre_grupo_cliente";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoria="nombre_vendedor";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO:
					sNombreCampoCategoria="codigo_asiento";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecibos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					sNombreCampoCategoriaValor="nombre_provincia";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoriaValor="nombre_ciudad";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoriaValor="nombre_zona";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoriaValor="nombre_grupo_cliente";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoriaValor="nombre_vendedor";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO:
					sNombreCampoCategoriaValor="codigo_asiento";
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoRecibos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoRecibos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Provincia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_provincia");
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_ciudad");
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Zona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_zona");
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Grupo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_grupo_cliente");
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_vendedor");
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Asiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_asiento");
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();		
		
		procesorecibossSeleccionados=this.getProcesoRecibossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecibos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoReciboss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoRecibos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoRecibos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoRecibosConstantesFunciones.LABEL_IDPROVINCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDPROVINCIA);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getprovincia_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_IDZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDZONA);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getzona_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getgrupocliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getnombre_provincia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getnombre_ciudad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getnombre_zona());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getnombre_grupo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getnombre_vendedor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getcodigo_asiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(ProcesoRecibos procesorecibos:procesorecibossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecibos.getnumero_mayor());
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
			//	this.getFilaCabeceraExportarExcelProcesoRecibos(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoRecibos procesorecibosAux:procesorecibossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoRecibos(procesorecibosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecibosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recibos",JOptionPane.INFORMATION_MESSAGE);
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
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoRecibos(false);
			
			//SI ES MANUAL
			if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoRecibos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoRecibos(false);
			
			//SI ES MANUAL
			if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoRecibos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoRecibos(false);
			
			//SI ES MANUAL
			if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoRecibos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoRecibos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoRecibos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoRecibos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoRecibos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoRecibos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoRecibos.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoRecibos.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoRecibos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoRecibos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoRecibos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoRecibos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoRecibos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoRecibos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoRecibos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoRecibos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoRecibos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoRecibosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoRecibos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoRecibos();
		
		this.inicializarActualizarBindingBotonesManualProcesoRecibos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoRecibos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoRecibos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoRecibos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoRecibos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoRecibos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoRecibos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoRecibos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoRecibos.jCheckBoxPostAccionNuevoProcesoRecibos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoRecibos.jCheckBoxPostAccionSinCerrarProcesoRecibos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoRecibos.jCheckBoxPostAccionSinMensajeProcesoRecibos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoRecibos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoRecibos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoRecibos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
				this.jInternalFrameDetalleFormProcesoRecibos.jCheckBoxPostAccionNuevoProcesoRecibos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoRecibos.jCheckBoxPostAccionSinCerrarProcesoRecibos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoRecibos.jCheckBoxPostAccionSinMensajeProcesoRecibos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoRecibos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoRecibos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoRecibos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoRecibos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecibos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoRecibos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoRecibos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoRecibos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoRecibos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoRecibos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecibos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoRecibos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoRecibos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoRecibos(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoRecibos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoRecibos() throws Exception {
		try	{
			if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoRecibos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoRecibos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoRecibos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoRecibos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoRecibos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoRecibos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoRecibos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoRecibos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoRecibos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoRecibos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoRecibos.addItem(reporte);
			}
			
			
			if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoRecibos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoRecibos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoRecibos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoRecibos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoRecibos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoRecibos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoRecibos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoRecibos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoRecibos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoRecibos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoRecibos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoRecibos!=null) {
				this.jInternalFrameReporteDinamicoProcesoRecibos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoRecibos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoRecibos!=null) {
				this.jInternalFrameReporteDinamicoProcesoRecibos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoRecibos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoRecibos!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoRecibos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoRecibos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoRecibos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoRecibos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoRecibos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoRecibos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoRecibos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos.getSelectedItem()!=null){this.id_provinciaBusquedaProcesoRecibos=((Provincia)this.jComboBoxid_provinciaBusquedaProcesoRecibosProcesoRecibos.getSelectedItem()).getId();}
		if(this.jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos.getSelectedItem()!=null){this.id_ciudadBusquedaProcesoRecibos=((Ciudad)this.jComboBoxid_ciudadBusquedaProcesoRecibosProcesoRecibos.getSelectedItem()).getId();}
		if(this.jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos.getSelectedItem()!=null){this.id_zonaBusquedaProcesoRecibos=((Zona)this.jComboBoxid_zonaBusquedaProcesoRecibosProcesoRecibos.getSelectedItem()).getId();}
		if(this.jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.getSelectedItem()!=null){this.id_grupo_clienteBusquedaProcesoRecibos=((GrupoCliente)this.jComboBoxid_grupo_clienteBusquedaProcesoRecibosProcesoRecibos.getSelectedItem()).getId();}
		if(this.jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos.getSelectedItem()!=null){this.id_vendedorBusquedaProcesoRecibos=((Vendedor)this.jComboBoxid_vendedorBusquedaProcesoRecibosProcesoRecibos.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoRecibos(Boolean esInicializar) throws Exception {				
		if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoRecibos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoRecibos() throws Exception {
		this.inicializarActualizarBindingTablaProcesoRecibos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoRecibos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoRecibosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoRecibos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesorecibosLogic.getProcesoReciboss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesoreciboss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoRecibos.setModel(new ProcesoRecibosModel(this.procesorecibosLogic.getProcesoReciboss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoRecibos.setModel(new ProcesoRecibosModel(this.procesoreciboss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoRecibos!=null && this.jInternalFrameOrderByProcesoRecibos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoRecibos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO,procesorecibosConstantesFunciones.resaltarSeleccionarProcesoRecibos,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO,procesorecibosConstantesFunciones.resaltarSeleccionarProcesoRecibos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_ID));

		if(this.procesorecibosConstantesFunciones.mostraridProcesoRecibos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecibosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesorecibosConstantesFunciones.resaltaridProcesoRecibos,this.procesorecibosConstantesFunciones.activaridProcesoRecibos,this,true,"idProcesoRecibos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecibosConstantesFunciones.resaltaridProcesoRecibos,this.procesorecibosConstantesFunciones.activaridProcesoRecibos,this,true,"idProcesoRecibos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA));

		if(this.procesorecibosConstantesFunciones.mostrarnombre_provinciaProcesoRecibos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesorecibosConstantesFunciones.resaltarnombre_provinciaProcesoRecibos,this.procesorecibosConstantesFunciones.activarnombre_provinciaProcesoRecibos,this,true,"nombre_provinciaProcesoRecibos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecibosConstantesFunciones.resaltarnombre_provinciaProcesoRecibos,this.procesorecibosConstantesFunciones.activarnombre_provinciaProcesoRecibos,this,true,"nombre_provinciaProcesoRecibos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD));

		if(this.procesorecibosConstantesFunciones.mostrarnombre_ciudadProcesoRecibos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesorecibosConstantesFunciones.resaltarnombre_ciudadProcesoRecibos,this.procesorecibosConstantesFunciones.activarnombre_ciudadProcesoRecibos,this,true,"nombre_ciudadProcesoRecibos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecibosConstantesFunciones.resaltarnombre_ciudadProcesoRecibos,this.procesorecibosConstantesFunciones.activarnombre_ciudadProcesoRecibos,this,true,"nombre_ciudadProcesoRecibos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA));

		if(this.procesorecibosConstantesFunciones.mostrarnombre_zonaProcesoRecibos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesorecibosConstantesFunciones.resaltarnombre_zonaProcesoRecibos,this.procesorecibosConstantesFunciones.activarnombre_zonaProcesoRecibos,this,true,"nombre_zonaProcesoRecibos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecibosConstantesFunciones.resaltarnombre_zonaProcesoRecibos,this.procesorecibosConstantesFunciones.activarnombre_zonaProcesoRecibos,this,true,"nombre_zonaProcesoRecibos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE));

		if(this.procesorecibosConstantesFunciones.mostrarnombre_grupo_clienteProcesoRecibos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesorecibosConstantesFunciones.resaltarnombre_grupo_clienteProcesoRecibos,this.procesorecibosConstantesFunciones.activarnombre_grupo_clienteProcesoRecibos,this,true,"nombre_grupo_clienteProcesoRecibos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecibosConstantesFunciones.resaltarnombre_grupo_clienteProcesoRecibos,this.procesorecibosConstantesFunciones.activarnombre_grupo_clienteProcesoRecibos,this,true,"nombre_grupo_clienteProcesoRecibos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR));

		if(this.procesorecibosConstantesFunciones.mostrarnombre_vendedorProcesoRecibos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesorecibosConstantesFunciones.resaltarnombre_vendedorProcesoRecibos,this.procesorecibosConstantesFunciones.activarnombre_vendedorProcesoRecibos,this,true,"nombre_vendedorProcesoRecibos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecibosConstantesFunciones.resaltarnombre_vendedorProcesoRecibos,this.procesorecibosConstantesFunciones.activarnombre_vendedorProcesoRecibos,this,true,"nombre_vendedorProcesoRecibos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_CODIGO));

		if(this.procesorecibosConstantesFunciones.mostrarcodigoProcesoRecibos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecibosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesorecibosConstantesFunciones.resaltarcodigoProcesoRecibos,this.procesorecibosConstantesFunciones.activarcodigoProcesoRecibos,this,true,"codigoProcesoRecibos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecibosConstantesFunciones.resaltarcodigoProcesoRecibos,this.procesorecibosConstantesFunciones.activarcodigoProcesoRecibos,this,true,"codigoProcesoRecibos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.procesorecibosConstantesFunciones.mostrarnombre_completoProcesoRecibos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesorecibosConstantesFunciones.resaltarnombre_completoProcesoRecibos,this.procesorecibosConstantesFunciones.activarnombre_completoProcesoRecibos,this,true,"nombre_completoProcesoRecibos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecibosConstantesFunciones.resaltarnombre_completoProcesoRecibos,this.procesorecibosConstantesFunciones.activarnombre_completoProcesoRecibos,this,true,"nombre_completoProcesoRecibos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO));

		if(this.procesorecibosConstantesFunciones.mostrarcodigo_asientoProcesoRecibos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesorecibosConstantesFunciones.resaltarcodigo_asientoProcesoRecibos,this.procesorecibosConstantesFunciones.activarcodigo_asientoProcesoRecibos,this,true,"codigo_asientoProcesoRecibos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecibosConstantesFunciones.resaltarcodigo_asientoProcesoRecibos,this.procesorecibosConstantesFunciones.activarcodigo_asientoProcesoRecibos,this,true,"codigo_asientoProcesoRecibos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.procesorecibosConstantesFunciones.mostrarnumero_mayorProcesoRecibos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesorecibosConstantesFunciones.resaltarnumero_mayorProcesoRecibos,this.procesorecibosConstantesFunciones.activarnumero_mayorProcesoRecibos,this,true,"numero_mayorProcesoRecibos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecibosConstantesFunciones.resaltarnumero_mayorProcesoRecibos,this.procesorecibosConstantesFunciones.activarnumero_mayorProcesoRecibos,this,true,"numero_mayorProcesoRecibos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoRecibosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesorecibosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesorecibosSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoRecibos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesorecibosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesorecibosSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoRecibos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoRecibos && this.isPermisoGuardarCambiosProcesoRecibos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesorecibosSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesorecibosSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoRecibos.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoRecibos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoRecibos && this.isPermisoGuardarCambiosProcesoRecibos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoRecibos && this.isPermisoGuardarCambiosProcesoRecibos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoRecibos.moveColumn(this.jTableDatosProcesoRecibos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoRecibos.moveColumn(this.jTableDatosProcesoRecibos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoRecibos.moveColumn(this.jTableDatosProcesoRecibos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoRecibos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoRecibos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoRecibos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoRecibos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoRecibos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoRecibosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoRecibos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoRecibos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoRecibos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesorecibosLogic.getProcesoReciboss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesoreciboss.size()-1;
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
		//this.jTableDatosProcesoRecibos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoRecibos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoRecibos();
			
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
				
				//this.isEsNuevoProcesoRecibos=false;
					
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			
				if(this.procesorecibosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoRecibos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoRecibos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoRecibos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesorecibos.getsType().equals("DUPLICADO")
				   || this.procesorecibos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoRecibos=true;
				
				} else {
					this.isEsNuevoProcesoRecibos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
					if(this.procesorecibos.getId()>=0 && !this.procesorecibos.getIsNew()) {						
						this.isEsNuevoProcesoRecibos=false;
						
					} else {
						this.isEsNuevoProcesoRecibos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoRecibos(esRelaciones);						
				
				this.seleccionarProcesoRecibos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesorecibos.getId()<0) {
					this.isEsNuevoProcesoRecibos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoRecibos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoRecibos(evt,rowIndex);
				}	
				
				if(this.procesorecibosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoRecibos: " + this.dDif); 
					}
				}								
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoRecibos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesorecibos)) {
					if(this.procesorecibos.getId()>0) {
						this.procesorecibos.setIsDeleted(true);
						
						this.procesorecibossEliminados.add(this.procesorecibos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesorecibosLogic.getProcesoReciboss().remove(this.procesorecibos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoreciboss.remove(this.procesorecibos);				
					}
					
					
					((ProcesoRecibosModel) this.jTableDatosProcesoRecibos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoRecibos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoRecibos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoRecibos) {
			
			if(this.jInternalFrameDetalleFormProcesoRecibos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoRecibos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoRecibos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoRecibos(this.procesorecibos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoRecibos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoRecibos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoRecibos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoRecibos(ProcesoRecibos procesorecibos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoRecibos(procesorecibos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoRecibos(ProcesoRecibos procesorecibos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoRecibos(procesorecibos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoRecibos(procesorecibos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoRecibos(procesorecibos);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoRecibos(ProcesoRecibos procesorecibos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoRecibos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoRecibos.jLabelidProcesoRecibos.setText(procesorecibos.getId().toString());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_provinciaProcesoRecibos.setText(procesorecibos.getnombre_provincia());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_ciudadProcesoRecibos.setText(procesorecibos.getnombre_ciudad());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldnombre_zonaProcesoRecibos.setText(procesorecibos.getnombre_zona());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_grupo_clienteProcesoRecibos.setText(procesorecibos.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_vendedorProcesoRecibos.setText(procesorecibos.getnombre_vendedor());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldcodigoProcesoRecibos.setText(procesorecibos.getcodigo());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_completoProcesoRecibos.setText(procesorecibos.getnombre_completo());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreacodigo_asientoProcesoRecibos.setText(procesorecibos.getcodigo_asiento());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanumero_mayorProcesoRecibos.setText(procesorecibos.getnumero_mayor());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoRecibos procesorecibosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesorecibosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoRecibos procesorecibosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesorecibosLocal=this.procesorecibos;
			} else {
				procesorecibosLocal=this.procesorecibosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesorecibosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoRecibos(procesorecibosLocal,true);
					
					if(procesorecibosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesorecibosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesorecibosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoRecibos(ProcesoRecibos procesorecibos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoRecibos(procesorecibos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(procesorecibos);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoRecibos(ProcesoRecibos procesorecibos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoRecibos(procesorecibos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoRecibos(ProcesoRecibos procesorecibos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoRecibos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoRecibos.jLabelidProcesoRecibos.getText()==null || this.jInternalFrameDetalleFormProcesoRecibos.jLabelidProcesoRecibos.getText()=="" || this.jInternalFrameDetalleFormProcesoRecibos.jLabelidProcesoRecibos.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoRecibos.jLabelidProcesoRecibos.setText("0");
			}

			if(conColumnasBase) {procesorecibos.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoRecibos.jLabelidProcesoRecibos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecibosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelIdProcesoRecibos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecibos.setnombre_provincia(this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_provinciaProcesoRecibos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_provinciaProcesoRecibos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecibos.setnombre_ciudad(this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_ciudadProcesoRecibos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_ciudadProcesoRecibos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecibos.setnombre_zona(this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldnombre_zonaProcesoRecibos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_zonaProcesoRecibos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecibos.setnombre_grupo_cliente(this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_grupo_clienteProcesoRecibos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_grupo_clienteProcesoRecibos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecibos.setnombre_vendedor(this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_vendedorProcesoRecibos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_vendedorProcesoRecibos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecibos.setcodigo(this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldcodigoProcesoRecibos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecibosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelcodigoProcesoRecibos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecibos.setnombre_completo(this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_completoProcesoRecibos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnombre_completoProcesoRecibos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecibos.setcodigo_asiento(this.jInternalFrameDetalleFormProcesoRecibos.jTextAreacodigo_asientoProcesoRecibos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelcodigo_asientoProcesoRecibos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecibos.setnumero_mayor(this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanumero_mayorProcesoRecibos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecibos.jLabelnumero_mayorProcesoRecibos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoRecibos(ProcesoRecibos procesorecibosBean,ProcesoRecibos procesorecibos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoRecibos(ProcesoRecibos procesorecibosOrigen,ProcesoRecibos procesorecibos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesorecibosOrigen.getId()!=null && !procesorecibosOrigen.getId().equals(0L))) {procesorecibos.setId(procesorecibosOrigen.getId());}}
			if(conDefault || (!conDefault && procesorecibosOrigen.getnombre_provincia()!=null && !procesorecibosOrigen.getnombre_provincia().equals(""))) {procesorecibos.setnombre_provincia(procesorecibosOrigen.getnombre_provincia());}
			if(conDefault || (!conDefault && procesorecibosOrigen.getnombre_ciudad()!=null && !procesorecibosOrigen.getnombre_ciudad().equals(""))) {procesorecibos.setnombre_ciudad(procesorecibosOrigen.getnombre_ciudad());}
			if(conDefault || (!conDefault && procesorecibosOrigen.getnombre_zona()!=null && !procesorecibosOrigen.getnombre_zona().equals(""))) {procesorecibos.setnombre_zona(procesorecibosOrigen.getnombre_zona());}
			if(conDefault || (!conDefault && procesorecibosOrigen.getnombre_grupo_cliente()!=null && !procesorecibosOrigen.getnombre_grupo_cliente().equals(""))) {procesorecibos.setnombre_grupo_cliente(procesorecibosOrigen.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && procesorecibosOrigen.getnombre_vendedor()!=null && !procesorecibosOrigen.getnombre_vendedor().equals(""))) {procesorecibos.setnombre_vendedor(procesorecibosOrigen.getnombre_vendedor());}
			if(conDefault || (!conDefault && procesorecibosOrigen.getcodigo()!=null && !procesorecibosOrigen.getcodigo().equals(""))) {procesorecibos.setcodigo(procesorecibosOrigen.getcodigo());}
			if(conDefault || (!conDefault && procesorecibosOrigen.getnombre_completo()!=null && !procesorecibosOrigen.getnombre_completo().equals(""))) {procesorecibos.setnombre_completo(procesorecibosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && procesorecibosOrigen.getcodigo_asiento()!=null && !procesorecibosOrigen.getcodigo_asiento().equals(""))) {procesorecibos.setcodigo_asiento(procesorecibosOrigen.getcodigo_asiento());}
			if(conDefault || (!conDefault && procesorecibosOrigen.getnumero_mayor()!=null && !procesorecibosOrigen.getnumero_mayor().equals(""))) {procesorecibos.setnumero_mayor(procesorecibosOrigen.getnumero_mayor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoRecibos(ProcesoRecibos procesorecibos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoRecibos.jLabelidProcesoRecibos.setText(procesorecibos.getId().toString());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_provinciaProcesoRecibos.setText(procesorecibos.getnombre_provincia());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_ciudadProcesoRecibos.setText(procesorecibos.getnombre_ciudad());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldnombre_zonaProcesoRecibos.setText(procesorecibos.getnombre_zona());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_grupo_clienteProcesoRecibos.setText(procesorecibos.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_vendedorProcesoRecibos.setText(procesorecibos.getnombre_vendedor());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldcodigoProcesoRecibos.setText(procesorecibos.getcodigo());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_completoProcesoRecibos.setText(procesorecibos.getnombre_completo());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreacodigo_asientoProcesoRecibos.setText(procesorecibos.getcodigo_asiento());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanumero_mayorProcesoRecibos.setText(procesorecibos.getnumero_mayor());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoRecibos(ProcesoRecibosBean procesorecibosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoRecibos.jLabelidProcesoRecibos.setText(procesorecibosBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_provinciaProcesoRecibos.setText(procesorecibosBean.getnombre_provincia());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_ciudadProcesoRecibos.setText(procesorecibosBean.getnombre_ciudad());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldnombre_zonaProcesoRecibos.setText(procesorecibosBean.getnombre_zona());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_grupo_clienteProcesoRecibos.setText(procesorecibosBean.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_vendedorProcesoRecibos.setText(procesorecibosBean.getnombre_vendedor());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldcodigoProcesoRecibos.setText(procesorecibosBean.getcodigo());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_completoProcesoRecibos.setText(procesorecibosBean.getnombre_completo());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreacodigo_asientoProcesoRecibos.setText(procesorecibosBean.getcodigo_asiento());
			this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanumero_mayorProcesoRecibos.setText(procesorecibosBean.getnumero_mayor());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoRecibos(ProcesoRecibosParameterReturnGeneral procesorecibosReturnGeneral,ProcesoRecibosBean procesorecibosBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoRecibos procesorecibosLocal=new ProcesoRecibos();
			
			procesorecibosLocal=procesorecibosReturnGeneral.getProcesoRecibos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesorecibosLocal.getId()!=null && !procesorecibosLocal.getId().equals(0L))) {procesorecibosBean.setId(procesorecibosLocal.getId());}}
			if(conDefault || (!conDefault && procesorecibosLocal.getnombre_provincia()!=null && !procesorecibosLocal.getnombre_provincia().equals(""))) {procesorecibosBean.setnombre_provincia(procesorecibosLocal.getnombre_provincia());}
			if(conDefault || (!conDefault && procesorecibosLocal.getnombre_ciudad()!=null && !procesorecibosLocal.getnombre_ciudad().equals(""))) {procesorecibosBean.setnombre_ciudad(procesorecibosLocal.getnombre_ciudad());}
			if(conDefault || (!conDefault && procesorecibosLocal.getnombre_zona()!=null && !procesorecibosLocal.getnombre_zona().equals(""))) {procesorecibosBean.setnombre_zona(procesorecibosLocal.getnombre_zona());}
			if(conDefault || (!conDefault && procesorecibosLocal.getnombre_grupo_cliente()!=null && !procesorecibosLocal.getnombre_grupo_cliente().equals(""))) {procesorecibosBean.setnombre_grupo_cliente(procesorecibosLocal.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && procesorecibosLocal.getnombre_vendedor()!=null && !procesorecibosLocal.getnombre_vendedor().equals(""))) {procesorecibosBean.setnombre_vendedor(procesorecibosLocal.getnombre_vendedor());}
			if(conDefault || (!conDefault && procesorecibosLocal.getcodigo()!=null && !procesorecibosLocal.getcodigo().equals(""))) {procesorecibosBean.setcodigo(procesorecibosLocal.getcodigo());}
			if(conDefault || (!conDefault && procesorecibosLocal.getnombre_completo()!=null && !procesorecibosLocal.getnombre_completo().equals(""))) {procesorecibosBean.setnombre_completo(procesorecibosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && procesorecibosLocal.getcodigo_asiento()!=null && !procesorecibosLocal.getcodigo_asiento().equals(""))) {procesorecibosBean.setcodigo_asiento(procesorecibosLocal.getcodigo_asiento());}
			if(conDefault || (!conDefault && procesorecibosLocal.getnumero_mayor()!=null && !procesorecibosLocal.getnumero_mayor().equals(""))) {procesorecibosBean.setnumero_mayor(procesorecibosLocal.getnumero_mayor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoRecibosGenerico(Long idProcesoRecibosSeleccionado,JComboBox jComboBoxProcesoRecibos,List<ProcesoRecibos> procesorecibossLocal)throws Exception {
		try {
			ProcesoRecibos  procesorecibosTemp=null;

			for(ProcesoRecibos procesorecibosAux:procesorecibossLocal) {
				if(procesorecibosAux.getId()!=null && procesorecibosAux.getId().equals(idProcesoRecibosSeleccionado)) {
					procesorecibosTemp=procesorecibosAux;
					break;
				}
			}

			jComboBoxProcesoRecibos.setSelectedItem(procesorecibosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoRecibosGenerico(JComboBox jComboBoxProcesoRecibos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoRecibos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoRecibos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoRecibos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoRecibos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesorecibos=(ProcesoRecibos) procesorecibosLogic.getProcesoReciboss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesorecibos =(ProcesoRecibos) procesoreciboss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Provincia")) {
			//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
			if(!procesorecibos.getIsNew() && !procesorecibos.getIsChanged() && !procesorecibos.getIsDeleted()) {
				sDescripcion=procesorecibos.getprovincia_descripcion();
			} else {
				//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
				sDescripcion=procesorecibos.getprovincia_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!procesorecibos.getIsNew() && !procesorecibos.getIsChanged() && !procesorecibos.getIsDeleted()) {
				sDescripcion=procesorecibos.getciudad_descripcion();
			} else {
				//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
				sDescripcion=procesorecibos.getciudad_descripcion();
			}
		}

		if(sTipo.equals("Zona")) {
			//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
			if(!procesorecibos.getIsNew() && !procesorecibos.getIsChanged() && !procesorecibos.getIsDeleted()) {
				sDescripcion=procesorecibos.getzona_descripcion();
			} else {
				//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
				sDescripcion=procesorecibos.getzona_descripcion();
			}
		}

		if(sTipo.equals("GrupoCliente")) {
			//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
			if(!procesorecibos.getIsNew() && !procesorecibos.getIsChanged() && !procesorecibos.getIsDeleted()) {
				sDescripcion=procesorecibos.getgrupocliente_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
				sDescripcion=procesorecibos.getgrupocliente_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!procesorecibos.getIsNew() && !procesorecibos.getIsChanged() && !procesorecibos.getIsDeleted()) {
				sDescripcion=procesorecibos.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=procesorecibos.getvendedor_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoRecibos procesorecibosRow=new ProcesoRecibos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesorecibosRow=(ProcesoRecibos) procesorecibosLogic.getProcesoReciboss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesorecibosRow=(ProcesoRecibos) procesoreciboss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoRecibos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoRecibos.setVisible((this.isVisibilidadCeldaNuevoProcesoRecibos && this.isPermisoNuevoProcesoRecibos));			
			this.jButtonDuplicarProcesoRecibos.setVisible((this.isVisibilidadCeldaDuplicarProcesoRecibos && this.isPermisoDuplicarProcesoRecibos));			
			this.jButtonCopiarProcesoRecibos.setVisible((this.isVisibilidadCeldaCopiarProcesoRecibos && this.isPermisoCopiarProcesoRecibos));
			this.jButtonVerFormProcesoRecibos.setVisible((this.isVisibilidadCeldaVerFormProcesoRecibos && this.isPermisoVerFormProcesoRecibos));
			
			this.jButtonAbrirOrderByProcesoRecibos.setVisible((this.isVisibilidadCeldaOrdenProcesoRecibos && this.isPermisoOrdenProcesoRecibos));			
			
			this.jButtonNuevoRelacionesProcesoRecibos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos && this.isPermisoNuevoProcesoRecibos));			
			this.jButtonNuevoGuardarCambiosProcesoRecibos.setVisible((this.isVisibilidadCeldaNuevoProcesoRecibos && this.isPermisoNuevoProcesoRecibos && this.isPermisoGuardarCambiosProcesoRecibos));
			
			if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonModificarProcesoRecibos.setVisible((this.isVisibilidadCeldaModificarProcesoRecibos && this.isPermisoActualizarProcesoRecibos));	
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonActualizarProcesoRecibos.setVisible((this.isVisibilidadCeldaActualizarProcesoRecibos && this.isPermisoActualizarProcesoRecibos));	
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonEliminarProcesoRecibos.setVisible((this.isVisibilidadCeldaEliminarProcesoRecibos && this.isPermisoEliminarProcesoRecibos));
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonCancelarProcesoRecibos.setVisible(this.isVisibilidadCeldaCancelarProcesoRecibos);							
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonGuardarCambiosProcesoRecibos.setVisible((this.isVisibilidadCeldaGuardarProcesoRecibos && this.isPermisoGuardarCambiosProcesoRecibos));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoRecibos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoRecibos && this.isPermisoGuardarCambiosProcesoRecibos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoRecibos.setVisible((this.isVisibilidadCeldaNuevoProcesoRecibos && this.isPermisoNuevoProcesoRecibos));						
			this.jButtonDuplicarToolBarProcesoRecibos.setVisible((this.isVisibilidadCeldaDuplicarProcesoRecibos && this.isPermisoDuplicarProcesoRecibos));						
			this.jButtonCopiarToolBarProcesoRecibos.setVisible((this.isVisibilidadCeldaCopiarProcesoRecibos && this.isPermisoCopiarProcesoRecibos));			
			this.jButtonVerFormToolBarProcesoRecibos.setVisible((this.isVisibilidadCeldaVerFormProcesoRecibos && this.isPermisoVerFormProcesoRecibos));			
			this.jButtonAbrirOrderByToolBarProcesoRecibos.setVisible((this.isVisibilidadCeldaOrdenProcesoRecibos && this.isPermisoOrdenProcesoRecibos));
			this.jButtonNuevoRelacionesToolBarProcesoRecibos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos && this.isPermisoNuevoProcesoRecibos));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoRecibos.setVisible((this.isVisibilidadCeldaNuevoProcesoRecibos && this.isPermisoNuevoProcesoRecibos && this.isPermisoGuardarCambiosProcesoRecibos));			
			
			if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonModificarToolBarProcesoRecibos.setVisible((this.isVisibilidadCeldaModificarProcesoRecibos && this.isPermisoActualizarProcesoRecibos));	
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonActualizarToolBarProcesoRecibos.setVisible((this.isVisibilidadCeldaActualizarProcesoRecibos  && this.isPermisoActualizarProcesoRecibos));	
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonEliminarToolBarProcesoRecibos.setVisible((this.isVisibilidadCeldaEliminarProcesoRecibos && this.isPermisoEliminarProcesoRecibos));
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonCancelarToolBarProcesoRecibos.setVisible(this.isVisibilidadCeldaCancelarProcesoRecibos);				
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonGuardarCambiosToolBarProcesoRecibos.setVisible((this.isVisibilidadCeldaGuardarProcesoRecibos && this.isPermisoGuardarCambiosProcesoRecibos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoRecibos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoRecibos && this.isPermisoGuardarCambiosProcesoRecibos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoRecibos.setVisible((this.isVisibilidadCeldaNuevoProcesoRecibos && this.isPermisoNuevoProcesoRecibos));			
			this.jMenuItemDuplicarProcesoRecibos.setVisible((this.isVisibilidadCeldaDuplicarProcesoRecibos && this.isPermisoDuplicarProcesoRecibos));			
			this.jMenuItemCopiarProcesoRecibos.setVisible((this.isVisibilidadCeldaCopiarProcesoRecibos && this.isPermisoCopiarProcesoRecibos));			
			this.jMenuItemVerFormProcesoRecibos.setVisible((this.isVisibilidadCeldaVerFormProcesoRecibos && this.isPermisoVerFormProcesoRecibos));			
			this.jMenuItemAbrirOrderByProcesoRecibos.setVisible((this.isVisibilidadCeldaOrdenProcesoRecibos && this.isPermisoOrdenProcesoRecibos));			
			//this.jMenuItemMostrarOcultarProcesoRecibos.setVisible((this.isVisibilidadCeldaOrdenProcesoRecibos && this.isPermisoOrdenProcesoRecibos));
			this.jMenuItemDetalleAbrirOrderByProcesoRecibos.setVisible((this.isVisibilidadCeldaOrdenProcesoRecibos && this.isPermisoOrdenProcesoRecibos));			
			//this.jMenuItemDetalleMostrarOcultarProcesoRecibos.setVisible((this.isVisibilidadCeldaOrdenProcesoRecibos && this.isPermisoOrdenProcesoRecibos));			
			this.jMenuItemNuevoRelacionesProcesoRecibos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos && this.isPermisoNuevoProcesoRecibos));			
			this.jMenuItemNuevoGuardarCambiosProcesoRecibos.setVisible((this.isVisibilidadCeldaNuevoProcesoRecibos && this.isPermisoNuevoProcesoRecibos && this.isPermisoGuardarCambiosProcesoRecibos));									
			
			if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
			this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemModificarProcesoRecibos.setVisible((this.isVisibilidadCeldaModificarProcesoRecibos && this.isPermisoActualizarProcesoRecibos));	
			this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemActualizarProcesoRecibos.setVisible((this.isVisibilidadCeldaActualizarProcesoRecibos && this.isPermisoActualizarProcesoRecibos));	
			this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemEliminarProcesoRecibos.setVisible((this.isVisibilidadCeldaEliminarProcesoRecibos && this.isPermisoEliminarProcesoRecibos));
			this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemCancelarProcesoRecibos.setVisible(this.isVisibilidadCeldaCancelarProcesoRecibos);				
			}
			
			this.jMenuItemGuardarCambiosProcesoRecibos.setVisible((this.isVisibilidadCeldaGuardarProcesoRecibos && this.isPermisoGuardarCambiosProcesoRecibos));						
			this.jMenuItemGuardarCambiosTablaProcesoRecibos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoRecibos && this.isPermisoGuardarCambiosProcesoRecibos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoRecibos=this.jButtonNuevoProcesoRecibos.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoRecibos=this.jButtonDuplicarProcesoRecibos.isVisible();
			this.isVisibilidadCeldaCopiarProcesoRecibos=this.jButtonCopiarProcesoRecibos.isVisible();
			this.isVisibilidadCeldaVerFormProcesoRecibos=this.jButtonVerFormProcesoRecibos.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoRecibos=this.jButtonAbrirOrderByProcesoRecibos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=this.jButtonNuevoRelacionesProcesoRecibos.isVisible();
			this.isVisibilidadCeldaModificarProcesoRecibos=this.jButtonModificarProcesoRecibos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
			this.isVisibilidadCeldaActualizarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jButtonActualizarProcesoRecibos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jButtonEliminarProcesoRecibos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jButtonCancelarProcesoRecibos.isVisible();
			this.isVisibilidadCeldaGuardarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jButtonGuardarCambiosProcesoRecibos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=this.jButtonGuardarCambiosTablaProcesoRecibos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoRecibos=this.jButtonNuevoToolBarProcesoRecibos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=this.jButtonNuevoRelacionesToolBarProcesoRecibos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
			this.isVisibilidadCeldaModificarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jButtonModificarToolBarProcesoRecibos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jButtonActualizarToolBarProcesoRecibos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jButtonEliminarToolBarProcesoRecibos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jButtonCancelarToolBarProcesoRecibos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoRecibos=this.jButtonGuardarCambiosToolBarProcesoRecibos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=this.jButtonGuardarCambiosTablaToolBarProcesoRecibos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoRecibos=this.jMenuItemNuevoProcesoRecibos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=this.jMenuItemNuevoRelacionesProcesoRecibos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
			this.isVisibilidadCeldaModificarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemModificarProcesoRecibos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemActualizarProcesoRecibos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemEliminarProcesoRecibos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoRecibos=this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemCancelarProcesoRecibos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoRecibos=this.jMenuItemGuardarCambiosProcesoRecibos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=this.jMenuItemGuardarCambiosTablaProcesoRecibos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoRecibos(Boolean esInicializar) {
		if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesorecibosSessionBean.getConGuardarRelaciones()) {
				//if(this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoRecibos();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoRecibos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoRecibos() {
		this.jButtonNuevoProcesoRecibos.setVisible(this.isPermisoNuevoProcesoRecibos);			
		this.jButtonDuplicarProcesoRecibos.setVisible(this.isPermisoDuplicarProcesoRecibos);			
		this.jButtonCopiarProcesoRecibos.setVisible(this.isPermisoCopiarProcesoRecibos);			
		this.jButtonVerFormProcesoRecibos.setVisible(this.isPermisoVerFormProcesoRecibos);			
		
		this.jButtonAbrirOrderByProcesoRecibos.setVisible(this.isPermisoOrdenProcesoRecibos);					
		
		this.jButtonNuevoRelacionesProcesoRecibos.setVisible(this.isPermisoNuevoProcesoRecibos);			
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonModificarProcesoRecibos.setVisible(this.isPermisoActualizarProcesoRecibos);	
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonActualizarProcesoRecibos.setVisible(this.isPermisoActualizarProcesoRecibos);	
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonEliminarProcesoRecibos.setVisible(this.isPermisoEliminarProcesoRecibos);
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonCancelarProcesoRecibos.setVisible(this.isVisibilidadCeldaCancelarProcesoRecibos);						
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonGuardarCambiosProcesoRecibos.setVisible(this.isPermisoGuardarCambiosProcesoRecibos);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoRecibos.setVisible(this.isPermisoActualizarProcesoRecibos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoRecibos() {
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonModificarProcesoRecibos.setVisible(this.isPermisoActualizarProcesoRecibos);	
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonActualizarProcesoRecibos.setVisible(this.isPermisoActualizarProcesoRecibos);	
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonEliminarProcesoRecibos.setVisible(this.isPermisoEliminarProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonCancelarProcesoRecibos.setVisible(this.isVisibilidadCeldaCancelarProcesoRecibos);							
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonGuardarCambiosProcesoRecibos.setVisible((this.isVisibilidadCeldaGuardarProcesoRecibos && this.isPermisoGuardarCambiosProcesoRecibos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoRecibos() {
		if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoRecibos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoRecibos() {
	}
	
	public void jTableDatosProcesoRecibosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoRecibos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesorecibos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_provinciaProcesoRecibosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoprovincia=true;

			idTienePermisoprovincia=this.tienePermisosUsuarioEnPaginaWebProcesoRecibos(ProvinciaConstantesFunciones.CLASSNAME);

			if(idTienePermisoprovincia) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoRecibos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoRecibos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);

				this.provinciaBeanSwingJInternalFrame=new ProvinciaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.provinciaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.provinciaBeanSwingJInternalFrame.getProvinciaLogic().setConnexion(this.procesorecibosLogic.getConnexion());

				if(this.procesorecibos.getid_provincia()!=null) {
					this.provinciaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.provinciaBeanSwingJInternalFrame.setIdActual(this.procesorecibos.getid_provincia());
					this.provinciaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvincia();
				}

				JInternalFrameBase jinternalFrame =this.provinciaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoRecibos=(TitledBorder)this.jScrollPanelDatosProcesoRecibos.getBorder();
				TitledBorder titledBorderprovincia=(TitledBorder)this.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.getBorder();

				titledBorderprovincia.setTitle(titledBorderProcesoRecibos.getTitle() + " -> Provincia");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_provinciaProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getid_provincia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_provincia = "+this.procesorecibos.getid_provincia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadProcesoRecibosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebProcesoRecibos(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoRecibos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoRecibos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.procesorecibosLogic.getConnexion());

				if(this.procesorecibos.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.procesorecibos.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoRecibos=(TitledBorder)this.jScrollPanelDatosProcesoRecibos.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderProcesoRecibos.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.procesorecibos.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_zonaProcesoRecibosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisozona=true;

			idTienePermisozona=this.tienePermisosUsuarioEnPaginaWebProcesoRecibos(ZonaConstantesFunciones.CLASSNAME);

			if(idTienePermisozona) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoRecibos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoRecibos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);

				this.zonaBeanSwingJInternalFrame=new ZonaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.zonaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.zonaBeanSwingJInternalFrame.getZonaLogic().setConnexion(this.procesorecibosLogic.getConnexion());

				if(this.procesorecibos.getid_zona()!=null) {
					this.zonaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.zonaBeanSwingJInternalFrame.setIdActual(this.procesorecibos.getid_zona());
					this.zonaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaZona();
				}

				JInternalFrameBase jinternalFrame =this.zonaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoRecibos=(TitledBorder)this.jScrollPanelDatosProcesoRecibos.getBorder();
				TitledBorder titledBorderzona=(TitledBorder)this.zonaBeanSwingJInternalFrame.jScrollPanelDatosZona.getBorder();

				titledBorderzona.setTitle(titledBorderProcesoRecibos.getTitle() + " -> Zona");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_zonaProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getid_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_zona = "+this.procesorecibos.getid_zona().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_clienteProcesoRecibosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupocliente=true;

			idTienePermisogrupocliente=this.tienePermisosUsuarioEnPaginaWebProcesoRecibos(GrupoClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoRecibos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoRecibos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);

				this.grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoclienteBeanSwingJInternalFrame.getGrupoClienteLogic().setConnexion(this.procesorecibosLogic.getConnexion());

				if(this.procesorecibos.getid_grupo_cliente()!=null) {
					this.grupoclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoclienteBeanSwingJInternalFrame.setIdActual(this.procesorecibos.getid_grupo_cliente());
					this.grupoclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoCliente();
				}

				JInternalFrameBase jinternalFrame =this.grupoclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoRecibos=(TitledBorder)this.jScrollPanelDatosProcesoRecibos.getBorder();
				TitledBorder titledBordergrupocliente=(TitledBorder)this.grupoclienteBeanSwingJInternalFrame.jScrollPanelDatosGrupoCliente.getBorder();

				titledBordergrupocliente.setTitle(titledBorderProcesoRecibos.getTitle() + " -> Grupo Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_clienteProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getid_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_cliente = "+this.procesorecibos.getid_grupo_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorProcesoRecibosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebProcesoRecibos(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoRecibos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoRecibos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.procesorecibosLogic.getConnexion());

				if(this.procesorecibos.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.procesorecibos.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoRecibos=(TitledBorder)this.jScrollPanelDatosProcesoRecibos.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderProcesoRecibos.getTitle() + " -> VENDEDOR");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.procesorecibos.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_provinciaProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getnombre_provincia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_provincia like '%"+this.procesorecibos.getnombre_provincia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_ciudadProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getnombre_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_ciudad like '%"+this.procesorecibos.getnombre_ciudad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_zonaProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getnombre_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_zona like '%"+this.procesorecibos.getnombre_zona()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_grupo_clienteProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getnombre_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_grupo_cliente like '%"+this.procesorecibos.getnombre_grupo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_vendedorProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getnombre_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_vendedor like '%"+this.procesorecibos.getnombre_vendedor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.procesorecibos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.procesorecibos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_asientoProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getcodigo_asiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_asiento like '%"+this.procesorecibos.getcodigo_asiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorProcesoRecibosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.getprocesorecibos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecibos==null) {
						this.procesorecibos = new ProcesoRecibos();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);
				}

				if(this.procesorecibos.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.procesorecibos.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecibos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoRecibosProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoRecibos(false,false);

			this.getProcesoRecibossBusquedaProcesoRecibos();

			this.inicializarActualizarBindingProcesoRecibos(false);

			//if(ProcesoRecibosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoRecibos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCiudadProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoRecibos(false,false);

			this.getProcesoRecibossFK_IdCiudad();

			this.inicializarActualizarBindingProcesoRecibos(false);

			//if(ProcesoRecibosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoRecibos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoClienteProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoRecibos(false,false);

			this.getProcesoRecibossFK_IdGrupoCliente();

			this.inicializarActualizarBindingProcesoRecibos(false);

			//if(ProcesoRecibosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoRecibos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProvinciaProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoRecibos(false,false);

			this.getProcesoRecibossFK_IdProvincia();

			this.inicializarActualizarBindingProcesoRecibos(false);

			//if(ProcesoRecibosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoRecibos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoRecibos(false,false);

			this.getProcesoRecibossFK_IdVendedor();

			this.inicializarActualizarBindingProcesoRecibos(false);

			//if(ProcesoRecibosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoRecibos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdZonaProcesoRecibosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoRecibos(false,false);

			this.getProcesoRecibossFK_IdZona();

			this.inicializarActualizarBindingProcesoRecibos(false);

			//if(ProcesoRecibosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoRecibos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecibosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoRecibos() {
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
			this.jInternalFrameDetalleFormProcesoRecibos.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoRecibos.dispose();
			this.jInternalFrameDetalleFormProcesoRecibos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoRecibos!=null) {
			this.jInternalFrameReporteDinamicoProcesoRecibos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoRecibos.dispose();
			this.jInternalFrameReporteDinamicoProcesoRecibos=null;
		}
		
		if(this.jInternalFrameImportacionProcesoRecibos!=null) {
			this.jInternalFrameImportacionProcesoRecibos.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoRecibos.dispose();
			this.jInternalFrameImportacionProcesoRecibos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoRecibos();
			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoRecibos")) {
				jButtonNuevoProcesoRecibosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoRecibos")) {
				jButtonDuplicarProcesoRecibosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoRecibos")) {
				jButtonCopiarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoRecibos")) {
				jButtonVerFormProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoRecibos")) {
				jButtonNuevoProcesoRecibosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoRecibos")) {
				jButtonDuplicarProcesoRecibosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoRecibos")) {
				jButtonNuevoProcesoRecibosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoRecibos")) {
				jButtonDuplicarProcesoRecibosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoRecibos")) {
				jButtonNuevoProcesoRecibosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoRecibos")) {
				jButtonNuevoProcesoRecibosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoRecibos")) {
				jButtonNuevoProcesoRecibosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoRecibos")) {
				jButtonModificarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoRecibos")) {
				jButtonModificarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoRecibos")) {
				jButtonModificarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoRecibos")) {
				jButtonActualizarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoRecibos")) {
				jButtonActualizarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoRecibos")) {
				jButtonActualizarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoRecibos")) {
				jButtonEliminarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoRecibos")) {
				jButtonEliminarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoRecibos")) {
				jButtonEliminarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoRecibos")) {
				jButtonCancelarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoRecibos")) {
				jButtonCancelarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoRecibos")) {
				jButtonCancelarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoRecibos")) {
				jButtonCerrarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoRecibos")) {
				jButtonCerrarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoRecibos")) {
				jButtonCerrarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoRecibos")) {
				jButtonMostrarOcultarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoRecibos")) {
				jButtonCancelarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoRecibos")) {
				jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoRecibos")) {
				jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoRecibos")) {
				jButtonCopiarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoRecibos")) {
				jButtonVerFormProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoRecibos")) {
				jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoRecibos")) {
				jButtonCopiarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoRecibos")) {
				jButtonVerFormProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoRecibos")) {
				jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoRecibos")) {
				jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoRecibos")) {
				jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoRecibos")) {
				jButtonRecargarInformacionProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoRecibos")) {
				jButtonRecargarInformacionProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoRecibos")) {
				jButtonRecargarInformacionProcesoRecibosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoRecibos")) {
				jButtonAnterioresProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoRecibos")) {
				jButtonAnterioresProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoRecibos")) {
				jButtonAnterioresProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoRecibos")) {
				jButtonSiguientesProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoRecibos")) {
				jButtonSiguientesProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoRecibos")) {
				jButtonSiguientesProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoRecibos") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoRecibos")) {
				jButtonAbrirOrderByProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoRecibos") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoRecibos")) {
				jButtonMostrarOcultarProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoRecibos")) {
				jButtonNuevoGuardarCambiosProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoRecibos")) {
				jButtonNuevoGuardarCambiosProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoRecibos")) {
				jButtonNuevoGuardarCambiosProcesoRecibosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoRecibos")) {
				jButtonCerrarReporteDinamicoProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoRecibos")) {
				jButtonGenerarReporteDinamicoProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoRecibos")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoRecibosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoRecibos")) {
				jButtonCerrarImportacionProcesoRecibosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoRecibos")) {
				
				jButtonGenerarImportacionProcesoRecibosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoRecibos")) {
				
				jButtonAbrirImportacionProcesoRecibosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoRecibos")) {
				jComboBoxTiposAccionesProcesoRecibosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoRecibos")) {
				jComboBoxTiposRelacionesProcesoRecibosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoRecibos")) {
				jComboBoxTiposAccionesProcesoRecibosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoRecibos")) {
				
				jComboBoxTiposSeleccionarProcesoRecibosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoRecibos")) {
				jTextFieldValorCampoGeneralProcesoRecibosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoRecibos")) {
				jButtonAbrirOrderByProcesoRecibosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoRecibos")) {
				jButtonAbrirOrderByProcesoRecibosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoRecibos")) {
				jButtonCerrarOrderByProcesoRecibosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoRecibosBusqueda")) {
				this.jButtonidProcesoRecibosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaProcesoRecibosUpdate")) {
				this.jButtonid_provinciaProcesoRecibosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaProcesoRecibosBusqueda")) {
				this.jButtonid_provinciaProcesoRecibosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadProcesoRecibosUpdate")) {
				this.jButtonid_ciudadProcesoRecibosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadProcesoRecibosBusqueda")) {
				this.jButtonid_ciudadProcesoRecibosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaProcesoRecibosUpdate")) {
				this.jButtonid_zonaProcesoRecibosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaProcesoRecibosBusqueda")) {
				this.jButtonid_zonaProcesoRecibosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteProcesoRecibosUpdate")) {
				this.jButtonid_grupo_clienteProcesoRecibosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteProcesoRecibosBusqueda")) {
				this.jButtonid_grupo_clienteProcesoRecibosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorProcesoRecibosUpdate")) {
				this.jButtonid_vendedorProcesoRecibosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorProcesoRecibosBusqueda")) {
				this.jButtonid_vendedorProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_provinciaProcesoRecibosBusqueda")) {
				this.jButtonnombre_provinciaProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadProcesoRecibosBusqueda")) {
				this.jButtonnombre_ciudadProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaProcesoRecibosBusqueda")) {
				this.jButtonnombre_zonaProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteProcesoRecibosBusqueda")) {
				this.jButtonnombre_grupo_clienteProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorProcesoRecibosBusqueda")) {
				this.jButtonnombre_vendedorProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoRecibosBusqueda")) {
				this.jButtoncodigoProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoProcesoRecibosBusqueda")) {
				this.jButtonnombre_completoProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_asientoProcesoRecibosBusqueda")) {
				this.jButtoncodigo_asientoProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorProcesoRecibosBusqueda")) {
				this.jButtonnumero_mayorProcesoRecibosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoRecibosProcesoRecibos")) {
				this.jButtonBusquedaProcesoRecibosProcesoRecibosActionPerformed(evt);
			}
			
			;
			
			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoRecibos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecibosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				


				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecibos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecibos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoRecibos procesorecibosLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesorecibosLocal=this.procesorecibos;
			} else {
				procesorecibosLocal=this.procesorecibosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
							
				
				


				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecibos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecibos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecibosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosAnterior =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecibosAnterior =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
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
			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			
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
			
			


			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecibosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
								
						
				


				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecibos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecibos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
								
				
				


				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecibos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecibos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecibosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosAnterior =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecibosAnterior =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecibosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosAnterior =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecibosAnterior =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecibosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
							
				
				


				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecibos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecibos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecibosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibosAnterior =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesorecibosAnterior =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
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
			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			
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
			
			


			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecibosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
								
				
				


				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecibos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecibos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecibosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosAnterior =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecibosAnterior =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecibosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecibosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoRecibos")) {
					jCheckBoxSeleccionarTodosProcesoRecibosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoRecibos")) {
					jCheckBoxSeleccionadosProcesoRecibosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoRecibos")) {
					
				}
				
				


				
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecibos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecibos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
												
				
				


				
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecibos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecibos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecibosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecibosAnterior =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesorecibosAnterior =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecibosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
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
			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
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
			
			


			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecibosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecibos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecibos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecibos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecibos);
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
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
				
				


				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecibos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecibos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecibosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecibosAnterior =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecibosAnterior =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoRecibos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoRecibosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoRecibos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesorecibos =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesorecibos =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesorecibos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoRecibos")) {
				
				}
				
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoRecibos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoRecibos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoRecibos")) {
			
			}
			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoRecibos();
			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoRecibos")) {
				jButtonNuevoProcesoRecibosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoRecibos")) {
				jButtonDuplicarProcesoRecibosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoRecibos")) {
				jButtonCopiarProcesoRecibosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoRecibos")) {
				jButtonVerFormProcesoRecibosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoRecibos")) {
				jButtonNuevoProcesoRecibosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoRecibos")) {
				jButtonModificarProcesoRecibosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoRecibos")) {
				jButtonActualizarProcesoRecibosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoRecibos")) {
				jButtonEliminarProcesoRecibosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoRecibos")) {
				jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoRecibos")) {
				jButtonCancelarProcesoRecibosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoRecibos")) {
				jButtonCerrarProcesoRecibosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoRecibos")) {
				jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoRecibos")) {
				jButtonNuevoGuardarCambiosProcesoRecibosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoRecibos")) {
				jButtonAbrirOrderByProcesoRecibosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoRecibos")) {
				jButtonRecargarInformacionProcesoRecibosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoRecibos")) {
				jButtonAnterioresProcesoRecibosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoRecibos")) {
				jButtonSiguientesProcesoRecibosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoRecibosBusqueda")) {
				this.jButtonidProcesoRecibosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaProcesoRecibosUpdate")) {
				this.jButtonid_provinciaProcesoRecibosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaProcesoRecibosBusqueda")) {
				this.jButtonid_provinciaProcesoRecibosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadProcesoRecibosUpdate")) {
				this.jButtonid_ciudadProcesoRecibosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadProcesoRecibosBusqueda")) {
				this.jButtonid_ciudadProcesoRecibosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaProcesoRecibosUpdate")) {
				this.jButtonid_zonaProcesoRecibosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaProcesoRecibosBusqueda")) {
				this.jButtonid_zonaProcesoRecibosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteProcesoRecibosUpdate")) {
				this.jButtonid_grupo_clienteProcesoRecibosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteProcesoRecibosBusqueda")) {
				this.jButtonid_grupo_clienteProcesoRecibosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorProcesoRecibosUpdate")) {
				this.jButtonid_vendedorProcesoRecibosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorProcesoRecibosBusqueda")) {
				this.jButtonid_vendedorProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_provinciaProcesoRecibosBusqueda")) {
				this.jButtonnombre_provinciaProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadProcesoRecibosBusqueda")) {
				this.jButtonnombre_ciudadProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaProcesoRecibosBusqueda")) {
				this.jButtonnombre_zonaProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteProcesoRecibosBusqueda")) {
				this.jButtonnombre_grupo_clienteProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorProcesoRecibosBusqueda")) {
				this.jButtonnombre_vendedorProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoRecibosBusqueda")) {
				this.jButtoncodigoProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoProcesoRecibosBusqueda")) {
				this.jButtonnombre_completoProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_asientoProcesoRecibosBusqueda")) {
				this.jButtoncodigo_asientoProcesoRecibosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorProcesoRecibosBusqueda")) {
				this.jButtonnumero_mayorProcesoRecibosBusquedaActionPerformed(evt);
			}
			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoRecibos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoRecibos")) {
				closingInternalFrameProcesoRecibos();
				
			} else if(sTipo.equals("jButtonCancelarProcesoRecibos")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoRecibos = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoRecibosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoRecibosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoRecibos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoRecibosActionPerformed(null);
			}
			
			ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesorecibos,new Object(),this.procesorecibosParameterGeneral,this.procesorecibosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoRecibos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoRecibos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoRecibos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesorecibos)) {
			if(!esControlTabla) {
				if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);			
				}
				
				if(this.procesorecibosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoRecibos(this.procesorecibos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoRecibos(this.procesorecibosReturnGeneral,this.procesorecibosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesorecibosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoRecibos(classes,this.procesorecibosReturnGeneral,this.procesorecibosBean,false);
					}
						
					if(this.procesorecibosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoRecibos(this.procesorecibosReturnGeneral.getProcesoRecibos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoRecibos(this.procesorecibosReturnGeneral.getProcesoRecibos());	
					}
						
					if(this.procesorecibosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoRecibos(this.procesorecibosReturnGeneral.getProcesoRecibos(),classes);//this.procesorecibosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoRecibos(this.procesorecibos,classes);//this.procesorecibosBean);									
				}
			
				if(ProcesoRecibosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoRecibos(this.procesorecibos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecibos(this.procesorecibos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesorecibosAnterior!=null) {
						this.procesorecibos=this.procesorecibosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesorecibosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesorecibosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesorecibosReturnGeneral.getProcesoRecibos(),procesorecibosLogic.getProcesoReciboss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesorecibosReturnGeneral.getProcesoRecibos(),this.procesoreciboss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoRecibos.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoRecibos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoRecibos();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoRecibos() throws Exception {
		
		ProcesoRecibosModel procesorecibosModel=(ProcesoRecibosModel)this.jTableDatosProcesoRecibos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesorecibosModel.procesoreciboss=this.procesorecibosLogic.getProcesoReciboss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesorecibosModel.procesoreciboss=this.procesoreciboss;
		}
		
		
		((ProcesoRecibosModel) this.jTableDatosProcesoRecibos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoRecibos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesorecibosAnterior(),this.procesorecibosLogic.getProcesoReciboss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesorecibosAnterior(),this.procesoreciboss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoRecibos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoRecibos(ProcesoRecibos procesorecibos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
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
										
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesorecibos,new Object(),generalEntityParameterGeneral,this.procesorecibosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesorecibosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoRecibosConstantesFunciones.getClassesRelationshipsOfProcesoRecibos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoRecibosConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoRecibos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoRecibos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoRecibosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesorecibos,new Object(),generalEntityParameterGeneral,this.procesorecibosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoRecibos(ProcesoRecibosBean procesorecibosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoRecibos(ArrayList<Classe> classes,ProcesoRecibosReturnGeneral procesorecibosReturnGeneral,ProcesoRecibosBean procesorecibosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoRecibos(ProcesoRecibos procesorecibos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesorecibos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoRecibos = new ProcesoRecibosDetalleFormJInternalFrame(jDesktopPane,this.procesorecibosSessionBean.getConGuardarRelaciones(),this.procesorecibosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.setVisible(false);
		this.jInternalFrameDetalleFormProcesoRecibos.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoRecibos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoRecibos.procesorecibosLogic=this.procesorecibosLogic;
		
		this.cargarCombosFrameForeignKeyProcesoRecibos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoRecibos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoRecibos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoRecibos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoRecibos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoRecibos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoRecibos"));
		
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonModificarProcesoRecibos.addActionListener(new ButtonActionListener(this,"ModificarProcesoRecibos"));

		
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonModificarToolBarProcesoRecibos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoRecibos"));
					
		this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemModificarProcesoRecibos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoRecibos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonActualizarProcesoRecibos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoRecibos"));
		
		
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonActualizarToolBarProcesoRecibos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoRecibos"));
						
		this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemActualizarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoRecibos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonEliminarProcesoRecibos.addActionListener (new ButtonActionListener(this,"EliminarProcesoRecibos"));
		
		
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonEliminarToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoRecibos"));
								
		this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemEliminarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoRecibos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonCancelarProcesoRecibos.addActionListener (new ButtonActionListener(this,"CancelarProcesoRecibos"));
		
		
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonCancelarToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoRecibos"));
					
		this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemCancelarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoRecibos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemDetalleCerrarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoRecibos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonGuardarCambiosToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoRecibos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonGuardarCambiosToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoRecibos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoRecibos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonidProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_provinciaProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_provinciaProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_ciudadProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_ciudadProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_zonaProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_zonaProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_grupo_clienteProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_grupo_clienteProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_vendedorProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_vendedorProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_provinciaProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_provinciaProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_ciudadProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_zonaProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_grupo_clienteProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_vendedorProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtoncodigoProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_completoProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtoncodigo_asientoProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asientoProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnumero_mayorProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorProcesoRecibosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoRecibos.jTabbedPaneRelacionesProcesoRecibos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoRecibos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoRecibos"));
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoRecibos"));
		}
		
		this.jTableDatosProcesoRecibos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoRecibos"));
		
		this.jTableDatosProcesoRecibos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoRecibos"));
		
		this.jButtonNuevoProcesoRecibos.addActionListener(new ButtonActionListener(this,"NuevoProcesoRecibos"));
		
		this.jButtonDuplicarProcesoRecibos.addActionListener(new ButtonActionListener(this,"DuplicarProcesoRecibos"));
		
		this.jButtonCopiarProcesoRecibos.addActionListener(new ButtonActionListener(this,"CopiarProcesoRecibos"));
		
		this.jButtonVerFormProcesoRecibos.addActionListener(new ButtonActionListener(this,"VerFormProcesoRecibos"));
		
		
		this.jButtonNuevoToolBarProcesoRecibos.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoRecibos"));
			
		this.jButtonDuplicarToolBarProcesoRecibos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoRecibos"));
			
		this.jMenuItemNuevoProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoRecibos"));
			
		this.jMenuItemDuplicarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoRecibos"));		
		
		
		this.jButtonNuevoRelacionesProcesoRecibos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoRecibos"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoRecibos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoRecibos"));
			
		this.jMenuItemNuevoRelacionesProcesoRecibos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoRecibos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonModificarProcesoRecibos.addActionListener(new ButtonActionListener(this,"ModificarProcesoRecibos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonModificarToolBarProcesoRecibos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoRecibos"));
			
			this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemModificarProcesoRecibos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoRecibos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonActualizarProcesoRecibos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoRecibos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonActualizarToolBarProcesoRecibos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoRecibos"));
				
			this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemActualizarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoRecibos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonEliminarProcesoRecibos.addActionListener (new ButtonActionListener(this,"EliminarProcesoRecibos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonEliminarToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoRecibos"));
						
			this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemEliminarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoRecibos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonCancelarProcesoRecibos.addActionListener (new ButtonActionListener(this,"CancelarProcesoRecibos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonCancelarToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoRecibos"));
			
			this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemCancelarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoRecibos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoRecibos"));		
		
		
		this.jButtonCerrarProcesoRecibos.addActionListener (new ButtonActionListener(this,"CerrarProcesoRecibos"));
		
		
		this.jButtonCerrarToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoRecibos"));
			
		this.jMenuItemCerrarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoRecibos"));
			
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.jMenuItemDetalleCerrarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoRecibos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonGuardarCambiosProcesoRecibos.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoRecibos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.jButtonGuardarCambiosToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoRecibos"));
		}
		
		this.jButtonCopiarToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoRecibos"));
			
		this.jButtonVerFormToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoRecibos"));
		
		this.jMenuItemGuardarCambiosProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoRecibos"));
			
		this.jMenuItemCopiarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoRecibos"));		
		
		this.jMenuItemVerFormProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoRecibos"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoRecibos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoRecibos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoRecibos"));
			
		this.jMenuItemGuardarCambiosTablaProcesoRecibos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoRecibos"));		
		
		
		
		this.jButtonRecargarInformacionProcesoRecibos.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoRecibos"));
					
		this.jButtonRecargarInformacionToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoRecibos"));
		
		this.jMenuItemRecargarInformacionProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoRecibos"));		
		
		
		
		this.jButtonAnterioresProcesoRecibos.addActionListener (new ButtonActionListener(this,"AnterioresProcesoRecibos"));
		
		
		this.jButtonAnterioresToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoRecibos"));
		
		this.jMenuItemAnterioresProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoRecibos"));		
		
		
		this.jButtonSiguientesProcesoRecibos.addActionListener (new ButtonActionListener(this,"SiguientesProcesoRecibos"));
		
		
		this.jButtonSiguientesToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoRecibos"));
			
		this.jMenuItemSiguientesProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoRecibos"));
			
		this.jMenuItemAbrirOrderByProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoRecibos"));
			
		this.jMenuItemMostrarOcultarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoRecibos"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoRecibos"));
			
		this.jMenuItemDetalleMostarOcultarProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoRecibos"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoRecibos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoRecibos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoRecibos"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoRecibos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoRecibos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoRecibos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoRecibos"));

		this.jCheckBoxSeleccionadosProcesoRecibos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoRecibos"));
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoRecibos"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoRecibos.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoRecibos"));
			
		this.jComboBoxTiposAccionesProcesoRecibos.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoRecibos"));
					
		this.jComboBoxTiposSeleccionarProcesoRecibos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoRecibos"));
			
		this.jTextFieldValorCampoGeneralProcesoRecibos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoRecibos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonidProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_provinciaProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_provinciaProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_ciudadProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_ciudadProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_zonaProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_zonaProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_grupo_clienteProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_grupo_clienteProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_vendedorProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_vendedorProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_provinciaProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_provinciaProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_ciudadProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_zonaProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_grupo_clienteProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_vendedorProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtoncodigoProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_completoProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtoncodigo_asientoProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asientoProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnumero_mayorProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorProcesoRecibosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoRecibosProcesoRecibos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoRecibosProcesoRecibos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoRecibos!=null) {
				this.jInternalFrameReporteDinamicoProcesoRecibos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoRecibos"));
				this.jInternalFrameReporteDinamicoProcesoRecibos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoRecibos"));
				this.jInternalFrameReporteDinamicoProcesoRecibos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoRecibos"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoRecibos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoRecibos"));				
			//this.jButtonGenerarReporteDinamicoProcesoRecibos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoRecibos"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoRecibos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoRecibos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoRecibos!=null) {
				this.jInternalFrameImportacionProcesoRecibos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoRecibos"));
				this.jInternalFrameImportacionProcesoRecibos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoRecibos"));
				this.jInternalFrameImportacionProcesoRecibos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoRecibos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoRecibos.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoRecibos"));
			
			this.jButtonAbrirOrderByToolBarProcesoRecibos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoRecibos"));			
			
			if(this.jInternalFrameOrderByProcesoRecibos!=null) {
				this.jInternalFrameOrderByProcesoRecibos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoRecibos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecibos.jTabbedPaneRelacionesProcesoRecibos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoRecibos"));
		
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
            		closingInternalFrameProcesoRecibos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoRecibos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoRecibos = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoRecibosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoRecibosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoRecibos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoRecibosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoRecibos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoRecibosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoRecibos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoRecibos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoRecibosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoRecibosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoRecibosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoRecibos";
		inputMap = this.jButtonNuevoProcesoRecibos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoRecibos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoRecibosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoRecibosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoRecibosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoRecibosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoRecibos";
		inputMap = this.jButtonNuevoRelacionesProcesoRecibos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoRecibos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoRecibosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoRecibos";
		inputMap = this.jButtonModificarProcesoRecibos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoRecibos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoRecibosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoRecibos";
		inputMap = this.jButtonActualizarProcesoRecibos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoRecibos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoRecibosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoRecibos";
		inputMap = this.jButtonEliminarProcesoRecibos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoRecibos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoRecibosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoRecibos";
		inputMap = this.jButtonCancelarProcesoRecibos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoRecibos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoRecibosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoRecibos";
		inputMap = this.jButtonCerrarProcesoRecibos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoRecibos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoRecibosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonGuardarCambiosProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoRecibos";
		inputMap = this.jInternalFrameDetalleFormProcesoRecibos.jButtonGuardarCambiosProcesoRecibos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonGuardarCambiosProcesoRecibos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoRecibosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoRecibos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoRecibosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoRecibos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoRecibosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoRecibos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoRecibosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoRecibos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoRecibosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonidProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_provinciaProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_provinciaProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_ciudadProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_ciudadProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_zonaProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_zonaProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_grupo_clienteProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_grupo_clienteProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoRecibosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_vendedorProcesoRecibosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoRecibosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonid_vendedorProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_provinciaProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_provinciaProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_ciudadProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_zonaProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_grupo_clienteProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_vendedorProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtoncodigoProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnombre_completoProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtoncodigo_asientoProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asientoProcesoRecibosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecibos.jButtonnumero_mayorProcesoRecibosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorProcesoRecibosBusqueda"));
		
		
		this.jButtonBusquedaProcesoRecibosProcesoRecibos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoRecibosProcesoRecibos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoRecibos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoRecibosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoRecibosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoRecibos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoRecibos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoRecibos procesorecibosAux:this.procesorecibosLogic.getProcesoReciboss()) {
					procesorecibosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoRecibos procesorecibosAux:procesoreciboss) {
					procesorecibosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoRecibosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoRecibos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoRecibos procesorecibosAux:this.procesorecibosLogic.getProcesoReciboss()) {
						procesorecibosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoRecibos procesorecibosAux:procesoreciboss) {
						procesorecibosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoRecibos procesorecibosAux:this.procesorecibosLogic.getProcesoReciboss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoRecibos procesorecibosAux:procesoreciboss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoRecibos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoRecibos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoRecibos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoRecibosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoRecibos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoRecibos.getSelectedRows();
			
			ProcesoRecibos procesorecibosLocal=new ProcesoRecibos();
			
			//this.seleccionarTodosProcesoRecibos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesorecibosLocal =(ProcesoRecibos) this.procesorecibosLogic.getProcesoReciboss().toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesorecibosLocal =(ProcesoRecibos) this.procesoreciboss.toArray()[this.jTableDatosProcesoRecibos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesorecibosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoRecibos procesorecibosAux:this.procesorecibosLogic.getProcesoReciboss()) {
						procesorecibosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoRecibos procesorecibosAux:procesoreciboss) {
						procesorecibosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoRecibos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoRecibos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoRecibos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecibos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoRecibosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoRecibosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoRecibosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoRecibos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoRecibos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoRecibos procesorecibosAux:this.procesorecibosLogic.getProcesoReciboss()) {
				
						if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA)) {
							existe=true;
							procesorecibosAux.setnombre_provincia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							procesorecibosAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							procesorecibosAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							procesorecibosAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							procesorecibosAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesorecibosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							procesorecibosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO)) {
							existe=true;
							procesorecibosAux.setcodigo_asiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							procesorecibosAux.setnumero_mayor(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoRecibos procesorecibosAux:procesoreciboss) {
					
						if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA)) {
							existe=true;
							procesorecibosAux.setnombre_provincia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							procesorecibosAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							procesorecibosAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							procesorecibosAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							procesorecibosAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesorecibosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							procesorecibosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO)) {
							existe=true;
							procesorecibosAux.setcodigo_asiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							procesorecibosAux.setnumero_mayor(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoRecibos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoRecibosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoRecibos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoRecibos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoRecibos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoRecibos) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoRecibos(conSplash);
				
					this.generarReporteProcesoRecibossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoRecibos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoRecibossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoRecibos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoRecibossSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoRecibos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoRecibossSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoRecibos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoRecibos();
				
				this.exportarProcesoRecibossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoRecibos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoReciboss();
				//this.importarProcesoReciboss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoRecibos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoRecibos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoRecibossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoRecibos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Recibos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoRecibos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoRecibos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoRecibos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Recibos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoRecibos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoRecibosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoRecibos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoRecibos(conSplash);
					
						//this.actualizarParametrosGeneralProcesoRecibos();
						
						this.generarReporteProcesoAccionProcesoRecibossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoRecibos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoRecibosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso RecibosES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Recibos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoRecibos();
				
						this.actualizarParametrosGeneralProcesoRecibos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesorecibosReturnGeneral=procesorecibosLogic.procesarAccionProcesoRecibossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesorecibosLogic.getProcesoReciboss(),this.procesorecibosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoRecibosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoRecibos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoRecibos();
					
					ProcesoRecibosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoRecibosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoRecibos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxTiposAccionesFormularioProcesoRecibos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoRecibos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoRecibosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoRecibos();
			
			if(this.jInternalFrameDetalleFormProcesoRecibos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();		
			ProcesoRecibos procesorecibos=new ProcesoRecibos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoRecibos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoRecibos.getSelectedItem();
			
			
			
			
			procesorecibossSeleccionados=this.getProcesoRecibossSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesorecibossSeleccionados.size()==1) {
				for(ProcesoRecibos procesorecibosAux:procesorecibossSeleccionados) {
					procesorecibos=procesorecibosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoRecibos();
			
      		//this.finishProcessProcesoRecibos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoRecibosReturnGeneral() throws Exception {
		if(this.procesorecibosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesorecibosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesorecibosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesorecibosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesorecibosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesorecibosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoRecibos(false);
		}
		
		if(this.procesorecibosReturnGeneral.getConRetornoLista() || this.procesorecibosReturnGeneral.getConRetornoObjeto()) {
			if(this.procesorecibosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.procesorecibosLogic.setProcesoReciboss(this.procesorecibosReturnGeneral.getProcesoReciboss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoRecibos(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoRecibos() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoRecibos> getProcesoRecibossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoRecibos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoRecibos procesorecibosAux:procesorecibosLogic.getProcesoReciboss()) {
					if(procesorecibosAux.getIsSelected()) {
						procesorecibossSeleccionados.add(procesorecibosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoRecibos procesorecibosAux:this.procesoreciboss) {
					if(procesorecibosAux.getIsSelected()) {
						procesorecibossSeleccionados.add(procesorecibosAux);				
					}
				}
			}
			
			if(procesorecibossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesorecibossSeleccionados.addAll(this.procesorecibosLogic.getProcesoReciboss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesorecibossSeleccionados.addAll(this.procesoreciboss);				
					}
				}
			}
		} else {
			procesorecibossSeleccionados.add(this.procesorecibos);
		}
		
		return procesorecibossSeleccionados;
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
	
	public void generarReporteProcesoRecibossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoRecibossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoRecibossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoRecibossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoRecibossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Recibos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoRecibossSeleccionados() throws Exception {
		ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();		
		
		procesorecibossSeleccionados=this.getProcesoRecibossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoReciboss("Todos",procesorecibossSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoRecibossSeleccionados() throws Exception {
		ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();		
		
		procesorecibossSeleccionados=this.getProcesoRecibossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoReciboss("Todos",procesorecibossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoRecibossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();
		
		procesorecibossSeleccionados=this.getProcesoRecibossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoReciboss("Todos",procesorecibossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoRecibossSeleccionados() throws Exception {
		ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoRecibos();
		
		
		procesorecibossSeleccionados=this.getProcesoRecibossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoRecibos();
		
		
		//this.generarReporteProcesoReciboss("Todos",procesorecibossSeleccionados ,procesorecibosImplementable,procesorecibosImplementableHome);
	}
	
	public void mostrarImportacionProcesoReciboss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoRecibos();
		
		this.abrirFrameImportacionProcesoRecibos();		
		
			
		//this.generarReporteProcesoReciboss("Todos",procesorecibossSeleccionados ,procesorecibosImplementable,procesorecibosImplementableHome);
	}
	
	public void importarProcesoReciboss() throws Exception {		
	
	}
	
	public void exportarProcesoRecibossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoRecibossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoRecibossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoRecibossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Recibos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoRecibossSeleccionados() throws Exception {
		ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();		
		
		procesorecibossSeleccionados=this.getProcesoRecibossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecibos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoRecibos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoRecibos procesorecibosAux:procesorecibossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoRecibos(procesorecibosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesorecibosAux.setsDetalleGeneralEntityReporte(procesorecibosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecibosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recibos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoRecibos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_IDPROVINCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_IDZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_IDGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoRecibos(ProcesoRecibos procesorecibos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesorecibos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getprovincia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getzona_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getgrupocliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getnombre_provincia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getnombre_ciudad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getnombre_zona();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getnombre_grupo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getnombre_vendedor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getcodigo_asiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecibos.getnumero_mayor();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoRecibossSeleccionados() throws Exception {
		ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();		
		
		procesorecibossSeleccionados=this.getProcesoRecibossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecibos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoReciboss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoRecibos(row);				
				iRow++;
			}				
			
			for(ProcesoRecibos procesorecibosAux:procesorecibossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoRecibos(procesorecibosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecibosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recibos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoRecibossSeleccionados() throws Exception {
		ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();		
		
		procesorecibossSeleccionados=this.getProcesoRecibossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecibos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesoreciboss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesorecibos");
			//elementRoot.appendChild(element);
		
			for(ProcesoRecibos procesorecibosAux:procesorecibossSeleccionados) {
				element = document.createElement("procesorecibos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoRecibos(procesorecibosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecibosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recibos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoRecibos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDPROVINCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoRecibos(ProcesoRecibos procesorecibos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getprovincia_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getzona_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getgrupocliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getnombre_provincia());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getnombre_ciudad());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getnombre_zona());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getnombre_grupo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getnombre_vendedor());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getcodigo_asiento());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecibos.getnumero_mayor());				
	}
	
	public void setFilaDatosExportarXmlProcesoRecibos(ProcesoRecibos procesorecibos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoRecibosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesorecibos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoRecibosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesorecibos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementprovincia_descripcion = document.createElement(ProcesoRecibosConstantesFunciones.IDPROVINCIA);
		elementprovincia_descripcion.appendChild(document.createTextNode(procesorecibos.getprovincia_descripcion()));
		element.appendChild(elementprovincia_descripcion);

		Element elementciudad_descripcion = document.createElement(ProcesoRecibosConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(procesorecibos.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementzona_descripcion = document.createElement(ProcesoRecibosConstantesFunciones.IDZONA);
		elementzona_descripcion.appendChild(document.createTextNode(procesorecibos.getzona_descripcion()));
		element.appendChild(elementzona_descripcion);

		Element elementgrupocliente_descripcion = document.createElement(ProcesoRecibosConstantesFunciones.IDGRUPOCLIENTE);
		elementgrupocliente_descripcion.appendChild(document.createTextNode(procesorecibos.getgrupocliente_descripcion()));
		element.appendChild(elementgrupocliente_descripcion);

		Element elementvendedor_descripcion = document.createElement(ProcesoRecibosConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(procesorecibos.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementnombre_provincia = document.createElement(ProcesoRecibosConstantesFunciones.NOMBREPROVINCIA);
		elementnombre_provincia.appendChild(document.createTextNode(procesorecibos.getnombre_provincia().trim()));
		element.appendChild(elementnombre_provincia);

		Element elementnombre_ciudad = document.createElement(ProcesoRecibosConstantesFunciones.NOMBRECIUDAD);
		elementnombre_ciudad.appendChild(document.createTextNode(procesorecibos.getnombre_ciudad().trim()));
		element.appendChild(elementnombre_ciudad);

		Element elementnombre_zona = document.createElement(ProcesoRecibosConstantesFunciones.NOMBREZONA);
		elementnombre_zona.appendChild(document.createTextNode(procesorecibos.getnombre_zona().trim()));
		element.appendChild(elementnombre_zona);

		Element elementnombre_grupo_cliente = document.createElement(ProcesoRecibosConstantesFunciones.NOMBREGRUPOCLIENTE);
		elementnombre_grupo_cliente.appendChild(document.createTextNode(procesorecibos.getnombre_grupo_cliente().trim()));
		element.appendChild(elementnombre_grupo_cliente);

		Element elementnombre_vendedor = document.createElement(ProcesoRecibosConstantesFunciones.NOMBREVENDEDOR);
		elementnombre_vendedor.appendChild(document.createTextNode(procesorecibos.getnombre_vendedor().trim()));
		element.appendChild(elementnombre_vendedor);

		Element elementcodigo = document.createElement(ProcesoRecibosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(procesorecibos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(ProcesoRecibosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(procesorecibos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementcodigo_asiento = document.createElement(ProcesoRecibosConstantesFunciones.CODIGOASIENTO);
		elementcodigo_asiento.appendChild(document.createTextNode(procesorecibos.getcodigo_asiento().trim()));
		element.appendChild(elementcodigo_asiento);

		Element elementnumero_mayor = document.createElement(ProcesoRecibosConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(procesorecibos.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);
	}
	
	public void generarReporteGroupGenericoProcesoRecibossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoRecibos> procesorecibossSeleccionados=new ArrayList<ProcesoRecibos>();
		
		procesorecibossSeleccionados=this.getProcesoRecibossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoRecibos(procesorecibossSeleccionados);
		
		this.generarReporteProcesoReciboss("Todos",procesorecibossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoRecibos(ArrayList<ProcesoRecibos> procesorecibossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoRecibos procesorecibosAux:procesorecibossSeleccionados) {
				procesorecibosAux.setsDetalleGeneralEntityReporte(procesorecibosAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_IDPROVINCIA)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getprovincia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_IDZONA)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getzona_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_IDGRUPOCLIENTE)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getgrupocliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getnombre_provincia());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getnombre_ciudad());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getnombre_zona());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getnombre_grupo_cliente());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getnombre_vendedor());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getcodigo_asiento());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					procesorecibosAux.setsDescripcionGeneralEntityReporte1(procesorecibosAux.getnumero_mayor());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecibosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoRecibos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoRecibos=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoRecibos=false;
			this.isVisibilidadCeldaActualizarProcesoRecibos=false;
			this.isVisibilidadCeldaEliminarProcesoRecibos=false;
			this.isVisibilidadCeldaCancelarProcesoRecibos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecibos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecibos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoRecibos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=false;
			this.isVisibilidadCeldaModificarProcesoRecibos=false;
			this.isVisibilidadCeldaActualizarProcesoRecibos=true;
			this.isVisibilidadCeldaEliminarProcesoRecibos=false;
			this.isVisibilidadCeldaCancelarProcesoRecibos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecibos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecibos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoRecibos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=false;
			this.isVisibilidadCeldaModificarProcesoRecibos=false;
			this.isVisibilidadCeldaActualizarProcesoRecibos=true;
			this.isVisibilidadCeldaEliminarProcesoRecibos=true;
			this.isVisibilidadCeldaCancelarProcesoRecibos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecibos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecibos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoRecibos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=false;
			this.isVisibilidadCeldaModificarProcesoRecibos=false;
			this.isVisibilidadCeldaActualizarProcesoRecibos=true;
			this.isVisibilidadCeldaEliminarProcesoRecibos=false;
			this.isVisibilidadCeldaCancelarProcesoRecibos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecibos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecibos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoRecibos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=true;
			this.isVisibilidadCeldaModificarProcesoRecibos=false;
			this.isVisibilidadCeldaActualizarProcesoRecibos=false;
			this.isVisibilidadCeldaEliminarProcesoRecibos=false;
			this.isVisibilidadCeldaCancelarProcesoRecibos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecibos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecibos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoRecibos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=false;
			this.isVisibilidadCeldaActualizarProcesoRecibos=false;
			this.isVisibilidadCeldaEliminarProcesoRecibos=false;
			this.isVisibilidadCeldaCancelarProcesoRecibos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecibos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecibos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoRecibos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=false;
			this.isVisibilidadCeldaModificarProcesoRecibos=true;
			this.isVisibilidadCeldaActualizarProcesoRecibos=false;
			this.isVisibilidadCeldaEliminarProcesoRecibos=false;
			this.isVisibilidadCeldaCancelarProcesoRecibos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecibos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecibos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoRecibosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoRecibos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=true;
		} else {
			this.actualizarEstadoPanelsProcesoRecibos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoRecibos=false;
			//this.isVisibilidadCeldaVerFormProcesoRecibos=false;
			this.isVisibilidadCeldaDuplicarProcesoRecibos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesorecibosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoRecibos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesorecibosSessionBean.getEsGuardarRelacionado()) {
			if(!procesorecibosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=false;												
			}
			
			this.jButtonCerrarProcesoRecibos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=false;
		}
		
		if(!this.permiteMantenimiento(this.procesorecibos)) {
			this.isVisibilidadCeldaActualizarProcesoRecibos=false;
			this.isVisibilidadCeldaEliminarProcesoRecibos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoRecibos=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoRecibos=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoRecibos=false;
		//this.isVisibilidadCeldaModificarProcesoRecibos=true;
		this.isVisibilidadCeldaActualizarProcesoRecibos=false;
		this.isVisibilidadCeldaEliminarProcesoRecibos=false;
		//this.isVisibilidadCeldaCancelarProcesoRecibos=true;			
		this.isVisibilidadCeldaGuardarProcesoRecibos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoRecibos() {
	}
	
	public void actualizarEstadoPanelsProcesoRecibos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoRecibos!=null) {
				this.jScrollPanelDatosEdicionProcesoRecibos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecibos!=null) {
				this.jTabbedPaneBusquedasProcesoRecibos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoRecibos!=null) {
				this.jScrollPanelDatosProcesoRecibos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoRecibos!=null) {
				this.jPanelPaginacionProcesoRecibos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoRecibos!=null) {
				this.jPanelParametrosReportesProcesoRecibos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoRecibos!=null) {
				this.jScrollPanelDatosEdicionProcesoRecibos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecibos!=null) {
				this.jTabbedPaneBusquedasProcesoRecibos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoRecibos!=null) {
				this.jScrollPanelDatosProcesoRecibos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoRecibos!=null) {
				this.jPanelPaginacionProcesoRecibos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoRecibos!=null) {
				this.jPanelParametrosReportesProcesoRecibos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoRecibos!=null) {
				this.jScrollPanelDatosEdicionProcesoRecibos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecibos!=null) {
				this.jTabbedPaneBusquedasProcesoRecibos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoRecibos!=null) {
				this.jScrollPanelDatosProcesoRecibos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoRecibos!=null) {
				this.jPanelPaginacionProcesoRecibos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoRecibos!=null) {
				this.jPanelParametrosReportesProcesoRecibos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoRecibos!=null) {
				this.jScrollPanelDatosEdicionProcesoRecibos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecibos!=null) {
				this.jTabbedPaneBusquedasProcesoRecibos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoRecibos!=null) {
				this.jScrollPanelDatosProcesoRecibos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoRecibos!=null) {
				this.jPanelPaginacionProcesoRecibos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoRecibos!=null) {
				this.jPanelParametrosReportesProcesoRecibos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoRecibos!=null) {
				this.jScrollPanelDatosEdicionProcesoRecibos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecibos!=null) {
				this.jTabbedPaneBusquedasProcesoRecibos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoRecibos!=null) {
				this.jScrollPanelDatosProcesoRecibos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoRecibos!=null) {
				this.jPanelPaginacionProcesoRecibos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoRecibos!=null) {
				this.jPanelParametrosReportesProcesoRecibos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoRecibos!=null) {
				this.jScrollPanelDatosEdicionProcesoRecibos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecibos!=null) {
				this.jTabbedPaneBusquedasProcesoRecibos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoRecibos!=null) {
				this.jScrollPanelDatosProcesoRecibos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoRecibos!=null) {
				this.jPanelPaginacionProcesoRecibos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoRecibos!=null) {
				this.jPanelParametrosReportesProcesoRecibos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoRecibos!=null) {
				this.jScrollPanelDatosEdicionProcesoRecibos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecibos!=null) {
				this.jTabbedPaneBusquedasProcesoRecibos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoRecibos!=null) {
				this.jScrollPanelDatosProcesoRecibos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoRecibos!=null) {
				this.jPanelPaginacionProcesoRecibos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoRecibos!=null) {
				this.jPanelParametrosReportesProcesoRecibos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoRecibos!=null) {
					this.jTabbedPaneBusquedasProcesoRecibos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoRecibos!=null) {
				this.jPanelParametrosReportesProcesoRecibos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecibos!=null) {
				this.jTabbedPaneBusquedasProcesoRecibos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoRecibos!=null) {
				this.jPanelParametrosReportesProcesoRecibos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaProvincia(Boolean isParaProvincia){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProvinciaNegation=!isParaProvincia;

			this.isVisibilidadBusquedaProcesoRecibos=isParaProvincia;
			if(!this.isVisibilidadBusquedaProcesoRecibos) {this.jTabbedPaneBusquedasProcesoRecibos.remove(jPanelBusquedaProcesoRecibosProcesoRecibos);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadBusquedaProcesoRecibos=isParaCiudad;
			if(!this.isVisibilidadBusquedaProcesoRecibos) {this.jTabbedPaneBusquedasProcesoRecibos.remove(jPanelBusquedaProcesoRecibosProcesoRecibos);}
		}
		
	}

	public void setVisibilidadBusquedasParaZona(Boolean isParaZona){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaZonaNegation=!isParaZona;

			this.isVisibilidadBusquedaProcesoRecibos=isParaZona;
			if(!this.isVisibilidadBusquedaProcesoRecibos) {this.jTabbedPaneBusquedasProcesoRecibos.remove(jPanelBusquedaProcesoRecibosProcesoRecibos);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoCliente(Boolean isParaGrupoCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoClienteNegation=!isParaGrupoCliente;

			this.isVisibilidadBusquedaProcesoRecibos=isParaGrupoCliente;
			if(!this.isVisibilidadBusquedaProcesoRecibos) {this.jTabbedPaneBusquedasProcesoRecibos.remove(jPanelBusquedaProcesoRecibosProcesoRecibos);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadBusquedaProcesoRecibos=isParaVendedor;
			if(!this.isVisibilidadBusquedaProcesoRecibos) {this.jTabbedPaneBusquedasProcesoRecibos.remove(jPanelBusquedaProcesoRecibosProcesoRecibos);}
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
			
			this.inicializarActualizarBindingTablaProcesoRecibos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoRecibos() {
		this.updateBorderResaltarBusquedasFormularioProcesoRecibos();
		this.updateVisibilidadBusquedasFormularioProcesoRecibos();
		this.updateHabilitarBusquedasFormularioProcesoRecibos();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoRecibos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoRecibos.getComponents().length>0) {
	

		if(this.procesorecibosConstantesFunciones.resaltarBusquedaProcesoRecibosProcesoRecibos!=null) {
			index= this.jTabbedPaneBusquedasProcesoRecibos.indexOfComponent(this.jPanelBusquedaProcesoRecibosProcesoRecibos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoRecibos.getComponent(index);
				jPanel.setBorder(this.procesorecibosConstantesFunciones.resaltarBusquedaProcesoRecibosProcesoRecibos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoRecibos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoRecibos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoRecibos.indexOfComponent(this.jPanelBusquedaProcesoRecibosProcesoRecibos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoRecibos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesorecibosConstantesFunciones.mostrarBusquedaProcesoRecibosProcesoRecibos);
			if(!this.procesorecibosConstantesFunciones.mostrarBusquedaProcesoRecibosProcesoRecibos && index>-1) {
				this.jTabbedPaneBusquedasProcesoRecibos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoRecibos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoRecibos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoRecibos.indexOfComponent(this.jPanelBusquedaProcesoRecibosProcesoRecibos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoRecibos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesorecibosConstantesFunciones.activarBusquedaProcesoRecibosProcesoRecibos);
				this.jTabbedPaneBusquedasProcesoRecibos.setEnabledAt(index,this.procesorecibosConstantesFunciones.activarBusquedaProcesoRecibosProcesoRecibos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoRecibos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoRecibos")) {
			index= this.jTabbedPaneBusquedasProcesoRecibos.indexOfComponent(this.jPanelBusquedaProcesoRecibosProcesoRecibos);

			this.jTabbedPaneBusquedasProcesoRecibos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoRecibos.getComponent(index);

			this.procesorecibosConstantesFunciones.setResaltarBusquedaProcesoRecibosProcesoRecibos(resaltar);

			jPanel.setBorder(this.procesorecibosConstantesFunciones.resaltarBusquedaProcesoRecibosProcesoRecibos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoRecibos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoRecibos() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoRecibos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoRecibos();
		this.updateVisibilidadResaltarControlesFormularioProcesoRecibos();
		this.updateHabilitarResaltarControlesFormularioProcesoRecibos();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoRecibos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoRecibos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesorecibosConstantesFunciones.resaltaridProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jLabelidProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltaridProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarid_provinciaProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarid_provinciaProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarid_ciudadProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarid_ciudadProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarid_zonaProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarid_zonaProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarid_grupo_clienteProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarid_grupo_clienteProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarid_vendedorProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarid_vendedorProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarnombre_provinciaProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_provinciaProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarnombre_provinciaProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarnombre_ciudadProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_ciudadProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarnombre_ciudadProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarnombre_zonaProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldnombre_zonaProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarnombre_zonaProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarnombre_grupo_clienteProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_grupo_clienteProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarnombre_grupo_clienteProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarnombre_vendedorProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_vendedorProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarnombre_vendedorProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarcodigoProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldcodigoProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarcodigoProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarnombre_completoProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_completoProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarnombre_completoProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarcodigo_asientoProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jTextAreacodigo_asientoProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarcodigo_asientoProcesoRecibos);}
		if(this.procesorecibosConstantesFunciones.resaltarnumero_mayorProcesoRecibos!=null && this.jInternalFrameDetalleFormProcesoRecibos!=null) {this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanumero_mayorProcesoRecibos.setBorder(this.procesorecibosConstantesFunciones.resaltarnumero_mayorProcesoRecibos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoRecibos() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoRecibos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
	
		//this.jInternalFrameDetalleFormProcesoRecibos.jLabelidProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostraridProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelidProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostraridProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarid_provinciaProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelid_provinciaProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarid_provinciaProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarid_ciudadProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelid_ciudadProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarid_ciudadProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarid_zonaProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelid_zonaProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarid_zonaProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarid_grupo_clienteProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelid_grupo_clienteProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarid_grupo_clienteProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarid_vendedorProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelid_vendedorProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarid_vendedorProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_provinciaProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnombre_provinciaProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelnombre_provinciaProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnombre_provinciaProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_ciudadProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnombre_ciudadProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelnombre_ciudadProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnombre_ciudadProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldnombre_zonaProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnombre_zonaProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelnombre_zonaProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnombre_zonaProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_grupo_clienteProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnombre_grupo_clienteProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelnombre_grupo_clienteProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnombre_grupo_clienteProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_vendedorProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnombre_vendedorProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelnombre_vendedorProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnombre_vendedorProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldcodigoProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarcodigoProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelcodigoProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarcodigoProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_completoProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnombre_completoProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelnombre_completoProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnombre_completoProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jTextAreacodigo_asientoProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarcodigo_asientoProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelcodigo_asientoProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarcodigo_asientoProcesoRecibos);
		//this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanumero_mayorProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnumero_mayorProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jPanelnumero_mayorProcesoRecibos.setVisible(this.procesorecibosConstantesFunciones.mostrarnumero_mayorProcesoRecibos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoRecibos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoRecibos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoRecibos!=null) {
	
		this.jInternalFrameDetalleFormProcesoRecibos.jLabelidProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activaridProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_provinciaProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarid_provinciaProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_ciudadProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarid_ciudadProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_zonaProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarid_zonaProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_grupo_clienteProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarid_grupo_clienteProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jComboBoxid_vendedorProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarid_vendedorProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_provinciaProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarnombre_provinciaProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_ciudadProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarnombre_ciudadProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldnombre_zonaProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarnombre_zonaProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_grupo_clienteProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarnombre_grupo_clienteProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_vendedorProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarnombre_vendedorProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextFieldcodigoProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarcodigoProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanombre_completoProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarnombre_completoProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreacodigo_asientoProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarcodigo_asientoProcesoRecibos);
		this.jInternalFrameDetalleFormProcesoRecibos.jTextAreanumero_mayorProcesoRecibos.setEnabled(this.procesorecibosConstantesFunciones.activarnumero_mayorProcesoRecibos);
		}
	}
	
		
}