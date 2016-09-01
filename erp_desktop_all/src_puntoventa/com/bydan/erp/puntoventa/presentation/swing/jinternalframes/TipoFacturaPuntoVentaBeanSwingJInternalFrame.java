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

import com.bydan.erp.puntoventa.util.TipoFacturaPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.TipoFacturaPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.TipoFacturaPuntoVentaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.TipoFacturaPuntoVentaBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoFacturaPuntoVentaBeanSwingJInternalFrame extends TipoFacturaPuntoVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoFacturaPuntoVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoFacturaPuntoVenta> tipofacturapuntoventaValidator = new ClassValidator<TipoFacturaPuntoVenta>(TipoFacturaPuntoVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoFacturaPuntoVenta tipofacturapuntoventa;	
	public TipoFacturaPuntoVenta tipofacturapuntoventaAux;
	public TipoFacturaPuntoVenta tipofacturapuntoventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoFacturaPuntoVenta tipofacturapuntoventaTotales;
	public Long idTipoFacturaPuntoVentaActual;
	public Long iIdNuevoTipoFacturaPuntoVenta=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosFacturaPuntoVenta=false;

	public Boolean getIsTienePermisosFacturaPuntoVenta() {
		return isTienePermisosFacturaPuntoVenta;
	}

	public void setIsTienePermisosFacturaPuntoVenta(Boolean isTienePermisosFacturaPuntoVenta) {
		this.isTienePermisosFacturaPuntoVenta= isTienePermisosFacturaPuntoVenta;
	}


	public Boolean isTienePermisosNotaCreditoPuntoVenta=false;

	public Boolean getIsTienePermisosNotaCreditoPuntoVenta() {
		return isTienePermisosNotaCreditoPuntoVenta;
	}

	public void setIsTienePermisosNotaCreditoPuntoVenta(Boolean isTienePermisosNotaCreditoPuntoVenta) {
		this.isTienePermisosNotaCreditoPuntoVenta= isTienePermisosNotaCreditoPuntoVenta;
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
	
	public Boolean isPermisoTodoTipoFacturaPuntoVenta;
	public Boolean isPermisoNuevoTipoFacturaPuntoVenta;
	public Boolean isPermisoActualizarTipoFacturaPuntoVenta;
	public Boolean isPermisoActualizarOriginalTipoFacturaPuntoVenta;
	public Boolean isPermisoEliminarTipoFacturaPuntoVenta;
	public Boolean isPermisoGuardarCambiosTipoFacturaPuntoVenta;
	public Boolean isPermisoConsultaTipoFacturaPuntoVenta;
	public Boolean isPermisoBusquedaTipoFacturaPuntoVenta;
	public Boolean isPermisoReporteTipoFacturaPuntoVenta;
	public Boolean isPermisoPaginacionMedioTipoFacturaPuntoVenta;
	public Boolean isPermisoPaginacionAltoTipoFacturaPuntoVenta;
	public Boolean isPermisoPaginacionTodoTipoFacturaPuntoVenta;
	public Boolean isPermisoCopiarTipoFacturaPuntoVenta;
	public Boolean isPermisoVerFormTipoFacturaPuntoVenta;
	public Boolean isPermisoDuplicarTipoFacturaPuntoVenta;
	public Boolean isPermisoOrdenTipoFacturaPuntoVenta;
	
	
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
	
	public TipoFacturaPuntoVentaParameterReturnGeneral tipofacturapuntoventaReturnGeneral;
	public TipoFacturaPuntoVentaParameterReturnGeneral tipofacturapuntoventaParameterGeneral;
	
	

	public FacturaPuntoVentaLogic facturapuntoventaLogic=null;

	public FacturaPuntoVentaLogic getFacturaPuntoVentaLogic() {
		return facturapuntoventaLogic;
	}

	public void setFacturaPuntoVentaLogic(FacturaPuntoVentaLogic facturapuntoventaLogic) {
		this.facturapuntoventaLogic = facturapuntoventaLogic;
	}


	public NotaCreditoPuntoVentaLogic notacreditopuntoventaLogic=null;

	public NotaCreditoPuntoVentaLogic getNotaCreditoPuntoVentaLogic() {
		return notacreditopuntoventaLogic;
	}

	public void setNotaCreditoPuntoVentaLogic(NotaCreditoPuntoVentaLogic notacreditopuntoventaLogic) {
		this.notacreditopuntoventaLogic = notacreditopuntoventaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoFacturaPuntoVenta=false;
	public Boolean esParaAccionDesdeFormularioTipoFacturaPuntoVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoFacturaPuntoVentaLogic tipofacturapuntoventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoFacturaPuntoVenta tipofacturapuntoventaBean;
	public TipoFacturaPuntoVentaConstantesFunciones tipofacturapuntoventaConstantesFunciones;
	//public TipoFacturaPuntoVentaParameterReturnGeneral tipofacturapuntoventaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoFacturaPuntoVenta> tipofacturapuntoventas;	
	//public List<TipoFacturaPuntoVenta> tipofacturapuntoventasEliminados;
	//public List<TipoFacturaPuntoVenta> tipofacturapuntoventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaDuplicarTipoFacturaPuntoVenta=true;
	public Boolean isVisibilidadCeldaCopiarTipoFacturaPuntoVenta=true;
	public Boolean isVisibilidadCeldaVerFormTipoFacturaPuntoVenta=true;
	public Boolean isVisibilidadCeldaOrdenTipoFacturaPuntoVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaModificarTipoFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaActualizarTipoFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaEliminarTipoFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaCancelarTipoFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=false;	
	
	
	
	public Long getiIdNuevoTipoFacturaPuntoVenta() {
		return this.iIdNuevoTipoFacturaPuntoVenta;
	}

	public void setiIdNuevoTipoFacturaPuntoVenta(Long iIdNuevoTipoFacturaPuntoVenta) {
		this.iIdNuevoTipoFacturaPuntoVenta = iIdNuevoTipoFacturaPuntoVenta;
	}
	
	public Long getidTipoFacturaPuntoVentaActual() {
		return this.idTipoFacturaPuntoVentaActual;
	}

	public void setidTipoFacturaPuntoVentaActual(Long idTipoFacturaPuntoVentaActual) {
		this.idTipoFacturaPuntoVentaActual = idTipoFacturaPuntoVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoFacturaPuntoVenta gettipofacturapuntoventa() {
		return this.tipofacturapuntoventa;
	}

	public void settipofacturapuntoventa(TipoFacturaPuntoVenta tipofacturapuntoventa) {
		this.tipofacturapuntoventa = tipofacturapuntoventa;
	}
	
	public TipoFacturaPuntoVenta gettipofacturapuntoventaAux() {
		return this.tipofacturapuntoventaAux;
	}

	public void settipofacturapuntoventaAux(TipoFacturaPuntoVenta tipofacturapuntoventaAux) {
		this.tipofacturapuntoventaAux = tipofacturapuntoventaAux;
	}				
	
	public TipoFacturaPuntoVenta gettipofacturapuntoventaAnterior() {
		return this.tipofacturapuntoventaAnterior;
	}

	public void settipofacturapuntoventaAnterior(TipoFacturaPuntoVenta tipofacturapuntoventaAnterior) {
		this.tipofacturapuntoventaAnterior = tipofacturapuntoventaAnterior;
	}	
	
	public TipoFacturaPuntoVenta gettipofacturapuntoventaTotales() {
		return this.tipofacturapuntoventaTotales;
	}

	public void settipofacturapuntoventaTotales(TipoFacturaPuntoVenta tipofacturapuntoventaTotales) {
		this.tipofacturapuntoventaTotales = tipofacturapuntoventaTotales;
	}	
	
	public TipoFacturaPuntoVenta gettipofacturapuntoventaBean() {
		return this.tipofacturapuntoventaBean;
	}

	public void settipofacturapuntoventaBean(TipoFacturaPuntoVenta tipofacturapuntoventaBean) {
		this.tipofacturapuntoventaBean = tipofacturapuntoventaBean;
	}	
	
	public TipoFacturaPuntoVentaParameterReturnGeneral gettipofacturapuntoventaReturnGeneral() {
		return this.tipofacturapuntoventaReturnGeneral;
	}

	public void settipofacturapuntoventaReturnGeneral(TipoFacturaPuntoVentaParameterReturnGeneral tipofacturapuntoventaReturnGeneral) {
		this.tipofacturapuntoventaReturnGeneral = tipofacturapuntoventaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoFacturaPuntoVentaLogic getTipoFacturaPuntoVentaLogic()	{		
		return tipofacturapuntoventaLogic;
	}

	public void setTipoFacturaPuntoVentaLogic(TipoFacturaPuntoVentaLogic tipofacturapuntoventaLogic) {
		this.tipofacturapuntoventaLogic = tipofacturapuntoventaLogic;
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
	
	public Boolean getIsEsNuevoTipoFacturaPuntoVenta() {
		return isEsNuevoTipoFacturaPuntoVenta;
	}

	public void setIsEsNuevoTipoFacturaPuntoVenta(Boolean isEsNuevoTipoFacturaPuntoVenta) {
		this.isEsNuevoTipoFacturaPuntoVenta = isEsNuevoTipoFacturaPuntoVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoFacturaPuntoVenta() {
		return esParaAccionDesdeFormularioTipoFacturaPuntoVenta;
	}
	
	public void setEsParaAccionDesdeFormularioTipoFacturaPuntoVenta(Boolean esParaAccionDesdeFormularioTipoFacturaPuntoVenta) {
		this.esParaAccionDesdeFormularioTipoFacturaPuntoVenta = esParaAccionDesdeFormularioTipoFacturaPuntoVenta;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoFacturaPuntoVenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoFacturaPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesTipoFacturaPuntoVenta(this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoFacturaPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesTipoFacturaPuntoVenta(this.tipofacturapuntoventas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipofacturapuntoventaLogic.setTipoFacturaPuntoVentas(this.tipofacturapuntoventas);
			tipofacturapuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoFacturaPuntoVentaParameterReturnGeneral getTipoFacturaPuntoVentaParameterGeneral() {
		return this.tipofacturapuntoventaParameterGeneral;
	}
	
	public void setTipoFacturaPuntoVentaParameterGeneral(TipoFacturaPuntoVentaParameterReturnGeneral tipofacturapuntoventaParameterGeneral) {
		this.tipofacturapuntoventaParameterGeneral = tipofacturapuntoventaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoFacturaPuntoVenta() {
		return isPermisoTodoTipoFacturaPuntoVenta;
	}

	public void setIsPermisoTodoTipoFacturaPuntoVenta(Boolean isPermisoTodoTipoFacturaPuntoVenta) {
		this.isPermisoTodoTipoFacturaPuntoVenta = isPermisoTodoTipoFacturaPuntoVenta;
	}

	public Boolean getIsPermisoNuevoTipoFacturaPuntoVenta() {
		return isPermisoNuevoTipoFacturaPuntoVenta;
	}

	public void setIsPermisoNuevoTipoFacturaPuntoVenta(Boolean isPermisoNuevoTipoFacturaPuntoVenta) {
		this.isPermisoNuevoTipoFacturaPuntoVenta = isPermisoNuevoTipoFacturaPuntoVenta;
	}

	public Boolean getIsPermisoActualizarTipoFacturaPuntoVenta() {
		return isPermisoActualizarTipoFacturaPuntoVenta;
	}

	public void setIsPermisoActualizarTipoFacturaPuntoVenta(Boolean isPermisoActualizarTipoFacturaPuntoVenta) {
		this.isPermisoActualizarTipoFacturaPuntoVenta = isPermisoActualizarTipoFacturaPuntoVenta;
	}

	public Boolean getIsPermisoEliminarTipoFacturaPuntoVenta() {
		return isPermisoEliminarTipoFacturaPuntoVenta;
	}

	public void setIsPermisoEliminarTipoFacturaPuntoVenta(Boolean isPermisoEliminarTipoFacturaPuntoVenta) {
		this.isPermisoEliminarTipoFacturaPuntoVenta = isPermisoEliminarTipoFacturaPuntoVenta;
	}

	public Boolean getIsPermisoGuardarCambiosTipoFacturaPuntoVenta() {
		return isPermisoGuardarCambiosTipoFacturaPuntoVenta;
	}

	public void setIsPermisoGuardarCambiosTipoFacturaPuntoVenta(Boolean isPermisoGuardarCambiosTipoFacturaPuntoVenta) {
		this.isPermisoGuardarCambiosTipoFacturaPuntoVenta = isPermisoGuardarCambiosTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoConsultaTipoFacturaPuntoVenta() {
		return isPermisoConsultaTipoFacturaPuntoVenta;
	}

	public void setIsPermisoConsultaTipoFacturaPuntoVenta(Boolean isPermisoConsultaTipoFacturaPuntoVenta) {
		this.isPermisoConsultaTipoFacturaPuntoVenta = isPermisoConsultaTipoFacturaPuntoVenta;
	}

	public Boolean getIsPermisoBusquedaTipoFacturaPuntoVenta() {
		return isPermisoBusquedaTipoFacturaPuntoVenta;
	}

	public void setIsPermisoBusquedaTipoFacturaPuntoVenta(Boolean isPermisoBusquedaTipoFacturaPuntoVenta) {
		this.isPermisoBusquedaTipoFacturaPuntoVenta = isPermisoBusquedaTipoFacturaPuntoVenta;
	}

	public Boolean getIsPermisoReporteTipoFacturaPuntoVenta() {
		return isPermisoReporteTipoFacturaPuntoVenta;
	}

	public void setIsPermisoReporteTipoFacturaPuntoVenta(Boolean isPermisoReporteTipoFacturaPuntoVenta) {
		this.isPermisoReporteTipoFacturaPuntoVenta = isPermisoReporteTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoFacturaPuntoVenta() {
		return isPermisoPaginacionMedioTipoFacturaPuntoVenta;
	}

	public void setIsPermisoPaginacionMedioTipoFacturaPuntoVenta(Boolean isPermisoPaginacionMedioTipoFacturaPuntoVenta) {
		this.isPermisoPaginacionMedioTipoFacturaPuntoVenta = isPermisoPaginacionMedioTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoFacturaPuntoVenta() {
		return isPermisoPaginacionTodoTipoFacturaPuntoVenta;
	}

	public void setIsPermisoPaginacionTodoTipoFacturaPuntoVenta(Boolean isPermisoPaginacionTodoTipoFacturaPuntoVenta) {
		this.isPermisoPaginacionTodoTipoFacturaPuntoVenta = isPermisoPaginacionTodoTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoFacturaPuntoVenta() {
		return isPermisoPaginacionAltoTipoFacturaPuntoVenta;
	}

	public void setIsPermisoPaginacionAltoTipoFacturaPuntoVenta(Boolean isPermisoPaginacionAltoTipoFacturaPuntoVenta) {
		this.isPermisoPaginacionAltoTipoFacturaPuntoVenta = isPermisoPaginacionAltoTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoCopiarTipoFacturaPuntoVenta() {
		return isPermisoCopiarTipoFacturaPuntoVenta;
	}

	public void setIsPermisoCopiarTipoFacturaPuntoVenta(Boolean isPermisoCopiarTipoFacturaPuntoVenta) {
		this.isPermisoCopiarTipoFacturaPuntoVenta = isPermisoCopiarTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoVerFormTipoFacturaPuntoVenta() {
		return isPermisoVerFormTipoFacturaPuntoVenta;
	}

	public void setIsPermisoVerFormTipoFacturaPuntoVenta(Boolean isPermisoVerFormTipoFacturaPuntoVenta) {
		this.isPermisoVerFormTipoFacturaPuntoVenta = isPermisoVerFormTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoDuplicarTipoFacturaPuntoVenta() {
		return isPermisoDuplicarTipoFacturaPuntoVenta;
	}

	public void setIsPermisoDuplicarTipoFacturaPuntoVenta(Boolean isPermisoDuplicarTipoFacturaPuntoVenta) {
		this.isPermisoDuplicarTipoFacturaPuntoVenta = isPermisoDuplicarTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoOrdenTipoFacturaPuntoVenta() {
		return isPermisoOrdenTipoFacturaPuntoVenta;
	}

	public void setIsPermisoOrdenTipoFacturaPuntoVenta(Boolean isPermisoOrdenTipoFacturaPuntoVenta) {
		this.isPermisoOrdenTipoFacturaPuntoVenta = isPermisoOrdenTipoFacturaPuntoVenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoFacturaPuntoVenta() {
		return isVisibilidadCeldaNuevoTipoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoTipoFacturaPuntoVenta(Boolean isVisibilidadCeldaNuevoTipoFacturaPuntoVenta) {
		this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta = isVisibilidadCeldaNuevoTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoFacturaPuntoVenta() {
		return isVisibilidadCeldaDuplicarTipoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaDuplicarTipoFacturaPuntoVenta(Boolean isVisibilidadCeldaDuplicarTipoFacturaPuntoVenta) {
		this.isVisibilidadCeldaDuplicarTipoFacturaPuntoVenta = isVisibilidadCeldaDuplicarTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoFacturaPuntoVenta() {
		return isVisibilidadCeldaCopiarTipoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaCopiarTipoFacturaPuntoVenta(Boolean isVisibilidadCeldaCopiarTipoFacturaPuntoVenta) {
		this.isVisibilidadCeldaCopiarTipoFacturaPuntoVenta = isVisibilidadCeldaCopiarTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoFacturaPuntoVenta() {
		return isVisibilidadCeldaVerFormTipoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaVerFormTipoFacturaPuntoVenta(Boolean isVisibilidadCeldaVerFormTipoFacturaPuntoVenta) {
		this.isVisibilidadCeldaVerFormTipoFacturaPuntoVenta = isVisibilidadCeldaVerFormTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoFacturaPuntoVenta() {
		return isVisibilidadCeldaOrdenTipoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaOrdenTipoFacturaPuntoVenta(Boolean isVisibilidadCeldaOrdenTipoFacturaPuntoVenta) {
		this.isVisibilidadCeldaOrdenTipoFacturaPuntoVenta = isVisibilidadCeldaOrdenTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta() {
		return isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta(Boolean isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta) {
		this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta = isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoFacturaPuntoVenta() {
		return isVisibilidadCeldaModificarTipoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaModificarTipoFacturaPuntoVenta(Boolean isVisibilidadCeldaModificarTipoFacturaPuntoVenta) {
		this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta = isVisibilidadCeldaModificarTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoFacturaPuntoVenta() {
		return isVisibilidadCeldaActualizarTipoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaActualizarTipoFacturaPuntoVenta(Boolean isVisibilidadCeldaActualizarTipoFacturaPuntoVenta) {
		this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta = isVisibilidadCeldaActualizarTipoFacturaPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoFacturaPuntoVenta() {
		return isVisibilidadCeldaEliminarTipoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaEliminarTipoFacturaPuntoVenta(Boolean isVisibilidadCeldaEliminarTipoFacturaPuntoVenta) {
		this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta = isVisibilidadCeldaEliminarTipoFacturaPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoFacturaPuntoVenta() {
		return isVisibilidadCeldaCancelarTipoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaCancelarTipoFacturaPuntoVenta(Boolean isVisibilidadCeldaCancelarTipoFacturaPuntoVenta) {
		this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta = isVisibilidadCeldaCancelarTipoFacturaPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoFacturaPuntoVenta() {
		return isVisibilidadCeldaGuardarTipoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarTipoFacturaPuntoVenta(Boolean isVisibilidadCeldaGuardarTipoFacturaPuntoVenta) {
		this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta = isVisibilidadCeldaGuardarTipoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta() {
		return isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta(Boolean isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta) {
		this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta = isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta;
	}
		
	public TipoFacturaPuntoVentaSessionBean gettipofacturapuntoventaSessionBean() {
		return this.tipofacturapuntoventaSessionBean;
	}
	
	public void settipofacturapuntoventaSessionBean(TipoFacturaPuntoVentaSessionBean tipofacturapuntoventaSessionBean) {
		this.tipofacturapuntoventaSessionBean=tipofacturapuntoventaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(TipoFacturaPuntoVenta tipofacturapuntoventa,TipoFacturaPuntoVenta tipofacturapuntoventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoFacturaPuntoVenta(tipofacturapuntoventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipofacturapuntoventaAux.setId(tipofacturapuntoventa.getId());
		tipofacturapuntoventaAux.setVersionRow(tipofacturapuntoventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoFacturaPuntoVenta();
		
			int intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(this.tipofacturapuntoventa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipofacturapuntoventaValidator.getInvalidValues(this.tipofacturapuntoventa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipofacturapuntoventaLogic.setDatosCliente(datosCliente);
			tipofacturapuntoventaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipofacturapuntoventaAux=new  TipoFacturaPuntoVenta();
				
				tipofacturapuntoventaAux.setIsNew(true);
				tipofacturapuntoventaAux.setIsChanged(true);
				
				tipofacturapuntoventaAux.setTipoFacturaPuntoVentaOriginal(this.tipofacturapuntoventa);
				
				tipofacturapuntoventaAux.setId(this.tipofacturapuntoventa.getId());	
				tipofacturapuntoventaAux.setVersionRow(this.tipofacturapuntoventa.getVersionRow());	
				tipofacturapuntoventaAux.setnombre(this.tipofacturapuntoventa.getnombre());	
				tipofacturapuntoventaAux.setdescripcion(this.tipofacturapuntoventa.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipofacturapuntoventaAux,tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofacturapuntoventaAux,tipofacturapuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofacturapuntoventaLogic.saveTipoFacturaPuntoVentas();//WithConnection
						//tipofacturapuntoventaLogic.getSetVersionRowTipoFacturaPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipofacturapuntoventa,tipofacturapuntoventaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipofacturapuntoventaAux=new  TipoFacturaPuntoVenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado() && this.tipofacturapuntoventa.getId()>=0)) {
						
					tipofacturapuntoventaAux.setIsNew(false);
				}
				
				tipofacturapuntoventaAux.setIsDeleted(false);
			
				tipofacturapuntoventaAux.setId(this.tipofacturapuntoventa.getId());	
				tipofacturapuntoventaAux.setVersionRow(this.tipofacturapuntoventa.getVersionRow());	
				tipofacturapuntoventaAux.setnombre(this.tipofacturapuntoventa.getnombre());	
				tipofacturapuntoventaAux.setdescripcion(this.tipofacturapuntoventa.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipofacturapuntoventaAux,tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofacturapuntoventaAux,tipofacturapuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofacturapuntoventaLogic.saveTipoFacturaPuntoVentas();//WithConnection
						//tipofacturapuntoventaLogic.getSetVersionRowTipoFacturaPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipofacturapuntoventa,tipofacturapuntoventaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipofacturapuntoventaAux=new  TipoFacturaPuntoVenta();
				
				tipofacturapuntoventaAux.setIsNew(false);
				tipofacturapuntoventaAux.setIsChanged(false);
				
				tipofacturapuntoventaAux.setIsDeleted(true);
				
				tipofacturapuntoventaAux.setId(this.tipofacturapuntoventa.getId());	
				tipofacturapuntoventaAux.setVersionRow(this.tipofacturapuntoventa.getVersionRow());	
				tipofacturapuntoventaAux.setnombre(this.tipofacturapuntoventa.getnombre());	
				tipofacturapuntoventaAux.setdescripcion(this.tipofacturapuntoventa.getdescripcion());	
				
				if(this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipofacturapuntoventaAux.getId()>=0) {	
						this.tipofacturapuntoventasEliminados.add(tipofacturapuntoventaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipofacturapuntoventaAux,tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofacturapuntoventaAux,tipofacturapuntoventas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofacturapuntoventaLogic.saveTipoFacturaPuntoVentas();//WithConnection
						//tipofacturapuntoventaLogic.getSetVersionRowTipoFacturaPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipofacturapuntoventaAux.setFacturaPuntoVentas(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas());

							if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipofacturapuntoventaAux.setNotaCreditoPuntoVentas(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipofacturapuntoventaAux,tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipofacturapuntoventaAux,tipofacturapuntoventas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().addAll(this.tipofacturapuntoventasEliminados);
					
					tipofacturapuntoventaLogic.saveTipoFacturaPuntoVentas();//WithConnection
					//tipofacturapuntoventaLogic.getSetVersionRowTipoFacturaPuntoVentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipofacturapuntoventasEliminados= new ArrayList<TipoFacturaPuntoVenta>();		
			}
			
			if(this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Factura Punto Venta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Factura Punto Venta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipofacturapuntoventa=tipofacturapuntoventaAux;
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
      		//this.finishProcessTipoFacturaPuntoVenta();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoFacturaPuntoVenta tipofacturapuntoventaLocal) throws Exception {
		
		if(this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipofacturapuntoventaLocal.setFacturaPuntoVentas(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas());
				tipofacturapuntoventaLocal.setNotaCreditoPuntoVentas(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas());
			
			} else {
			
				tipofacturapuntoventaLocal.setFacturaPuntoVentas(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventas);
				tipofacturapuntoventaLocal.setNotaCreditoPuntoVentas(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoFacturaPuntoVenta tipofacturapuntoventaLocal) throws Exception {	
		if(this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoFacturaPuntoVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipofacturapuntoventaValidator.getInvalidValues(this.tipofacturapuntoventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoFacturaPuntoVenta tipofacturapuntoventa,List<TipoFacturaPuntoVenta> tipofacturapuntoventas) throws Exception {
		try	{		
			TipoFacturaPuntoVentaConstantesFunciones.actualizarLista(tipofacturapuntoventa,tipofacturapuntoventas,this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoFacturaPuntoVenta tipofacturapuntoventa,List<TipoFacturaPuntoVenta> tipofacturapuntoventas) throws Exception {
		try	{			
			TipoFacturaPuntoVentaConstantesFunciones.actualizarSelectedLista(tipofacturapuntoventa,tipofacturapuntoventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoFacturaPuntoVenta> tipofacturapuntoventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipofacturapuntoventasLocal=this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipofacturapuntoventasLocal=this.tipofacturapuntoventas;
			}
			//ARCHITECTURE
		
			for(TipoFacturaPuntoVenta tipofacturapuntoventaLocal:tipofacturapuntoventasLocal) {
				if(this.permiteMantenimiento(tipofacturapuntoventaLocal) && tipofacturapuntoventaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoFacturaPuntoVentaConstantesFunciones.getTipoFacturaPuntoVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoFacturaPuntoVentaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jLabelnombreTipoFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoFacturaPuntoVentaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jLabeldescripcionTipoFacturaPuntoVenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jLabelnombreTipoFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jLabeldescripcionTipoFacturaPuntoVenta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FacturaPuntoVenta")) {
			if(this.tipofacturapuntoventa==null) {
				this.tipofacturapuntoventa= new TipoFacturaPuntoVenta();
			}

			if(this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoFacturaPuntoVenta
				this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(this.tipofacturapuntoventa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);

				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.getfacturapuntoventa().setTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
			}

			return;
		}
		 else  if(sTipo.equals("NotaCreditoPuntoVenta")) {
			if(this.tipofacturapuntoventa==null) {
				this.tipofacturapuntoventa= new TipoFacturaPuntoVenta();
			}

			if(this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoFacturaPuntoVenta
				this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(this.tipofacturapuntoventa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);

				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.getnotacreditopuntoventa().setTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoFacturaPuntoVenta--;	
		
		
		this.tipofacturapuntoventaAux=new TipoFacturaPuntoVenta();
		
		this.tipofacturapuntoventaAux.setId(this.iIdNuevoTipoFacturaPuntoVenta);
		this.tipofacturapuntoventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().add(this.tipofacturapuntoventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipofacturapuntoventas.add(this.tipofacturapuntoventaAux);
		}
		//ARCHITECTURE
		
		this.tipofacturapuntoventa=this.tipofacturapuntoventaAux;
		
		if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
		}
				
		//this.setDefaultControlesTipoFacturaPuntoVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoFacturaPuntoVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoFacturaPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFacturaPuntoVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFacturaPuntoVenta(this.tipofacturapuntoventaBean,this.tipofacturapuntoventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
			classes=TipoFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfTipoFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipofacturapuntoventaReturnGeneral=tipofacturapuntoventaLogic.procesarEventosTipoFacturaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas(),this.tipofacturapuntoventa,this.tipofacturapuntoventaParameterGeneral,this.isEsNuevoTipoFacturaPuntoVenta,classes);//this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoFacturaPuntoVenta(this.tipofacturapuntoventaReturnGeneral,this.tipofacturapuntoventaBean,false);
		
		if(this.tipofacturapuntoventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFacturaPuntoVenta(this.tipofacturapuntoventaReturnGeneral.getTipoFacturaPuntoVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoFacturaPuntoVenta(this.tipofacturapuntoventaReturnGeneral.getTipoFacturaPuntoVenta());
		}
		
		if(this.tipofacturapuntoventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoFacturaPuntoVenta(this.tipofacturapuntoventaReturnGeneral.getTipoFacturaPuntoVenta(),classes);//this.tipofacturapuntoventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(this.tipofacturapuntoventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoFacturaPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoFacturaPuntoVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(false);
						
			if(tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.getEsGuardarRelacionado() && FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaPuntoVentaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() && NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNotaCreditoPuntoVentaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFacturaPuntoVenta();
			}
			
			this.actualizarVisualTableDatosTipoFacturaPuntoVenta();
			
			this.jTableDatosTipoFacturaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoTipoFacturaPuntoVenta(), this.getIndiceNuevoTipoFacturaPuntoVenta());
			
			this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
						
			this.actualizarEstadoCeldasBotonesTipoFacturaPuntoVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoFacturaPuntoVenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreanombreTipoFacturaPuntoVenta.setEnabled(isHabilitar && this.tipofacturapuntoventaConstantesFunciones.activarnombreTipoFacturaPuntoVenta);
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreadescripcionTipoFacturaPuntoVenta.setEnabled(isHabilitar && this.tipofacturapuntoventaConstantesFunciones.activardescripcionTipoFacturaPuntoVenta);	
		
	};
	
	public void setDefaultControlesTipoFacturaPuntoVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoFacturaPuntoVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipofacturapuntoventaSessionBean.setConGuardarRelaciones(true);			
			this.tipofacturapuntoventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTabbedPaneRelacionesTipoFacturaPuntoVenta.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipofacturapuntoventaSessionBean.setConGuardarRelaciones(false);			
			this.tipofacturapuntoventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTabbedPaneRelacionesTipoFacturaPuntoVenta.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoFacturaPuntoVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas()) {
				if(tipofacturapuntoventaAux.getId().equals(this.iIdNuevoTipoFacturaPuntoVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventas) {
				if(tipofacturapuntoventaAux.getId().equals(this.iIdNuevoTipoFacturaPuntoVenta)) {
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
	
	public int getIndiceActualTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas()) {
				if(tipofacturapuntoventaAux.getId().equals(tipofacturapuntoventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventas) {
				if(tipofacturapuntoventaAux.getId().equals(tipofacturapuntoventa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas()) {
				if(tipofacturapuntoventaAux.getTipoFacturaPuntoVentaOriginal().getId().equals(tipofacturapuntoventaOriginal.getId())) {
					existe=true;
					tipofacturapuntoventaOriginal.setId(tipofacturapuntoventaAux.getId());
					tipofacturapuntoventaOriginal.setVersionRow(tipofacturapuntoventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventas) {
				if(tipofacturapuntoventaAux.getTipoFacturaPuntoVentaOriginal().getId().equals(tipofacturapuntoventaOriginal.getId())) {
					existe=true;
					tipofacturapuntoventaOriginal.setId(tipofacturapuntoventaAux.getId());
					tipofacturapuntoventaOriginal.setVersionRow(tipofacturapuntoventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoFacturaPuntoVenta(Boolean esParaCancelar) throws Exception {
		tipofacturapuntoventasAux=new ArrayList<TipoFacturaPuntoVenta>();
		tipofacturapuntoventaAux=new TipoFacturaPuntoVenta();
		
		if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas()) {
					if(tipofacturapuntoventaAux.getId()<0) {
						tipofacturapuntoventasAux.add(tipofacturapuntoventaAux);
					}		
				}
				this.iIdNuevoTipoFacturaPuntoVenta=0L;
				this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().removeAll(tipofacturapuntoventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventas) {
					if(tipofacturapuntoventaAux.getId()<0) {
						tipofacturapuntoventasAux.add(tipofacturapuntoventaAux);
					}		
				}
				this.iIdNuevoTipoFacturaPuntoVenta=0L;
				this.tipofacturapuntoventas.removeAll(tipofacturapuntoventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoFacturaPuntoVenta 
					&& this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().size()>0
					) {
					tipofacturapuntoventaAux=this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().get(this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().size() - 1);
				
					if(tipofacturapuntoventaAux.getId()<0) {
						this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().remove(tipofacturapuntoventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoFacturaPuntoVenta && this.tipofacturapuntoventas.size()>0) {
					tipofacturapuntoventaAux=this.tipofacturapuntoventas.get(this.tipofacturapuntoventas.size() - 1);
				
					if(tipofacturapuntoventaAux.getId()<0) {
						this.tipofacturapuntoventas.remove(tipofacturapuntoventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoFacturaPuntoVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipofacturapuntoventa.getId()<0) {
				this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().remove(this.tipofacturapuntoventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipofacturapuntoventa.getId()<0) {
				this.tipofacturapuntoventas.remove(this.tipofacturapuntoventa);
			}
		}			
	}
	
	public void setEstadosInicialesTipoFacturaPuntoVenta(List<TipoFacturaPuntoVenta> tipofacturapuntoventasAux) throws Exception {
		TipoFacturaPuntoVentaConstantesFunciones.setEstadosInicialesTipoFacturaPuntoVenta(tipofacturapuntoventasAux);
	}
	
	public void setEstadosInicialesTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventaAux) throws Exception {
		TipoFacturaPuntoVentaConstantesFunciones.setEstadosInicialesTipoFacturaPuntoVenta(tipofacturapuntoventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoFacturaPuntoVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoFacturaPuntoVentaActual()) {
				if(!this.isEsNuevoTipoFacturaPuntoVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoFacturaPuntoVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoFacturaPuntoVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Factura Punto Venta ?", "MANTENIMIENTO DE Tipo Factura Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoFacturaPuntoVenta tipofacturapuntoventa) throws Exception {
		TipoFacturaPuntoVentaConstantesFunciones.seleccionarAsignar(this.tipofacturapuntoventa,tipofacturapuntoventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoFacturaPuntoVenta=this.isPermisoActualizarOriginalTipoFacturaPuntoVenta;
			
			
			this.seleccionarAsignar(tipofacturapuntoventa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoFacturaPuntoVentaConstantesFunciones.quitarEspaciosTipoFacturaPuntoVenta(this.tipofacturapuntoventa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoFacturaPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipofacturapuntoventaSessionBean.setsFuncionBusquedaRapida(this.tipofacturapuntoventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoFacturaPuntoVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoFacturaPuntoVenta(esParaCancelar);				
				this.cancelarNuevoTipoFacturaPuntoVenta(esParaCancelar);								
			}
			
			this.tipofacturapuntoventa=new TipoFacturaPuntoVenta();
			
			this.inicializarTipoFacturaPuntoVenta();
			
			this.actualizarEstadoCeldasBotonesTipoFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoFacturaPuntoVenta() throws Exception {
		try {
			TipoFacturaPuntoVentaConstantesFunciones.inicializarTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoFacturaPuntoVentas(String sAccionBusqueda,List<TipoFacturaPuntoVenta> tipofacturapuntoventasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoFacturaPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoFacturaPuntoVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoFacturaPuntoVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoFacturaPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Factura Punto Ventas");		
		parameters.put("busquedapor", TipoFacturaPuntoVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(FacturaPuntoVenta.class));
			classes.add(new Classe(NotaCreditoPuntoVenta.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoFacturaPuntoVentaLogic tipofacturapuntoventaLogicAuxiliar=new TipoFacturaPuntoVentaLogic();
					tipofacturapuntoventaLogicAuxiliar.setDatosCliente(tipofacturapuntoventaLogic.getDatosCliente());				
					tipofacturapuntoventaLogicAuxiliar.setTipoFacturaPuntoVentas(tipofacturapuntoventasParaReportes);
					
					tipofacturapuntoventaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoFacturaPuntoVentaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipofacturapuntoventasParaReportes=tipofacturapuntoventaLogicAuxiliar.getTipoFacturaPuntoVentas();
					
					//tipofacturapuntoventaLogic.getNewConnexionToDeep();
					
					//for (TipoFacturaPuntoVenta tipofacturapuntoventa:tipofacturapuntoventasParaReportes) {
					//	tipofacturapuntoventaLogic.deepLoad(tipofacturapuntoventa, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipofacturapuntoventaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipofacturapuntoventaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFacturaPuntoVenta = AuxiliarReportes.class.getResourceAsStream("FacturaPuntoVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_facturapuntoventa", reportFileFacturaPuntoVenta);

			InputStream reportFileNotaCreditoPuntoVenta = AuxiliarReportes.class.getResourceAsStream("NotaCreditoPuntoVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_notacreditopuntoventa", reportFileNotaCreditoPuntoVenta);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoFacturaPuntoVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoFacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoFacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoFacturaPuntoVenta=new JRBeanArrayDataSource(TipoFacturaPuntoVentaJInternalFrame.TraerTipoFacturaPuntoVentaBeans(tipofacturapuntoventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoFacturaPuntoVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoFacturaPuntoVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoFacturaPuntoVentaBean.TraerTipoFacturaPuntoVentaBeans(tipofacturapuntoventasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,tipofacturapuntoventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,tipofacturapuntoventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoFacturaPuntoVentaActionPerformed(null);
					//this.generarExcelReporteTipoFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,tipofacturapuntoventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,tipofacturapuntoventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,tipofacturapuntoventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,tipofacturapuntoventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoFacturaPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFacturaPuntoVenta> tipofacturapuntoventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofacturapuntoventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFacturaPuntoVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFacturaPuntoVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoFacturaPuntoVenta tipofacturapuntoventa : tipofacturapuntoventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoFacturaPuntoVentaConstantesFunciones.generarExcelReporteDataTipoFacturaPuntoVenta("NORMAL",row,workbook,tipofacturapuntoventa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoFacturaPuntoVenta(String sTipo,Row row,Workbook workbook) {
		
		TipoFacturaPuntoVentaConstantesFunciones.generarExcelReporteHeaderTipoFacturaPuntoVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoFacturaPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFacturaPuntoVenta> tipofacturapuntoventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofacturapuntoventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFacturaPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoFacturaPuntoVenta tipofacturapuntoventa : tipofacturapuntoventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoFacturaPuntoVentaConstantesFunciones.getTipoFacturaPuntoVentaDescripcion(tipofacturapuntoventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipofacturapuntoventa.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipofacturapuntoventa.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoFacturaPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFacturaPuntoVenta> tipofacturapuntoventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoFacturaPuntoVenta> tipofacturapuntoventasRespaldo=null;
		
		classes=TipoFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfTipoFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipofacturapuntoventaLogic.setDatosCliente(this.datosCliente);
		this.tipofacturapuntoventaLogic.setDatosDeep(this.datosDeep);
		this.tipofacturapuntoventaLogic.setIsConDeep(true);
		
		tipofacturapuntoventasRespaldo=this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas();
		
		this.tipofacturapuntoventaLogic.setTipoFacturaPuntoVentas(tipofacturapuntoventasParaReportes);	
		this.tipofacturapuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipofacturapuntoventasParaReportes=this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas();
		this.tipofacturapuntoventaLogic.setTipoFacturaPuntoVentas(tipofacturapuntoventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofacturapuntoventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFacturaPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFacturaPuntoVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoFacturaPuntoVenta tipofacturapuntoventa : tipofacturapuntoventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoFacturaPuntoVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoFacturaPuntoVentaConstantesFunciones.generarExcelReporteDataTipoFacturaPuntoVenta("NORMAL",row,workbook,tipofacturapuntoventa,cellStyleDataAux);
		
			
			


				//FacturaPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipofacturapuntoventa.getFacturaPuntoVentas()!=null && tipofacturapuntoventa.getFacturaPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FacturaPuntoVentaConstantesFunciones.generarExcelReporteHeaderFacturaPuntoVenta("RELACIONADO",row,workbook);
				}

				if(tipofacturapuntoventa.getFacturaPuntoVentas()!=null) {
					i2=0;
					for(FacturaPuntoVenta facturapuntoventa : tipofacturapuntoventa.getFacturaPuntoVentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FacturaPuntoVentaConstantesFunciones.generarExcelReporteDataFacturaPuntoVenta("RELACIONADO",row,workbook,facturapuntoventa,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//NotaCreditoPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipofacturapuntoventa.getNotaCreditoPuntoVentas()!=null && tipofacturapuntoventa.getNotaCreditoPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					NotaCreditoPuntoVentaConstantesFunciones.generarExcelReporteHeaderNotaCreditoPuntoVenta("RELACIONADO",row,workbook);
				}

				if(tipofacturapuntoventa.getNotaCreditoPuntoVentas()!=null) {
					i2=0;
					for(NotaCreditoPuntoVenta notacreditopuntoventa : tipofacturapuntoventa.getNotaCreditoPuntoVentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						NotaCreditoPuntoVentaConstantesFunciones.generarExcelReporteDataNotaCreditoPuntoVenta("RELACIONADO",row,workbook,notacreditopuntoventa,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoFacturaPuntoVentaConstantesFunciones.getTipoFacturaPuntoVentaDescripcion(tipofacturapuntoventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoFacturaPuntoVenta() throws Exception {		
		this.startProcessTipoFacturaPuntoVenta(true);
	}
	
	public void startProcessTipoFacturaPuntoVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoFacturaPuntoVenta, this.jScrollPanelDatosTipoFacturaPuntoVenta,this.jPanelPaginacionTipoFacturaPuntoVenta, this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta, this.jPanelAccionesTipoFacturaPuntoVenta,this.jPanelAccionesFormularioTipoFacturaPuntoVenta,this.jmenuBarTipoFacturaPuntoVenta,this.jmenuBarDetalleTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,this.jTtoolBarDetalleTipoFacturaPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFacturaPuntoVenta=null; 
		
		final JPanel jPanelParametrosReportesTipoFacturaPuntoVenta=this.jPanelParametrosReportesTipoFacturaPuntoVenta;
		//final JScrollPane jScrollPanelDatosTipoFacturaPuntoVenta=this.jScrollPanelDatosTipoFacturaPuntoVenta;
		final JTable jTableDatosTipoFacturaPuntoVenta=this.jTableDatosTipoFacturaPuntoVenta;		
		final JPanel jPanelPaginacionTipoFacturaPuntoVenta=this.jPanelPaginacionTipoFacturaPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionTipoFacturaPuntoVenta=this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta;
		final JPanel jPanelAccionesTipoFacturaPuntoVenta=this.jPanelAccionesTipoFacturaPuntoVenta;
		
		JPanel jPanelCamposAuxiliarTipoFacturaPuntoVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoFacturaPuntoVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
			jPanelCamposAuxiliarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jPanelCamposTipoFacturaPuntoVenta;
			jPanelAccionesFormularioAuxiliarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jPanelAccionesFormularioTipoFacturaPuntoVenta;
		}
		
		final JPanel jPanelCamposTipoFacturaPuntoVenta=jPanelCamposAuxiliarTipoFacturaPuntoVenta;
		final JPanel jPanelAccionesFormularioTipoFacturaPuntoVenta=jPanelAccionesFormularioAuxiliarTipoFacturaPuntoVenta;
		
		
		final JMenuBar jmenuBarTipoFacturaPuntoVenta=this.jmenuBarTipoFacturaPuntoVenta;
		final JToolBar jTtoolBarTipoFacturaPuntoVenta=this.jTtoolBarTipoFacturaPuntoVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoFacturaPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFacturaPuntoVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jmenuBarDetalleTipoFacturaPuntoVenta;
			jTtoolBarDetalleAuxiliarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTtoolBarDetalleTipoFacturaPuntoVenta;
		}
		
		final JMenuBar jmenuBarDetalleTipoFacturaPuntoVenta=jmenuBarDetalleAuxiliarTipoFacturaPuntoVenta;
		final JToolBar jTtoolBarDetalleTipoFacturaPuntoVenta=jTtoolBarDetalleAuxiliarTipoFacturaPuntoVenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFacturaPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFacturaPuntoVenta;
			processRunnable.jTableDatos=jTableDatosTipoFacturaPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposTipoFacturaPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFacturaPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFacturaPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFacturaPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFacturaPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFacturaPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarTipoFacturaPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFacturaPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoFacturaPuntoVenta ,jPanelParametrosReportesTipoFacturaPuntoVenta,jTableDatosTipoFacturaPuntoVenta, /*jScrollPanelDatosTipoFacturaPuntoVenta,*/jPanelCamposTipoFacturaPuntoVenta,jPanelPaginacionTipoFacturaPuntoVenta, /*jScrollPanelDatosEdicionTipoFacturaPuntoVenta,*/ jPanelAccionesTipoFacturaPuntoVenta,jPanelAccionesFormularioTipoFacturaPuntoVenta,jmenuBarTipoFacturaPuntoVenta,jmenuBarDetalleTipoFacturaPuntoVenta,jTtoolBarTipoFacturaPuntoVenta,jTtoolBarDetalleTipoFacturaPuntoVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoFacturaPuntoVenta, jScrollPanelDatosTipoFacturaPuntoVenta,jPanelPaginacionTipoFacturaPuntoVenta, jScrollPanelDatosEdicionTipoFacturaPuntoVenta, jPanelAccionesTipoFacturaPuntoVenta,jPanelAccionesFormularioTipoFacturaPuntoVenta,jmenuBarTipoFacturaPuntoVenta,jmenuBarDetalleTipoFacturaPuntoVenta,jTtoolBarTipoFacturaPuntoVenta,jTtoolBarDetalleTipoFacturaPuntoVenta);
						
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
	
	public void finishProcessTipoFacturaPuntoVenta() {// throws Exception 
		this.finishProcessTipoFacturaPuntoVenta(true);
	}
	
	public void finishProcessTipoFacturaPuntoVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoFacturaPuntoVenta, this.jScrollPanelDatosTipoFacturaPuntoVenta,this.jPanelPaginacionTipoFacturaPuntoVenta, this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta, this.jPanelAccionesTipoFacturaPuntoVenta,this.jPanelAccionesFormularioTipoFacturaPuntoVenta,this.jmenuBarTipoFacturaPuntoVenta,this.jmenuBarDetalleTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,this.jTtoolBarDetalleTipoFacturaPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFacturaPuntoVenta=null; 
		
		final JPanel jPanelParametrosReportesTipoFacturaPuntoVenta=this.jPanelParametrosReportesTipoFacturaPuntoVenta;
		//final JScrollPane jScrollPanelDatosTipoFacturaPuntoVenta=this.jScrollPanelDatosTipoFacturaPuntoVenta;
		final JTable jTableDatosTipoFacturaPuntoVenta=this.jTableDatosTipoFacturaPuntoVenta;		
		final JPanel jPanelPaginacionTipoFacturaPuntoVenta=this.jPanelPaginacionTipoFacturaPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionTipoFacturaPuntoVenta=this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta;
		final JPanel jPanelAccionesTipoFacturaPuntoVenta=this.jPanelAccionesTipoFacturaPuntoVenta;
		
		JPanel jPanelCamposAuxiliarTipoFacturaPuntoVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoFacturaPuntoVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
			jPanelCamposAuxiliarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jPanelCamposTipoFacturaPuntoVenta;
			jPanelAccionesFormularioAuxiliarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jPanelAccionesFormularioTipoFacturaPuntoVenta;
		}
		
		final JPanel jPanelCamposTipoFacturaPuntoVenta=jPanelCamposAuxiliarTipoFacturaPuntoVenta;
		final JPanel jPanelAccionesFormularioTipoFacturaPuntoVenta=jPanelAccionesFormularioAuxiliarTipoFacturaPuntoVenta;
		
		
		final JMenuBar jmenuBarTipoFacturaPuntoVenta=this.jmenuBarTipoFacturaPuntoVenta;		
		final JToolBar jTtoolBarTipoFacturaPuntoVenta=this.jTtoolBarTipoFacturaPuntoVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoFacturaPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFacturaPuntoVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jmenuBarDetalleTipoFacturaPuntoVenta;
			jTtoolBarDetalleAuxiliarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTtoolBarDetalleTipoFacturaPuntoVenta;		
		}
		
		final JMenuBar jmenuBarDetalleTipoFacturaPuntoVenta=jmenuBarDetalleAuxiliarTipoFacturaPuntoVenta;
		final JToolBar jTtoolBarDetalleTipoFacturaPuntoVenta=jTtoolBarDetalleAuxiliarTipoFacturaPuntoVenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFacturaPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFacturaPuntoVenta;
			processRunnable.jTableDatos=jTableDatosTipoFacturaPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposTipoFacturaPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFacturaPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFacturaPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFacturaPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFacturaPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFacturaPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarTipoFacturaPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFacturaPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoFacturaPuntoVenta ,jPanelParametrosReportesTipoFacturaPuntoVenta, jTableDatosTipoFacturaPuntoVenta,/*jScrollPanelDatosTipoFacturaPuntoVenta,*/jPanelCamposTipoFacturaPuntoVenta,jPanelPaginacionTipoFacturaPuntoVenta, /*jScrollPanelDatosEdicionTipoFacturaPuntoVenta,*/ jPanelAccionesTipoFacturaPuntoVenta,jPanelAccionesFormularioTipoFacturaPuntoVenta,jmenuBarTipoFacturaPuntoVenta,jmenuBarDetalleTipoFacturaPuntoVenta,jTtoolBarTipoFacturaPuntoVenta,jTtoolBarDetalleTipoFacturaPuntoVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoFacturaPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoFacturaPuntoVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoFacturaPuntoVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoFacturaPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoFacturaPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoFacturaPuntoVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoFacturaPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoFacturaPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoFacturaPuntoVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipofacturapuntoventaConstantesFunciones.getsFinalQueryTipoFacturaPuntoVenta();
		String  finalQueryPaginacionTodos=this.tipofacturapuntoventaConstantesFunciones.getsFinalQueryTipoFacturaPuntoVenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoFacturaPuntoVentaConstantesFunciones.getArrayColumnasGlobalesNoTipoFacturaPuntoVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoFacturaPuntoVentaConstantesFunciones.getArrayColumnasGlobalesTipoFacturaPuntoVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoFacturaPuntoVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipofacturapuntoventasEliminados= new ArrayList<TipoFacturaPuntoVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoFacturaPuntoVenta();
		
				///*TipoFacturaPuntoVentaSessionBean*/this.tipofacturapuntoventaSessionBean=new TipoFacturaPuntoVentaSessionBean();
			
			if(this.tipofacturapuntoventaSessionBean==null) {
				this.tipofacturapuntoventaSessionBean=new TipoFacturaPuntoVentaSessionBean();
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
					this.iNumeroPaginacion=TipoFacturaPuntoVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoFacturaPuntoVentaConstantesFunciones.getClassesForeignKeysOfTipoFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipofacturapuntoventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipofacturapuntoventasAux= new ArrayList<TipoFacturaPuntoVenta>();
			
				
			tipofacturapuntoventaLogic.setDatosCliente(this.datosCliente);
			tipofacturapuntoventaLogic.setDatosDeep(this.datosDeep);
			tipofacturapuntoventaLogic.setIsConDeep(true);
			
			
			tipofacturapuntoventaLogic.getTipoFacturaPuntoVentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipofacturapuntoventaLogic.getTodosTipoFacturaPuntoVentas(finalQueryGlobal,pagination);
					
					//tipofacturapuntoventaLogic.getTodosTipoFacturaPuntoVentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas()==null|| tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofacturapuntoventasAux= new ArrayList<TipoFacturaPuntoVenta>();
							tipofacturapuntoventasAux.addAll(tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofacturapuntoventasAux= new ArrayList<TipoFacturaPuntoVenta>();
							tipofacturapuntoventasAux.addAll(tipofacturapuntoventas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofacturapuntoventaLogic.getTodosTipoFacturaPuntoVentas(finalQueryGlobal+"",this.pagination);												
							
							//tipofacturapuntoventaLogic.getTodosTipoFacturaPuntoVentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoFacturaPuntoVentas("Todos",tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofacturapuntoventaLogic.setTipoFacturaPuntoVentas(new ArrayList<TipoFacturaPuntoVenta>());					
							tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().addAll(tipofacturapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofacturapuntoventas=new ArrayList<TipoFacturaPuntoVenta>();
							tipofacturapuntoventas.addAll(tipofacturapuntoventasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoFacturaPuntoVenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoFacturaPuntoVenta=this.idActual;
				
				} else if(this.idTipoFacturaPuntoVentaActual!=null && this.idTipoFacturaPuntoVentaActual!=0L) {
					idTipoFacturaPuntoVenta=idTipoFacturaPuntoVentaActual;
				}
				
					
				this.sDetalleReporte=TipoFacturaPuntoVentaConstantesFunciones.getDetalleIndicePorId(idTipoFacturaPuntoVenta);
				
				this.tipofacturapuntoventas=new ArrayList<TipoFacturaPuntoVenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipofacturapuntoventaLogic.getEntity(idTipoFacturaPuntoVenta);
					
					//tipofacturapuntoventaLogic.getEntityWithConnection(idTipoFacturaPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofacturapuntoventaLogic.setTipoFacturaPuntoVentas(new ArrayList<TipoFacturaPuntoVenta>());
					tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().add(tipofacturapuntoventaLogic.getTipoFacturaPuntoVenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipofacturapuntoventas=new ArrayList<TipoFacturaPuntoVenta>();
					this.tipofacturapuntoventas.add(tipofacturapuntoventa);
				}
				
				if(tipofacturapuntoventaLogic.getTipoFacturaPuntoVenta()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoFacturaPuntoVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoFacturaPuntoVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofacturapuntoventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofacturapuntoventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoFacturaPuntoVenta tipofacturapuntoventa) {
		Boolean permite=true;
		
		if(this.tipofacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoFacturaPuntoVentaConstantesFunciones.getOrderByListaTipoFacturaPuntoVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoFacturaPuntoVentaConstantesFunciones.getOrderByListaTipoFacturaPuntoVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFacturaPuntoVenta tipofacturapuntoventa:tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas()) {
				if(tipofacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					tipofacturapuntoventaTotales=tipofacturapuntoventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFacturaPuntoVenta tipofacturapuntoventa:this.tipofacturapuntoventas) {
				if(tipofacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					tipofacturapuntoventaTotales=tipofacturapuntoventa;
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
			this.tipofacturapuntoventaAux=new TipoFacturaPuntoVenta();
			this.tipofacturapuntoventaAux.setsType(Constantes2.S_TOTALES);
			this.tipofacturapuntoventaAux.setIsNew(false);
			this.tipofacturapuntoventaAux.setIsChanged(false);
			this.tipofacturapuntoventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoFacturaPuntoVentaConstantesFunciones.TotalizarValoresFilaTipoFacturaPuntoVenta(this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas(),this.tipofacturapuntoventaAux);
				
				this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().add(this.tipofacturapuntoventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoFacturaPuntoVentaConstantesFunciones.TotalizarValoresFilaTipoFacturaPuntoVenta(this.tipofacturapuntoventas,this.tipofacturapuntoventaAux);
				
				this.tipofacturapuntoventas.add(this.tipofacturapuntoventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipofacturapuntoventaTotales=new TipoFacturaPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().remove(tipofacturapuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipofacturapuntoventas.remove(tipofacturapuntoventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipofacturapuntoventaTotales=new TipoFacturaPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFacturaPuntoVenta tipofacturapuntoventa:tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas()) {
				if(tipofacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					tipofacturapuntoventaTotales=tipofacturapuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFacturaPuntoVentaConstantesFunciones.TotalizarValoresFilaTipoFacturaPuntoVenta(this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas(),tipofacturapuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFacturaPuntoVenta tipofacturapuntoventa:this.tipofacturapuntoventas) {
				if(tipofacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					tipofacturapuntoventaTotales=tipofacturapuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFacturaPuntoVentaConstantesFunciones.TotalizarValoresFilaTipoFacturaPuntoVenta(this.tipofacturapuntoventas,tipofacturapuntoventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoFacturaPuntoVenta() {
		this.isPermisoTodoTipoFacturaPuntoVenta=false;
		this.isPermisoNuevoTipoFacturaPuntoVenta=false;
		this.isPermisoActualizarTipoFacturaPuntoVenta=false;
		this.isPermisoActualizarOriginalTipoFacturaPuntoVenta=false;
		this.isPermisoEliminarTipoFacturaPuntoVenta=false;
		this.isPermisoGuardarCambiosTipoFacturaPuntoVenta=false;
		this.isPermisoConsultaTipoFacturaPuntoVenta=false;
		this.isPermisoBusquedaTipoFacturaPuntoVenta=false;
		this.isPermisoReporteTipoFacturaPuntoVenta=false;		
		this.isPermisoOrdenTipoFacturaPuntoVenta=false;		
		this.isPermisoPaginacionMedioTipoFacturaPuntoVenta=false;		
		this.isPermisoPaginacionAltoTipoFacturaPuntoVenta=false;
		this.isPermisoPaginacionTodoTipoFacturaPuntoVenta=false;
		this.isPermisoCopiarTipoFacturaPuntoVenta=false;		
		this.isPermisoVerFormTipoFacturaPuntoVenta=false;		
		this.isPermisoDuplicarTipoFacturaPuntoVenta=false;		
		this.isPermisoOrdenTipoFacturaPuntoVenta=false;		
	}
	
	public void setPermisosUsuarioTipoFacturaPuntoVenta(Boolean isPermiso) {
		this.isPermisoTodoTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoNuevoTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoActualizarTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoEliminarTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoConsultaTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoBusquedaTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoReporteTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoOrdenTipoFacturaPuntoVenta=isPermiso;		
		this.isPermisoPaginacionMedioTipoFacturaPuntoVenta=isPermiso;		
		this.isPermisoPaginacionAltoTipoFacturaPuntoVenta=isPermiso;		
		this.isPermisoPaginacionTodoTipoFacturaPuntoVenta=isPermiso;		
		this.isPermisoCopiarTipoFacturaPuntoVenta=isPermiso;		
		this.isPermisoVerFormTipoFacturaPuntoVenta=isPermiso;		
		this.isPermisoDuplicarTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoOrdenTipoFacturaPuntoVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoFacturaPuntoVenta(Boolean isPermiso) {
		//this.isPermisoTodoTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoNuevoTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoActualizarTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoEliminarTipoFacturaPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosTipoFacturaPuntoVenta=isPermiso;
		//this.isPermisoConsultaTipoFacturaPuntoVenta=isPermiso;
		//this.isPermisoBusquedaTipoFacturaPuntoVenta=isPermiso;
		//this.isPermisoReporteTipoFacturaPuntoVenta=isPermiso;
		//this.isPermisoOrdenTipoFacturaPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionMedioTipoFacturaPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionAltoTipoFacturaPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionTodoTipoFacturaPuntoVenta=isPermiso;		
		//this.isPermisoCopiarTipoFacturaPuntoVenta=isPermiso;		
		//this.isPermisoDuplicarTipoFacturaPuntoVenta=isPermiso;
		//this.isPermisoOrdenTipoFacturaPuntoVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoFacturaPuntoVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FacturaPuntoVentaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(NotaCreditoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFacturaPuntoVenta=false;
		this.isTienePermisosFacturaPuntoVenta=this.verificarGetPermisosUsuarioOpcionTipoFacturaPuntoVentaClaseRelacionada(this.opcionsRelacionadas,FacturaPuntoVentaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosNotaCreditoPuntoVenta=false;
		this.isTienePermisosNotaCreditoPuntoVenta=this.verificarGetPermisosUsuarioOpcionTipoFacturaPuntoVentaClaseRelacionada(this.opcionsRelacionadas,NotaCreditoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoFacturaPuntoVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoFacturaPuntoVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFacturaPuntoVenta=conPermiso;
		this.isTienePermisosNotaCreditoPuntoVenta=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoFacturaPuntoVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoFacturaPuntoVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoFacturaPuntoVentaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFacturaPuntoVenta && this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTabbedPaneRelacionesTipoFacturaPuntoVenta.remove(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosNotaCreditoPuntoVenta && this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTabbedPaneRelacionesTipoFacturaPuntoVenta.remove(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoFacturaPuntoVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoFacturaPuntoVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoFacturaPuntoVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoFacturaPuntoVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoFacturaPuntoVenta=this.isPermisoActualizarTipoFacturaPuntoVenta;
			this.isPermisoEliminarTipoFacturaPuntoVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoFacturaPuntoVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoFacturaPuntoVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoFacturaPuntoVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoFacturaPuntoVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoFacturaPuntoVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFacturaPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoFacturaPuntoVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoFacturaPuntoVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoFacturaPuntoVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoFacturaPuntoVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoFacturaPuntoVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoFacturaPuntoVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFacturaPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoFacturaPuntoVenta.setToolTipText(this.jTableDatosTipoFacturaPuntoVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoFacturaPuntoVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoFacturaPuntoVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoFacturaPuntoVenta() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFacturaPuntoVenta && this.tipofacturapuntoventaConstantesFunciones.mostrarFacturaPuntoVentaTipoFacturaPuntoVenta && !TipoFacturaPuntoVentaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Factura Punto Venta");
			reporte.setsDescripcion("Factura Punto Venta");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosNotaCreditoPuntoVenta && this.tipofacturapuntoventaConstantesFunciones.mostrarNotaCreditoPuntoVentaTipoFacturaPuntoVenta && !TipoFacturaPuntoVentaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Nota Credito");
			reporte.setsDescripcion("Nota Credito");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyTipoFacturaPuntoVentaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoFacturaPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoFacturaPuntoVentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoFacturaPuntoVentaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoFacturaPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoFacturaPuntoVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoFacturaPuntoVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoFacturaPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoFacturaPuntoVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFacturaPuntoVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoFacturaPuntoVenta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFacturaPuntoVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoFacturaPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoFacturaPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoFacturaPuntoVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoFacturaPuntoVenta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoFacturaPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoFacturaPuntoVenta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoFacturaPuntoVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoFacturaPuntoVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoFacturaPuntoVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipofacturapuntoventaSessionBean=new TipoFacturaPuntoVentaSessionBean(); 
		this.tipofacturapuntoventaConstantesFunciones=new TipoFacturaPuntoVentaConstantesFunciones(); 
		this.tipofacturapuntoventaBean=new TipoFacturaPuntoVenta();//(this.tipofacturapuntoventaConstantesFunciones); 		
		this.tipofacturapuntoventaReturnGeneral=new TipoFacturaPuntoVentaParameterReturnGeneral(); 
		
		this.tipofacturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofacturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoFacturaPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoFacturaPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoFacturaPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoFacturaPuntoVenta(true);
			
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
			
			this.tipofacturapuntoventaConstantesFunciones=new TipoFacturaPuntoVentaConstantesFunciones(); 
			this.tipofacturapuntoventaBean=new TipoFacturaPuntoVenta();//this.tipofacturapuntoventaConstantesFunciones); 			
			this.tipofacturapuntoventaReturnGeneral=new TipoFacturaPuntoVentaParameterReturnGeneral(); 
		
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Factura Punto Venta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipofacturapuntoventa=new TipoFacturaPuntoVenta();
			this.tipofacturapuntoventas = new ArrayList<TipoFacturaPuntoVenta>();
			this.tipofacturapuntoventasAux = new ArrayList<TipoFacturaPuntoVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic=new TipoFacturaPuntoVentaLogic();
				this.tipofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipofacturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipofacturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoFacturaPuntoVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta);	
					}
					
					if(this.jInternalFrameImportacionTipoFacturaPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFacturaPuntoVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoFacturaPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoFacturaPuntoVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta);
				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setVisible(false);
				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta);
					this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoFacturaPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoFacturaPuntoVenta);
					this.jInternalFrameImportacionTipoFacturaPuntoVenta.setVisible(false);
					this.jInternalFrameImportacionTipoFacturaPuntoVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoFacturaPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoFacturaPuntoVenta);
					this.jInternalFrameOrderByTipoFacturaPuntoVenta.setVisible(false);
					this.jInternalFrameOrderByTipoFacturaPuntoVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoFacturaPuntoVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoFacturaPuntoVentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipofacturapuntoventaReturnGeneral=new TipoFacturaPuntoVentaParameterReturnGeneral();
			
			this.tipofacturapuntoventaParameterGeneral=new TipoFacturaPuntoVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipofacturapuntoventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FacturaPuntoVentaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(NotaCreditoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFacturaPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado(),this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFacturaPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado(),this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaCopiarTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaVerFormTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaOrdenTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoFacturaPuntoVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoFacturaPuntoVenta(false);
			
			this.setPermisosUsuarioTipoFacturaPuntoVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado() && this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoFacturaPuntoVentaClasesRelacionadas();
			}
			
			if(this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoFacturaPuntoVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoFacturaPuntoVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoFacturaPuntoVenta();
			}
			
			if(!this.isPermisoBusquedaTipoFacturaPuntoVenta) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoFacturaPuntoVenta,this.isPermisoPaginacionMedioTipoFacturaPuntoVenta,this.isPermisoPaginacionTodoTipoFacturaPuntoVenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoFacturaPuntoVentaConstantesFunciones.getTiposSeleccionarTipoFacturaPuntoVenta());
				
				this.tiposColumnasSelect=TipoFacturaPuntoVentaConstantesFunciones.getTiposSeleccionarTipoFacturaPuntoVenta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoFacturaPuntoVenta();				
				//this.tiposRelacionesSelect=TipoFacturaPuntoVentaConstantesFunciones.getTiposRelacionesTipoFacturaPuntoVenta(true);
				
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
			//if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoFacturaPuntoVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoFacturaPuntoVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoFacturaPuntoVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFacturaPuntoVenta() ;
			
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
			
			
			this.facturapuntoventaLogic=new FacturaPuntoVentaLogic();
			this.notacreditopuntoventaLogic=new NotaCreditoPuntoVentaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipofacturapuntoventaImplementable= (TipoFacturaPuntoVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFacturaPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipofacturapuntoventaImplementableHome= (TipoFacturaPuntoVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFacturaPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipofacturapuntoventas= new ArrayList<TipoFacturaPuntoVenta>();
			this.tipofacturapuntoventasEliminados= new ArrayList<TipoFacturaPuntoVenta>();
						
			this.isEsNuevoTipoFacturaPuntoVenta=false;
			this.esParaAccionDesdeFormularioTipoFacturaPuntoVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoFacturaPuntoVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoFacturaPuntoVenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoFacturaPuntoVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoFacturaPuntoVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoFacturaPuntoVenta();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoFacturaPuntoVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoFacturaPuntoVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoFacturaPuntoVenta() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoFacturaPuntoVenta")) {
				iIndex=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTabbedPaneRelacionesTipoFacturaPuntoVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTabbedPaneRelacionesTipoFacturaPuntoVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();	
				
				

				if(sTitle.equals("Factura Punto Ventas")) {
					if(!FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoFacturaPuntoVenta();

						this.cargarParteTabPanelRelacionadaFacturaPuntoVenta(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Nota Creditos")) {
					if(!NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoFacturaPuntoVenta();

						this.cargarParteTabPanelRelacionadaNotaCreditoPuntoVenta(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoFacturaPuntoVenta();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFacturaPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(false,true,iIndex);
		this.jButtonFacturaPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFacturaPuntoVenta();

		//this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.updateUI();
		//this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaNotaCreditoPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(false,true,iIndex);
		this.jButtonNotaCreditoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaNotaCreditoPuntoVenta();

		//this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.updateUI();
		//this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FacturaPuntoVenta")) {
				int row=this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
				jButtonFacturaPuntoVentaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("NotaCreditoPuntoVenta")) {
				int row=this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
				jButtonNotaCreditoPuntoVentaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Factura Punto Venta")) {

					if(this.isTienePermisosFacturaPuntoVenta && this.tipofacturapuntoventaConstantesFunciones.mostrarFacturaPuntoVentaTipoFacturaPuntoVenta && !TipoFacturaPuntoVentaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Factura Punto Ventas"+"("+FacturaPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Factura Punto Ventas");

						if(tipofacturapuntoventaConstantesFunciones.resaltarFacturaPuntoVentaTipoFacturaPuntoVenta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipofacturapuntoventaConstantesFunciones.resaltarFacturaPuntoVentaTipoFacturaPuntoVenta);
						}

						jmenuItem.setEnabled(this.tipofacturapuntoventaConstantesFunciones.activarFacturaPuntoVentaTipoFacturaPuntoVenta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FacturaPuntoVenta"));

						

						this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jmenuDetalleTipoFacturaPuntoVenta.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Nota Credito")) {

					if(this.isTienePermisosNotaCreditoPuntoVenta && this.tipofacturapuntoventaConstantesFunciones.mostrarNotaCreditoPuntoVentaTipoFacturaPuntoVenta && !TipoFacturaPuntoVentaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Nota Creditos"+"("+NotaCreditoPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Nota Creditos");

						if(tipofacturapuntoventaConstantesFunciones.resaltarNotaCreditoPuntoVentaTipoFacturaPuntoVenta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipofacturapuntoventaConstantesFunciones.resaltarNotaCreditoPuntoVentaTipoFacturaPuntoVenta);
						}

						jmenuItem.setEnabled(this.tipofacturapuntoventaConstantesFunciones.activarNotaCreditoPuntoVentaTipoFacturaPuntoVenta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"NotaCreditoPuntoVenta"));

						

						this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jmenuDetalleTipoFacturaPuntoVenta.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoFacturaPuntoVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoFacturaPuntoVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoFacturaPuntoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoFacturaPuntoVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoFacturaPuntoVenta();
		
		this.cargarCombosFrameForeignKeyTipoFacturaPuntoVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoFacturaPuntoVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoFacturaPuntoVenta();
		}
	}
	
	
	
	public void jButtonNuevoTipoFacturaPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			
			
			if(jTableDatosTipoFacturaPuntoVenta.getRowCount()>=1) {
				jTableDatosTipoFacturaPuntoVenta.removeRowSelectionInterval(0, jTableDatosTipoFacturaPuntoVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoFacturaPuntoVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoFacturaPuntoVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoFacturaPuntoVenta(true);			
			//this.tipofacturapuntoventa=new TipoFacturaPuntoVenta();
			//this.tipofacturapuntoventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFacturaPuntoVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFacturaPuntoVenta() ;
			
			if(TipoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFacturaPuntoVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipofacturapuntoventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);				
			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			
			if(this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoFacturaPuntoVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoFacturaPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoFacturaPuntoVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoFacturaPuntoVenta.getSelectedRows().length;			
			}
			
			tipofacturapuntoventasSeleccionados=this.getTipoFacturaPuntoVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoFacturaPuntoVenta--;			
				//TipoFacturaPuntoVenta tipofacturapuntoventaAux= new TipoFacturaPuntoVenta();			
				//tipofacturapuntoventaAux.setId(this.iIdNuevoTipoFacturaPuntoVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoFacturaPuntoVenta tipofacturapuntoventaOrigen=new TipoFacturaPuntoVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoFacturaPuntoVenta tipofacturapuntoventaOrigen : tipofacturapuntoventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipofacturapuntoventaOrigen =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofacturapuntoventaOrigen =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoFacturaPuntoVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipofacturapuntoventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoFacturaPuntoVenta(tipofacturapuntoventaOrigen,this.tipofacturapuntoventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().add(this.tipofacturapuntoventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipofacturapuntoventas.add(this.tipofacturapuntoventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
				
				this.jTableDatosTipoFacturaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoTipoFacturaPuntoVenta(), this.getIndiceNuevoTipoFacturaPuntoVenta());
				
				int iLastRow =  this.jTableDatosTipoFacturaPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFacturaPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFacturaPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();									
		
			TipoFacturaPuntoVenta tipofacturapuntoventaOrigen=new TipoFacturaPuntoVenta();
			TipoFacturaPuntoVenta tipofacturapuntoventaDestino=new TipoFacturaPuntoVenta();
				
			tipofacturapuntoventasSeleccionados=this.getTipoFacturaPuntoVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoFacturaPuntoVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipofacturapuntoventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoFacturaPuntoVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofacturapuntoventaOrigen =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipofacturapuntoventaOrigen =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofacturapuntoventaDestino =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipofacturapuntoventaDestino =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipofacturapuntoventaOrigen =tipofacturapuntoventasSeleccionados.get(0);
				tipofacturapuntoventaDestino =tipofacturapuntoventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoFacturaPuntoVenta(tipofacturapuntoventaOrigen,tipofacturapuntoventaDestino,true,false);
				
				tipofacturapuntoventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipofacturapuntoventaDestino,tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofacturapuntoventaDestino,tipofacturapuntoventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
				
				//this.jTableDatosTipoFacturaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoTipoFacturaPuntoVenta(), this.getIndiceNuevoTipoFacturaPuntoVenta());
				
				int iLastRow =  this.jTableDatosTipoFacturaPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFacturaPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFacturaPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoFacturaPuntoVenta.isVisible();
			
			
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.setVisible(!isVisible);
			this.jPanelPaginacionTipoFacturaPuntoVenta.setVisible(!isVisible);
			this.jPanelAccionesTipoFacturaPuntoVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoFacturaPuntoVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoFacturaPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoFacturaPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoFacturaPuntoVenta();
			
			this.abrirFrameOrderByTipoFacturaPuntoVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoFacturaPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoFacturaPuntoVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFacturaPuntoVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.isMaximum()) {
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setSize(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.iWidthFormulario,this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.isMaximum()) {
						this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jContentPaneDetalleTipoFacturaPuntoVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTabbedPaneRelacionesTipoFacturaPuntoVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jContentPaneDetalleTipoFacturaPuntoVenta.getWidth(),TipoFacturaPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTabbedPaneRelacionesTipoFacturaPuntoVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jContentPaneDetalleTipoFacturaPuntoVenta.getWidth(),TipoFacturaPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTabbedPaneRelacionesTipoFacturaPuntoVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jContentPaneDetalleTipoFacturaPuntoVenta.getWidth(),TipoFacturaPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFacturaPuntoVenta();
					}

					if(NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaNotaCreditoPuntoVenta();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setVisible(true);
	        this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoFacturaPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoFacturaPuntoVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFacturaPuntoVenta,false,this);
				} else {
					this.jInternalFrameOrderByTipoFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFacturaPuntoVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoFacturaPuntoVenta);
				this.jInternalFrameOrderByTipoFacturaPuntoVenta.setVisible(false);
				this.jInternalFrameOrderByTipoFacturaPuntoVenta.setSelected(false);
				
				this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFacturaPuntoVenta"));
				
				this.inicializarActualizarBindingTablaOrderByTipoFacturaPuntoVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoFacturaPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoFacturaPuntoVenta==null) {
				
				this.jInternalFrameImportacionTipoFacturaPuntoVenta=new ImportacionJInternalFrame(TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFacturaPuntoVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoFacturaPuntoVenta);
				this.jInternalFrameImportacionTipoFacturaPuntoVenta.setVisible(false);
				this.jInternalFrameImportacionTipoFacturaPuntoVenta.setSelected(false);


				this.jInternalFrameImportacionTipoFacturaPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFacturaPuntoVenta"));
				this.jInternalFrameImportacionTipoFacturaPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFacturaPuntoVenta"));
				this.jInternalFrameImportacionTipoFacturaPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFacturaPuntoVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoFacturaPuntoVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta==null) {
				this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta=new ReporteDinamicoJInternalFrame(TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta);
				this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFacturaPuntoVenta"));
				this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFacturaPuntoVenta"));
				this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFacturaPuntoVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFacturaPuntoVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFacturaPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jContentPaneDetalleTipoFacturaPuntoVenta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaNotaCreditoPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jContentPaneDetalleTipoFacturaPuntoVenta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoFacturaPuntoVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFacturaPuntoVenta);
			
	       	this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setVisible(false);
	        this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.dispose();
			//this.jInternalFrameDetalleFormTipoFacturaPuntoVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoFacturaPuntoVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoFacturaPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoFacturaPuntoVenta.setVisible(true);
	        this.jInternalFrameImportacionTipoFacturaPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoFacturaPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.setVisible(true);
	        this.jInternalFrameOrderByTipoFacturaPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoFacturaPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.setVisible(false);
	        this.jInternalFrameOrderByTipoFacturaPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoFacturaPuntoVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoFacturaPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoFacturaPuntoVenta.setVisible(false);
	        this.jInternalFrameImportacionTipoFacturaPuntoVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoFacturaPuntoVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoFacturaPuntoVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoFacturaPuntoVenta(true);
			//this.isEsNuevoTipoFacturaPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoFacturaPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFacturaPuntoVenta(false) ;
			
			if(tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.getEsGuardarRelacionado() && FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() && NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNotaCreditoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFacturaPuntoVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFacturaPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoFacturaPuntoVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoFacturaPuntoVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoFacturaPuntoVenta(true);
			//this.isEsNuevoTipoFacturaPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipofacturapuntoventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoFacturaPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoFacturaPuntoVenta(false) ;
			
			if(TipoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFacturaPuntoVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFacturaPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoFacturaPuntoVenta(false);
			
			//if(!this.isEsNuevoTipoFacturaPuntoVenta) {								
				int intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(this.tipofacturapuntoventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
				
			}
			
			if(this.permiteMantenimiento(this.tipofacturapuntoventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoFacturaPuntoVenta=true;
					this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
					this.isEsNuevoTipoFacturaPuntoVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoFacturaPuntoVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoFacturaPuntoVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFacturaPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFacturaPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesTipoFacturaPuntoVenta(false);
			
												
				
				if(TipoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoFacturaPuntoVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,tipofacturapuntoventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoFacturaPuntoVenta(this.tipofacturapuntoventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoFacturaPuntoVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipofacturapuntoventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipofacturapuntoventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoFacturaPuntoVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFacturaPuntoVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.tipofacturapuntoventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.tipofacturapuntoventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipofacturapuntoventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoFacturaPuntoVentaModel) this.jTableDatosTipoFacturaPuntoVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoFacturaPuntoVenta=true;
				this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
				this.isEsNuevoTipoFacturaPuntoVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFacturaPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFacturaPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesTipoFacturaPuntoVenta(false);
				
				
				
				if(TipoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoFacturaPuntoVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoFacturaPuntoVenta.getRowCount()>=1) {
				jTableDatosTipoFacturaPuntoVenta.removeRowSelectionInterval(0, jTableDatosTipoFacturaPuntoVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoFacturaPuntoVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFacturaPuntoVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFacturaPuntoVenta(false) ;
			
			this.isEsNuevoTipoFacturaPuntoVenta=false;
			
			if(TipoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoFacturaPuntoVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoFacturaPuntoVenta(false);
				
				//SI ES MANUAL
				if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoFacturaPuntoVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoFacturaPuntoVenta--;			
			//TipoFacturaPuntoVenta tipofacturapuntoventaAux= new TipoFacturaPuntoVenta();			
			//tipofacturapuntoventaAux.setId(this.iIdNuevoTipoFacturaPuntoVenta);
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoFacturaPuntoVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
			
			this.tipofacturapuntoventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().add(this.tipofacturapuntoventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipofacturapuntoventas.add(this.tipofacturapuntoventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
			
			this.jTableDatosTipoFacturaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoTipoFacturaPuntoVenta(), this.getIndiceNuevoTipoFacturaPuntoVenta());
			
			int iLastRow =  this.jTableDatosTipoFacturaPuntoVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoFacturaPuntoVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoFacturaPuntoVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(false);
			
			//SI ES MANUAL
			if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFacturaPuntoVenta();
			}
			
			//this.abrirFrameTreeTipoFacturaPuntoVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Factura Punto VentaS ?", "MANTENIMIENTO DE Tipo Factura Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoFacturaPuntoVenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoFacturaPuntoVenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipofacturapuntoventaReturnGeneral=tipofacturapuntoventaLogic.procesarImportacionTipoFacturaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipofacturapuntoventaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoFacturaPuntoVentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoFacturaPuntoVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoFacturaPuntoVenta.setFileImportacion(this.jInternalFrameImportacionTipoFacturaPuntoVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoFacturaPuntoVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoFacturaPuntoVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoFacturaPuntoVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoFacturaPuntoVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();		

		tipofacturapuntoventasSeleccionados=this.getTipoFacturaPuntoVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoFacturaPuntoVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoFacturaPuntoVentaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoFacturaPuntoVentas("Todos",tipofacturapuntoventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();		
		
		tipofacturapuntoventasSeleccionados=this.getTipoFacturaPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofacturapuntoventa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoFacturaPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoFacturaPuntoVenta tipofacturapuntoventa:tipofacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipofacturapuntoventa.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoFacturaPuntoVenta tipofacturapuntoventa:tipofacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipofacturapuntoventa.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoFacturaPuntoVenta(row);				
			//	iRow++;
			//}				
			
			//for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:tipofacturapuntoventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoFacturaPuntoVenta(tipofacturapuntoventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura Punto Venta",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(false);
			
			//SI ES MANUAL
			if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFacturaPuntoVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(false);
			
			//SI ES MANUAL
			if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFacturaPuntoVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(false);
			
			//SI ES MANUAL
			if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFacturaPuntoVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoFacturaPuntoVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoFacturaPuntoVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoFacturaPuntoVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoFacturaPuntoVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoFacturaPuntoVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoFacturaPuntoVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoFacturaPuntoVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoFacturaPuntoVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoFacturaPuntoVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoFacturaPuntoVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoFacturaPuntoVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoFacturaPuntoVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoFacturaPuntoVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFacturaPuntoVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoFacturaPuntoVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoFacturaPuntoVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta();
		
		this.inicializarActualizarBindingBotonesManualTipoFacturaPuntoVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFacturaPuntoVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFacturaPuntoVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFacturaPuntoVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFacturaPuntoVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoFacturaPuntoVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jCheckBoxPostAccionNuevoTipoFacturaPuntoVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jCheckBoxPostAccionSinCerrarTipoFacturaPuntoVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jCheckBoxPostAccionSinMensajeTipoFacturaPuntoVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoFacturaPuntoVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jCheckBoxPostAccionNuevoTipoFacturaPuntoVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jCheckBoxPostAccionSinCerrarTipoFacturaPuntoVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jCheckBoxPostAccionSinMensajeTipoFacturaPuntoVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoFacturaPuntoVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoFacturaPuntoVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoFacturaPuntoVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFacturaPuntoVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoFacturaPuntoVenta() throws Exception {
		try	{
			if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFacturaPuntoVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFacturaPuntoVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFacturaPuntoVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoFacturaPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta.addItem(reporte);
			}
			
			
			if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFacturaPuntoVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFacturaPuntoVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoFacturaPuntoVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoFacturaPuntoVenta(Boolean esInicializar) throws Exception {				
		if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFacturaPuntoVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoFacturaPuntoVenta() throws Exception {
		this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoFacturaPuntoVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoFacturaPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoFacturaPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoFacturaPuntoVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFacturaPuntoVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoFacturaPuntoVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoFacturaPuntoVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoFacturaPuntoVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipofacturapuntoventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoFacturaPuntoVenta.setModel(new TipoFacturaPuntoVentaModel(this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoFacturaPuntoVenta.setModel(new TipoFacturaPuntoVentaModel(this.tipofacturapuntoventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoFacturaPuntoVenta!=null && this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoFacturaPuntoVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFacturaPuntoVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoFacturaPuntoVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,tipofacturapuntoventaConstantesFunciones.resaltarSeleccionarTipoFacturaPuntoVenta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,tipofacturapuntoventaConstantesFunciones.resaltarSeleccionarTipoFacturaPuntoVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFacturaPuntoVenta,TipoFacturaPuntoVentaConstantesFunciones.LABEL_ID));

		if(this.tipofacturapuntoventaConstantesFunciones.mostraridTipoFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFacturaPuntoVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipofacturapuntoventaConstantesFunciones.resaltaridTipoFacturaPuntoVenta,this.tipofacturapuntoventaConstantesFunciones.activaridTipoFacturaPuntoVenta,this,true,"idTipoFacturaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofacturapuntoventaConstantesFunciones.resaltaridTipoFacturaPuntoVenta,this.tipofacturapuntoventaConstantesFunciones.activaridTipoFacturaPuntoVenta,this,true,"idTipoFacturaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFacturaPuntoVenta,TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipofacturapuntoventaConstantesFunciones.mostrarnombreTipoFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipofacturapuntoventaConstantesFunciones.resaltarnombreTipoFacturaPuntoVenta,this.tipofacturapuntoventaConstantesFunciones.activarnombreTipoFacturaPuntoVenta,this,true,"nombreTipoFacturaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofacturapuntoventaConstantesFunciones.resaltarnombreTipoFacturaPuntoVenta,this.tipofacturapuntoventaConstantesFunciones.activarnombreTipoFacturaPuntoVenta,this,true,"nombreTipoFacturaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFacturaPuntoVenta,TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipofacturapuntoventaConstantesFunciones.mostrardescripcionTipoFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipofacturapuntoventaConstantesFunciones.resaltardescripcionTipoFacturaPuntoVenta,this.tipofacturapuntoventaConstantesFunciones.activardescripcionTipoFacturaPuntoVenta,this,true,"descripcionTipoFacturaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofacturapuntoventaConstantesFunciones.resaltardescripcionTipoFacturaPuntoVenta,this.tipofacturapuntoventaConstantesFunciones.activardescripcionTipoFacturaPuntoVenta,this,true,"descripcionTipoFacturaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFacturaPuntoVenta && this.tipofacturapuntoventaConstantesFunciones.mostrarFacturaPuntoVentaTipoFacturaPuntoVenta && !TipoFacturaPuntoVentaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Factura Punto Ventas");
				tableColumn.setHeaderValue("Factura Punto Ventas");
				tableColumn.setCellRenderer(new FacturaPuntoVentaTableCell(tipofacturapuntoventaConstantesFunciones.resaltarFacturaPuntoVentaTipoFacturaPuntoVenta,this,this.tipofacturapuntoventaConstantesFunciones.activarFacturaPuntoVentaTipoFacturaPuntoVenta));
				tableColumn.setCellEditor(new FacturaPuntoVentaTableCell(tipofacturapuntoventaConstantesFunciones.resaltarFacturaPuntoVentaTipoFacturaPuntoVenta,this,this.tipofacturapuntoventaConstantesFunciones.activarFacturaPuntoVentaTipoFacturaPuntoVenta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoFacturaPuntoVenta.addColumn(tableColumn);
			}

			if(this.isTienePermisosNotaCreditoPuntoVenta && this.tipofacturapuntoventaConstantesFunciones.mostrarNotaCreditoPuntoVentaTipoFacturaPuntoVenta && !TipoFacturaPuntoVentaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Nota Creditos");
				tableColumn.setHeaderValue("Nota Creditos");
				tableColumn.setCellRenderer(new NotaCreditoPuntoVentaTableCell(tipofacturapuntoventaConstantesFunciones.resaltarNotaCreditoPuntoVentaTipoFacturaPuntoVenta,this,this.tipofacturapuntoventaConstantesFunciones.activarNotaCreditoPuntoVentaTipoFacturaPuntoVenta));
				tableColumn.setCellEditor(new NotaCreditoPuntoVentaTableCell(tipofacturapuntoventaConstantesFunciones.resaltarNotaCreditoPuntoVentaTipoFacturaPuntoVenta,this,this.tipofacturapuntoventaConstantesFunciones.activarNotaCreditoPuntoVentaTipoFacturaPuntoVenta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoFacturaPuntoVenta.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFacturaPuntoVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFacturaPuntoVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoFacturaPuntoVenta && this.isPermisoGuardarCambiosTipoFacturaPuntoVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoFacturaPuntoVenta.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoFacturaPuntoVenta.addColumn(tableColumn);
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
			
			this.jTableDatosTipoFacturaPuntoVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFacturaPuntoVenta && this.isPermisoGuardarCambiosTipoFacturaPuntoVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFacturaPuntoVenta && this.isPermisoGuardarCambiosTipoFacturaPuntoVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoFacturaPuntoVenta.moveColumn(this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoFacturaPuntoVenta.moveColumn(this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoFacturaPuntoVenta.moveColumn(this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoFacturaPuntoVenta.moveColumn(this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoFacturaPuntoVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoFacturaPuntoVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoFacturaPuntoVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoFacturaPuntoVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoFacturaPuntoVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoFacturaPuntoVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipofacturapuntoventas.size()-1;
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
		//this.jTableDatosTipoFacturaPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoFacturaPuntoVenta();
			
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
				
				//this.isEsNuevoTipoFacturaPuntoVenta=false;
					
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			
				if(this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFacturaPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipofacturapuntoventa.getsType().equals("DUPLICADO")
				   || this.tipofacturapuntoventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoFacturaPuntoVenta=true;
				
				} else {
					this.isEsNuevoTipoFacturaPuntoVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipofacturapuntoventa.getId()>=0 && !this.tipofacturapuntoventa.getIsNew()) {						
						this.isEsNuevoTipoFacturaPuntoVenta=false;
						
					} else {
						this.isEsNuevoTipoFacturaPuntoVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoFacturaPuntoVenta(esRelaciones);						
				
				this.seleccionarTipoFacturaPuntoVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipofacturapuntoventa.getId()<0) {
					this.isEsNuevoTipoFacturaPuntoVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoFacturaPuntoVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoFacturaPuntoVenta(evt,rowIndex);
				}	
				
				if(this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoFacturaPuntoVenta: " + this.dDif); 
					}
				}								
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoFacturaPuntoVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipofacturapuntoventa)) {
					if(this.tipofacturapuntoventa.getId()>0) {
						this.tipofacturapuntoventa.setIsDeleted(true);
						
						this.tipofacturapuntoventasEliminados.add(this.tipofacturapuntoventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().remove(this.tipofacturapuntoventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipofacturapuntoventas.remove(this.tipofacturapuntoventa);				
					}
					
					
					((TipoFacturaPuntoVentaModel) this.jTableDatosTipoFacturaPuntoVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoFacturaPuntoVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoFacturaPuntoVenta) {
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFacturaPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoFacturaPuntoVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoFacturaPuntoVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFacturaPuntoVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoFacturaPuntoVenta(tipofacturapuntoventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoFacturaPuntoVenta(tipofacturapuntoventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoFacturaPuntoVenta(tipofacturapuntoventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoFacturaPuntoVenta(tipofacturapuntoventa);
	}
	
	public void setVariablesObjetoActualToFormularioTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextFieldidTipoFacturaPuntoVenta.setText(tipofacturapuntoventa.getId().toString());
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreanombreTipoFacturaPuntoVenta.setText(tipofacturapuntoventa.getnombre());
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreadescripcionTipoFacturaPuntoVenta.setText(tipofacturapuntoventa.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoFacturaPuntoVenta tipofacturapuntoventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipofacturapuntoventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoFacturaPuntoVenta tipofacturapuntoventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipofacturapuntoventaLocal=this.tipofacturapuntoventa;
			} else {
				tipofacturapuntoventaLocal=this.tipofacturapuntoventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipofacturapuntoventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoFacturaPuntoVenta(tipofacturapuntoventaLocal,true);
					
					if(tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipofacturapuntoventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipofacturapuntoventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(tipofacturapuntoventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(tipofacturapuntoventa);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(tipofacturapuntoventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextFieldidTipoFacturaPuntoVenta.getText()==null || this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextFieldidTipoFacturaPuntoVenta.getText()=="" || this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextFieldidTipoFacturaPuntoVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextFieldidTipoFacturaPuntoVenta.setText("0");
			}

			if(conColumnasBase) {tipofacturapuntoventa.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextFieldidTipoFacturaPuntoVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFacturaPuntoVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jLabelIdTipoFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipofacturapuntoventa.setnombre(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreanombreTipoFacturaPuntoVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jLabelnombreTipoFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipofacturapuntoventa.setdescripcion(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreadescripcionTipoFacturaPuntoVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jLabeldescripcionTipoFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventaBean,TipoFacturaPuntoVenta tipofacturapuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventaOrigen,TipoFacturaPuntoVenta tipofacturapuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipofacturapuntoventaOrigen.getId()!=null && !tipofacturapuntoventaOrigen.getId().equals(0L))) {tipofacturapuntoventa.setId(tipofacturapuntoventaOrigen.getId());}}
			if(conDefault || (!conDefault && tipofacturapuntoventaOrigen.getnombre()!=null && !tipofacturapuntoventaOrigen.getnombre().equals(""))) {tipofacturapuntoventa.setnombre(tipofacturapuntoventaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipofacturapuntoventaOrigen.getdescripcion()!=null && !tipofacturapuntoventaOrigen.getdescripcion().equals(""))) {tipofacturapuntoventa.setdescripcion(tipofacturapuntoventaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextFieldidTipoFacturaPuntoVenta.setText(tipofacturapuntoventa.getId().toString());
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreanombreTipoFacturaPuntoVenta.setText(tipofacturapuntoventa.getnombre());
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreadescripcionTipoFacturaPuntoVenta.setText(tipofacturapuntoventa.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFacturaPuntoVenta(TipoFacturaPuntoVentaBean tipofacturapuntoventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextFieldidTipoFacturaPuntoVenta.setText(tipofacturapuntoventaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreanombreTipoFacturaPuntoVenta.setText(tipofacturapuntoventaBean.getnombre());
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreadescripcionTipoFacturaPuntoVenta.setText(tipofacturapuntoventaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoFacturaPuntoVenta(TipoFacturaPuntoVentaParameterReturnGeneral tipofacturapuntoventaReturnGeneral,TipoFacturaPuntoVentaBean tipofacturapuntoventaBean,Boolean conDefault) throws Exception { 
		try {
			TipoFacturaPuntoVenta tipofacturapuntoventaLocal=new TipoFacturaPuntoVenta();
			
			tipofacturapuntoventaLocal=tipofacturapuntoventaReturnGeneral.getTipoFacturaPuntoVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipofacturapuntoventaLocal.getId()!=null && !tipofacturapuntoventaLocal.getId().equals(0L))) {tipofacturapuntoventaBean.setId(tipofacturapuntoventaLocal.getId());}}
			if(conDefault || (!conDefault && tipofacturapuntoventaLocal.getnombre()!=null && !tipofacturapuntoventaLocal.getnombre().equals(""))) {tipofacturapuntoventaBean.setnombre(tipofacturapuntoventaLocal.getnombre());}
			if(conDefault || (!conDefault && tipofacturapuntoventaLocal.getdescripcion()!=null && !tipofacturapuntoventaLocal.getdescripcion().equals(""))) {tipofacturapuntoventaBean.setdescripcion(tipofacturapuntoventaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoFacturaPuntoVentaGenerico(Long idTipoFacturaPuntoVentaSeleccionado,JComboBox jComboBoxTipoFacturaPuntoVenta,List<TipoFacturaPuntoVenta> tipofacturapuntoventasLocal)throws Exception {
		try {
			TipoFacturaPuntoVenta  tipofacturapuntoventaTemp=null;

			for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:tipofacturapuntoventasLocal) {
				if(tipofacturapuntoventaAux.getId()!=null && tipofacturapuntoventaAux.getId().equals(idTipoFacturaPuntoVentaSeleccionado)) {
					tipofacturapuntoventaTemp=tipofacturapuntoventaAux;
					break;
				}
			}

			jComboBoxTipoFacturaPuntoVenta.setSelectedItem(tipofacturapuntoventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoFacturaPuntoVentaGenerico(JComboBox jComboBoxTipoFacturaPuntoVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFacturaPuntoVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoFacturaPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFacturaPuntoVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoFacturaPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("FacturaPuntoVenta")) {
			jButtonFacturaPuntoVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("NotaCreditoPuntoVenta")) {
			jButtonNotaCreditoPuntoVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofacturapuntoventa=(TipoFacturaPuntoVenta) tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipofacturapuntoventa =(TipoFacturaPuntoVenta) tipofacturapuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoFacturaPuntoVenta tipofacturapuntoventaRow=new TipoFacturaPuntoVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofacturapuntoventaRow=(TipoFacturaPuntoVenta) tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipofacturapuntoventaRow=(TipoFacturaPuntoVenta) tipofacturapuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFacturaPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoFacturaPuntoVenta tipofacturapuntoventa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofacturapuntoventa = (TipoFacturaPuntoVenta)this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipofacturapuntoventa = (TipoFacturaPuntoVenta)this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipofacturapuntoventa!=null) {
						this.tipofacturapuntoventa = tipofacturapuntoventa;
					} else {
						this.tipofacturapuntoventa = new TipoFacturaPuntoVenta();
					}
				}

				if(this.isTienePermisosFacturaPuntoVenta && this.permiteMantenimiento(this.tipofacturapuntoventa)) {
					FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup=new FacturaPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						facturapuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup;
					} else {
						facturapuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame;
					}

					List<TipoFacturaPuntoVenta> tipofacturapuntoventas=new ArrayList<TipoFacturaPuntoVenta>();
					tipofacturapuntoventas.add(this.tipofacturapuntoventa);
					if(!esRelacionado) {
						//facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setConGuardarRelaciones(false);
						//facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					facturapuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.cargarFacturaPuntoVentaBeanSwingJInternalFrame(tipofacturapuntoventas,this.tipofacturapuntoventa,facturapuntoventaBeanSwingJInternalFrame,/*conInicializar,*/facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.getConGuardarRelaciones(),facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.getEsGuardarRelacionado());
					facturapuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						facturapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaPuntoVenta("no_relacionado");

						facturapuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FacturaPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (FacturaPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						facturapuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoFacturaPuntoVenta=(TitledBorder)this.jScrollPanelDatosTipoFacturaPuntoVenta.getBorder();
						TitledBorder titledBorderFacturaPuntoVenta=(TitledBorder)facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.getBorder();

						titledBorderFacturaPuntoVenta.setTitle(titledBorderTipoFacturaPuntoVenta.getTitle() + " -> Factura Punto Venta");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,facturapuntoventaBeanSwingJInternalFrame);
						}

						facturapuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(facturapuntoventaBeanSwingJInternalFrame);

						facturapuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Factura Punto Venta",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonNotaCreditoPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoFacturaPuntoVenta tipofacturapuntoventa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofacturapuntoventa = (TipoFacturaPuntoVenta)this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipofacturapuntoventa = (TipoFacturaPuntoVenta)this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipofacturapuntoventa!=null) {
						this.tipofacturapuntoventa = tipofacturapuntoventa;
					} else {
						this.tipofacturapuntoventa = new TipoFacturaPuntoVenta();
					}
				}

				if(this.isTienePermisosNotaCreditoPuntoVenta && this.permiteMantenimiento(this.tipofacturapuntoventa)) {
					NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFramePopup=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						notacreditopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFramePopup;
					} else {
						notacreditopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame;
					}

					List<TipoFacturaPuntoVenta> tipofacturapuntoventas=new ArrayList<TipoFacturaPuntoVenta>();
					tipofacturapuntoventas.add(this.tipofacturapuntoventa);
					if(!esRelacionado) {
						//notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setConGuardarRelaciones(false);
						//notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					notacreditopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.cargarNotaCreditoPuntoVentaBeanSwingJInternalFrame(tipofacturapuntoventas,this.tipofacturapuntoventa,notacreditopuntoventaBeanSwingJInternalFrame,/*conInicializar,*/notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.getConGuardarRelaciones(),notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
					notacreditopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoPuntoVenta("no_relacionado");

						notacreditopuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(NotaCreditoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (NotaCreditoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						notacreditopuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoFacturaPuntoVenta=(TitledBorder)this.jScrollPanelDatosTipoFacturaPuntoVenta.getBorder();
						TitledBorder titledBorderNotaCreditoPuntoVenta=(TitledBorder)notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.getBorder();

						titledBorderNotaCreditoPuntoVenta.setTitle(titledBorderTipoFacturaPuntoVenta.getTitle() + " -> Nota Credito");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,notacreditopuntoventaBeanSwingJInternalFrame);
						}

						notacreditopuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(notacreditopuntoventaBeanSwingJInternalFrame);

						notacreditopuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Nota Credito",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoFacturaPuntoVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta && this.isPermisoNuevoTipoFacturaPuntoVenta));			
			this.jButtonDuplicarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarTipoFacturaPuntoVenta && this.isPermisoDuplicarTipoFacturaPuntoVenta));			
			this.jButtonCopiarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarTipoFacturaPuntoVenta && this.isPermisoCopiarTipoFacturaPuntoVenta));
			this.jButtonVerFormTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormTipoFacturaPuntoVenta && this.isPermisoVerFormTipoFacturaPuntoVenta));
			
			this.jButtonAbrirOrderByTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenTipoFacturaPuntoVenta && this.isPermisoOrdenTipoFacturaPuntoVenta));			
			
			this.jButtonNuevoRelacionesTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta && this.isPermisoNuevoTipoFacturaPuntoVenta));			
			this.jButtonNuevoGuardarCambiosTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta && this.isPermisoNuevoTipoFacturaPuntoVenta && this.isPermisoGuardarCambiosTipoFacturaPuntoVenta));
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonModificarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta && this.isPermisoActualizarTipoFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonActualizarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta && this.isPermisoActualizarTipoFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonEliminarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta && this.isPermisoEliminarTipoFacturaPuntoVenta));
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonCancelarTipoFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta);							
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonGuardarCambiosTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta && this.isPermisoGuardarCambiosTipoFacturaPuntoVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta && this.isPermisoGuardarCambiosTipoFacturaPuntoVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta && this.isPermisoNuevoTipoFacturaPuntoVenta));						
			this.jButtonDuplicarToolBarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarTipoFacturaPuntoVenta && this.isPermisoDuplicarTipoFacturaPuntoVenta));						
			this.jButtonCopiarToolBarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarTipoFacturaPuntoVenta && this.isPermisoCopiarTipoFacturaPuntoVenta));			
			this.jButtonVerFormToolBarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormTipoFacturaPuntoVenta && this.isPermisoVerFormTipoFacturaPuntoVenta));			
			this.jButtonAbrirOrderByToolBarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenTipoFacturaPuntoVenta && this.isPermisoOrdenTipoFacturaPuntoVenta));
			this.jButtonNuevoRelacionesToolBarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta && this.isPermisoNuevoTipoFacturaPuntoVenta));			
			this.jButtonNuevoGuardarCambiosToolBarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta && this.isPermisoNuevoTipoFacturaPuntoVenta && this.isPermisoGuardarCambiosTipoFacturaPuntoVenta));			
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonModificarToolBarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta && this.isPermisoActualizarTipoFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonActualizarToolBarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta  && this.isPermisoActualizarTipoFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonEliminarToolBarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta && this.isPermisoEliminarTipoFacturaPuntoVenta));
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonCancelarToolBarTipoFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta);				
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonGuardarCambiosToolBarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta && this.isPermisoGuardarCambiosTipoFacturaPuntoVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta && this.isPermisoGuardarCambiosTipoFacturaPuntoVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta && this.isPermisoNuevoTipoFacturaPuntoVenta));			
			this.jMenuItemDuplicarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarTipoFacturaPuntoVenta && this.isPermisoDuplicarTipoFacturaPuntoVenta));			
			this.jMenuItemCopiarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarTipoFacturaPuntoVenta && this.isPermisoCopiarTipoFacturaPuntoVenta));			
			this.jMenuItemVerFormTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormTipoFacturaPuntoVenta && this.isPermisoVerFormTipoFacturaPuntoVenta));			
			this.jMenuItemAbrirOrderByTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenTipoFacturaPuntoVenta && this.isPermisoOrdenTipoFacturaPuntoVenta));			
			//this.jMenuItemMostrarOcultarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenTipoFacturaPuntoVenta && this.isPermisoOrdenTipoFacturaPuntoVenta));
			this.jMenuItemDetalleAbrirOrderByTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenTipoFacturaPuntoVenta && this.isPermisoOrdenTipoFacturaPuntoVenta));			
			//this.jMenuItemDetalleMostrarOcultarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenTipoFacturaPuntoVenta && this.isPermisoOrdenTipoFacturaPuntoVenta));			
			this.jMenuItemNuevoRelacionesTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta && this.isPermisoNuevoTipoFacturaPuntoVenta));			
			this.jMenuItemNuevoGuardarCambiosTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta && this.isPermisoNuevoTipoFacturaPuntoVenta && this.isPermisoGuardarCambiosTipoFacturaPuntoVenta));									
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemModificarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta && this.isPermisoActualizarTipoFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemActualizarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta && this.isPermisoActualizarTipoFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemEliminarTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta && this.isPermisoEliminarTipoFacturaPuntoVenta));
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemCancelarTipoFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta);				
			}
			
			this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta && this.isPermisoGuardarCambiosTipoFacturaPuntoVenta));						
			this.jMenuItemGuardarCambiosTablaTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta && this.isPermisoGuardarCambiosTipoFacturaPuntoVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=this.jButtonNuevoTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaDuplicarTipoFacturaPuntoVenta=this.jButtonDuplicarTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCopiarTipoFacturaPuntoVenta=this.jButtonCopiarTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaVerFormTipoFacturaPuntoVenta=this.jButtonVerFormTipoFacturaPuntoVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoFacturaPuntoVenta=this.jButtonAbrirOrderByTipoFacturaPuntoVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=this.jButtonNuevoRelacionesTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta=this.jButtonModificarTipoFacturaPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
			this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonActualizarTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonEliminarTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonCancelarTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonGuardarCambiosTipoFacturaPuntoVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=this.jButtonNuevoToolBarTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=this.jButtonNuevoRelacionesToolBarTipoFacturaPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonModificarToolBarTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonActualizarToolBarTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonEliminarToolBarTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonCancelarToolBarTipoFacturaPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=this.jButtonGuardarCambiosToolBarTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=this.jButtonGuardarCambiosTablaToolBarTipoFacturaPuntoVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=this.jMenuItemNuevoTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=this.jMenuItemNuevoRelacionesTipoFacturaPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemModificarTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemActualizarTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemEliminarTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemCancelarTipoFacturaPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=this.jMenuItemGuardarCambiosTablaTipoFacturaPuntoVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoFacturaPuntoVenta(Boolean esInicializar) {
		if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFacturaPuntoVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoFacturaPuntoVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoFacturaPuntoVenta() {
		this.jButtonNuevoTipoFacturaPuntoVenta.setVisible(this.isPermisoNuevoTipoFacturaPuntoVenta);			
		this.jButtonDuplicarTipoFacturaPuntoVenta.setVisible(this.isPermisoDuplicarTipoFacturaPuntoVenta);			
		this.jButtonCopiarTipoFacturaPuntoVenta.setVisible(this.isPermisoCopiarTipoFacturaPuntoVenta);			
		this.jButtonVerFormTipoFacturaPuntoVenta.setVisible(this.isPermisoVerFormTipoFacturaPuntoVenta);			
		
		this.jButtonAbrirOrderByTipoFacturaPuntoVenta.setVisible(this.isPermisoOrdenTipoFacturaPuntoVenta);					
		
		this.jButtonNuevoRelacionesTipoFacturaPuntoVenta.setVisible(this.isPermisoNuevoTipoFacturaPuntoVenta);			
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonModificarTipoFacturaPuntoVenta.setVisible(this.isPermisoActualizarTipoFacturaPuntoVenta);	
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonActualizarTipoFacturaPuntoVenta.setVisible(this.isPermisoActualizarTipoFacturaPuntoVenta);	
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonEliminarTipoFacturaPuntoVenta.setVisible(this.isPermisoEliminarTipoFacturaPuntoVenta);
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonCancelarTipoFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta);						
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonGuardarCambiosTipoFacturaPuntoVenta.setVisible(this.isPermisoGuardarCambiosTipoFacturaPuntoVenta);							
		}
		
		this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta.setVisible(this.isPermisoActualizarTipoFacturaPuntoVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFacturaPuntoVenta() {
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonModificarTipoFacturaPuntoVenta.setVisible(this.isPermisoActualizarTipoFacturaPuntoVenta);	
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonActualizarTipoFacturaPuntoVenta.setVisible(this.isPermisoActualizarTipoFacturaPuntoVenta);	
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonEliminarTipoFacturaPuntoVenta.setVisible(this.isPermisoEliminarTipoFacturaPuntoVenta);
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonCancelarTipoFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta);							
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonGuardarCambiosTipoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta && this.isPermisoGuardarCambiosTipoFacturaPuntoVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoFacturaPuntoVenta() {
		if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoFacturaPuntoVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoFacturaPuntoVenta() {
	}
	
	public void jTableDatosTipoFacturaPuntoVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoFacturaPuntoVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(this.gettipofacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofacturapuntoventa==null) {
						this.tipofacturapuntoventa = new TipoFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(this.tipofacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
				}

				if(this.tipofacturapuntoventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipofacturapuntoventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(this.gettipofacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofacturapuntoventa==null) {
						this.tipofacturapuntoventa = new TipoFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(this.tipofacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
				}

				if(this.tipofacturapuntoventa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipofacturapuntoventa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(this.gettipofacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofacturapuntoventa==null) {
						this.tipofacturapuntoventa = new TipoFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(this.tipofacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);
				}

				if(this.tipofacturapuntoventa.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipofacturapuntoventa.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoFacturaPuntoVenta() {
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
		

		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.dispose();
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta!=null) {
			this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.dispose();
			this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta=null;
		}
		
		if(this.jInternalFrameImportacionTipoFacturaPuntoVenta!=null) {
			this.jInternalFrameImportacionTipoFacturaPuntoVenta.setVisible(false);	    			
			this.jInternalFrameImportacionTipoFacturaPuntoVenta.dispose();
			this.jInternalFrameImportacionTipoFacturaPuntoVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoFacturaPuntoVenta();
			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoFacturaPuntoVenta")) {
				jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoFacturaPuntoVenta")) {
				jButtonDuplicarTipoFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoFacturaPuntoVenta")) {
				jButtonCopiarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoFacturaPuntoVenta")) {
				jButtonVerFormTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoFacturaPuntoVenta")) {
				jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoFacturaPuntoVenta")) {
				jButtonDuplicarTipoFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoFacturaPuntoVenta")) {
				jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoFacturaPuntoVenta")) {
				jButtonDuplicarTipoFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoFacturaPuntoVenta")) {
				jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoFacturaPuntoVenta")) {
				jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoFacturaPuntoVenta")) {
				jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoFacturaPuntoVenta")) {
				jButtonModificarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoFacturaPuntoVenta")) {
				jButtonModificarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoFacturaPuntoVenta")) {
				jButtonModificarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoFacturaPuntoVenta")) {
				jButtonActualizarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoFacturaPuntoVenta")) {
				jButtonActualizarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoFacturaPuntoVenta")) {
				jButtonActualizarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoFacturaPuntoVenta")) {
				jButtonEliminarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoFacturaPuntoVenta")) {
				jButtonEliminarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoFacturaPuntoVenta")) {
				jButtonEliminarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoFacturaPuntoVenta")) {
				jButtonCancelarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoFacturaPuntoVenta")) {
				jButtonCancelarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoFacturaPuntoVenta")) {
				jButtonCancelarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoFacturaPuntoVenta")) {
				jButtonCerrarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoFacturaPuntoVenta")) {
				jButtonCerrarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoFacturaPuntoVenta")) {
				jButtonCerrarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoFacturaPuntoVenta")) {
				jButtonMostrarOcultarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoFacturaPuntoVenta")) {
				jButtonCancelarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoFacturaPuntoVenta")) {
				jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoFacturaPuntoVenta")) {
				jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoFacturaPuntoVenta")) {
				jButtonCopiarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoFacturaPuntoVenta")) {
				jButtonVerFormTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoFacturaPuntoVenta")) {
				jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoFacturaPuntoVenta")) {
				jButtonCopiarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoFacturaPuntoVenta")) {
				jButtonVerFormTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoFacturaPuntoVenta")) {
				jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoFacturaPuntoVenta")) {
				jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoFacturaPuntoVenta")) {
				jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoFacturaPuntoVenta")) {
				jButtonRecargarInformacionTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoFacturaPuntoVenta")) {
				jButtonRecargarInformacionTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoFacturaPuntoVenta")) {
				jButtonRecargarInformacionTipoFacturaPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoFacturaPuntoVenta")) {
				jButtonAnterioresTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoFacturaPuntoVenta")) {
				jButtonAnterioresTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoFacturaPuntoVenta")) {
				jButtonAnterioresTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoFacturaPuntoVenta")) {
				jButtonSiguientesTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoFacturaPuntoVenta")) {
				jButtonSiguientesTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoFacturaPuntoVenta")) {
				jButtonSiguientesTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoFacturaPuntoVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoFacturaPuntoVenta")) {
				jButtonAbrirOrderByTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoFacturaPuntoVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoFacturaPuntoVenta")) {
				jButtonMostrarOcultarTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFacturaPuntoVenta")) {
				jButtonNuevoGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoFacturaPuntoVenta")) {
				jButtonNuevoGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoFacturaPuntoVenta")) {
				jButtonNuevoGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoFacturaPuntoVenta")) {
				jButtonCerrarReporteDinamicoTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoFacturaPuntoVenta")) {
				jButtonGenerarReporteDinamicoTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoFacturaPuntoVenta")) {
				
				jButtonGenerarExcelReporteDinamicoTipoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoFacturaPuntoVenta")) {
				jButtonCerrarImportacionTipoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoFacturaPuntoVenta")) {
				
				jButtonGenerarImportacionTipoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoFacturaPuntoVenta")) {
				
				jButtonAbrirImportacionTipoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoFacturaPuntoVenta")) {
				jComboBoxTiposAccionesTipoFacturaPuntoVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoFacturaPuntoVenta")) {
				jComboBoxTiposRelacionesTipoFacturaPuntoVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoFacturaPuntoVenta")) {
				jComboBoxTiposAccionesTipoFacturaPuntoVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoFacturaPuntoVenta")) {
				
				jComboBoxTiposSeleccionarTipoFacturaPuntoVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoFacturaPuntoVenta")) {
				jTextFieldValorCampoGeneralTipoFacturaPuntoVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoFacturaPuntoVenta")) {
				jButtonAbrirOrderByTipoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoFacturaPuntoVenta")) {
				jButtonAbrirOrderByTipoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoFacturaPuntoVenta")) {
				jButtonCerrarOrderByTipoFacturaPuntoVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFacturaPuntoVentaBusqueda")) {
				this.jButtonidTipoFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFacturaPuntoVentaBusqueda")) {
				this.jButtonnombreTipoFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoFacturaPuntoVentaBusqueda")) {
				this.jButtondescripcionTipoFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoFacturaPuntoVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				


				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoFacturaPuntoVenta tipofacturapuntoventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipofacturapuntoventaLocal=this.tipofacturapuntoventa;
			} else {
				tipofacturapuntoventaLocal=this.tipofacturapuntoventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
							
				
				


				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			
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
			
			


			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
								
						
				


				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFacturaPuntoVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
								
				
				


				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
							
				
				


				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFacturaPuntoVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			
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
			
			


			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
								
				
				


				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoFacturaPuntoVenta")) {
					jCheckBoxSeleccionarTodosTipoFacturaPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoFacturaPuntoVenta")) {
					jCheckBoxSeleccionadosTipoFacturaPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoFacturaPuntoVenta")) {
					
				}
				
				


				
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
												
				
				


				
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
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
			
			


			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFacturaPuntoVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFacturaPuntoVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofacturapuntoventa);
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
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
				
				


				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFacturaPuntoVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofacturapuntoventaAnterior =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoFacturaPuntoVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoFacturaPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoFacturaPuntoVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipofacturapuntoventa =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipofacturapuntoventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoFacturaPuntoVenta")) {
				
				}
				
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoFacturaPuntoVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoFacturaPuntoVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoFacturaPuntoVenta")) {
			
			}
			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoFacturaPuntoVenta();
			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoFacturaPuntoVenta")) {
				jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoFacturaPuntoVenta")) {
				jButtonDuplicarTipoFacturaPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoFacturaPuntoVenta")) {
				jButtonCopiarTipoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoFacturaPuntoVenta")) {
				jButtonVerFormTipoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoFacturaPuntoVenta")) {
				jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoFacturaPuntoVenta")) {
				jButtonModificarTipoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoFacturaPuntoVenta")) {
				jButtonActualizarTipoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoFacturaPuntoVenta")) {
				jButtonEliminarTipoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoFacturaPuntoVenta")) {
				jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoFacturaPuntoVenta")) {
				jButtonCancelarTipoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoFacturaPuntoVenta")) {
				jButtonCerrarTipoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoFacturaPuntoVenta")) {
				jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFacturaPuntoVenta")) {
				jButtonNuevoGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoFacturaPuntoVenta")) {
				jButtonAbrirOrderByTipoFacturaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoFacturaPuntoVenta")) {
				jButtonRecargarInformacionTipoFacturaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoFacturaPuntoVenta")) {
				jButtonAnterioresTipoFacturaPuntoVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoFacturaPuntoVenta")) {
				jButtonSiguientesTipoFacturaPuntoVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFacturaPuntoVentaBusqueda")) {
				this.jButtonidTipoFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFacturaPuntoVentaBusqueda")) {
				this.jButtonnombreTipoFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoFacturaPuntoVentaBusqueda")) {
				this.jButtondescripcionTipoFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoFacturaPuntoVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoFacturaPuntoVenta")) {
				closingInternalFrameTipoFacturaPuntoVenta();
				
			} else if(sTipo.equals("jButtonCancelarTipoFacturaPuntoVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoFacturaPuntoVenta = (JInternalFrameBase)evt.getSource();
	            	
	            TipoFacturaPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(TipoFacturaPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFacturaPuntoVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoFacturaPuntoVentaActionPerformed(null);
			}
			
			TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipofacturapuntoventa,new Object(),this.tipofacturapuntoventaParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoFacturaPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoFacturaPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoFacturaPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipofacturapuntoventa)) {
			if(!esControlTabla) {
				if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(this.tipofacturapuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);			
				}
				
				if(this.tipofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoFacturaPuntoVenta(this.tipofacturapuntoventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipofacturapuntoventaReturnGeneral=tipofacturapuntoventaLogic.procesarEventosTipoFacturaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas(),this.tipofacturapuntoventa,this.tipofacturapuntoventaParameterGeneral,this.isEsNuevoTipoFacturaPuntoVenta,classes);//this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoFacturaPuntoVenta(this.tipofacturapuntoventaReturnGeneral,this.tipofacturapuntoventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoFacturaPuntoVenta(classes,this.tipofacturapuntoventaReturnGeneral,this.tipofacturapuntoventaBean,false);
					}
						
					if(this.tipofacturapuntoventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoFacturaPuntoVenta(this.tipofacturapuntoventaReturnGeneral.getTipoFacturaPuntoVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoFacturaPuntoVenta(this.tipofacturapuntoventaReturnGeneral.getTipoFacturaPuntoVenta());	
					}
						
					if(this.tipofacturapuntoventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoFacturaPuntoVenta(this.tipofacturapuntoventaReturnGeneral.getTipoFacturaPuntoVenta(),classes);//this.tipofacturapuntoventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoFacturaPuntoVenta(this.tipofacturapuntoventa,classes);//this.tipofacturapuntoventaBean);									
				}
			
				if(TipoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoFacturaPuntoVenta(this.tipofacturapuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFacturaPuntoVenta(this.tipofacturapuntoventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipofacturapuntoventaAnterior!=null) {
						this.tipofacturapuntoventa=this.tipofacturapuntoventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipofacturapuntoventaReturnGeneral=tipofacturapuntoventaLogic.procesarEventosTipoFacturaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas(),this.tipofacturapuntoventa,this.tipofacturapuntoventaParameterGeneral,this.isEsNuevoTipoFacturaPuntoVenta,classes);//this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipofacturapuntoventaReturnGeneral.getTipoFacturaPuntoVenta(),tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipofacturapuntoventaReturnGeneral.getTipoFacturaPuntoVenta(),this.tipofacturapuntoventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoFacturaPuntoVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoFacturaPuntoVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoFacturaPuntoVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoFacturaPuntoVenta() throws Exception {
		
		TipoFacturaPuntoVentaModel tipofacturapuntoventaModel=(TipoFacturaPuntoVentaModel)this.jTableDatosTipoFacturaPuntoVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofacturapuntoventaModel.tipofacturapuntoventas=this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipofacturapuntoventaModel.tipofacturapuntoventas=this.tipofacturapuntoventas;
		}
		
		
		((TipoFacturaPuntoVentaModel) this.jTableDatosTipoFacturaPuntoVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoFacturaPuntoVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipofacturapuntoventaAnterior(),this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipofacturapuntoventaAnterior(),this.tipofacturapuntoventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoFacturaPuntoVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaPuntoVenta.class)) {
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.setFacturaPuntoVentas(tipofacturapuntoventa.getFacturaPuntoVentas());
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.setNotaCreditoPuntoVentas(tipofacturapuntoventa.getNotaCreditoPuntoVentas());
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
										
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofacturapuntoventa,new Object(),generalEntityParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfTipoFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoFacturaPuntoVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoFacturaPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofacturapuntoventa,new Object(),generalEntityParameterGeneral,this.tipofacturapuntoventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoFacturaPuntoVenta(TipoFacturaPuntoVentaBean tipofacturapuntoventaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaPuntoVenta.class)) {
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.setFacturaPuntoVentas(tipofacturapuntoventa.getFacturaPuntoVentas());
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.setNotaCreditoPuntoVentas(tipofacturapuntoventa.getNotaCreditoPuntoVentas());
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoFacturaPuntoVenta(ArrayList<Classe> classes,TipoFacturaPuntoVentaReturnGeneral tipofacturapuntoventaReturnGeneral,TipoFacturaPuntoVentaBean tipofacturapuntoventaBean,Boolean conDefault) throws Exception {
		
			this.tipofacturapuntoventaBean.setFacturaPuntoVentas(tipofacturapuntoventaReturnGeneral.getTipoFacturaPuntoVenta().getFacturaPuntoVentas());
			this.tipofacturapuntoventaBean.setNotaCreditoPuntoVentas(tipofacturapuntoventaReturnGeneral.getTipoFacturaPuntoVenta().getNotaCreditoPuntoVentas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaPuntoVenta.class)) {
					tipofacturapuntoventa.setFacturaPuntoVentas(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoPuntoVenta.class)) {
					tipofacturapuntoventa.setNotaCreditoPuntoVentas(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipofacturapuntoventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta = new TipoFacturaPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones(),this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta);
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setVisible(false);
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.tipofacturapuntoventaLogic=this.tipofacturapuntoventaLogic;
		
		this.cargarCombosFrameForeignKeyTipoFacturaPuntoVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFacturaPuntoVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFacturaPuntoVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoFacturaPuntoVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoFacturaPuntoVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFacturaPuntoVenta"));
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonModificarTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarTipoFacturaPuntoVenta"));

		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonModificarToolBarTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFacturaPuntoVenta"));
					
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemModificarTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFacturaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonActualizarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarTipoFacturaPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonActualizarToolBarTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFacturaPuntoVenta"));
						
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemActualizarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFacturaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonEliminarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarTipoFacturaPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonEliminarToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFacturaPuntoVenta"));
								
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemEliminarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFacturaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonCancelarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarTipoFacturaPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonCancelarToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFacturaPuntoVenta"));
					
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemCancelarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFacturaPuntoVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemDetalleCerrarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFacturaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonGuardarCambiosToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFacturaPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonGuardarCambiosToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFacturaPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFacturaPuntoVenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonidTipoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonnombreTipoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtondescripcionTipoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoFacturaPuntoVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTabbedPaneRelacionesTipoFacturaPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFacturaPuntoVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoFacturaPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFacturaPuntoVenta"));
		}
		
		this.jTableDatosTipoFacturaPuntoVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoFacturaPuntoVenta"));
		
		this.jTableDatosTipoFacturaPuntoVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoFacturaPuntoVenta"));
		
		this.jButtonNuevoTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoTipoFacturaPuntoVenta"));
		
		this.jButtonDuplicarTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarTipoFacturaPuntoVenta"));
		
		this.jButtonCopiarTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"CopiarTipoFacturaPuntoVenta"));
		
		this.jButtonVerFormTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"VerFormTipoFacturaPuntoVenta"));
		
		
		this.jButtonNuevoToolBarTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoFacturaPuntoVenta"));
			
		this.jButtonDuplicarToolBarTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoFacturaPuntoVenta"));
			
		this.jMenuItemNuevoTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoFacturaPuntoVenta"));
			
		this.jMenuItemDuplicarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoFacturaPuntoVenta"));		
		
		
		this.jButtonNuevoRelacionesTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoFacturaPuntoVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoFacturaPuntoVenta"));
			
		this.jMenuItemNuevoRelacionesTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoFacturaPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonModificarTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarTipoFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonModificarToolBarTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFacturaPuntoVenta"));
			
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemModificarTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFacturaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonActualizarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarTipoFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonActualizarToolBarTipoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFacturaPuntoVenta"));
				
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemActualizarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFacturaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonEliminarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarTipoFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonEliminarToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFacturaPuntoVenta"));
						
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemEliminarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFacturaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonCancelarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarTipoFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonCancelarToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFacturaPuntoVenta"));
			
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemCancelarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFacturaPuntoVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoFacturaPuntoVenta"));		
		
		
		this.jButtonCerrarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarTipoFacturaPuntoVenta"));
		
		
		this.jButtonCerrarToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoFacturaPuntoVenta"));
			
		this.jMenuItemCerrarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoFacturaPuntoVenta"));
			
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jMenuItemDetalleCerrarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFacturaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonGuardarCambiosTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonGuardarCambiosToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFacturaPuntoVenta"));
		}
		
		this.jButtonCopiarToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoFacturaPuntoVenta"));
			
		this.jButtonVerFormToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoFacturaPuntoVenta"));
		
		this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoFacturaPuntoVenta"));
			
		this.jMenuItemCopiarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoFacturaPuntoVenta"));		
		
		this.jMenuItemVerFormTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoFacturaPuntoVenta"));		
		
		
		this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFacturaPuntoVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoFacturaPuntoVenta"));
			
		this.jMenuItemGuardarCambiosTablaTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFacturaPuntoVenta"));		
		
		
		
		this.jButtonRecargarInformacionTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoFacturaPuntoVenta"));
					
		this.jButtonRecargarInformacionToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoFacturaPuntoVenta"));
		
		this.jMenuItemRecargarInformacionTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoFacturaPuntoVenta"));		
		
		
		
		this.jButtonAnterioresTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresTipoFacturaPuntoVenta"));
		
		
		this.jButtonAnterioresToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoFacturaPuntoVenta"));
		
		this.jMenuItemAnterioresTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoFacturaPuntoVenta"));		
		
		
		this.jButtonSiguientesTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesTipoFacturaPuntoVenta"));
		
		
		this.jButtonSiguientesToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoFacturaPuntoVenta"));
			
		this.jMenuItemSiguientesTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoFacturaPuntoVenta"));
			
		this.jMenuItemAbrirOrderByTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoFacturaPuntoVenta"));
			
		this.jMenuItemMostrarOcultarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoFacturaPuntoVenta"));
			
		this.jMenuItemDetalleAbrirOrderByTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoFacturaPuntoVenta"));
			
		this.jMenuItemDetalleMostarOcultarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoFacturaPuntoVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoFacturaPuntoVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoFacturaPuntoVenta"));
			
		this.jMenuItemNuevoGuardarCambiosTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoFacturaPuntoVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoFacturaPuntoVenta"));

		this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoFacturaPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFacturaPuntoVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoFacturaPuntoVenta"));
			
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoFacturaPuntoVenta"));
					
		this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoFacturaPuntoVenta"));
			
		this.jTextFieldValorCampoGeneralTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoFacturaPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonidTipoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonnombreTipoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtondescripcionTipoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoFacturaPuntoVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFacturaPuntoVenta"));
				this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFacturaPuntoVenta"));
				this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFacturaPuntoVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFacturaPuntoVenta"));				
			//this.jButtonGenerarReporteDinamicoTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFacturaPuntoVenta"));
			//this.jButtonGenerarExcelReporteDinamicoTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFacturaPuntoVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoFacturaPuntoVenta!=null) {
				this.jInternalFrameImportacionTipoFacturaPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFacturaPuntoVenta"));
				this.jInternalFrameImportacionTipoFacturaPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFacturaPuntoVenta"));
				this.jInternalFrameImportacionTipoFacturaPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFacturaPuntoVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoFacturaPuntoVenta"));
			
			this.jButtonAbrirOrderByToolBarTipoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoFacturaPuntoVenta"));			
			
			if(this.jInternalFrameOrderByTipoFacturaPuntoVenta!=null) {
				this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFacturaPuntoVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTabbedPaneRelacionesTipoFacturaPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFacturaPuntoVenta"));
		
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
            		closingInternalFrameTipoFacturaPuntoVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoFacturaPuntoVenta = (JInternalFrameBase)event.getSource();
	            	
	            TipoFacturaPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(TipoFacturaPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFacturaPuntoVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoFacturaPuntoVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoFacturaPuntoVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoFacturaPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoFacturaPuntoVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoFacturaPuntoVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoTipoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesTipoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFacturaPuntoVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoFacturaPuntoVenta";
		inputMap = this.jButtonModificarTipoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoFacturaPuntoVenta";
		inputMap = this.jButtonActualizarTipoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoFacturaPuntoVenta";
		inputMap = this.jButtonEliminarTipoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoFacturaPuntoVenta";
		inputMap = this.jButtonCancelarTipoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoFacturaPuntoVenta";
		inputMap = this.jButtonCerrarTipoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonGuardarCambiosTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoFacturaPuntoVenta";
		inputMap = this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonGuardarCambiosTipoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonGuardarCambiosTipoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoFacturaPuntoVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoFacturaPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoFacturaPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoFacturaPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoFacturaPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonidTipoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtonnombreTipoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jButtondescripcionTipoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoFacturaPuntoVentaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoFacturaPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoFacturaPuntoVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas()) {
					tipofacturapuntoventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:tipofacturapuntoventas) {
					tipofacturapuntoventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoFacturaPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas()) {
						tipofacturapuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:tipofacturapuntoventas) {
						tipofacturapuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:tipofacturapuntoventas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFacturaPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFacturaPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFacturaPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoFacturaPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoFacturaPuntoVenta.getSelectedRows();
			
			TipoFacturaPuntoVenta tipofacturapuntoventaLocal=new TipoFacturaPuntoVenta();
			
			//this.seleccionarTodosTipoFacturaPuntoVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofacturapuntoventaLocal =(TipoFacturaPuntoVenta) this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipofacturapuntoventaLocal =(TipoFacturaPuntoVenta) this.tipofacturapuntoventas.toArray()[this.jTableDatosTipoFacturaPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipofacturapuntoventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas()) {
						tipofacturapuntoventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:tipofacturapuntoventas) {
						tipofacturapuntoventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFacturaPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFacturaPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFacturaPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoFacturaPuntoVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoFacturaPuntoVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoFacturaPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoFacturaPuntoVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas()) {
				
						if(sTipoSeleccionar.equals(TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipofacturapuntoventaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipofacturapuntoventaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:tipofacturapuntoventas) {
					
						if(sTipoSeleccionar.equals(TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipofacturapuntoventaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipofacturapuntoventaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoFacturaPuntoVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoFacturaPuntoVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoFacturaPuntoVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoFacturaPuntoVenta(conSplash);
				
					this.generarReporteTipoFacturaPuntoVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoFacturaPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFacturaPuntoVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFacturaPuntoVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFacturaPuntoVenta();
				
				this.exportarTipoFacturaPuntoVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoFacturaPuntoVentas();
				//this.importarTipoFacturaPuntoVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFacturaPuntoVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoFacturaPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Factura Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoFacturaPuntoVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoFacturaPuntoVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoFacturaPuntoVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Factura Punto Venta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoFacturaPuntoVenta();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoFacturaPuntoVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoFacturaPuntoVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoFacturaPuntoVenta();
			
			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();		
			TipoFacturaPuntoVenta tipofacturapuntoventa=new TipoFacturaPuntoVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta.getSelectedItem();
			
			
			
			
			tipofacturapuntoventasSeleccionados=this.getTipoFacturaPuntoVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipofacturapuntoventasSeleccionados.size()==1) {
				for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:tipofacturapuntoventasSeleccionados) {
					tipofacturapuntoventa=tipofacturapuntoventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Factura Punto Venta")) {
					jButtonFacturaPuntoVentaActionPerformed(null,rowIndex,true,false,tipofacturapuntoventa);
				}
				else if(this.sTipoRelacion.equals("Nota Credito")) {
					jButtonNotaCreditoPuntoVentaActionPerformed(null,rowIndex,true,false,tipofacturapuntoventa);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoFacturaPuntoVenta();
			
      		//this.finishProcessTipoFacturaPuntoVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoFacturaPuntoVentaReturnGeneral() throws Exception {
		if(this.tipofacturapuntoventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipofacturapuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipofacturapuntoventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipofacturapuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipofacturapuntoventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipofacturapuntoventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(false);
		}
		
		if(this.tipofacturapuntoventaReturnGeneral.getConRetornoLista() || this.tipofacturapuntoventaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipofacturapuntoventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipofacturapuntoventaLogic.setTipoFacturaPuntoVentas(this.tipofacturapuntoventaReturnGeneral.getTipoFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipofacturapuntoventaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipofacturapuntoventaLogic.setTipoFacturaPuntoVenta(this.tipofacturapuntoventaReturnGeneral.getTipoFacturaPuntoVenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoFacturaPuntoVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoFacturaPuntoVenta() throws Exception {
		
		
	}
	
	public ArrayList<TipoFacturaPuntoVenta> getTipoFacturaPuntoVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoFacturaPuntoVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas()) {
					if(tipofacturapuntoventaAux.getIsSelected()) {
						tipofacturapuntoventasSeleccionados.add(tipofacturapuntoventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:this.tipofacturapuntoventas) {
					if(tipofacturapuntoventaAux.getIsSelected()) {
						tipofacturapuntoventasSeleccionados.add(tipofacturapuntoventaAux);				
					}
				}
			}
			
			if(tipofacturapuntoventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipofacturapuntoventasSeleccionados.addAll(this.tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipofacturapuntoventasSeleccionados.addAll(this.tipofacturapuntoventas);				
					}
				}
			}
		} else {
			tipofacturapuntoventasSeleccionados.add(this.tipofacturapuntoventa);
		}
		
		return tipofacturapuntoventasSeleccionados;
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
	
	public void generarReporteTipoFacturaPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoFacturaPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoFacturaPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFacturaPuntoVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFacturaPuntoVentasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoFacturaPuntoVentasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Factura Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();		
		
		tipofacturapuntoventasSeleccionados=this.getTipoFacturaPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoFacturaPuntoVentas("Todos",tipofacturapuntoventasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();		
		
		tipofacturapuntoventasSeleccionados=this.getTipoFacturaPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoFacturaPuntoVentas("Todos",tipofacturapuntoventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoFacturaPuntoVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();
		
		tipofacturapuntoventasSeleccionados=this.getTipoFacturaPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoFacturaPuntoVentas("Todos",tipofacturapuntoventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoFacturaPuntoVenta();
		
		
		tipofacturapuntoventasSeleccionados=this.getTipoFacturaPuntoVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoFacturaPuntoVenta();
		
		
		//this.generarReporteTipoFacturaPuntoVentas("Todos",tipofacturapuntoventasSeleccionados ,tipofacturapuntoventaImplementable,tipofacturapuntoventaImplementableHome);
	}
	
	public void mostrarImportacionTipoFacturaPuntoVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoFacturaPuntoVenta();
		
		this.abrirFrameImportacionTipoFacturaPuntoVenta();		
		
			
		//this.generarReporteTipoFacturaPuntoVentas("Todos",tipofacturapuntoventasSeleccionados ,tipofacturapuntoventaImplementable,tipofacturapuntoventaImplementableHome);
	}
	
	public void importarTipoFacturaPuntoVentas() throws Exception {		
	
	}
	
	public void exportarTipoFacturaPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoFacturaPuntoVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoFacturaPuntoVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoFacturaPuntoVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Factura Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();		
		
		tipofacturapuntoventasSeleccionados=this.getTipoFacturaPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofacturapuntoventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoFacturaPuntoVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:tipofacturapuntoventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoFacturaPuntoVenta(tipofacturapuntoventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipofacturapuntoventaAux.setsDetalleGeneralEntityReporte(tipofacturapuntoventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoFacturaPuntoVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoFacturaPuntoVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFacturaPuntoVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipofacturapuntoventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofacturapuntoventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofacturapuntoventa.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofacturapuntoventa.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();		
		
		tipofacturapuntoventasSeleccionados=this.getTipoFacturaPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofacturapuntoventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoFacturaPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoFacturaPuntoVenta(row);				
				iRow++;
			}				
			
			for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:tipofacturapuntoventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoFacturaPuntoVenta(tipofacturapuntoventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();		
		
		tipofacturapuntoventasSeleccionados=this.getTipoFacturaPuntoVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofacturapuntoventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipofacturapuntoventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipofacturapuntoventa");
			//elementRoot.appendChild(element);
		
			for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:tipofacturapuntoventasSeleccionados) {
				element = document.createElement("tipofacturapuntoventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoFacturaPuntoVenta(tipofacturapuntoventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoFacturaPuntoVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFacturaPuntoVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFacturaPuntoVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipofacturapuntoventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipofacturapuntoventa.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipofacturapuntoventa.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoFacturaPuntoVenta(TipoFacturaPuntoVenta tipofacturapuntoventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoFacturaPuntoVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipofacturapuntoventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoFacturaPuntoVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipofacturapuntoventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoFacturaPuntoVentaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipofacturapuntoventa.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoFacturaPuntoVentaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipofacturapuntoventa.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoFacturaPuntoVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados=new ArrayList<TipoFacturaPuntoVenta>();
		
		tipofacturapuntoventasSeleccionados=this.getTipoFacturaPuntoVentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoFacturaPuntoVenta(tipofacturapuntoventasSeleccionados);
		
		this.generarReporteTipoFacturaPuntoVentas("Todos",tipofacturapuntoventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoFacturaPuntoVenta(ArrayList<TipoFacturaPuntoVenta> tipofacturapuntoventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoFacturaPuntoVenta tipofacturapuntoventaAux:tipofacturapuntoventasSeleccionados) {
				tipofacturapuntoventaAux.setsDetalleGeneralEntityReporte(tipofacturapuntoventaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipofacturapuntoventaAux.setsDescripcionGeneralEntityReporte1(tipofacturapuntoventaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipofacturapuntoventaAux.setsDescripcionGeneralEntityReporte1(tipofacturapuntoventaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoFacturaPuntoVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=true;
				this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=true;
			}
			
			this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarTipoFacturaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFacturaPuntoVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=true;
		} else {
			this.actualizarEstadoPanelsTipoFacturaPuntoVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoFacturaPuntoVenta=false;
			//this.isVisibilidadCeldaVerFormTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarTipoFacturaPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=false;												
			}
			
			this.jButtonCerrarTipoFacturaPuntoVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFacturaPuntoVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.tipofacturapuntoventa)) {
			this.isVisibilidadCeldaActualizarTipoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarTipoFacturaPuntoVenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFacturaPuntoVenta() {
		this.isVisibilidadCeldaNuevoTipoFacturaPuntoVenta=false;
		this.isVisibilidadCeldaGuardarCambiosTipoFacturaPuntoVenta=false;
	}
	
	public void actualizarEstadoPanelsTipoFacturaPuntoVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosTipoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionTipoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesTipoFacturaPuntoVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosTipoFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionTipoFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesTipoFacturaPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosTipoFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionTipoFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesTipoFacturaPuntoVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosTipoFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionTipoFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesTipoFacturaPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosTipoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionTipoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesTipoFacturaPuntoVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosTipoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionTipoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesTipoFacturaPuntoVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosTipoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionTipoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesTipoFacturaPuntoVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoFacturaPuntoVentaParaFacturaPuntoVentas() throws Exception {
		Boolean isPaginaPopupFacturaPuntoVenta=false;

		try {

			if(this.tipofacturapuntoventaSessionBean==null) {
				this.tipofacturapuntoventaSessionBean=new TipoFacturaPuntoVentaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaSessionBean=new FacturaPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaSessionBean.setsPathNavegacionActual(tipofacturapuntoventaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFacturaPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFacturaPuntoVenta(true);
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaPuntoVenta(TipoFacturaPuntoVentaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoFacturaPuntoVenta(true);
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.facturapuntoventaSessionBean.setlidTipoFacturaPuntoVentaActual(this.idTipoFacturaPuntoVentaActual);

			tipofacturapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoFacturaPuntoVenta(true);
			tipofacturapuntoventaSessionBean.setlIdTipoFacturaPuntoVentaActualForeignKey(this.idTipoFacturaPuntoVentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoFacturaPuntoVentaParaNotaCreditoPuntoVentas() throws Exception {
		Boolean isPaginaPopupNotaCreditoPuntoVenta=false;

		try {

			if(this.tipofacturapuntoventaSessionBean==null) {
				this.tipofacturapuntoventaSessionBean=new TipoFacturaPuntoVentaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaSessionBean.setsPathNavegacionActual(tipofacturapuntoventaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupNotaCreditoPuntoVenta=this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta(true);
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta(TipoFacturaPuntoVentaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoFacturaPuntoVenta(true);
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.notacreditopuntoventaSessionBean.setlidTipoFacturaPuntoVentaActual(this.idTipoFacturaPuntoVentaActual);

			tipofacturapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoFacturaPuntoVenta(true);
			tipofacturapuntoventaSessionBean.setlIdTipoFacturaPuntoVentaActualForeignKey(this.idTipoFacturaPuntoVentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoFacturaPuntoVentaSessionBean tipofacturapuntoventaSessionBean=new TipoFacturaPuntoVentaSessionBean();
		
		if(this.tipofacturapuntoventaSessionBean==null) {
			this.tipofacturapuntoventaSessionBean=new TipoFacturaPuntoVentaSessionBean();
		}
		
		this.tipofacturapuntoventaSessionBean.setsUltimaBusquedaTipoFacturaPuntoVenta(this.getsAccionBusqueda());
		this.tipofacturapuntoventaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipofacturapuntoventaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoFacturaPuntoVentaSessionBean tipofacturapuntoventaSessionBean=new TipoFacturaPuntoVentaSessionBean();
		
		if(this.tipofacturapuntoventaSessionBean==null) {
			this.tipofacturapuntoventaSessionBean=new TipoFacturaPuntoVentaSessionBean();
		}
		
		if(this.tipofacturapuntoventaSessionBean.getsUltimaBusquedaTipoFacturaPuntoVenta()!=null&&!this.tipofacturapuntoventaSessionBean.getsUltimaBusquedaTipoFacturaPuntoVenta().equals("")) {
			this.setsAccionBusqueda(tipofacturapuntoventaSessionBean.getsUltimaBusquedaTipoFacturaPuntoVenta());
			this.setiNumeroPaginacion(tipofacturapuntoventaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipofacturapuntoventaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipofacturapuntoventaSessionBean.setsUltimaBusquedaTipoFacturaPuntoVenta("");
		this.tipofacturapuntoventaSessionBean.setiNumeroPaginacion(TipoFacturaPuntoVentaConstantesFunciones.INUMEROPAGINACION);
		this.tipofacturapuntoventaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoFacturaPuntoVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoFacturaPuntoVenta() {
		this.updateBorderResaltarBusquedasFormularioTipoFacturaPuntoVenta();
		this.updateVisibilidadBusquedasFormularioTipoFacturaPuntoVenta();
		this.updateHabilitarBusquedasFormularioTipoFacturaPuntoVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoFacturaPuntoVenta() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoFacturaPuntoVenta() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoFacturaPuntoVenta() {
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
	
	public void updateControlesFormularioTipoFacturaPuntoVenta() throws Exception {

		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoFacturaPuntoVenta();
		this.updateVisibilidadResaltarControlesFormularioTipoFacturaPuntoVenta();
		this.updateHabilitarResaltarControlesFormularioTipoFacturaPuntoVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoFacturaPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipofacturapuntoventaConstantesFunciones.resaltaridTipoFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextFieldidTipoFacturaPuntoVenta.setBorder(this.tipofacturapuntoventaConstantesFunciones.resaltaridTipoFacturaPuntoVenta);}
		if(this.tipofacturapuntoventaConstantesFunciones.resaltarnombreTipoFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreanombreTipoFacturaPuntoVenta.setBorder(this.tipofacturapuntoventaConstantesFunciones.resaltarnombreTipoFacturaPuntoVenta);}
		if(this.tipofacturapuntoventaConstantesFunciones.resaltardescripcionTipoFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreadescripcionTipoFacturaPuntoVenta.setBorder(this.tipofacturapuntoventaConstantesFunciones.resaltardescripcionTipoFacturaPuntoVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoFacturaPuntoVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
	
		//this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextFieldidTipoFacturaPuntoVenta.setVisible(this.tipofacturapuntoventaConstantesFunciones.mostraridTipoFacturaPuntoVenta);
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jPanelidTipoFacturaPuntoVenta.setVisible(this.tipofacturapuntoventaConstantesFunciones.mostraridTipoFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreanombreTipoFacturaPuntoVenta.setVisible(this.tipofacturapuntoventaConstantesFunciones.mostrarnombreTipoFacturaPuntoVenta);
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jPanelnombreTipoFacturaPuntoVenta.setVisible(this.tipofacturapuntoventaConstantesFunciones.mostrarnombreTipoFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreadescripcionTipoFacturaPuntoVenta.setVisible(this.tipofacturapuntoventaConstantesFunciones.mostrardescripcionTipoFacturaPuntoVenta);
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jPaneldescripcionTipoFacturaPuntoVenta.setVisible(this.tipofacturapuntoventaConstantesFunciones.mostrardescripcionTipoFacturaPuntoVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoFacturaPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFacturaPuntoVenta!=null) {
	
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextFieldidTipoFacturaPuntoVenta.setEnabled(this.tipofacturapuntoventaConstantesFunciones.activaridTipoFacturaPuntoVenta);
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreanombreTipoFacturaPuntoVenta.setEnabled(this.tipofacturapuntoventaConstantesFunciones.activarnombreTipoFacturaPuntoVenta);
		this.jInternalFrameDetalleFormTipoFacturaPuntoVenta.jTextAreadescripcionTipoFacturaPuntoVenta.setEnabled(this.tipofacturapuntoventaConstantesFunciones.activardescripcionTipoFacturaPuntoVenta);
		}
	}
	
		
}