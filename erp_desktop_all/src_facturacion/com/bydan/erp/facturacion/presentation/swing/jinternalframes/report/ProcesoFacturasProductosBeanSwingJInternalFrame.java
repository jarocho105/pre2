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

//import com.bydan.erp.facturacion.util.ProcesoFacturasProductosConstantesFunciones;
import com.bydan.erp.facturacion.util.report.ProcesoFacturasProductosParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.ProcesoFacturasProductosParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.ProcesoFacturasProductosBean;
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
public class ProcesoFacturasProductosBeanSwingJInternalFrame extends ProcesoFacturasProductosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoFacturasProductosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoFacturasProductos> procesofacturasproductosValidator = new ClassValidator<ProcesoFacturasProductos>(ProcesoFacturasProductos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoFacturasProductos procesofacturasproductos;	
	public ProcesoFacturasProductos procesofacturasproductosAux;
	public ProcesoFacturasProductos procesofacturasproductosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoFacturasProductos procesofacturasproductosTotales;
	public Long idProcesoFacturasProductosActual;
	public Long iIdNuevoProcesoFacturasProductos=0L;
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
	
	public Boolean isPermisoTodoProcesoFacturasProductos;
	public Boolean isPermisoNuevoProcesoFacturasProductos;
	public Boolean isPermisoActualizarProcesoFacturasProductos;
	public Boolean isPermisoActualizarOriginalProcesoFacturasProductos;
	public Boolean isPermisoEliminarProcesoFacturasProductos;
	public Boolean isPermisoGuardarCambiosProcesoFacturasProductos;
	public Boolean isPermisoConsultaProcesoFacturasProductos;
	public Boolean isPermisoBusquedaProcesoFacturasProductos;
	public Boolean isPermisoReporteProcesoFacturasProductos;
	public Boolean isPermisoPaginacionMedioProcesoFacturasProductos;
	public Boolean isPermisoPaginacionAltoProcesoFacturasProductos;
	public Boolean isPermisoPaginacionTodoProcesoFacturasProductos;
	public Boolean isPermisoCopiarProcesoFacturasProductos;
	public Boolean isPermisoVerFormProcesoFacturasProductos;
	public Boolean isPermisoDuplicarProcesoFacturasProductos;
	public Boolean isPermisoOrdenProcesoFacturasProductos;
	
	
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
	
	public ProcesoFacturasProductosParameterReturnGeneral procesofacturasproductosReturnGeneral;
	public ProcesoFacturasProductosParameterReturnGeneral procesofacturasproductosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoFacturasProductos=false;
	public Boolean esParaAccionDesdeFormularioProcesoFacturasProductos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoFacturasProductosSessionBeanAdditional procesofacturasproductosSessionBeanAdditional=null;
	
	public ProcesoFacturasProductosSessionBeanAdditional getProcesoFacturasProductosSessionBeanAdditional() {
		return this.procesofacturasproductosSessionBeanAdditional;
	}
	
	public void setProcesoFacturasProductosSessionBeanAdditional(ProcesoFacturasProductosSessionBeanAdditional procesofacturasproductosSessionBeanAdditional) {
		try {
			this.procesofacturasproductosSessionBeanAdditional=procesofacturasproductosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoFacturasProductosBeanSwingJInternalFrameAdditional procesofacturasproductosBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoFacturasProductosBeanSwingJInternalFrame
	
	public ProcesoFacturasProductosBeanSwingJInternalFrameAdditional getProcesoFacturasProductosBeanSwingJInternalFrameAdditional() {
		return this.procesofacturasproductosBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoFacturasProductosBeanSwingJInternalFrameAdditional(ProcesoFacturasProductosBeanSwingJInternalFrameAdditional procesofacturasproductosBeanSwingJInternalFrameAdditional) {
		try {
			this.procesofacturasproductosBeanSwingJInternalFrameAdditional=procesofacturasproductosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoFacturasProductosLogic procesofacturasproductosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoFacturasProductos procesofacturasproductosBean;
	public ProcesoFacturasProductosConstantesFunciones procesofacturasproductosConstantesFunciones;
	//public ProcesoFacturasProductosParameterReturnGeneral procesofacturasproductosReturnGeneral;
	
	//FK
	
	public CiudadLogic ciudadLogic;
	public ZonaLogic zonaLogic;
	public GrupoClienteLogic grupoclienteLogic;
	public VendedorLogic vendedorLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoFacturasProductos> procesofacturasproductoss;	
	//public List<ProcesoFacturasProductos> procesofacturasproductossEliminados;
	//public List<ProcesoFacturasProductos> procesofacturasproductossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoFacturasProductos=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoFacturasProductos=true;
	public Boolean isVisibilidadCeldaCopiarProcesoFacturasProductos=true;
	public Boolean isVisibilidadCeldaVerFormProcesoFacturasProductos=true;
	public Boolean isVisibilidadCeldaOrdenProcesoFacturasProductos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=false;
	public Boolean isVisibilidadCeldaModificarProcesoFacturasProductos=false;
	public Boolean isVisibilidadCeldaActualizarProcesoFacturasProductos=false;
	public Boolean isVisibilidadCeldaEliminarProcesoFacturasProductos=false;
	public Boolean isVisibilidadCeldaCancelarProcesoFacturasProductos=false;
	public Boolean isVisibilidadCeldaGuardarProcesoFacturasProductos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoFacturasProductos=false;
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdGrupoCliente=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	public Boolean isVisibilidadFK_IdZona=false;
	
	public Long getiIdNuevoProcesoFacturasProductos() {
		return this.iIdNuevoProcesoFacturasProductos;
	}

	public void setiIdNuevoProcesoFacturasProductos(Long iIdNuevoProcesoFacturasProductos) {
		this.iIdNuevoProcesoFacturasProductos = iIdNuevoProcesoFacturasProductos;
	}
	
	public Long getidProcesoFacturasProductosActual() {
		return this.idProcesoFacturasProductosActual;
	}

	public void setidProcesoFacturasProductosActual(Long idProcesoFacturasProductosActual) {
		this.idProcesoFacturasProductosActual = idProcesoFacturasProductosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoFacturasProductos getprocesofacturasproductos() {
		return this.procesofacturasproductos;
	}

	public void setprocesofacturasproductos(ProcesoFacturasProductos procesofacturasproductos) {
		this.procesofacturasproductos = procesofacturasproductos;
	}
	
	public ProcesoFacturasProductos getprocesofacturasproductosAux() {
		return this.procesofacturasproductosAux;
	}

	public void setprocesofacturasproductosAux(ProcesoFacturasProductos procesofacturasproductosAux) {
		this.procesofacturasproductosAux = procesofacturasproductosAux;
	}				
	
	public ProcesoFacturasProductos getprocesofacturasproductosAnterior() {
		return this.procesofacturasproductosAnterior;
	}

	public void setprocesofacturasproductosAnterior(ProcesoFacturasProductos procesofacturasproductosAnterior) {
		this.procesofacturasproductosAnterior = procesofacturasproductosAnterior;
	}	
	
	public ProcesoFacturasProductos getprocesofacturasproductosTotales() {
		return this.procesofacturasproductosTotales;
	}

	public void setprocesofacturasproductosTotales(ProcesoFacturasProductos procesofacturasproductosTotales) {
		this.procesofacturasproductosTotales = procesofacturasproductosTotales;
	}	
	
	public ProcesoFacturasProductos getprocesofacturasproductosBean() {
		return this.procesofacturasproductosBean;
	}

	public void setprocesofacturasproductosBean(ProcesoFacturasProductos procesofacturasproductosBean) {
		this.procesofacturasproductosBean = procesofacturasproductosBean;
	}	
	
	public ProcesoFacturasProductosParameterReturnGeneral getprocesofacturasproductosReturnGeneral() {
		return this.procesofacturasproductosReturnGeneral;
	}

	public void setprocesofacturasproductosReturnGeneral(ProcesoFacturasProductosParameterReturnGeneral procesofacturasproductosReturnGeneral) {
		this.procesofacturasproductosReturnGeneral = procesofacturasproductosReturnGeneral;
	}	
	
	
	public Long id_ciudadBusquedaProcesoFacturasProductos=-1L;

	public Long getid_ciudadBusquedaProcesoFacturasProductos() {
		return this.id_ciudadBusquedaProcesoFacturasProductos;
	}

	public void setid_ciudadBusquedaProcesoFacturasProductos(Long id_ciudadBusquedaProcesoFacturasProductos) {
		this.id_ciudadBusquedaProcesoFacturasProductos = id_ciudadBusquedaProcesoFacturasProductos;
	}

;
	public Long id_zonaBusquedaProcesoFacturasProductos=-1L;

	public Long getid_zonaBusquedaProcesoFacturasProductos() {
		return this.id_zonaBusquedaProcesoFacturasProductos;
	}

	public void setid_zonaBusquedaProcesoFacturasProductos(Long id_zonaBusquedaProcesoFacturasProductos) {
		this.id_zonaBusquedaProcesoFacturasProductos = id_zonaBusquedaProcesoFacturasProductos;
	}

;
	public Long id_grupo_clienteBusquedaProcesoFacturasProductos=-1L;

	public Long getid_grupo_clienteBusquedaProcesoFacturasProductos() {
		return this.id_grupo_clienteBusquedaProcesoFacturasProductos;
	}

	public void setid_grupo_clienteBusquedaProcesoFacturasProductos(Long id_grupo_clienteBusquedaProcesoFacturasProductos) {
		this.id_grupo_clienteBusquedaProcesoFacturasProductos = id_grupo_clienteBusquedaProcesoFacturasProductos;
	}

;
	public Long id_vendedorBusquedaProcesoFacturasProductos=-1L;

	public Long getid_vendedorBusquedaProcesoFacturasProductos() {
		return this.id_vendedorBusquedaProcesoFacturasProductos;
	}

	public void setid_vendedorBusquedaProcesoFacturasProductos(Long id_vendedorBusquedaProcesoFacturasProductos) {
		this.id_vendedorBusquedaProcesoFacturasProductos = id_vendedorBusquedaProcesoFacturasProductos;
	}

;
	public String codigoBusquedaProcesoFacturasProductos="";

	public String getcodigoBusquedaProcesoFacturasProductos() {
		return this.codigoBusquedaProcesoFacturasProductos;
	}

	public void setcodigoBusquedaProcesoFacturasProductos(String codigoBusquedaProcesoFacturasProductos) {
		this.codigoBusquedaProcesoFacturasProductos = codigoBusquedaProcesoFacturasProductos;
	}

;
	public String nombre_completoBusquedaProcesoFacturasProductos="";

	public String getnombre_completoBusquedaProcesoFacturasProductos() {
		return this.nombre_completoBusquedaProcesoFacturasProductos;
	}

	public void setnombre_completoBusquedaProcesoFacturasProductos(String nombre_completoBusquedaProcesoFacturasProductos) {
		this.nombre_completoBusquedaProcesoFacturasProductos = nombre_completoBusquedaProcesoFacturasProductos;
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
	
	
	public ProcesoFacturasProductosLogic getProcesoFacturasProductosLogic()	{		
		return procesofacturasproductosLogic;
	}

	public void setProcesoFacturasProductosLogic(ProcesoFacturasProductosLogic procesofacturasproductosLogic) {
		this.procesofacturasproductosLogic = procesofacturasproductosLogic;
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
	
	public Boolean getIsEsNuevoProcesoFacturasProductos() {
		return isEsNuevoProcesoFacturasProductos;
	}

	public void setIsEsNuevoProcesoFacturasProductos(Boolean isEsNuevoProcesoFacturasProductos) {
		this.isEsNuevoProcesoFacturasProductos = isEsNuevoProcesoFacturasProductos;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoFacturasProductos() {
		return esParaAccionDesdeFormularioProcesoFacturasProductos;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoFacturasProductos(Boolean esParaAccionDesdeFormularioProcesoFacturasProductos) {
		this.esParaAccionDesdeFormularioProcesoFacturasProductos = esParaAccionDesdeFormularioProcesoFacturasProductos;
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

			if(this.procesofacturasproductosSessionBean==null) {
				this.procesofacturasproductosSessionBean=new ProcesoFacturasProductosSessionBean();
			}

			if(!this.procesofacturasproductosSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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
					ciudadLogic.getEntityWithConnection(procesofacturasproductosSessionBean.getlidCiudadActual());
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

			if(this.procesofacturasproductosSessionBean==null) {
				this.procesofacturasproductosSessionBean=new ProcesoFacturasProductosSessionBean();
			}

			if(!this.procesofacturasproductosSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
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
					zonaLogic.getEntityWithConnection(procesofacturasproductosSessionBean.getlidZonaActual());
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

			if(this.procesofacturasproductosSessionBean==null) {
				this.procesofacturasproductosSessionBean=new ProcesoFacturasProductosSessionBean();
			}

			if(!this.procesofacturasproductosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
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
					grupoclienteLogic.getEntityWithConnection(procesofacturasproductosSessionBean.getlidGrupoClienteActual());
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

			if(this.procesofacturasproductosSessionBean==null) {
				this.procesofacturasproductosSessionBean=new ProcesoFacturasProductosSessionBean();
			}

			if(!this.procesofacturasproductosSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
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
					vendedorLogic.getEntityWithConnection(procesofacturasproductosSessionBean.getlidVendedorActual());
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

					if(this.procesofacturasproductos!=null) {
						this.procesofacturasproductos.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
						this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadProcesoFacturasProductos.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoFacturasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos!=null) {
						jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos!=null) {
							//jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedItem(ciudadTemp);
							if(jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.getItemCount()>0) {
								jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedIndex(0);
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
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadProcesoFacturasProductosGenerico)throws Exception
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
				jComboBoxid_ciudadProcesoFacturasProductosGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadProcesoFacturasProductosGenerico!=null && jComboBoxid_ciudadProcesoFacturasProductosGenerico.getItemCount()>0) {
					jComboBoxid_ciudadProcesoFacturasProductosGenerico.setSelectedIndex(0);
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

					if(this.procesofacturasproductos!=null) {
						this.procesofacturasproductos.setZona(zonaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
						this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.setSelectedItem(zonaTemp);
					}
				} else {
					//jComboBoxid_zonaProcesoFacturasProductos.setSelectedItem(zonaTemp);
					if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoFacturasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(zonaTemp!=null && jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos!=null) {
						jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedItem(zonaTemp);
					} else {
						if(jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos!=null) {
							//jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedItem(zonaTemp);
							if(jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.getItemCount()>0) {
								jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedIndex(0);
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
	public void setActualZonaForeignKeyGenerico(Long idZonaSeleccionado,JComboBox jComboBoxid_zonaProcesoFacturasProductosGenerico)throws Exception
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
				jComboBoxid_zonaProcesoFacturasProductosGenerico.setSelectedItem(zonaTemp);
			} else {
				if(jComboBoxid_zonaProcesoFacturasProductosGenerico!=null && jComboBoxid_zonaProcesoFacturasProductosGenerico.getItemCount()>0) {
					jComboBoxid_zonaProcesoFacturasProductosGenerico.setSelectedIndex(0);
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

					if(this.procesofacturasproductos!=null) {
						this.procesofacturasproductos.setGrupoCliente(grupoclienteTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
						this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.setSelectedItem(grupoclienteTemp);
					}
				} else {
					//jComboBoxid_grupo_clienteProcesoFacturasProductos.setSelectedItem(grupoclienteTemp);
					if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoFacturasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoclienteTemp!=null && jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos!=null) {
						jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedItem(grupoclienteTemp);
					} else {
						if(jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos!=null) {
							//jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedItem(grupoclienteTemp);
							if(jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.getItemCount()>0) {
								jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedIndex(0);
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
	public void setActualGrupoClienteForeignKeyGenerico(Long idGrupoClienteSeleccionado,JComboBox jComboBoxid_grupo_clienteProcesoFacturasProductosGenerico)throws Exception
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
				jComboBoxid_grupo_clienteProcesoFacturasProductosGenerico.setSelectedItem(grupoclienteTemp);
			} else {
				if(jComboBoxid_grupo_clienteProcesoFacturasProductosGenerico!=null && jComboBoxid_grupo_clienteProcesoFacturasProductosGenerico.getItemCount()>0) {
					jComboBoxid_grupo_clienteProcesoFacturasProductosGenerico.setSelectedIndex(0);
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

					if(this.procesofacturasproductos!=null) {
						this.procesofacturasproductos.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
						this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorProcesoFacturasProductos.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoFacturasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(vendedorTemp!=null && jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos!=null) {
						jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedItem(vendedorTemp);
					} else {
						if(jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos!=null) {
							//jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedItem(vendedorTemp);
							if(jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.getItemCount()>0) {
								jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedIndex(0);
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
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorProcesoFacturasProductosGenerico)throws Exception
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
				jComboBoxid_vendedorProcesoFacturasProductosGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorProcesoFacturasProductosGenerico!=null && jComboBoxid_vendedorProcesoFacturasProductosGenerico.getItemCount()>0) {
					jComboBoxid_vendedorProcesoFacturasProductosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(ProcesoFacturasProductos procesofacturasproductos,JComboBox jComboBoxid_ciudadProcesoFacturasProductosGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadProcesoFacturasProductosGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadProcesoFacturasProductosGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				procesofacturasproductos.setid_ciudad(ciudadAux.getId());
				procesofacturasproductos.setciudad_descripcion(ProcesoFacturasProductosConstantesFunciones.getCiudadDescripcion(ciudadAux));
				procesofacturasproductos.setCiudad(ciudadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarZonaForeignKey(ProcesoFacturasProductos procesofacturasproductos,JComboBox jComboBoxid_zonaProcesoFacturasProductosGenerico)throws Exception
	{
		try
		{
			Zona  zonaAux=new Zona();

			if(jComboBoxid_zonaProcesoFacturasProductosGenerico==null) {
				zonaAux=(Zona)this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.getSelectedItem();
			} else {
				zonaAux=(Zona)jComboBoxid_zonaProcesoFacturasProductosGenerico.getSelectedItem();
			}

			if(zonaAux!=null && zonaAux.getId()!=null) {
				procesofacturasproductos.setid_zona(zonaAux.getId());
				procesofacturasproductos.setzona_descripcion(ProcesoFacturasProductosConstantesFunciones.getZonaDescripcion(zonaAux));
				procesofacturasproductos.setZona(zonaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoClienteForeignKey(ProcesoFacturasProductos procesofacturasproductos,JComboBox jComboBoxid_grupo_clienteProcesoFacturasProductosGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteAux=new GrupoCliente();

			if(jComboBoxid_grupo_clienteProcesoFacturasProductosGenerico==null) {
				grupoclienteAux=(GrupoCliente)this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.getSelectedItem();
			} else {
				grupoclienteAux=(GrupoCliente)jComboBoxid_grupo_clienteProcesoFacturasProductosGenerico.getSelectedItem();
			}

			if(grupoclienteAux!=null && grupoclienteAux.getId()!=null) {
				procesofacturasproductos.setid_grupo_cliente(grupoclienteAux.getId());
				procesofacturasproductos.setgrupocliente_descripcion(ProcesoFacturasProductosConstantesFunciones.getGrupoClienteDescripcion(grupoclienteAux));
				procesofacturasproductos.setGrupoCliente(grupoclienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(ProcesoFacturasProductos procesofacturasproductos,JComboBox jComboBoxid_vendedorProcesoFacturasProductosGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorProcesoFacturasProductosGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorProcesoFacturasProductosGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				procesofacturasproductos.setid_vendedor(vendedorAux.getId());
				procesofacturasproductos.setvendedor_descripcion(ProcesoFacturasProductosConstantesFunciones.getVendedorDescripcion(vendedorAux));
				procesofacturasproductos.setVendedor(vendedorAux);			}
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

					if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { 
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { 
					}

					if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoFacturasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.addItem(ciudad);
							}
						}

						if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { 
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.addItem(zona);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { 
					}

					if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoFacturasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.addItem(zona);
							}
						}

						if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { 
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.addItem(grupocliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { 
					}

					if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoFacturasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.addItem(grupocliente);
							}
						}

						if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { 
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { 
					}

					if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoFacturasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.addItem(vendedor);
							}
						}

						if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedItem(ciudad);
						} else {
							this.jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.setSelectedItem(zona);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedItem(zona);
						} else {
							this.jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.setSelectedItem(grupocliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedItem(grupocliente);
						} else {
							this.jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedItem(vendedor);
						} else {
							this.jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoFacturasProductos() throws Exception {
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
		
	public ProcesoFacturasProductosParameterReturnGeneral getProcesoFacturasProductosParameterGeneral() {
		return this.procesofacturasproductosParameterGeneral;
	}
	
	public void setProcesoFacturasProductosParameterGeneral(ProcesoFacturasProductosParameterReturnGeneral procesofacturasproductosParameterGeneral) {
		this.procesofacturasproductosParameterGeneral = procesofacturasproductosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoFacturasProductos() {
		return isPermisoTodoProcesoFacturasProductos;
	}

	public void setIsPermisoTodoProcesoFacturasProductos(Boolean isPermisoTodoProcesoFacturasProductos) {
		this.isPermisoTodoProcesoFacturasProductos = isPermisoTodoProcesoFacturasProductos;
	}

	public Boolean getIsPermisoNuevoProcesoFacturasProductos() {
		return isPermisoNuevoProcesoFacturasProductos;
	}

	public void setIsPermisoNuevoProcesoFacturasProductos(Boolean isPermisoNuevoProcesoFacturasProductos) {
		this.isPermisoNuevoProcesoFacturasProductos = isPermisoNuevoProcesoFacturasProductos;
	}

	public Boolean getIsPermisoActualizarProcesoFacturasProductos() {
		return isPermisoActualizarProcesoFacturasProductos;
	}

	public void setIsPermisoActualizarProcesoFacturasProductos(Boolean isPermisoActualizarProcesoFacturasProductos) {
		this.isPermisoActualizarProcesoFacturasProductos = isPermisoActualizarProcesoFacturasProductos;
	}

	public Boolean getIsPermisoEliminarProcesoFacturasProductos() {
		return isPermisoEliminarProcesoFacturasProductos;
	}

	public void setIsPermisoEliminarProcesoFacturasProductos(Boolean isPermisoEliminarProcesoFacturasProductos) {
		this.isPermisoEliminarProcesoFacturasProductos = isPermisoEliminarProcesoFacturasProductos;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoFacturasProductos() {
		return isPermisoGuardarCambiosProcesoFacturasProductos;
	}

	public void setIsPermisoGuardarCambiosProcesoFacturasProductos(Boolean isPermisoGuardarCambiosProcesoFacturasProductos) {
		this.isPermisoGuardarCambiosProcesoFacturasProductos = isPermisoGuardarCambiosProcesoFacturasProductos;
	}
	
	public Boolean getIsPermisoConsultaProcesoFacturasProductos() {
		return isPermisoConsultaProcesoFacturasProductos;
	}

	public void setIsPermisoConsultaProcesoFacturasProductos(Boolean isPermisoConsultaProcesoFacturasProductos) {
		this.isPermisoConsultaProcesoFacturasProductos = isPermisoConsultaProcesoFacturasProductos;
	}

	public Boolean getIsPermisoBusquedaProcesoFacturasProductos() {
		return isPermisoBusquedaProcesoFacturasProductos;
	}

	public void setIsPermisoBusquedaProcesoFacturasProductos(Boolean isPermisoBusquedaProcesoFacturasProductos) {
		this.isPermisoBusquedaProcesoFacturasProductos = isPermisoBusquedaProcesoFacturasProductos;
	}

	public Boolean getIsPermisoReporteProcesoFacturasProductos() {
		return isPermisoReporteProcesoFacturasProductos;
	}

	public void setIsPermisoReporteProcesoFacturasProductos(Boolean isPermisoReporteProcesoFacturasProductos) {
		this.isPermisoReporteProcesoFacturasProductos = isPermisoReporteProcesoFacturasProductos;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoFacturasProductos() {
		return isPermisoPaginacionMedioProcesoFacturasProductos;
	}

	public void setIsPermisoPaginacionMedioProcesoFacturasProductos(Boolean isPermisoPaginacionMedioProcesoFacturasProductos) {
		this.isPermisoPaginacionMedioProcesoFacturasProductos = isPermisoPaginacionMedioProcesoFacturasProductos;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoFacturasProductos() {
		return isPermisoPaginacionTodoProcesoFacturasProductos;
	}

	public void setIsPermisoPaginacionTodoProcesoFacturasProductos(Boolean isPermisoPaginacionTodoProcesoFacturasProductos) {
		this.isPermisoPaginacionTodoProcesoFacturasProductos = isPermisoPaginacionTodoProcesoFacturasProductos;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoFacturasProductos() {
		return isPermisoPaginacionAltoProcesoFacturasProductos;
	}

	public void setIsPermisoPaginacionAltoProcesoFacturasProductos(Boolean isPermisoPaginacionAltoProcesoFacturasProductos) {
		this.isPermisoPaginacionAltoProcesoFacturasProductos = isPermisoPaginacionAltoProcesoFacturasProductos;
	}
	
	public Boolean getIsPermisoCopiarProcesoFacturasProductos() {
		return isPermisoCopiarProcesoFacturasProductos;
	}

	public void setIsPermisoCopiarProcesoFacturasProductos(Boolean isPermisoCopiarProcesoFacturasProductos) {
		this.isPermisoCopiarProcesoFacturasProductos = isPermisoCopiarProcesoFacturasProductos;
	}
	
	public Boolean getIsPermisoVerFormProcesoFacturasProductos() {
		return isPermisoVerFormProcesoFacturasProductos;
	}

	public void setIsPermisoVerFormProcesoFacturasProductos(Boolean isPermisoVerFormProcesoFacturasProductos) {
		this.isPermisoVerFormProcesoFacturasProductos = isPermisoVerFormProcesoFacturasProductos;
	}
	
	public Boolean getIsPermisoDuplicarProcesoFacturasProductos() {
		return isPermisoDuplicarProcesoFacturasProductos;
	}

	public void setIsPermisoDuplicarProcesoFacturasProductos(Boolean isPermisoDuplicarProcesoFacturasProductos) {
		this.isPermisoDuplicarProcesoFacturasProductos = isPermisoDuplicarProcesoFacturasProductos;
	}
	
	public Boolean getIsPermisoOrdenProcesoFacturasProductos() {
		return isPermisoOrdenProcesoFacturasProductos;
	}

	public void setIsPermisoOrdenProcesoFacturasProductos(Boolean isPermisoOrdenProcesoFacturasProductos) {
		this.isPermisoOrdenProcesoFacturasProductos = isPermisoOrdenProcesoFacturasProductos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoFacturasProductos() {
		return isVisibilidadCeldaNuevoProcesoFacturasProductos;
	}

	public void setIsVisibilidadCeldaNuevoProcesoFacturasProductos(Boolean isVisibilidadCeldaNuevoProcesoFacturasProductos) {
		this.isVisibilidadCeldaNuevoProcesoFacturasProductos = isVisibilidadCeldaNuevoProcesoFacturasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoFacturasProductos() {
		return isVisibilidadCeldaDuplicarProcesoFacturasProductos;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoFacturasProductos(Boolean isVisibilidadCeldaDuplicarProcesoFacturasProductos) {
		this.isVisibilidadCeldaDuplicarProcesoFacturasProductos = isVisibilidadCeldaDuplicarProcesoFacturasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoFacturasProductos() {
		return isVisibilidadCeldaCopiarProcesoFacturasProductos;
	}

	public void setIsVisibilidadCeldaCopiarProcesoFacturasProductos(Boolean isVisibilidadCeldaCopiarProcesoFacturasProductos) {
		this.isVisibilidadCeldaCopiarProcesoFacturasProductos = isVisibilidadCeldaCopiarProcesoFacturasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoFacturasProductos() {
		return isVisibilidadCeldaVerFormProcesoFacturasProductos;
	}

	public void setIsVisibilidadCeldaVerFormProcesoFacturasProductos(Boolean isVisibilidadCeldaVerFormProcesoFacturasProductos) {
		this.isVisibilidadCeldaVerFormProcesoFacturasProductos = isVisibilidadCeldaVerFormProcesoFacturasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoFacturasProductos() {
		return isVisibilidadCeldaOrdenProcesoFacturasProductos;
	}

	public void setIsVisibilidadCeldaOrdenProcesoFacturasProductos(Boolean isVisibilidadCeldaOrdenProcesoFacturasProductos) {
		this.isVisibilidadCeldaOrdenProcesoFacturasProductos = isVisibilidadCeldaOrdenProcesoFacturasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos() {
		return isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos(Boolean isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos = isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoFacturasProductos() {
		return isVisibilidadCeldaModificarProcesoFacturasProductos;
	}

	public void setIsVisibilidadCeldaModificarProcesoFacturasProductos(Boolean isVisibilidadCeldaModificarProcesoFacturasProductos) {
		this.isVisibilidadCeldaModificarProcesoFacturasProductos = isVisibilidadCeldaModificarProcesoFacturasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoFacturasProductos() {
		return isVisibilidadCeldaActualizarProcesoFacturasProductos;
	}

	public void setIsVisibilidadCeldaActualizarProcesoFacturasProductos(Boolean isVisibilidadCeldaActualizarProcesoFacturasProductos) {
		this.isVisibilidadCeldaActualizarProcesoFacturasProductos = isVisibilidadCeldaActualizarProcesoFacturasProductos;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoFacturasProductos() {
		return isVisibilidadCeldaEliminarProcesoFacturasProductos;
	}

	public void setIsVisibilidadCeldaEliminarProcesoFacturasProductos(Boolean isVisibilidadCeldaEliminarProcesoFacturasProductos) {
		this.isVisibilidadCeldaEliminarProcesoFacturasProductos = isVisibilidadCeldaEliminarProcesoFacturasProductos;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoFacturasProductos() {
		return isVisibilidadCeldaCancelarProcesoFacturasProductos;
	}

	public void setIsVisibilidadCeldaCancelarProcesoFacturasProductos(Boolean isVisibilidadCeldaCancelarProcesoFacturasProductos) {
		this.isVisibilidadCeldaCancelarProcesoFacturasProductos = isVisibilidadCeldaCancelarProcesoFacturasProductos;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoFacturasProductos() {
		return isVisibilidadCeldaGuardarProcesoFacturasProductos;
	}

	public void setIsVisibilidadCeldaGuardarProcesoFacturasProductos(Boolean isVisibilidadCeldaGuardarProcesoFacturasProductos) {
		this.isVisibilidadCeldaGuardarProcesoFacturasProductos = isVisibilidadCeldaGuardarProcesoFacturasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoFacturasProductos() {
		return isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoFacturasProductos(Boolean isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos) {
		this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos = isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos;
	}
		
	public ProcesoFacturasProductosSessionBean getprocesofacturasproductosSessionBean() {
		return this.procesofacturasproductosSessionBean;
	}
	
	public void setprocesofacturasproductosSessionBean(ProcesoFacturasProductosSessionBean procesofacturasproductosSessionBean) {
		this.procesofacturasproductosSessionBean=procesofacturasproductosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoFacturasProductos() {
		return this.isVisibilidadBusquedaProcesoFacturasProductos;
	}

	public void setisVisibilidadBusquedaProcesoFacturasProductos(Boolean isVisibilidadBusquedaProcesoFacturasProductos) {
		this.isVisibilidadBusquedaProcesoFacturasProductos=isVisibilidadBusquedaProcesoFacturasProductos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos)throws Exception {
		try {
			
				this.setActualParaGuardarCiudadForeignKey(procesofacturasproductos,null);
				this.setActualParaGuardarZonaForeignKey(procesofacturasproductos,null);
				this.setActualParaGuardarGrupoClienteForeignKey(procesofacturasproductos,null);
				this.setActualParaGuardarVendedorForeignKey(procesofacturasproductos,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoFacturasProductos procesofacturasproductos,ProcesoFacturasProductos procesofacturasproductosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoFacturasProductos(procesofacturasproductos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesofacturasproductosAux.setId(procesofacturasproductos.getId());
		procesofacturasproductosAux.setVersionRow(procesofacturasproductos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoFacturasProductos procesofacturasproductosLocal) throws Exception {
		
		if(this.procesofacturasproductosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoFacturasProductos procesofacturasproductosLocal) throws Exception {	
		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				procesofacturasproductosLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ZonaDetalleFormJInternalFrame.class)) {
				ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrameLocal=(ZonaBeanSwingJInternalFrame) ((ZonaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				zonaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoZona(zonaBeanSwingJInternalFrameLocal.getzona(),true);
				zonaBeanSwingJInternalFrameLocal.actualizarLista(zonaBeanSwingJInternalFrameLocal.zona,this.zonasForeignKey);

				zonaBeanSwingJInternalFrameLocal.actualizarRelaciones(zonaBeanSwingJInternalFrameLocal.zona);

				procesofacturasproductosLocal.setZona(zonaBeanSwingJInternalFrameLocal.zona);

				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey("Formulario");
				this.setActualZonaForeignKey(zonaBeanSwingJInternalFrameLocal.zona.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoClienteDetalleFormJInternalFrame.class)) {
				GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrameLocal=(GrupoClienteBeanSwingJInternalFrame) ((GrupoClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.getgrupocliente(),true);
				grupoclienteBeanSwingJInternalFrameLocal.actualizarLista(grupoclienteBeanSwingJInternalFrameLocal.grupocliente,this.grupoclientesForeignKey);

				grupoclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				procesofacturasproductosLocal.setGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey("Formulario");
				this.setActualGrupoClienteForeignKey(grupoclienteBeanSwingJInternalFrameLocal.grupocliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				procesofacturasproductosLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoFacturasProductosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesofacturasproductosValidator.getInvalidValues(this.procesofacturasproductos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoFacturasProductos procesofacturasproductos,List<ProcesoFacturasProductos> procesofacturasproductoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoFacturasProductos procesofacturasproductos,List<ProcesoFacturasProductos> procesofacturasproductoss) throws Exception {
		try	{			
			ProcesoFacturasProductosConstantesFunciones.actualizarSelectedLista(procesofacturasproductos,procesofacturasproductoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoFacturasProductos> procesofacturasproductossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesofacturasproductossLocal=this.procesofacturasproductosLogic.getProcesoFacturasProductoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesofacturasproductossLocal=this.procesofacturasproductoss;
			}
			//ARCHITECTURE
		
			for(ProcesoFacturasProductos procesofacturasproductosLocal:procesofacturasproductossLocal) {
				if(this.permiteMantenimiento(procesofacturasproductosLocal) && procesofacturasproductosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoFacturasProductosConstantesFunciones.getProcesoFacturasProductosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoFacturasProductosConstantesFunciones.NOMBREPROVINCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_provinciaProcesoFacturasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoFacturasProductosConstantesFunciones.NOMBRECIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_ciudadProcesoFacturasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoFacturasProductosConstantesFunciones.NOMBREZONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_zonaProcesoFacturasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoFacturasProductosConstantesFunciones.NOMBREGRUPOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_grupo_clienteProcesoFacturasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoFacturasProductosConstantesFunciones.CODIGODATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelcodigo_datoProcesoFacturasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoFacturasProductosConstantesFunciones.NOMBRECOMPLETODATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_completo_datoProcesoFacturasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoFacturasProductosConstantesFunciones.NUMEROPREIMPRESOFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnumero_pre_impreso_facturaProcesoFacturasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoFacturasProductosConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_productoProcesoFacturasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoFacturasProductosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_unidadProcesoFacturasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoFacturasProductosConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelprecioProcesoFacturasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoFacturasProductosConstantesFunciones.TAREA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabeltareaProcesoFacturasProductos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_provinciaProcesoFacturasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_ciudadProcesoFacturasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_zonaProcesoFacturasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_grupo_clienteProcesoFacturasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelcodigo_datoProcesoFacturasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_completo_datoProcesoFacturasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnumero_pre_impreso_facturaProcesoFacturasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_productoProcesoFacturasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_unidadProcesoFacturasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelprecioProcesoFacturasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabeltareaProcesoFacturasProductos,"");
		
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
		this.iIdNuevoProcesoFacturasProductos--;	
		
		
		this.procesofacturasproductosAux=new ProcesoFacturasProductos();
		
		this.procesofacturasproductosAux.setId(this.iIdNuevoProcesoFacturasProductos);
		this.procesofacturasproductosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesofacturasproductosLogic.getProcesoFacturasProductoss().add(this.procesofacturasproductosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesofacturasproductoss.add(this.procesofacturasproductosAux);
		}
		//ARCHITECTURE
		
		this.procesofacturasproductos=this.procesofacturasproductosAux;
		
		if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoFacturasProductos(this.procesofacturasproductos);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoFacturasProductos(this.procesofacturasproductos);
		}
				
		//this.setDefaultControlesProcesoFacturasProductos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoFacturasProductos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoFacturasProductos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoFacturasProductos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoFacturasProductos(this.procesofacturasproductosBean,this.procesofacturasproductos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoFacturasProductos(this.procesofacturasproductosReturnGeneral,this.procesofacturasproductosBean,false);
		
		if(this.procesofacturasproductosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoFacturasProductos(this.procesofacturasproductosReturnGeneral.getProcesoFacturasProductos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoFacturasProductos(this.procesofacturasproductosReturnGeneral.getProcesoFacturasProductos());
		}
		
		if(this.procesofacturasproductosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoFacturasProductos(this.procesofacturasproductosReturnGeneral.getProcesoFacturasProductos(),classes);//this.procesofacturasproductosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoFacturasProductos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoFacturasProductos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.RecargarFormProcesoFacturasProductos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoFacturasProductos(false);
						
			if(procesofacturasproductosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoFacturasProductos();
			}
			
			this.actualizarVisualTableDatosProcesoFacturasProductos();
			
			this.jTableDatosProcesoFacturasProductos.setRowSelectionInterval(this.getIndiceNuevoProcesoFacturasProductos(), this.getIndiceNuevoProcesoFacturasProductos());
			
			this.seleccionarFilaTablaProcesoFacturasProductosActual();
						
			this.actualizarEstadoCeldasBotonesProcesoFacturasProductos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoFacturasProductos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldcodigoProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarcodigoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_completoProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarnombre_completoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_provinciaProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarnombre_provinciaProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_ciudadProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarnombre_ciudadProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_zonaProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarnombre_zonaProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_grupo_clienteProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarnombre_grupo_clienteProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldcodigo_datoProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarcodigo_datoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_completo_datoProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarnombre_completo_datoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarnumero_pre_impreso_facturaProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_productoProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarnombre_productoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_unidadProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarnombre_unidadProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldprecioProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarprecioProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreatareaProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activartareaProcesoFacturasProductos);	
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarid_ciudadProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarid_zonaProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarid_grupo_clienteProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.setEnabled(isHabilitar && this.procesofacturasproductosConstantesFunciones.activarid_vendedorProcesoFacturasProductos);
	};
	
	public void setDefaultControlesProcesoFacturasProductos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoFacturasProductos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesofacturasproductosSessionBean.setConGuardarRelaciones(true);			
			this.procesofacturasproductosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTabbedPaneRelacionesProcesoFacturasProductos.setVisible(true);
			
					
		} else {
			//this.procesofacturasproductosSessionBean.setConGuardarRelaciones(false);			
			this.procesofacturasproductosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTabbedPaneRelacionesProcesoFacturasProductos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoFacturasProductos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductosLogic.getProcesoFacturasProductoss()) {
				if(procesofacturasproductosAux.getId().equals(this.iIdNuevoProcesoFacturasProductos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductoss) {
				if(procesofacturasproductosAux.getId().equals(this.iIdNuevoProcesoFacturasProductos)) {
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
	
	public int getIndiceActualProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductosLogic.getProcesoFacturasProductoss()) {
				if(procesofacturasproductosAux.getId().equals(procesofacturasproductos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductoss) {
				if(procesofacturasproductosAux.getId().equals(procesofacturasproductos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductosLogic.getProcesoFacturasProductoss()) {
				if(procesofacturasproductosAux.getProcesoFacturasProductosOriginal().getId().equals(procesofacturasproductosOriginal.getId())) {
					existe=true;
					procesofacturasproductosOriginal.setId(procesofacturasproductosAux.getId());
					procesofacturasproductosOriginal.setVersionRow(procesofacturasproductosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductoss) {
				if(procesofacturasproductosAux.getProcesoFacturasProductosOriginal().getId().equals(procesofacturasproductosOriginal.getId())) {
					existe=true;
					procesofacturasproductosOriginal.setId(procesofacturasproductosAux.getId());
					procesofacturasproductosOriginal.setVersionRow(procesofacturasproductosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoFacturasProductos(Boolean esParaCancelar) throws Exception {
		procesofacturasproductossAux=new ArrayList<ProcesoFacturasProductos>();
		procesofacturasproductosAux=new ProcesoFacturasProductos();
		
		if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductosLogic.getProcesoFacturasProductoss()) {
					if(procesofacturasproductosAux.getId()<0) {
						procesofacturasproductossAux.add(procesofacturasproductosAux);
					}		
				}
				this.iIdNuevoProcesoFacturasProductos=0L;
				this.procesofacturasproductosLogic.getProcesoFacturasProductoss().removeAll(procesofacturasproductossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductoss) {
					if(procesofacturasproductosAux.getId()<0) {
						procesofacturasproductossAux.add(procesofacturasproductosAux);
					}		
				}
				this.iIdNuevoProcesoFacturasProductos=0L;
				this.procesofacturasproductoss.removeAll(procesofacturasproductossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoFacturasProductos 
					&& this.procesofacturasproductosLogic.getProcesoFacturasProductoss().size()>0
					) {
					procesofacturasproductosAux=this.procesofacturasproductosLogic.getProcesoFacturasProductoss().get(this.procesofacturasproductosLogic.getProcesoFacturasProductoss().size() - 1);
				
					if(procesofacturasproductosAux.getId()<0) {
						this.procesofacturasproductosLogic.getProcesoFacturasProductoss().remove(procesofacturasproductosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoFacturasProductos && this.procesofacturasproductoss.size()>0) {
					procesofacturasproductosAux=this.procesofacturasproductoss.get(this.procesofacturasproductoss.size() - 1);
				
					if(procesofacturasproductosAux.getId()<0) {
						this.procesofacturasproductoss.remove(procesofacturasproductosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoFacturasProductos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesofacturasproductos.getId()<0) {
				this.procesofacturasproductosLogic.getProcesoFacturasProductoss().remove(this.procesofacturasproductos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesofacturasproductos.getId()<0) {
				this.procesofacturasproductoss.remove(this.procesofacturasproductos);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoFacturasProductos(List<ProcesoFacturasProductos> procesofacturasproductossAux) throws Exception {
		ProcesoFacturasProductosConstantesFunciones.setEstadosInicialesProcesoFacturasProductos(procesofacturasproductossAux);
	}
	
	public void setEstadosInicialesProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductosAux) throws Exception {
		ProcesoFacturasProductosConstantesFunciones.setEstadosInicialesProcesoFacturasProductos(procesofacturasproductosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoFacturasProductosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoFacturasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoFacturasProductosActual()) {
				if(!this.isEsNuevoProcesoFacturasProductos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoFacturasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoFacturasProductos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoFacturasProductosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Facturas Productos ?", "MANTENIMIENTO DE Proceso Facturas Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoFacturasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoFacturasProductos procesofacturasproductos) throws Exception {
		ProcesoFacturasProductosConstantesFunciones.seleccionarAsignar(this.procesofacturasproductos,procesofacturasproductos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoFacturasProductos=this.isPermisoActualizarOriginalProcesoFacturasProductos;
			
			
			this.seleccionarAsignar(procesofacturasproductos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoFacturasProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesofacturasproductosSessionBean.setsFuncionBusquedaRapida(this.procesofacturasproductosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoFacturasProductos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoFacturasProductos(esParaCancelar);				
				this.cancelarNuevoProcesoFacturasProductos(esParaCancelar);								
			}
			
			this.procesofacturasproductos=new ProcesoFacturasProductos();
			
			this.inicializarProcesoFacturasProductos();
			
			this.actualizarEstadoCeldasBotonesProcesoFacturasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoFacturasProductos() throws Exception {
		try {
			ProcesoFacturasProductosConstantesFunciones.inicializarProcesoFacturasProductos(this.procesofacturasproductos);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesofacturasproductosLogic.getProcesoFacturasProductoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoFacturasProductoss(String sAccionBusqueda,List<ProcesoFacturasProductos> procesofacturasproductossParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoFacturasProductos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoFacturasProductosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoFacturasProductosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoFacturasProductos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Facturas Productoses");		
		parameters.put("busquedapor", ProcesoFacturasProductosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoFacturasProductos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesoFacturasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesoFacturasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesoFacturasProductos=new JRBeanArrayDataSource(ProcesoFacturasProductosJInternalFrame.TraerProcesoFacturasProductosBeans(procesofacturasproductossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoFacturasProductos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoFacturasProductosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoFacturasProductosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoFacturasProductosBean.TraerProcesoFacturasProductosBeans(procesofacturasproductossParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoFacturasProductoss(sAccionBusqueda,sTipoArchivoReporte,procesofacturasproductossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoFacturasProductoss(sAccionBusqueda,sTipoArchivoReporte,procesofacturasproductossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoFacturasProductosActionPerformed(null);
					//this.generarExcelReporteProcesoFacturasProductoss(sAccionBusqueda,sTipoArchivoReporte,procesofacturasproductossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoFacturasProductoss(sAccionBusqueda,sTipoArchivoReporte,procesofacturasproductossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoFacturasProductoss(sAccionBusqueda,sTipoArchivoReporte,procesofacturasproductossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoFacturasProductoss(sAccionBusqueda,sTipoArchivoReporte,procesofacturasproductossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoFacturasProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoFacturasProductos> procesofacturasproductossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesofacturasproductos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoFacturasProductoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoFacturasProductos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoFacturasProductos procesofacturasproductos : procesofacturasproductossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoFacturasProductosConstantesFunciones.generarExcelReporteDataProcesoFacturasProductos("NORMAL",row,workbook,procesofacturasproductos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Facturas Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoFacturasProductos(String sTipo,Row row,Workbook workbook) {
		
		ProcesoFacturasProductosConstantesFunciones.generarExcelReporteHeaderProcesoFacturasProductos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoFacturasProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoFacturasProductos> procesofacturasproductossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesofacturasproductos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoFacturasProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoFacturasProductos procesofacturasproductos : procesofacturasproductossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.getProcesoFacturasProductosDescripcion(procesofacturasproductos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_IDZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_IDZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getzona_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_IDGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getgrupocliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getnombre_provincia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getnombre_ciudad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getnombre_zona());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getnombre_grupo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getcodigo_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getnombre_completo_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getnumero_pre_impreso_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesofacturasproductos.gettarea());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Facturas Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoFacturasProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoFacturasProductos> procesofacturasproductossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoFacturasProductos> procesofacturasproductossRespaldo=null;
		
		classes=ProcesoFacturasProductosConstantesFunciones.getClassesRelationshipsOfProcesoFacturasProductos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesofacturasproductosLogic.setDatosCliente(this.datosCliente);
		this.procesofacturasproductosLogic.setDatosDeep(this.datosDeep);
		this.procesofacturasproductosLogic.setIsConDeep(true);
		
		procesofacturasproductossRespaldo=this.procesofacturasproductosLogic.getProcesoFacturasProductoss();
		
		this.procesofacturasproductosLogic.setProcesoFacturasProductoss(procesofacturasproductossParaReportes);	
		this.procesofacturasproductosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesofacturasproductossParaReportes=this.procesofacturasproductosLogic.getProcesoFacturasProductoss();
		this.procesofacturasproductosLogic.setProcesoFacturasProductoss(procesofacturasproductossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesofacturasproductos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoFacturasProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoFacturasProductos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoFacturasProductos procesofacturasproductos : procesofacturasproductossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoFacturasProductos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoFacturasProductosConstantesFunciones.generarExcelReporteDataProcesoFacturasProductos("NORMAL",row,workbook,procesofacturasproductos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.getProcesoFacturasProductosDescripcion(procesofacturasproductos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Facturas Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoFacturasProductos() throws Exception {		
		this.startProcessProcesoFacturasProductos(true);
	}
	
	public void startProcessProcesoFacturasProductos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoFacturasProductos ,this.jPanelParametrosReportesProcesoFacturasProductos, this.jScrollPanelDatosProcesoFacturasProductos,this.jPanelPaginacionProcesoFacturasProductos, this.jScrollPanelDatosEdicionProcesoFacturasProductos, this.jPanelAccionesProcesoFacturasProductos,this.jPanelAccionesFormularioProcesoFacturasProductos,this.jmenuBarProcesoFacturasProductos,this.jmenuBarDetalleProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,this.jTtoolBarDetalleProcesoFacturasProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoFacturasProductos=this.jTabbedPaneBusquedasProcesoFacturasProductos; 
		
		final JPanel jPanelParametrosReportesProcesoFacturasProductos=this.jPanelParametrosReportesProcesoFacturasProductos;
		//final JScrollPane jScrollPanelDatosProcesoFacturasProductos=this.jScrollPanelDatosProcesoFacturasProductos;
		final JTable jTableDatosProcesoFacturasProductos=this.jTableDatosProcesoFacturasProductos;		
		final JPanel jPanelPaginacionProcesoFacturasProductos=this.jPanelPaginacionProcesoFacturasProductos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoFacturasProductos=this.jScrollPanelDatosEdicionProcesoFacturasProductos;
		final JPanel jPanelAccionesProcesoFacturasProductos=this.jPanelAccionesProcesoFacturasProductos;
		
		JPanel jPanelCamposAuxiliarProcesoFacturasProductos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoFacturasProductos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
			jPanelCamposAuxiliarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelCamposProcesoFacturasProductos;
			jPanelAccionesFormularioAuxiliarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelAccionesFormularioProcesoFacturasProductos;
		}
		
		final JPanel jPanelCamposProcesoFacturasProductos=jPanelCamposAuxiliarProcesoFacturasProductos;
		final JPanel jPanelAccionesFormularioProcesoFacturasProductos=jPanelAccionesFormularioAuxiliarProcesoFacturasProductos;
		
		
		final JMenuBar jmenuBarProcesoFacturasProductos=this.jmenuBarProcesoFacturasProductos;
		final JToolBar jTtoolBarProcesoFacturasProductos=this.jTtoolBarProcesoFacturasProductos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoFacturasProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoFacturasProductos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
			jmenuBarDetalleAuxiliarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jmenuBarDetalleProcesoFacturasProductos;
			jTtoolBarDetalleAuxiliarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jTtoolBarDetalleProcesoFacturasProductos;
		}
		
		final JMenuBar jmenuBarDetalleProcesoFacturasProductos=jmenuBarDetalleAuxiliarProcesoFacturasProductos;
		final JToolBar jTtoolBarDetalleProcesoFacturasProductos=jTtoolBarDetalleAuxiliarProcesoFacturasProductos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoFacturasProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoFacturasProductos;
			processRunnable.jTableDatos=jTableDatosProcesoFacturasProductos;
			processRunnable.jPanelCampos=jPanelCamposProcesoFacturasProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoFacturasProductos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoFacturasProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoFacturasProductos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoFacturasProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoFacturasProductos;
			processRunnable.jTtoolBar=jTtoolBarProcesoFacturasProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoFacturasProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoFacturasProductos ,jPanelParametrosReportesProcesoFacturasProductos,jTableDatosProcesoFacturasProductos, /*jScrollPanelDatosProcesoFacturasProductos,*/jPanelCamposProcesoFacturasProductos,jPanelPaginacionProcesoFacturasProductos, /*jScrollPanelDatosEdicionProcesoFacturasProductos,*/ jPanelAccionesProcesoFacturasProductos,jPanelAccionesFormularioProcesoFacturasProductos,jmenuBarProcesoFacturasProductos,jmenuBarDetalleProcesoFacturasProductos,jTtoolBarProcesoFacturasProductos,jTtoolBarDetalleProcesoFacturasProductos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoFacturasProductos ,jPanelParametrosReportesProcesoFacturasProductos, jScrollPanelDatosProcesoFacturasProductos,jPanelPaginacionProcesoFacturasProductos, jScrollPanelDatosEdicionProcesoFacturasProductos, jPanelAccionesProcesoFacturasProductos,jPanelAccionesFormularioProcesoFacturasProductos,jmenuBarProcesoFacturasProductos,jmenuBarDetalleProcesoFacturasProductos,jTtoolBarProcesoFacturasProductos,jTtoolBarDetalleProcesoFacturasProductos);
						
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
	
	public void finishProcessProcesoFacturasProductos() {// throws Exception 
		this.finishProcessProcesoFacturasProductos(true);
	}
	
	public void finishProcessProcesoFacturasProductos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoFacturasProductos ,this.jPanelParametrosReportesProcesoFacturasProductos, this.jScrollPanelDatosProcesoFacturasProductos,this.jPanelPaginacionProcesoFacturasProductos, this.jScrollPanelDatosEdicionProcesoFacturasProductos, this.jPanelAccionesProcesoFacturasProductos,this.jPanelAccionesFormularioProcesoFacturasProductos,this.jmenuBarProcesoFacturasProductos,this.jmenuBarDetalleProcesoFacturasProductos,this.jTtoolBarProcesoFacturasProductos,this.jTtoolBarDetalleProcesoFacturasProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoFacturasProductos=this.jTabbedPaneBusquedasProcesoFacturasProductos; 
		
		final JPanel jPanelParametrosReportesProcesoFacturasProductos=this.jPanelParametrosReportesProcesoFacturasProductos;
		//final JScrollPane jScrollPanelDatosProcesoFacturasProductos=this.jScrollPanelDatosProcesoFacturasProductos;
		final JTable jTableDatosProcesoFacturasProductos=this.jTableDatosProcesoFacturasProductos;		
		final JPanel jPanelPaginacionProcesoFacturasProductos=this.jPanelPaginacionProcesoFacturasProductos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoFacturasProductos=this.jScrollPanelDatosEdicionProcesoFacturasProductos;
		final JPanel jPanelAccionesProcesoFacturasProductos=this.jPanelAccionesProcesoFacturasProductos;
		
		JPanel jPanelCamposAuxiliarProcesoFacturasProductos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoFacturasProductos=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
			jPanelCamposAuxiliarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelCamposProcesoFacturasProductos;
			jPanelAccionesFormularioAuxiliarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelAccionesFormularioProcesoFacturasProductos;
		}
		
		final JPanel jPanelCamposProcesoFacturasProductos=jPanelCamposAuxiliarProcesoFacturasProductos;
		final JPanel jPanelAccionesFormularioProcesoFacturasProductos=jPanelAccionesFormularioAuxiliarProcesoFacturasProductos;
		
		
		final JMenuBar jmenuBarProcesoFacturasProductos=this.jmenuBarProcesoFacturasProductos;		
		final JToolBar jTtoolBarProcesoFacturasProductos=this.jTtoolBarProcesoFacturasProductos;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoFacturasProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoFacturasProductos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
			jmenuBarDetalleAuxiliarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jmenuBarDetalleProcesoFacturasProductos;
			jTtoolBarDetalleAuxiliarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jTtoolBarDetalleProcesoFacturasProductos;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoFacturasProductos=jmenuBarDetalleAuxiliarProcesoFacturasProductos;
		final JToolBar jTtoolBarDetalleProcesoFacturasProductos=jTtoolBarDetalleAuxiliarProcesoFacturasProductos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoFacturasProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoFacturasProductos;
			processRunnable.jTableDatos=jTableDatosProcesoFacturasProductos;
			processRunnable.jPanelCampos=jPanelCamposProcesoFacturasProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoFacturasProductos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoFacturasProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoFacturasProductos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoFacturasProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoFacturasProductos;
			processRunnable.jTtoolBar=jTtoolBarProcesoFacturasProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoFacturasProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoFacturasProductos ,jPanelParametrosReportesProcesoFacturasProductos, jTableDatosProcesoFacturasProductos,/*jScrollPanelDatosProcesoFacturasProductos,*/jPanelCamposProcesoFacturasProductos,jPanelPaginacionProcesoFacturasProductos, /*jScrollPanelDatosEdicionProcesoFacturasProductos,*/ jPanelAccionesProcesoFacturasProductos,jPanelAccionesFormularioProcesoFacturasProductos,jmenuBarProcesoFacturasProductos,jmenuBarDetalleProcesoFacturasProductos,jTtoolBarProcesoFacturasProductos,jTtoolBarDetalleProcesoFacturasProductos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoFacturasProductos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoFacturasProductos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoFacturasProductos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoFacturasProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoFacturasProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoFacturasProductos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoFacturasProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoFacturasProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoFacturasProductos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesofacturasproductosConstantesFunciones.getsFinalQueryProcesoFacturasProductos();
		String  finalQueryPaginacionTodos=this.procesofacturasproductosConstantesFunciones.getsFinalQueryProcesoFacturasProductos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoFacturasProductosConstantesFunciones.getArrayColumnasGlobalesNoProcesoFacturasProductos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoFacturasProductosConstantesFunciones.getArrayColumnasGlobalesProcesoFacturasProductos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoFacturasProductosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesofacturasproductossEliminados= new ArrayList<ProcesoFacturasProductos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoFacturasProductos();
		
				///*ProcesoFacturasProductosSessionBean*/this.procesofacturasproductosSessionBean=new ProcesoFacturasProductosSessionBean();
			
			if(this.procesofacturasproductosSessionBean==null) {
				this.procesofacturasproductosSessionBean=new ProcesoFacturasProductosSessionBean();
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
					this.iNumeroPaginacion=ProcesoFacturasProductosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoFacturasProductosConstantesFunciones.getClassesForeignKeysOfProcesoFacturasProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesofacturasproductos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesofacturasproductossAux= new ArrayList<ProcesoFacturasProductos>();
			
				
			procesofacturasproductosLogic.setDatosCliente(this.datosCliente);
			procesofacturasproductosLogic.setDatosDeep(this.datosDeep);
			procesofacturasproductosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoFacturasProductos")) {
				this.sDetalleReporte=ProcesoFacturasProductosConstantesFunciones.getDetalleIndiceBusquedaProcesoFacturasProductos(id_ciudadBusquedaProcesoFacturasProductos,id_zonaBusquedaProcesoFacturasProductos,id_grupo_clienteBusquedaProcesoFacturasProductos,id_vendedorBusquedaProcesoFacturasProductos,codigoBusquedaProcesoFacturasProductos,nombre_completoBusquedaProcesoFacturasProductos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesofacturasproductosLogic.getProcesoFacturasProductossBusquedaProcesoFacturasProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ciudadBusquedaProcesoFacturasProductos,id_zonaBusquedaProcesoFacturasProductos,id_grupo_clienteBusquedaProcesoFacturasProductos,id_vendedorBusquedaProcesoFacturasProductos,codigoBusquedaProcesoFacturasProductos,nombre_completoBusquedaProcesoFacturasProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoFacturasProductosConstantesFunciones.getDetalleIndiceBusquedaProcesoFacturasProductos(id_ciudadBusquedaProcesoFacturasProductos,id_zonaBusquedaProcesoFacturasProductos,id_grupo_clienteBusquedaProcesoFacturasProductos,id_vendedorBusquedaProcesoFacturasProductos,codigoBusquedaProcesoFacturasProductos,nombre_completoBusquedaProcesoFacturasProductos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoFacturasProductosConstantesFunciones.getDetalleIndiceBusquedaProcesoFacturasProductos(id_ciudadBusquedaProcesoFacturasProductos,id_zonaBusquedaProcesoFacturasProductos,id_grupo_clienteBusquedaProcesoFacturasProductos,id_vendedorBusquedaProcesoFacturasProductos,codigoBusquedaProcesoFacturasProductos,nombre_completoBusquedaProcesoFacturasProductos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesofacturasproductosLogic.getProcesoFacturasProductoss()==null||procesofacturasproductosLogic.getProcesoFacturasProductoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesofacturasproductoss==null|| procesofacturasproductoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesofacturasproductossAux=new ArrayList<ProcesoFacturasProductos>();
						procesofacturasproductossAux.addAll(procesofacturasproductosLogic.getProcesoFacturasProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesofacturasproductossAux=new ArrayList<ProcesoFacturasProductos>();
							procesofacturasproductossAux.addAll(procesofacturasproductoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesofacturasproductosLogic.getProcesoFacturasProductossBusquedaProcesoFacturasProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ciudadBusquedaProcesoFacturasProductos,id_zonaBusquedaProcesoFacturasProductos,id_grupo_clienteBusquedaProcesoFacturasProductos,id_vendedorBusquedaProcesoFacturasProductos,codigoBusquedaProcesoFacturasProductos,nombre_completoBusquedaProcesoFacturasProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoFacturasProductosConstantesFunciones.getDetalleIndiceBusquedaProcesoFacturasProductos(id_ciudadBusquedaProcesoFacturasProductos,id_zonaBusquedaProcesoFacturasProductos,id_grupo_clienteBusquedaProcesoFacturasProductos,id_vendedorBusquedaProcesoFacturasProductos,codigoBusquedaProcesoFacturasProductos,nombre_completoBusquedaProcesoFacturasProductos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoFacturasProductosConstantesFunciones.getDetalleIndiceBusquedaProcesoFacturasProductos(id_ciudadBusquedaProcesoFacturasProductos,id_zonaBusquedaProcesoFacturasProductos,id_grupo_clienteBusquedaProcesoFacturasProductos,id_vendedorBusquedaProcesoFacturasProductos,codigoBusquedaProcesoFacturasProductos,nombre_completoBusquedaProcesoFacturasProductos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoFacturasProductoss("BusquedaProcesoFacturasProductos",procesofacturasproductosLogic.getProcesoFacturasProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoFacturasProductoss("BusquedaProcesoFacturasProductos",procesofacturasproductoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesofacturasproductosLogic.setProcesoFacturasProductoss(new ArrayList<ProcesoFacturasProductos>());
						procesofacturasproductosLogic.getProcesoFacturasProductoss().addAll(procesofacturasproductossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesofacturasproductoss=new ArrayList<ProcesoFacturasProductos>();
							procesofacturasproductoss.addAll(procesofacturasproductossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoFacturasProductos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoFacturasProductos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesofacturasproductosLogic.getProcesoFacturasProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesofacturasproductoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesofacturasproductosLogic.getProcesoFacturasProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesofacturasproductoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoFacturasProductos procesofacturasproductos) {
		Boolean permite=true;
		
		if(this.procesofacturasproductos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoFacturasProductosConstantesFunciones.getOrderByListaProcesoFacturasProductos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoFacturasProductosConstantesFunciones.getOrderByListaProcesoFacturasProductos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductosLogic.getProcesoFacturasProductoss()) {
				if(procesofacturasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					procesofacturasproductosTotales=procesofacturasproductos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoFacturasProductos procesofacturasproductos:this.procesofacturasproductoss) {
				if(procesofacturasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					procesofacturasproductosTotales=procesofacturasproductos;
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
			this.procesofacturasproductosAux=new ProcesoFacturasProductos();
			this.procesofacturasproductosAux.setsType(Constantes2.S_TOTALES);
			this.procesofacturasproductosAux.setIsNew(false);
			this.procesofacturasproductosAux.setIsChanged(false);
			this.procesofacturasproductosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoFacturasProductosConstantesFunciones.TotalizarValoresFilaProcesoFacturasProductos(this.procesofacturasproductosLogic.getProcesoFacturasProductoss(),this.procesofacturasproductosAux);
				
				//this.procesofacturasproductosLogic.getProcesoFacturasProductoss().add(this.procesofacturasproductosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoFacturasProductosConstantesFunciones.TotalizarValoresFilaProcesoFacturasProductos(this.procesofacturasproductoss,this.procesofacturasproductosAux);
				
				this.procesofacturasproductoss.add(this.procesofacturasproductosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesofacturasproductosTotales=new ProcesoFacturasProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesofacturasproductosLogic.getProcesoFacturasProductoss().remove(procesofacturasproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesofacturasproductoss.remove(procesofacturasproductosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesofacturasproductosTotales=new ProcesoFacturasProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductosLogic.getProcesoFacturasProductoss()) {
				if(procesofacturasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					procesofacturasproductosTotales=procesofacturasproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoFacturasProductosConstantesFunciones.TotalizarValoresFilaProcesoFacturasProductos(this.procesofacturasproductosLogic.getProcesoFacturasProductoss(),procesofacturasproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoFacturasProductos procesofacturasproductos:this.procesofacturasproductoss) {
				if(procesofacturasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					procesofacturasproductosTotales=procesofacturasproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoFacturasProductosConstantesFunciones.TotalizarValoresFilaProcesoFacturasProductos(this.procesofacturasproductoss,procesofacturasproductosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoFacturasProductossBusquedaProcesoFacturasProductos()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoFacturasProductos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoFacturasProductossFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoFacturasProductossFK_IdGrupoCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoFacturasProductossFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoFacturasProductossFK_IdZona()throws Exception {
		try {
			sAccionBusqueda="FK_IdZona";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoFacturasProductossBusquedaProcesoFacturasProductos(String sFinalQuery,Long id_ciudad,Long id_zona,Long id_grupo_cliente,Long id_vendedor,String codigo,String nombre_completo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesofacturasproductosLogic.getProcesoFacturasProductossBusquedaProcesoFacturasProductos(sFinalQuery,this.pagination,id_ciudad,id_zona,id_grupo_cliente,id_vendedor,codigo,nombre_completo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoFacturasProductossFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesofacturasproductosLogic.getProcesoFacturasProductossFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoFacturasProductossFK_IdGrupoCliente(String sFinalQuery,Long id_grupo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesofacturasproductosLogic.getProcesoFacturasProductossFK_IdGrupoCliente(sFinalQuery,this.pagination,id_grupo_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoFacturasProductossFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesofacturasproductosLogic.getProcesoFacturasProductossFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoFacturasProductossFK_IdZona(String sFinalQuery,Long id_zona)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesofacturasproductosLogic.getProcesoFacturasProductossFK_IdZona(sFinalQuery,this.pagination,id_zona);
				
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
	
	public void inicializarPermisosProcesoFacturasProductos() {
		this.isPermisoTodoProcesoFacturasProductos=false;
		this.isPermisoNuevoProcesoFacturasProductos=false;
		this.isPermisoActualizarProcesoFacturasProductos=false;
		this.isPermisoActualizarOriginalProcesoFacturasProductos=false;
		this.isPermisoEliminarProcesoFacturasProductos=false;
		this.isPermisoGuardarCambiosProcesoFacturasProductos=false;
		this.isPermisoConsultaProcesoFacturasProductos=true;
		this.isPermisoBusquedaProcesoFacturasProductos=true;
		this.isPermisoReporteProcesoFacturasProductos=true;
		this.isPermisoOrdenProcesoFacturasProductos=false;		
		this.isPermisoPaginacionMedioProcesoFacturasProductos=false;		
		this.isPermisoPaginacionAltoProcesoFacturasProductos=false;		
		this.isPermisoPaginacionTodoProcesoFacturasProductos=false;		
		this.isPermisoCopiarProcesoFacturasProductos=false;		
		this.isPermisoVerFormProcesoFacturasProductos=false;		
		this.isPermisoDuplicarProcesoFacturasProductos=false;
		this.isPermisoOrdenProcesoFacturasProductos=false;
	}
	
	public void setPermisosUsuarioProcesoFacturasProductos(Boolean isPermiso) {
		this.isPermisoTodoProcesoFacturasProductos=isPermiso;
		this.isPermisoNuevoProcesoFacturasProductos=isPermiso;
		this.isPermisoActualizarProcesoFacturasProductos=isPermiso;
		this.isPermisoActualizarOriginalProcesoFacturasProductos=isPermiso;
		this.isPermisoEliminarProcesoFacturasProductos=isPermiso;
		this.isPermisoGuardarCambiosProcesoFacturasProductos=isPermiso;
		this.isPermisoConsultaProcesoFacturasProductos=isPermiso;
		this.isPermisoBusquedaProcesoFacturasProductos=isPermiso;
		this.isPermisoReporteProcesoFacturasProductos=isPermiso;
		this.isPermisoOrdenProcesoFacturasProductos=isPermiso;		
		this.isPermisoPaginacionMedioProcesoFacturasProductos=isPermiso;		
		this.isPermisoPaginacionAltoProcesoFacturasProductos=isPermiso;		
		this.isPermisoPaginacionTodoProcesoFacturasProductos=isPermiso;		
		this.isPermisoCopiarProcesoFacturasProductos=isPermiso;		
		this.isPermisoVerFormProcesoFacturasProductos=isPermiso;		
		this.isPermisoDuplicarProcesoFacturasProductos=isPermiso;
		this.isPermisoOrdenProcesoFacturasProductos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoFacturasProductos(Boolean isPermiso) {
		//this.isPermisoTodoProcesoFacturasProductos=isPermiso;
		this.isPermisoNuevoProcesoFacturasProductos=isPermiso;
		this.isPermisoActualizarProcesoFacturasProductos=isPermiso;
		this.isPermisoActualizarOriginalProcesoFacturasProductos=isPermiso;
		this.isPermisoEliminarProcesoFacturasProductos=isPermiso;
		this.isPermisoGuardarCambiosProcesoFacturasProductos=isPermiso;
		//this.isPermisoConsultaProcesoFacturasProductos=isPermiso;
		//this.isPermisoBusquedaProcesoFacturasProductos=isPermiso;
		//this.isPermisoReporteProcesoFacturasProductos=isPermiso;
		//this.isPermisoOrdenProcesoFacturasProductos=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoFacturasProductos=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoFacturasProductos=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoFacturasProductos=isPermiso;		
		//this.isPermisoCopiarProcesoFacturasProductos=isPermiso;		
		//this.isPermisoDuplicarProcesoFacturasProductos=isPermiso;
		//this.isPermisoOrdenProcesoFacturasProductos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoFacturasProductosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoFacturasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoFacturasProductos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoFacturasProductosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoFacturasProductosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoFacturasProductosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoFacturasProductosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoFacturasProductos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoFacturasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoFacturasProductosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoFacturasProductos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoFacturasProductos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoFacturasProductos=this.isPermisoActualizarProcesoFacturasProductos;
			this.isPermisoEliminarProcesoFacturasProductos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoFacturasProductos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoFacturasProductos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoFacturasProductos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoFacturasProductos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoFacturasProductos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoFacturasProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoFacturasProductos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoFacturasProductos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoFacturasProductos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoFacturasProductos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoFacturasProductos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoFacturasProductos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoFacturasProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoFacturasProductos.setToolTipText(this.jTableDatosProcesoFacturasProductos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoFacturasProductos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoFacturasProductos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoFacturasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoFacturasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoFacturasProductos() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoFacturasProductosListas()throws Exception {
		try	{						
			
				this.ciudadsForeignKey=new ArrayList();
				this.zonasForeignKey=new ArrayList();
				this.grupoclientesForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoFacturasProductosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoFacturasProductosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoFacturasProductos()throws Exception {
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
			if(this.procesofacturasproductosSessionBean==null) {
				this.procesofacturasproductosSessionBean=new ProcesoFacturasProductosSessionBean();
			}

			if(!this.procesofacturasproductosSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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

			if(!this.procesofacturasproductosSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
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

			if(!this.procesofacturasproductosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
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

			if(!this.procesofacturasproductosSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoFacturasProductos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoFacturasProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoFacturasProductos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoFacturasProductos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoFacturasProductos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoFacturasProductos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoFacturasProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoFacturasProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoFacturasProductos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoFacturasProductos()throws Exception {
		try {
			

			this.cargarCombosFrameCiudadsForeignKey("Todos");
			this.cargarCombosFrameZonasForeignKey("Todos");
			this.cargarCombosFrameGrupoClientesForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoFacturasProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoFacturasProductos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ProcesoFacturasProductosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoFacturasProductosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoFacturasProductosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesofacturasproductosSessionBean=new ProcesoFacturasProductosSessionBean(); 
		this.procesofacturasproductosConstantesFunciones=new ProcesoFacturasProductosConstantesFunciones(); 
		this.procesofacturasproductosBean=new ProcesoFacturasProductos();//(this.procesofacturasproductosConstantesFunciones); 		
		this.procesofacturasproductosReturnGeneral=new ProcesoFacturasProductosParameterReturnGeneral(); 
		
		this.procesofacturasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesofacturasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoFacturasProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoFacturasProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoFacturasProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoFacturasProductos(true);
			
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
			
			this.procesofacturasproductosConstantesFunciones=new ProcesoFacturasProductosConstantesFunciones(); 
			this.procesofacturasproductosBean=new ProcesoFacturasProductos();//this.procesofacturasproductosConstantesFunciones); 			
			this.procesofacturasproductosReturnGeneral=new ProcesoFacturasProductosParameterReturnGeneral(); 
		
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Facturas Productos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.procesofacturasproductos=new ProcesoFacturasProductos();
			this.procesofacturasproductoss = new ArrayList<ProcesoFacturasProductos>();
			this.procesofacturasproductossAux = new ArrayList<ProcesoFacturasProductos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic=new ProcesoFacturasProductosLogic();
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.procesofacturasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesofacturasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoFacturasProductos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoFacturasProductos);	
					}
					
					if(this.jInternalFrameImportacionProcesoFacturasProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoFacturasProductos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoFacturasProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoFacturasProductos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoFacturasProductos);
				this.jInternalFrameDetalleFormProcesoFacturasProductos.setVisible(false);
				this.jInternalFrameDetalleFormProcesoFacturasProductos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoFacturasProductos);
					this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoFacturasProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoFacturasProductos);
					this.jInternalFrameImportacionProcesoFacturasProductos.setVisible(false);
					this.jInternalFrameImportacionProcesoFacturasProductos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoFacturasProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoFacturasProductos);
					this.jInternalFrameOrderByProcesoFacturasProductos.setVisible(false);
					this.jInternalFrameOrderByProcesoFacturasProductos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoFacturasProductosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoFacturasProductosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesofacturasproductosReturnGeneral=new ProcesoFacturasProductosParameterReturnGeneral();
			
			this.procesofacturasproductosParameterGeneral=new ProcesoFacturasProductosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesofacturasproductosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoFacturasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoFacturasProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesofacturasproductosSessionBean.getEsGuardarRelacionado(),this.procesofacturasproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoFacturasProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesofacturasproductosSessionBean.getEsGuardarRelacionado(),this.procesofacturasproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoFacturasProductos=false;
			this.isVisibilidadCeldaDuplicarProcesoFacturasProductos=true;
			this.isVisibilidadCeldaCopiarProcesoFacturasProductos=true;
			this.isVisibilidadCeldaVerFormProcesoFacturasProductos=true;
			this.isVisibilidadCeldaOrdenProcesoFacturasProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=false;
			this.isVisibilidadCeldaModificarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaEliminarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaGuardarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=false;
			
			
			this.isVisibilidadBusquedaProcesoFacturasProductos=true;
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdGrupoCliente=true;
			this.isVisibilidadFK_IdVendedor=true;
			this.isVisibilidadFK_IdZona=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoFacturasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoFacturasProductos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoFacturasProductos(false);
			
			this.setPermisosUsuarioProcesoFacturasProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() 
				|| (this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() && this.procesofacturasproductosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoFacturasProductosClasesRelacionadas();
			}
			
			if(this.procesofacturasproductosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoFacturasProductosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoFacturasProductos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoFacturasProductos();
			}
			
			if(!this.isPermisoBusquedaProcesoFacturasProductos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoFacturasProductos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoFacturasProductosConstantesFunciones.getTiposSeleccionarProcesoFacturasProductos());
				
				this.tiposColumnasSelect=ProcesoFacturasProductosConstantesFunciones.getTiposSeleccionarProcesoFacturasProductos(true);
				
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
			//if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoFacturasProductos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProcesoFacturasProductos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProcesoFacturasProductos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoFacturasProductos() ;
			
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
				procesofacturasproductosImplementable= (ProcesoFacturasProductosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoFacturasProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesofacturasproductosImplementableHome= (ProcesoFacturasProductosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoFacturasProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesofacturasproductoss= new ArrayList<ProcesoFacturasProductos>();
			this.procesofacturasproductossEliminados= new ArrayList<ProcesoFacturasProductos>();
						
			this.isEsNuevoProcesoFacturasProductos=false;
			this.esParaAccionDesdeFormularioProcesoFacturasProductos=false;
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
				this.cargarCombosForeignKeyProcesoFacturasProductos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoFacturasProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoFacturasProductosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoFacturasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoFacturasProductos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoFacturasProductos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoFacturasProductos();
			}
			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoFacturasProductos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoFacturasProductos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoFacturasProductos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoFacturasProductos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoFacturasProductos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoFacturasProductos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoFacturasProductos")) {
				iIndex=this.jInternalFrameDetalleFormProcesoFacturasProductos.jTabbedPaneRelacionesProcesoFacturasProductos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoFacturasProductos.jTabbedPaneRelacionesProcesoFacturasProductos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoFacturasProductos();	
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
	
	public void cargarCombosForeignKeyProcesoFacturasProductos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoFacturasProductos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoFacturasProductos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoFacturasProductosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoFacturasProductos();
		
		this.cargarCombosFrameForeignKeyProcesoFacturasProductos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoFacturasProductos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoFacturasProductos();
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
	
	public void jButtonNuevoProcesoFacturasProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesofacturasproductosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			
			
			if(jTableDatosProcesoFacturasProductos.getRowCount()>=1) {
				jTableDatosProcesoFacturasProductos.removeRowSelectionInterval(0, jTableDatosProcesoFacturasProductos.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoFacturasProductos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoFacturasProductos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoFacturasProductos(true);			
			//this.procesofacturasproductos=new ProcesoFacturasProductos();
			//this.procesofacturasproductos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoFacturasProductos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoFacturasProductos() ;
			
			if(ProcesoFacturasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoFacturasProductos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesofacturasproductos);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);				
			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			
			if(this.procesofacturasproductosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoFacturasProductos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoFacturasProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoFacturasProductos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoFacturasProductos.getSelectedRows().length;			
			}
			
			procesofacturasproductossSeleccionados=this.getProcesoFacturasProductossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoFacturasProductos--;			
				//ProcesoFacturasProductos procesofacturasproductosAux= new ProcesoFacturasProductos();			
				//procesofacturasproductosAux.setId(this.iIdNuevoProcesoFacturasProductos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoFacturasProductos procesofacturasproductosOrigen=new ProcesoFacturasProductos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoFacturasProductos procesofacturasproductosOrigen : procesofacturasproductossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesofacturasproductosOrigen =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesofacturasproductosOrigen =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoFacturasProductos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesofacturasproductos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoFacturasProductos(procesofacturasproductosOrigen,this.procesofacturasproductos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesofacturasproductosLogic.getProcesoFacturasProductoss().add(this.procesofacturasproductosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductoss.add(this.procesofacturasproductosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
				
				this.jTableDatosProcesoFacturasProductos.setRowSelectionInterval(this.getIndiceNuevoProcesoFacturasProductos(), this.getIndiceNuevoProcesoFacturasProductos());
				
				int iLastRow =  this.jTableDatosProcesoFacturasProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoFacturasProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoFacturasProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();									
		
			ProcesoFacturasProductos procesofacturasproductosOrigen=new ProcesoFacturasProductos();
			ProcesoFacturasProductos procesofacturasproductosDestino=new ProcesoFacturasProductos();
				
			procesofacturasproductossSeleccionados=this.getProcesoFacturasProductossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoFacturasProductos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesofacturasproductossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoFacturasProductos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesofacturasproductosOrigen =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesofacturasproductosOrigen =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesofacturasproductosDestino =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesofacturasproductosDestino =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesofacturasproductosOrigen =procesofacturasproductossSeleccionados.get(0);
				procesofacturasproductosDestino =procesofacturasproductossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoFacturasProductos(procesofacturasproductosOrigen,procesofacturasproductosDestino,true,false);
				
				procesofacturasproductosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesofacturasproductosDestino,procesofacturasproductosLogic.getProcesoFacturasProductoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesofacturasproductosDestino,procesofacturasproductoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
				
				//this.jTableDatosProcesoFacturasProductos.setRowSelectionInterval(this.getIndiceNuevoProcesoFacturasProductos(), this.getIndiceNuevoProcesoFacturasProductos());
				
				int iLastRow =  this.jTableDatosProcesoFacturasProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoFacturasProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoFacturasProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoFacturasProductos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoFacturasProductos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoFacturasProductos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoFacturasProductos.setVisible(!isVisible);
			this.jPanelPaginacionProcesoFacturasProductos.setVisible(!isVisible);
			this.jPanelAccionesProcesoFacturasProductos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoFacturasProductos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoFacturasProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoFacturasProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoFacturasProductos();
			
			this.abrirFrameOrderByProcesoFacturasProductos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoFacturasProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoFacturasProductos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoFacturasProductos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoFacturasProductos.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoFacturasProductos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoFacturasProductos.setSize(this.jInternalFrameDetalleFormProcesoFacturasProductos.iWidthFormulario,this.jInternalFrameDetalleFormProcesoFacturasProductos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoFacturasProductos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoFacturasProductos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoFacturasProductos.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoFacturasProductos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoFacturasProductos.jContentPaneDetalleProcesoFacturasProductos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoFacturasProductos.jTabbedPaneRelacionesProcesoFacturasProductos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoFacturasProductos.jContentPaneDetalleProcesoFacturasProductos.getWidth(),ProcesoFacturasProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoFacturasProductos.jTabbedPaneRelacionesProcesoFacturasProductos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoFacturasProductos.jContentPaneDetalleProcesoFacturasProductos.getWidth(),ProcesoFacturasProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoFacturasProductos.jTabbedPaneRelacionesProcesoFacturasProductos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoFacturasProductos.jContentPaneDetalleProcesoFacturasProductos.getWidth(),ProcesoFacturasProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoFacturasProductos.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoFacturasProductos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoFacturasProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoFacturasProductos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoFacturasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoFacturasProductos,false,this);
				} else {
					this.jInternalFrameOrderByProcesoFacturasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoFacturasProductos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoFacturasProductos);
				this.jInternalFrameOrderByProcesoFacturasProductos.setVisible(false);
				this.jInternalFrameOrderByProcesoFacturasProductos.setSelected(false);
				
				this.jInternalFrameOrderByProcesoFacturasProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoFacturasProductos"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoFacturasProductos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoFacturasProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoFacturasProductos==null) {
				
				this.jInternalFrameImportacionProcesoFacturasProductos=new ImportacionJInternalFrame(ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoFacturasProductos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoFacturasProductos);
				this.jInternalFrameImportacionProcesoFacturasProductos.setVisible(false);
				this.jInternalFrameImportacionProcesoFacturasProductos.setSelected(false);


				this.jInternalFrameImportacionProcesoFacturasProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoFacturasProductos"));
				this.jInternalFrameImportacionProcesoFacturasProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoFacturasProductos"));
				this.jInternalFrameImportacionProcesoFacturasProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoFacturasProductos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoFacturasProductos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos==null) {
				this.jInternalFrameReporteDinamicoProcesoFacturasProductos=new ReporteDinamicoJInternalFrame(ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoFacturasProductos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoFacturasProductos);
				this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoFacturasProductos"));
				this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoFacturasProductos"));
				this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoFacturasProductos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoFacturasProductos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoFacturasProductos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoFacturasProductos);
			
	       	this.jInternalFrameDetalleFormProcesoFacturasProductos.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoFacturasProductos.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoFacturasProductos.dispose();
			//this.jInternalFrameDetalleFormProcesoFacturasProductos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoFacturasProductos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoFacturasProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoFacturasProductos.setVisible(true);
	        this.jInternalFrameImportacionProcesoFacturasProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoFacturasProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoFacturasProductos.setVisible(true);
	        this.jInternalFrameOrderByProcesoFacturasProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoFacturasProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoFacturasProductos.setVisible(false);
	        this.jInternalFrameOrderByProcesoFacturasProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoFacturasProductos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoFacturasProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoFacturasProductos.setVisible(false);
	        this.jInternalFrameImportacionProcesoFacturasProductos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoFacturasProductos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoFacturasProductos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoFacturasProductos(true);
			//this.isEsNuevoProcesoFacturasProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoFacturasProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoFacturasProductos(false) ;
			
			if(procesofacturasproductosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoFacturasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoFacturasProductos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoFacturasProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoFacturasProductosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoFacturasProductos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoFacturasProductos(true);
			//this.isEsNuevoProcesoFacturasProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesofacturasproductos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoFacturasProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoFacturasProductos(false) ;
			
			if(ProcesoFacturasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoFacturasProductos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoFacturasProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoFacturasProductos.getSelectedRow();

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
		TableColumn tableColumnZona=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_IDZONA));
		TableCellEditor tableCellEditorZona =tableColumnZona.getCellEditor();

		ZonaTableCell zonaTableCellFk=(ZonaTableCell)tableCellEditorZona;

		if(zonaTableCellFk!=null) {
			zonaTableCellFk.setzonasForeignKey(zonasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoFacturasProductos.getSelectedRow();

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
		TableColumn tableColumnGrupoCliente=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_IDGRUPOCLIENTE));
		TableCellEditor tableCellEditorGrupoCliente =tableColumnGrupoCliente.getCellEditor();

		GrupoClienteTableCell grupoclienteTableCellFk=(GrupoClienteTableCell)tableCellEditorGrupoCliente;

		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.setgrupoclientesForeignKey(grupoclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoFacturasProductos.getSelectedRow();

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
		TableColumn tableColumnVendedor=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoFacturasProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoFacturasProductos(false);
			
			//if(!this.isEsNuevoProcesoFacturasProductos) {								
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				
			}
			
			if(this.permiteMantenimiento(this.procesofacturasproductos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoFacturasProductos=true;
					this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
					this.isEsNuevoProcesoFacturasProductos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoFacturasProductos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoFacturasProductos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoFacturasProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoFacturasProductos(false);
				
				this.habilitarDeshabilitarControlesProcesoFacturasProductos(false);
			
												
				
				if(ProcesoFacturasProductosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoFacturasProductos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoFacturasProductosActionPerformed(evt,procesofacturasproductosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoFacturasProductos(this.procesofacturasproductos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoFacturasProductos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesofacturasproductosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesofacturasproductos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoFacturasProductos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoFacturasProductos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				this.procesofacturasproductos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				this.procesofacturasproductos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesofacturasproductos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoFacturasProductosModel) this.jTableDatosProcesoFacturasProductos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoFacturasProductos=true;
				this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
				this.isEsNuevoProcesoFacturasProductos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoFacturasProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoFacturasProductos(false);
				
				this.habilitarDeshabilitarControlesProcesoFacturasProductos(false);
				
				
				
				if(ProcesoFacturasProductosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoFacturasProductos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoFacturasProductos.getRowCount()>=1) {
				jTableDatosProcesoFacturasProductos.removeRowSelectionInterval(0, jTableDatosProcesoFacturasProductos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoFacturasProductos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoFacturasProductos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoFacturasProductos(false) ;
			
			this.isEsNuevoProcesoFacturasProductos=false;
			
			if(ProcesoFacturasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoFacturasProductos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoFacturasProductos(false);
				
				//SI ES MANUAL
				if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoFacturasProductos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoFacturasProductos--;			
			//ProcesoFacturasProductos procesofacturasproductosAux= new ProcesoFacturasProductos();			
			//procesofacturasproductosAux.setId(this.iIdNuevoProcesoFacturasProductos);
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoFacturasProductos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
			
			this.procesofacturasproductos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesofacturasproductosLogic.getProcesoFacturasProductoss().add(this.procesofacturasproductosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesofacturasproductoss.add(this.procesofacturasproductosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
			
			this.jTableDatosProcesoFacturasProductos.setRowSelectionInterval(this.getIndiceNuevoProcesoFacturasProductos(), this.getIndiceNuevoProcesoFacturasProductos());
			
			int iLastRow =  this.jTableDatosProcesoFacturasProductos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoFacturasProductos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoFacturasProductos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoFacturasProductos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoFacturasProductos(false);
			
			//SI ES MANUAL
			if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoFacturasProductos();
			}
			
			//this.abrirFrameTreeProcesoFacturasProductos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoFacturasProductos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoFacturasProductos.setFileImportacion(this.jInternalFrameImportacionProcesoFacturasProductos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoFacturasProductos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoFacturasProductos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoFacturasProductos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoFacturasProductos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();		

		procesofacturasproductossSeleccionados=this.getProcesoFacturasProductossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoFacturasProductosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoFacturasProductosBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoFacturasProductoss("Todos",procesofacturasproductossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Facturas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProvincia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProvincia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProvincia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProvincia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCiudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCiudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCiudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCiudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreZona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreZona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreZona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreZona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGrupoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGrupoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGrupoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGrupoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoDato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoDato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoDato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoDato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpresoFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpresoFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpresoFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpresoFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rea_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					sNombreCampoCategoria="nombre_provincia";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoria="nombre_ciudad";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoria="nombre_zona";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoria="nombre_grupo_cliente";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO:
					sNombreCampoCategoria="codigo_dato";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO:
					sNombreCampoCategoria="nombre_completo_dato";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoria="numero_pre_impreso_factura";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA:
					sNombreCampoCategoria="tarea";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					sNombreCampoCategoriaValor="nombre_provincia";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoriaValor="nombre_ciudad";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoriaValor="nombre_zona";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoriaValor="nombre_grupo_cliente";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO:
					sNombreCampoCategoriaValor="codigo_dato";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO:
					sNombreCampoCategoriaValor="nombre_completo_dato";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoriaValor="numero_pre_impreso_factura";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA:
					sNombreCampoCategoriaValor="tarea";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Provincia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_provincia");
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_ciudad");
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Zona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_zona");
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Grupo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_grupo_cliente");
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Dato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_dato");
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Dato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_dato");
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso_factura");
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tarea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tarea");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();		
		
		procesofacturasproductossSeleccionados=this.getProcesoFacturasProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesofacturasproductos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoFacturasProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoFacturasProductosConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_IDZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_IDZONA);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getzona_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getgrupocliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getnombre_provincia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getnombre_ciudad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getnombre_zona());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getnombre_grupo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getcodigo_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getnombre_completo_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getnumero_pre_impreso_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA);
					iRow++;

					for(ProcesoFacturasProductos procesofacturasproductos:procesofacturasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesofacturasproductos.gettarea());
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
			//	this.getFilaCabeceraExportarExcelProcesoFacturasProductos(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoFacturasProductos procesofacturasproductosAux:procesofacturasproductossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoFacturasProductos(procesofacturasproductosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Facturas Productos",JOptionPane.INFORMATION_MESSAGE);
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
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoFacturasProductos(false);
			
			//SI ES MANUAL
			if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoFacturasProductos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoFacturasProductos(false);
			
			//SI ES MANUAL
			if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoFacturasProductos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoFacturasProductos(false);
			
			//SI ES MANUAL
			if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoFacturasProductos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoFacturasProductos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoFacturasProductos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoFacturasProductos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoFacturasProductos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoFacturasProductos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoFacturasProductos.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoFacturasProductos.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoFacturasProductos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoFacturasProductos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoFacturasProductos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoFacturasProductos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoFacturasProductos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoFacturasProductos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoFacturasProductos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoFacturasProductos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoFacturasProductos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoFacturasProductos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoFacturasProductos();
		
		this.inicializarActualizarBindingBotonesManualProcesoFacturasProductos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoFacturasProductos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoFacturasProductos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoFacturasProductos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoFacturasProductos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoFacturasProductos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoFacturasProductos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoFacturasProductos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoFacturasProductos.jCheckBoxPostAccionNuevoProcesoFacturasProductos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoFacturasProductos.jCheckBoxPostAccionSinCerrarProcesoFacturasProductos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoFacturasProductos.jCheckBoxPostAccionSinMensajeProcesoFacturasProductos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoFacturasProductos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoFacturasProductos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoFacturasProductos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
				this.jInternalFrameDetalleFormProcesoFacturasProductos.jCheckBoxPostAccionNuevoProcesoFacturasProductos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoFacturasProductos.jCheckBoxPostAccionSinCerrarProcesoFacturasProductos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoFacturasProductos.jCheckBoxPostAccionSinMensajeProcesoFacturasProductos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoFacturasProductos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoFacturasProductos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoFacturasProductos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoFacturasProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoFacturasProductos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoFacturasProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoFacturasProductos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoFacturasProductos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoFacturasProductos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoFacturasProductos(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoFacturasProductos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoFacturasProductos() throws Exception {
		try	{
			if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoFacturasProductos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoFacturasProductos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoFacturasProductos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoFacturasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoFacturasProductos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoFacturasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoFacturasProductos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoFacturasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoFacturasProductos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoFacturasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoFacturasProductos.addItem(reporte);
			}
			
			
			if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoFacturasProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoFacturasProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoFacturasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoFacturasProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoFacturasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoFacturasProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoFacturasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoFacturasProductos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoFacturasProductos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoFacturasProductos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoFacturasProductos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos!=null) {
				this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos!=null) {
				this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProcesoFacturasProductosConstantesFunciones.getTiposSeleccionarProcesoFacturasProductos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProcesoFacturasProductosConstantesFunciones.getTiposSeleccionarProcesoFacturasProductos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProcesoFacturasProductosConstantesFunciones.getTiposSeleccionarProcesoFacturasProductos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoFacturasProductos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.getSelectedItem()!=null){this.id_ciudadBusquedaProcesoFacturasProductos=((Ciudad)this.jComboBoxid_ciudadBusquedaProcesoFacturasProductosProcesoFacturasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.getSelectedItem()!=null){this.id_zonaBusquedaProcesoFacturasProductos=((Zona)this.jComboBoxid_zonaBusquedaProcesoFacturasProductosProcesoFacturasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.getSelectedItem()!=null){this.id_grupo_clienteBusquedaProcesoFacturasProductos=((GrupoCliente)this.jComboBoxid_grupo_clienteBusquedaProcesoFacturasProductosProcesoFacturasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.getSelectedItem()!=null){this.id_vendedorBusquedaProcesoFacturasProductos=((Vendedor)this.jComboBoxid_vendedorBusquedaProcesoFacturasProductosProcesoFacturasProductos.getSelectedItem()).getId();}
		this.codigoBusquedaProcesoFacturasProductos=this.jTextFieldcodigoBusquedaProcesoFacturasProductosProcesoFacturasProductos.getText();
		this.nombre_completoBusquedaProcesoFacturasProductos=this.jTextAreanombre_completoBusquedaProcesoFacturasProductosProcesoFacturasProductos.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoFacturasProductos(Boolean esInicializar) throws Exception {				
		if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoFacturasProductos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoFacturasProductos() throws Exception {
		this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoFacturasProductos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoFacturasProductosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoFacturasProductos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesofacturasproductosLogic.getProcesoFacturasProductoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesofacturasproductoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoFacturasProductos.setModel(new ProcesoFacturasProductosModel(this.procesofacturasproductosLogic.getProcesoFacturasProductoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoFacturasProductos.setModel(new ProcesoFacturasProductosModel(this.procesofacturasproductoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoFacturasProductos!=null && this.jInternalFrameOrderByProcesoFacturasProductos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoFacturasProductos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO,procesofacturasproductosConstantesFunciones.resaltarSeleccionarProcesoFacturasProductos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO,procesofacturasproductosConstantesFunciones.resaltarSeleccionarProcesoFacturasProductos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_ID));

		if(this.procesofacturasproductosConstantesFunciones.mostraridProcesoFacturasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoFacturasProductosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesofacturasproductosConstantesFunciones.resaltaridProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activaridProcesoFacturasProductos,iSizeTabla,this,true,"idProcesoFacturasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesofacturasproductosConstantesFunciones.resaltaridProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activaridProcesoFacturasProductos,this,true,"idProcesoFacturasProductos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA));

		if(this.procesofacturasproductosConstantesFunciones.mostrarnombre_provinciaProcesoFacturasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_provinciaProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_provinciaProcesoFacturasProductos,iSizeTabla,this,true,"nombre_provinciaProcesoFacturasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_provinciaProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_provinciaProcesoFacturasProductos,this,true,"nombre_provinciaProcesoFacturasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD));

		if(this.procesofacturasproductosConstantesFunciones.mostrarnombre_ciudadProcesoFacturasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_ciudadProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_ciudadProcesoFacturasProductos,iSizeTabla,this,true,"nombre_ciudadProcesoFacturasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_ciudadProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_ciudadProcesoFacturasProductos,this,true,"nombre_ciudadProcesoFacturasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA));

		if(this.procesofacturasproductosConstantesFunciones.mostrarnombre_zonaProcesoFacturasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_zonaProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_zonaProcesoFacturasProductos,iSizeTabla,this,true,"nombre_zonaProcesoFacturasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_zonaProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_zonaProcesoFacturasProductos,this,true,"nombre_zonaProcesoFacturasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE));

		if(this.procesofacturasproductosConstantesFunciones.mostrarnombre_grupo_clienteProcesoFacturasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_grupo_clienteProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_grupo_clienteProcesoFacturasProductos,iSizeTabla,this,true,"nombre_grupo_clienteProcesoFacturasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_grupo_clienteProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_grupo_clienteProcesoFacturasProductos,this,true,"nombre_grupo_clienteProcesoFacturasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO));

		if(this.procesofacturasproductosConstantesFunciones.mostrarcodigo_datoProcesoFacturasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesofacturasproductosConstantesFunciones.resaltarcodigo_datoProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarcodigo_datoProcesoFacturasProductos,iSizeTabla,this,true,"codigo_datoProcesoFacturasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesofacturasproductosConstantesFunciones.resaltarcodigo_datoProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarcodigo_datoProcesoFacturasProductos,this,true,"codigo_datoProcesoFacturasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO));

		if(this.procesofacturasproductosConstantesFunciones.mostrarnombre_completo_datoProcesoFacturasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_completo_datoProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_completo_datoProcesoFacturasProductos,iSizeTabla,this,true,"nombre_completo_datoProcesoFacturasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_completo_datoProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_completo_datoProcesoFacturasProductos,this,true,"nombre_completo_datoProcesoFacturasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA));

		if(this.procesofacturasproductosConstantesFunciones.mostrarnumero_pre_impreso_facturaProcesoFacturasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnumero_pre_impreso_facturaProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnumero_pre_impreso_facturaProcesoFacturasProductos,iSizeTabla,this,true,"numero_pre_impreso_facturaProcesoFacturasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnumero_pre_impreso_facturaProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnumero_pre_impreso_facturaProcesoFacturasProductos,this,true,"numero_pre_impreso_facturaProcesoFacturasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.procesofacturasproductosConstantesFunciones.mostrarnombre_productoProcesoFacturasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_productoProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_productoProcesoFacturasProductos,iSizeTabla,this,true,"nombre_productoProcesoFacturasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_productoProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_productoProcesoFacturasProductos,this,true,"nombre_productoProcesoFacturasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.procesofacturasproductosConstantesFunciones.mostrarnombre_unidadProcesoFacturasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_unidadProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_unidadProcesoFacturasProductos,iSizeTabla,this,true,"nombre_unidadProcesoFacturasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesofacturasproductosConstantesFunciones.resaltarnombre_unidadProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarnombre_unidadProcesoFacturasProductos,this,true,"nombre_unidadProcesoFacturasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO));

		if(this.procesofacturasproductosConstantesFunciones.mostrarprecioProcesoFacturasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesofacturasproductosConstantesFunciones.resaltarprecioProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarprecioProcesoFacturasProductos,iSizeTabla,this,true,"precioProcesoFacturasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesofacturasproductosConstantesFunciones.resaltarprecioProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activarprecioProcesoFacturasProductos,this,true,"precioProcesoFacturasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA));

		if(this.procesofacturasproductosConstantesFunciones.mostrartareaProcesoFacturasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesofacturasproductosConstantesFunciones.resaltartareaProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activartareaProcesoFacturasProductos,iSizeTabla,this,true,"tareaProcesoFacturasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesofacturasproductosConstantesFunciones.resaltartareaProcesoFacturasProductos,this.procesofacturasproductosConstantesFunciones.activartareaProcesoFacturasProductos,this,true,"tareaProcesoFacturasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoFacturasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesofacturasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesofacturasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoFacturasProductos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesofacturasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesofacturasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoFacturasProductos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoFacturasProductos && this.isPermisoGuardarCambiosProcesoFacturasProductos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesofacturasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesofacturasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoFacturasProductos.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoFacturasProductos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoFacturasProductos && this.isPermisoGuardarCambiosProcesoFacturasProductos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoFacturasProductos && this.isPermisoGuardarCambiosProcesoFacturasProductos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoFacturasProductos.moveColumn(this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoFacturasProductos.moveColumn(this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoFacturasProductos.moveColumn(this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoFacturasProductos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoFacturasProductos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoFacturasProductos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoFacturasProductos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoFacturasProductos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoFacturasProductos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesofacturasproductosLogic.getProcesoFacturasProductoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesofacturasproductoss.size()-1;
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
		//this.jTableDatosProcesoFacturasProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoFacturasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoFacturasProductos();
			
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
				
				//this.isEsNuevoProcesoFacturasProductos=false;
					
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			
				if(this.procesofacturasproductosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoFacturasProductos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoFacturasProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoFacturasProductos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesofacturasproductos.getsType().equals("DUPLICADO")
				   || this.procesofacturasproductos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoFacturasProductos=true;
				
				} else {
					this.isEsNuevoProcesoFacturasProductos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
					if(this.procesofacturasproductos.getId()>=0 && !this.procesofacturasproductos.getIsNew()) {						
						this.isEsNuevoProcesoFacturasProductos=false;
						
					} else {
						this.isEsNuevoProcesoFacturasProductos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoFacturasProductos(esRelaciones);						
				
				this.seleccionarProcesoFacturasProductos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesofacturasproductos.getId()<0) {
					this.isEsNuevoProcesoFacturasProductos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoFacturasProductos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoFacturasProductos(evt,rowIndex);
				}	
				
				if(this.procesofacturasproductosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoFacturasProductos: " + this.dDif); 
					}
				}								
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoFacturasProductos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesofacturasproductos)) {
					if(this.procesofacturasproductos.getId()>0) {
						this.procesofacturasproductos.setIsDeleted(true);
						
						this.procesofacturasproductossEliminados.add(this.procesofacturasproductos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesofacturasproductosLogic.getProcesoFacturasProductoss().remove(this.procesofacturasproductos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductoss.remove(this.procesofacturasproductos);				
					}
					
					
					((ProcesoFacturasProductosModel) this.jTableDatosProcesoFacturasProductos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoFacturasProductos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoFacturasProductos) {
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoFacturasProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoFacturasProductos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoFacturasProductos(this.procesofacturasproductos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoFacturasProductos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoFacturasProductos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoFacturasProductos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoFacturasProductos(procesofacturasproductos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoFacturasProductos(procesofacturasproductos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoFacturasProductos(procesofacturasproductos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoFacturasProductos(procesofacturasproductos);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelidProcesoFacturasProductos.setText(procesofacturasproductos.getId().toString());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_provinciaProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_provincia());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_ciudadProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_ciudad());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_zonaProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_zona());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_grupo_clienteProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldcodigo_datoProcesoFacturasProductos.setText(procesofacturasproductos.getcodigo_dato());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_completo_datoProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_completo_dato());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.setText(procesofacturasproductos.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_productoProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_producto());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_unidadProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_unidad());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldprecioProcesoFacturasProductos.setText(procesofacturasproductos.getprecio().toString());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreatareaProcesoFacturasProductos.setText(procesofacturasproductos.gettarea());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoFacturasProductos procesofacturasproductosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesofacturasproductosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoFacturasProductos procesofacturasproductosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesofacturasproductosLocal=this.procesofacturasproductos;
			} else {
				procesofacturasproductosLocal=this.procesofacturasproductosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesofacturasproductosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoFacturasProductos(procesofacturasproductosLocal,true);
					
					if(procesofacturasproductosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesofacturasproductosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesofacturasproductosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(procesofacturasproductos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(procesofacturasproductos);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(procesofacturasproductos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelidProcesoFacturasProductos.getText()==null || this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelidProcesoFacturasProductos.getText()=="" || this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelidProcesoFacturasProductos.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelidProcesoFacturasProductos.setText("0");
			}

			if(conColumnasBase) {procesofacturasproductos.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelidProcesoFacturasProductos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoFacturasProductosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelIdProcesoFacturasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesofacturasproductos.setnombre_provincia(this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_provinciaProcesoFacturasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_provinciaProcesoFacturasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesofacturasproductos.setnombre_ciudad(this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_ciudadProcesoFacturasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_ciudadProcesoFacturasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesofacturasproductos.setnombre_zona(this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_zonaProcesoFacturasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_zonaProcesoFacturasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesofacturasproductos.setnombre_grupo_cliente(this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_grupo_clienteProcesoFacturasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_grupo_clienteProcesoFacturasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesofacturasproductos.setcodigo_dato(this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldcodigo_datoProcesoFacturasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelcodigo_datoProcesoFacturasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesofacturasproductos.setnombre_completo_dato(this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_completo_datoProcesoFacturasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_completo_datoProcesoFacturasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesofacturasproductos.setnumero_pre_impreso_factura(this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnumero_pre_impreso_facturaProcesoFacturasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesofacturasproductos.setnombre_producto(this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_productoProcesoFacturasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_productoProcesoFacturasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesofacturasproductos.setnombre_unidad(this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_unidadProcesoFacturasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelnombre_unidadProcesoFacturasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesofacturasproductos.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldprecioProcesoFacturasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelprecioProcesoFacturasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesofacturasproductos.settarea(this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreatareaProcesoFacturasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabeltareaProcesoFacturasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductosBean,ProcesoFacturasProductos procesofacturasproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductosOrigen,ProcesoFacturasProductos procesofacturasproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesofacturasproductosOrigen.getId()!=null && !procesofacturasproductosOrigen.getId().equals(0L))) {procesofacturasproductos.setId(procesofacturasproductosOrigen.getId());}}
			if(conDefault || (!conDefault && procesofacturasproductosOrigen.getcodigo()!=null && !procesofacturasproductosOrigen.getcodigo().equals(""))) {procesofacturasproductos.setcodigo(procesofacturasproductosOrigen.getcodigo());}
			if(conDefault || (!conDefault && procesofacturasproductosOrigen.getnombre_completo()!=null && !procesofacturasproductosOrigen.getnombre_completo().equals(""))) {procesofacturasproductos.setnombre_completo(procesofacturasproductosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && procesofacturasproductosOrigen.getnombre_provincia()!=null && !procesofacturasproductosOrigen.getnombre_provincia().equals(""))) {procesofacturasproductos.setnombre_provincia(procesofacturasproductosOrigen.getnombre_provincia());}
			if(conDefault || (!conDefault && procesofacturasproductosOrigen.getnombre_ciudad()!=null && !procesofacturasproductosOrigen.getnombre_ciudad().equals(""))) {procesofacturasproductos.setnombre_ciudad(procesofacturasproductosOrigen.getnombre_ciudad());}
			if(conDefault || (!conDefault && procesofacturasproductosOrigen.getnombre_zona()!=null && !procesofacturasproductosOrigen.getnombre_zona().equals(""))) {procesofacturasproductos.setnombre_zona(procesofacturasproductosOrigen.getnombre_zona());}
			if(conDefault || (!conDefault && procesofacturasproductosOrigen.getnombre_grupo_cliente()!=null && !procesofacturasproductosOrigen.getnombre_grupo_cliente().equals(""))) {procesofacturasproductos.setnombre_grupo_cliente(procesofacturasproductosOrigen.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && procesofacturasproductosOrigen.getcodigo_dato()!=null && !procesofacturasproductosOrigen.getcodigo_dato().equals(""))) {procesofacturasproductos.setcodigo_dato(procesofacturasproductosOrigen.getcodigo_dato());}
			if(conDefault || (!conDefault && procesofacturasproductosOrigen.getnombre_completo_dato()!=null && !procesofacturasproductosOrigen.getnombre_completo_dato().equals(""))) {procesofacturasproductos.setnombre_completo_dato(procesofacturasproductosOrigen.getnombre_completo_dato());}
			if(conDefault || (!conDefault && procesofacturasproductosOrigen.getnumero_pre_impreso_factura()!=null && !procesofacturasproductosOrigen.getnumero_pre_impreso_factura().equals(""))) {procesofacturasproductos.setnumero_pre_impreso_factura(procesofacturasproductosOrigen.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && procesofacturasproductosOrigen.getnombre_producto()!=null && !procesofacturasproductosOrigen.getnombre_producto().equals(""))) {procesofacturasproductos.setnombre_producto(procesofacturasproductosOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && procesofacturasproductosOrigen.getnombre_unidad()!=null && !procesofacturasproductosOrigen.getnombre_unidad().equals(""))) {procesofacturasproductos.setnombre_unidad(procesofacturasproductosOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && procesofacturasproductosOrigen.getprecio()!=null && !procesofacturasproductosOrigen.getprecio().equals(0.0))) {procesofacturasproductos.setprecio(procesofacturasproductosOrigen.getprecio());}
			if(conDefault || (!conDefault && procesofacturasproductosOrigen.gettarea()!=null && !procesofacturasproductosOrigen.gettarea().equals(""))) {procesofacturasproductos.settarea(procesofacturasproductosOrigen.gettarea());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelidProcesoFacturasProductos.setText(procesofacturasproductos.getId().toString());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_provinciaProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_provincia());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_ciudadProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_ciudad());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_zonaProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_zona());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_grupo_clienteProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldcodigo_datoProcesoFacturasProductos.setText(procesofacturasproductos.getcodigo_dato());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_completo_datoProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_completo_dato());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.setText(procesofacturasproductos.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_productoProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_producto());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_unidadProcesoFacturasProductos.setText(procesofacturasproductos.getnombre_unidad());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldprecioProcesoFacturasProductos.setText(procesofacturasproductos.getprecio().toString());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreatareaProcesoFacturasProductos.setText(procesofacturasproductos.gettarea());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoFacturasProductos(ProcesoFacturasProductosBean procesofacturasproductosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelidProcesoFacturasProductos.setText(procesofacturasproductosBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_provinciaProcesoFacturasProductos.setText(procesofacturasproductosBean.getnombre_provincia());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_ciudadProcesoFacturasProductos.setText(procesofacturasproductosBean.getnombre_ciudad());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_zonaProcesoFacturasProductos.setText(procesofacturasproductosBean.getnombre_zona());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_grupo_clienteProcesoFacturasProductos.setText(procesofacturasproductosBean.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldcodigo_datoProcesoFacturasProductos.setText(procesofacturasproductosBean.getcodigo_dato());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_completo_datoProcesoFacturasProductos.setText(procesofacturasproductosBean.getnombre_completo_dato());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.setText(procesofacturasproductosBean.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_productoProcesoFacturasProductos.setText(procesofacturasproductosBean.getnombre_producto());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_unidadProcesoFacturasProductos.setText(procesofacturasproductosBean.getnombre_unidad());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldprecioProcesoFacturasProductos.setText(procesofacturasproductosBean.getprecio().toString());
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreatareaProcesoFacturasProductos.setText(procesofacturasproductosBean.gettarea());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoFacturasProductos(ProcesoFacturasProductosParameterReturnGeneral procesofacturasproductosReturnGeneral,ProcesoFacturasProductosBean procesofacturasproductosBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoFacturasProductos procesofacturasproductosLocal=new ProcesoFacturasProductos();
			
			procesofacturasproductosLocal=procesofacturasproductosReturnGeneral.getProcesoFacturasProductos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesofacturasproductosLocal.getId()!=null && !procesofacturasproductosLocal.getId().equals(0L))) {procesofacturasproductosBean.setId(procesofacturasproductosLocal.getId());}}
			if(conDefault || (!conDefault && procesofacturasproductosLocal.getnombre_provincia()!=null && !procesofacturasproductosLocal.getnombre_provincia().equals(""))) {procesofacturasproductosBean.setnombre_provincia(procesofacturasproductosLocal.getnombre_provincia());}
			if(conDefault || (!conDefault && procesofacturasproductosLocal.getnombre_ciudad()!=null && !procesofacturasproductosLocal.getnombre_ciudad().equals(""))) {procesofacturasproductosBean.setnombre_ciudad(procesofacturasproductosLocal.getnombre_ciudad());}
			if(conDefault || (!conDefault && procesofacturasproductosLocal.getnombre_zona()!=null && !procesofacturasproductosLocal.getnombre_zona().equals(""))) {procesofacturasproductosBean.setnombre_zona(procesofacturasproductosLocal.getnombre_zona());}
			if(conDefault || (!conDefault && procesofacturasproductosLocal.getnombre_grupo_cliente()!=null && !procesofacturasproductosLocal.getnombre_grupo_cliente().equals(""))) {procesofacturasproductosBean.setnombre_grupo_cliente(procesofacturasproductosLocal.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && procesofacturasproductosLocal.getcodigo_dato()!=null && !procesofacturasproductosLocal.getcodigo_dato().equals(""))) {procesofacturasproductosBean.setcodigo_dato(procesofacturasproductosLocal.getcodigo_dato());}
			if(conDefault || (!conDefault && procesofacturasproductosLocal.getnombre_completo_dato()!=null && !procesofacturasproductosLocal.getnombre_completo_dato().equals(""))) {procesofacturasproductosBean.setnombre_completo_dato(procesofacturasproductosLocal.getnombre_completo_dato());}
			if(conDefault || (!conDefault && procesofacturasproductosLocal.getnumero_pre_impreso_factura()!=null && !procesofacturasproductosLocal.getnumero_pre_impreso_factura().equals(""))) {procesofacturasproductosBean.setnumero_pre_impreso_factura(procesofacturasproductosLocal.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && procesofacturasproductosLocal.getnombre_producto()!=null && !procesofacturasproductosLocal.getnombre_producto().equals(""))) {procesofacturasproductosBean.setnombre_producto(procesofacturasproductosLocal.getnombre_producto());}
			if(conDefault || (!conDefault && procesofacturasproductosLocal.getnombre_unidad()!=null && !procesofacturasproductosLocal.getnombre_unidad().equals(""))) {procesofacturasproductosBean.setnombre_unidad(procesofacturasproductosLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && procesofacturasproductosLocal.getprecio()!=null && !procesofacturasproductosLocal.getprecio().equals(0.0))) {procesofacturasproductosBean.setprecio(procesofacturasproductosLocal.getprecio());}
			if(conDefault || (!conDefault && procesofacturasproductosLocal.gettarea()!=null && !procesofacturasproductosLocal.gettarea().equals(""))) {procesofacturasproductosBean.settarea(procesofacturasproductosLocal.gettarea());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoFacturasProductosGenerico(Long idProcesoFacturasProductosSeleccionado,JComboBox jComboBoxProcesoFacturasProductos,List<ProcesoFacturasProductos> procesofacturasproductossLocal)throws Exception {
		try {
			ProcesoFacturasProductos  procesofacturasproductosTemp=null;

			for(ProcesoFacturasProductos procesofacturasproductosAux:procesofacturasproductossLocal) {
				if(procesofacturasproductosAux.getId()!=null && procesofacturasproductosAux.getId().equals(idProcesoFacturasProductosSeleccionado)) {
					procesofacturasproductosTemp=procesofacturasproductosAux;
					break;
				}
			}

			jComboBoxProcesoFacturasProductos.setSelectedItem(procesofacturasproductosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoFacturasProductosGenerico(JComboBox jComboBoxProcesoFacturasProductos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoFacturasProductos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoFacturasProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoFacturasProductos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoFacturasProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesofacturasproductos=(ProcesoFacturasProductos) procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesofacturasproductos =(ProcesoFacturasProductos) procesofacturasproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!procesofacturasproductos.getIsNew() && !procesofacturasproductos.getIsChanged() && !procesofacturasproductos.getIsDeleted()) {
				sDescripcion=procesofacturasproductos.getciudad_descripcion();
			} else {
				//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
				sDescripcion=procesofacturasproductos.getciudad_descripcion();
			}
		}

		if(sTipo.equals("Zona")) {
			//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
			if(!procesofacturasproductos.getIsNew() && !procesofacturasproductos.getIsChanged() && !procesofacturasproductos.getIsDeleted()) {
				sDescripcion=procesofacturasproductos.getzona_descripcion();
			} else {
				//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
				sDescripcion=procesofacturasproductos.getzona_descripcion();
			}
		}

		if(sTipo.equals("GrupoCliente")) {
			//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
			if(!procesofacturasproductos.getIsNew() && !procesofacturasproductos.getIsChanged() && !procesofacturasproductos.getIsDeleted()) {
				sDescripcion=procesofacturasproductos.getgrupocliente_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
				sDescripcion=procesofacturasproductos.getgrupocliente_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!procesofacturasproductos.getIsNew() && !procesofacturasproductos.getIsChanged() && !procesofacturasproductos.getIsDeleted()) {
				sDescripcion=procesofacturasproductos.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=procesofacturasproductos.getvendedor_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoFacturasProductos procesofacturasproductosRow=new ProcesoFacturasProductos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesofacturasproductosRow=(ProcesoFacturasProductos) procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesofacturasproductosRow=(ProcesoFacturasProductos) procesofacturasproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoFacturasProductos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaNuevoProcesoFacturasProductos && this.isPermisoNuevoProcesoFacturasProductos));			
			this.jButtonDuplicarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaDuplicarProcesoFacturasProductos && this.isPermisoDuplicarProcesoFacturasProductos));			
			this.jButtonCopiarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaCopiarProcesoFacturasProductos && this.isPermisoCopiarProcesoFacturasProductos));
			this.jButtonVerFormProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaVerFormProcesoFacturasProductos && this.isPermisoVerFormProcesoFacturasProductos));
			
			this.jButtonAbrirOrderByProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaOrdenProcesoFacturasProductos && this.isPermisoOrdenProcesoFacturasProductos));			
			
			this.jButtonNuevoRelacionesProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos && this.isPermisoNuevoProcesoFacturasProductos));			
			this.jButtonNuevoGuardarCambiosProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaNuevoProcesoFacturasProductos && this.isPermisoNuevoProcesoFacturasProductos && this.isPermisoGuardarCambiosProcesoFacturasProductos));
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonModificarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaModificarProcesoFacturasProductos && this.isPermisoActualizarProcesoFacturasProductos));	
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonActualizarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaActualizarProcesoFacturasProductos && this.isPermisoActualizarProcesoFacturasProductos));	
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonEliminarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaEliminarProcesoFacturasProductos && this.isPermisoEliminarProcesoFacturasProductos));
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonCancelarProcesoFacturasProductos.setVisible(this.isVisibilidadCeldaCancelarProcesoFacturasProductos);							
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonGuardarCambiosProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaGuardarProcesoFacturasProductos && this.isPermisoGuardarCambiosProcesoFacturasProductos));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos && this.isPermisoGuardarCambiosProcesoFacturasProductos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaNuevoProcesoFacturasProductos && this.isPermisoNuevoProcesoFacturasProductos));						
			this.jButtonDuplicarToolBarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaDuplicarProcesoFacturasProductos && this.isPermisoDuplicarProcesoFacturasProductos));						
			this.jButtonCopiarToolBarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaCopiarProcesoFacturasProductos && this.isPermisoCopiarProcesoFacturasProductos));			
			this.jButtonVerFormToolBarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaVerFormProcesoFacturasProductos && this.isPermisoVerFormProcesoFacturasProductos));			
			this.jButtonAbrirOrderByToolBarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaOrdenProcesoFacturasProductos && this.isPermisoOrdenProcesoFacturasProductos));
			this.jButtonNuevoRelacionesToolBarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos && this.isPermisoNuevoProcesoFacturasProductos));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaNuevoProcesoFacturasProductos && this.isPermisoNuevoProcesoFacturasProductos && this.isPermisoGuardarCambiosProcesoFacturasProductos));			
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonModificarToolBarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaModificarProcesoFacturasProductos && this.isPermisoActualizarProcesoFacturasProductos));	
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonActualizarToolBarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaActualizarProcesoFacturasProductos  && this.isPermisoActualizarProcesoFacturasProductos));	
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonEliminarToolBarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaEliminarProcesoFacturasProductos && this.isPermisoEliminarProcesoFacturasProductos));
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonCancelarToolBarProcesoFacturasProductos.setVisible(this.isVisibilidadCeldaCancelarProcesoFacturasProductos);				
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonGuardarCambiosToolBarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaGuardarProcesoFacturasProductos && this.isPermisoGuardarCambiosProcesoFacturasProductos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos && this.isPermisoGuardarCambiosProcesoFacturasProductos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaNuevoProcesoFacturasProductos && this.isPermisoNuevoProcesoFacturasProductos));			
			this.jMenuItemDuplicarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaDuplicarProcesoFacturasProductos && this.isPermisoDuplicarProcesoFacturasProductos));			
			this.jMenuItemCopiarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaCopiarProcesoFacturasProductos && this.isPermisoCopiarProcesoFacturasProductos));			
			this.jMenuItemVerFormProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaVerFormProcesoFacturasProductos && this.isPermisoVerFormProcesoFacturasProductos));			
			this.jMenuItemAbrirOrderByProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaOrdenProcesoFacturasProductos && this.isPermisoOrdenProcesoFacturasProductos));			
			//this.jMenuItemMostrarOcultarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaOrdenProcesoFacturasProductos && this.isPermisoOrdenProcesoFacturasProductos));
			this.jMenuItemDetalleAbrirOrderByProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaOrdenProcesoFacturasProductos && this.isPermisoOrdenProcesoFacturasProductos));			
			//this.jMenuItemDetalleMostrarOcultarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaOrdenProcesoFacturasProductos && this.isPermisoOrdenProcesoFacturasProductos));			
			this.jMenuItemNuevoRelacionesProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos && this.isPermisoNuevoProcesoFacturasProductos));			
			this.jMenuItemNuevoGuardarCambiosProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaNuevoProcesoFacturasProductos && this.isPermisoNuevoProcesoFacturasProductos && this.isPermisoGuardarCambiosProcesoFacturasProductos));									
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemModificarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaModificarProcesoFacturasProductos && this.isPermisoActualizarProcesoFacturasProductos));	
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemActualizarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaActualizarProcesoFacturasProductos && this.isPermisoActualizarProcesoFacturasProductos));	
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemEliminarProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaEliminarProcesoFacturasProductos && this.isPermisoEliminarProcesoFacturasProductos));
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemCancelarProcesoFacturasProductos.setVisible(this.isVisibilidadCeldaCancelarProcesoFacturasProductos);				
			}
			
			this.jMenuItemGuardarCambiosProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaGuardarProcesoFacturasProductos && this.isPermisoGuardarCambiosProcesoFacturasProductos));						
			this.jMenuItemGuardarCambiosTablaProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos && this.isPermisoGuardarCambiosProcesoFacturasProductos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoFacturasProductos=this.jButtonNuevoProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoFacturasProductos=this.jButtonDuplicarProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaCopiarProcesoFacturasProductos=this.jButtonCopiarProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaVerFormProcesoFacturasProductos=this.jButtonVerFormProcesoFacturasProductos.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoFacturasProductos=this.jButtonAbrirOrderByProcesoFacturasProductos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=this.jButtonNuevoRelacionesProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaModificarProcesoFacturasProductos=this.jButtonModificarProcesoFacturasProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
			this.isVisibilidadCeldaActualizarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonActualizarProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonEliminarProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonCancelarProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaGuardarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonGuardarCambiosProcesoFacturasProductos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=this.jButtonGuardarCambiosTablaProcesoFacturasProductos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoFacturasProductos=this.jButtonNuevoToolBarProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=this.jButtonNuevoRelacionesToolBarProcesoFacturasProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
			this.isVisibilidadCeldaModificarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonModificarToolBarProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonActualizarToolBarProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonEliminarToolBarProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonCancelarToolBarProcesoFacturasProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoFacturasProductos=this.jButtonGuardarCambiosToolBarProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=this.jButtonGuardarCambiosTablaToolBarProcesoFacturasProductos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoFacturasProductos=this.jMenuItemNuevoProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=this.jMenuItemNuevoRelacionesProcesoFacturasProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
			this.isVisibilidadCeldaModificarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemModificarProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemActualizarProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemEliminarProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoFacturasProductos=this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemCancelarProcesoFacturasProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoFacturasProductos=this.jMenuItemGuardarCambiosProcesoFacturasProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=this.jMenuItemGuardarCambiosTablaProcesoFacturasProductos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoFacturasProductos(Boolean esInicializar) {
		if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesofacturasproductosSessionBean.getConGuardarRelaciones()) {
				//if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoFacturasProductos();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoFacturasProductos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoFacturasProductos() {
		this.jButtonNuevoProcesoFacturasProductos.setVisible(this.isPermisoNuevoProcesoFacturasProductos);			
		this.jButtonDuplicarProcesoFacturasProductos.setVisible(this.isPermisoDuplicarProcesoFacturasProductos);			
		this.jButtonCopiarProcesoFacturasProductos.setVisible(this.isPermisoCopiarProcesoFacturasProductos);			
		this.jButtonVerFormProcesoFacturasProductos.setVisible(this.isPermisoVerFormProcesoFacturasProductos);			
		
		this.jButtonAbrirOrderByProcesoFacturasProductos.setVisible(this.isPermisoOrdenProcesoFacturasProductos);					
		
		this.jButtonNuevoRelacionesProcesoFacturasProductos.setVisible(this.isPermisoNuevoProcesoFacturasProductos);			
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonModificarProcesoFacturasProductos.setVisible(this.isPermisoActualizarProcesoFacturasProductos);	
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonActualizarProcesoFacturasProductos.setVisible(this.isPermisoActualizarProcesoFacturasProductos);	
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonEliminarProcesoFacturasProductos.setVisible(this.isPermisoEliminarProcesoFacturasProductos);
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonCancelarProcesoFacturasProductos.setVisible(this.isVisibilidadCeldaCancelarProcesoFacturasProductos);						
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonGuardarCambiosProcesoFacturasProductos.setVisible(this.isPermisoGuardarCambiosProcesoFacturasProductos);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoFacturasProductos.setVisible(this.isPermisoActualizarProcesoFacturasProductos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoFacturasProductos() {
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonModificarProcesoFacturasProductos.setVisible(this.isPermisoActualizarProcesoFacturasProductos);	
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonActualizarProcesoFacturasProductos.setVisible(this.isPermisoActualizarProcesoFacturasProductos);	
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonEliminarProcesoFacturasProductos.setVisible(this.isPermisoEliminarProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonCancelarProcesoFacturasProductos.setVisible(this.isVisibilidadCeldaCancelarProcesoFacturasProductos);							
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonGuardarCambiosProcesoFacturasProductos.setVisible((this.isVisibilidadCeldaGuardarProcesoFacturasProductos && this.isPermisoGuardarCambiosProcesoFacturasProductos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoFacturasProductos() {
		if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoFacturasProductos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoFacturasProductos() {
	}
	
	public void jTableDatosProcesoFacturasProductosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoFacturasProductos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesofacturasproductos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadProcesoFacturasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebProcesoFacturasProductos(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoFacturasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoFacturasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.procesofacturasproductosLogic.getConnexion());

				if(this.procesofacturasproductos.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.procesofacturasproductos.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoFacturasProductos=(TitledBorder)this.jScrollPanelDatosProcesoFacturasProductos.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderProcesoFacturasProductos.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.procesofacturasproductos.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_zonaProcesoFacturasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisozona=true;

			idTienePermisozona=this.tienePermisosUsuarioEnPaginaWebProcesoFacturasProductos(ZonaConstantesFunciones.CLASSNAME);

			if(idTienePermisozona) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoFacturasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoFacturasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);

				this.zonaBeanSwingJInternalFrame=new ZonaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.zonaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.zonaBeanSwingJInternalFrame.getZonaLogic().setConnexion(this.procesofacturasproductosLogic.getConnexion());

				if(this.procesofacturasproductos.getid_zona()!=null) {
					this.zonaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.zonaBeanSwingJInternalFrame.setIdActual(this.procesofacturasproductos.getid_zona());
					this.zonaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaZona();
				}

				JInternalFrameBase jinternalFrame =this.zonaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoFacturasProductos=(TitledBorder)this.jScrollPanelDatosProcesoFacturasProductos.getBorder();
				TitledBorder titledBorderzona=(TitledBorder)this.zonaBeanSwingJInternalFrame.jScrollPanelDatosZona.getBorder();

				titledBorderzona.setTitle(titledBorderProcesoFacturasProductos.getTitle() + " -> Zona");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_zonaProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getid_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_zona = "+this.procesofacturasproductos.getid_zona().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_clienteProcesoFacturasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupocliente=true;

			idTienePermisogrupocliente=this.tienePermisosUsuarioEnPaginaWebProcesoFacturasProductos(GrupoClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoFacturasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoFacturasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);

				this.grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoclienteBeanSwingJInternalFrame.getGrupoClienteLogic().setConnexion(this.procesofacturasproductosLogic.getConnexion());

				if(this.procesofacturasproductos.getid_grupo_cliente()!=null) {
					this.grupoclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoclienteBeanSwingJInternalFrame.setIdActual(this.procesofacturasproductos.getid_grupo_cliente());
					this.grupoclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoCliente();
				}

				JInternalFrameBase jinternalFrame =this.grupoclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoFacturasProductos=(TitledBorder)this.jScrollPanelDatosProcesoFacturasProductos.getBorder();
				TitledBorder titledBordergrupocliente=(TitledBorder)this.grupoclienteBeanSwingJInternalFrame.jScrollPanelDatosGrupoCliente.getBorder();

				titledBordergrupocliente.setTitle(titledBorderProcesoFacturasProductos.getTitle() + " -> Grupo Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_clienteProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getid_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_cliente = "+this.procesofacturasproductos.getid_grupo_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorProcesoFacturasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebProcesoFacturasProductos(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoFacturasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoFacturasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.procesofacturasproductosLogic.getConnexion());

				if(this.procesofacturasproductos.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.procesofacturasproductos.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoFacturasProductos=(TitledBorder)this.jScrollPanelDatosProcesoFacturasProductos.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderProcesoFacturasProductos.getTitle() + " -> VENDEDOR");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.procesofacturasproductos.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.procesofacturasproductos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.procesofacturasproductos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_provinciaProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getnombre_provincia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_provincia like '%"+this.procesofacturasproductos.getnombre_provincia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_ciudadProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getnombre_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_ciudad like '%"+this.procesofacturasproductos.getnombre_ciudad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_zonaProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getnombre_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_zona like '%"+this.procesofacturasproductos.getnombre_zona()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_grupo_clienteProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getnombre_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_grupo_cliente like '%"+this.procesofacturasproductos.getnombre_grupo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_datoProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getcodigo_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_dato like '%"+this.procesofacturasproductos.getcodigo_dato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_datoProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getnombre_completo_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_dato like '%"+this.procesofacturasproductos.getnombre_completo_dato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getnumero_pre_impreso_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso_factura like '%"+this.procesofacturasproductos.getnumero_pre_impreso_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.procesofacturasproductos.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.procesofacturasproductos.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.procesofacturasproductos.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontareaProcesoFacturasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.getprocesofacturasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesofacturasproductos==null) {
						this.procesofacturasproductos = new ProcesoFacturasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);
				}

				if(this.procesofacturasproductos.gettarea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tarea like '%"+this.procesofacturasproductos.gettarea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoFacturasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoFacturasProductosProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoFacturasProductos(false,false);

			this.getProcesoFacturasProductossBusquedaProcesoFacturasProductos();

			this.inicializarActualizarBindingProcesoFacturasProductos(false);

			//if(ProcesoFacturasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoFacturasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCiudadProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoFacturasProductos(false,false);

			this.getProcesoFacturasProductossFK_IdCiudad();

			this.inicializarActualizarBindingProcesoFacturasProductos(false);

			//if(ProcesoFacturasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoFacturasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoClienteProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoFacturasProductos(false,false);

			this.getProcesoFacturasProductossFK_IdGrupoCliente();

			this.inicializarActualizarBindingProcesoFacturasProductos(false);

			//if(ProcesoFacturasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoFacturasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoFacturasProductos(false,false);

			this.getProcesoFacturasProductossFK_IdVendedor();

			this.inicializarActualizarBindingProcesoFacturasProductos(false);

			//if(ProcesoFacturasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoFacturasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdZonaProcesoFacturasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoFacturasProductos(false,false);

			this.getProcesoFacturasProductossFK_IdZona();

			this.inicializarActualizarBindingProcesoFacturasProductos(false);

			//if(ProcesoFacturasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoFacturasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesofacturasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoFacturasProductos() {
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoFacturasProductos.dispose();
			this.jInternalFrameDetalleFormProcesoFacturasProductos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos!=null) {
			this.jInternalFrameReporteDinamicoProcesoFacturasProductos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoFacturasProductos.dispose();
			this.jInternalFrameReporteDinamicoProcesoFacturasProductos=null;
		}
		
		if(this.jInternalFrameImportacionProcesoFacturasProductos!=null) {
			this.jInternalFrameImportacionProcesoFacturasProductos.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoFacturasProductos.dispose();
			this.jInternalFrameImportacionProcesoFacturasProductos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoFacturasProductos();
			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoFacturasProductos")) {
				jButtonNuevoProcesoFacturasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoFacturasProductos")) {
				jButtonDuplicarProcesoFacturasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoFacturasProductos")) {
				jButtonCopiarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoFacturasProductos")) {
				jButtonVerFormProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoFacturasProductos")) {
				jButtonNuevoProcesoFacturasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoFacturasProductos")) {
				jButtonDuplicarProcesoFacturasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoFacturasProductos")) {
				jButtonNuevoProcesoFacturasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoFacturasProductos")) {
				jButtonDuplicarProcesoFacturasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoFacturasProductos")) {
				jButtonNuevoProcesoFacturasProductosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoFacturasProductos")) {
				jButtonNuevoProcesoFacturasProductosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoFacturasProductos")) {
				jButtonNuevoProcesoFacturasProductosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoFacturasProductos")) {
				jButtonModificarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoFacturasProductos")) {
				jButtonModificarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoFacturasProductos")) {
				jButtonModificarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoFacturasProductos")) {
				jButtonActualizarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoFacturasProductos")) {
				jButtonActualizarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoFacturasProductos")) {
				jButtonActualizarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoFacturasProductos")) {
				jButtonEliminarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoFacturasProductos")) {
				jButtonEliminarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoFacturasProductos")) {
				jButtonEliminarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoFacturasProductos")) {
				jButtonCancelarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoFacturasProductos")) {
				jButtonCancelarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoFacturasProductos")) {
				jButtonCancelarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoFacturasProductos")) {
				jButtonCerrarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoFacturasProductos")) {
				jButtonCerrarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoFacturasProductos")) {
				jButtonCerrarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoFacturasProductos")) {
				jButtonMostrarOcultarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoFacturasProductos")) {
				jButtonCancelarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoFacturasProductos")) {
				jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoFacturasProductos")) {
				jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoFacturasProductos")) {
				jButtonCopiarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoFacturasProductos")) {
				jButtonVerFormProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoFacturasProductos")) {
				jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoFacturasProductos")) {
				jButtonCopiarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoFacturasProductos")) {
				jButtonVerFormProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoFacturasProductos")) {
				jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoFacturasProductos")) {
				jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoFacturasProductos")) {
				jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoFacturasProductos")) {
				jButtonRecargarInformacionProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoFacturasProductos")) {
				jButtonRecargarInformacionProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoFacturasProductos")) {
				jButtonRecargarInformacionProcesoFacturasProductosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoFacturasProductos")) {
				jButtonAnterioresProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoFacturasProductos")) {
				jButtonAnterioresProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoFacturasProductos")) {
				jButtonAnterioresProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoFacturasProductos")) {
				jButtonSiguientesProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoFacturasProductos")) {
				jButtonSiguientesProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoFacturasProductos")) {
				jButtonSiguientesProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoFacturasProductos") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoFacturasProductos")) {
				jButtonAbrirOrderByProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoFacturasProductos") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoFacturasProductos")) {
				jButtonMostrarOcultarProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoFacturasProductos")) {
				jButtonNuevoGuardarCambiosProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoFacturasProductos")) {
				jButtonNuevoGuardarCambiosProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoFacturasProductos")) {
				jButtonNuevoGuardarCambiosProcesoFacturasProductosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoFacturasProductos")) {
				jButtonCerrarReporteDinamicoProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoFacturasProductos")) {
				jButtonGenerarReporteDinamicoProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoFacturasProductos")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoFacturasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoFacturasProductos")) {
				jButtonCerrarImportacionProcesoFacturasProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoFacturasProductos")) {
				
				jButtonGenerarImportacionProcesoFacturasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoFacturasProductos")) {
				
				jButtonAbrirImportacionProcesoFacturasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoFacturasProductos")) {
				jComboBoxTiposAccionesProcesoFacturasProductosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoFacturasProductos")) {
				jComboBoxTiposRelacionesProcesoFacturasProductosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoFacturasProductos")) {
				jComboBoxTiposAccionesProcesoFacturasProductosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoFacturasProductos")) {
				
				jComboBoxTiposSeleccionarProcesoFacturasProductosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoFacturasProductos")) {
				jTextFieldValorCampoGeneralProcesoFacturasProductosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoFacturasProductos")) {
				jButtonAbrirOrderByProcesoFacturasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoFacturasProductos")) {
				jButtonAbrirOrderByProcesoFacturasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoFacturasProductos")) {
				jButtonCerrarOrderByProcesoFacturasProductosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoFacturasProductosBusqueda")) {
				this.jButtonidProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadProcesoFacturasProductosUpdate")) {
				this.jButtonid_ciudadProcesoFacturasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadProcesoFacturasProductosBusqueda")) {
				this.jButtonid_ciudadProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaProcesoFacturasProductosUpdate")) {
				this.jButtonid_zonaProcesoFacturasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaProcesoFacturasProductosBusqueda")) {
				this.jButtonid_zonaProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteProcesoFacturasProductosUpdate")) {
				this.jButtonid_grupo_clienteProcesoFacturasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteProcesoFacturasProductosBusqueda")) {
				this.jButtonid_grupo_clienteProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorProcesoFacturasProductosUpdate")) {
				this.jButtonid_vendedorProcesoFacturasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorProcesoFacturasProductosBusqueda")) {
				this.jButtonid_vendedorProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoFacturasProductosBusqueda")) {
				this.jButtoncodigoProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_completoProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_provinciaProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_provinciaProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_ciudadProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_zonaProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_grupo_clienteProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_datoProcesoFacturasProductosBusqueda")) {
				this.jButtoncodigo_datoProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_datoProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_completo_datoProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaProcesoFacturasProductosBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_productoProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_unidadProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProcesoFacturasProductosBusqueda")) {
				this.jButtonprecioProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tareaProcesoFacturasProductosBusqueda")) {
				this.jButtontareaProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoFacturasProductosProcesoFacturasProductos")) {
				this.jButtonBusquedaProcesoFacturasProductosProcesoFacturasProductosActionPerformed(evt);
			}
			
			;
			
			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoFacturasProductos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoFacturasProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				


				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoFacturasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoFacturasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoFacturasProductos procesofacturasproductosLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesofacturasproductosLocal=this.procesofacturasproductos;
			} else {
				procesofacturasproductosLocal=this.procesofacturasproductosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
							
				
				


				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoFacturasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoFacturasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoFacturasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
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
			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			
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
			
			


			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoFacturasProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
								
						
				


				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoFacturasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoFacturasProductos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
								
				
				


				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoFacturasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoFacturasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoFacturasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoFacturasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoFacturasProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
							
				
				


				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoFacturasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoFacturasProductos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoFacturasProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
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
			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			
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
			
			


			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoFacturasProductosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
								
				
				


				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoFacturasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoFacturasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoFacturasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoFacturasProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoFacturasProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoFacturasProductos")) {
					jCheckBoxSeleccionarTodosProcesoFacturasProductosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoFacturasProductos")) {
					jCheckBoxSeleccionadosProcesoFacturasProductosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoFacturasProductos")) {
					
				}
				
				


				
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoFacturasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoFacturasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
												
				
				


				
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoFacturasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoFacturasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoFacturasProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoFacturasProductosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
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
			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
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
			
			


			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoFacturasProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoFacturasProductos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoFacturasProductos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesofacturasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesofacturasproductos);
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
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
				
				


				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoFacturasProductos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoFacturasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoFacturasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesofacturasproductosAnterior =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoFacturasProductos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoFacturasProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoFacturasProductos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesofacturasproductos =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesofacturasproductos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoFacturasProductos")) {
				
				}
				
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoFacturasProductos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoFacturasProductos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoFacturasProductos")) {
			
			}
			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoFacturasProductos();
			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoFacturasProductos")) {
				jButtonNuevoProcesoFacturasProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoFacturasProductos")) {
				jButtonDuplicarProcesoFacturasProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoFacturasProductos")) {
				jButtonCopiarProcesoFacturasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoFacturasProductos")) {
				jButtonVerFormProcesoFacturasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoFacturasProductos")) {
				jButtonNuevoProcesoFacturasProductosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoFacturasProductos")) {
				jButtonModificarProcesoFacturasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoFacturasProductos")) {
				jButtonActualizarProcesoFacturasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoFacturasProductos")) {
				jButtonEliminarProcesoFacturasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoFacturasProductos")) {
				jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoFacturasProductos")) {
				jButtonCancelarProcesoFacturasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoFacturasProductos")) {
				jButtonCerrarProcesoFacturasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoFacturasProductos")) {
				jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoFacturasProductos")) {
				jButtonNuevoGuardarCambiosProcesoFacturasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoFacturasProductos")) {
				jButtonAbrirOrderByProcesoFacturasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoFacturasProductos")) {
				jButtonRecargarInformacionProcesoFacturasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoFacturasProductos")) {
				jButtonAnterioresProcesoFacturasProductosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoFacturasProductos")) {
				jButtonSiguientesProcesoFacturasProductosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoFacturasProductosBusqueda")) {
				this.jButtonidProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadProcesoFacturasProductosUpdate")) {
				this.jButtonid_ciudadProcesoFacturasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadProcesoFacturasProductosBusqueda")) {
				this.jButtonid_ciudadProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaProcesoFacturasProductosUpdate")) {
				this.jButtonid_zonaProcesoFacturasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaProcesoFacturasProductosBusqueda")) {
				this.jButtonid_zonaProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteProcesoFacturasProductosUpdate")) {
				this.jButtonid_grupo_clienteProcesoFacturasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteProcesoFacturasProductosBusqueda")) {
				this.jButtonid_grupo_clienteProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorProcesoFacturasProductosUpdate")) {
				this.jButtonid_vendedorProcesoFacturasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorProcesoFacturasProductosBusqueda")) {
				this.jButtonid_vendedorProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoFacturasProductosBusqueda")) {
				this.jButtoncodigoProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_completoProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_provinciaProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_provinciaProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_ciudadProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_zonaProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_grupo_clienteProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_datoProcesoFacturasProductosBusqueda")) {
				this.jButtoncodigo_datoProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_datoProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_completo_datoProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaProcesoFacturasProductosBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_productoProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProcesoFacturasProductosBusqueda")) {
				this.jButtonnombre_unidadProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProcesoFacturasProductosBusqueda")) {
				this.jButtonprecioProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tareaProcesoFacturasProductosBusqueda")) {
				this.jButtontareaProcesoFacturasProductosBusquedaActionPerformed(evt);
			}
			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoFacturasProductos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoFacturasProductos")) {
				closingInternalFrameProcesoFacturasProductos();
				
			} else if(sTipo.equals("jButtonCancelarProcesoFacturasProductos")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoFacturasProductos = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoFacturasProductosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoFacturasProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoFacturasProductos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoFacturasProductosActionPerformed(null);
			}
			
			ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesofacturasproductos,new Object(),this.procesofacturasproductosParameterGeneral,this.procesofacturasproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoFacturasProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoFacturasProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoFacturasProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesofacturasproductos)) {
			if(!esControlTabla) {
				if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);			
				}
				
				if(this.procesofacturasproductosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoFacturasProductos(this.procesofacturasproductosReturnGeneral,this.procesofacturasproductosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesofacturasproductosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoFacturasProductos(classes,this.procesofacturasproductosReturnGeneral,this.procesofacturasproductosBean,false);
					}
						
					if(this.procesofacturasproductosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoFacturasProductos(this.procesofacturasproductosReturnGeneral.getProcesoFacturasProductos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoFacturasProductos(this.procesofacturasproductosReturnGeneral.getProcesoFacturasProductos());	
					}
						
					if(this.procesofacturasproductosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoFacturasProductos(this.procesofacturasproductosReturnGeneral.getProcesoFacturasProductos(),classes);//this.procesofacturasproductosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoFacturasProductos(this.procesofacturasproductos,classes);//this.procesofacturasproductosBean);									
				}
			
				if(ProcesoFacturasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoFacturasProductos(this.procesofacturasproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoFacturasProductos(this.procesofacturasproductos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesofacturasproductosAnterior!=null) {
						this.procesofacturasproductos=this.procesofacturasproductosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesofacturasproductosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesofacturasproductosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesofacturasproductosReturnGeneral.getProcesoFacturasProductos(),procesofacturasproductosLogic.getProcesoFacturasProductoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesofacturasproductosReturnGeneral.getProcesoFacturasProductos(),this.procesofacturasproductoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoFacturasProductos.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoFacturasProductos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoFacturasProductos();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoFacturasProductos() throws Exception {
		
		ProcesoFacturasProductosModel procesofacturasproductosModel=(ProcesoFacturasProductosModel)this.jTableDatosProcesoFacturasProductos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesofacturasproductosModel.procesofacturasproductoss=this.procesofacturasproductosLogic.getProcesoFacturasProductoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesofacturasproductosModel.procesofacturasproductoss=this.procesofacturasproductoss;
		}
		
		
		((ProcesoFacturasProductosModel) this.jTableDatosProcesoFacturasProductos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoFacturasProductos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesofacturasproductosAnterior(),this.procesofacturasproductosLogic.getProcesoFacturasProductoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesofacturasproductosAnterior(),this.procesofacturasproductoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoFacturasProductos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
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
										
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesofacturasproductos,new Object(),generalEntityParameterGeneral,this.procesofacturasproductosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesofacturasproductosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoFacturasProductosConstantesFunciones.getClassesRelationshipsOfProcesoFacturasProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoFacturasProductosConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoFacturasProductos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoFacturasProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesofacturasproductos,new Object(),generalEntityParameterGeneral,this.procesofacturasproductosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoFacturasProductos(ProcesoFacturasProductosBean procesofacturasproductosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoFacturasProductos(ArrayList<Classe> classes,ProcesoFacturasProductosReturnGeneral procesofacturasproductosReturnGeneral,ProcesoFacturasProductosBean procesofacturasproductosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesofacturasproductos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos = new ProcesoFacturasProductosDetalleFormJInternalFrame(jDesktopPane,this.procesofacturasproductosSessionBean.getConGuardarRelaciones(),this.procesofacturasproductosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.setVisible(false);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.procesofacturasproductosLogic=this.procesofacturasproductosLogic;
		
		this.cargarCombosFrameForeignKeyProcesoFacturasProductos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoFacturasProductos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoFacturasProductos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoFacturasProductos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoFacturasProductos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoFacturasProductos"));
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonModificarProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"ModificarProcesoFacturasProductos"));

		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonModificarToolBarProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoFacturasProductos"));
					
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemModificarProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoFacturasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonActualizarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoFacturasProductos"));
		
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonActualizarToolBarProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoFacturasProductos"));
						
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemActualizarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoFacturasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonEliminarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"EliminarProcesoFacturasProductos"));
		
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonEliminarToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoFacturasProductos"));
								
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemEliminarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoFacturasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonCancelarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"CancelarProcesoFacturasProductos"));
		
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonCancelarToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoFacturasProductos"));
					
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemCancelarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoFacturasProductos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemDetalleCerrarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoFacturasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonGuardarCambiosToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoFacturasProductos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonGuardarCambiosToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoFacturasProductos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoFacturasProductos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonidProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoFacturasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_ciudadProcesoFacturasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoFacturasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_ciudadProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoFacturasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_zonaProcesoFacturasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaProcesoFacturasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_zonaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaProcesoFacturasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_grupo_clienteProcesoFacturasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoFacturasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_grupo_clienteProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoFacturasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_vendedorProcesoFacturasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoFacturasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_vendedorProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtoncodigoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_completoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_provinciaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_provinciaProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_ciudadProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_zonaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtoncodigo_datoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_completo_datoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_datoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_productoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_unidadProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonprecioProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precioProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtontareaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"tareaProcesoFacturasProductosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTabbedPaneRelacionesProcesoFacturasProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoFacturasProductos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoFacturasProductos"));
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoFacturasProductos"));
		}
		
		this.jTableDatosProcesoFacturasProductos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoFacturasProductos"));
		
		this.jTableDatosProcesoFacturasProductos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoFacturasProductos"));
		
		this.jButtonNuevoProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"NuevoProcesoFacturasProductos"));
		
		this.jButtonDuplicarProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"DuplicarProcesoFacturasProductos"));
		
		this.jButtonCopiarProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"CopiarProcesoFacturasProductos"));
		
		this.jButtonVerFormProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"VerFormProcesoFacturasProductos"));
		
		
		this.jButtonNuevoToolBarProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoFacturasProductos"));
			
		this.jButtonDuplicarToolBarProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoFacturasProductos"));
			
		this.jMenuItemNuevoProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoFacturasProductos"));
			
		this.jMenuItemDuplicarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoFacturasProductos"));		
		
		
		this.jButtonNuevoRelacionesProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoFacturasProductos"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoFacturasProductos"));
			
		this.jMenuItemNuevoRelacionesProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoFacturasProductos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonModificarProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"ModificarProcesoFacturasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonModificarToolBarProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoFacturasProductos"));
			
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemModificarProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoFacturasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonActualizarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoFacturasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonActualizarToolBarProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoFacturasProductos"));
				
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemActualizarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoFacturasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonEliminarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"EliminarProcesoFacturasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonEliminarToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoFacturasProductos"));
						
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemEliminarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoFacturasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonCancelarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"CancelarProcesoFacturasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonCancelarToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoFacturasProductos"));
			
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemCancelarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoFacturasProductos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoFacturasProductos"));		
		
		
		this.jButtonCerrarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"CerrarProcesoFacturasProductos"));
		
		
		this.jButtonCerrarToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoFacturasProductos"));
			
		this.jMenuItemCerrarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoFacturasProductos"));
			
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jMenuItemDetalleCerrarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoFacturasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonGuardarCambiosProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoFacturasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonGuardarCambiosToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoFacturasProductos"));
		}
		
		this.jButtonCopiarToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoFacturasProductos"));
			
		this.jButtonVerFormToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoFacturasProductos"));
		
		this.jMenuItemGuardarCambiosProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoFacturasProductos"));
			
		this.jMenuItemCopiarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoFacturasProductos"));		
		
		this.jMenuItemVerFormProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoFacturasProductos"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoFacturasProductos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoFacturasProductos"));
			
		this.jMenuItemGuardarCambiosTablaProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoFacturasProductos"));		
		
		
		
		this.jButtonRecargarInformacionProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoFacturasProductos"));
					
		this.jButtonRecargarInformacionToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoFacturasProductos"));
		
		this.jMenuItemRecargarInformacionProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoFacturasProductos"));		
		
		
		
		this.jButtonAnterioresProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"AnterioresProcesoFacturasProductos"));
		
		
		this.jButtonAnterioresToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoFacturasProductos"));
		
		this.jMenuItemAnterioresProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoFacturasProductos"));		
		
		
		this.jButtonSiguientesProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"SiguientesProcesoFacturasProductos"));
		
		
		this.jButtonSiguientesToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoFacturasProductos"));
			
		this.jMenuItemSiguientesProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoFacturasProductos"));
			
		this.jMenuItemAbrirOrderByProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoFacturasProductos"));
			
		this.jMenuItemMostrarOcultarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoFacturasProductos"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoFacturasProductos"));
			
		this.jMenuItemDetalleMostarOcultarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoFacturasProductos"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoFacturasProductos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoFacturasProductos"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoFacturasProductos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoFacturasProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoFacturasProductos"));

		this.jCheckBoxSeleccionadosProcesoFacturasProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoFacturasProductos"));
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoFacturasProductos"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoFacturasProductos"));
			
		this.jComboBoxTiposAccionesProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoFacturasProductos"));
					
		this.jComboBoxTiposSeleccionarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoFacturasProductos"));
			
		this.jTextFieldValorCampoGeneralProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoFacturasProductos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonidProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoFacturasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_ciudadProcesoFacturasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoFacturasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_ciudadProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoFacturasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_zonaProcesoFacturasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaProcesoFacturasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_zonaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaProcesoFacturasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_grupo_clienteProcesoFacturasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoFacturasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_grupo_clienteProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoFacturasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_vendedorProcesoFacturasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoFacturasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_vendedorProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtoncodigoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_completoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_provinciaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_provinciaProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_ciudadProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_zonaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtoncodigo_datoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_completo_datoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_datoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_productoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_unidadProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonprecioProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precioProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtontareaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"tareaProcesoFacturasProductosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoFacturasProductosProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoFacturasProductosProcesoFacturasProductos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoFacturasProductos!=null) {
				this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoFacturasProductos"));
				this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoFacturasProductos"));
				this.jInternalFrameReporteDinamicoProcesoFacturasProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoFacturasProductos"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoFacturasProductos"));				
			//this.jButtonGenerarReporteDinamicoProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoFacturasProductos"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoFacturasProductos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoFacturasProductos!=null) {
				this.jInternalFrameImportacionProcesoFacturasProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoFacturasProductos"));
				this.jInternalFrameImportacionProcesoFacturasProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoFacturasProductos"));
				this.jInternalFrameImportacionProcesoFacturasProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoFacturasProductos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoFacturasProductos"));
			
			this.jButtonAbrirOrderByToolBarProcesoFacturasProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoFacturasProductos"));			
			
			if(this.jInternalFrameOrderByProcesoFacturasProductos!=null) {
				this.jInternalFrameOrderByProcesoFacturasProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoFacturasProductos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoFacturasProductos.jTabbedPaneRelacionesProcesoFacturasProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoFacturasProductos"));
		
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
            		closingInternalFrameProcesoFacturasProductos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoFacturasProductos = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoFacturasProductosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoFacturasProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoFacturasProductos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoFacturasProductosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoFacturasProductos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoFacturasProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoFacturasProductos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoFacturasProductos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoFacturasProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoFacturasProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoFacturasProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoFacturasProductos";
		inputMap = this.jButtonNuevoProcesoFacturasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoFacturasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoFacturasProductosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoFacturasProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoFacturasProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoFacturasProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoFacturasProductos";
		inputMap = this.jButtonNuevoRelacionesProcesoFacturasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoFacturasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoFacturasProductosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoFacturasProductos";
		inputMap = this.jButtonModificarProcesoFacturasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoFacturasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoFacturasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoFacturasProductos";
		inputMap = this.jButtonActualizarProcesoFacturasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoFacturasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoFacturasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoFacturasProductos";
		inputMap = this.jButtonEliminarProcesoFacturasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoFacturasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoFacturasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoFacturasProductos";
		inputMap = this.jButtonCancelarProcesoFacturasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoFacturasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoFacturasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoFacturasProductos";
		inputMap = this.jButtonCerrarProcesoFacturasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoFacturasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoFacturasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonGuardarCambiosProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoFacturasProductos";
		inputMap = this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonGuardarCambiosProcesoFacturasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonGuardarCambiosProcesoFacturasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoFacturasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoFacturasProductos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoFacturasProductosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoFacturasProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoFacturasProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoFacturasProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoFacturasProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoFacturasProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoFacturasProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonidProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoFacturasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_ciudadProcesoFacturasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoFacturasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_ciudadProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoFacturasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_zonaProcesoFacturasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaProcesoFacturasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_zonaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaProcesoFacturasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_grupo_clienteProcesoFacturasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoFacturasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_grupo_clienteProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoFacturasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_vendedorProcesoFacturasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoFacturasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonid_vendedorProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtoncodigoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_completoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_provinciaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_provinciaProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_ciudadProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_zonaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtoncodigo_datoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_completo_datoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_datoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_productoProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonnombre_unidadProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtonprecioProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precioProcesoFacturasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jButtontareaProcesoFacturasProductosBusqueda.addActionListener(new ButtonActionListener(this,"tareaProcesoFacturasProductosBusqueda"));
		
		
		this.jButtonBusquedaProcesoFacturasProductosProcesoFacturasProductos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoFacturasProductosProcesoFacturasProductos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoFacturasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoFacturasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoFacturasProductosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoFacturasProductos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoFacturasProductos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductosLogic.getProcesoFacturasProductoss()) {
					procesofacturasproductosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoFacturasProductos procesofacturasproductosAux:procesofacturasproductoss) {
					procesofacturasproductosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoFacturasProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoFacturasProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductosLogic.getProcesoFacturasProductoss()) {
						procesofacturasproductosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoFacturasProductos procesofacturasproductosAux:procesofacturasproductoss) {
						procesofacturasproductosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductosLogic.getProcesoFacturasProductoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoFacturasProductos procesofacturasproductosAux:procesofacturasproductoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoFacturasProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoFacturasProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoFacturasProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoFacturasProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoFacturasProductos.getSelectedRows();
			
			ProcesoFacturasProductos procesofacturasproductosLocal=new ProcesoFacturasProductos();
			
			//this.seleccionarTodosProcesoFacturasProductos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesofacturasproductosLocal =(ProcesoFacturasProductos) this.procesofacturasproductosLogic.getProcesoFacturasProductoss().toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesofacturasproductosLocal =(ProcesoFacturasProductos) this.procesofacturasproductoss.toArray()[this.jTableDatosProcesoFacturasProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesofacturasproductosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductosLogic.getProcesoFacturasProductoss()) {
						procesofacturasproductosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoFacturasProductos procesofacturasproductosAux:procesofacturasproductoss) {
						procesofacturasproductosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoFacturasProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoFacturasProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoFacturasProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoFacturasProductosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoFacturasProductosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoFacturasProductosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoFacturasProductos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoFacturasProductos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductosLogic.getProcesoFacturasProductoss()) {
				
						if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesofacturasproductosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							procesofacturasproductosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA)) {
							existe=true;
							procesofacturasproductosAux.setnombre_provincia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							procesofacturasproductosAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							procesofacturasproductosAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							procesofacturasproductosAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO)) {
							existe=true;
							procesofacturasproductosAux.setcodigo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO)) {
							existe=true;
							procesofacturasproductosAux.setnombre_completo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							procesofacturasproductosAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							procesofacturasproductosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							procesofacturasproductosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							procesofacturasproductosAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA)) {
							existe=true;
							procesofacturasproductosAux.settarea(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoFacturasProductos procesofacturasproductosAux:procesofacturasproductoss) {
					
						if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesofacturasproductosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							procesofacturasproductosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA)) {
							existe=true;
							procesofacturasproductosAux.setnombre_provincia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							procesofacturasproductosAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							procesofacturasproductosAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							procesofacturasproductosAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO)) {
							existe=true;
							procesofacturasproductosAux.setcodigo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO)) {
							existe=true;
							procesofacturasproductosAux.setnombre_completo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							procesofacturasproductosAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							procesofacturasproductosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							procesofacturasproductosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							procesofacturasproductosAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA)) {
							existe=true;
							procesofacturasproductosAux.settarea(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoFacturasProductosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoFacturasProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoFacturasProductos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoFacturasProductos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoFacturasProductos) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoFacturasProductos(conSplash);
				
					this.generarReporteProcesoFacturasProductossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoFacturasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoFacturasProductossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoFacturasProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoFacturasProductossSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoFacturasProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoFacturasProductossSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoFacturasProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoFacturasProductos();
				
				this.exportarProcesoFacturasProductossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoFacturasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoFacturasProductoss();
				//this.importarProcesoFacturasProductoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoFacturasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoFacturasProductos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoFacturasProductossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoFacturasProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Facturas Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoFacturasProductos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoFacturasProductos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoFacturasProductos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Facturas Productos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoFacturasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoFacturasProductosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoFacturasProductos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoFacturasProductos(conSplash);
					
						//this.actualizarParametrosGeneralProcesoFacturasProductos();
						
						this.generarReporteProcesoAccionProcesoFacturasProductossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoFacturasProductos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Facturas ProductosES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Facturas Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoFacturasProductos();
				
						this.actualizarParametrosGeneralProcesoFacturasProductos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesofacturasproductosReturnGeneral=procesofacturasproductosLogic.procesarAccionProcesoFacturasProductossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesofacturasproductosLogic.getProcesoFacturasProductoss(),this.procesofacturasproductosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoFacturasProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoFacturasProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoFacturasProductos();
					
					ProcesoFacturasProductosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoFacturasProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoFacturasProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoFacturasProductos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoFacturasProductosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoFacturasProductos();
			
			if(this.jInternalFrameDetalleFormProcesoFacturasProductos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();		
			ProcesoFacturasProductos procesofacturasproductos=new ProcesoFacturasProductos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoFacturasProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoFacturasProductos.getSelectedItem();
			
			
			
			
			procesofacturasproductossSeleccionados=this.getProcesoFacturasProductossSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesofacturasproductossSeleccionados.size()==1) {
				for(ProcesoFacturasProductos procesofacturasproductosAux:procesofacturasproductossSeleccionados) {
					procesofacturasproductos=procesofacturasproductosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoFacturasProductos();
			
      		//this.finishProcessProcesoFacturasProductos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoFacturasProductosReturnGeneral() throws Exception {
		if(this.procesofacturasproductosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesofacturasproductosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesofacturasproductosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesofacturasproductosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesofacturasproductosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesofacturasproductosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoFacturasProductos(false);
		}
		
		if(this.procesofacturasproductosReturnGeneral.getConRetornoLista() || this.procesofacturasproductosReturnGeneral.getConRetornoObjeto()) {
			if(this.procesofacturasproductosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.procesofacturasproductosLogic.setProcesoFacturasProductoss(this.procesofacturasproductosReturnGeneral.getProcesoFacturasProductoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoFacturasProductos(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoFacturasProductos() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoFacturasProductos> getProcesoFacturasProductossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoFacturasProductos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoFacturasProductos procesofacturasproductosAux:procesofacturasproductosLogic.getProcesoFacturasProductoss()) {
					if(procesofacturasproductosAux.getIsSelected()) {
						procesofacturasproductossSeleccionados.add(procesofacturasproductosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoFacturasProductos procesofacturasproductosAux:this.procesofacturasproductoss) {
					if(procesofacturasproductosAux.getIsSelected()) {
						procesofacturasproductossSeleccionados.add(procesofacturasproductosAux);				
					}
				}
			}
			
			if(procesofacturasproductossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesofacturasproductossSeleccionados.addAll(this.procesofacturasproductosLogic.getProcesoFacturasProductoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesofacturasproductossSeleccionados.addAll(this.procesofacturasproductoss);				
					}
				}
			}
		} else {
			procesofacturasproductossSeleccionados.add(this.procesofacturasproductos);
		}
		
		return procesofacturasproductossSeleccionados;
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
	
	public void generarReporteProcesoFacturasProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoFacturasProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoFacturasProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoFacturasProductossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoFacturasProductossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Facturas Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoFacturasProductossSeleccionados() throws Exception {
		ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();		
		
		procesofacturasproductossSeleccionados=this.getProcesoFacturasProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoFacturasProductoss("Todos",procesofacturasproductossSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoFacturasProductossSeleccionados() throws Exception {
		ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();		
		
		procesofacturasproductossSeleccionados=this.getProcesoFacturasProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoFacturasProductoss("Todos",procesofacturasproductossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoFacturasProductossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();
		
		procesofacturasproductossSeleccionados=this.getProcesoFacturasProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoFacturasProductoss("Todos",procesofacturasproductossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoFacturasProductossSeleccionados() throws Exception {
		ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoFacturasProductos();
		
		
		procesofacturasproductossSeleccionados=this.getProcesoFacturasProductossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoFacturasProductos();
		
		
		//this.generarReporteProcesoFacturasProductoss("Todos",procesofacturasproductossSeleccionados ,procesofacturasproductosImplementable,procesofacturasproductosImplementableHome);
	}
	
	public void mostrarImportacionProcesoFacturasProductoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoFacturasProductos();
		
		this.abrirFrameImportacionProcesoFacturasProductos();		
		
			
		//this.generarReporteProcesoFacturasProductoss("Todos",procesofacturasproductossSeleccionados ,procesofacturasproductosImplementable,procesofacturasproductosImplementableHome);
	}
	
	public void importarProcesoFacturasProductoss() throws Exception {		
	
	}
	
	public void exportarProcesoFacturasProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoFacturasProductossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoFacturasProductossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoFacturasProductossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Facturas Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoFacturasProductossSeleccionados() throws Exception {
		ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();		
		
		procesofacturasproductossSeleccionados=this.getProcesoFacturasProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesofacturasproductos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoFacturasProductos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoFacturasProductos procesofacturasproductosAux:procesofacturasproductossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoFacturasProductos(procesofacturasproductosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesofacturasproductosAux.setsDetalleGeneralEntityReporte(procesofacturasproductosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Facturas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoFacturasProductos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_IDZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_IDGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesofacturasproductos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getzona_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getgrupocliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getnombre_provincia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getnombre_ciudad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getnombre_zona();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getnombre_grupo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getcodigo_dato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getnombre_completo_dato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getnumero_pre_impreso_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesofacturasproductos.gettarea();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoFacturasProductossSeleccionados() throws Exception {
		ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();		
		
		procesofacturasproductossSeleccionados=this.getProcesoFacturasProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesofacturasproductos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoFacturasProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoFacturasProductos(row);				
				iRow++;
			}				
			
			for(ProcesoFacturasProductos procesofacturasproductosAux:procesofacturasproductossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoFacturasProductos(procesofacturasproductosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Facturas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoFacturasProductossSeleccionados() throws Exception {
		ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();		
		
		procesofacturasproductossSeleccionados=this.getProcesoFacturasProductossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesofacturasproductos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesofacturasproductoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesofacturasproductos");
			//elementRoot.appendChild(element);
		
			for(ProcesoFacturasProductos procesofacturasproductosAux:procesofacturasproductossSeleccionados) {
				element = document.createElement("procesofacturasproductos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoFacturasProductos(procesofacturasproductosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Facturas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoFacturasProductos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_IDZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getzona_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getgrupocliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getnombre_provincia());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getnombre_ciudad());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getnombre_zona());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getnombre_grupo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getcodigo_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getnombre_completo_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getnumero_pre_impreso_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(procesofacturasproductos.gettarea());				
	}
	
	public void setFilaDatosExportarXmlProcesoFacturasProductos(ProcesoFacturasProductos procesofacturasproductos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoFacturasProductosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesofacturasproductos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoFacturasProductosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesofacturasproductos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementciudad_descripcion = document.createElement(ProcesoFacturasProductosConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(procesofacturasproductos.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementzona_descripcion = document.createElement(ProcesoFacturasProductosConstantesFunciones.IDZONA);
		elementzona_descripcion.appendChild(document.createTextNode(procesofacturasproductos.getzona_descripcion()));
		element.appendChild(elementzona_descripcion);

		Element elementgrupocliente_descripcion = document.createElement(ProcesoFacturasProductosConstantesFunciones.IDGRUPOCLIENTE);
		elementgrupocliente_descripcion.appendChild(document.createTextNode(procesofacturasproductos.getgrupocliente_descripcion()));
		element.appendChild(elementgrupocliente_descripcion);

		Element elementvendedor_descripcion = document.createElement(ProcesoFacturasProductosConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(procesofacturasproductos.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementcodigo = document.createElement(ProcesoFacturasProductosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(procesofacturasproductos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(ProcesoFacturasProductosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(procesofacturasproductos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementnombre_provincia = document.createElement(ProcesoFacturasProductosConstantesFunciones.NOMBREPROVINCIA);
		elementnombre_provincia.appendChild(document.createTextNode(procesofacturasproductos.getnombre_provincia().trim()));
		element.appendChild(elementnombre_provincia);

		Element elementnombre_ciudad = document.createElement(ProcesoFacturasProductosConstantesFunciones.NOMBRECIUDAD);
		elementnombre_ciudad.appendChild(document.createTextNode(procesofacturasproductos.getnombre_ciudad().trim()));
		element.appendChild(elementnombre_ciudad);

		Element elementnombre_zona = document.createElement(ProcesoFacturasProductosConstantesFunciones.NOMBREZONA);
		elementnombre_zona.appendChild(document.createTextNode(procesofacturasproductos.getnombre_zona().trim()));
		element.appendChild(elementnombre_zona);

		Element elementnombre_grupo_cliente = document.createElement(ProcesoFacturasProductosConstantesFunciones.NOMBREGRUPOCLIENTE);
		elementnombre_grupo_cliente.appendChild(document.createTextNode(procesofacturasproductos.getnombre_grupo_cliente().trim()));
		element.appendChild(elementnombre_grupo_cliente);

		Element elementcodigo_dato = document.createElement(ProcesoFacturasProductosConstantesFunciones.CODIGODATO);
		elementcodigo_dato.appendChild(document.createTextNode(procesofacturasproductos.getcodigo_dato().trim()));
		element.appendChild(elementcodigo_dato);

		Element elementnombre_completo_dato = document.createElement(ProcesoFacturasProductosConstantesFunciones.NOMBRECOMPLETODATO);
		elementnombre_completo_dato.appendChild(document.createTextNode(procesofacturasproductos.getnombre_completo_dato().trim()));
		element.appendChild(elementnombre_completo_dato);

		Element elementnumero_pre_impreso_factura = document.createElement(ProcesoFacturasProductosConstantesFunciones.NUMEROPREIMPRESOFACTURA);
		elementnumero_pre_impreso_factura.appendChild(document.createTextNode(procesofacturasproductos.getnumero_pre_impreso_factura().trim()));
		element.appendChild(elementnumero_pre_impreso_factura);

		Element elementnombre_producto = document.createElement(ProcesoFacturasProductosConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(procesofacturasproductos.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementnombre_unidad = document.createElement(ProcesoFacturasProductosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(procesofacturasproductos.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementprecio = document.createElement(ProcesoFacturasProductosConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(procesofacturasproductos.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementtarea = document.createElement(ProcesoFacturasProductosConstantesFunciones.TAREA);
		elementtarea.appendChild(document.createTextNode(procesofacturasproductos.gettarea().trim()));
		element.appendChild(elementtarea);
	}
	
	public void generarReporteGroupGenericoProcesoFacturasProductossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados=new ArrayList<ProcesoFacturasProductos>();
		
		procesofacturasproductossSeleccionados=this.getProcesoFacturasProductossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoFacturasProductos(procesofacturasproductossSeleccionados);
		
		this.generarReporteProcesoFacturasProductoss("Todos",procesofacturasproductossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoFacturasProductos(ArrayList<ProcesoFacturasProductos> procesofacturasproductossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoFacturasProductos procesofacturasproductosAux:procesofacturasproductossSeleccionados) {
				procesofacturasproductosAux.setsDetalleGeneralEntityReporte(procesofacturasproductosAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_IDZONA)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getzona_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_IDGRUPOCLIENTE)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getgrupocliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getnombre_provincia());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getnombre_ciudad());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getnombre_zona());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getnombre_grupo_cliente());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getcodigo_dato());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getnombre_completo_dato());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getnumero_pre_impreso_factura());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA)) {
					existe=true;
					procesofacturasproductosAux.setsDescripcionGeneralEntityReporte1(procesofacturasproductosAux.gettarea());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoFacturasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoFacturasProductos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoFacturasProductos=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaEliminarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoFacturasProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoFacturasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=false;
			this.isVisibilidadCeldaModificarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoFacturasProductos=true;
			this.isVisibilidadCeldaEliminarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoFacturasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoFacturasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=false;
			this.isVisibilidadCeldaModificarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoFacturasProductos=true;
			this.isVisibilidadCeldaEliminarProcesoFacturasProductos=true;
			this.isVisibilidadCeldaCancelarProcesoFacturasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoFacturasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=false;
			this.isVisibilidadCeldaModificarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoFacturasProductos=true;
			this.isVisibilidadCeldaEliminarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoFacturasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoFacturasProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=true;
			this.isVisibilidadCeldaModificarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaEliminarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoFacturasProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoFacturasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaEliminarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoFacturasProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoFacturasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=false;
			this.isVisibilidadCeldaModificarProcesoFacturasProductos=true;
			this.isVisibilidadCeldaActualizarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaEliminarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoFacturasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoFacturasProductos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoFacturasProductosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoFacturasProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=true;
		} else {
			this.actualizarEstadoPanelsProcesoFacturasProductos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoFacturasProductos=false;
			//this.isVisibilidadCeldaVerFormProcesoFacturasProductos=false;
			this.isVisibilidadCeldaDuplicarProcesoFacturasProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesofacturasproductosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoFacturasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
			if(!procesofacturasproductosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=false;												
			}
			
			this.jButtonCerrarProcesoFacturasProductos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=false;
		}
		
		if(!this.permiteMantenimiento(this.procesofacturasproductos)) {
			this.isVisibilidadCeldaActualizarProcesoFacturasProductos=false;
			this.isVisibilidadCeldaEliminarProcesoFacturasProductos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoFacturasProductos=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoFacturasProductos=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoFacturasProductos=false;
		//this.isVisibilidadCeldaModificarProcesoFacturasProductos=true;
		this.isVisibilidadCeldaActualizarProcesoFacturasProductos=false;
		this.isVisibilidadCeldaEliminarProcesoFacturasProductos=false;
		//this.isVisibilidadCeldaCancelarProcesoFacturasProductos=true;			
		this.isVisibilidadCeldaGuardarProcesoFacturasProductos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoFacturasProductos() {
	}
	
	public void actualizarEstadoPanelsProcesoFacturasProductos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoFacturasProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoFacturasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoFacturasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosProcesoFacturasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoFacturasProductos!=null) {
				this.jPanelPaginacionProcesoFacturasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoFacturasProductos!=null) {
				this.jPanelParametrosReportesProcesoFacturasProductos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoFacturasProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoFacturasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoFacturasProductos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosProcesoFacturasProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoFacturasProductos!=null) {
				this.jPanelPaginacionProcesoFacturasProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoFacturasProductos!=null) {
				this.jPanelParametrosReportesProcesoFacturasProductos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoFacturasProductos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoFacturasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoFacturasProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosProcesoFacturasProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoFacturasProductos!=null) {
				this.jPanelPaginacionProcesoFacturasProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoFacturasProductos!=null) {
				this.jPanelParametrosReportesProcesoFacturasProductos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoFacturasProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoFacturasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoFacturasProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosProcesoFacturasProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoFacturasProductos!=null) {
				this.jPanelPaginacionProcesoFacturasProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoFacturasProductos!=null) {
				this.jPanelParametrosReportesProcesoFacturasProductos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoFacturasProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoFacturasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoFacturasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosProcesoFacturasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoFacturasProductos!=null) {
				this.jPanelPaginacionProcesoFacturasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoFacturasProductos!=null) {
				this.jPanelParametrosReportesProcesoFacturasProductos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoFacturasProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoFacturasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoFacturasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosProcesoFacturasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoFacturasProductos!=null) {
				this.jPanelPaginacionProcesoFacturasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoFacturasProductos!=null) {
				this.jPanelParametrosReportesProcesoFacturasProductos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoFacturasProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoFacturasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoFacturasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoFacturasProductos!=null) {
				this.jScrollPanelDatosProcesoFacturasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoFacturasProductos!=null) {
				this.jPanelPaginacionProcesoFacturasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoFacturasProductos!=null) {
				this.jPanelParametrosReportesProcesoFacturasProductos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoFacturasProductos!=null) {
					this.jTabbedPaneBusquedasProcesoFacturasProductos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoFacturasProductos!=null) {
				this.jPanelParametrosReportesProcesoFacturasProductos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoFacturasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoFacturasProductos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoFacturasProductos!=null) {
				this.jPanelParametrosReportesProcesoFacturasProductos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadBusquedaProcesoFacturasProductos=isParaCiudad;
			if(!this.isVisibilidadBusquedaProcesoFacturasProductos) {this.jTabbedPaneBusquedasProcesoFacturasProductos.remove(jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaZona(Boolean isParaZona){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaZonaNegation=!isParaZona;

			this.isVisibilidadBusquedaProcesoFacturasProductos=isParaZona;
			if(!this.isVisibilidadBusquedaProcesoFacturasProductos) {this.jTabbedPaneBusquedasProcesoFacturasProductos.remove(jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoCliente(Boolean isParaGrupoCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoClienteNegation=!isParaGrupoCliente;

			this.isVisibilidadBusquedaProcesoFacturasProductos=isParaGrupoCliente;
			if(!this.isVisibilidadBusquedaProcesoFacturasProductos) {this.jTabbedPaneBusquedasProcesoFacturasProductos.remove(jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadBusquedaProcesoFacturasProductos=isParaVendedor;
			if(!this.isVisibilidadBusquedaProcesoFacturasProductos) {this.jTabbedPaneBusquedasProcesoFacturasProductos.remove(jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos);}
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
			
			this.inicializarActualizarBindingTablaProcesoFacturasProductos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoFacturasProductos() {
		this.updateBorderResaltarBusquedasFormularioProcesoFacturasProductos();
		this.updateVisibilidadBusquedasFormularioProcesoFacturasProductos();
		this.updateHabilitarBusquedasFormularioProcesoFacturasProductos();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoFacturasProductos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoFacturasProductos.getComponents().length>0) {
	

		if(this.procesofacturasproductosConstantesFunciones.resaltarBusquedaProcesoFacturasProductosProcesoFacturasProductos!=null) {
			index= this.jTabbedPaneBusquedasProcesoFacturasProductos.indexOfComponent(this.jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoFacturasProductos.getComponent(index);
				jPanel.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarBusquedaProcesoFacturasProductosProcesoFacturasProductos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoFacturasProductos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoFacturasProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoFacturasProductos.indexOfComponent(this.jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoFacturasProductos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarBusquedaProcesoFacturasProductosProcesoFacturasProductos);
			if(!this.procesofacturasproductosConstantesFunciones.mostrarBusquedaProcesoFacturasProductosProcesoFacturasProductos && index>-1) {
				this.jTabbedPaneBusquedasProcesoFacturasProductos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoFacturasProductos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoFacturasProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoFacturasProductos.indexOfComponent(this.jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoFacturasProductos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesofacturasproductosConstantesFunciones.activarBusquedaProcesoFacturasProductosProcesoFacturasProductos);
				this.jTabbedPaneBusquedasProcesoFacturasProductos.setEnabledAt(index,this.procesofacturasproductosConstantesFunciones.activarBusquedaProcesoFacturasProductosProcesoFacturasProductos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoFacturasProductos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoFacturasProductos")) {
			index= this.jTabbedPaneBusquedasProcesoFacturasProductos.indexOfComponent(this.jPanelBusquedaProcesoFacturasProductosProcesoFacturasProductos);

			this.jTabbedPaneBusquedasProcesoFacturasProductos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoFacturasProductos.getComponent(index);

			this.procesofacturasproductosConstantesFunciones.setResaltarBusquedaProcesoFacturasProductosProcesoFacturasProductos(resaltar);

			jPanel.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarBusquedaProcesoFacturasProductosProcesoFacturasProductos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoFacturasProductos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoFacturasProductos() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoFacturasProductos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoFacturasProductos();
		this.updateVisibilidadResaltarControlesFormularioProcesoFacturasProductos();
		this.updateHabilitarResaltarControlesFormularioProcesoFacturasProductos();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoFacturasProductos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesofacturasproductosConstantesFunciones.resaltaridProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelidProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltaridProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarid_ciudadProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarid_ciudadProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarid_zonaProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarid_zonaProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarid_grupo_clienteProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarid_grupo_clienteProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarid_vendedorProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarid_vendedorProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarcodigoProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldcodigoProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarcodigoProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarnombre_completoProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_completoProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarnombre_completoProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarnombre_provinciaProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_provinciaProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarnombre_provinciaProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarnombre_ciudadProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_ciudadProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarnombre_ciudadProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarnombre_zonaProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_zonaProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarnombre_zonaProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarnombre_grupo_clienteProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_grupo_clienteProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarnombre_grupo_clienteProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarcodigo_datoProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldcodigo_datoProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarcodigo_datoProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarnombre_completo_datoProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_completo_datoProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarnombre_completo_datoProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarnumero_pre_impreso_facturaProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarnumero_pre_impreso_facturaProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarnombre_productoProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_productoProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarnombre_productoProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarnombre_unidadProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_unidadProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarnombre_unidadProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltarprecioProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldprecioProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltarprecioProcesoFacturasProductos);}
		if(this.procesofacturasproductosConstantesFunciones.resaltartareaProcesoFacturasProductos!=null && this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreatareaProcesoFacturasProductos.setBorder(this.procesofacturasproductosConstantesFunciones.resaltartareaProcesoFacturasProductos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoFacturasProductos() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
	
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelidProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostraridProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelidProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostraridProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarid_ciudadProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelid_ciudadProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarid_ciudadProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarid_zonaProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelid_zonaProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarid_zonaProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarid_grupo_clienteProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelid_grupo_clienteProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarid_grupo_clienteProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarid_vendedorProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelid_vendedorProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarid_vendedorProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldcodigoProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarcodigoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelcodigoProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarcodigoProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_completoProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_completoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelnombre_completoProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_completoProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_provinciaProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_provinciaProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelnombre_provinciaProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_provinciaProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_ciudadProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_ciudadProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelnombre_ciudadProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_ciudadProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_zonaProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_zonaProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelnombre_zonaProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_zonaProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_grupo_clienteProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_grupo_clienteProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelnombre_grupo_clienteProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_grupo_clienteProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldcodigo_datoProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarcodigo_datoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelcodigo_datoProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarcodigo_datoProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_completo_datoProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_completo_datoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelnombre_completo_datoProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_completo_datoProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnumero_pre_impreso_facturaProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelnumero_pre_impreso_facturaProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnumero_pre_impreso_facturaProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_productoProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_productoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelnombre_productoProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_productoProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_unidadProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_unidadProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelnombre_unidadProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarnombre_unidadProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldprecioProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarprecioProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPanelprecioProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrarprecioProcesoFacturasProductos);
		//this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreatareaProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrartareaProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jPaneltareaProcesoFacturasProductos.setVisible(this.procesofacturasproductosConstantesFunciones.mostrartareaProcesoFacturasProductos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoFacturasProductos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoFacturasProductos!=null) {
	
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jLabelidProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activaridProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_ciudadProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarid_ciudadProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_zonaProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarid_zonaProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_grupo_clienteProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarid_grupo_clienteProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jComboBoxid_vendedorProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarid_vendedorProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldcodigoProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarcodigoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_completoProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarnombre_completoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_provinciaProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarnombre_provinciaProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_ciudadProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarnombre_ciudadProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_zonaProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarnombre_zonaProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_grupo_clienteProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarnombre_grupo_clienteProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldcodigo_datoProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarcodigo_datoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_completo_datoProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarnombre_completo_datoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarnumero_pre_impreso_facturaProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreanombre_productoProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarnombre_productoProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldnombre_unidadProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarnombre_unidadProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextFieldprecioProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activarprecioProcesoFacturasProductos);
		this.jInternalFrameDetalleFormProcesoFacturasProductos.jTextAreatareaProcesoFacturasProductos.setEnabled(this.procesofacturasproductosConstantesFunciones.activartareaProcesoFacturasProductos);
		}
	}
	
		
}