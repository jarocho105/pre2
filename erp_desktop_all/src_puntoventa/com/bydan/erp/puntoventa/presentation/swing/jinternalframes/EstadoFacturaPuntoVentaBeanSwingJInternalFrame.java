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

import com.bydan.erp.puntoventa.util.EstadoFacturaPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.EstadoFacturaPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.EstadoFacturaPuntoVentaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.EstadoFacturaPuntoVentaBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoFacturaPuntoVentaBeanSwingJInternalFrame extends EstadoFacturaPuntoVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoFacturaPuntoVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoFacturaPuntoVenta> estadofacturapuntoventaValidator = new ClassValidator<EstadoFacturaPuntoVenta>(EstadoFacturaPuntoVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoFacturaPuntoVenta estadofacturapuntoventa;	
	public EstadoFacturaPuntoVenta estadofacturapuntoventaAux;
	public EstadoFacturaPuntoVenta estadofacturapuntoventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoFacturaPuntoVenta estadofacturapuntoventaTotales;
	public Long idEstadoFacturaPuntoVentaActual;
	public Long iIdNuevoEstadoFacturaPuntoVenta=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosFacturaPuntoVenta=false;

	public Boolean getIsTienePermisosFacturaPuntoVenta() {
		return isTienePermisosFacturaPuntoVenta;
	}

	public void setIsTienePermisosFacturaPuntoVenta(Boolean isTienePermisosFacturaPuntoVenta) {
		this.isTienePermisosFacturaPuntoVenta= isTienePermisosFacturaPuntoVenta;
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
	
	public Boolean isPermisoTodoEstadoFacturaPuntoVenta;
	public Boolean isPermisoNuevoEstadoFacturaPuntoVenta;
	public Boolean isPermisoActualizarEstadoFacturaPuntoVenta;
	public Boolean isPermisoActualizarOriginalEstadoFacturaPuntoVenta;
	public Boolean isPermisoEliminarEstadoFacturaPuntoVenta;
	public Boolean isPermisoGuardarCambiosEstadoFacturaPuntoVenta;
	public Boolean isPermisoConsultaEstadoFacturaPuntoVenta;
	public Boolean isPermisoBusquedaEstadoFacturaPuntoVenta;
	public Boolean isPermisoReporteEstadoFacturaPuntoVenta;
	public Boolean isPermisoPaginacionMedioEstadoFacturaPuntoVenta;
	public Boolean isPermisoPaginacionAltoEstadoFacturaPuntoVenta;
	public Boolean isPermisoPaginacionTodoEstadoFacturaPuntoVenta;
	public Boolean isPermisoCopiarEstadoFacturaPuntoVenta;
	public Boolean isPermisoVerFormEstadoFacturaPuntoVenta;
	public Boolean isPermisoDuplicarEstadoFacturaPuntoVenta;
	public Boolean isPermisoOrdenEstadoFacturaPuntoVenta;
	
	
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
	
	public EstadoFacturaPuntoVentaParameterReturnGeneral estadofacturapuntoventaReturnGeneral;
	public EstadoFacturaPuntoVentaParameterReturnGeneral estadofacturapuntoventaParameterGeneral;
	
	

	public FacturaPuntoVentaLogic facturapuntoventaLogic=null;

	public FacturaPuntoVentaLogic getFacturaPuntoVentaLogic() {
		return facturapuntoventaLogic;
	}

	public void setFacturaPuntoVentaLogic(FacturaPuntoVentaLogic facturapuntoventaLogic) {
		this.facturapuntoventaLogic = facturapuntoventaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoFacturaPuntoVenta=false;
	public Boolean esParaAccionDesdeFormularioEstadoFacturaPuntoVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoFacturaPuntoVentaLogic estadofacturapuntoventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoFacturaPuntoVenta estadofacturapuntoventaBean;
	public EstadoFacturaPuntoVentaConstantesFunciones estadofacturapuntoventaConstantesFunciones;
	//public EstadoFacturaPuntoVentaParameterReturnGeneral estadofacturapuntoventaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoFacturaPuntoVenta> estadofacturapuntoventas;	
	//public List<EstadoFacturaPuntoVenta> estadofacturapuntoventasEliminados;
	//public List<EstadoFacturaPuntoVenta> estadofacturapuntoventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoFacturaPuntoVenta=true;
	public Boolean isVisibilidadCeldaCopiarEstadoFacturaPuntoVenta=true;
	public Boolean isVisibilidadCeldaVerFormEstadoFacturaPuntoVenta=true;
	public Boolean isVisibilidadCeldaOrdenEstadoFacturaPuntoVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaModificarEstadoFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=false;	
	
	
	
	public Long getiIdNuevoEstadoFacturaPuntoVenta() {
		return this.iIdNuevoEstadoFacturaPuntoVenta;
	}

	public void setiIdNuevoEstadoFacturaPuntoVenta(Long iIdNuevoEstadoFacturaPuntoVenta) {
		this.iIdNuevoEstadoFacturaPuntoVenta = iIdNuevoEstadoFacturaPuntoVenta;
	}
	
	public Long getidEstadoFacturaPuntoVentaActual() {
		return this.idEstadoFacturaPuntoVentaActual;
	}

	public void setidEstadoFacturaPuntoVentaActual(Long idEstadoFacturaPuntoVentaActual) {
		this.idEstadoFacturaPuntoVentaActual = idEstadoFacturaPuntoVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoFacturaPuntoVenta getestadofacturapuntoventa() {
		return this.estadofacturapuntoventa;
	}

	public void setestadofacturapuntoventa(EstadoFacturaPuntoVenta estadofacturapuntoventa) {
		this.estadofacturapuntoventa = estadofacturapuntoventa;
	}
	
	public EstadoFacturaPuntoVenta getestadofacturapuntoventaAux() {
		return this.estadofacturapuntoventaAux;
	}

	public void setestadofacturapuntoventaAux(EstadoFacturaPuntoVenta estadofacturapuntoventaAux) {
		this.estadofacturapuntoventaAux = estadofacturapuntoventaAux;
	}				
	
	public EstadoFacturaPuntoVenta getestadofacturapuntoventaAnterior() {
		return this.estadofacturapuntoventaAnterior;
	}

	public void setestadofacturapuntoventaAnterior(EstadoFacturaPuntoVenta estadofacturapuntoventaAnterior) {
		this.estadofacturapuntoventaAnterior = estadofacturapuntoventaAnterior;
	}	
	
	public EstadoFacturaPuntoVenta getestadofacturapuntoventaTotales() {
		return this.estadofacturapuntoventaTotales;
	}

	public void setestadofacturapuntoventaTotales(EstadoFacturaPuntoVenta estadofacturapuntoventaTotales) {
		this.estadofacturapuntoventaTotales = estadofacturapuntoventaTotales;
	}	
	
	public EstadoFacturaPuntoVenta getestadofacturapuntoventaBean() {
		return this.estadofacturapuntoventaBean;
	}

	public void setestadofacturapuntoventaBean(EstadoFacturaPuntoVenta estadofacturapuntoventaBean) {
		this.estadofacturapuntoventaBean = estadofacturapuntoventaBean;
	}	
	
	public EstadoFacturaPuntoVentaParameterReturnGeneral getestadofacturapuntoventaReturnGeneral() {
		return this.estadofacturapuntoventaReturnGeneral;
	}

	public void setestadofacturapuntoventaReturnGeneral(EstadoFacturaPuntoVentaParameterReturnGeneral estadofacturapuntoventaReturnGeneral) {
		this.estadofacturapuntoventaReturnGeneral = estadofacturapuntoventaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoFacturaPuntoVentaLogic getEstadoFacturaPuntoVentaLogic()	{		
		return estadofacturapuntoventaLogic;
	}

	public void setEstadoFacturaPuntoVentaLogic(EstadoFacturaPuntoVentaLogic estadofacturapuntoventaLogic) {
		this.estadofacturapuntoventaLogic = estadofacturapuntoventaLogic;
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
	
	public Boolean getIsEsNuevoEstadoFacturaPuntoVenta() {
		return isEsNuevoEstadoFacturaPuntoVenta;
	}

	public void setIsEsNuevoEstadoFacturaPuntoVenta(Boolean isEsNuevoEstadoFacturaPuntoVenta) {
		this.isEsNuevoEstadoFacturaPuntoVenta = isEsNuevoEstadoFacturaPuntoVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoFacturaPuntoVenta() {
		return esParaAccionDesdeFormularioEstadoFacturaPuntoVenta;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoFacturaPuntoVenta(Boolean esParaAccionDesdeFormularioEstadoFacturaPuntoVenta) {
		this.esParaAccionDesdeFormularioEstadoFacturaPuntoVenta = esParaAccionDesdeFormularioEstadoFacturaPuntoVenta;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoFacturaPuntoVenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoFacturaPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoFacturaPuntoVenta(this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoFacturaPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoFacturaPuntoVenta(this.estadofacturapuntoventas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadofacturapuntoventaLogic.setEstadoFacturaPuntoVentas(this.estadofacturapuntoventas);
			estadofacturapuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoFacturaPuntoVentaParameterReturnGeneral getEstadoFacturaPuntoVentaParameterGeneral() {
		return this.estadofacturapuntoventaParameterGeneral;
	}
	
	public void setEstadoFacturaPuntoVentaParameterGeneral(EstadoFacturaPuntoVentaParameterReturnGeneral estadofacturapuntoventaParameterGeneral) {
		this.estadofacturapuntoventaParameterGeneral = estadofacturapuntoventaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoFacturaPuntoVenta() {
		return isPermisoTodoEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoTodoEstadoFacturaPuntoVenta(Boolean isPermisoTodoEstadoFacturaPuntoVenta) {
		this.isPermisoTodoEstadoFacturaPuntoVenta = isPermisoTodoEstadoFacturaPuntoVenta;
	}

	public Boolean getIsPermisoNuevoEstadoFacturaPuntoVenta() {
		return isPermisoNuevoEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoNuevoEstadoFacturaPuntoVenta(Boolean isPermisoNuevoEstadoFacturaPuntoVenta) {
		this.isPermisoNuevoEstadoFacturaPuntoVenta = isPermisoNuevoEstadoFacturaPuntoVenta;
	}

	public Boolean getIsPermisoActualizarEstadoFacturaPuntoVenta() {
		return isPermisoActualizarEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoActualizarEstadoFacturaPuntoVenta(Boolean isPermisoActualizarEstadoFacturaPuntoVenta) {
		this.isPermisoActualizarEstadoFacturaPuntoVenta = isPermisoActualizarEstadoFacturaPuntoVenta;
	}

	public Boolean getIsPermisoEliminarEstadoFacturaPuntoVenta() {
		return isPermisoEliminarEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoEliminarEstadoFacturaPuntoVenta(Boolean isPermisoEliminarEstadoFacturaPuntoVenta) {
		this.isPermisoEliminarEstadoFacturaPuntoVenta = isPermisoEliminarEstadoFacturaPuntoVenta;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoFacturaPuntoVenta() {
		return isPermisoGuardarCambiosEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoGuardarCambiosEstadoFacturaPuntoVenta(Boolean isPermisoGuardarCambiosEstadoFacturaPuntoVenta) {
		this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta = isPermisoGuardarCambiosEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoConsultaEstadoFacturaPuntoVenta() {
		return isPermisoConsultaEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoConsultaEstadoFacturaPuntoVenta(Boolean isPermisoConsultaEstadoFacturaPuntoVenta) {
		this.isPermisoConsultaEstadoFacturaPuntoVenta = isPermisoConsultaEstadoFacturaPuntoVenta;
	}

	public Boolean getIsPermisoBusquedaEstadoFacturaPuntoVenta() {
		return isPermisoBusquedaEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoBusquedaEstadoFacturaPuntoVenta(Boolean isPermisoBusquedaEstadoFacturaPuntoVenta) {
		this.isPermisoBusquedaEstadoFacturaPuntoVenta = isPermisoBusquedaEstadoFacturaPuntoVenta;
	}

	public Boolean getIsPermisoReporteEstadoFacturaPuntoVenta() {
		return isPermisoReporteEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoReporteEstadoFacturaPuntoVenta(Boolean isPermisoReporteEstadoFacturaPuntoVenta) {
		this.isPermisoReporteEstadoFacturaPuntoVenta = isPermisoReporteEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoFacturaPuntoVenta() {
		return isPermisoPaginacionMedioEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoPaginacionMedioEstadoFacturaPuntoVenta(Boolean isPermisoPaginacionMedioEstadoFacturaPuntoVenta) {
		this.isPermisoPaginacionMedioEstadoFacturaPuntoVenta = isPermisoPaginacionMedioEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoFacturaPuntoVenta() {
		return isPermisoPaginacionTodoEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoPaginacionTodoEstadoFacturaPuntoVenta(Boolean isPermisoPaginacionTodoEstadoFacturaPuntoVenta) {
		this.isPermisoPaginacionTodoEstadoFacturaPuntoVenta = isPermisoPaginacionTodoEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoFacturaPuntoVenta() {
		return isPermisoPaginacionAltoEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoPaginacionAltoEstadoFacturaPuntoVenta(Boolean isPermisoPaginacionAltoEstadoFacturaPuntoVenta) {
		this.isPermisoPaginacionAltoEstadoFacturaPuntoVenta = isPermisoPaginacionAltoEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoCopiarEstadoFacturaPuntoVenta() {
		return isPermisoCopiarEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoCopiarEstadoFacturaPuntoVenta(Boolean isPermisoCopiarEstadoFacturaPuntoVenta) {
		this.isPermisoCopiarEstadoFacturaPuntoVenta = isPermisoCopiarEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoVerFormEstadoFacturaPuntoVenta() {
		return isPermisoVerFormEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoVerFormEstadoFacturaPuntoVenta(Boolean isPermisoVerFormEstadoFacturaPuntoVenta) {
		this.isPermisoVerFormEstadoFacturaPuntoVenta = isPermisoVerFormEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoDuplicarEstadoFacturaPuntoVenta() {
		return isPermisoDuplicarEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoDuplicarEstadoFacturaPuntoVenta(Boolean isPermisoDuplicarEstadoFacturaPuntoVenta) {
		this.isPermisoDuplicarEstadoFacturaPuntoVenta = isPermisoDuplicarEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoOrdenEstadoFacturaPuntoVenta() {
		return isPermisoOrdenEstadoFacturaPuntoVenta;
	}

	public void setIsPermisoOrdenEstadoFacturaPuntoVenta(Boolean isPermisoOrdenEstadoFacturaPuntoVenta) {
		this.isPermisoOrdenEstadoFacturaPuntoVenta = isPermisoOrdenEstadoFacturaPuntoVenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoFacturaPuntoVenta() {
		return isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoEstadoFacturaPuntoVenta(Boolean isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta) {
		this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta = isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoFacturaPuntoVenta() {
		return isVisibilidadCeldaDuplicarEstadoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoFacturaPuntoVenta(Boolean isVisibilidadCeldaDuplicarEstadoFacturaPuntoVenta) {
		this.isVisibilidadCeldaDuplicarEstadoFacturaPuntoVenta = isVisibilidadCeldaDuplicarEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoFacturaPuntoVenta() {
		return isVisibilidadCeldaCopiarEstadoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaCopiarEstadoFacturaPuntoVenta(Boolean isVisibilidadCeldaCopiarEstadoFacturaPuntoVenta) {
		this.isVisibilidadCeldaCopiarEstadoFacturaPuntoVenta = isVisibilidadCeldaCopiarEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoFacturaPuntoVenta() {
		return isVisibilidadCeldaVerFormEstadoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaVerFormEstadoFacturaPuntoVenta(Boolean isVisibilidadCeldaVerFormEstadoFacturaPuntoVenta) {
		this.isVisibilidadCeldaVerFormEstadoFacturaPuntoVenta = isVisibilidadCeldaVerFormEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoFacturaPuntoVenta() {
		return isVisibilidadCeldaOrdenEstadoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaOrdenEstadoFacturaPuntoVenta(Boolean isVisibilidadCeldaOrdenEstadoFacturaPuntoVenta) {
		this.isVisibilidadCeldaOrdenEstadoFacturaPuntoVenta = isVisibilidadCeldaOrdenEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta() {
		return isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta(Boolean isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta = isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoFacturaPuntoVenta() {
		return isVisibilidadCeldaModificarEstadoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaModificarEstadoFacturaPuntoVenta(Boolean isVisibilidadCeldaModificarEstadoFacturaPuntoVenta) {
		this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta = isVisibilidadCeldaModificarEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoFacturaPuntoVenta() {
		return isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaActualizarEstadoFacturaPuntoVenta(Boolean isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta) {
		this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta = isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoFacturaPuntoVenta() {
		return isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaEliminarEstadoFacturaPuntoVenta(Boolean isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta) {
		this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta = isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoFacturaPuntoVenta() {
		return isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaCancelarEstadoFacturaPuntoVenta(Boolean isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta) {
		this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta = isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoFacturaPuntoVenta() {
		return isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarEstadoFacturaPuntoVenta(Boolean isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta) {
		this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta = isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta() {
		return isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta(Boolean isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta) {
		this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta = isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta;
	}
		
	public EstadoFacturaPuntoVentaSessionBean getestadofacturapuntoventaSessionBean() {
		return this.estadofacturapuntoventaSessionBean;
	}
	
	public void setestadofacturapuntoventaSessionBean(EstadoFacturaPuntoVentaSessionBean estadofacturapuntoventaSessionBean) {
		this.estadofacturapuntoventaSessionBean=estadofacturapuntoventaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoFacturaPuntoVenta estadofacturapuntoventa,EstadoFacturaPuntoVenta estadofacturapuntoventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoFacturaPuntoVenta(estadofacturapuntoventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadofacturapuntoventaAux.setId(estadofacturapuntoventa.getId());
		estadofacturapuntoventaAux.setVersionRow(estadofacturapuntoventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoFacturaPuntoVenta();
		
			int intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(this.estadofacturapuntoventa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadofacturapuntoventaValidator.getInvalidValues(this.estadofacturapuntoventa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadofacturapuntoventaLogic.setDatosCliente(datosCliente);
			estadofacturapuntoventaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadofacturapuntoventaAux=new  EstadoFacturaPuntoVenta();
				
				estadofacturapuntoventaAux.setIsNew(true);
				estadofacturapuntoventaAux.setIsChanged(true);
				
				estadofacturapuntoventaAux.setEstadoFacturaPuntoVentaOriginal(this.estadofacturapuntoventa);
				
				estadofacturapuntoventaAux.setId(this.estadofacturapuntoventa.getId());	
				estadofacturapuntoventaAux.setVersionRow(this.estadofacturapuntoventa.getVersionRow());	
				estadofacturapuntoventaAux.setnombre(this.estadofacturapuntoventa.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadofacturapuntoventaAux,estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofacturapuntoventaAux,estadofacturapuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofacturapuntoventaLogic.saveEstadoFacturaPuntoVentas();//WithConnection
						//estadofacturapuntoventaLogic.getSetVersionRowEstadoFacturaPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadofacturapuntoventa,estadofacturapuntoventaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadofacturapuntoventaAux=new  EstadoFacturaPuntoVenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado() 
					|| (this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado() && this.estadofacturapuntoventa.getId()>=0)) {
						
					estadofacturapuntoventaAux.setIsNew(false);
				}
				
				estadofacturapuntoventaAux.setIsDeleted(false);
			
				estadofacturapuntoventaAux.setId(this.estadofacturapuntoventa.getId());	
				estadofacturapuntoventaAux.setVersionRow(this.estadofacturapuntoventa.getVersionRow());	
				estadofacturapuntoventaAux.setnombre(this.estadofacturapuntoventa.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadofacturapuntoventaAux,estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofacturapuntoventaAux,estadofacturapuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofacturapuntoventaLogic.saveEstadoFacturaPuntoVentas();//WithConnection
						//estadofacturapuntoventaLogic.getSetVersionRowEstadoFacturaPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadofacturapuntoventa,estadofacturapuntoventaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadofacturapuntoventaAux=new  EstadoFacturaPuntoVenta();
				
				estadofacturapuntoventaAux.setIsNew(false);
				estadofacturapuntoventaAux.setIsChanged(false);
				
				estadofacturapuntoventaAux.setIsDeleted(true);
				
				estadofacturapuntoventaAux.setId(this.estadofacturapuntoventa.getId());	
				estadofacturapuntoventaAux.setVersionRow(this.estadofacturapuntoventa.getVersionRow());	
				estadofacturapuntoventaAux.setnombre(this.estadofacturapuntoventa.getnombre());	
				
				if(this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadofacturapuntoventaAux.getId()>=0) {	
						this.estadofacturapuntoventasEliminados.add(estadofacturapuntoventaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadofacturapuntoventaAux,estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofacturapuntoventaAux,estadofacturapuntoventas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofacturapuntoventaLogic.saveEstadoFacturaPuntoVentas();//WithConnection
						//estadofacturapuntoventaLogic.getSetVersionRowEstadoFacturaPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadofacturapuntoventaAux.setFacturaPuntoVentas(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadofacturapuntoventaAux,estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadofacturapuntoventaAux,estadofacturapuntoventas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().addAll(this.estadofacturapuntoventasEliminados);
					
					estadofacturapuntoventaLogic.saveEstadoFacturaPuntoVentas();//WithConnection
					//estadofacturapuntoventaLogic.getSetVersionRowEstadoFacturaPuntoVentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadofacturapuntoventasEliminados= new ArrayList<EstadoFacturaPuntoVenta>();		
			}
			
			if(this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Factura GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Factura",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadofacturapuntoventa=estadofacturapuntoventaAux;
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
      		//this.finishProcessEstadoFacturaPuntoVenta();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoFacturaPuntoVenta estadofacturapuntoventaLocal) throws Exception {
		
		if(this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadofacturapuntoventaLocal.setFacturaPuntoVentas(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas());
			
			} else {
			
				estadofacturapuntoventaLocal.setFacturaPuntoVentas(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoFacturaPuntoVenta estadofacturapuntoventaLocal) throws Exception {	
		if(this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoFacturaPuntoVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadofacturapuntoventaValidator.getInvalidValues(this.estadofacturapuntoventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoFacturaPuntoVenta estadofacturapuntoventa,List<EstadoFacturaPuntoVenta> estadofacturapuntoventas) throws Exception {
		try	{		
			EstadoFacturaPuntoVentaConstantesFunciones.actualizarLista(estadofacturapuntoventa,estadofacturapuntoventas,this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoFacturaPuntoVenta estadofacturapuntoventa,List<EstadoFacturaPuntoVenta> estadofacturapuntoventas) throws Exception {
		try	{			
			EstadoFacturaPuntoVentaConstantesFunciones.actualizarSelectedLista(estadofacturapuntoventa,estadofacturapuntoventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoFacturaPuntoVenta> estadofacturapuntoventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadofacturapuntoventasLocal=this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadofacturapuntoventasLocal=this.estadofacturapuntoventas;
			}
			//ARCHITECTURE
		
			for(EstadoFacturaPuntoVenta estadofacturapuntoventaLocal:estadofacturapuntoventasLocal) {
				if(this.permiteMantenimiento(estadofacturapuntoventaLocal) && estadofacturapuntoventaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoFacturaPuntoVentaConstantesFunciones.getEstadoFacturaPuntoVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoFacturaPuntoVentaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jLabelnombreEstadoFacturaPuntoVenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jLabelnombreEstadoFacturaPuntoVenta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FacturaPuntoVenta")) {
			if(this.estadofacturapuntoventa==null) {
				this.estadofacturapuntoventa= new EstadoFacturaPuntoVenta();
			}

			if(this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoFacturaPuntoVenta
				this.setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(this.estadofacturapuntoventa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);

				this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.getfacturapuntoventa().setEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoFacturaPuntoVenta--;	
		
		
		this.estadofacturapuntoventaAux=new EstadoFacturaPuntoVenta();
		
		this.estadofacturapuntoventaAux.setId(this.iIdNuevoEstadoFacturaPuntoVenta);
		this.estadofacturapuntoventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().add(this.estadofacturapuntoventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadofacturapuntoventas.add(this.estadofacturapuntoventaAux);
		}
		//ARCHITECTURE
		
		this.estadofacturapuntoventa=this.estadofacturapuntoventaAux;
		
		if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
		}
				
		//this.setDefaultControlesEstadoFacturaPuntoVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoFacturaPuntoVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoFacturaPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoFacturaPuntoVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoFacturaPuntoVenta(this.estadofacturapuntoventaBean,this.estadofacturapuntoventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
			classes=EstadoFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfEstadoFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadofacturapuntoventaReturnGeneral=estadofacturapuntoventaLogic.procesarEventosEstadoFacturaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas(),this.estadofacturapuntoventa,this.estadofacturapuntoventaParameterGeneral,this.isEsNuevoEstadoFacturaPuntoVenta,classes);//this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoFacturaPuntoVenta(this.estadofacturapuntoventaReturnGeneral,this.estadofacturapuntoventaBean,false);
		
		if(this.estadofacturapuntoventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoFacturaPuntoVenta(this.estadofacturapuntoventaReturnGeneral.getEstadoFacturaPuntoVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoFacturaPuntoVenta(this.estadofacturapuntoventaReturnGeneral.getEstadoFacturaPuntoVenta());
		}
		
		if(this.estadofacturapuntoventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoFacturaPuntoVenta(this.estadofacturapuntoventaReturnGeneral.getEstadoFacturaPuntoVenta(),classes);//this.estadofacturapuntoventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(this.estadofacturapuntoventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoFacturaPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoFacturaPuntoVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false);
						
			if(estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.getEsGuardarRelacionado() && FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaPuntoVentaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoFacturaPuntoVenta();
			}
			
			this.actualizarVisualTableDatosEstadoFacturaPuntoVenta();
			
			this.jTableDatosEstadoFacturaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoEstadoFacturaPuntoVenta(), this.getIndiceNuevoEstadoFacturaPuntoVenta());
			
			this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
						
			this.actualizarEstadoCeldasBotonesEstadoFacturaPuntoVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoFacturaPuntoVenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextAreanombreEstadoFacturaPuntoVenta.setEnabled(isHabilitar && this.estadofacturapuntoventaConstantesFunciones.activarnombreEstadoFacturaPuntoVenta);	
		
	};
	
	public void setDefaultControlesEstadoFacturaPuntoVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoFacturaPuntoVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadofacturapuntoventaSessionBean.setConGuardarRelaciones(true);			
			this.estadofacturapuntoventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadofacturapuntoventaSessionBean.setConGuardarRelaciones(false);			
			this.estadofacturapuntoventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoFacturaPuntoVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas()) {
				if(estadofacturapuntoventaAux.getId().equals(this.iIdNuevoEstadoFacturaPuntoVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventas) {
				if(estadofacturapuntoventaAux.getId().equals(this.iIdNuevoEstadoFacturaPuntoVenta)) {
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
	
	public int getIndiceActualEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas()) {
				if(estadofacturapuntoventaAux.getId().equals(estadofacturapuntoventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventas) {
				if(estadofacturapuntoventaAux.getId().equals(estadofacturapuntoventa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas()) {
				if(estadofacturapuntoventaAux.getEstadoFacturaPuntoVentaOriginal().getId().equals(estadofacturapuntoventaOriginal.getId())) {
					existe=true;
					estadofacturapuntoventaOriginal.setId(estadofacturapuntoventaAux.getId());
					estadofacturapuntoventaOriginal.setVersionRow(estadofacturapuntoventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventas) {
				if(estadofacturapuntoventaAux.getEstadoFacturaPuntoVentaOriginal().getId().equals(estadofacturapuntoventaOriginal.getId())) {
					existe=true;
					estadofacturapuntoventaOriginal.setId(estadofacturapuntoventaAux.getId());
					estadofacturapuntoventaOriginal.setVersionRow(estadofacturapuntoventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoFacturaPuntoVenta(Boolean esParaCancelar) throws Exception {
		estadofacturapuntoventasAux=new ArrayList<EstadoFacturaPuntoVenta>();
		estadofacturapuntoventaAux=new EstadoFacturaPuntoVenta();
		
		if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas()) {
					if(estadofacturapuntoventaAux.getId()<0) {
						estadofacturapuntoventasAux.add(estadofacturapuntoventaAux);
					}		
				}
				this.iIdNuevoEstadoFacturaPuntoVenta=0L;
				this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().removeAll(estadofacturapuntoventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventas) {
					if(estadofacturapuntoventaAux.getId()<0) {
						estadofacturapuntoventasAux.add(estadofacturapuntoventaAux);
					}		
				}
				this.iIdNuevoEstadoFacturaPuntoVenta=0L;
				this.estadofacturapuntoventas.removeAll(estadofacturapuntoventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoFacturaPuntoVenta 
					&& this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().size()>0
					) {
					estadofacturapuntoventaAux=this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().get(this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().size() - 1);
				
					if(estadofacturapuntoventaAux.getId()<0) {
						this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().remove(estadofacturapuntoventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoFacturaPuntoVenta && this.estadofacturapuntoventas.size()>0) {
					estadofacturapuntoventaAux=this.estadofacturapuntoventas.get(this.estadofacturapuntoventas.size() - 1);
				
					if(estadofacturapuntoventaAux.getId()<0) {
						this.estadofacturapuntoventas.remove(estadofacturapuntoventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoFacturaPuntoVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadofacturapuntoventa.getId()<0) {
				this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().remove(this.estadofacturapuntoventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadofacturapuntoventa.getId()<0) {
				this.estadofacturapuntoventas.remove(this.estadofacturapuntoventa);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoFacturaPuntoVenta(List<EstadoFacturaPuntoVenta> estadofacturapuntoventasAux) throws Exception {
		EstadoFacturaPuntoVentaConstantesFunciones.setEstadosInicialesEstadoFacturaPuntoVenta(estadofacturapuntoventasAux);
	}
	
	public void setEstadosInicialesEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventaAux) throws Exception {
		EstadoFacturaPuntoVentaConstantesFunciones.setEstadosInicialesEstadoFacturaPuntoVenta(estadofacturapuntoventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoFacturaPuntoVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoFacturaPuntoVentaActual()) {
				if(!this.isEsNuevoEstadoFacturaPuntoVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoFacturaPuntoVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoFacturaPuntoVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Factura ?", "MANTENIMIENTO DE Estado Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoFacturaPuntoVenta estadofacturapuntoventa) throws Exception {
		EstadoFacturaPuntoVentaConstantesFunciones.seleccionarAsignar(this.estadofacturapuntoventa,estadofacturapuntoventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoFacturaPuntoVenta=this.isPermisoActualizarOriginalEstadoFacturaPuntoVenta;
			
			
			this.seleccionarAsignar(estadofacturapuntoventa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoFacturaPuntoVentaConstantesFunciones.quitarEspaciosEstadoFacturaPuntoVenta(this.estadofacturapuntoventa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoFacturaPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadofacturapuntoventaSessionBean.setsFuncionBusquedaRapida(this.estadofacturapuntoventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoFacturaPuntoVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoFacturaPuntoVenta(esParaCancelar);				
				this.cancelarNuevoEstadoFacturaPuntoVenta(esParaCancelar);								
			}
			
			this.estadofacturapuntoventa=new EstadoFacturaPuntoVenta();
			
			this.inicializarEstadoFacturaPuntoVenta();
			
			this.actualizarEstadoCeldasBotonesEstadoFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoFacturaPuntoVenta() throws Exception {
		try {
			EstadoFacturaPuntoVentaConstantesFunciones.inicializarEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoFacturaPuntoVentas(String sAccionBusqueda,List<EstadoFacturaPuntoVenta> estadofacturapuntoventasParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoFacturaPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoFacturaPuntoVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoFacturaPuntoVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoFacturaPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Facturas");		
		parameters.put("busquedapor", EstadoFacturaPuntoVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(FacturaPuntoVenta.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoFacturaPuntoVentaLogic estadofacturapuntoventaLogicAuxiliar=new EstadoFacturaPuntoVentaLogic();
					estadofacturapuntoventaLogicAuxiliar.setDatosCliente(estadofacturapuntoventaLogic.getDatosCliente());				
					estadofacturapuntoventaLogicAuxiliar.setEstadoFacturaPuntoVentas(estadofacturapuntoventasParaReportes);
					
					estadofacturapuntoventaLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoFacturaPuntoVentaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadofacturapuntoventasParaReportes=estadofacturapuntoventaLogicAuxiliar.getEstadoFacturaPuntoVentas();
					
					//estadofacturapuntoventaLogic.getNewConnexionToDeep();
					
					//for (EstadoFacturaPuntoVenta estadofacturapuntoventa:estadofacturapuntoventasParaReportes) {
					//	estadofacturapuntoventaLogic.deepLoad(estadofacturapuntoventa, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadofacturapuntoventaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadofacturapuntoventaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFacturaPuntoVenta = AuxiliarReportes.class.getResourceAsStream("FacturaPuntoVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_facturapuntoventa", reportFileFacturaPuntoVenta);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoFacturaPuntoVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoFacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoFacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoFacturaPuntoVenta=new JRBeanArrayDataSource(EstadoFacturaPuntoVentaJInternalFrame.TraerEstadoFacturaPuntoVentaBeans(estadofacturapuntoventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoFacturaPuntoVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoFacturaPuntoVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoFacturaPuntoVentaBean.TraerEstadoFacturaPuntoVentaBeans(estadofacturapuntoventasParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,estadofacturapuntoventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,estadofacturapuntoventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoFacturaPuntoVentaActionPerformed(null);
					//this.generarExcelReporteEstadoFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,estadofacturapuntoventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,estadofacturapuntoventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,estadofacturapuntoventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,estadofacturapuntoventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoFacturaPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoFacturaPuntoVenta> estadofacturapuntoventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofacturapuntoventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoFacturaPuntoVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoFacturaPuntoVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoFacturaPuntoVenta estadofacturapuntoventa : estadofacturapuntoventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoFacturaPuntoVentaConstantesFunciones.generarExcelReporteDataEstadoFacturaPuntoVenta("NORMAL",row,workbook,estadofacturapuntoventa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoFacturaPuntoVenta(String sTipo,Row row,Workbook workbook) {
		
		EstadoFacturaPuntoVentaConstantesFunciones.generarExcelReporteHeaderEstadoFacturaPuntoVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoFacturaPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoFacturaPuntoVenta> estadofacturapuntoventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofacturapuntoventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoFacturaPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoFacturaPuntoVenta estadofacturapuntoventa : estadofacturapuntoventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoFacturaPuntoVentaConstantesFunciones.getEstadoFacturaPuntoVentaDescripcion(estadofacturapuntoventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadofacturapuntoventa.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoFacturaPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoFacturaPuntoVenta> estadofacturapuntoventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoFacturaPuntoVenta> estadofacturapuntoventasRespaldo=null;
		
		classes=EstadoFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfEstadoFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadofacturapuntoventaLogic.setDatosCliente(this.datosCliente);
		this.estadofacturapuntoventaLogic.setDatosDeep(this.datosDeep);
		this.estadofacturapuntoventaLogic.setIsConDeep(true);
		
		estadofacturapuntoventasRespaldo=this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas();
		
		this.estadofacturapuntoventaLogic.setEstadoFacturaPuntoVentas(estadofacturapuntoventasParaReportes);	
		this.estadofacturapuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadofacturapuntoventasParaReportes=this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas();
		this.estadofacturapuntoventaLogic.setEstadoFacturaPuntoVentas(estadofacturapuntoventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofacturapuntoventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoFacturaPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoFacturaPuntoVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoFacturaPuntoVenta estadofacturapuntoventa : estadofacturapuntoventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoFacturaPuntoVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoFacturaPuntoVentaConstantesFunciones.generarExcelReporteDataEstadoFacturaPuntoVenta("NORMAL",row,workbook,estadofacturapuntoventa,cellStyleDataAux);
		
			
			


				//FacturaPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadofacturapuntoventa.getFacturaPuntoVentas()!=null && estadofacturapuntoventa.getFacturaPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FacturaPuntoVentaConstantesFunciones.generarExcelReporteHeaderFacturaPuntoVenta("RELACIONADO",row,workbook);
				}

				if(estadofacturapuntoventa.getFacturaPuntoVentas()!=null) {
					i2=0;
					for(FacturaPuntoVenta facturapuntoventa : estadofacturapuntoventa.getFacturaPuntoVentas()) {
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
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoFacturaPuntoVentaConstantesFunciones.getEstadoFacturaPuntoVentaDescripcion(estadofacturapuntoventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoFacturaPuntoVenta() throws Exception {		
		this.startProcessEstadoFacturaPuntoVenta(true);
	}
	
	public void startProcessEstadoFacturaPuntoVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoFacturaPuntoVenta, this.jScrollPanelDatosEstadoFacturaPuntoVenta,this.jPanelPaginacionEstadoFacturaPuntoVenta, this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta, this.jPanelAccionesEstadoFacturaPuntoVenta,this.jPanelAccionesFormularioEstadoFacturaPuntoVenta,this.jmenuBarEstadoFacturaPuntoVenta,this.jmenuBarDetalleEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,this.jTtoolBarDetalleEstadoFacturaPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoFacturaPuntoVenta=null; 
		
		final JPanel jPanelParametrosReportesEstadoFacturaPuntoVenta=this.jPanelParametrosReportesEstadoFacturaPuntoVenta;
		//final JScrollPane jScrollPanelDatosEstadoFacturaPuntoVenta=this.jScrollPanelDatosEstadoFacturaPuntoVenta;
		final JTable jTableDatosEstadoFacturaPuntoVenta=this.jTableDatosEstadoFacturaPuntoVenta;		
		final JPanel jPanelPaginacionEstadoFacturaPuntoVenta=this.jPanelPaginacionEstadoFacturaPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionEstadoFacturaPuntoVenta=this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta;
		final JPanel jPanelAccionesEstadoFacturaPuntoVenta=this.jPanelAccionesEstadoFacturaPuntoVenta;
		
		JPanel jPanelCamposAuxiliarEstadoFacturaPuntoVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoFacturaPuntoVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
			jPanelCamposAuxiliarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jPanelCamposEstadoFacturaPuntoVenta;
			jPanelAccionesFormularioAuxiliarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jPanelAccionesFormularioEstadoFacturaPuntoVenta;
		}
		
		final JPanel jPanelCamposEstadoFacturaPuntoVenta=jPanelCamposAuxiliarEstadoFacturaPuntoVenta;
		final JPanel jPanelAccionesFormularioEstadoFacturaPuntoVenta=jPanelAccionesFormularioAuxiliarEstadoFacturaPuntoVenta;
		
		
		final JMenuBar jmenuBarEstadoFacturaPuntoVenta=this.jmenuBarEstadoFacturaPuntoVenta;
		final JToolBar jTtoolBarEstadoFacturaPuntoVenta=this.jTtoolBarEstadoFacturaPuntoVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoFacturaPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoFacturaPuntoVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jmenuBarDetalleEstadoFacturaPuntoVenta;
			jTtoolBarDetalleAuxiliarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTtoolBarDetalleEstadoFacturaPuntoVenta;
		}
		
		final JMenuBar jmenuBarDetalleEstadoFacturaPuntoVenta=jmenuBarDetalleAuxiliarEstadoFacturaPuntoVenta;
		final JToolBar jTtoolBarDetalleEstadoFacturaPuntoVenta=jTtoolBarDetalleAuxiliarEstadoFacturaPuntoVenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoFacturaPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoFacturaPuntoVenta;
			processRunnable.jTableDatos=jTableDatosEstadoFacturaPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposEstadoFacturaPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoFacturaPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoFacturaPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoFacturaPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoFacturaPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoFacturaPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarEstadoFacturaPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoFacturaPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoFacturaPuntoVenta ,jPanelParametrosReportesEstadoFacturaPuntoVenta,jTableDatosEstadoFacturaPuntoVenta, /*jScrollPanelDatosEstadoFacturaPuntoVenta,*/jPanelCamposEstadoFacturaPuntoVenta,jPanelPaginacionEstadoFacturaPuntoVenta, /*jScrollPanelDatosEdicionEstadoFacturaPuntoVenta,*/ jPanelAccionesEstadoFacturaPuntoVenta,jPanelAccionesFormularioEstadoFacturaPuntoVenta,jmenuBarEstadoFacturaPuntoVenta,jmenuBarDetalleEstadoFacturaPuntoVenta,jTtoolBarEstadoFacturaPuntoVenta,jTtoolBarDetalleEstadoFacturaPuntoVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoFacturaPuntoVenta, jScrollPanelDatosEstadoFacturaPuntoVenta,jPanelPaginacionEstadoFacturaPuntoVenta, jScrollPanelDatosEdicionEstadoFacturaPuntoVenta, jPanelAccionesEstadoFacturaPuntoVenta,jPanelAccionesFormularioEstadoFacturaPuntoVenta,jmenuBarEstadoFacturaPuntoVenta,jmenuBarDetalleEstadoFacturaPuntoVenta,jTtoolBarEstadoFacturaPuntoVenta,jTtoolBarDetalleEstadoFacturaPuntoVenta);
						
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
	
	public void finishProcessEstadoFacturaPuntoVenta() {// throws Exception 
		this.finishProcessEstadoFacturaPuntoVenta(true);
	}
	
	public void finishProcessEstadoFacturaPuntoVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoFacturaPuntoVenta, this.jScrollPanelDatosEstadoFacturaPuntoVenta,this.jPanelPaginacionEstadoFacturaPuntoVenta, this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta, this.jPanelAccionesEstadoFacturaPuntoVenta,this.jPanelAccionesFormularioEstadoFacturaPuntoVenta,this.jmenuBarEstadoFacturaPuntoVenta,this.jmenuBarDetalleEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,this.jTtoolBarDetalleEstadoFacturaPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoFacturaPuntoVenta=null; 
		
		final JPanel jPanelParametrosReportesEstadoFacturaPuntoVenta=this.jPanelParametrosReportesEstadoFacturaPuntoVenta;
		//final JScrollPane jScrollPanelDatosEstadoFacturaPuntoVenta=this.jScrollPanelDatosEstadoFacturaPuntoVenta;
		final JTable jTableDatosEstadoFacturaPuntoVenta=this.jTableDatosEstadoFacturaPuntoVenta;		
		final JPanel jPanelPaginacionEstadoFacturaPuntoVenta=this.jPanelPaginacionEstadoFacturaPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionEstadoFacturaPuntoVenta=this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta;
		final JPanel jPanelAccionesEstadoFacturaPuntoVenta=this.jPanelAccionesEstadoFacturaPuntoVenta;
		
		JPanel jPanelCamposAuxiliarEstadoFacturaPuntoVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoFacturaPuntoVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
			jPanelCamposAuxiliarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jPanelCamposEstadoFacturaPuntoVenta;
			jPanelAccionesFormularioAuxiliarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jPanelAccionesFormularioEstadoFacturaPuntoVenta;
		}
		
		final JPanel jPanelCamposEstadoFacturaPuntoVenta=jPanelCamposAuxiliarEstadoFacturaPuntoVenta;
		final JPanel jPanelAccionesFormularioEstadoFacturaPuntoVenta=jPanelAccionesFormularioAuxiliarEstadoFacturaPuntoVenta;
		
		
		final JMenuBar jmenuBarEstadoFacturaPuntoVenta=this.jmenuBarEstadoFacturaPuntoVenta;		
		final JToolBar jTtoolBarEstadoFacturaPuntoVenta=this.jTtoolBarEstadoFacturaPuntoVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoFacturaPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoFacturaPuntoVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jmenuBarDetalleEstadoFacturaPuntoVenta;
			jTtoolBarDetalleAuxiliarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTtoolBarDetalleEstadoFacturaPuntoVenta;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoFacturaPuntoVenta=jmenuBarDetalleAuxiliarEstadoFacturaPuntoVenta;
		final JToolBar jTtoolBarDetalleEstadoFacturaPuntoVenta=jTtoolBarDetalleAuxiliarEstadoFacturaPuntoVenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoFacturaPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoFacturaPuntoVenta;
			processRunnable.jTableDatos=jTableDatosEstadoFacturaPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposEstadoFacturaPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoFacturaPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoFacturaPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoFacturaPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoFacturaPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoFacturaPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarEstadoFacturaPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoFacturaPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoFacturaPuntoVenta ,jPanelParametrosReportesEstadoFacturaPuntoVenta, jTableDatosEstadoFacturaPuntoVenta,/*jScrollPanelDatosEstadoFacturaPuntoVenta,*/jPanelCamposEstadoFacturaPuntoVenta,jPanelPaginacionEstadoFacturaPuntoVenta, /*jScrollPanelDatosEdicionEstadoFacturaPuntoVenta,*/ jPanelAccionesEstadoFacturaPuntoVenta,jPanelAccionesFormularioEstadoFacturaPuntoVenta,jmenuBarEstadoFacturaPuntoVenta,jmenuBarDetalleEstadoFacturaPuntoVenta,jTtoolBarEstadoFacturaPuntoVenta,jTtoolBarDetalleEstadoFacturaPuntoVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoFacturaPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoFacturaPuntoVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoFacturaPuntoVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoFacturaPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoFacturaPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoFacturaPuntoVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoFacturaPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoFacturaPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoFacturaPuntoVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadofacturapuntoventaConstantesFunciones.getsFinalQueryEstadoFacturaPuntoVenta();
		String  finalQueryPaginacionTodos=this.estadofacturapuntoventaConstantesFunciones.getsFinalQueryEstadoFacturaPuntoVenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoFacturaPuntoVentaConstantesFunciones.getArrayColumnasGlobalesNoEstadoFacturaPuntoVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoFacturaPuntoVentaConstantesFunciones.getArrayColumnasGlobalesEstadoFacturaPuntoVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoFacturaPuntoVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadofacturapuntoventasEliminados= new ArrayList<EstadoFacturaPuntoVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoFacturaPuntoVenta();
		
				///*EstadoFacturaPuntoVentaSessionBean*/this.estadofacturapuntoventaSessionBean=new EstadoFacturaPuntoVentaSessionBean();
			
			if(this.estadofacturapuntoventaSessionBean==null) {
				this.estadofacturapuntoventaSessionBean=new EstadoFacturaPuntoVentaSessionBean();
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
					this.iNumeroPaginacion=EstadoFacturaPuntoVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoFacturaPuntoVentaConstantesFunciones.getClassesForeignKeysOfEstadoFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadofacturapuntoventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadofacturapuntoventasAux= new ArrayList<EstadoFacturaPuntoVenta>();
			
				
			estadofacturapuntoventaLogic.setDatosCliente(this.datosCliente);
			estadofacturapuntoventaLogic.setDatosDeep(this.datosDeep);
			estadofacturapuntoventaLogic.setIsConDeep(true);
			
			
			estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadofacturapuntoventaLogic.getTodosEstadoFacturaPuntoVentas(finalQueryGlobal,pagination);
					
					//estadofacturapuntoventaLogic.getTodosEstadoFacturaPuntoVentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas()==null|| estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadofacturapuntoventasAux= new ArrayList<EstadoFacturaPuntoVenta>();
							estadofacturapuntoventasAux.addAll(estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofacturapuntoventasAux= new ArrayList<EstadoFacturaPuntoVenta>();
							estadofacturapuntoventasAux.addAll(estadofacturapuntoventas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadofacturapuntoventaLogic.getTodosEstadoFacturaPuntoVentas(finalQueryGlobal+"",this.pagination);												
							
							//estadofacturapuntoventaLogic.getTodosEstadoFacturaPuntoVentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoFacturaPuntoVentas("Todos",estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadofacturapuntoventaLogic.setEstadoFacturaPuntoVentas(new ArrayList<EstadoFacturaPuntoVenta>());					
							estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().addAll(estadofacturapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofacturapuntoventas=new ArrayList<EstadoFacturaPuntoVenta>();
							estadofacturapuntoventas.addAll(estadofacturapuntoventasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoFacturaPuntoVenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoFacturaPuntoVenta=this.idActual;
				
				} else if(this.idEstadoFacturaPuntoVentaActual!=null && this.idEstadoFacturaPuntoVentaActual!=0L) {
					idEstadoFacturaPuntoVenta=idEstadoFacturaPuntoVentaActual;
				}
				
					
				this.sDetalleReporte=EstadoFacturaPuntoVentaConstantesFunciones.getDetalleIndicePorId(idEstadoFacturaPuntoVenta);
				
				this.estadofacturapuntoventas=new ArrayList<EstadoFacturaPuntoVenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadofacturapuntoventaLogic.getEntity(idEstadoFacturaPuntoVenta);
					
					//estadofacturapuntoventaLogic.getEntityWithConnection(idEstadoFacturaPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadofacturapuntoventaLogic.setEstadoFacturaPuntoVentas(new ArrayList<EstadoFacturaPuntoVenta>());
					estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().add(estadofacturapuntoventaLogic.getEstadoFacturaPuntoVenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadofacturapuntoventas=new ArrayList<EstadoFacturaPuntoVenta>();
					this.estadofacturapuntoventas.add(estadofacturapuntoventa);
				}
				
				if(estadofacturapuntoventaLogic.getEstadoFacturaPuntoVenta()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoFacturaPuntoVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoFacturaPuntoVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadofacturapuntoventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadofacturapuntoventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoFacturaPuntoVenta estadofacturapuntoventa) {
		Boolean permite=true;
		
		if(this.estadofacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoFacturaPuntoVentaConstantesFunciones.getOrderByListaEstadoFacturaPuntoVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoFacturaPuntoVentaConstantesFunciones.getOrderByListaEstadoFacturaPuntoVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFacturaPuntoVenta estadofacturapuntoventa:estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas()) {
				if(estadofacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					estadofacturapuntoventaTotales=estadofacturapuntoventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFacturaPuntoVenta estadofacturapuntoventa:this.estadofacturapuntoventas) {
				if(estadofacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					estadofacturapuntoventaTotales=estadofacturapuntoventa;
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
			this.estadofacturapuntoventaAux=new EstadoFacturaPuntoVenta();
			this.estadofacturapuntoventaAux.setsType(Constantes2.S_TOTALES);
			this.estadofacturapuntoventaAux.setIsNew(false);
			this.estadofacturapuntoventaAux.setIsChanged(false);
			this.estadofacturapuntoventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoFacturaPuntoVentaConstantesFunciones.TotalizarValoresFilaEstadoFacturaPuntoVenta(this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas(),this.estadofacturapuntoventaAux);
				
				this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().add(this.estadofacturapuntoventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoFacturaPuntoVentaConstantesFunciones.TotalizarValoresFilaEstadoFacturaPuntoVenta(this.estadofacturapuntoventas,this.estadofacturapuntoventaAux);
				
				this.estadofacturapuntoventas.add(this.estadofacturapuntoventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadofacturapuntoventaTotales=new EstadoFacturaPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().remove(estadofacturapuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadofacturapuntoventas.remove(estadofacturapuntoventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadofacturapuntoventaTotales=new EstadoFacturaPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFacturaPuntoVenta estadofacturapuntoventa:estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas()) {
				if(estadofacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					estadofacturapuntoventaTotales=estadofacturapuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoFacturaPuntoVentaConstantesFunciones.TotalizarValoresFilaEstadoFacturaPuntoVenta(this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas(),estadofacturapuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFacturaPuntoVenta estadofacturapuntoventa:this.estadofacturapuntoventas) {
				if(estadofacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					estadofacturapuntoventaTotales=estadofacturapuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoFacturaPuntoVentaConstantesFunciones.TotalizarValoresFilaEstadoFacturaPuntoVenta(this.estadofacturapuntoventas,estadofacturapuntoventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoFacturaPuntoVenta() {
		this.isPermisoTodoEstadoFacturaPuntoVenta=false;
		this.isPermisoNuevoEstadoFacturaPuntoVenta=false;
		this.isPermisoActualizarEstadoFacturaPuntoVenta=false;
		this.isPermisoActualizarOriginalEstadoFacturaPuntoVenta=false;
		this.isPermisoEliminarEstadoFacturaPuntoVenta=false;
		this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta=false;
		this.isPermisoConsultaEstadoFacturaPuntoVenta=false;
		this.isPermisoBusquedaEstadoFacturaPuntoVenta=false;
		this.isPermisoReporteEstadoFacturaPuntoVenta=false;		
		this.isPermisoOrdenEstadoFacturaPuntoVenta=false;		
		this.isPermisoPaginacionMedioEstadoFacturaPuntoVenta=false;		
		this.isPermisoPaginacionAltoEstadoFacturaPuntoVenta=false;
		this.isPermisoPaginacionTodoEstadoFacturaPuntoVenta=false;
		this.isPermisoCopiarEstadoFacturaPuntoVenta=false;		
		this.isPermisoVerFormEstadoFacturaPuntoVenta=false;		
		this.isPermisoDuplicarEstadoFacturaPuntoVenta=false;		
		this.isPermisoOrdenEstadoFacturaPuntoVenta=false;		
	}
	
	public void setPermisosUsuarioEstadoFacturaPuntoVenta(Boolean isPermiso) {
		this.isPermisoTodoEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoNuevoEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoActualizarEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoEliminarEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoConsultaEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoBusquedaEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoReporteEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoOrdenEstadoFacturaPuntoVenta=isPermiso;		
		this.isPermisoPaginacionMedioEstadoFacturaPuntoVenta=isPermiso;		
		this.isPermisoPaginacionAltoEstadoFacturaPuntoVenta=isPermiso;		
		this.isPermisoPaginacionTodoEstadoFacturaPuntoVenta=isPermiso;		
		this.isPermisoCopiarEstadoFacturaPuntoVenta=isPermiso;		
		this.isPermisoVerFormEstadoFacturaPuntoVenta=isPermiso;		
		this.isPermisoDuplicarEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoOrdenEstadoFacturaPuntoVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoFacturaPuntoVenta(Boolean isPermiso) {
		//this.isPermisoTodoEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoNuevoEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoActualizarEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoEliminarEstadoFacturaPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta=isPermiso;
		//this.isPermisoConsultaEstadoFacturaPuntoVenta=isPermiso;
		//this.isPermisoBusquedaEstadoFacturaPuntoVenta=isPermiso;
		//this.isPermisoReporteEstadoFacturaPuntoVenta=isPermiso;
		//this.isPermisoOrdenEstadoFacturaPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoFacturaPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoFacturaPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoFacturaPuntoVenta=isPermiso;		
		//this.isPermisoCopiarEstadoFacturaPuntoVenta=isPermiso;		
		//this.isPermisoDuplicarEstadoFacturaPuntoVenta=isPermiso;
		//this.isPermisoOrdenEstadoFacturaPuntoVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoFacturaPuntoVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FacturaPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosFacturaPuntoVenta=this.verificarGetPermisosUsuarioOpcionEstadoFacturaPuntoVentaClaseRelacionada(this.opcionsRelacionadas,FacturaPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoFacturaPuntoVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoFacturaPuntoVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFacturaPuntoVenta=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoFacturaPuntoVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoFacturaPuntoVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoFacturaPuntoVentaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFacturaPuntoVenta && this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.remove(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoFacturaPuntoVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoFacturaPuntoVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoFacturaPuntoVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoFacturaPuntoVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoFacturaPuntoVenta=this.isPermisoActualizarEstadoFacturaPuntoVenta;
			this.isPermisoEliminarEstadoFacturaPuntoVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoFacturaPuntoVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoFacturaPuntoVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoFacturaPuntoVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoFacturaPuntoVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoFacturaPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoFacturaPuntoVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoFacturaPuntoVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoFacturaPuntoVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoFacturaPuntoVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoFacturaPuntoVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoFacturaPuntoVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoFacturaPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoFacturaPuntoVenta.setToolTipText(this.jTableDatosEstadoFacturaPuntoVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoFacturaPuntoVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoFacturaPuntoVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoFacturaPuntoVenta() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFacturaPuntoVenta && this.estadofacturapuntoventaConstantesFunciones.mostrarFacturaPuntoVentaEstadoFacturaPuntoVenta && !EstadoFacturaPuntoVentaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Factura Punto Venta");
			reporte.setsDescripcion("Factura Punto Venta");
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
	
		
	public void inicializarCombosForeignKeyEstadoFacturaPuntoVentaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoFacturaPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoFacturaPuntoVentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoFacturaPuntoVentaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoFacturaPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoFacturaPuntoVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoFacturaPuntoVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoFacturaPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoFacturaPuntoVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoFacturaPuntoVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoFacturaPuntoVenta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoFacturaPuntoVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoFacturaPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoFacturaPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoFacturaPuntoVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoFacturaPuntoVenta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoFacturaPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoFacturaPuntoVenta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoFacturaPuntoVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoFacturaPuntoVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoFacturaPuntoVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadofacturapuntoventaSessionBean=new EstadoFacturaPuntoVentaSessionBean(); 
		this.estadofacturapuntoventaConstantesFunciones=new EstadoFacturaPuntoVentaConstantesFunciones(); 
		this.estadofacturapuntoventaBean=new EstadoFacturaPuntoVenta();//(this.estadofacturapuntoventaConstantesFunciones); 		
		this.estadofacturapuntoventaReturnGeneral=new EstadoFacturaPuntoVentaParameterReturnGeneral(); 
		
		this.estadofacturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadofacturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoFacturaPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoFacturaPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoFacturaPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoFacturaPuntoVenta(true);
			
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
			
			this.estadofacturapuntoventaConstantesFunciones=new EstadoFacturaPuntoVentaConstantesFunciones(); 
			this.estadofacturapuntoventaBean=new EstadoFacturaPuntoVenta();//this.estadofacturapuntoventaConstantesFunciones); 			
			this.estadofacturapuntoventaReturnGeneral=new EstadoFacturaPuntoVentaParameterReturnGeneral(); 
		
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Factura Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadofacturapuntoventa=new EstadoFacturaPuntoVenta();
			this.estadofacturapuntoventas = new ArrayList<EstadoFacturaPuntoVenta>();
			this.estadofacturapuntoventasAux = new ArrayList<EstadoFacturaPuntoVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic=new EstadoFacturaPuntoVentaLogic();
				this.estadofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estadofacturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadofacturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta);	
					}
					
					if(this.jInternalFrameImportacionEstadoFacturaPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoFacturaPuntoVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoFacturaPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoFacturaPuntoVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta);
				this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setVisible(false);
				this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta);
					this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoFacturaPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoFacturaPuntoVenta);
					this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setVisible(false);
					this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoFacturaPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoFacturaPuntoVenta);
					this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setVisible(false);
					this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoFacturaPuntoVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoFacturaPuntoVentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadofacturapuntoventaReturnGeneral=new EstadoFacturaPuntoVentaParameterReturnGeneral();
			
			this.estadofacturapuntoventaParameterGeneral=new EstadoFacturaPuntoVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadofacturapuntoventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FacturaPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoFacturaPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado(),this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoFacturaPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado(),this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaCopiarEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaVerFormEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaOrdenEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoFacturaPuntoVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoFacturaPuntoVenta(false);
			
			this.setPermisosUsuarioEstadoFacturaPuntoVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado() 
				|| (this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado() && this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoFacturaPuntoVentaClasesRelacionadas();
			}
			
			if(this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoFacturaPuntoVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoFacturaPuntoVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoFacturaPuntoVenta();
			}
			
			if(!this.isPermisoBusquedaEstadoFacturaPuntoVenta) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoFacturaPuntoVenta,this.isPermisoPaginacionMedioEstadoFacturaPuntoVenta,this.isPermisoPaginacionTodoEstadoFacturaPuntoVenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoFacturaPuntoVentaConstantesFunciones.getTiposSeleccionarEstadoFacturaPuntoVenta());
				
				this.tiposColumnasSelect=EstadoFacturaPuntoVentaConstantesFunciones.getTiposSeleccionarEstadoFacturaPuntoVenta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoFacturaPuntoVenta();				
				//this.tiposRelacionesSelect=EstadoFacturaPuntoVentaConstantesFunciones.getTiposRelacionesEstadoFacturaPuntoVenta(true);
				
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
			//if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoFacturaPuntoVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoFacturaPuntoVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoFacturaPuntoVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFacturaPuntoVenta() ;
			
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
				estadofacturapuntoventaImplementable= (EstadoFacturaPuntoVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoFacturaPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadofacturapuntoventaImplementableHome= (EstadoFacturaPuntoVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoFacturaPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadofacturapuntoventas= new ArrayList<EstadoFacturaPuntoVenta>();
			this.estadofacturapuntoventasEliminados= new ArrayList<EstadoFacturaPuntoVenta>();
						
			this.isEsNuevoEstadoFacturaPuntoVenta=false;
			this.esParaAccionDesdeFormularioEstadoFacturaPuntoVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoFacturaPuntoVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoFacturaPuntoVenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoFacturaPuntoVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoFacturaPuntoVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoFacturaPuntoVenta();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoFacturaPuntoVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoFacturaPuntoVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoFacturaPuntoVenta() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoFacturaPuntoVenta")) {
				iIndex=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();	
				
				

				if(sTitle.equals("Factura Punto Ventas")) {
					if(!FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoFacturaPuntoVenta();

						this.cargarParteTabPanelRelacionadaFacturaPuntoVenta(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoFacturaPuntoVenta();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFacturaPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(false,true,iIndex);
		this.jButtonFacturaPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFacturaPuntoVenta();

		//this.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.updateUI();
		//this.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FacturaPuntoVenta")) {
				int row=this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
				jButtonFacturaPuntoVentaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Factura Punto Venta")) {

					if(this.isTienePermisosFacturaPuntoVenta && this.estadofacturapuntoventaConstantesFunciones.mostrarFacturaPuntoVentaEstadoFacturaPuntoVenta && !EstadoFacturaPuntoVentaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Factura Punto Ventas"+"("+FacturaPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Factura Punto Ventas");

						if(estadofacturapuntoventaConstantesFunciones.resaltarFacturaPuntoVentaEstadoFacturaPuntoVenta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadofacturapuntoventaConstantesFunciones.resaltarFacturaPuntoVentaEstadoFacturaPuntoVenta);
						}

						jmenuItem.setEnabled(this.estadofacturapuntoventaConstantesFunciones.activarFacturaPuntoVentaEstadoFacturaPuntoVenta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FacturaPuntoVenta"));

						

						this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jmenuDetalleEstadoFacturaPuntoVenta.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoFacturaPuntoVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoFacturaPuntoVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoFacturaPuntoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoFacturaPuntoVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoFacturaPuntoVenta();
		
		this.cargarCombosFrameForeignKeyEstadoFacturaPuntoVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoFacturaPuntoVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoFacturaPuntoVenta();
		}
	}
	
	
	
	public void jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			
			
			if(jTableDatosEstadoFacturaPuntoVenta.getRowCount()>=1) {
				jTableDatosEstadoFacturaPuntoVenta.removeRowSelectionInterval(0, jTableDatosEstadoFacturaPuntoVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoFacturaPuntoVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoFacturaPuntoVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoFacturaPuntoVenta(true);			
			//this.estadofacturapuntoventa=new EstadoFacturaPuntoVenta();
			//this.estadofacturapuntoventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoFacturaPuntoVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFacturaPuntoVenta() ;
			
			if(EstadoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoFacturaPuntoVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadofacturapuntoventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);				
			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			
			if(this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoFacturaPuntoVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRows().length;			
			}
			
			estadofacturapuntoventasSeleccionados=this.getEstadoFacturaPuntoVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoFacturaPuntoVenta--;			
				//EstadoFacturaPuntoVenta estadofacturapuntoventaAux= new EstadoFacturaPuntoVenta();			
				//estadofacturapuntoventaAux.setId(this.iIdNuevoEstadoFacturaPuntoVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoFacturaPuntoVenta estadofacturapuntoventaOrigen=new EstadoFacturaPuntoVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoFacturaPuntoVenta estadofacturapuntoventaOrigen : estadofacturapuntoventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadofacturapuntoventaOrigen =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofacturapuntoventaOrigen =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoFacturaPuntoVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadofacturapuntoventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoFacturaPuntoVenta(estadofacturapuntoventaOrigen,this.estadofacturapuntoventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().add(this.estadofacturapuntoventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadofacturapuntoventas.add(this.estadofacturapuntoventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
				
				this.jTableDatosEstadoFacturaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoEstadoFacturaPuntoVenta(), this.getIndiceNuevoEstadoFacturaPuntoVenta());
				
				int iLastRow =  this.jTableDatosEstadoFacturaPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoFacturaPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoFacturaPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();									
		
			EstadoFacturaPuntoVenta estadofacturapuntoventaOrigen=new EstadoFacturaPuntoVenta();
			EstadoFacturaPuntoVenta estadofacturapuntoventaDestino=new EstadoFacturaPuntoVenta();
				
			estadofacturapuntoventasSeleccionados=this.getEstadoFacturaPuntoVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadofacturapuntoventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofacturapuntoventaOrigen =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadofacturapuntoventaOrigen =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofacturapuntoventaDestino =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadofacturapuntoventaDestino =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadofacturapuntoventaOrigen =estadofacturapuntoventasSeleccionados.get(0);
				estadofacturapuntoventaDestino =estadofacturapuntoventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoFacturaPuntoVenta(estadofacturapuntoventaOrigen,estadofacturapuntoventaDestino,true,false);
				
				estadofacturapuntoventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadofacturapuntoventaDestino,estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofacturapuntoventaDestino,estadofacturapuntoventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
				
				//this.jTableDatosEstadoFacturaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoEstadoFacturaPuntoVenta(), this.getIndiceNuevoEstadoFacturaPuntoVenta());
				
				int iLastRow =  this.jTableDatosEstadoFacturaPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoFacturaPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoFacturaPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoFacturaPuntoVenta.isVisible();
			
			
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.setVisible(!isVisible);
			this.jPanelPaginacionEstadoFacturaPuntoVenta.setVisible(!isVisible);
			this.jPanelAccionesEstadoFacturaPuntoVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoFacturaPuntoVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoFacturaPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoFacturaPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoFacturaPuntoVenta();
			
			this.abrirFrameOrderByEstadoFacturaPuntoVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoFacturaPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoFacturaPuntoVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoFacturaPuntoVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setSize(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.iWidthFormulario,this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jContentPaneDetalleEstadoFacturaPuntoVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jContentPaneDetalleEstadoFacturaPuntoVenta.getWidth(),EstadoFacturaPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jContentPaneDetalleEstadoFacturaPuntoVenta.getWidth(),EstadoFacturaPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jContentPaneDetalleEstadoFacturaPuntoVenta.getWidth(),EstadoFacturaPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFacturaPuntoVenta();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoFacturaPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoFacturaPuntoVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFacturaPuntoVenta,false,this);
				} else {
					this.jInternalFrameOrderByEstadoFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFacturaPuntoVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoFacturaPuntoVenta);
				this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setVisible(false);
				this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setSelected(false);
				
				this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoFacturaPuntoVenta"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoFacturaPuntoVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoFacturaPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoFacturaPuntoVenta==null) {
				
				this.jInternalFrameImportacionEstadoFacturaPuntoVenta=new ImportacionJInternalFrame(EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoFacturaPuntoVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoFacturaPuntoVenta);
				this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setVisible(false);
				this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setSelected(false);


				this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoFacturaPuntoVenta"));
				this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoFacturaPuntoVenta"));
				this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoFacturaPuntoVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoFacturaPuntoVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta==null) {
				this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta=new ReporteDinamicoJInternalFrame(EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta);
				this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoFacturaPuntoVenta"));
				this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoFacturaPuntoVenta"));
				this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoFacturaPuntoVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoFacturaPuntoVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFacturaPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jContentPaneDetalleEstadoFacturaPuntoVenta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoFacturaPuntoVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoFacturaPuntoVenta);
			
	       	this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.dispose();
			//this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoFacturaPuntoVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoFacturaPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setVisible(true);
	        this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoFacturaPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setVisible(true);
	        this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoFacturaPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setVisible(false);
	        this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoFacturaPuntoVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoFacturaPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setVisible(false);
	        this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoFacturaPuntoVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoFacturaPuntoVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoFacturaPuntoVenta(true);
			//this.isEsNuevoEstadoFacturaPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoFacturaPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoFacturaPuntoVenta(false) ;
			
			if(estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.getEsGuardarRelacionado() && FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoFacturaPuntoVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFacturaPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoFacturaPuntoVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoFacturaPuntoVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoFacturaPuntoVenta(true);
			//this.isEsNuevoEstadoFacturaPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadofacturapuntoventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoFacturaPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoFacturaPuntoVenta(false) ;
			
			if(EstadoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoFacturaPuntoVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFacturaPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoFacturaPuntoVenta(false);
			
			//if(!this.isEsNuevoEstadoFacturaPuntoVenta) {								
				int intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(this.estadofacturapuntoventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
				
			}
			
			if(this.permiteMantenimiento(this.estadofacturapuntoventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoFacturaPuntoVenta=true;
					this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
					this.isEsNuevoEstadoFacturaPuntoVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoFacturaPuntoVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoFacturaPuntoVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoFacturaPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoFacturaPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesEstadoFacturaPuntoVenta(false);
			
												
				
				if(EstadoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoFacturaPuntoVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,estadofacturapuntoventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoFacturaPuntoVenta(this.estadofacturapuntoventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoFacturaPuntoVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadofacturapuntoventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadofacturapuntoventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoFacturaPuntoVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFacturaPuntoVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.estadofacturapuntoventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.estadofacturapuntoventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadofacturapuntoventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoFacturaPuntoVentaModel) this.jTableDatosEstadoFacturaPuntoVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoFacturaPuntoVenta=true;
				this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
				this.isEsNuevoEstadoFacturaPuntoVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoFacturaPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoFacturaPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesEstadoFacturaPuntoVenta(false);
				
				
				
				if(EstadoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoFacturaPuntoVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoFacturaPuntoVenta.getRowCount()>=1) {
				jTableDatosEstadoFacturaPuntoVenta.removeRowSelectionInterval(0, jTableDatosEstadoFacturaPuntoVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoFacturaPuntoVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoFacturaPuntoVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFacturaPuntoVenta(false) ;
			
			this.isEsNuevoEstadoFacturaPuntoVenta=false;
			
			if(EstadoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoFacturaPuntoVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false);
				
				//SI ES MANUAL
				if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoFacturaPuntoVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoFacturaPuntoVenta--;			
			//EstadoFacturaPuntoVenta estadofacturapuntoventaAux= new EstadoFacturaPuntoVenta();			
			//estadofacturapuntoventaAux.setId(this.iIdNuevoEstadoFacturaPuntoVenta);
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoFacturaPuntoVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
			
			this.estadofacturapuntoventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().add(this.estadofacturapuntoventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadofacturapuntoventas.add(this.estadofacturapuntoventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
			
			this.jTableDatosEstadoFacturaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoEstadoFacturaPuntoVenta(), this.getIndiceNuevoEstadoFacturaPuntoVenta());
			
			int iLastRow =  this.jTableDatosEstadoFacturaPuntoVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoFacturaPuntoVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoFacturaPuntoVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false);
			
			//SI ES MANUAL
			if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoFacturaPuntoVenta();
			}
			
			//this.abrirFrameTreeEstadoFacturaPuntoVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado FacturaS ?", "MANTENIMIENTO DE Estado Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoFacturaPuntoVenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadofacturapuntoventaReturnGeneral=estadofacturapuntoventaLogic.procesarImportacionEstadoFacturaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadofacturapuntoventaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoFacturaPuntoVentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setFileImportacion(this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoFacturaPuntoVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();		

		estadofacturapuntoventasSeleccionados=this.getEstadoFacturaPuntoVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoFacturaPuntoVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoFacturaPuntoVentaBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoFacturaPuntoVentas("Todos",estadofacturapuntoventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factura",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();		
		
		estadofacturapuntoventasSeleccionados=this.getEstadoFacturaPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofacturapuntoventa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoFacturaPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoFacturaPuntoVenta estadofacturapuntoventa:estadofacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadofacturapuntoventa.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoFacturaPuntoVenta(row);				
			//	iRow++;
			//}				
			
			//for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:estadofacturapuntoventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoFacturaPuntoVenta(estadofacturapuntoventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factura",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false);
			
			//SI ES MANUAL
			if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoFacturaPuntoVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false);
			
			//SI ES MANUAL
			if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoFacturaPuntoVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false);
			
			//SI ES MANUAL
			if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoFacturaPuntoVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoFacturaPuntoVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoFacturaPuntoVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoFacturaPuntoVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoFacturaPuntoVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoFacturaPuntoVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoFacturaPuntoVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoFacturaPuntoVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoFacturaPuntoVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoFacturaPuntoVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoFacturaPuntoVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoFacturaPuntoVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoFacturaPuntoVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoFacturaPuntoVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFacturaPuntoVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoFacturaPuntoVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoFacturaPuntoVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta();
		
		this.inicializarActualizarBindingBotonesManualEstadoFacturaPuntoVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoFacturaPuntoVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFacturaPuntoVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoFacturaPuntoVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoFacturaPuntoVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoFacturaPuntoVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jCheckBoxPostAccionNuevoEstadoFacturaPuntoVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jCheckBoxPostAccionSinCerrarEstadoFacturaPuntoVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jCheckBoxPostAccionSinMensajeEstadoFacturaPuntoVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoFacturaPuntoVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
				this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jCheckBoxPostAccionNuevoEstadoFacturaPuntoVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jCheckBoxPostAccionSinCerrarEstadoFacturaPuntoVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jCheckBoxPostAccionSinMensajeEstadoFacturaPuntoVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoFacturaPuntoVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoFacturaPuntoVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoFacturaPuntoVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFacturaPuntoVenta() throws Exception {
		try	{
			if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoFacturaPuntoVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoFacturaPuntoVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoFacturaPuntoVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoFacturaPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta.addItem(reporte);
			}
			
			
			if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoFacturaPuntoVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoFacturaPuntoVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoFacturaPuntoVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoFacturaPuntoVenta(Boolean esInicializar) throws Exception {				
		if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoFacturaPuntoVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoFacturaPuntoVenta() throws Exception {
		this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoFacturaPuntoVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoFacturaPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoFacturaPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoFacturaPuntoVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFacturaPuntoVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoFacturaPuntoVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoFacturaPuntoVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadofacturapuntoventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoFacturaPuntoVenta.setModel(new EstadoFacturaPuntoVentaModel(this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoFacturaPuntoVenta.setModel(new EstadoFacturaPuntoVentaModel(this.estadofacturapuntoventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoFacturaPuntoVenta!=null && this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoFacturaPuntoVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFacturaPuntoVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoFacturaPuntoVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,estadofacturapuntoventaConstantesFunciones.resaltarSeleccionarEstadoFacturaPuntoVenta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,estadofacturapuntoventaConstantesFunciones.resaltarSeleccionarEstadoFacturaPuntoVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFacturaPuntoVenta,EstadoFacturaPuntoVentaConstantesFunciones.LABEL_ID));

		if(this.estadofacturapuntoventaConstantesFunciones.mostraridEstadoFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoFacturaPuntoVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadofacturapuntoventaConstantesFunciones.resaltaridEstadoFacturaPuntoVenta,this.estadofacturapuntoventaConstantesFunciones.activaridEstadoFacturaPuntoVenta,this,true,"idEstadoFacturaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadofacturapuntoventaConstantesFunciones.resaltaridEstadoFacturaPuntoVenta,this.estadofacturapuntoventaConstantesFunciones.activaridEstadoFacturaPuntoVenta,this,true,"idEstadoFacturaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFacturaPuntoVenta,EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE));

		if(this.estadofacturapuntoventaConstantesFunciones.mostrarnombreEstadoFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadofacturapuntoventaConstantesFunciones.resaltarnombreEstadoFacturaPuntoVenta,this.estadofacturapuntoventaConstantesFunciones.activarnombreEstadoFacturaPuntoVenta,this,true,"nombreEstadoFacturaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadofacturapuntoventaConstantesFunciones.resaltarnombreEstadoFacturaPuntoVenta,this.estadofacturapuntoventaConstantesFunciones.activarnombreEstadoFacturaPuntoVenta,this,true,"nombreEstadoFacturaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFacturaPuntoVenta && this.estadofacturapuntoventaConstantesFunciones.mostrarFacturaPuntoVentaEstadoFacturaPuntoVenta && !EstadoFacturaPuntoVentaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Factura Punto Ventas");
				tableColumn.setHeaderValue("Factura Punto Ventas");
				tableColumn.setCellRenderer(new FacturaPuntoVentaTableCell(estadofacturapuntoventaConstantesFunciones.resaltarFacturaPuntoVentaEstadoFacturaPuntoVenta,this,this.estadofacturapuntoventaConstantesFunciones.activarFacturaPuntoVentaEstadoFacturaPuntoVenta));
				tableColumn.setCellEditor(new FacturaPuntoVentaTableCell(estadofacturapuntoventaConstantesFunciones.resaltarFacturaPuntoVentaEstadoFacturaPuntoVenta,this,this.estadofacturapuntoventaConstantesFunciones.activarFacturaPuntoVentaEstadoFacturaPuntoVenta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoFacturaPuntoVenta.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoFacturaPuntoVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoFacturaPuntoVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoFacturaPuntoVenta && this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoFacturaPuntoVenta.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoFacturaPuntoVenta.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoFacturaPuntoVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoFacturaPuntoVenta && this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoFacturaPuntoVenta && this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoFacturaPuntoVenta.moveColumn(this.jTableDatosEstadoFacturaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoFacturaPuntoVenta.moveColumn(this.jTableDatosEstadoFacturaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoFacturaPuntoVenta.moveColumn(this.jTableDatosEstadoFacturaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoFacturaPuntoVenta.moveColumn(this.jTableDatosEstadoFacturaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoFacturaPuntoVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoFacturaPuntoVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoFacturaPuntoVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoFacturaPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoFacturaPuntoVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoFacturaPuntoVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoFacturaPuntoVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoFacturaPuntoVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadofacturapuntoventas.size()-1;
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
		//this.jTableDatosEstadoFacturaPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoFacturaPuntoVenta();
			
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
				
				//this.isEsNuevoEstadoFacturaPuntoVenta=false;
					
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			
				if(this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoFacturaPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadofacturapuntoventa.getsType().equals("DUPLICADO")
				   || this.estadofacturapuntoventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoFacturaPuntoVenta=true;
				
				} else {
					this.isEsNuevoEstadoFacturaPuntoVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					if(this.estadofacturapuntoventa.getId()>=0 && !this.estadofacturapuntoventa.getIsNew()) {						
						this.isEsNuevoEstadoFacturaPuntoVenta=false;
						
					} else {
						this.isEsNuevoEstadoFacturaPuntoVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoFacturaPuntoVenta(esRelaciones);						
				
				this.seleccionarEstadoFacturaPuntoVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadofacturapuntoventa.getId()<0) {
					this.isEsNuevoEstadoFacturaPuntoVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoFacturaPuntoVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoFacturaPuntoVenta(evt,rowIndex);
				}	
				
				if(this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoFacturaPuntoVenta: " + this.dDif); 
					}
				}								
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoFacturaPuntoVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadofacturapuntoventa)) {
					if(this.estadofacturapuntoventa.getId()>0) {
						this.estadofacturapuntoventa.setIsDeleted(true);
						
						this.estadofacturapuntoventasEliminados.add(this.estadofacturapuntoventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().remove(this.estadofacturapuntoventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadofacturapuntoventas.remove(this.estadofacturapuntoventa);				
					}
					
					
					((EstadoFacturaPuntoVentaModel) this.jTableDatosEstadoFacturaPuntoVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoFacturaPuntoVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoFacturaPuntoVenta) {
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoFacturaPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoFacturaPuntoVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoFacturaPuntoVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoFacturaPuntoVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoFacturaPuntoVenta(estadofacturapuntoventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoFacturaPuntoVenta(estadofacturapuntoventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoFacturaPuntoVenta(estadofacturapuntoventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoFacturaPuntoVenta(estadofacturapuntoventa);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextFieldidEstadoFacturaPuntoVenta.setText(estadofacturapuntoventa.getId().toString());
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextAreanombreEstadoFacturaPuntoVenta.setText(estadofacturapuntoventa.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoFacturaPuntoVenta estadofacturapuntoventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadofacturapuntoventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoFacturaPuntoVenta estadofacturapuntoventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadofacturapuntoventaLocal=this.estadofacturapuntoventa;
			} else {
				estadofacturapuntoventaLocal=this.estadofacturapuntoventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadofacturapuntoventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoFacturaPuntoVenta(estadofacturapuntoventaLocal,true);
					
					if(estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadofacturapuntoventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadofacturapuntoventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(estadofacturapuntoventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(estadofacturapuntoventa);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(estadofacturapuntoventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextFieldidEstadoFacturaPuntoVenta.getText()==null || this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextFieldidEstadoFacturaPuntoVenta.getText()=="" || this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextFieldidEstadoFacturaPuntoVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextFieldidEstadoFacturaPuntoVenta.setText("0");
			}

			if(conColumnasBase) {estadofacturapuntoventa.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextFieldidEstadoFacturaPuntoVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoFacturaPuntoVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jLabelIdEstadoFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadofacturapuntoventa.setnombre(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextAreanombreEstadoFacturaPuntoVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jLabelnombreEstadoFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventaBean,EstadoFacturaPuntoVenta estadofacturapuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventaOrigen,EstadoFacturaPuntoVenta estadofacturapuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadofacturapuntoventaOrigen.getId()!=null && !estadofacturapuntoventaOrigen.getId().equals(0L))) {estadofacturapuntoventa.setId(estadofacturapuntoventaOrigen.getId());}}
			if(conDefault || (!conDefault && estadofacturapuntoventaOrigen.getnombre()!=null && !estadofacturapuntoventaOrigen.getnombre().equals(""))) {estadofacturapuntoventa.setnombre(estadofacturapuntoventaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextFieldidEstadoFacturaPuntoVenta.setText(estadofacturapuntoventa.getId().toString());
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextAreanombreEstadoFacturaPuntoVenta.setText(estadofacturapuntoventa.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoFacturaPuntoVenta(EstadoFacturaPuntoVentaBean estadofacturapuntoventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextFieldidEstadoFacturaPuntoVenta.setText(estadofacturapuntoventaBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextAreanombreEstadoFacturaPuntoVenta.setText(estadofacturapuntoventaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoFacturaPuntoVenta(EstadoFacturaPuntoVentaParameterReturnGeneral estadofacturapuntoventaReturnGeneral,EstadoFacturaPuntoVentaBean estadofacturapuntoventaBean,Boolean conDefault) throws Exception { 
		try {
			EstadoFacturaPuntoVenta estadofacturapuntoventaLocal=new EstadoFacturaPuntoVenta();
			
			estadofacturapuntoventaLocal=estadofacturapuntoventaReturnGeneral.getEstadoFacturaPuntoVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadofacturapuntoventaLocal.getId()!=null && !estadofacturapuntoventaLocal.getId().equals(0L))) {estadofacturapuntoventaBean.setId(estadofacturapuntoventaLocal.getId());}}
			if(conDefault || (!conDefault && estadofacturapuntoventaLocal.getnombre()!=null && !estadofacturapuntoventaLocal.getnombre().equals(""))) {estadofacturapuntoventaBean.setnombre(estadofacturapuntoventaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoFacturaPuntoVentaGenerico(Long idEstadoFacturaPuntoVentaSeleccionado,JComboBox jComboBoxEstadoFacturaPuntoVenta,List<EstadoFacturaPuntoVenta> estadofacturapuntoventasLocal)throws Exception {
		try {
			EstadoFacturaPuntoVenta  estadofacturapuntoventaTemp=null;

			for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:estadofacturapuntoventasLocal) {
				if(estadofacturapuntoventaAux.getId()!=null && estadofacturapuntoventaAux.getId().equals(idEstadoFacturaPuntoVentaSeleccionado)) {
					estadofacturapuntoventaTemp=estadofacturapuntoventaAux;
					break;
				}
			}

			jComboBoxEstadoFacturaPuntoVenta.setSelectedItem(estadofacturapuntoventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoFacturaPuntoVentaGenerico(JComboBox jComboBoxEstadoFacturaPuntoVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoFacturaPuntoVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoFacturaPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoFacturaPuntoVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoFacturaPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadofacturapuntoventa=(EstadoFacturaPuntoVenta) estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadofacturapuntoventa =(EstadoFacturaPuntoVenta) estadofacturapuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoFacturaPuntoVenta estadofacturapuntoventaRow=new EstadoFacturaPuntoVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadofacturapuntoventaRow=(EstadoFacturaPuntoVenta) estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadofacturapuntoventaRow=(EstadoFacturaPuntoVenta) estadofacturapuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFacturaPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoFacturaPuntoVenta estadofacturapuntoventa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofacturapuntoventa = (EstadoFacturaPuntoVenta)this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadofacturapuntoventa = (EstadoFacturaPuntoVenta)this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadofacturapuntoventa!=null) {
						this.estadofacturapuntoventa = estadofacturapuntoventa;
					} else {
						this.estadofacturapuntoventa = new EstadoFacturaPuntoVenta();
					}
				}

				if(this.isTienePermisosFacturaPuntoVenta && this.permiteMantenimiento(this.estadofacturapuntoventa)) {
					FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup=new FacturaPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						facturapuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup;
					} else {
						facturapuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame;
					}

					List<EstadoFacturaPuntoVenta> estadofacturapuntoventas=new ArrayList<EstadoFacturaPuntoVenta>();
					estadofacturapuntoventas.add(this.estadofacturapuntoventa);
					if(!esRelacionado) {
						//facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setConGuardarRelaciones(false);
						//facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					facturapuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.cargarFacturaPuntoVentaBeanSwingJInternalFrame(estadofacturapuntoventas,this.estadofacturapuntoventa,facturapuntoventaBeanSwingJInternalFrame,/*conInicializar,*/facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.getConGuardarRelaciones(),facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.getEsGuardarRelacionado());
					facturapuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						facturapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaPuntoVenta("no_relacionado");

						facturapuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FacturaPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (FacturaPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						facturapuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoFacturaPuntoVenta=(TitledBorder)this.jScrollPanelDatosEstadoFacturaPuntoVenta.getBorder();
						TitledBorder titledBorderFacturaPuntoVenta=(TitledBorder)facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.getBorder();

						titledBorderFacturaPuntoVenta.setTitle(titledBorderEstadoFacturaPuntoVenta.getTitle() + " -> Factura Punto Venta");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,facturapuntoventaBeanSwingJInternalFrame);
						}

						facturapuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(facturapuntoventaBeanSwingJInternalFrame);

						facturapuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Factura Punto Venta",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoFacturaPuntoVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta && this.isPermisoNuevoEstadoFacturaPuntoVenta));			
			this.jButtonDuplicarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarEstadoFacturaPuntoVenta && this.isPermisoDuplicarEstadoFacturaPuntoVenta));			
			this.jButtonCopiarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarEstadoFacturaPuntoVenta && this.isPermisoCopiarEstadoFacturaPuntoVenta));
			this.jButtonVerFormEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormEstadoFacturaPuntoVenta && this.isPermisoVerFormEstadoFacturaPuntoVenta));
			
			this.jButtonAbrirOrderByEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenEstadoFacturaPuntoVenta && this.isPermisoOrdenEstadoFacturaPuntoVenta));			
			
			this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta && this.isPermisoNuevoEstadoFacturaPuntoVenta));			
			this.jButtonNuevoGuardarCambiosEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta && this.isPermisoNuevoEstadoFacturaPuntoVenta && this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta));
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonModificarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta && this.isPermisoActualizarEstadoFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonActualizarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta && this.isPermisoActualizarEstadoFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonEliminarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta && this.isPermisoEliminarEstadoFacturaPuntoVenta));
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonCancelarEstadoFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta);							
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonGuardarCambiosEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta && this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta && this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta && this.isPermisoNuevoEstadoFacturaPuntoVenta));						
			this.jButtonDuplicarToolBarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarEstadoFacturaPuntoVenta && this.isPermisoDuplicarEstadoFacturaPuntoVenta));						
			this.jButtonCopiarToolBarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarEstadoFacturaPuntoVenta && this.isPermisoCopiarEstadoFacturaPuntoVenta));			
			this.jButtonVerFormToolBarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormEstadoFacturaPuntoVenta && this.isPermisoVerFormEstadoFacturaPuntoVenta));			
			this.jButtonAbrirOrderByToolBarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenEstadoFacturaPuntoVenta && this.isPermisoOrdenEstadoFacturaPuntoVenta));
			this.jButtonNuevoRelacionesToolBarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta && this.isPermisoNuevoEstadoFacturaPuntoVenta));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta && this.isPermisoNuevoEstadoFacturaPuntoVenta && this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta));			
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonModificarToolBarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta && this.isPermisoActualizarEstadoFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonActualizarToolBarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta  && this.isPermisoActualizarEstadoFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonEliminarToolBarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta && this.isPermisoEliminarEstadoFacturaPuntoVenta));
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonCancelarToolBarEstadoFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta);				
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonGuardarCambiosToolBarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta && this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta && this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta && this.isPermisoNuevoEstadoFacturaPuntoVenta));			
			this.jMenuItemDuplicarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarEstadoFacturaPuntoVenta && this.isPermisoDuplicarEstadoFacturaPuntoVenta));			
			this.jMenuItemCopiarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarEstadoFacturaPuntoVenta && this.isPermisoCopiarEstadoFacturaPuntoVenta));			
			this.jMenuItemVerFormEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormEstadoFacturaPuntoVenta && this.isPermisoVerFormEstadoFacturaPuntoVenta));			
			this.jMenuItemAbrirOrderByEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenEstadoFacturaPuntoVenta && this.isPermisoOrdenEstadoFacturaPuntoVenta));			
			//this.jMenuItemMostrarOcultarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenEstadoFacturaPuntoVenta && this.isPermisoOrdenEstadoFacturaPuntoVenta));
			this.jMenuItemDetalleAbrirOrderByEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenEstadoFacturaPuntoVenta && this.isPermisoOrdenEstadoFacturaPuntoVenta));			
			//this.jMenuItemDetalleMostrarOcultarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenEstadoFacturaPuntoVenta && this.isPermisoOrdenEstadoFacturaPuntoVenta));			
			this.jMenuItemNuevoRelacionesEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta && this.isPermisoNuevoEstadoFacturaPuntoVenta));			
			this.jMenuItemNuevoGuardarCambiosEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta && this.isPermisoNuevoEstadoFacturaPuntoVenta && this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta));									
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemModificarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta && this.isPermisoActualizarEstadoFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemActualizarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta && this.isPermisoActualizarEstadoFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemEliminarEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta && this.isPermisoEliminarEstadoFacturaPuntoVenta));
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemCancelarEstadoFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta);				
			}
			
			this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta && this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta));						
			this.jMenuItemGuardarCambiosTablaEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta && this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=this.jButtonNuevoEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoFacturaPuntoVenta=this.jButtonDuplicarEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCopiarEstadoFacturaPuntoVenta=this.jButtonCopiarEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaVerFormEstadoFacturaPuntoVenta=this.jButtonVerFormEstadoFacturaPuntoVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoFacturaPuntoVenta=this.jButtonAbrirOrderByEstadoFacturaPuntoVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta=this.jButtonModificarEstadoFacturaPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
			this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonActualizarEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonEliminarEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonCancelarEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonGuardarCambiosEstadoFacturaPuntoVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=this.jButtonNuevoToolBarEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=this.jButtonNuevoRelacionesToolBarEstadoFacturaPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonModificarToolBarEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonActualizarToolBarEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonEliminarToolBarEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonCancelarToolBarEstadoFacturaPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=this.jButtonGuardarCambiosToolBarEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=this.jButtonGuardarCambiosTablaToolBarEstadoFacturaPuntoVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=this.jMenuItemNuevoEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=this.jMenuItemNuevoRelacionesEstadoFacturaPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemModificarEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemActualizarEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemEliminarEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemCancelarEstadoFacturaPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=this.jMenuItemGuardarCambiosTablaEstadoFacturaPuntoVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoFacturaPuntoVenta(Boolean esInicializar) {
		if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				//if(this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoFacturaPuntoVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoFacturaPuntoVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoFacturaPuntoVenta() {
		this.jButtonNuevoEstadoFacturaPuntoVenta.setVisible(this.isPermisoNuevoEstadoFacturaPuntoVenta);			
		this.jButtonDuplicarEstadoFacturaPuntoVenta.setVisible(this.isPermisoDuplicarEstadoFacturaPuntoVenta);			
		this.jButtonCopiarEstadoFacturaPuntoVenta.setVisible(this.isPermisoCopiarEstadoFacturaPuntoVenta);			
		this.jButtonVerFormEstadoFacturaPuntoVenta.setVisible(this.isPermisoVerFormEstadoFacturaPuntoVenta);			
		
		this.jButtonAbrirOrderByEstadoFacturaPuntoVenta.setVisible(this.isPermisoOrdenEstadoFacturaPuntoVenta);					
		
		this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta.setVisible(this.isPermisoNuevoEstadoFacturaPuntoVenta);			
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonModificarEstadoFacturaPuntoVenta.setVisible(this.isPermisoActualizarEstadoFacturaPuntoVenta);	
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonActualizarEstadoFacturaPuntoVenta.setVisible(this.isPermisoActualizarEstadoFacturaPuntoVenta);	
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonEliminarEstadoFacturaPuntoVenta.setVisible(this.isPermisoEliminarEstadoFacturaPuntoVenta);
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonCancelarEstadoFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta);						
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonGuardarCambiosEstadoFacturaPuntoVenta.setVisible(this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta.setVisible(this.isPermisoActualizarEstadoFacturaPuntoVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoFacturaPuntoVenta() {
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonModificarEstadoFacturaPuntoVenta.setVisible(this.isPermisoActualizarEstadoFacturaPuntoVenta);	
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonActualizarEstadoFacturaPuntoVenta.setVisible(this.isPermisoActualizarEstadoFacturaPuntoVenta);	
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonEliminarEstadoFacturaPuntoVenta.setVisible(this.isPermisoEliminarEstadoFacturaPuntoVenta);
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonCancelarEstadoFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta);							
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonGuardarCambiosEstadoFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta && this.isPermisoGuardarCambiosEstadoFacturaPuntoVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoFacturaPuntoVenta() {
		if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoFacturaPuntoVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoFacturaPuntoVenta() {
	}
	
	public void jTableDatosEstadoFacturaPuntoVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoFacturaPuntoVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(this.getestadofacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadofacturapuntoventa==null) {
						this.estadofacturapuntoventa = new EstadoFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(this.estadofacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
				}

				if(this.estadofacturapuntoventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadofacturapuntoventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(this.getestadofacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadofacturapuntoventa==null) {
						this.estadofacturapuntoventa = new EstadoFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(this.estadofacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);
				}

				if(this.estadofacturapuntoventa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadofacturapuntoventa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoFacturaPuntoVenta() {
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.dispose();
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta!=null) {
			this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.dispose();
			this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta=null;
		}
		
		if(this.jInternalFrameImportacionEstadoFacturaPuntoVenta!=null) {
			this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoFacturaPuntoVenta.dispose();
			this.jInternalFrameImportacionEstadoFacturaPuntoVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoFacturaPuntoVenta();
			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoFacturaPuntoVenta")) {
				jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoFacturaPuntoVenta")) {
				jButtonDuplicarEstadoFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoFacturaPuntoVenta")) {
				jButtonCopiarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoFacturaPuntoVenta")) {
				jButtonVerFormEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoFacturaPuntoVenta")) {
				jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoFacturaPuntoVenta")) {
				jButtonDuplicarEstadoFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoFacturaPuntoVenta")) {
				jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoFacturaPuntoVenta")) {
				jButtonDuplicarEstadoFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoFacturaPuntoVenta")) {
				jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoFacturaPuntoVenta")) {
				jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoFacturaPuntoVenta")) {
				jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoFacturaPuntoVenta")) {
				jButtonModificarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoFacturaPuntoVenta")) {
				jButtonModificarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoFacturaPuntoVenta")) {
				jButtonModificarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoFacturaPuntoVenta")) {
				jButtonActualizarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoFacturaPuntoVenta")) {
				jButtonActualizarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoFacturaPuntoVenta")) {
				jButtonActualizarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoFacturaPuntoVenta")) {
				jButtonEliminarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoFacturaPuntoVenta")) {
				jButtonEliminarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoFacturaPuntoVenta")) {
				jButtonEliminarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoFacturaPuntoVenta")) {
				jButtonCancelarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoFacturaPuntoVenta")) {
				jButtonCancelarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoFacturaPuntoVenta")) {
				jButtonCancelarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoFacturaPuntoVenta")) {
				jButtonCerrarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoFacturaPuntoVenta")) {
				jButtonCerrarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoFacturaPuntoVenta")) {
				jButtonCerrarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoFacturaPuntoVenta")) {
				jButtonMostrarOcultarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoFacturaPuntoVenta")) {
				jButtonCancelarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoFacturaPuntoVenta")) {
				jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoFacturaPuntoVenta")) {
				jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoFacturaPuntoVenta")) {
				jButtonCopiarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoFacturaPuntoVenta")) {
				jButtonVerFormEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoFacturaPuntoVenta")) {
				jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoFacturaPuntoVenta")) {
				jButtonCopiarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoFacturaPuntoVenta")) {
				jButtonVerFormEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoFacturaPuntoVenta")) {
				jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoFacturaPuntoVenta")) {
				jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoFacturaPuntoVenta")) {
				jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoFacturaPuntoVenta")) {
				jButtonRecargarInformacionEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoFacturaPuntoVenta")) {
				jButtonRecargarInformacionEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoFacturaPuntoVenta")) {
				jButtonRecargarInformacionEstadoFacturaPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoFacturaPuntoVenta")) {
				jButtonAnterioresEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoFacturaPuntoVenta")) {
				jButtonAnterioresEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoFacturaPuntoVenta")) {
				jButtonAnterioresEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoFacturaPuntoVenta")) {
				jButtonSiguientesEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoFacturaPuntoVenta")) {
				jButtonSiguientesEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoFacturaPuntoVenta")) {
				jButtonSiguientesEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoFacturaPuntoVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoFacturaPuntoVenta")) {
				jButtonAbrirOrderByEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoFacturaPuntoVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoFacturaPuntoVenta")) {
				jButtonMostrarOcultarEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoFacturaPuntoVenta")) {
				jButtonNuevoGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoFacturaPuntoVenta")) {
				jButtonNuevoGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoFacturaPuntoVenta")) {
				jButtonNuevoGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoFacturaPuntoVenta")) {
				jButtonCerrarReporteDinamicoEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoFacturaPuntoVenta")) {
				jButtonGenerarReporteDinamicoEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoFacturaPuntoVenta")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoFacturaPuntoVenta")) {
				jButtonCerrarImportacionEstadoFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoFacturaPuntoVenta")) {
				
				jButtonGenerarImportacionEstadoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoFacturaPuntoVenta")) {
				
				jButtonAbrirImportacionEstadoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoFacturaPuntoVenta")) {
				jComboBoxTiposAccionesEstadoFacturaPuntoVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoFacturaPuntoVenta")) {
				jComboBoxTiposRelacionesEstadoFacturaPuntoVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoFacturaPuntoVenta")) {
				jComboBoxTiposAccionesEstadoFacturaPuntoVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoFacturaPuntoVenta")) {
				
				jComboBoxTiposSeleccionarEstadoFacturaPuntoVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoFacturaPuntoVenta")) {
				jTextFieldValorCampoGeneralEstadoFacturaPuntoVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoFacturaPuntoVenta")) {
				jButtonAbrirOrderByEstadoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoFacturaPuntoVenta")) {
				jButtonAbrirOrderByEstadoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoFacturaPuntoVenta")) {
				jButtonCerrarOrderByEstadoFacturaPuntoVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoFacturaPuntoVentaBusqueda")) {
				this.jButtonidEstadoFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoFacturaPuntoVentaBusqueda")) {
				this.jButtonnombreEstadoFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoFacturaPuntoVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				


				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoFacturaPuntoVenta estadofacturapuntoventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadofacturapuntoventaLocal=this.estadofacturapuntoventa;
			} else {
				estadofacturapuntoventaLocal=this.estadofacturapuntoventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
							
				
				


				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			
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
			
			


			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
								
						
				


				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFacturaPuntoVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
								
				
				


				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
							
				
				


				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFacturaPuntoVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			
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
			
			


			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
								
				
				


				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoFacturaPuntoVenta")) {
					jCheckBoxSeleccionarTodosEstadoFacturaPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoFacturaPuntoVenta")) {
					jCheckBoxSeleccionadosEstadoFacturaPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoFacturaPuntoVenta")) {
					
				}
				
				


				
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
												
				
				


				
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
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
			
			


			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFacturaPuntoVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFacturaPuntoVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofacturapuntoventa);
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
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
				
				


				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFacturaPuntoVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofacturapuntoventaAnterior =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoFacturaPuntoVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoFacturaPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadofacturapuntoventa =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadofacturapuntoventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoFacturaPuntoVenta")) {
				
				}
				
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoFacturaPuntoVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoFacturaPuntoVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoFacturaPuntoVenta")) {
			
			}
			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoFacturaPuntoVenta();
			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoFacturaPuntoVenta")) {
				jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoFacturaPuntoVenta")) {
				jButtonDuplicarEstadoFacturaPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoFacturaPuntoVenta")) {
				jButtonCopiarEstadoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoFacturaPuntoVenta")) {
				jButtonVerFormEstadoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoFacturaPuntoVenta")) {
				jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoFacturaPuntoVenta")) {
				jButtonModificarEstadoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoFacturaPuntoVenta")) {
				jButtonActualizarEstadoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoFacturaPuntoVenta")) {
				jButtonEliminarEstadoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoFacturaPuntoVenta")) {
				jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoFacturaPuntoVenta")) {
				jButtonCancelarEstadoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoFacturaPuntoVenta")) {
				jButtonCerrarEstadoFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoFacturaPuntoVenta")) {
				jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoFacturaPuntoVenta")) {
				jButtonNuevoGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoFacturaPuntoVenta")) {
				jButtonAbrirOrderByEstadoFacturaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoFacturaPuntoVenta")) {
				jButtonRecargarInformacionEstadoFacturaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoFacturaPuntoVenta")) {
				jButtonAnterioresEstadoFacturaPuntoVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoFacturaPuntoVenta")) {
				jButtonSiguientesEstadoFacturaPuntoVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoFacturaPuntoVentaBusqueda")) {
				this.jButtonidEstadoFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoFacturaPuntoVentaBusqueda")) {
				this.jButtonnombreEstadoFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoFacturaPuntoVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoFacturaPuntoVenta")) {
				closingInternalFrameEstadoFacturaPuntoVenta();
				
			} else if(sTipo.equals("jButtonCancelarEstadoFacturaPuntoVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoFacturaPuntoVenta = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoFacturaPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(EstadoFacturaPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoFacturaPuntoVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoFacturaPuntoVentaActionPerformed(null);
			}
			
			EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadofacturapuntoventa,new Object(),this.estadofacturapuntoventaParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoFacturaPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoFacturaPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoFacturaPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadofacturapuntoventa)) {
			if(!esControlTabla) {
				if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(this.estadofacturapuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);			
				}
				
				if(this.estadofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoFacturaPuntoVenta(this.estadofacturapuntoventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadofacturapuntoventaReturnGeneral=estadofacturapuntoventaLogic.procesarEventosEstadoFacturaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas(),this.estadofacturapuntoventa,this.estadofacturapuntoventaParameterGeneral,this.isEsNuevoEstadoFacturaPuntoVenta,classes);//this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoFacturaPuntoVenta(this.estadofacturapuntoventaReturnGeneral,this.estadofacturapuntoventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoFacturaPuntoVenta(classes,this.estadofacturapuntoventaReturnGeneral,this.estadofacturapuntoventaBean,false);
					}
						
					if(this.estadofacturapuntoventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoFacturaPuntoVenta(this.estadofacturapuntoventaReturnGeneral.getEstadoFacturaPuntoVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoFacturaPuntoVenta(this.estadofacturapuntoventaReturnGeneral.getEstadoFacturaPuntoVenta());	
					}
						
					if(this.estadofacturapuntoventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoFacturaPuntoVenta(this.estadofacturapuntoventaReturnGeneral.getEstadoFacturaPuntoVenta(),classes);//this.estadofacturapuntoventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoFacturaPuntoVenta(this.estadofacturapuntoventa,classes);//this.estadofacturapuntoventaBean);									
				}
			
				if(EstadoFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoFacturaPuntoVenta(this.estadofacturapuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFacturaPuntoVenta(this.estadofacturapuntoventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadofacturapuntoventaAnterior!=null) {
						this.estadofacturapuntoventa=this.estadofacturapuntoventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadofacturapuntoventaReturnGeneral=estadofacturapuntoventaLogic.procesarEventosEstadoFacturaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas(),this.estadofacturapuntoventa,this.estadofacturapuntoventaParameterGeneral,this.isEsNuevoEstadoFacturaPuntoVenta,classes);//this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadofacturapuntoventaReturnGeneral.getEstadoFacturaPuntoVenta(),estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadofacturapuntoventaReturnGeneral.getEstadoFacturaPuntoVenta(),this.estadofacturapuntoventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoFacturaPuntoVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoFacturaPuntoVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoFacturaPuntoVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoFacturaPuntoVenta() throws Exception {
		
		EstadoFacturaPuntoVentaModel estadofacturapuntoventaModel=(EstadoFacturaPuntoVentaModel)this.jTableDatosEstadoFacturaPuntoVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadofacturapuntoventaModel.estadofacturapuntoventas=this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadofacturapuntoventaModel.estadofacturapuntoventas=this.estadofacturapuntoventas;
		}
		
		
		((EstadoFacturaPuntoVentaModel) this.jTableDatosEstadoFacturaPuntoVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoFacturaPuntoVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadofacturapuntoventaAnterior(),this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadofacturapuntoventaAnterior(),this.estadofacturapuntoventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoFacturaPuntoVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaPuntoVenta.class)) {
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.setFacturaPuntoVentas(estadofacturapuntoventa.getFacturaPuntoVentas());
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
										
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofacturapuntoventa,new Object(),generalEntityParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfEstadoFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoFacturaPuntoVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoFacturaPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofacturapuntoventa,new Object(),generalEntityParameterGeneral,this.estadofacturapuntoventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoFacturaPuntoVenta(EstadoFacturaPuntoVentaBean estadofacturapuntoventaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaPuntoVenta.class)) {
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.setFacturaPuntoVentas(estadofacturapuntoventa.getFacturaPuntoVentas());
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoFacturaPuntoVenta(ArrayList<Classe> classes,EstadoFacturaPuntoVentaReturnGeneral estadofacturapuntoventaReturnGeneral,EstadoFacturaPuntoVentaBean estadofacturapuntoventaBean,Boolean conDefault) throws Exception {
		
			this.estadofacturapuntoventaBean.setFacturaPuntoVentas(estadofacturapuntoventaReturnGeneral.getEstadoFacturaPuntoVenta().getFacturaPuntoVentas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaPuntoVenta.class)) {
					estadofacturapuntoventa.setFacturaPuntoVentas(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaLogic.getFacturaPuntoVentas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadofacturapuntoventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta = new EstadoFacturaPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones(),this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta);
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setVisible(false);
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.estadofacturapuntoventaLogic=this.estadofacturapuntoventaLogic;
		
		this.cargarCombosFrameForeignKeyEstadoFacturaPuntoVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoFacturaPuntoVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoFacturaPuntoVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoFacturaPuntoVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoFacturaPuntoVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoFacturaPuntoVenta"));
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonModificarEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarEstadoFacturaPuntoVenta"));

		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonModificarToolBarEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoFacturaPuntoVenta"));
					
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemModificarEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoFacturaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonActualizarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarEstadoFacturaPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonActualizarToolBarEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoFacturaPuntoVenta"));
						
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemActualizarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoFacturaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonEliminarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarEstadoFacturaPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonEliminarToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoFacturaPuntoVenta"));
								
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemEliminarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoFacturaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonCancelarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarEstadoFacturaPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonCancelarToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoFacturaPuntoVenta"));
					
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemCancelarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoFacturaPuntoVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemDetalleCerrarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoFacturaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonGuardarCambiosToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoFacturaPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonGuardarCambiosToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoFacturaPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoFacturaPuntoVenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonidEstadoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonnombreEstadoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoFacturaPuntoVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoFacturaPuntoVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoFacturaPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoFacturaPuntoVenta"));
		}
		
		this.jTableDatosEstadoFacturaPuntoVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoFacturaPuntoVenta"));
		
		this.jTableDatosEstadoFacturaPuntoVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoFacturaPuntoVenta"));
		
		this.jButtonNuevoEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoEstadoFacturaPuntoVenta"));
		
		this.jButtonDuplicarEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarEstadoFacturaPuntoVenta"));
		
		this.jButtonCopiarEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"CopiarEstadoFacturaPuntoVenta"));
		
		this.jButtonVerFormEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"VerFormEstadoFacturaPuntoVenta"));
		
		
		this.jButtonNuevoToolBarEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoFacturaPuntoVenta"));
			
		this.jButtonDuplicarToolBarEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoFacturaPuntoVenta"));
			
		this.jMenuItemNuevoEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoFacturaPuntoVenta"));
			
		this.jMenuItemDuplicarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoFacturaPuntoVenta"));		
		
		
		this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoFacturaPuntoVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoFacturaPuntoVenta"));
			
		this.jMenuItemNuevoRelacionesEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoFacturaPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonModificarEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarEstadoFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonModificarToolBarEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoFacturaPuntoVenta"));
			
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemModificarEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoFacturaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonActualizarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarEstadoFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonActualizarToolBarEstadoFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoFacturaPuntoVenta"));
				
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemActualizarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoFacturaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonEliminarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarEstadoFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonEliminarToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoFacturaPuntoVenta"));
						
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemEliminarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoFacturaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonCancelarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarEstadoFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonCancelarToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoFacturaPuntoVenta"));
			
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemCancelarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoFacturaPuntoVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoFacturaPuntoVenta"));		
		
		
		this.jButtonCerrarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarEstadoFacturaPuntoVenta"));
		
		
		this.jButtonCerrarToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoFacturaPuntoVenta"));
			
		this.jMenuItemCerrarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoFacturaPuntoVenta"));
			
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jMenuItemDetalleCerrarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoFacturaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonGuardarCambiosEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonGuardarCambiosToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoFacturaPuntoVenta"));
		}
		
		this.jButtonCopiarToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoFacturaPuntoVenta"));
			
		this.jButtonVerFormToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoFacturaPuntoVenta"));
		
		this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoFacturaPuntoVenta"));
			
		this.jMenuItemCopiarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoFacturaPuntoVenta"));		
		
		this.jMenuItemVerFormEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoFacturaPuntoVenta"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoFacturaPuntoVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoFacturaPuntoVenta"));
			
		this.jMenuItemGuardarCambiosTablaEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoFacturaPuntoVenta"));		
		
		
		
		this.jButtonRecargarInformacionEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoFacturaPuntoVenta"));
					
		this.jButtonRecargarInformacionToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoFacturaPuntoVenta"));
		
		this.jMenuItemRecargarInformacionEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoFacturaPuntoVenta"));		
		
		
		
		this.jButtonAnterioresEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresEstadoFacturaPuntoVenta"));
		
		
		this.jButtonAnterioresToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoFacturaPuntoVenta"));
		
		this.jMenuItemAnterioresEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoFacturaPuntoVenta"));		
		
		
		this.jButtonSiguientesEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesEstadoFacturaPuntoVenta"));
		
		
		this.jButtonSiguientesToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoFacturaPuntoVenta"));
			
		this.jMenuItemSiguientesEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoFacturaPuntoVenta"));
			
		this.jMenuItemAbrirOrderByEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoFacturaPuntoVenta"));
			
		this.jMenuItemMostrarOcultarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoFacturaPuntoVenta"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoFacturaPuntoVenta"));
			
		this.jMenuItemDetalleMostarOcultarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoFacturaPuntoVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoFacturaPuntoVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoFacturaPuntoVenta"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoFacturaPuntoVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoFacturaPuntoVenta"));

		this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoFacturaPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoFacturaPuntoVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoFacturaPuntoVenta"));
			
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoFacturaPuntoVenta"));
					
		this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoFacturaPuntoVenta"));
			
		this.jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoFacturaPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonidEstadoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonnombreEstadoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoFacturaPuntoVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoFacturaPuntoVenta"));
				this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoFacturaPuntoVenta"));
				this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoFacturaPuntoVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoFacturaPuntoVenta"));				
			//this.jButtonGenerarReporteDinamicoEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoFacturaPuntoVenta"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoFacturaPuntoVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoFacturaPuntoVenta!=null) {
				this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoFacturaPuntoVenta"));
				this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoFacturaPuntoVenta"));
				this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoFacturaPuntoVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoFacturaPuntoVenta"));
			
			this.jButtonAbrirOrderByToolBarEstadoFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoFacturaPuntoVenta"));			
			
			if(this.jInternalFrameOrderByEstadoFacturaPuntoVenta!=null) {
				this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoFacturaPuntoVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoFacturaPuntoVenta"));
		
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
            		closingInternalFrameEstadoFacturaPuntoVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoFacturaPuntoVenta = (JInternalFrameBase)event.getSource();
	            	
	            EstadoFacturaPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(EstadoFacturaPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoFacturaPuntoVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoFacturaPuntoVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoFacturaPuntoVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoFacturaPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoFacturaPuntoVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoFacturaPuntoVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoEstadoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoFacturaPuntoVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoFacturaPuntoVenta";
		inputMap = this.jButtonModificarEstadoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoFacturaPuntoVenta";
		inputMap = this.jButtonActualizarEstadoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoFacturaPuntoVenta";
		inputMap = this.jButtonEliminarEstadoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoFacturaPuntoVenta";
		inputMap = this.jButtonCancelarEstadoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoFacturaPuntoVenta";
		inputMap = this.jButtonCerrarEstadoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonGuardarCambiosEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoFacturaPuntoVenta";
		inputMap = this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonGuardarCambiosEstadoFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonGuardarCambiosEstadoFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoFacturaPuntoVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoFacturaPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoFacturaPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoFacturaPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonidEstadoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jButtonnombreEstadoFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoFacturaPuntoVentaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoFacturaPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoFacturaPuntoVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas()) {
					estadofacturapuntoventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:estadofacturapuntoventas) {
					estadofacturapuntoventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoFacturaPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas()) {
						estadofacturapuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:estadofacturapuntoventas) {
						estadofacturapuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:estadofacturapuntoventas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoFacturaPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoFacturaPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoFacturaPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoFacturaPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoFacturaPuntoVenta.getSelectedRows();
			
			EstadoFacturaPuntoVenta estadofacturapuntoventaLocal=new EstadoFacturaPuntoVenta();
			
			//this.seleccionarTodosEstadoFacturaPuntoVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadofacturapuntoventaLocal =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadofacturapuntoventaLocal =(EstadoFacturaPuntoVenta) this.estadofacturapuntoventas.toArray()[this.jTableDatosEstadoFacturaPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadofacturapuntoventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas()) {
						estadofacturapuntoventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:estadofacturapuntoventas) {
						estadofacturapuntoventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoFacturaPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoFacturaPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoFacturaPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoFacturaPuntoVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoFacturaPuntoVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoFacturaPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas()) {
				
						if(sTipoSeleccionar.equals(EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadofacturapuntoventaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:estadofacturapuntoventas) {
					
						if(sTipoSeleccionar.equals(EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadofacturapuntoventaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoFacturaPuntoVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoFacturaPuntoVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoFacturaPuntoVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoFacturaPuntoVenta(conSplash);
				
					this.generarReporteEstadoFacturaPuntoVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoFacturaPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoFacturaPuntoVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoFacturaPuntoVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoFacturaPuntoVenta();
				
				this.exportarEstadoFacturaPuntoVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoFacturaPuntoVentas();
				//this.importarEstadoFacturaPuntoVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoFacturaPuntoVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoFacturaPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoFacturaPuntoVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoFacturaPuntoVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoFacturaPuntoVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Factura",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoFacturaPuntoVenta();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoFacturaPuntoVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoFacturaPuntoVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoFacturaPuntoVenta();
			
			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();		
			EstadoFacturaPuntoVenta estadofacturapuntoventa=new EstadoFacturaPuntoVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta.getSelectedItem();
			
			
			
			
			estadofacturapuntoventasSeleccionados=this.getEstadoFacturaPuntoVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadofacturapuntoventasSeleccionados.size()==1) {
				for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:estadofacturapuntoventasSeleccionados) {
					estadofacturapuntoventa=estadofacturapuntoventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Factura Punto Venta")) {
					jButtonFacturaPuntoVentaActionPerformed(null,rowIndex,true,false,estadofacturapuntoventa);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoFacturaPuntoVenta();
			
      		//this.finishProcessEstadoFacturaPuntoVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoFacturaPuntoVentaReturnGeneral() throws Exception {
		if(this.estadofacturapuntoventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadofacturapuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadofacturapuntoventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadofacturapuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadofacturapuntoventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadofacturapuntoventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false);
		}
		
		if(this.estadofacturapuntoventaReturnGeneral.getConRetornoLista() || this.estadofacturapuntoventaReturnGeneral.getConRetornoObjeto()) {
			if(this.estadofacturapuntoventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadofacturapuntoventaLogic.setEstadoFacturaPuntoVentas(this.estadofacturapuntoventaReturnGeneral.getEstadoFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadofacturapuntoventaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadofacturapuntoventaLogic.setEstadoFacturaPuntoVenta(this.estadofacturapuntoventaReturnGeneral.getEstadoFacturaPuntoVenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoFacturaPuntoVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoFacturaPuntoVenta() throws Exception {
		
		
	}
	
	public ArrayList<EstadoFacturaPuntoVenta> getEstadoFacturaPuntoVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoFacturaPuntoVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas()) {
					if(estadofacturapuntoventaAux.getIsSelected()) {
						estadofacturapuntoventasSeleccionados.add(estadofacturapuntoventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:this.estadofacturapuntoventas) {
					if(estadofacturapuntoventaAux.getIsSelected()) {
						estadofacturapuntoventasSeleccionados.add(estadofacturapuntoventaAux);				
					}
				}
			}
			
			if(estadofacturapuntoventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadofacturapuntoventasSeleccionados.addAll(this.estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadofacturapuntoventasSeleccionados.addAll(this.estadofacturapuntoventas);				
					}
				}
			}
		} else {
			estadofacturapuntoventasSeleccionados.add(this.estadofacturapuntoventa);
		}
		
		return estadofacturapuntoventasSeleccionados;
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
	
	public void generarReporteEstadoFacturaPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoFacturaPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoFacturaPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoFacturaPuntoVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoFacturaPuntoVentasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoFacturaPuntoVentasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();		
		
		estadofacturapuntoventasSeleccionados=this.getEstadoFacturaPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoFacturaPuntoVentas("Todos",estadofacturapuntoventasSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();		
		
		estadofacturapuntoventasSeleccionados=this.getEstadoFacturaPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoFacturaPuntoVentas("Todos",estadofacturapuntoventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoFacturaPuntoVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();
		
		estadofacturapuntoventasSeleccionados=this.getEstadoFacturaPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoFacturaPuntoVentas("Todos",estadofacturapuntoventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoFacturaPuntoVenta();
		
		
		estadofacturapuntoventasSeleccionados=this.getEstadoFacturaPuntoVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoFacturaPuntoVenta();
		
		
		//this.generarReporteEstadoFacturaPuntoVentas("Todos",estadofacturapuntoventasSeleccionados ,estadofacturapuntoventaImplementable,estadofacturapuntoventaImplementableHome);
	}
	
	public void mostrarImportacionEstadoFacturaPuntoVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoFacturaPuntoVenta();
		
		this.abrirFrameImportacionEstadoFacturaPuntoVenta();		
		
			
		//this.generarReporteEstadoFacturaPuntoVentas("Todos",estadofacturapuntoventasSeleccionados ,estadofacturapuntoventaImplementable,estadofacturapuntoventaImplementableHome);
	}
	
	public void importarEstadoFacturaPuntoVentas() throws Exception {		
	
	}
	
	public void exportarEstadoFacturaPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoFacturaPuntoVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoFacturaPuntoVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoFacturaPuntoVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();		
		
		estadofacturapuntoventasSeleccionados=this.getEstadoFacturaPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofacturapuntoventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoFacturaPuntoVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:estadofacturapuntoventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoFacturaPuntoVenta(estadofacturapuntoventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadofacturapuntoventaAux.setsDetalleGeneralEntityReporte(estadofacturapuntoventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoFacturaPuntoVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoFacturaPuntoVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoFacturaPuntoVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadofacturapuntoventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadofacturapuntoventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadofacturapuntoventa.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();		
		
		estadofacturapuntoventasSeleccionados=this.getEstadoFacturaPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofacturapuntoventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoFacturaPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoFacturaPuntoVenta(row);				
				iRow++;
			}				
			
			for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:estadofacturapuntoventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoFacturaPuntoVenta(estadofacturapuntoventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();		
		
		estadofacturapuntoventasSeleccionados=this.getEstadoFacturaPuntoVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofacturapuntoventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadofacturapuntoventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadofacturapuntoventa");
			//elementRoot.appendChild(element);
		
			for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:estadofacturapuntoventasSeleccionados) {
				element = document.createElement("estadofacturapuntoventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoFacturaPuntoVenta(estadofacturapuntoventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoFacturaPuntoVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFacturaPuntoVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFacturaPuntoVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadofacturapuntoventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadofacturapuntoventa.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoFacturaPuntoVenta(EstadoFacturaPuntoVenta estadofacturapuntoventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoFacturaPuntoVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadofacturapuntoventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoFacturaPuntoVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadofacturapuntoventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(EstadoFacturaPuntoVentaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadofacturapuntoventa.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoFacturaPuntoVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados=new ArrayList<EstadoFacturaPuntoVenta>();
		
		estadofacturapuntoventasSeleccionados=this.getEstadoFacturaPuntoVentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoFacturaPuntoVenta(estadofacturapuntoventasSeleccionados);
		
		this.generarReporteEstadoFacturaPuntoVentas("Todos",estadofacturapuntoventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoFacturaPuntoVenta(ArrayList<EstadoFacturaPuntoVenta> estadofacturapuntoventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoFacturaPuntoVenta estadofacturapuntoventaAux:estadofacturapuntoventasSeleccionados) {
				estadofacturapuntoventaAux.setsDetalleGeneralEntityReporte(estadofacturapuntoventaAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadofacturapuntoventaAux.setsDescripcionGeneralEntityReporte1(estadofacturapuntoventaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoFacturaPuntoVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarEstadoFacturaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFacturaPuntoVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=true;
		} else {
			this.actualizarEstadoPanelsEstadoFacturaPuntoVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoFacturaPuntoVenta=false;
			//this.isVisibilidadCeldaVerFormEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarEstadoFacturaPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=false;												
			}
			
			this.jButtonCerrarEstadoFacturaPuntoVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoFacturaPuntoVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.estadofacturapuntoventa)) {
			this.isVisibilidadCeldaActualizarEstadoFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarEstadoFacturaPuntoVenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoFacturaPuntoVenta() {
		this.isVisibilidadCeldaNuevoEstadoFacturaPuntoVenta=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoFacturaPuntoVenta=false;
	}
	
	public void actualizarEstadoPanelsEstadoFacturaPuntoVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEstadoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionEstadoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesEstadoFacturaPuntoVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEstadoFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionEstadoFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesEstadoFacturaPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEstadoFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionEstadoFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesEstadoFacturaPuntoVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEstadoFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionEstadoFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesEstadoFacturaPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEstadoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionEstadoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesEstadoFacturaPuntoVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEstadoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionEstadoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesEstadoFacturaPuntoVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEstadoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFacturaPuntoVenta!=null) {
				this.jPanelPaginacionEstadoFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesEstadoFacturaPuntoVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoFacturaPuntoVentaParaFacturaPuntoVentas() throws Exception {
		Boolean isPaginaPopupFacturaPuntoVenta=false;

		try {

			if(this.estadofacturapuntoventaSessionBean==null) {
				this.estadofacturapuntoventaSessionBean=new EstadoFacturaPuntoVentaSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaSessionBean=new FacturaPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaSessionBean.setsPathNavegacionActual(estadofacturapuntoventaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFacturaPuntoVenta=this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFacturaPuntoVenta(true);
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaPuntoVenta(EstadoFacturaPuntoVentaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoFacturaPuntoVenta(true);
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.facturapuntoventaSessionBean.setlidEstadoFacturaPuntoVentaActual(this.idEstadoFacturaPuntoVentaActual);

			estadofacturapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoFacturaPuntoVenta(true);
			estadofacturapuntoventaSessionBean.setlIdEstadoFacturaPuntoVentaActualForeignKey(this.idEstadoFacturaPuntoVentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoFacturaPuntoVentaSessionBean estadofacturapuntoventaSessionBean=new EstadoFacturaPuntoVentaSessionBean();
		
		if(this.estadofacturapuntoventaSessionBean==null) {
			this.estadofacturapuntoventaSessionBean=new EstadoFacturaPuntoVentaSessionBean();
		}
		
		this.estadofacturapuntoventaSessionBean.setsUltimaBusquedaEstadoFacturaPuntoVenta(this.getsAccionBusqueda());
		this.estadofacturapuntoventaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadofacturapuntoventaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoFacturaPuntoVentaSessionBean estadofacturapuntoventaSessionBean=new EstadoFacturaPuntoVentaSessionBean();
		
		if(this.estadofacturapuntoventaSessionBean==null) {
			this.estadofacturapuntoventaSessionBean=new EstadoFacturaPuntoVentaSessionBean();
		}
		
		if(this.estadofacturapuntoventaSessionBean.getsUltimaBusquedaEstadoFacturaPuntoVenta()!=null&&!this.estadofacturapuntoventaSessionBean.getsUltimaBusquedaEstadoFacturaPuntoVenta().equals("")) {
			this.setsAccionBusqueda(estadofacturapuntoventaSessionBean.getsUltimaBusquedaEstadoFacturaPuntoVenta());
			this.setiNumeroPaginacion(estadofacturapuntoventaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadofacturapuntoventaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadofacturapuntoventaSessionBean.setsUltimaBusquedaEstadoFacturaPuntoVenta("");
		this.estadofacturapuntoventaSessionBean.setiNumeroPaginacion(EstadoFacturaPuntoVentaConstantesFunciones.INUMEROPAGINACION);
		this.estadofacturapuntoventaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoFacturaPuntoVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoFacturaPuntoVenta() {
		this.updateBorderResaltarBusquedasFormularioEstadoFacturaPuntoVenta();
		this.updateVisibilidadBusquedasFormularioEstadoFacturaPuntoVenta();
		this.updateHabilitarBusquedasFormularioEstadoFacturaPuntoVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoFacturaPuntoVenta() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoFacturaPuntoVenta() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoFacturaPuntoVenta() {
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
	
	public void updateControlesFormularioEstadoFacturaPuntoVenta() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoFacturaPuntoVenta();
		this.updateVisibilidadResaltarControlesFormularioEstadoFacturaPuntoVenta();
		this.updateHabilitarResaltarControlesFormularioEstadoFacturaPuntoVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoFacturaPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadofacturapuntoventaConstantesFunciones.resaltaridEstadoFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextFieldidEstadoFacturaPuntoVenta.setBorder(this.estadofacturapuntoventaConstantesFunciones.resaltaridEstadoFacturaPuntoVenta);}
		if(this.estadofacturapuntoventaConstantesFunciones.resaltarnombreEstadoFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextAreanombreEstadoFacturaPuntoVenta.setBorder(this.estadofacturapuntoventaConstantesFunciones.resaltarnombreEstadoFacturaPuntoVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoFacturaPuntoVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
	
		//this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextFieldidEstadoFacturaPuntoVenta.setVisible(this.estadofacturapuntoventaConstantesFunciones.mostraridEstadoFacturaPuntoVenta);
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jPanelidEstadoFacturaPuntoVenta.setVisible(this.estadofacturapuntoventaConstantesFunciones.mostraridEstadoFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextAreanombreEstadoFacturaPuntoVenta.setVisible(this.estadofacturapuntoventaConstantesFunciones.mostrarnombreEstadoFacturaPuntoVenta);
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jPanelnombreEstadoFacturaPuntoVenta.setVisible(this.estadofacturapuntoventaConstantesFunciones.mostrarnombreEstadoFacturaPuntoVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoFacturaPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta!=null) {
	
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextFieldidEstadoFacturaPuntoVenta.setEnabled(this.estadofacturapuntoventaConstantesFunciones.activaridEstadoFacturaPuntoVenta);
		this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta.jTextAreanombreEstadoFacturaPuntoVenta.setEnabled(this.estadofacturapuntoventaConstantesFunciones.activarnombreEstadoFacturaPuntoVenta);
		}
	}
	
		
}