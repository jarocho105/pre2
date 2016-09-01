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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.TipoProductoServicioConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoProductoServicioParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoProductoServicioParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoProductoServicioBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoProductoServicioBeanSwingJInternalFrame extends TipoProductoServicioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoProductoServicioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoProductoServicio> tipoproductoservicioValidator = new ClassValidator<TipoProductoServicio>(TipoProductoServicio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoProductoServicio tipoproductoservicio;	
	public TipoProductoServicio tipoproductoservicioAux;
	public TipoProductoServicio tipoproductoservicioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoProductoServicio tipoproductoservicioTotales;
	public Long idTipoProductoServicioActual;
	public Long iIdNuevoTipoProductoServicio=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosCuentaContableTipo=false;

	public Boolean getIsTienePermisosCuentaContableTipo() {
		return isTienePermisosCuentaContableTipo;
	}

	public void setIsTienePermisosCuentaContableTipo(Boolean isTienePermisosCuentaContableTipo) {
		this.isTienePermisosCuentaContableTipo= isTienePermisosCuentaContableTipo;
	}


	public Boolean isTienePermisosParametroInventarioDefecto=false;

	public Boolean getIsTienePermisosParametroInventarioDefecto() {
		return isTienePermisosParametroInventarioDefecto;
	}

	public void setIsTienePermisosParametroInventarioDefecto(Boolean isTienePermisosParametroInventarioDefecto) {
		this.isTienePermisosParametroInventarioDefecto= isTienePermisosParametroInventarioDefecto;
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
	
	public Boolean isPermisoTodoTipoProductoServicio;
	public Boolean isPermisoNuevoTipoProductoServicio;
	public Boolean isPermisoActualizarTipoProductoServicio;
	public Boolean isPermisoActualizarOriginalTipoProductoServicio;
	public Boolean isPermisoEliminarTipoProductoServicio;
	public Boolean isPermisoGuardarCambiosTipoProductoServicio;
	public Boolean isPermisoConsultaTipoProductoServicio;
	public Boolean isPermisoBusquedaTipoProductoServicio;
	public Boolean isPermisoReporteTipoProductoServicio;
	public Boolean isPermisoPaginacionMedioTipoProductoServicio;
	public Boolean isPermisoPaginacionAltoTipoProductoServicio;
	public Boolean isPermisoPaginacionTodoTipoProductoServicio;
	public Boolean isPermisoCopiarTipoProductoServicio;
	public Boolean isPermisoVerFormTipoProductoServicio;
	public Boolean isPermisoDuplicarTipoProductoServicio;
	public Boolean isPermisoOrdenTipoProductoServicio;
	
	
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
	
	public TipoProductoServicioParameterReturnGeneral tipoproductoservicioReturnGeneral;
	public TipoProductoServicioParameterReturnGeneral tipoproductoservicioParameterGeneral;
	
	

	public CuentaContableTipoLogic cuentacontabletipoLogic=null;

	public CuentaContableTipoLogic getCuentaContableTipoLogic() {
		return cuentacontabletipoLogic;
	}

	public void setCuentaContableTipoLogic(CuentaContableTipoLogic cuentacontabletipoLogic) {
		this.cuentacontabletipoLogic = cuentacontabletipoLogic;
	}


	public ParametroInventarioDefectoLogic parametroinventariodefectoLogic=null;

	public ParametroInventarioDefectoLogic getParametroInventarioDefectoLogic() {
		return parametroinventariodefectoLogic;
	}

	public void setParametroInventarioDefectoLogic(ParametroInventarioDefectoLogic parametroinventariodefectoLogic) {
		this.parametroinventariodefectoLogic = parametroinventariodefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoProductoServicio=false;
	public Boolean esParaAccionDesdeFormularioTipoProductoServicio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoProductoServicioLogic tipoproductoservicioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoProductoServicio tipoproductoservicioBean;
	public TipoProductoServicioConstantesFunciones tipoproductoservicioConstantesFunciones;
	//public TipoProductoServicioParameterReturnGeneral tipoproductoservicioReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoProductoServicio> tipoproductoservicios;	
	//public List<TipoProductoServicio> tipoproductoserviciosEliminados;
	//public List<TipoProductoServicio> tipoproductoserviciosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoProductoServicio=false;
	public Boolean isVisibilidadCeldaDuplicarTipoProductoServicio=true;
	public Boolean isVisibilidadCeldaCopiarTipoProductoServicio=true;
	public Boolean isVisibilidadCeldaVerFormTipoProductoServicio=true;
	public Boolean isVisibilidadCeldaOrdenTipoProductoServicio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=false;
	public Boolean isVisibilidadCeldaModificarTipoProductoServicio=false;
	public Boolean isVisibilidadCeldaActualizarTipoProductoServicio=false;
	public Boolean isVisibilidadCeldaEliminarTipoProductoServicio=false;
	public Boolean isVisibilidadCeldaCancelarTipoProductoServicio=false;
	public Boolean isVisibilidadCeldaGuardarTipoProductoServicio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoProductoServicio=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoProductoServicio() {
		return this.iIdNuevoTipoProductoServicio;
	}

	public void setiIdNuevoTipoProductoServicio(Long iIdNuevoTipoProductoServicio) {
		this.iIdNuevoTipoProductoServicio = iIdNuevoTipoProductoServicio;
	}
	
	public Long getidTipoProductoServicioActual() {
		return this.idTipoProductoServicioActual;
	}

	public void setidTipoProductoServicioActual(Long idTipoProductoServicioActual) {
		this.idTipoProductoServicioActual = idTipoProductoServicioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoProductoServicio gettipoproductoservicio() {
		return this.tipoproductoservicio;
	}

	public void settipoproductoservicio(TipoProductoServicio tipoproductoservicio) {
		this.tipoproductoservicio = tipoproductoservicio;
	}
	
	public TipoProductoServicio gettipoproductoservicioAux() {
		return this.tipoproductoservicioAux;
	}

	public void settipoproductoservicioAux(TipoProductoServicio tipoproductoservicioAux) {
		this.tipoproductoservicioAux = tipoproductoservicioAux;
	}				
	
	public TipoProductoServicio gettipoproductoservicioAnterior() {
		return this.tipoproductoservicioAnterior;
	}

	public void settipoproductoservicioAnterior(TipoProductoServicio tipoproductoservicioAnterior) {
		this.tipoproductoservicioAnterior = tipoproductoservicioAnterior;
	}	
	
	public TipoProductoServicio gettipoproductoservicioTotales() {
		return this.tipoproductoservicioTotales;
	}

	public void settipoproductoservicioTotales(TipoProductoServicio tipoproductoservicioTotales) {
		this.tipoproductoservicioTotales = tipoproductoservicioTotales;
	}	
	
	public TipoProductoServicio gettipoproductoservicioBean() {
		return this.tipoproductoservicioBean;
	}

	public void settipoproductoservicioBean(TipoProductoServicio tipoproductoservicioBean) {
		this.tipoproductoservicioBean = tipoproductoservicioBean;
	}	
	
	public TipoProductoServicioParameterReturnGeneral gettipoproductoservicioReturnGeneral() {
		return this.tipoproductoservicioReturnGeneral;
	}

	public void settipoproductoservicioReturnGeneral(TipoProductoServicioParameterReturnGeneral tipoproductoservicioReturnGeneral) {
		this.tipoproductoservicioReturnGeneral = tipoproductoservicioReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoProductoServicioLogic getTipoProductoServicioLogic()	{		
		return tipoproductoservicioLogic;
	}

	public void setTipoProductoServicioLogic(TipoProductoServicioLogic tipoproductoservicioLogic) {
		this.tipoproductoservicioLogic = tipoproductoservicioLogic;
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
	
	public Boolean getIsEsNuevoTipoProductoServicio() {
		return isEsNuevoTipoProductoServicio;
	}

	public void setIsEsNuevoTipoProductoServicio(Boolean isEsNuevoTipoProductoServicio) {
		this.isEsNuevoTipoProductoServicio = isEsNuevoTipoProductoServicio;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoProductoServicio() {
		return esParaAccionDesdeFormularioTipoProductoServicio;
	}
	
	public void setEsParaAccionDesdeFormularioTipoProductoServicio(Boolean esParaAccionDesdeFormularioTipoProductoServicio) {
		this.esParaAccionDesdeFormularioTipoProductoServicio = esParaAccionDesdeFormularioTipoProductoServicio;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoProductoServicio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoProductoServicioConstantesFunciones.refrescarForeignKeysDescripcionesTipoProductoServicio(this.tipoproductoservicioLogic.getTipoProductoServicios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoProductoServicioConstantesFunciones.refrescarForeignKeysDescripcionesTipoProductoServicio(this.tipoproductoservicios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoproductoservicioLogic.setTipoProductoServicios(this.tipoproductoservicios);
			tipoproductoservicioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoProductoServicioParameterReturnGeneral getTipoProductoServicioParameterGeneral() {
		return this.tipoproductoservicioParameterGeneral;
	}
	
	public void setTipoProductoServicioParameterGeneral(TipoProductoServicioParameterReturnGeneral tipoproductoservicioParameterGeneral) {
		this.tipoproductoservicioParameterGeneral = tipoproductoservicioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoProductoServicio() {
		return isPermisoTodoTipoProductoServicio;
	}

	public void setIsPermisoTodoTipoProductoServicio(Boolean isPermisoTodoTipoProductoServicio) {
		this.isPermisoTodoTipoProductoServicio = isPermisoTodoTipoProductoServicio;
	}

	public Boolean getIsPermisoNuevoTipoProductoServicio() {
		return isPermisoNuevoTipoProductoServicio;
	}

	public void setIsPermisoNuevoTipoProductoServicio(Boolean isPermisoNuevoTipoProductoServicio) {
		this.isPermisoNuevoTipoProductoServicio = isPermisoNuevoTipoProductoServicio;
	}

	public Boolean getIsPermisoActualizarTipoProductoServicio() {
		return isPermisoActualizarTipoProductoServicio;
	}

	public void setIsPermisoActualizarTipoProductoServicio(Boolean isPermisoActualizarTipoProductoServicio) {
		this.isPermisoActualizarTipoProductoServicio = isPermisoActualizarTipoProductoServicio;
	}

	public Boolean getIsPermisoEliminarTipoProductoServicio() {
		return isPermisoEliminarTipoProductoServicio;
	}

	public void setIsPermisoEliminarTipoProductoServicio(Boolean isPermisoEliminarTipoProductoServicio) {
		this.isPermisoEliminarTipoProductoServicio = isPermisoEliminarTipoProductoServicio;
	}

	public Boolean getIsPermisoGuardarCambiosTipoProductoServicio() {
		return isPermisoGuardarCambiosTipoProductoServicio;
	}

	public void setIsPermisoGuardarCambiosTipoProductoServicio(Boolean isPermisoGuardarCambiosTipoProductoServicio) {
		this.isPermisoGuardarCambiosTipoProductoServicio = isPermisoGuardarCambiosTipoProductoServicio;
	}
	
	public Boolean getIsPermisoConsultaTipoProductoServicio() {
		return isPermisoConsultaTipoProductoServicio;
	}

	public void setIsPermisoConsultaTipoProductoServicio(Boolean isPermisoConsultaTipoProductoServicio) {
		this.isPermisoConsultaTipoProductoServicio = isPermisoConsultaTipoProductoServicio;
	}

	public Boolean getIsPermisoBusquedaTipoProductoServicio() {
		return isPermisoBusquedaTipoProductoServicio;
	}

	public void setIsPermisoBusquedaTipoProductoServicio(Boolean isPermisoBusquedaTipoProductoServicio) {
		this.isPermisoBusquedaTipoProductoServicio = isPermisoBusquedaTipoProductoServicio;
	}

	public Boolean getIsPermisoReporteTipoProductoServicio() {
		return isPermisoReporteTipoProductoServicio;
	}

	public void setIsPermisoReporteTipoProductoServicio(Boolean isPermisoReporteTipoProductoServicio) {
		this.isPermisoReporteTipoProductoServicio = isPermisoReporteTipoProductoServicio;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoProductoServicio() {
		return isPermisoPaginacionMedioTipoProductoServicio;
	}

	public void setIsPermisoPaginacionMedioTipoProductoServicio(Boolean isPermisoPaginacionMedioTipoProductoServicio) {
		this.isPermisoPaginacionMedioTipoProductoServicio = isPermisoPaginacionMedioTipoProductoServicio;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoProductoServicio() {
		return isPermisoPaginacionTodoTipoProductoServicio;
	}

	public void setIsPermisoPaginacionTodoTipoProductoServicio(Boolean isPermisoPaginacionTodoTipoProductoServicio) {
		this.isPermisoPaginacionTodoTipoProductoServicio = isPermisoPaginacionTodoTipoProductoServicio;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoProductoServicio() {
		return isPermisoPaginacionAltoTipoProductoServicio;
	}

	public void setIsPermisoPaginacionAltoTipoProductoServicio(Boolean isPermisoPaginacionAltoTipoProductoServicio) {
		this.isPermisoPaginacionAltoTipoProductoServicio = isPermisoPaginacionAltoTipoProductoServicio;
	}
	
	public Boolean getIsPermisoCopiarTipoProductoServicio() {
		return isPermisoCopiarTipoProductoServicio;
	}

	public void setIsPermisoCopiarTipoProductoServicio(Boolean isPermisoCopiarTipoProductoServicio) {
		this.isPermisoCopiarTipoProductoServicio = isPermisoCopiarTipoProductoServicio;
	}
	
	public Boolean getIsPermisoVerFormTipoProductoServicio() {
		return isPermisoVerFormTipoProductoServicio;
	}

	public void setIsPermisoVerFormTipoProductoServicio(Boolean isPermisoVerFormTipoProductoServicio) {
		this.isPermisoVerFormTipoProductoServicio = isPermisoVerFormTipoProductoServicio;
	}
	
	public Boolean getIsPermisoDuplicarTipoProductoServicio() {
		return isPermisoDuplicarTipoProductoServicio;
	}

	public void setIsPermisoDuplicarTipoProductoServicio(Boolean isPermisoDuplicarTipoProductoServicio) {
		this.isPermisoDuplicarTipoProductoServicio = isPermisoDuplicarTipoProductoServicio;
	}
	
	public Boolean getIsPermisoOrdenTipoProductoServicio() {
		return isPermisoOrdenTipoProductoServicio;
	}

	public void setIsPermisoOrdenTipoProductoServicio(Boolean isPermisoOrdenTipoProductoServicio) {
		this.isPermisoOrdenTipoProductoServicio = isPermisoOrdenTipoProductoServicio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoProductoServicio() {
		return isVisibilidadCeldaNuevoTipoProductoServicio;
	}

	public void setIsVisibilidadCeldaNuevoTipoProductoServicio(Boolean isVisibilidadCeldaNuevoTipoProductoServicio) {
		this.isVisibilidadCeldaNuevoTipoProductoServicio = isVisibilidadCeldaNuevoTipoProductoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoProductoServicio() {
		return isVisibilidadCeldaDuplicarTipoProductoServicio;
	}

	public void setIsVisibilidadCeldaDuplicarTipoProductoServicio(Boolean isVisibilidadCeldaDuplicarTipoProductoServicio) {
		this.isVisibilidadCeldaDuplicarTipoProductoServicio = isVisibilidadCeldaDuplicarTipoProductoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoProductoServicio() {
		return isVisibilidadCeldaCopiarTipoProductoServicio;
	}

	public void setIsVisibilidadCeldaCopiarTipoProductoServicio(Boolean isVisibilidadCeldaCopiarTipoProductoServicio) {
		this.isVisibilidadCeldaCopiarTipoProductoServicio = isVisibilidadCeldaCopiarTipoProductoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoProductoServicio() {
		return isVisibilidadCeldaVerFormTipoProductoServicio;
	}

	public void setIsVisibilidadCeldaVerFormTipoProductoServicio(Boolean isVisibilidadCeldaVerFormTipoProductoServicio) {
		this.isVisibilidadCeldaVerFormTipoProductoServicio = isVisibilidadCeldaVerFormTipoProductoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoProductoServicio() {
		return isVisibilidadCeldaOrdenTipoProductoServicio;
	}

	public void setIsVisibilidadCeldaOrdenTipoProductoServicio(Boolean isVisibilidadCeldaOrdenTipoProductoServicio) {
		this.isVisibilidadCeldaOrdenTipoProductoServicio = isVisibilidadCeldaOrdenTipoProductoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoProductoServicio() {
		return isVisibilidadCeldaNuevoRelacionesTipoProductoServicio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoProductoServicio(Boolean isVisibilidadCeldaNuevoRelacionesTipoProductoServicio) {
		this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio = isVisibilidadCeldaNuevoRelacionesTipoProductoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoProductoServicio() {
		return isVisibilidadCeldaModificarTipoProductoServicio;
	}

	public void setIsVisibilidadCeldaModificarTipoProductoServicio(Boolean isVisibilidadCeldaModificarTipoProductoServicio) {
		this.isVisibilidadCeldaModificarTipoProductoServicio = isVisibilidadCeldaModificarTipoProductoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoProductoServicio() {
		return isVisibilidadCeldaActualizarTipoProductoServicio;
	}

	public void setIsVisibilidadCeldaActualizarTipoProductoServicio(Boolean isVisibilidadCeldaActualizarTipoProductoServicio) {
		this.isVisibilidadCeldaActualizarTipoProductoServicio = isVisibilidadCeldaActualizarTipoProductoServicio;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoProductoServicio() {
		return isVisibilidadCeldaEliminarTipoProductoServicio;
	}

	public void setIsVisibilidadCeldaEliminarTipoProductoServicio(Boolean isVisibilidadCeldaEliminarTipoProductoServicio) {
		this.isVisibilidadCeldaEliminarTipoProductoServicio = isVisibilidadCeldaEliminarTipoProductoServicio;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoProductoServicio() {
		return isVisibilidadCeldaCancelarTipoProductoServicio;
	}

	public void setIsVisibilidadCeldaCancelarTipoProductoServicio(Boolean isVisibilidadCeldaCancelarTipoProductoServicio) {
		this.isVisibilidadCeldaCancelarTipoProductoServicio = isVisibilidadCeldaCancelarTipoProductoServicio;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoProductoServicio() {
		return isVisibilidadCeldaGuardarTipoProductoServicio;
	}

	public void setIsVisibilidadCeldaGuardarTipoProductoServicio(Boolean isVisibilidadCeldaGuardarTipoProductoServicio) {
		this.isVisibilidadCeldaGuardarTipoProductoServicio = isVisibilidadCeldaGuardarTipoProductoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoProductoServicio() {
		return isVisibilidadCeldaGuardarCambiosTipoProductoServicio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoProductoServicio(Boolean isVisibilidadCeldaGuardarCambiosTipoProductoServicio) {
		this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio = isVisibilidadCeldaGuardarCambiosTipoProductoServicio;
	}
		
	public TipoProductoServicioSessionBean gettipoproductoservicioSessionBean() {
		return this.tipoproductoservicioSessionBean;
	}
	
	public void settipoproductoservicioSessionBean(TipoProductoServicioSessionBean tipoproductoservicioSessionBean) {
		this.tipoproductoservicioSessionBean=tipoproductoservicioSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(TipoProductoServicio tipoproductoservicio)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoProductoServicio tipoproductoservicio,TipoProductoServicio tipoproductoservicioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoProductoServicio(tipoproductoservicio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoproductoservicioAux.setId(tipoproductoservicio.getId());
		tipoproductoservicioAux.setVersionRow(tipoproductoservicio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoProductoServicio();
		
			int intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoProductoServicio(this.tipoproductoservicio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(this.tipoproductoservicio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoproductoservicioValidator.getInvalidValues(this.tipoproductoservicio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoproductoservicioLogic.setDatosCliente(datosCliente);
			tipoproductoservicioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoproductoservicioAux=new  TipoProductoServicio();
				
				tipoproductoservicioAux.setIsNew(true);
				tipoproductoservicioAux.setIsChanged(true);
				
				tipoproductoservicioAux.setTipoProductoServicioOriginal(this.tipoproductoservicio);
				
				tipoproductoservicioAux.setId(this.tipoproductoservicio.getId());	
				tipoproductoservicioAux.setVersionRow(this.tipoproductoservicio.getVersionRow());	
				tipoproductoservicioAux.setnombre(this.tipoproductoservicio.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoproductoservicioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoproductoservicioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoproductoservicioAux,tipoproductoservicioLogic.getTipoProductoServicios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproductoservicioAux,tipoproductoservicios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoproductoservicioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoservicioLogic.saveTipoProductoServicios();//WithConnection
						//tipoproductoservicioLogic.getSetVersionRowTipoProductoServicios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoproductoservicio,tipoproductoservicioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoproductoservicioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoproductoservicioAux=new  TipoProductoServicio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoproductoservicioSessionBean.getEsGuardarRelacionado() && this.tipoproductoservicio.getId()>=0)) {
						
					tipoproductoservicioAux.setIsNew(false);
				}
				
				tipoproductoservicioAux.setIsDeleted(false);
			
				tipoproductoservicioAux.setId(this.tipoproductoservicio.getId());	
				tipoproductoservicioAux.setVersionRow(this.tipoproductoservicio.getVersionRow());	
				tipoproductoservicioAux.setnombre(this.tipoproductoservicio.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoproductoservicioAux,tipoproductoservicioLogic.getTipoProductoServicios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproductoservicioAux,tipoproductoservicios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoproductoservicioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoservicioLogic.saveTipoProductoServicios();//WithConnection
						//tipoproductoservicioLogic.getSetVersionRowTipoProductoServicios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoproductoservicio,tipoproductoservicioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoproductoservicioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoproductoservicioAux=new  TipoProductoServicio();
				
				tipoproductoservicioAux.setIsNew(false);
				tipoproductoservicioAux.setIsChanged(false);
				
				tipoproductoservicioAux.setIsDeleted(true);
				
				tipoproductoservicioAux.setId(this.tipoproductoservicio.getId());	
				tipoproductoservicioAux.setVersionRow(this.tipoproductoservicio.getVersionRow());	
				tipoproductoservicioAux.setnombre(this.tipoproductoservicio.getnombre());	
				
				if(this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoproductoservicioAux.getId()>=0) {	
						this.tipoproductoserviciosEliminados.add(tipoproductoservicioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoproductoservicioAux,tipoproductoservicioLogic.getTipoProductoServicios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproductoservicioAux,tipoproductoservicios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoproductoservicioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoservicioLogic.saveTipoProductoServicios();//WithConnection
						//tipoproductoservicioLogic.getSetVersionRowTipoProductoServicios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoproductoservicioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoservicioAux.setCuentaContableTipos(this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos());

							if(this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoservicioAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoproductoservicioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoproductoservicioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoproductoservicioAux,tipoproductoservicioLogic.getTipoProductoServicios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoproductoservicioAux,tipoproductoservicios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.getTipoProductoServicios().addAll(this.tipoproductoserviciosEliminados);
					
					tipoproductoservicioLogic.saveTipoProductoServicios();//WithConnection
					//tipoproductoservicioLogic.getSetVersionRowTipoProductoServicios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoproductoserviciosEliminados= new ArrayList<TipoProductoServicio>();		
			}
			
			if(this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Producto Servicio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Producto Servicio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoproductoservicio=tipoproductoservicioAux;
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
      		//this.finishProcessTipoProductoServicio();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoProductoServicio tipoproductoservicioLocal) throws Exception {
		
		if(this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoproductoservicioLocal.setCuentaContableTipos(this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos());
				tipoproductoservicioLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				tipoproductoservicioLocal.setCuentaContableTipos(this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipos);
				tipoproductoservicioLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoProductoServicio tipoproductoservicioLocal) throws Exception {	
		if(this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoProductoServicioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoproductoservicioValidator.getInvalidValues(this.tipoproductoservicio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoProductoServicio tipoproductoservicio,List<TipoProductoServicio> tipoproductoservicios) throws Exception {
		try	{		
			TipoProductoServicioConstantesFunciones.actualizarLista(tipoproductoservicio,tipoproductoservicios,this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoProductoServicio tipoproductoservicio,List<TipoProductoServicio> tipoproductoservicios) throws Exception {
		try	{			
			TipoProductoServicioConstantesFunciones.actualizarSelectedLista(tipoproductoservicio,tipoproductoservicios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoProductoServicio> tipoproductoserviciosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoproductoserviciosLocal=this.tipoproductoservicioLogic.getTipoProductoServicios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoproductoserviciosLocal=this.tipoproductoservicios;
			}
			//ARCHITECTURE
		
			for(TipoProductoServicio tipoproductoservicioLocal:tipoproductoserviciosLocal) {
				if(this.permiteMantenimiento(tipoproductoservicioLocal) && tipoproductoservicioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoProductoServicioConstantesFunciones.getTipoProductoServicioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoProductoServicioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProductoServicio.jLabelnombreTipoProductoServicio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProductoServicio.jLabelnombreTipoProductoServicio,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("CuentaContableTipo")) {
			if(this.tipoproductoservicio==null) {
				this.tipoproductoservicio= new TipoProductoServicio();
			}

			if(this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProductoServicio
				this.setVariablesFormularioToObjetoActualTipoProductoServicio(this.tipoproductoservicio,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(this.tipoproductoservicio);

				this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.getcuentacontabletipo().setTipoProductoServicio(this.tipoproductoservicio);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.tipoproductoservicio==null) {
				this.tipoproductoservicio= new TipoProductoServicio();
			}

			if(this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProductoServicio
				this.setVariablesFormularioToObjetoActualTipoProductoServicio(this.tipoproductoservicio,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(this.tipoproductoservicio);

				this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setTipoProductoServicio(this.tipoproductoservicio);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoProductoServicio--;	
		
		
		this.tipoproductoservicioAux=new TipoProductoServicio();
		
		this.tipoproductoservicioAux.setId(this.iIdNuevoTipoProductoServicio);
		this.tipoproductoservicioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoproductoservicioLogic.getTipoProductoServicios().add(this.tipoproductoservicioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoproductoservicios.add(this.tipoproductoservicioAux);
		}
		//ARCHITECTURE
		
		this.tipoproductoservicio=this.tipoproductoservicioAux;
		
		if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoProductoServicio(this.tipoproductoservicio);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProductoServicio(this.tipoproductoservicio);
		}
				
		//this.setDefaultControlesTipoProductoServicio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoProductoServicio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoProductoServicio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProductoServicio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProductoServicio(this.tipoproductoservicioBean,this.tipoproductoservicio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(this.tipoproductoservicio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoProductoServicioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
			classes=TipoProductoServicioConstantesFunciones.getClassesRelationshipsOfTipoProductoServicio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoproductoservicioReturnGeneral=tipoproductoservicioLogic.procesarEventosTipoProductoServiciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoproductoservicioLogic.getTipoProductoServicios(),this.tipoproductoservicio,this.tipoproductoservicioParameterGeneral,this.isEsNuevoTipoProductoServicio,classes);//this.tipoproductoservicioLogic.getTipoProductoServicio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoProductoServicio(this.tipoproductoservicioReturnGeneral,this.tipoproductoservicioBean,false);
		
		if(this.tipoproductoservicioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProductoServicio(this.tipoproductoservicioReturnGeneral.getTipoProductoServicio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoProductoServicio(this.tipoproductoservicioReturnGeneral.getTipoProductoServicio());
		}
		
		if(this.tipoproductoservicioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoProductoServicio(this.tipoproductoservicioReturnGeneral.getTipoProductoServicio(),classes);//this.tipoproductoservicioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoProductoServicio(this.tipoproductoservicio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoProductoServicio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoProductoServicio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoProductoServicio(false);
						
			if(tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.getEsGuardarRelacionado() && CuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaContableTipoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProductoServicio();
			}
			
			this.actualizarVisualTableDatosTipoProductoServicio();
			
			this.jTableDatosTipoProductoServicio.setRowSelectionInterval(this.getIndiceNuevoTipoProductoServicio(), this.getIndiceNuevoTipoProductoServicio());
			
			this.seleccionarFilaTablaTipoProductoServicioActual();
						
			this.actualizarEstadoCeldasBotonesTipoProductoServicio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoProductoServicio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoProductoServicio.jTextAreanombreTipoProductoServicio.setEnabled(isHabilitar && this.tipoproductoservicioConstantesFunciones.activarnombreTipoProductoServicio);	
		
	};
	
	public void setDefaultControlesTipoProductoServicio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoProductoServicio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoproductoservicioSessionBean.setConGuardarRelaciones(true);			
			this.tipoproductoservicioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoProductoServicio.jTabbedPaneRelacionesTipoProductoServicio.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoproductoservicioSessionBean.setConGuardarRelaciones(false);			
			this.tipoproductoservicioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoProductoServicio.jTabbedPaneRelacionesTipoProductoServicio.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoProductoServicio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicioLogic.getTipoProductoServicios()) {
				if(tipoproductoservicioAux.getId().equals(this.iIdNuevoTipoProductoServicio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicios) {
				if(tipoproductoservicioAux.getId().equals(this.iIdNuevoTipoProductoServicio)) {
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
	
	public int getIndiceActualTipoProductoServicio(TipoProductoServicio tipoproductoservicio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicioLogic.getTipoProductoServicios()) {
				if(tipoproductoservicioAux.getId().equals(tipoproductoservicio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicios) {
				if(tipoproductoservicioAux.getId().equals(tipoproductoservicio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoProductoServicio(TipoProductoServicio tipoproductoservicioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicioLogic.getTipoProductoServicios()) {
				if(tipoproductoservicioAux.getTipoProductoServicioOriginal().getId().equals(tipoproductoservicioOriginal.getId())) {
					existe=true;
					tipoproductoservicioOriginal.setId(tipoproductoservicioAux.getId());
					tipoproductoservicioOriginal.setVersionRow(tipoproductoservicioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicios) {
				if(tipoproductoservicioAux.getTipoProductoServicioOriginal().getId().equals(tipoproductoservicioOriginal.getId())) {
					existe=true;
					tipoproductoservicioOriginal.setId(tipoproductoservicioAux.getId());
					tipoproductoservicioOriginal.setVersionRow(tipoproductoservicioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoProductoServicio(Boolean esParaCancelar) throws Exception {
		tipoproductoserviciosAux=new ArrayList<TipoProductoServicio>();
		tipoproductoservicioAux=new TipoProductoServicio();
		
		if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicioLogic.getTipoProductoServicios()) {
					if(tipoproductoservicioAux.getId()<0) {
						tipoproductoserviciosAux.add(tipoproductoservicioAux);
					}		
				}
				this.iIdNuevoTipoProductoServicio=0L;
				this.tipoproductoservicioLogic.getTipoProductoServicios().removeAll(tipoproductoserviciosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicios) {
					if(tipoproductoservicioAux.getId()<0) {
						tipoproductoserviciosAux.add(tipoproductoservicioAux);
					}		
				}
				this.iIdNuevoTipoProductoServicio=0L;
				this.tipoproductoservicios.removeAll(tipoproductoserviciosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoProductoServicio 
					&& this.tipoproductoservicioLogic.getTipoProductoServicios().size()>0
					) {
					tipoproductoservicioAux=this.tipoproductoservicioLogic.getTipoProductoServicios().get(this.tipoproductoservicioLogic.getTipoProductoServicios().size() - 1);
				
					if(tipoproductoservicioAux.getId()<0) {
						this.tipoproductoservicioLogic.getTipoProductoServicios().remove(tipoproductoservicioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoProductoServicio && this.tipoproductoservicios.size()>0) {
					tipoproductoservicioAux=this.tipoproductoservicios.get(this.tipoproductoservicios.size() - 1);
				
					if(tipoproductoservicioAux.getId()<0) {
						this.tipoproductoservicios.remove(tipoproductoservicioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoProductoServicio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoproductoservicio.getId()<0) {
				this.tipoproductoservicioLogic.getTipoProductoServicios().remove(this.tipoproductoservicio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoproductoservicio.getId()<0) {
				this.tipoproductoservicios.remove(this.tipoproductoservicio);
			}
		}			
	}
	
	public void setEstadosInicialesTipoProductoServicio(List<TipoProductoServicio> tipoproductoserviciosAux) throws Exception {
		TipoProductoServicioConstantesFunciones.setEstadosInicialesTipoProductoServicio(tipoproductoserviciosAux);
	}
	
	public void setEstadosInicialesTipoProductoServicio(TipoProductoServicio tipoproductoservicioAux) throws Exception {
		TipoProductoServicioConstantesFunciones.setEstadosInicialesTipoProductoServicio(tipoproductoservicioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoProductoServicioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoProductoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoProductoServicioActual()) {
				if(!this.isEsNuevoTipoProductoServicio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoProductoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoProductoServicio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoProductoServicioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Producto Servicio ?", "MANTENIMIENTO DE Tipo Producto Servicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoProductoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoProductoServicio tipoproductoservicio) throws Exception {
		TipoProductoServicioConstantesFunciones.seleccionarAsignar(this.tipoproductoservicio,tipoproductoservicio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoProductoServicio=this.isPermisoActualizarOriginalTipoProductoServicio;
			
			
			this.seleccionarAsignar(tipoproductoservicio);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProductoServicioConstantesFunciones.quitarEspaciosTipoProductoServicio(this.tipoproductoservicio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoProductoServicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoproductoservicioSessionBean.setsFuncionBusquedaRapida(this.tipoproductoservicioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoProductoServicio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoProductoServicio(esParaCancelar);				
				this.cancelarNuevoTipoProductoServicio(esParaCancelar);								
			}
			
			this.tipoproductoservicio=new TipoProductoServicio();
			
			this.inicializarTipoProductoServicio();
			
			this.actualizarEstadoCeldasBotonesTipoProductoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoProductoServicio() throws Exception {
		try {
			TipoProductoServicioConstantesFunciones.inicializarTipoProductoServicio(this.tipoproductoservicio);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoproductoservicioLogic.getTipoProductoServicios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoProductoServicios(String sAccionBusqueda,List<TipoProductoServicio> tipoproductoserviciosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoProductoServicio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoProductoServicioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoProductoServicioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoProductoServicio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Producto Servicios");		
		parameters.put("busquedapor", TipoProductoServicioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(CuentaContableTipo.class));
			classes.add(new Classe(ParametroInventarioDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoProductoServicioLogic tipoproductoservicioLogicAuxiliar=new TipoProductoServicioLogic();
					tipoproductoservicioLogicAuxiliar.setDatosCliente(tipoproductoservicioLogic.getDatosCliente());				
					tipoproductoservicioLogicAuxiliar.setTipoProductoServicios(tipoproductoserviciosParaReportes);
					
					tipoproductoservicioLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoProductoServicioWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoproductoserviciosParaReportes=tipoproductoservicioLogicAuxiliar.getTipoProductoServicios();
					
					//tipoproductoservicioLogic.getNewConnexionToDeep();
					
					//for (TipoProductoServicio tipoproductoservicio:tipoproductoserviciosParaReportes) {
					//	tipoproductoservicioLogic.deepLoad(tipoproductoservicio, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoproductoservicioLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoproductoservicioLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCuentaContableTipo = AuxiliarReportes.class.getResourceAsStream("CuentaContableTipoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cuentacontabletipo", reportFileCuentaContableTipo);

			InputStream reportFileParametroInventarioDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroInventarioDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametroinventariodefecto", reportFileParametroInventarioDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoProductoServicio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoProductoServicioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoProductoServicioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoProductoServicio=new JRBeanArrayDataSource(TipoProductoServicioJInternalFrame.TraerTipoProductoServicioBeans(tipoproductoserviciosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoProductoServicio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoProductoServicioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoProductoServicioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoProductoServicioBean.TraerTipoProductoServicioBeans(tipoproductoserviciosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoProductoServicios(sAccionBusqueda,sTipoArchivoReporte,tipoproductoserviciosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoProductoServicios(sAccionBusqueda,sTipoArchivoReporte,tipoproductoserviciosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoProductoServicioActionPerformed(null);
					//this.generarExcelReporteTipoProductoServicios(sAccionBusqueda,sTipoArchivoReporte,tipoproductoserviciosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoProductoServicios(sAccionBusqueda,sTipoArchivoReporte,tipoproductoserviciosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoProductoServicios(sAccionBusqueda,sTipoArchivoReporte,tipoproductoserviciosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoProductoServicios(sAccionBusqueda,sTipoArchivoReporte,tipoproductoserviciosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoProductoServicios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProductoServicio> tipoproductoserviciosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProductoServicios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProductoServicio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoProductoServicio tipoproductoservicio : tipoproductoserviciosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoProductoServicioConstantesFunciones.generarExcelReporteDataTipoProductoServicio("NORMAL",row,workbook,tipoproductoservicio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoProductoServicio(String sTipo,Row row,Workbook workbook) {
		
		TipoProductoServicioConstantesFunciones.generarExcelReporteHeaderTipoProductoServicio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoProductoServicios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProductoServicio> tipoproductoserviciosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProductoServicios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoProductoServicio tipoproductoservicio : tipoproductoserviciosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoProductoServicioConstantesFunciones.getTipoProductoServicioDescripcion(tipoproductoservicio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProductoServicioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProductoServicioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoproductoservicio.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoProductoServicios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProductoServicio> tipoproductoserviciosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoProductoServicio> tipoproductoserviciosRespaldo=null;
		
		classes=TipoProductoServicioConstantesFunciones.getClassesRelationshipsOfTipoProductoServicio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoproductoservicioLogic.setDatosCliente(this.datosCliente);
		this.tipoproductoservicioLogic.setDatosDeep(this.datosDeep);
		this.tipoproductoservicioLogic.setIsConDeep(true);
		
		tipoproductoserviciosRespaldo=this.tipoproductoservicioLogic.getTipoProductoServicios();
		
		this.tipoproductoservicioLogic.setTipoProductoServicios(tipoproductoserviciosParaReportes);	
		this.tipoproductoservicioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoproductoserviciosParaReportes=this.tipoproductoservicioLogic.getTipoProductoServicios();
		this.tipoproductoservicioLogic.setTipoProductoServicios(tipoproductoserviciosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProductoServicios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProductoServicio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoProductoServicio tipoproductoservicio : tipoproductoserviciosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoProductoServicio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoProductoServicioConstantesFunciones.generarExcelReporteDataTipoProductoServicio("NORMAL",row,workbook,tipoproductoservicio,cellStyleDataAux);
		
			
			


				//CuentaContableTipo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproductoservicio.getCuentaContableTipos()!=null && tipoproductoservicio.getCuentaContableTipos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CuentaContableTipoConstantesFunciones.generarExcelReporteHeaderCuentaContableTipo("RELACIONADO",row,workbook);
				}

				if(tipoproductoservicio.getCuentaContableTipos()!=null) {
					i2=0;
					for(CuentaContableTipo cuentacontabletipo : tipoproductoservicio.getCuentaContableTipos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CuentaContableTipoConstantesFunciones.generarExcelReporteDataCuentaContableTipo("RELACIONADO",row,workbook,cuentacontabletipo,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParametroInventarioDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproductoservicio.getParametroInventarioDefectos()!=null && tipoproductoservicio.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(tipoproductoservicio.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : tipoproductoservicio.getParametroInventarioDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroInventarioDefectoConstantesFunciones.generarExcelReporteDataParametroInventarioDefecto("RELACIONADO",row,workbook,parametroinventariodefecto,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoProductoServicioConstantesFunciones.getTipoProductoServicioDescripcion(tipoproductoservicio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoProductoServicio() throws Exception {		
		this.startProcessTipoProductoServicio(true);
	}
	
	public void startProcessTipoProductoServicio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoProductoServicio ,this.jPanelParametrosReportesTipoProductoServicio, this.jScrollPanelDatosTipoProductoServicio,this.jPanelPaginacionTipoProductoServicio, this.jScrollPanelDatosEdicionTipoProductoServicio, this.jPanelAccionesTipoProductoServicio,this.jPanelAccionesFormularioTipoProductoServicio,this.jmenuBarTipoProductoServicio,this.jmenuBarDetalleTipoProductoServicio,this.jTtoolBarTipoProductoServicio,this.jTtoolBarDetalleTipoProductoServicio);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProductoServicio=this.jTabbedPaneBusquedasTipoProductoServicio; 
		
		final JPanel jPanelParametrosReportesTipoProductoServicio=this.jPanelParametrosReportesTipoProductoServicio;
		//final JScrollPane jScrollPanelDatosTipoProductoServicio=this.jScrollPanelDatosTipoProductoServicio;
		final JTable jTableDatosTipoProductoServicio=this.jTableDatosTipoProductoServicio;		
		final JPanel jPanelPaginacionTipoProductoServicio=this.jPanelPaginacionTipoProductoServicio;
		//final JScrollPane jScrollPanelDatosEdicionTipoProductoServicio=this.jScrollPanelDatosEdicionTipoProductoServicio;
		final JPanel jPanelAccionesTipoProductoServicio=this.jPanelAccionesTipoProductoServicio;
		
		JPanel jPanelCamposAuxiliarTipoProductoServicio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoProductoServicio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
			jPanelCamposAuxiliarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jPanelCamposTipoProductoServicio;
			jPanelAccionesFormularioAuxiliarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jPanelAccionesFormularioTipoProductoServicio;
		}
		
		final JPanel jPanelCamposTipoProductoServicio=jPanelCamposAuxiliarTipoProductoServicio;
		final JPanel jPanelAccionesFormularioTipoProductoServicio=jPanelAccionesFormularioAuxiliarTipoProductoServicio;
		
		
		final JMenuBar jmenuBarTipoProductoServicio=this.jmenuBarTipoProductoServicio;
		final JToolBar jTtoolBarTipoProductoServicio=this.jTtoolBarTipoProductoServicio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoProductoServicio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProductoServicio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
			jmenuBarDetalleAuxiliarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jmenuBarDetalleTipoProductoServicio;
			jTtoolBarDetalleAuxiliarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jTtoolBarDetalleTipoProductoServicio;
		}
		
		final JMenuBar jmenuBarDetalleTipoProductoServicio=jmenuBarDetalleAuxiliarTipoProductoServicio;
		final JToolBar jTtoolBarDetalleTipoProductoServicio=jTtoolBarDetalleAuxiliarTipoProductoServicio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProductoServicio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProductoServicio;
			processRunnable.jTableDatos=jTableDatosTipoProductoServicio;
			processRunnable.jPanelCampos=jPanelCamposTipoProductoServicio;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProductoServicio;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProductoServicio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProductoServicio;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProductoServicio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProductoServicio;
			processRunnable.jTtoolBar=jTtoolBarTipoProductoServicio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProductoServicio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProductoServicio ,jPanelParametrosReportesTipoProductoServicio,jTableDatosTipoProductoServicio, /*jScrollPanelDatosTipoProductoServicio,*/jPanelCamposTipoProductoServicio,jPanelPaginacionTipoProductoServicio, /*jScrollPanelDatosEdicionTipoProductoServicio,*/ jPanelAccionesTipoProductoServicio,jPanelAccionesFormularioTipoProductoServicio,jmenuBarTipoProductoServicio,jmenuBarDetalleTipoProductoServicio,jTtoolBarTipoProductoServicio,jTtoolBarDetalleTipoProductoServicio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProductoServicio ,jPanelParametrosReportesTipoProductoServicio, jScrollPanelDatosTipoProductoServicio,jPanelPaginacionTipoProductoServicio, jScrollPanelDatosEdicionTipoProductoServicio, jPanelAccionesTipoProductoServicio,jPanelAccionesFormularioTipoProductoServicio,jmenuBarTipoProductoServicio,jmenuBarDetalleTipoProductoServicio,jTtoolBarTipoProductoServicio,jTtoolBarDetalleTipoProductoServicio);
						
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
	
	public void finishProcessTipoProductoServicio() {// throws Exception 
		this.finishProcessTipoProductoServicio(true);
	}
	
	public void finishProcessTipoProductoServicio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoProductoServicio ,this.jPanelParametrosReportesTipoProductoServicio, this.jScrollPanelDatosTipoProductoServicio,this.jPanelPaginacionTipoProductoServicio, this.jScrollPanelDatosEdicionTipoProductoServicio, this.jPanelAccionesTipoProductoServicio,this.jPanelAccionesFormularioTipoProductoServicio,this.jmenuBarTipoProductoServicio,this.jmenuBarDetalleTipoProductoServicio,this.jTtoolBarTipoProductoServicio,this.jTtoolBarDetalleTipoProductoServicio);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProductoServicio=this.jTabbedPaneBusquedasTipoProductoServicio; 
		
		final JPanel jPanelParametrosReportesTipoProductoServicio=this.jPanelParametrosReportesTipoProductoServicio;
		//final JScrollPane jScrollPanelDatosTipoProductoServicio=this.jScrollPanelDatosTipoProductoServicio;
		final JTable jTableDatosTipoProductoServicio=this.jTableDatosTipoProductoServicio;		
		final JPanel jPanelPaginacionTipoProductoServicio=this.jPanelPaginacionTipoProductoServicio;
		//final JScrollPane jScrollPanelDatosEdicionTipoProductoServicio=this.jScrollPanelDatosEdicionTipoProductoServicio;
		final JPanel jPanelAccionesTipoProductoServicio=this.jPanelAccionesTipoProductoServicio;
		
		JPanel jPanelCamposAuxiliarTipoProductoServicio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoProductoServicio=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
			jPanelCamposAuxiliarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jPanelCamposTipoProductoServicio;
			jPanelAccionesFormularioAuxiliarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jPanelAccionesFormularioTipoProductoServicio;
		}
		
		final JPanel jPanelCamposTipoProductoServicio=jPanelCamposAuxiliarTipoProductoServicio;
		final JPanel jPanelAccionesFormularioTipoProductoServicio=jPanelAccionesFormularioAuxiliarTipoProductoServicio;
		
		
		final JMenuBar jmenuBarTipoProductoServicio=this.jmenuBarTipoProductoServicio;		
		final JToolBar jTtoolBarTipoProductoServicio=this.jTtoolBarTipoProductoServicio;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoProductoServicio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProductoServicio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
			jmenuBarDetalleAuxiliarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jmenuBarDetalleTipoProductoServicio;
			jTtoolBarDetalleAuxiliarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jTtoolBarDetalleTipoProductoServicio;		
		}
		
		final JMenuBar jmenuBarDetalleTipoProductoServicio=jmenuBarDetalleAuxiliarTipoProductoServicio;
		final JToolBar jTtoolBarDetalleTipoProductoServicio=jTtoolBarDetalleAuxiliarTipoProductoServicio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProductoServicio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProductoServicio;
			processRunnable.jTableDatos=jTableDatosTipoProductoServicio;
			processRunnable.jPanelCampos=jPanelCamposTipoProductoServicio;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProductoServicio;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProductoServicio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProductoServicio;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProductoServicio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProductoServicio;
			processRunnable.jTtoolBar=jTtoolBarTipoProductoServicio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProductoServicio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoProductoServicio ,jPanelParametrosReportesTipoProductoServicio, jTableDatosTipoProductoServicio,/*jScrollPanelDatosTipoProductoServicio,*/jPanelCamposTipoProductoServicio,jPanelPaginacionTipoProductoServicio, /*jScrollPanelDatosEdicionTipoProductoServicio,*/ jPanelAccionesTipoProductoServicio,jPanelAccionesFormularioTipoProductoServicio,jmenuBarTipoProductoServicio,jmenuBarDetalleTipoProductoServicio,jTtoolBarTipoProductoServicio,jTtoolBarDetalleTipoProductoServicio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoProductoServicio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoProductoServicio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoProductoServicio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoProductoServicio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoProductoServicio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoProductoServicio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoProductoServicio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoProductoServicio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoProductoServicio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoproductoservicioConstantesFunciones.getsFinalQueryTipoProductoServicio();
		String  finalQueryPaginacionTodos=this.tipoproductoservicioConstantesFunciones.getsFinalQueryTipoProductoServicio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoProductoServicioConstantesFunciones.getArrayColumnasGlobalesNoTipoProductoServicio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoProductoServicioConstantesFunciones.getArrayColumnasGlobalesTipoProductoServicio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoProductoServicioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoproductoserviciosEliminados= new ArrayList<TipoProductoServicio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoProductoServicio();
		
				///*TipoProductoServicioSessionBean*/this.tipoproductoservicioSessionBean=new TipoProductoServicioSessionBean();
			
			if(this.tipoproductoservicioSessionBean==null) {
				this.tipoproductoservicioSessionBean=new TipoProductoServicioSessionBean();
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
					this.iNumeroPaginacion=TipoProductoServicioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoProductoServicioConstantesFunciones.getClassesForeignKeysOfTipoProductoServicio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoproductoservicio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoproductoserviciosAux= new ArrayList<TipoProductoServicio>();
			
				
			tipoproductoservicioLogic.setDatosCliente(this.datosCliente);
			tipoproductoservicioLogic.setDatosDeep(this.datosDeep);
			tipoproductoservicioLogic.setIsConDeep(true);
			
			
			tipoproductoservicioLogic.getTipoProductoServicioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoproductoservicioLogic.getTodosTipoProductoServicios(finalQueryGlobal,pagination);
					
					//tipoproductoservicioLogic.getTodosTipoProductoServiciosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoproductoservicioLogic.getTipoProductoServicios()==null|| tipoproductoservicioLogic.getTipoProductoServicios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoproductoserviciosAux= new ArrayList<TipoProductoServicio>();
							tipoproductoserviciosAux.addAll(tipoproductoservicioLogic.getTipoProductoServicios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductoserviciosAux= new ArrayList<TipoProductoServicio>();
							tipoproductoserviciosAux.addAll(tipoproductoservicios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoproductoservicioLogic.getTodosTipoProductoServicios(finalQueryGlobal+"",this.pagination);												
							
							//tipoproductoservicioLogic.getTodosTipoProductoServiciosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoProductoServicios("Todos",tipoproductoservicioLogic.getTipoProductoServicios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoproductoservicioLogic.setTipoProductoServicios(new ArrayList<TipoProductoServicio>());					
							tipoproductoservicioLogic.getTipoProductoServicios().addAll(tipoproductoserviciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductoservicios=new ArrayList<TipoProductoServicio>();
							tipoproductoservicios.addAll(tipoproductoserviciosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoProductoServicio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoProductoServicio=this.idActual;
				
				} else if(this.idTipoProductoServicioActual!=null && this.idTipoProductoServicioActual!=0L) {
					idTipoProductoServicio=idTipoProductoServicioActual;
				}
				
					
				this.sDetalleReporte=TipoProductoServicioConstantesFunciones.getDetalleIndicePorId(idTipoProductoServicio);
				
				this.tipoproductoservicios=new ArrayList<TipoProductoServicio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoproductoservicioLogic.getEntity(idTipoProductoServicio);
					
					//tipoproductoservicioLogic.getEntityWithConnection(idTipoProductoServicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoservicioLogic.setTipoProductoServicios(new ArrayList<TipoProductoServicio>());
					tipoproductoservicioLogic.getTipoProductoServicios().add(tipoproductoservicioLogic.getTipoProductoServicio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoproductoservicios=new ArrayList<TipoProductoServicio>();
					this.tipoproductoservicios.add(tipoproductoservicio);
				}
				
				if(tipoproductoservicioLogic.getTipoProductoServicio()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoProductoServicioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoproductoservicioLogic.getTipoProductoServiciosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProductoServicioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProductoServicioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoproductoservicioLogic.getTipoProductoServicios()==null||tipoproductoservicioLogic.getTipoProductoServicios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoproductoservicios==null|| tipoproductoservicios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoserviciosAux=new ArrayList<TipoProductoServicio>();
						tipoproductoserviciosAux.addAll(tipoproductoservicioLogic.getTipoProductoServicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductoserviciosAux=new ArrayList<TipoProductoServicio>();
							tipoproductoserviciosAux.addAll(tipoproductoservicios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoproductoservicioLogic.getTipoProductoServiciosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProductoServicioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProductoServicioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoProductoServicios("BusquedaPorNombre",tipoproductoservicioLogic.getTipoProductoServicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoProductoServicios("BusquedaPorNombre",tipoproductoservicios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoservicioLogic.setTipoProductoServicios(new ArrayList<TipoProductoServicio>());
						tipoproductoservicioLogic.getTipoProductoServicios().addAll(tipoproductoserviciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductoservicios=new ArrayList<TipoProductoServicio>();
							tipoproductoservicios.addAll(tipoproductoserviciosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoProductoServicio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoProductoServicio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoproductoservicioLogic.getTipoProductoServicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoproductoservicios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoproductoservicioLogic.getTipoProductoServicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoproductoservicios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoProductoServicio tipoproductoservicio) {
		Boolean permite=true;
		
		if(this.tipoproductoservicio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoProductoServicioConstantesFunciones.getOrderByListaTipoProductoServicio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoProductoServicioConstantesFunciones.getOrderByListaTipoProductoServicio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProductoServicio tipoproductoservicio:tipoproductoservicioLogic.getTipoProductoServicios()) {
				if(tipoproductoservicio.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproductoservicioTotales=tipoproductoservicio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProductoServicio tipoproductoservicio:this.tipoproductoservicios) {
				if(tipoproductoservicio.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproductoservicioTotales=tipoproductoservicio;
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
			this.tipoproductoservicioAux=new TipoProductoServicio();
			this.tipoproductoservicioAux.setsType(Constantes2.S_TOTALES);
			this.tipoproductoservicioAux.setIsNew(false);
			this.tipoproductoservicioAux.setIsChanged(false);
			this.tipoproductoservicioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoProductoServicioConstantesFunciones.TotalizarValoresFilaTipoProductoServicio(this.tipoproductoservicioLogic.getTipoProductoServicios(),this.tipoproductoservicioAux);
				
				this.tipoproductoservicioLogic.getTipoProductoServicios().add(this.tipoproductoservicioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoProductoServicioConstantesFunciones.TotalizarValoresFilaTipoProductoServicio(this.tipoproductoservicios,this.tipoproductoservicioAux);
				
				this.tipoproductoservicios.add(this.tipoproductoservicioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoproductoservicioTotales=new TipoProductoServicio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoproductoservicioLogic.getTipoProductoServicios().remove(tipoproductoservicioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoproductoservicios.remove(tipoproductoservicioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoproductoservicioTotales=new TipoProductoServicio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProductoServicio tipoproductoservicio:tipoproductoservicioLogic.getTipoProductoServicios()) {
				if(tipoproductoservicio.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproductoservicioTotales=tipoproductoservicio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProductoServicioConstantesFunciones.TotalizarValoresFilaTipoProductoServicio(this.tipoproductoservicioLogic.getTipoProductoServicios(),tipoproductoservicioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProductoServicio tipoproductoservicio:this.tipoproductoservicios) {
				if(tipoproductoservicio.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproductoservicioTotales=tipoproductoservicio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProductoServicioConstantesFunciones.TotalizarValoresFilaTipoProductoServicio(this.tipoproductoservicios,tipoproductoservicioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoProductoServiciosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoProductoServicioPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoProductoServiciosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoservicioLogic.getTipoProductoServiciosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoProductoServicioPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoservicioLogic.getTipoProductoServicioPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoProductoServicio() {
		this.isPermisoTodoTipoProductoServicio=false;
		this.isPermisoNuevoTipoProductoServicio=false;
		this.isPermisoActualizarTipoProductoServicio=false;
		this.isPermisoActualizarOriginalTipoProductoServicio=false;
		this.isPermisoEliminarTipoProductoServicio=false;
		this.isPermisoGuardarCambiosTipoProductoServicio=false;
		this.isPermisoConsultaTipoProductoServicio=false;
		this.isPermisoBusquedaTipoProductoServicio=false;
		this.isPermisoReporteTipoProductoServicio=false;		
		this.isPermisoOrdenTipoProductoServicio=false;		
		this.isPermisoPaginacionMedioTipoProductoServicio=false;		
		this.isPermisoPaginacionAltoTipoProductoServicio=false;
		this.isPermisoPaginacionTodoTipoProductoServicio=false;
		this.isPermisoCopiarTipoProductoServicio=false;		
		this.isPermisoVerFormTipoProductoServicio=false;		
		this.isPermisoDuplicarTipoProductoServicio=false;		
		this.isPermisoOrdenTipoProductoServicio=false;		
	}
	
	public void setPermisosUsuarioTipoProductoServicio(Boolean isPermiso) {
		this.isPermisoTodoTipoProductoServicio=isPermiso;
		this.isPermisoNuevoTipoProductoServicio=isPermiso;
		this.isPermisoActualizarTipoProductoServicio=isPermiso;
		this.isPermisoActualizarOriginalTipoProductoServicio=isPermiso;
		this.isPermisoEliminarTipoProductoServicio=isPermiso;
		this.isPermisoGuardarCambiosTipoProductoServicio=isPermiso;
		this.isPermisoConsultaTipoProductoServicio=isPermiso;
		this.isPermisoBusquedaTipoProductoServicio=isPermiso;
		this.isPermisoReporteTipoProductoServicio=isPermiso;
		this.isPermisoOrdenTipoProductoServicio=isPermiso;		
		this.isPermisoPaginacionMedioTipoProductoServicio=isPermiso;		
		this.isPermisoPaginacionAltoTipoProductoServicio=isPermiso;		
		this.isPermisoPaginacionTodoTipoProductoServicio=isPermiso;		
		this.isPermisoCopiarTipoProductoServicio=isPermiso;		
		this.isPermisoVerFormTipoProductoServicio=isPermiso;		
		this.isPermisoDuplicarTipoProductoServicio=isPermiso;
		this.isPermisoOrdenTipoProductoServicio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoProductoServicio(Boolean isPermiso) {
		//this.isPermisoTodoTipoProductoServicio=isPermiso;
		this.isPermisoNuevoTipoProductoServicio=isPermiso;
		this.isPermisoActualizarTipoProductoServicio=isPermiso;
		this.isPermisoActualizarOriginalTipoProductoServicio=isPermiso;
		this.isPermisoEliminarTipoProductoServicio=isPermiso;
		this.isPermisoGuardarCambiosTipoProductoServicio=isPermiso;
		//this.isPermisoConsultaTipoProductoServicio=isPermiso;
		//this.isPermisoBusquedaTipoProductoServicio=isPermiso;
		//this.isPermisoReporteTipoProductoServicio=isPermiso;
		//this.isPermisoOrdenTipoProductoServicio=isPermiso;		
		//this.isPermisoPaginacionMedioTipoProductoServicio=isPermiso;		
		//this.isPermisoPaginacionAltoTipoProductoServicio=isPermiso;		
		//this.isPermisoPaginacionTodoTipoProductoServicio=isPermiso;		
		//this.isPermisoCopiarTipoProductoServicio=isPermiso;		
		//this.isPermisoDuplicarTipoProductoServicio=isPermiso;
		//this.isPermisoOrdenTipoProductoServicio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoProductoServicioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CuentaContableTipoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoProductoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCuentaContableTipo=false;
		this.isTienePermisosCuentaContableTipo=this.verificarGetPermisosUsuarioOpcionTipoProductoServicioClaseRelacionada(this.opcionsRelacionadas,CuentaContableTipoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionTipoProductoServicioClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoProductoServicio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoProductoServicioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCuentaContableTipo=conPermiso;
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoProductoServicioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoProductoServicioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoProductoServicioClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCuentaContableTipo && this.jInternalFrameDetalleFormTipoProductoServicio!=null && this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jTabbedPaneRelacionesTipoProductoServicio.remove(this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormTipoProductoServicio!=null && this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jTabbedPaneRelacionesTipoProductoServicio.remove(this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoProductoServicio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoProductoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoProductoServicioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoProductoServicio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoProductoServicio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoProductoServicio=this.isPermisoActualizarTipoProductoServicio;
			this.isPermisoEliminarTipoProductoServicio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoProductoServicio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoProductoServicio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoProductoServicio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoProductoServicio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoProductoServicio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProductoServicio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoProductoServicio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoProductoServicio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoProductoServicio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoProductoServicio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoProductoServicio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoProductoServicio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProductoServicio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoProductoServicio.setToolTipText(this.jTableDatosTipoProductoServicio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoProductoServicio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoProductoServicio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoProductoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoProductoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoProductoServicio() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCuentaContableTipo && this.tipoproductoservicioConstantesFunciones.mostrarCuentaContableTipoTipoProductoServicio && !TipoProductoServicioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cuenta Contable Tipo");
			reporte.setsDescripcion("Cuenta Contable Tipo");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroInventarioDefecto && this.tipoproductoservicioConstantesFunciones.mostrarParametroInventarioDefectoTipoProductoServicio && !TipoProductoServicioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Inventario Defecto");
			reporte.setsDescripcion("Parametro Inventario Defecto");
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
	
		
	public void inicializarCombosForeignKeyTipoProductoServicioListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoProductoServicioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoProductoServicioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoProductoServicioListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoProductoServicioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoProductoServicio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoProductoServicio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoProductoServicio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoProductoServicio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProductoServicio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoProductoServicio(TipoProductoServicio tipoproductoservicio)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoProductoServicio(TipoProductoServicio tipoproductoservicio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoProductoServicio()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProductoServicio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoProductoServicio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoProductoServicio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoProductoServicio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoProductoServicio()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoProductoServicio(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoProductoServicio()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoProductoServicioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoProductoServicioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoProductoServicioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoproductoservicioSessionBean=new TipoProductoServicioSessionBean(); 
		this.tipoproductoservicioConstantesFunciones=new TipoProductoServicioConstantesFunciones(); 
		this.tipoproductoservicioBean=new TipoProductoServicio();//(this.tipoproductoservicioConstantesFunciones); 		
		this.tipoproductoservicioReturnGeneral=new TipoProductoServicioParameterReturnGeneral(); 
		
		this.tipoproductoservicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoproductoservicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoProductoServicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoProductoServicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoProductoServicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoProductoServicio(true);
			
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
			
			this.tipoproductoservicioConstantesFunciones=new TipoProductoServicioConstantesFunciones(); 
			this.tipoproductoservicioBean=new TipoProductoServicio();//this.tipoproductoservicioConstantesFunciones); 			
			this.tipoproductoservicioReturnGeneral=new TipoProductoServicioParameterReturnGeneral(); 
		
			TipoProductoServicioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Producto Servicio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoproductoservicio=new TipoProductoServicio();
			this.tipoproductoservicios = new ArrayList<TipoProductoServicio>();
			this.tipoproductoserviciosAux = new ArrayList<TipoProductoServicio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic=new TipoProductoServicioLogic();
				this.tipoproductoservicioLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoproductoservicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoproductoservicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoProductoServicio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoProductoServicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProductoServicio);	
					}
					
					if(this.jInternalFrameImportacionTipoProductoServicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProductoServicio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoProductoServicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoProductoServicio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProductoServicio);
				this.jInternalFrameDetalleFormTipoProductoServicio.setVisible(false);
				this.jInternalFrameDetalleFormTipoProductoServicio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoProductoServicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProductoServicio);
					this.jInternalFrameReporteDinamicoTipoProductoServicio.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoProductoServicio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoProductoServicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoProductoServicio);
					this.jInternalFrameImportacionTipoProductoServicio.setVisible(false);
					this.jInternalFrameImportacionTipoProductoServicio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoProductoServicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoProductoServicio);
					this.jInternalFrameOrderByTipoProductoServicio.setVisible(false);
					this.jInternalFrameOrderByTipoProductoServicio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoProductoServicioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoProductoServicioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoproductoservicioReturnGeneral=new TipoProductoServicioParameterReturnGeneral();
			
			this.tipoproductoservicioParameterGeneral=new TipoProductoServicioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoproductoservicioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoProductoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CuentaContableTipoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProductoServicioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoproductoservicioSessionBean.getEsGuardarRelacionado(),this.tipoproductoservicioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProductoServicioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoproductoservicioSessionBean.getEsGuardarRelacionado(),this.tipoproductoservicioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoProductoServicio=false;
			this.isVisibilidadCeldaDuplicarTipoProductoServicio=true;
			this.isVisibilidadCeldaCopiarTipoProductoServicio=true;
			this.isVisibilidadCeldaVerFormTipoProductoServicio=true;
			this.isVisibilidadCeldaOrdenTipoProductoServicio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=false;
			this.isVisibilidadCeldaModificarTipoProductoServicio=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicio=false;
			this.isVisibilidadCeldaEliminarTipoProductoServicio=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicio=false;
			this.isVisibilidadCeldaGuardarTipoProductoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoProductoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoProductoServicio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoProductoServicio(false);
			
			this.setPermisosUsuarioTipoProductoServicio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoproductoservicioSessionBean.getEsGuardarRelacionado() && this.tipoproductoservicioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoProductoServicioClasesRelacionadas();
			}
			
			if(this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoProductoServicioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoProductoServicioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoProductoServicio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoProductoServicio();
			}
			
			if(!this.isPermisoBusquedaTipoProductoServicio) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoProductoServicio.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoProductoServicio,this.isPermisoPaginacionMedioTipoProductoServicio,this.isPermisoPaginacionTodoTipoProductoServicio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoProductoServicioConstantesFunciones.getTiposSeleccionarTipoProductoServicio());
				
				this.tiposColumnasSelect=TipoProductoServicioConstantesFunciones.getTiposSeleccionarTipoProductoServicio(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoProductoServicio();				
				//this.tiposRelacionesSelect=TipoProductoServicioConstantesFunciones.getTiposRelacionesTipoProductoServicio(true);
				
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
			//if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoProductoServicio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoProductoServicio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoProductoServicio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProductoServicio() ;
			
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
			
			
			this.cuentacontabletipoLogic=new CuentaContableTipoLogic();
			this.parametroinventariodefectoLogic=new ParametroInventarioDefectoLogic(); 
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
				tipoproductoservicioImplementable= (TipoProductoServicioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProductoServicioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoproductoservicioImplementableHome= (TipoProductoServicioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProductoServicioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoproductoservicios= new ArrayList<TipoProductoServicio>();
			this.tipoproductoserviciosEliminados= new ArrayList<TipoProductoServicio>();
						
			this.isEsNuevoTipoProductoServicio=false;
			this.esParaAccionDesdeFormularioTipoProductoServicio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoProductoServicio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoProductoServicio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoProductoServicioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoProductoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoProductoServicio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoProductoServicio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoProductoServicio();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoProductoServicio.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoProductoServicio.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoProductoServicio.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoProductoServicio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoProductoServicio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoProductoServicio() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoProductoServicio")) {
				iIndex=this.jInternalFrameDetalleFormTipoProductoServicio.jTabbedPaneRelacionesTipoProductoServicio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoProductoServicio.jTabbedPaneRelacionesTipoProductoServicio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();	
				
				

				if(sTitle.equals("Cuenta Contable Tipos")) {
					if(!CuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProductoServicio();

						this.cargarParteTabPanelRelacionadaCuentaContableTipo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProductoServicio();

						this.cargarParteTabPanelRelacionadaParametroInventarioDefecto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoProductoServicio();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCuentaContableTipo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProductoServicio.cargarSessionConBeanSwingJInternalFrameCuentaContableTipo(false,true,iIndex);
		this.jButtonCuentaContableTipoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCuentaContableTipo();

		//this.jTabbedPaneRelacionesTipoProductoServicio.updateUI();
		//this.jTabbedPaneRelacionesTipoProductoServicio.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProductoServicio.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProductoServicio.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesTipoProductoServicio.updateUI();
		//this.jTabbedPaneRelacionesTipoProductoServicio.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProductoServicio.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("CuentaContableTipo")) {
				int row=this.jTableDatosTipoProductoServicio.getSelectedRow();
				jButtonCuentaContableTipoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosTipoProductoServicio.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cuenta Contable Tipo")) {

					if(this.isTienePermisosCuentaContableTipo && this.tipoproductoservicioConstantesFunciones.mostrarCuentaContableTipoTipoProductoServicio && !TipoProductoServicioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cuenta Contable Tipos"+"("+CuentaContableTipoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cuenta Contable Tipos");

						if(tipoproductoservicioConstantesFunciones.resaltarCuentaContableTipoTipoProductoServicio!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproductoservicioConstantesFunciones.resaltarCuentaContableTipoTipoProductoServicio);
						}

						jmenuItem.setEnabled(this.tipoproductoservicioConstantesFunciones.activarCuentaContableTipoTipoProductoServicio);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CuentaContableTipo"));

						

						this.jInternalFrameDetalleFormTipoProductoServicio.jmenuDetalleTipoProductoServicio.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.tipoproductoservicioConstantesFunciones.mostrarParametroInventarioDefectoTipoProductoServicio && !TipoProductoServicioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(tipoproductoservicioConstantesFunciones.resaltarParametroInventarioDefectoTipoProductoServicio!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproductoservicioConstantesFunciones.resaltarParametroInventarioDefectoTipoProductoServicio);
						}

						jmenuItem.setEnabled(this.tipoproductoservicioConstantesFunciones.activarParametroInventarioDefectoTipoProductoServicio);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormTipoProductoServicio.jmenuDetalleTipoProductoServicio.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoProductoServicio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoProductoServicio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoProductoServicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoProductoServicioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoProductoServicio();
		
		this.cargarCombosFrameForeignKeyTipoProductoServicio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoProductoServicio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoProductoServicio();
		}
	}
	
	
	
	public void jButtonNuevoTipoProductoServicioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoProductoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			
			
			if(jTableDatosTipoProductoServicio.getRowCount()>=1) {
				jTableDatosTipoProductoServicio.removeRowSelectionInterval(0, jTableDatosTipoProductoServicio.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoProductoServicio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoProductoServicio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoProductoServicio(true);			
			//this.tipoproductoservicio=new TipoProductoServicio();
			//this.tipoproductoservicio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProductoServicio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProductoServicio() ;
			
			if(TipoProductoServicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProductoServicio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoproductoservicio);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);				
			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			
			if(this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoProductoServicio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoProductoServicioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoProductoServicio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoProductoServicio.getSelectedRows().length;			
			}
			
			tipoproductoserviciosSeleccionados=this.getTipoProductoServiciosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoProductoServicio--;			
				//TipoProductoServicio tipoproductoservicioAux= new TipoProductoServicio();			
				//tipoproductoservicioAux.setId(this.iIdNuevoTipoProductoServicio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoProductoServicio tipoproductoservicioOrigen=new TipoProductoServicio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoProductoServicio tipoproductoservicioOrigen : tipoproductoserviciosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoproductoservicioOrigen =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductoservicioOrigen =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoProductoServicio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoproductoservicio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoProductoServicio(tipoproductoservicioOrigen,this.tipoproductoservicio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(this.tipoproductoservicio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoproductoservicioLogic.getTipoProductoServicios().add(this.tipoproductoservicioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoproductoservicios.add(this.tipoproductoservicioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoProductoServicio(false);
				
				this.jTableDatosTipoProductoServicio.setRowSelectionInterval(this.getIndiceNuevoTipoProductoServicio(), this.getIndiceNuevoTipoProductoServicio());
				
				int iLastRow =  this.jTableDatosTipoProductoServicio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProductoServicio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProductoServicio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProductoServicio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();									
		
			TipoProductoServicio tipoproductoservicioOrigen=new TipoProductoServicio();
			TipoProductoServicio tipoproductoservicioDestino=new TipoProductoServicio();
				
			tipoproductoserviciosSeleccionados=this.getTipoProductoServiciosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoProductoServicio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoproductoserviciosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoProductoServicio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoservicioOrigen =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoproductoservicioOrigen =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoservicioDestino =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoproductoservicioDestino =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoproductoservicioOrigen =tipoproductoserviciosSeleccionados.get(0);
				tipoproductoservicioDestino =tipoproductoserviciosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoProductoServicio(tipoproductoservicioOrigen,tipoproductoservicioDestino,true,false);
				
				tipoproductoservicioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoproductoservicioDestino,tipoproductoservicioLogic.getTipoProductoServicios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproductoservicioDestino,tipoproductoservicios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoProductoServicio(false);
				
				//this.jTableDatosTipoProductoServicio.setRowSelectionInterval(this.getIndiceNuevoTipoProductoServicio(), this.getIndiceNuevoTipoProductoServicio());
				
				int iLastRow =  this.jTableDatosTipoProductoServicio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProductoServicio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProductoServicio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProductoServicio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoProductoServicio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoProductoServicio.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoProductoServicio.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoProductoServicio.setVisible(!isVisible);
			this.jPanelPaginacionTipoProductoServicio.setVisible(!isVisible);
			this.jPanelAccionesTipoProductoServicio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoProductoServicio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoProductoServicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoProductoServicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoProductoServicio();
			
			this.abrirFrameOrderByTipoProductoServicio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoProductoServicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoProductoServicio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProductoServicio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoProductoServicio.isMaximum()) {
					this.jInternalFrameDetalleFormTipoProductoServicio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoProductoServicio.setSize(this.jInternalFrameDetalleFormTipoProductoServicio.iWidthFormulario,this.jInternalFrameDetalleFormTipoProductoServicio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoProductoServicio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoProductoServicio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoProductoServicio.isMaximum()) {
						this.jInternalFrameDetalleFormTipoProductoServicio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoProductoServicio.jContentPaneDetalleTipoProductoServicio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoProductoServicio.jTabbedPaneRelacionesTipoProductoServicio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoProductoServicio.jContentPaneDetalleTipoProductoServicio.getWidth(),TipoProductoServicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProductoServicio.jTabbedPaneRelacionesTipoProductoServicio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoProductoServicio.jContentPaneDetalleTipoProductoServicio.getWidth(),TipoProductoServicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProductoServicio.jTabbedPaneRelacionesTipoProductoServicio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoProductoServicio.jContentPaneDetalleTipoProductoServicio.getWidth(),TipoProductoServicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCuentaContableTipo();
					}

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoProductoServicio.setVisible(true);
	        this.jInternalFrameDetalleFormTipoProductoServicio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoProductoServicio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoProductoServicio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoProductoServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProductoServicio,false,this);
				} else {
					this.jInternalFrameOrderByTipoProductoServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProductoServicio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoProductoServicio);
				this.jInternalFrameOrderByTipoProductoServicio.setVisible(false);
				this.jInternalFrameOrderByTipoProductoServicio.setSelected(false);
				
				this.jInternalFrameOrderByTipoProductoServicio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProductoServicio"));
				
				this.inicializarActualizarBindingTablaOrderByTipoProductoServicio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoProductoServicio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoProductoServicio==null) {
				
				this.jInternalFrameImportacionTipoProductoServicio=new ImportacionJInternalFrame(TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProductoServicio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoProductoServicio);
				this.jInternalFrameImportacionTipoProductoServicio.setVisible(false);
				this.jInternalFrameImportacionTipoProductoServicio.setSelected(false);


				this.jInternalFrameImportacionTipoProductoServicio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProductoServicio"));
				this.jInternalFrameImportacionTipoProductoServicio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProductoServicio"));
				this.jInternalFrameImportacionTipoProductoServicio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProductoServicio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoProductoServicio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoProductoServicio==null) {
				this.jInternalFrameReporteDinamicoTipoProductoServicio=new ReporteDinamicoJInternalFrame(TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProductoServicio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProductoServicio);
				this.jInternalFrameReporteDinamicoTipoProductoServicio.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoProductoServicio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoProductoServicio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProductoServicio"));
				this.jInternalFrameReporteDinamicoTipoProductoServicio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProductoServicio"));
				this.jInternalFrameReporteDinamicoTipoProductoServicio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProductoServicio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProductoServicio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCuentaContableTipo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContableTipo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProductoServicio.jContentPaneDetalleTipoProductoServicio.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContableTipo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContableTipo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContableTipo.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProductoServicio.jContentPaneDetalleTipoProductoServicio.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoProductoServicio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProductoServicio);
			
	       	this.jInternalFrameDetalleFormTipoProductoServicio.setVisible(false);
	        this.jInternalFrameDetalleFormTipoProductoServicio.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoProductoServicio.dispose();
			//this.jInternalFrameDetalleFormTipoProductoServicio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoProductoServicio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoProductoServicio.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoProductoServicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoProductoServicio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoProductoServicio.setVisible(true);
	        this.jInternalFrameImportacionTipoProductoServicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoProductoServicio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoProductoServicio.setVisible(true);
	        this.jInternalFrameOrderByTipoProductoServicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoProductoServicio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoProductoServicio.setVisible(false);
	        this.jInternalFrameOrderByTipoProductoServicio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoProductoServicio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoProductoServicio.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoProductoServicio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoProductoServicio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoProductoServicio.setVisible(false);
	        this.jInternalFrameImportacionTipoProductoServicio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoProductoServicio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoProductoServicio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoProductoServicio(true);
			//this.isEsNuevoTipoProductoServicio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoProductoServicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProductoServicio(false) ;
			
			if(tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.getEsGuardarRelacionado() && CuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaContableTipoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoProductoServicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProductoServicio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProductoServicio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoProductoServicioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoProductoServicio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoProductoServicio(true);
			//this.isEsNuevoTipoProductoServicio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoproductoservicio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoProductoServicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoProductoServicio(false) ;
			
			if(TipoProductoServicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProductoServicio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProductoServicio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoProductoServicio(false);
			
			//if(!this.isEsNuevoTipoProductoServicio) {								
				int intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoProductoServicio(this.tipoproductoservicio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(this.tipoproductoservicio);
				
			}
			
			if(this.permiteMantenimiento(this.tipoproductoservicio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoProductoServicio=true;
					this.inicializarActualizarBindingTablaTipoProductoServicio(false);
					this.isEsNuevoTipoProductoServicio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoProductoServicio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoProductoServicio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProductoServicio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProductoServicio(false);
				
				this.habilitarDeshabilitarControlesTipoProductoServicio(false);
			
												
				
				if(TipoProductoServicioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoProductoServicio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoProductoServicioActionPerformed(evt,tipoproductoservicioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoProductoServicio(this.tipoproductoservicio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoProductoServicio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoproductoservicioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoproductoservicio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				this.tipoproductoservicio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				this.tipoproductoservicio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoproductoservicio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoProductoServicioModel) this.jTableDatosTipoProductoServicio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoProductoServicio=true;
				this.inicializarActualizarBindingTablaTipoProductoServicio(false);
				this.isEsNuevoTipoProductoServicio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProductoServicio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProductoServicio(false);
				
				this.habilitarDeshabilitarControlesTipoProductoServicio(false);
				
				
				
				if(TipoProductoServicioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoProductoServicio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoProductoServicio.getRowCount()>=1) {
				jTableDatosTipoProductoServicio.removeRowSelectionInterval(0, jTableDatosTipoProductoServicio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoProductoServicio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoProductoServicio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProductoServicio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProductoServicio(false) ;
			
			this.isEsNuevoTipoProductoServicio=false;
			
			if(TipoProductoServicioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoProductoServicio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoProductoServicio(false);
				
				//SI ES MANUAL
				if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoProductoServicio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoProductoServicio--;			
			//TipoProductoServicio tipoproductoservicioAux= new TipoProductoServicio();			
			//tipoproductoservicioAux.setId(this.iIdNuevoTipoProductoServicio);
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoProductoServicio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(this.tipoproductoservicio);
			
			this.tipoproductoservicio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoproductoservicioLogic.getTipoProductoServicios().add(this.tipoproductoservicioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoproductoservicios.add(this.tipoproductoservicioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoProductoServicio(false);
			
			this.jTableDatosTipoProductoServicio.setRowSelectionInterval(this.getIndiceNuevoTipoProductoServicio(), this.getIndiceNuevoTipoProductoServicio());
			
			int iLastRow =  this.jTableDatosTipoProductoServicio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoProductoServicio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoProductoServicio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoProductoServicio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoProductoServicio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProductoServicio(false);
			
			//SI ES MANUAL
			if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProductoServicio();
			}
			
			//this.abrirFrameTreeTipoProductoServicio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Producto ServicioS ?", "MANTENIMIENTO DE Tipo Producto Servicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoProductoServicio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoProductoServicio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoproductoservicioReturnGeneral=tipoproductoservicioLogic.procesarImportacionTipoProductoServiciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoproductoservicioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoProductoServicioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoProductoServicio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoProductoServicio.setFileImportacion(this.jInternalFrameImportacionTipoProductoServicio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoProductoServicio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoProductoServicio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoProductoServicio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoProductoServicio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();		

		tipoproductoserviciosSeleccionados=this.getTipoProductoServiciosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoProductoServicioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoProductoServicioBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoProductoServicios("Todos",tipoproductoserviciosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProductoServicioConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoProductoServicio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoProductoServicioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoProductoServicioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProductoServicioConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();		
		
		tipoproductoserviciosSeleccionados=this.getTipoProductoServiciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoProductoServicios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoProductoServicioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProductoServicioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoProductoServicio tipoproductoservicio:tipoproductoserviciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoproductoservicio.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoProductoServicio(row);				
			//	iRow++;
			//}				
			
			//for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoProductoServicio(tipoproductoservicioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoproductoservicioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProductoServicio(false);
			
			//SI ES MANUAL
			if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProductoServicio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProductoServicio(false);
			
			//SI ES MANUAL
			if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProductoServicio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProductoServicio(false);
			
			//SI ES MANUAL
			if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProductoServicio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoProductoServicio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoProductoServicio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoProductoServicio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoProductoServicio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoProductoServicio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoProductoServicio.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoProductoServicio.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoProductoServicio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoProductoServicio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoProductoServicio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoProductoServicio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoProductoServicio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoProductoServicio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoProductoServicio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProductoServicio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoProductoServicio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoProductoServicioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoProductoServicioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoProductoServicio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoProductoServicio();
		
		this.inicializarActualizarBindingBotonesManualTipoProductoServicio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProductoServicio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProductoServicio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProductoServicio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProductoServicio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoProductoServicio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoProductoServicio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoProductoServicio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoProductoServicio.jCheckBoxPostAccionNuevoTipoProductoServicio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoProductoServicio.jCheckBoxPostAccionSinCerrarTipoProductoServicio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoProductoServicio.jCheckBoxPostAccionSinMensajeTipoProductoServicio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoProductoServicio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoProductoServicio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoProductoServicio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
				this.jInternalFrameDetalleFormTipoProductoServicio.jCheckBoxPostAccionNuevoTipoProductoServicio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoProductoServicio.jCheckBoxPostAccionSinCerrarTipoProductoServicio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoProductoServicio.jCheckBoxPostAccionSinMensajeTipoProductoServicio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoProductoServicio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoProductoServicio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoProductoServicio.jComboBoxTiposAccionesFormularioTipoProductoServicio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoProductoServicio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoProductoServicio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoProductoServicio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoProductoServicio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoProductoServicio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoProductoServicio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoProductoServicio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoProductoServicio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoProductoServicio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoProductoServicio(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProductoServicio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoProductoServicio() throws Exception {
		try	{
			if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProductoServicio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProductoServicio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoProductoServicio.jComboBoxTiposAccionesFormularioTipoProductoServicio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jComboBoxTiposAccionesFormularioTipoProductoServicio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProductoServicio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoProductoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoProductoServicio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoProductoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoProductoServicio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoProductoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoProductoServicio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoProductoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoProductoServicio.addItem(reporte);
			}
			
			
			if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoProductoServicio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoProductoServicio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoProductoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoProductoServicio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoProductoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoProductoServicio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoProductoServicio.jComboBoxTiposAccionesFormularioTipoProductoServicio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoProductoServicio.jComboBoxTiposAccionesFormularioTipoProductoServicio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoProductoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoProductoServicio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoProductoServicio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProductoServicio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProductoServicio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProductoServicio!=null) {
				this.jInternalFrameReporteDinamicoTipoProductoServicio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProductoServicio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProductoServicio!=null) {
				this.jInternalFrameReporteDinamicoTipoProductoServicio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProductoServicio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoProductoServicio!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProductoServicio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoProductoServicio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoProductoServicio.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoProductoServicio(Boolean esInicializar) throws Exception {				
		if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProductoServicio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoProductoServicio() throws Exception {
		this.inicializarActualizarBindingTablaTipoProductoServicio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoProductoServicio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoProductoServicioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoProductoServicioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoProductoServicioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProductoServicioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoProductoServicioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoProductoServicioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoProductoServicio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoproductoservicioLogic.getTipoProductoServicios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoproductoservicios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoProductoServicio.setModel(new TipoProductoServicioModel(this.tipoproductoservicioLogic.getTipoProductoServicios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoProductoServicio.setModel(new TipoProductoServicioModel(this.tipoproductoservicios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoProductoServicio!=null && this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoProductoServicio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoProductoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProductoServicio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoProductoServicioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO,tipoproductoservicioConstantesFunciones.resaltarSeleccionarTipoProductoServicio,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO,tipoproductoservicioConstantesFunciones.resaltarSeleccionarTipoProductoServicio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoProductoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProductoServicio,TipoProductoServicioConstantesFunciones.LABEL_ID));

		if(this.tipoproductoservicioConstantesFunciones.mostraridTipoProductoServicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProductoServicioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoproductoservicioConstantesFunciones.resaltaridTipoProductoServicio,this.tipoproductoservicioConstantesFunciones.activaridTipoProductoServicio,this,true,"idTipoProductoServicio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoproductoservicioConstantesFunciones.resaltaridTipoProductoServicio,this.tipoproductoservicioConstantesFunciones.activaridTipoProductoServicio,this,true,"idTipoProductoServicio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProductoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProductoServicio,TipoProductoServicioConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoproductoservicioConstantesFunciones.mostrarnombreTipoProductoServicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProductoServicioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoproductoservicioConstantesFunciones.resaltarnombreTipoProductoServicio,this.tipoproductoservicioConstantesFunciones.activarnombreTipoProductoServicio,this,true,"nombreTipoProductoServicio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoproductoservicioConstantesFunciones.resaltarnombreTipoProductoServicio,this.tipoproductoservicioConstantesFunciones.activarnombreTipoProductoServicio,this,true,"nombreTipoProductoServicio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoProductoServicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCuentaContableTipo && this.tipoproductoservicioConstantesFunciones.mostrarCuentaContableTipoTipoProductoServicio && !TipoProductoServicioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cuenta Contable Tipos");
				tableColumn.setHeaderValue("Cuenta Contable Tipos");
				tableColumn.setCellRenderer(new CuentaContableTipoTableCell(tipoproductoservicioConstantesFunciones.resaltarCuentaContableTipoTipoProductoServicio,this,this.tipoproductoservicioConstantesFunciones.activarCuentaContableTipoTipoProductoServicio));
				tableColumn.setCellEditor(new CuentaContableTipoTableCell(tipoproductoservicioConstantesFunciones.resaltarCuentaContableTipoTipoProductoServicio,this,this.tipoproductoservicioConstantesFunciones.activarCuentaContableTipoTipoProductoServicio));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProductoServicio.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroInventarioDefecto && this.tipoproductoservicioConstantesFunciones.mostrarParametroInventarioDefectoTipoProductoServicio && !TipoProductoServicioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(tipoproductoservicioConstantesFunciones.resaltarParametroInventarioDefectoTipoProductoServicio,this,this.tipoproductoservicioConstantesFunciones.activarParametroInventarioDefectoTipoProductoServicio));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(tipoproductoservicioConstantesFunciones.resaltarParametroInventarioDefectoTipoProductoServicio,this,this.tipoproductoservicioConstantesFunciones.activarParametroInventarioDefectoTipoProductoServicio));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProductoServicio.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProductoServicio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProductoServicio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoProductoServicio && this.isPermisoGuardarCambiosTipoProductoServicio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoProductoServicio.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoProductoServicio.addColumn(tableColumn);
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
			
			this.jTableDatosTipoProductoServicio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProductoServicio && this.isPermisoGuardarCambiosTipoProductoServicio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProductoServicio && this.isPermisoGuardarCambiosTipoProductoServicio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoProductoServicio.moveColumn(this.jTableDatosTipoProductoServicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoProductoServicio.moveColumn(this.jTableDatosTipoProductoServicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoProductoServicio.moveColumn(this.jTableDatosTipoProductoServicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoProductoServicio.moveColumn(this.jTableDatosTipoProductoServicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoProductoServicio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoProductoServicio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoProductoServicio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoProductoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoProductoServicio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoProductoServicio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoProductoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoProductoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoProductoServicio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoProductoServicio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoProductoServicio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoproductoservicioLogic.getTipoProductoServicios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoproductoservicios.size()-1;
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
		//this.jTableDatosTipoProductoServicio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoProductoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoProductoServicio();
			
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
				
				//this.isEsNuevoTipoProductoServicio=false;
					
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			
				if(this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoProductoServicio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProductoServicio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProductoServicio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoproductoservicio.getsType().equals("DUPLICADO")
				   || this.tipoproductoservicio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoProductoServicio=true;
				
				} else {
					this.isEsNuevoTipoProductoServicio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoproductoservicio.getId()>=0 && !this.tipoproductoservicio.getIsNew()) {						
						this.isEsNuevoTipoProductoServicio=false;
						
					} else {
						this.isEsNuevoTipoProductoServicio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoProductoServicio(esRelaciones);						
				
				this.seleccionarTipoProductoServicio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoproductoservicio.getId()<0) {
					this.isEsNuevoTipoProductoServicio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoProductoServicio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoProductoServicio(evt,rowIndex);
				}	
				
				if(this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoProductoServicio: " + this.dDif); 
					}
				}								
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoProductoServicio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoproductoservicio)) {
					if(this.tipoproductoservicio.getId()>0) {
						this.tipoproductoservicio.setIsDeleted(true);
						
						this.tipoproductoserviciosEliminados.add(this.tipoproductoservicio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoproductoservicioLogic.getTipoProductoServicios().remove(this.tipoproductoservicio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoproductoservicios.remove(this.tipoproductoservicio);				
					}
					
					
					((TipoProductoServicioModel) this.jTableDatosTipoProductoServicio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProductoServicio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoProductoServicio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoProductoServicio) {
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProductoServicio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProductoServicio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoProductoServicio(this.tipoproductoservicio);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoProductoServicio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoProductoServicio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProductoServicio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProductoServicio(TipoProductoServicio tipoproductoservicio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoProductoServicio(tipoproductoservicio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProductoServicio(TipoProductoServicio tipoproductoservicio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoProductoServicio(tipoproductoservicio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoProductoServicio(tipoproductoservicio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoProductoServicio(tipoproductoservicio);
	}
	
	public void setVariablesObjetoActualToFormularioTipoProductoServicio(TipoProductoServicio tipoproductoservicio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoProductoServicio.jTextFieldidTipoProductoServicio.setText(tipoproductoservicio.getId().toString());
			this.jInternalFrameDetalleFormTipoProductoServicio.jTextAreanombreTipoProductoServicio.setText(tipoproductoservicio.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoProductoServicio tipoproductoservicioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoproductoservicioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoProductoServicio tipoproductoservicioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoproductoservicioLocal=this.tipoproductoservicio;
			} else {
				tipoproductoservicioLocal=this.tipoproductoservicioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoproductoservicioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoProductoServicio(tipoproductoservicioLocal,true);
					
					if(tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoproductoservicioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoproductoservicioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoProductoServicio(TipoProductoServicio tipoproductoservicio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProductoServicio(tipoproductoservicio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(tipoproductoservicio);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProductoServicio(TipoProductoServicio tipoproductoservicio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProductoServicio(tipoproductoservicio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProductoServicio(TipoProductoServicio tipoproductoservicio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoProductoServicio.jTextFieldidTipoProductoServicio.getText()==null || this.jInternalFrameDetalleFormTipoProductoServicio.jTextFieldidTipoProductoServicio.getText()=="" || this.jInternalFrameDetalleFormTipoProductoServicio.jTextFieldidTipoProductoServicio.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoProductoServicio.jTextFieldidTipoProductoServicio.setText("0");
			}

			if(conColumnasBase) {tipoproductoservicio.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoProductoServicio.jTextFieldidTipoProductoServicio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProductoServicioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProductoServicio.jLabelIdTipoProductoServicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoproductoservicio.setnombre(this.jInternalFrameDetalleFormTipoProductoServicio.jTextAreanombreTipoProductoServicio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProductoServicioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProductoServicio.jLabelnombreTipoProductoServicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProductoServicio(TipoProductoServicio tipoproductoservicioBean,TipoProductoServicio tipoproductoservicio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoProductoServicio(TipoProductoServicio tipoproductoservicioOrigen,TipoProductoServicio tipoproductoservicio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoproductoservicioOrigen.getId()!=null && !tipoproductoservicioOrigen.getId().equals(0L))) {tipoproductoservicio.setId(tipoproductoservicioOrigen.getId());}}
			if(conDefault || (!conDefault && tipoproductoservicioOrigen.getnombre()!=null && !tipoproductoservicioOrigen.getnombre().equals(""))) {tipoproductoservicio.setnombre(tipoproductoservicioOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProductoServicio(TipoProductoServicio tipoproductoservicio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProductoServicio.jTextFieldidTipoProductoServicio.setText(tipoproductoservicio.getId().toString());
			this.jInternalFrameDetalleFormTipoProductoServicio.jTextAreanombreTipoProductoServicio.setText(tipoproductoservicio.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProductoServicio(TipoProductoServicioBean tipoproductoservicioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProductoServicio.jTextFieldidTipoProductoServicio.setText(tipoproductoservicioBean.getId().toString());
			this.jInternalFrameDetalleFormTipoProductoServicio.jTextAreanombreTipoProductoServicio.setText(tipoproductoservicioBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoProductoServicio(TipoProductoServicioParameterReturnGeneral tipoproductoservicioReturnGeneral,TipoProductoServicioBean tipoproductoservicioBean,Boolean conDefault) throws Exception { 
		try {
			TipoProductoServicio tipoproductoservicioLocal=new TipoProductoServicio();
			
			tipoproductoservicioLocal=tipoproductoservicioReturnGeneral.getTipoProductoServicio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoproductoservicioLocal.getId()!=null && !tipoproductoservicioLocal.getId().equals(0L))) {tipoproductoservicioBean.setId(tipoproductoservicioLocal.getId());}}
			if(conDefault || (!conDefault && tipoproductoservicioLocal.getnombre()!=null && !tipoproductoservicioLocal.getnombre().equals(""))) {tipoproductoservicioBean.setnombre(tipoproductoservicioLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoProductoServicioGenerico(Long idTipoProductoServicioSeleccionado,JComboBox jComboBoxTipoProductoServicio,List<TipoProductoServicio> tipoproductoserviciosLocal)throws Exception {
		try {
			TipoProductoServicio  tipoproductoservicioTemp=null;

			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosLocal) {
				if(tipoproductoservicioAux.getId()!=null && tipoproductoservicioAux.getId().equals(idTipoProductoServicioSeleccionado)) {
					tipoproductoservicioTemp=tipoproductoservicioAux;
					break;
				}
			}

			jComboBoxTipoProductoServicio.setSelectedItem(tipoproductoservicioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoProductoServicioGenerico(JComboBox jComboBoxTipoProductoServicio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoProductoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProductoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoProductoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProductoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProductoServicio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoProductoServicio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProductoServicio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoProductoServicio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoProductoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoProductoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("CuentaContableTipo")) {
			jButtonCuentaContableTipoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroInventarioDefecto")) {
			jButtonParametroInventarioDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoproductoservicio=(TipoProductoServicio) tipoproductoservicioLogic.getTipoProductoServicios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoproductoservicio =(TipoProductoServicio) tipoproductoservicios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoProductoServicio tipoproductoservicioRow=new TipoProductoServicio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoproductoservicioRow=(TipoProductoServicio) tipoproductoservicioLogic.getTipoProductoServicios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoproductoservicioRow=(TipoProductoServicio) tipoproductoservicios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCuentaContableTipoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProductoServicio tipoproductoservicio) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProductoServicio==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproductoservicio = (TipoProductoServicio)this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproductoservicio = (TipoProductoServicio)this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproductoservicio!=null) {
						this.tipoproductoservicio = tipoproductoservicio;
					} else {
						this.tipoproductoservicio = new TipoProductoServicio();
					}
				}

				if(this.isTienePermisosCuentaContableTipo && this.permiteMantenimiento(this.tipoproductoservicio)) {
					CuentaContableTipoBeanSwingJInternalFrame cuentacontabletipoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFramePopup=new CuentaContableTipoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cuentacontabletipoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFramePopup;
					} else {
						cuentacontabletipoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame;
					}

					List<TipoProductoServicio> tipoproductoservicios=new ArrayList<TipoProductoServicio>();
					tipoproductoservicios.add(this.tipoproductoservicio);
					if(!esRelacionado) {
						//cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.setConGuardarRelaciones(false);
						//cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cuentacontabletipoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProductoServicio.cargarCuentaContableTipoBeanSwingJInternalFrame(tipoproductoservicios,this.tipoproductoservicio,cuentacontabletipoBeanSwingJInternalFrame,/*conInicializar,*/cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.getConGuardarRelaciones(),cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
					cuentacontabletipoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cuentacontabletipoBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContableTipo("no_relacionado");

						cuentacontabletipoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CuentaContableTipoConstantesFunciones.ITAMANIOFILATABLA + (CuentaContableTipoConstantesFunciones.ITAMANIOFILATABLA/2));

						cuentacontabletipoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProductoServicio=(TitledBorder)this.jScrollPanelDatosTipoProductoServicio.getBorder();
						TitledBorder titledBorderCuentaContableTipo=(TitledBorder)cuentacontabletipoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContableTipo.getBorder();

						titledBorderCuentaContableTipo.setTitle(titledBorderTipoProductoServicio.getTitle() + " -> Cuenta Contable Tipo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontabletipoBeanSwingJInternalFrame);
						}

						cuentacontabletipoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cuentacontabletipoBeanSwingJInternalFrame);

						cuentacontabletipoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cuenta Contable Tipo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProductoServicio tipoproductoservicio) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProductoServicio==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproductoservicio = (TipoProductoServicio)this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproductoservicio = (TipoProductoServicio)this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproductoservicio!=null) {
						this.tipoproductoservicio = tipoproductoservicio;
					} else {
						this.tipoproductoservicio = new TipoProductoServicio();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.tipoproductoservicio)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<TipoProductoServicio> tipoproductoservicios=new ArrayList<TipoProductoServicio>();
					tipoproductoservicios.add(this.tipoproductoservicio);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProductoServicio.cargarParametroInventarioDefectoBeanSwingJInternalFrame(tipoproductoservicios,this.tipoproductoservicio,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProductoServicio=(TitledBorder)this.jScrollPanelDatosTipoProductoServicio.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderTipoProductoServicio.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoProductoServicio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoProductoServicio.setVisible((this.isVisibilidadCeldaNuevoTipoProductoServicio && this.isPermisoNuevoTipoProductoServicio));			
			this.jButtonDuplicarTipoProductoServicio.setVisible((this.isVisibilidadCeldaDuplicarTipoProductoServicio && this.isPermisoDuplicarTipoProductoServicio));			
			this.jButtonCopiarTipoProductoServicio.setVisible((this.isVisibilidadCeldaCopiarTipoProductoServicio && this.isPermisoCopiarTipoProductoServicio));
			this.jButtonVerFormTipoProductoServicio.setVisible((this.isVisibilidadCeldaVerFormTipoProductoServicio && this.isPermisoVerFormTipoProductoServicio));
			
			this.jButtonAbrirOrderByTipoProductoServicio.setVisible((this.isVisibilidadCeldaOrdenTipoProductoServicio && this.isPermisoOrdenTipoProductoServicio));			
			
			this.jButtonNuevoRelacionesTipoProductoServicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio && this.isPermisoNuevoTipoProductoServicio));			
			this.jButtonNuevoGuardarCambiosTipoProductoServicio.setVisible((this.isVisibilidadCeldaNuevoTipoProductoServicio && this.isPermisoNuevoTipoProductoServicio && this.isPermisoGuardarCambiosTipoProductoServicio));
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonModificarTipoProductoServicio.setVisible((this.isVisibilidadCeldaModificarTipoProductoServicio && this.isPermisoActualizarTipoProductoServicio));	
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonActualizarTipoProductoServicio.setVisible((this.isVisibilidadCeldaActualizarTipoProductoServicio && this.isPermisoActualizarTipoProductoServicio));	
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonEliminarTipoProductoServicio.setVisible((this.isVisibilidadCeldaEliminarTipoProductoServicio && this.isPermisoEliminarTipoProductoServicio));
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonCancelarTipoProductoServicio.setVisible(this.isVisibilidadCeldaCancelarTipoProductoServicio);							
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonGuardarCambiosTipoProductoServicio.setVisible((this.isVisibilidadCeldaGuardarTipoProductoServicio && this.isPermisoGuardarCambiosTipoProductoServicio));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoProductoServicio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio && this.isPermisoGuardarCambiosTipoProductoServicio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoProductoServicio.setVisible((this.isVisibilidadCeldaNuevoTipoProductoServicio && this.isPermisoNuevoTipoProductoServicio));						
			this.jButtonDuplicarToolBarTipoProductoServicio.setVisible((this.isVisibilidadCeldaDuplicarTipoProductoServicio && this.isPermisoDuplicarTipoProductoServicio));						
			this.jButtonCopiarToolBarTipoProductoServicio.setVisible((this.isVisibilidadCeldaCopiarTipoProductoServicio && this.isPermisoCopiarTipoProductoServicio));			
			this.jButtonVerFormToolBarTipoProductoServicio.setVisible((this.isVisibilidadCeldaVerFormTipoProductoServicio && this.isPermisoVerFormTipoProductoServicio));			
			this.jButtonAbrirOrderByToolBarTipoProductoServicio.setVisible((this.isVisibilidadCeldaOrdenTipoProductoServicio && this.isPermisoOrdenTipoProductoServicio));
			this.jButtonNuevoRelacionesToolBarTipoProductoServicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio && this.isPermisoNuevoTipoProductoServicio));			
			this.jButtonNuevoGuardarCambiosToolBarTipoProductoServicio.setVisible((this.isVisibilidadCeldaNuevoTipoProductoServicio && this.isPermisoNuevoTipoProductoServicio && this.isPermisoGuardarCambiosTipoProductoServicio));			
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonModificarToolBarTipoProductoServicio.setVisible((this.isVisibilidadCeldaModificarTipoProductoServicio && this.isPermisoActualizarTipoProductoServicio));	
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonActualizarToolBarTipoProductoServicio.setVisible((this.isVisibilidadCeldaActualizarTipoProductoServicio  && this.isPermisoActualizarTipoProductoServicio));	
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonEliminarToolBarTipoProductoServicio.setVisible((this.isVisibilidadCeldaEliminarTipoProductoServicio && this.isPermisoEliminarTipoProductoServicio));
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonCancelarToolBarTipoProductoServicio.setVisible(this.isVisibilidadCeldaCancelarTipoProductoServicio);				
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonGuardarCambiosToolBarTipoProductoServicio.setVisible((this.isVisibilidadCeldaGuardarTipoProductoServicio && this.isPermisoGuardarCambiosTipoProductoServicio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoProductoServicio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio && this.isPermisoGuardarCambiosTipoProductoServicio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoProductoServicio.setVisible((this.isVisibilidadCeldaNuevoTipoProductoServicio && this.isPermisoNuevoTipoProductoServicio));			
			this.jMenuItemDuplicarTipoProductoServicio.setVisible((this.isVisibilidadCeldaDuplicarTipoProductoServicio && this.isPermisoDuplicarTipoProductoServicio));			
			this.jMenuItemCopiarTipoProductoServicio.setVisible((this.isVisibilidadCeldaCopiarTipoProductoServicio && this.isPermisoCopiarTipoProductoServicio));			
			this.jMenuItemVerFormTipoProductoServicio.setVisible((this.isVisibilidadCeldaVerFormTipoProductoServicio && this.isPermisoVerFormTipoProductoServicio));			
			this.jMenuItemAbrirOrderByTipoProductoServicio.setVisible((this.isVisibilidadCeldaOrdenTipoProductoServicio && this.isPermisoOrdenTipoProductoServicio));			
			//this.jMenuItemMostrarOcultarTipoProductoServicio.setVisible((this.isVisibilidadCeldaOrdenTipoProductoServicio && this.isPermisoOrdenTipoProductoServicio));
			this.jMenuItemDetalleAbrirOrderByTipoProductoServicio.setVisible((this.isVisibilidadCeldaOrdenTipoProductoServicio && this.isPermisoOrdenTipoProductoServicio));			
			//this.jMenuItemDetalleMostrarOcultarTipoProductoServicio.setVisible((this.isVisibilidadCeldaOrdenTipoProductoServicio && this.isPermisoOrdenTipoProductoServicio));			
			this.jMenuItemNuevoRelacionesTipoProductoServicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio && this.isPermisoNuevoTipoProductoServicio));			
			this.jMenuItemNuevoGuardarCambiosTipoProductoServicio.setVisible((this.isVisibilidadCeldaNuevoTipoProductoServicio && this.isPermisoNuevoTipoProductoServicio && this.isPermisoGuardarCambiosTipoProductoServicio));									
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemModificarTipoProductoServicio.setVisible((this.isVisibilidadCeldaModificarTipoProductoServicio && this.isPermisoActualizarTipoProductoServicio));	
			this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemActualizarTipoProductoServicio.setVisible((this.isVisibilidadCeldaActualizarTipoProductoServicio && this.isPermisoActualizarTipoProductoServicio));	
			this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemEliminarTipoProductoServicio.setVisible((this.isVisibilidadCeldaEliminarTipoProductoServicio && this.isPermisoEliminarTipoProductoServicio));
			this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemCancelarTipoProductoServicio.setVisible(this.isVisibilidadCeldaCancelarTipoProductoServicio);				
			}
			
			this.jMenuItemGuardarCambiosTipoProductoServicio.setVisible((this.isVisibilidadCeldaGuardarTipoProductoServicio && this.isPermisoGuardarCambiosTipoProductoServicio));						
			this.jMenuItemGuardarCambiosTablaTipoProductoServicio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio && this.isPermisoGuardarCambiosTipoProductoServicio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoProductoServicio=this.jButtonNuevoTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaDuplicarTipoProductoServicio=this.jButtonDuplicarTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaCopiarTipoProductoServicio=this.jButtonCopiarTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaVerFormTipoProductoServicio=this.jButtonVerFormTipoProductoServicio.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoProductoServicio=this.jButtonAbrirOrderByTipoProductoServicio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=this.jButtonNuevoRelacionesTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaModificarTipoProductoServicio=this.jButtonModificarTipoProductoServicio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
			this.isVisibilidadCeldaActualizarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jButtonActualizarTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaEliminarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jButtonEliminarTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaCancelarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jButtonCancelarTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaGuardarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jButtonGuardarCambiosTipoProductoServicio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=this.jButtonGuardarCambiosTablaTipoProductoServicio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoProductoServicio=this.jButtonNuevoToolBarTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=this.jButtonNuevoRelacionesToolBarTipoProductoServicio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
			this.isVisibilidadCeldaModificarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jButtonModificarToolBarTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaActualizarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jButtonActualizarToolBarTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaEliminarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jButtonEliminarToolBarTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaCancelarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jButtonCancelarToolBarTipoProductoServicio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProductoServicio=this.jButtonGuardarCambiosToolBarTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=this.jButtonGuardarCambiosTablaToolBarTipoProductoServicio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoProductoServicio=this.jMenuItemNuevoTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=this.jMenuItemNuevoRelacionesTipoProductoServicio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
			this.isVisibilidadCeldaModificarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemModificarTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaActualizarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemActualizarTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaEliminarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemEliminarTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaCancelarTipoProductoServicio=this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemCancelarTipoProductoServicio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProductoServicio=this.jMenuItemGuardarCambiosTipoProductoServicio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=this.jMenuItemGuardarCambiosTablaTipoProductoServicio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoProductoServicio(Boolean esInicializar) {
		if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProductoServicio();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoProductoServicio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoProductoServicio() {
		this.jButtonNuevoTipoProductoServicio.setVisible(this.isPermisoNuevoTipoProductoServicio);			
		this.jButtonDuplicarTipoProductoServicio.setVisible(this.isPermisoDuplicarTipoProductoServicio);			
		this.jButtonCopiarTipoProductoServicio.setVisible(this.isPermisoCopiarTipoProductoServicio);			
		this.jButtonVerFormTipoProductoServicio.setVisible(this.isPermisoVerFormTipoProductoServicio);			
		
		this.jButtonAbrirOrderByTipoProductoServicio.setVisible(this.isPermisoOrdenTipoProductoServicio);					
		
		this.jButtonNuevoRelacionesTipoProductoServicio.setVisible(this.isPermisoNuevoTipoProductoServicio);			
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonModificarTipoProductoServicio.setVisible(this.isPermisoActualizarTipoProductoServicio);	
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonActualizarTipoProductoServicio.setVisible(this.isPermisoActualizarTipoProductoServicio);	
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonEliminarTipoProductoServicio.setVisible(this.isPermisoEliminarTipoProductoServicio);
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonCancelarTipoProductoServicio.setVisible(this.isVisibilidadCeldaCancelarTipoProductoServicio);						
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonGuardarCambiosTipoProductoServicio.setVisible(this.isPermisoGuardarCambiosTipoProductoServicio);							
		}
		
		this.jButtonGuardarCambiosTablaTipoProductoServicio.setVisible(this.isPermisoActualizarTipoProductoServicio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProductoServicio() {
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonModificarTipoProductoServicio.setVisible(this.isPermisoActualizarTipoProductoServicio);	
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonActualizarTipoProductoServicio.setVisible(this.isPermisoActualizarTipoProductoServicio);	
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonEliminarTipoProductoServicio.setVisible(this.isPermisoEliminarTipoProductoServicio);
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonCancelarTipoProductoServicio.setVisible(this.isVisibilidadCeldaCancelarTipoProductoServicio);							
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonGuardarCambiosTipoProductoServicio.setVisible((this.isVisibilidadCeldaGuardarTipoProductoServicio && this.isPermisoGuardarCambiosTipoProductoServicio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoProductoServicio() {
		if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoProductoServicio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoProductoServicio() {
	}
	
	public void jTableDatosTipoProductoServicioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoProductoServicio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoProductoServicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProductoServicio(this.gettipoproductoservicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(this.tipoproductoservicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoproductoservicio==null) {
						this.tipoproductoservicio = new TipoProductoServicio();
					}

					this.setVariablesFormularioToObjetoActualTipoProductoServicio(this.tipoproductoservicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(this.tipoproductoservicio);
				}

				if(this.tipoproductoservicio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoproductoservicio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProductoServicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoProductoServicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProductoServicio(this.gettipoproductoservicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(this.tipoproductoservicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoproductoservicio==null) {
						this.tipoproductoservicio = new TipoProductoServicio();
					}

					this.setVariablesFormularioToObjetoActualTipoProductoServicio(this.tipoproductoservicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(this.tipoproductoservicio);
				}

				if(this.tipoproductoservicio.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoproductoservicio.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProductoServicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoProductoServicioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoProductoServicio(false,false);

			this.getTipoProductoServiciosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoProductoServicio(false);

			//if(TipoProductoServicioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoProductoServicio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoProductoServicio() {
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
		

		if(this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicio.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoProductoServicio.dispose();
			this.jInternalFrameDetalleFormTipoProductoServicio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoProductoServicio!=null) {
			this.jInternalFrameReporteDinamicoTipoProductoServicio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoProductoServicio.dispose();
			this.jInternalFrameReporteDinamicoTipoProductoServicio=null;
		}
		
		if(this.jInternalFrameImportacionTipoProductoServicio!=null) {
			this.jInternalFrameImportacionTipoProductoServicio.setVisible(false);	    			
			this.jInternalFrameImportacionTipoProductoServicio.dispose();
			this.jInternalFrameImportacionTipoProductoServicio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoProductoServicio();
			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoProductoServicio")) {
				jButtonNuevoTipoProductoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoProductoServicio")) {
				jButtonDuplicarTipoProductoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoProductoServicio")) {
				jButtonCopiarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoProductoServicio")) {
				jButtonVerFormTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoProductoServicio")) {
				jButtonNuevoTipoProductoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoProductoServicio")) {
				jButtonDuplicarTipoProductoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoProductoServicio")) {
				jButtonNuevoTipoProductoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoProductoServicio")) {
				jButtonDuplicarTipoProductoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoProductoServicio")) {
				jButtonNuevoTipoProductoServicioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoProductoServicio")) {
				jButtonNuevoTipoProductoServicioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoProductoServicio")) {
				jButtonNuevoTipoProductoServicioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoProductoServicio")) {
				jButtonModificarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoProductoServicio")) {
				jButtonModificarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoProductoServicio")) {
				jButtonModificarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoProductoServicio")) {
				jButtonActualizarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoProductoServicio")) {
				jButtonActualizarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoProductoServicio")) {
				jButtonActualizarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoProductoServicio")) {
				jButtonEliminarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoProductoServicio")) {
				jButtonEliminarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoProductoServicio")) {
				jButtonEliminarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoProductoServicio")) {
				jButtonCancelarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoProductoServicio")) {
				jButtonCancelarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoProductoServicio")) {
				jButtonCancelarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoProductoServicio")) {
				jButtonCerrarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoProductoServicio")) {
				jButtonCerrarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoProductoServicio")) {
				jButtonCerrarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoProductoServicio")) {
				jButtonMostrarOcultarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoProductoServicio")) {
				jButtonCancelarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoProductoServicio")) {
				jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoProductoServicio")) {
				jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoProductoServicio")) {
				jButtonCopiarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoProductoServicio")) {
				jButtonVerFormTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoProductoServicio")) {
				jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoProductoServicio")) {
				jButtonCopiarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoProductoServicio")) {
				jButtonVerFormTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoProductoServicio")) {
				jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoProductoServicio")) {
				jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoProductoServicio")) {
				jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoProductoServicio")) {
				jButtonRecargarInformacionTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoProductoServicio")) {
				jButtonRecargarInformacionTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoProductoServicio")) {
				jButtonRecargarInformacionTipoProductoServicioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoProductoServicio")) {
				jButtonAnterioresTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoProductoServicio")) {
				jButtonAnterioresTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoProductoServicio")) {
				jButtonAnterioresTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoProductoServicio")) {
				jButtonSiguientesTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoProductoServicio")) {
				jButtonSiguientesTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoProductoServicio")) {
				jButtonSiguientesTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoProductoServicio") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoProductoServicio")) {
				jButtonAbrirOrderByTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoProductoServicio") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoProductoServicio")) {
				jButtonMostrarOcultarTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProductoServicio")) {
				jButtonNuevoGuardarCambiosTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoProductoServicio")) {
				jButtonNuevoGuardarCambiosTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoProductoServicio")) {
				jButtonNuevoGuardarCambiosTipoProductoServicioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoProductoServicio")) {
				jButtonCerrarReporteDinamicoTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoProductoServicio")) {
				jButtonGenerarReporteDinamicoTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoProductoServicio")) {
				
				jButtonGenerarExcelReporteDinamicoTipoProductoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoProductoServicio")) {
				jButtonCerrarImportacionTipoProductoServicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoProductoServicio")) {
				
				jButtonGenerarImportacionTipoProductoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoProductoServicio")) {
				
				jButtonAbrirImportacionTipoProductoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoProductoServicio")) {
				jComboBoxTiposAccionesTipoProductoServicioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoProductoServicio")) {
				jComboBoxTiposRelacionesTipoProductoServicioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoProductoServicio")) {
				jComboBoxTiposAccionesTipoProductoServicioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoProductoServicio")) {
				
				jComboBoxTiposSeleccionarTipoProductoServicioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoProductoServicio")) {
				jTextFieldValorCampoGeneralTipoProductoServicioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoProductoServicio")) {
				jButtonAbrirOrderByTipoProductoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoProductoServicio")) {
				jButtonAbrirOrderByTipoProductoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoProductoServicio")) {
				jButtonCerrarOrderByTipoProductoServicioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProductoServicioBusqueda")) {
				this.jButtonidTipoProductoServicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProductoServicioBusqueda")) {
				this.jButtonnombreTipoProductoServicioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoProductoServicio")) {
				this.jButtonBusquedaPorNombreTipoProductoServicioActionPerformed(evt);
			}
			
			;
			
			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoProductoServicio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				


				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoProductoServicio tipoproductoservicioLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoproductoservicioLocal=this.tipoproductoservicio;
			} else {
				tipoproductoservicioLocal=this.tipoproductoservicioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
							
				
				


				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
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
			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			
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
			
			


			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
								
						
				


				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
								
				
				


				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
							
				
				


				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
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
			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			
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
			
			


			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
								
				
				


				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoProductoServicio")) {
					jCheckBoxSeleccionarTodosTipoProductoServicioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoProductoServicio")) {
					jCheckBoxSeleccionadosTipoProductoServicioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoProductoServicio")) {
					
				}
				
				


				
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
												
				
				


				
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
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
			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
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
			
			


			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicio);
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
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
				
				


				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicioAnterior =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoProductoServicio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoProductoServicioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoProductoServicio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoproductoservicio =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoproductoservicio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoProductoServicio")) {
				
				}
				
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoProductoServicio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoProductoServicio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoProductoServicio")) {
			
			}
			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoProductoServicio();
			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			
			if(sTipo.equals("NuevoTipoProductoServicio")) {
				jButtonNuevoTipoProductoServicioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoProductoServicio")) {
				jButtonDuplicarTipoProductoServicioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoProductoServicio")) {
				jButtonCopiarTipoProductoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoProductoServicio")) {
				jButtonVerFormTipoProductoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoProductoServicio")) {
				jButtonNuevoTipoProductoServicioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoProductoServicio")) {
				jButtonModificarTipoProductoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoProductoServicio")) {
				jButtonActualizarTipoProductoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoProductoServicio")) {
				jButtonEliminarTipoProductoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoProductoServicio")) {
				jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoProductoServicio")) {
				jButtonCancelarTipoProductoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoProductoServicio")) {
				jButtonCerrarTipoProductoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoProductoServicio")) {
				jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProductoServicio")) {
				jButtonNuevoGuardarCambiosTipoProductoServicioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoProductoServicio")) {
				jButtonAbrirOrderByTipoProductoServicioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoProductoServicio")) {
				jButtonRecargarInformacionTipoProductoServicioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoProductoServicio")) {
				jButtonAnterioresTipoProductoServicioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoProductoServicio")) {
				jButtonSiguientesTipoProductoServicioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProductoServicioBusqueda")) {
				this.jButtonidTipoProductoServicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProductoServicioBusqueda")) {
				this.jButtonnombreTipoProductoServicioBusquedaActionPerformed(evt);
			}
			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoProductoServicio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoProductoServicio")) {
				closingInternalFrameTipoProductoServicio();
				
			} else if(sTipo.equals("jButtonCancelarTipoProductoServicio")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoProductoServicio = (JInternalFrameBase)evt.getSource();
	            	
	            TipoProductoServicioBeanSwingJInternalFrame jInternalFrameParent=(TipoProductoServicioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProductoServicio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoProductoServicioActionPerformed(null);
			}
			
			TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoproductoservicio,new Object(),this.tipoproductoservicioParameterGeneral,this.tipoproductoservicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoProductoServicio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoProductoServicio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoProductoServicio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoproductoservicio)) {
			if(!esControlTabla) {
				if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoProductoServicio(this.tipoproductoservicio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(this.tipoproductoservicio);			
				}
				
				if(this.tipoproductoservicioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoProductoServicio(this.tipoproductoservicio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoproductoservicioReturnGeneral=tipoproductoservicioLogic.procesarEventosTipoProductoServiciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproductoservicioLogic.getTipoProductoServicios(),this.tipoproductoservicio,this.tipoproductoservicioParameterGeneral,this.isEsNuevoTipoProductoServicio,classes);//this.tipoproductoservicioLogic.getTipoProductoServicio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoProductoServicio(this.tipoproductoservicioReturnGeneral,this.tipoproductoservicioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoproductoservicioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoProductoServicio(classes,this.tipoproductoservicioReturnGeneral,this.tipoproductoservicioBean,false);
					}
						
					if(this.tipoproductoservicioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoProductoServicio(this.tipoproductoservicioReturnGeneral.getTipoProductoServicio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoProductoServicio(this.tipoproductoservicioReturnGeneral.getTipoProductoServicio());	
					}
						
					if(this.tipoproductoservicioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoProductoServicio(this.tipoproductoservicioReturnGeneral.getTipoProductoServicio(),classes);//this.tipoproductoservicioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoProductoServicio(this.tipoproductoservicio,classes);//this.tipoproductoservicioBean);									
				}
			
				if(TipoProductoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoProductoServicio(this.tipoproductoservicio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicio(this.tipoproductoservicio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoproductoservicioAnterior!=null) {
						this.tipoproductoservicio=this.tipoproductoservicioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoproductoservicioReturnGeneral=tipoproductoservicioLogic.procesarEventosTipoProductoServiciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproductoservicioLogic.getTipoProductoServicios(),this.tipoproductoservicio,this.tipoproductoservicioParameterGeneral,this.isEsNuevoTipoProductoServicio,classes);//this.tipoproductoservicioLogic.getTipoProductoServicio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoproductoservicioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoproductoservicioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoproductoservicioReturnGeneral.getTipoProductoServicio(),tipoproductoservicioLogic.getTipoProductoServicios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoproductoservicioReturnGeneral.getTipoProductoServicio(),this.tipoproductoservicios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoProductoServicio.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoProductoServicio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoProductoServicio();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoProductoServicio() throws Exception {
		
		TipoProductoServicioModel tipoproductoservicioModel=(TipoProductoServicioModel)this.jTableDatosTipoProductoServicio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoproductoservicioModel.tipoproductoservicios=this.tipoproductoservicioLogic.getTipoProductoServicios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoproductoservicioModel.tipoproductoservicios=this.tipoproductoservicios;
		}
		
		
		((TipoProductoServicioModel) this.jTableDatosTipoProductoServicio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoProductoServicio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoproductoservicioAnterior(),this.tipoproductoservicioLogic.getTipoProductoServicios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoproductoservicioAnterior(),this.tipoproductoservicios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoProductoServicio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoProductoServicio(TipoProductoServicio tipoproductoservicio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContableTipo.class)) {
					this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.setCuentaContableTipos(tipoproductoservicio.getCuentaContableTipos());
					this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContableTipo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(tipoproductoservicio.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
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
										
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproductoservicio,new Object(),generalEntityParameterGeneral,this.tipoproductoservicioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoProductoServicioConstantesFunciones.getClassesRelationshipsOfTipoProductoServicio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoProductoServicioConstantesFunciones.getClassesRelationshipsFromStringsOfTipoProductoServicio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoProductoServicio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoProductoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproductoservicio,new Object(),generalEntityParameterGeneral,this.tipoproductoservicioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoProductoServicio(TipoProductoServicioBean tipoproductoservicioBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContableTipo.class)) {
					this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.setCuentaContableTipos(tipoproductoservicio.getCuentaContableTipos());
					this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContableTipo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(tipoproductoservicio.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoProductoServicio(ArrayList<Classe> classes,TipoProductoServicioReturnGeneral tipoproductoservicioReturnGeneral,TipoProductoServicioBean tipoproductoservicioBean,Boolean conDefault) throws Exception {
		
			this.tipoproductoservicioBean.setCuentaContableTipos(tipoproductoservicioReturnGeneral.getTipoProductoServicio().getCuentaContableTipos());
			this.tipoproductoservicioBean.setParametroInventarioDefectos(tipoproductoservicioReturnGeneral.getTipoProductoServicio().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoProductoServicio(TipoProductoServicio tipoproductoservicio,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContableTipo.class)) {
					tipoproductoservicio.setCuentaContableTipos(this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					tipoproductoservicio.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoproductoservicio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoProductoServicio = new TipoProductoServicioDetalleFormJInternalFrame(jDesktopPane,this.tipoproductoservicioSessionBean.getConGuardarRelaciones(),this.tipoproductoservicioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProductoServicio);
		this.jInternalFrameDetalleFormTipoProductoServicio.setVisible(false);
		this.jInternalFrameDetalleFormTipoProductoServicio.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoProductoServicio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoProductoServicio.tipoproductoservicioLogic=this.tipoproductoservicioLogic;
		
		this.cargarCombosFrameForeignKeyTipoProductoServicio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProductoServicio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProductoServicio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoProductoServicio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoProductoServicio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoProductoServicio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProductoServicio"));
		
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonModificarTipoProductoServicio.addActionListener(new ButtonActionListener(this,"ModificarTipoProductoServicio"));

		
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonModificarToolBarTipoProductoServicio.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProductoServicio"));
					
		this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemModificarTipoProductoServicio.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProductoServicio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonActualizarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"ActualizarTipoProductoServicio"));
		
		
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonActualizarToolBarTipoProductoServicio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProductoServicio"));
						
		this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemActualizarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProductoServicio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonEliminarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"EliminarTipoProductoServicio"));
		
		
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonEliminarToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProductoServicio"));
								
		this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemEliminarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProductoServicio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonCancelarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"CancelarTipoProductoServicio"));
		
		
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonCancelarToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProductoServicio"));
					
		this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemCancelarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProductoServicio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemDetalleCerrarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProductoServicio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonGuardarCambiosToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProductoServicio"));
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonGuardarCambiosToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProductoServicio"));
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicio.jComboBoxTiposAccionesFormularioTipoProductoServicio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProductoServicio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonidTipoProductoServicioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProductoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonnombreTipoProductoServicioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProductoServicioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoProductoServicio.jTabbedPaneRelacionesTipoProductoServicio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProductoServicio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoProductoServicio"));
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProductoServicio"));
		}
		
		this.jTableDatosTipoProductoServicio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoProductoServicio"));
		
		this.jTableDatosTipoProductoServicio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoProductoServicio"));
		
		this.jButtonNuevoTipoProductoServicio.addActionListener(new ButtonActionListener(this,"NuevoTipoProductoServicio"));
		
		this.jButtonDuplicarTipoProductoServicio.addActionListener(new ButtonActionListener(this,"DuplicarTipoProductoServicio"));
		
		this.jButtonCopiarTipoProductoServicio.addActionListener(new ButtonActionListener(this,"CopiarTipoProductoServicio"));
		
		this.jButtonVerFormTipoProductoServicio.addActionListener(new ButtonActionListener(this,"VerFormTipoProductoServicio"));
		
		
		this.jButtonNuevoToolBarTipoProductoServicio.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoProductoServicio"));
			
		this.jButtonDuplicarToolBarTipoProductoServicio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoProductoServicio"));
			
		this.jMenuItemNuevoTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoProductoServicio"));
			
		this.jMenuItemDuplicarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoProductoServicio"));		
		
		
		this.jButtonNuevoRelacionesTipoProductoServicio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoProductoServicio"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoProductoServicio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoProductoServicio"));
			
		this.jMenuItemNuevoRelacionesTipoProductoServicio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoProductoServicio"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonModificarTipoProductoServicio.addActionListener(new ButtonActionListener(this,"ModificarTipoProductoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonModificarToolBarTipoProductoServicio.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProductoServicio"));
			
			this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemModificarTipoProductoServicio.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProductoServicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonActualizarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"ActualizarTipoProductoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonActualizarToolBarTipoProductoServicio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProductoServicio"));
				
			this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemActualizarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProductoServicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonEliminarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"EliminarTipoProductoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonEliminarToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProductoServicio"));
						
			this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemEliminarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProductoServicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonCancelarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"CancelarTipoProductoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonCancelarToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProductoServicio"));
			
			this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemCancelarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProductoServicio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoProductoServicio"));		
		
		
		this.jButtonCerrarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"CerrarTipoProductoServicio"));
		
		
		this.jButtonCerrarToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoProductoServicio"));
			
		this.jMenuItemCerrarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoProductoServicio"));
			
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jMenuItemDetalleCerrarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProductoServicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonGuardarCambiosTipoProductoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoProductoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jButtonGuardarCambiosToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProductoServicio"));
		}
		
		this.jButtonCopiarToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoProductoServicio"));
			
		this.jButtonVerFormToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoProductoServicio"));
		
		this.jMenuItemGuardarCambiosTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoProductoServicio"));
			
		this.jMenuItemCopiarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoProductoServicio"));		
		
		this.jMenuItemVerFormTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoProductoServicio"));		
		
		
		this.jButtonGuardarCambiosTablaTipoProductoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProductoServicio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoProductoServicio"));
			
		this.jMenuItemGuardarCambiosTablaTipoProductoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProductoServicio"));		
		
		
		
		this.jButtonRecargarInformacionTipoProductoServicio.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoProductoServicio"));
					
		this.jButtonRecargarInformacionToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoProductoServicio"));
		
		this.jMenuItemRecargarInformacionTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoProductoServicio"));		
		
		
		
		this.jButtonAnterioresTipoProductoServicio.addActionListener (new ButtonActionListener(this,"AnterioresTipoProductoServicio"));
		
		
		this.jButtonAnterioresToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoProductoServicio"));
		
		this.jMenuItemAnterioresTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoProductoServicio"));		
		
		
		this.jButtonSiguientesTipoProductoServicio.addActionListener (new ButtonActionListener(this,"SiguientesTipoProductoServicio"));
		
		
		this.jButtonSiguientesToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoProductoServicio"));
			
		this.jMenuItemSiguientesTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoProductoServicio"));
			
		this.jMenuItemAbrirOrderByTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoProductoServicio"));
			
		this.jMenuItemMostrarOcultarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoProductoServicio"));
			
		this.jMenuItemDetalleAbrirOrderByTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoProductoServicio"));
			
		this.jMenuItemDetalleMostarOcultarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoProductoServicio"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoProductoServicio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoProductoServicio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoProductoServicio"));
			
		this.jMenuItemNuevoGuardarCambiosTipoProductoServicio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoProductoServicio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoProductoServicio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoProductoServicio"));

		this.jCheckBoxSeleccionadosTipoProductoServicio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoProductoServicio"));
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jComboBoxTiposAccionesFormularioTipoProductoServicio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProductoServicio"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoProductoServicio.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoProductoServicio"));
			
		this.jComboBoxTiposAccionesTipoProductoServicio.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoProductoServicio"));
					
		this.jComboBoxTiposSeleccionarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoProductoServicio"));
			
		this.jTextFieldValorCampoGeneralTipoProductoServicio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoProductoServicio"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonidTipoProductoServicioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProductoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonnombreTipoProductoServicioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProductoServicioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoProductoServicio.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoProductoServicio"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoProductoServicio!=null) {
				this.jInternalFrameReporteDinamicoTipoProductoServicio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProductoServicio"));
				this.jInternalFrameReporteDinamicoTipoProductoServicio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProductoServicio"));
				this.jInternalFrameReporteDinamicoTipoProductoServicio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProductoServicio"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoProductoServicio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProductoServicio"));				
			//this.jButtonGenerarReporteDinamicoTipoProductoServicio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProductoServicio"));
			//this.jButtonGenerarExcelReporteDinamicoTipoProductoServicio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProductoServicio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoProductoServicio!=null) {
				this.jInternalFrameImportacionTipoProductoServicio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProductoServicio"));
				this.jInternalFrameImportacionTipoProductoServicio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProductoServicio"));
				this.jInternalFrameImportacionTipoProductoServicio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProductoServicio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoProductoServicio.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoProductoServicio"));
			
			this.jButtonAbrirOrderByToolBarTipoProductoServicio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoProductoServicio"));			
			
			if(this.jInternalFrameOrderByTipoProductoServicio!=null) {
				this.jInternalFrameOrderByTipoProductoServicio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProductoServicio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicio.jTabbedPaneRelacionesTipoProductoServicio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProductoServicio"));
		
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
            		closingInternalFrameTipoProductoServicio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoProductoServicio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoProductoServicio = (JInternalFrameBase)event.getSource();
	            	
	            TipoProductoServicioBeanSwingJInternalFrame jInternalFrameParent=(TipoProductoServicioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProductoServicio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoProductoServicioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoProductoServicio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoProductoServicioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoProductoServicio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoProductoServicio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoServicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoServicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoServicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoProductoServicio";
		inputMap = this.jButtonNuevoTipoProductoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoProductoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProductoServicioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoServicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoServicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoServicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoProductoServicio";
		inputMap = this.jButtonNuevoRelacionesTipoProductoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoProductoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProductoServicioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoProductoServicio";
		inputMap = this.jButtonModificarTipoProductoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoProductoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoProductoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoProductoServicio";
		inputMap = this.jButtonActualizarTipoProductoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoProductoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoProductoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoProductoServicio";
		inputMap = this.jButtonEliminarTipoProductoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoProductoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoProductoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoProductoServicio";
		inputMap = this.jButtonCancelarTipoProductoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoProductoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoProductoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoProductoServicio";
		inputMap = this.jButtonCerrarTipoProductoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoProductoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoProductoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonGuardarCambiosTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoProductoServicio";
		inputMap = this.jInternalFrameDetalleFormTipoProductoServicio.jButtonGuardarCambiosTipoProductoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonGuardarCambiosTipoProductoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoProductoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoProductoServicio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoProductoServicioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoProductoServicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoProductoServicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoProductoServicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoProductoServicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoProductoServicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoProductoServicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonidTipoProductoServicioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProductoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProductoServicio.jButtonnombreTipoProductoServicioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProductoServicioBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoProductoServicio.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoProductoServicio"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoProductoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoProductoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoProductoServicioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoProductoServicio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoProductoServicio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicioLogic.getTipoProductoServicios()) {
					tipoproductoservicioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProductoServicio tipoproductoservicioAux:tipoproductoservicios) {
					tipoproductoservicioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoProductoServicioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProductoServicio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicioLogic.getTipoProductoServicios()) {
						tipoproductoservicioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProductoServicio tipoproductoservicioAux:tipoproductoservicios) {
						tipoproductoservicioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicioLogic.getTipoProductoServicios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProductoServicio tipoproductoservicioAux:tipoproductoservicios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProductoServicio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProductoServicio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProductoServicio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProductoServicio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoProductoServicioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProductoServicio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoProductoServicio.getSelectedRows();
			
			TipoProductoServicio tipoproductoservicioLocal=new TipoProductoServicio();
			
			//this.seleccionarTodosTipoProductoServicio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoservicioLocal =(TipoProductoServicio) this.tipoproductoservicioLogic.getTipoProductoServicios().toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoproductoservicioLocal =(TipoProductoServicio) this.tipoproductoservicios.toArray()[this.jTableDatosTipoProductoServicio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoproductoservicioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicioLogic.getTipoProductoServicios()) {
						tipoproductoservicioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProductoServicio tipoproductoservicioAux:tipoproductoservicios) {
						tipoproductoservicioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoProductoServicio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProductoServicio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProductoServicio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProductoServicio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoProductoServicioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoProductoServicioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoProductoServicioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoProductoServicio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoProductoServicio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicioLogic.getTipoProductoServicios()) {
				
						if(sTipoSeleccionar.equals(TipoProductoServicioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoproductoservicioAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProductoServicio tipoproductoservicioAux:tipoproductoservicios) {
					
						if(sTipoSeleccionar.equals(TipoProductoServicioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoproductoservicioAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProductoServicio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoProductoServicioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoProductoServicio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoProductoServicio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoProductoServicio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoProductoServicio.jComboBoxTiposAccionesFormularioTipoProductoServicio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoProductoServicio) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoProductoServicio(conSplash);
				
					this.generarReporteTipoProductoServiciosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProductoServicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProductoServicio.jComboBoxTiposAccionesFormularioTipoProductoServicio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoProductoServiciosSeleccionados();
				//this.jComboBoxTiposAccionesTipoProductoServicio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProductoServiciosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoProductoServicio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProductoServiciosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoProductoServicio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProductoServicio();
				
				this.exportarTipoProductoServiciosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProductoServicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProductoServicio.jComboBoxTiposAccionesFormularioTipoProductoServicio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoProductoServicios();
				//this.importarTipoProductoServicios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProductoServicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProductoServicio.jComboBoxTiposAccionesFormularioTipoProductoServicio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProductoServicio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoProductoServiciosSeleccionados();
				//this.jComboBoxTiposAccionesTipoProductoServicio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Producto Servicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoProductoServicio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoProductoServicio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoProductoServicio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Producto Servicio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProductoServicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProductoServicio.jComboBoxTiposAccionesFormularioTipoProductoServicio.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoProductoServicio();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoProductoServicio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoProductoServicioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoProductoServicio();
			
			if(this.jInternalFrameDetalleFormTipoProductoServicio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();		
			TipoProductoServicio tipoproductoservicio=new TipoProductoServicio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoProductoServicio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoProductoServicio.getSelectedItem();
			
			
			
			
			tipoproductoserviciosSeleccionados=this.getTipoProductoServiciosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoproductoserviciosSeleccionados.size()==1) {
				for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosSeleccionados) {
					tipoproductoservicio=tipoproductoservicioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cuenta Contable Tipo")) {
					jButtonCuentaContableTipoActionPerformed(null,rowIndex,true,false,tipoproductoservicio);
				}
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,tipoproductoservicio);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoProductoServicio();
			
      		//this.finishProcessTipoProductoServicio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoProductoServicioReturnGeneral() throws Exception {
		if(this.tipoproductoservicioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoproductoservicioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoproductoservicioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoproductoservicioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoproductoservicioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoproductoservicioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoProductoServicio(false);
		}
		
		if(this.tipoproductoservicioReturnGeneral.getConRetornoLista() || this.tipoproductoservicioReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoproductoservicioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoproductoservicioLogic.setTipoProductoServicios(this.tipoproductoservicioReturnGeneral.getTipoProductoServicios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoproductoservicioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoproductoservicioLogic.setTipoProductoServicio(this.tipoproductoservicioReturnGeneral.getTipoProductoServicio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoProductoServicio(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoProductoServicio() throws Exception {
		
		
	}
	
	public ArrayList<TipoProductoServicio> getTipoProductoServiciosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoProductoServicio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoProductoServicio tipoproductoservicioAux:tipoproductoservicioLogic.getTipoProductoServicios()) {
					if(tipoproductoservicioAux.getIsSelected()) {
						tipoproductoserviciosSeleccionados.add(tipoproductoservicioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProductoServicio tipoproductoservicioAux:this.tipoproductoservicios) {
					if(tipoproductoservicioAux.getIsSelected()) {
						tipoproductoserviciosSeleccionados.add(tipoproductoservicioAux);				
					}
				}
			}
			
			if(tipoproductoserviciosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoproductoserviciosSeleccionados.addAll(this.tipoproductoservicioLogic.getTipoProductoServicios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoproductoserviciosSeleccionados.addAll(this.tipoproductoservicios);				
					}
				}
			}
		} else {
			tipoproductoserviciosSeleccionados.add(this.tipoproductoservicio);
		}
		
		return tipoproductoserviciosSeleccionados;
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
	
	public void generarReporteTipoProductoServiciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoProductoServiciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoProductoServiciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProductoServiciosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProductoServiciosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoProductoServiciosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Producto Servicio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoProductoServiciosSeleccionados() throws Exception {
		ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();		
		
		tipoproductoserviciosSeleccionados=this.getTipoProductoServiciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoProductoServicios("Todos",tipoproductoserviciosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoProductoServiciosSeleccionados() throws Exception {
		ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();		
		
		tipoproductoserviciosSeleccionados=this.getTipoProductoServiciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoProductoServicios("Todos",tipoproductoserviciosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoProductoServiciosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();
		
		tipoproductoserviciosSeleccionados=this.getTipoProductoServiciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoProductoServicios("Todos",tipoproductoserviciosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoProductoServiciosSeleccionados() throws Exception {
		ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoProductoServicio();
		
		
		tipoproductoserviciosSeleccionados=this.getTipoProductoServiciosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoProductoServicio();
		
		
		//this.generarReporteTipoProductoServicios("Todos",tipoproductoserviciosSeleccionados ,tipoproductoservicioImplementable,tipoproductoservicioImplementableHome);
	}
	
	public void mostrarImportacionTipoProductoServicios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoProductoServicio();
		
		this.abrirFrameImportacionTipoProductoServicio();		
		
			
		//this.generarReporteTipoProductoServicios("Todos",tipoproductoserviciosSeleccionados ,tipoproductoservicioImplementable,tipoproductoservicioImplementableHome);
	}
	
	public void importarTipoProductoServicios() throws Exception {		
	
	}
	
	public void exportarTipoProductoServiciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoProductoServiciosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoProductoServiciosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoProductoServiciosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Producto Servicio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoProductoServiciosSeleccionados() throws Exception {
		ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();		
		
		tipoproductoserviciosSeleccionados=this.getTipoProductoServiciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoProductoServicio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoProductoServicio(tipoproductoservicioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoproductoservicioAux.setsDetalleGeneralEntityReporte(tipoproductoservicioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoProductoServicio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoProductoServicioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProductoServicioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProductoServicioConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoProductoServicio(TipoProductoServicio tipoproductoservicio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoproductoservicio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoproductoservicio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoproductoservicio.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoProductoServiciosSeleccionados() throws Exception {
		ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();		
		
		tipoproductoserviciosSeleccionados=this.getTipoProductoServiciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoProductoServicios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoProductoServicio(row);				
				iRow++;
			}				
			
			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoProductoServicio(tipoproductoservicioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoProductoServiciosSeleccionados() throws Exception {
		ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();		
		
		tipoproductoserviciosSeleccionados=this.getTipoProductoServiciosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoproductoservicios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoproductoservicio");
			//elementRoot.appendChild(element);
		
			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosSeleccionados) {
				element = document.createElement("tipoproductoservicio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoProductoServicio(tipoproductoservicioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoProductoServicio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProductoServicioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProductoServicioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoProductoServicioConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoProductoServicio(TipoProductoServicio tipoproductoservicio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoproductoservicio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoproductoservicio.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoProductoServicio(TipoProductoServicio tipoproductoservicio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoProductoServicioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoproductoservicio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoProductoServicioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoproductoservicio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoProductoServicioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoproductoservicio.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoProductoServiciosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados=new ArrayList<TipoProductoServicio>();
		
		tipoproductoserviciosSeleccionados=this.getTipoProductoServiciosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoProductoServicio(tipoproductoserviciosSeleccionados);
		
		this.generarReporteTipoProductoServicios("Todos",tipoproductoserviciosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoProductoServicio(ArrayList<TipoProductoServicio> tipoproductoserviciosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosSeleccionados) {
				tipoproductoservicioAux.setsDetalleGeneralEntityReporte(tipoproductoservicioAux.toString());
			
				if(sTipoSeleccionar.equals(TipoProductoServicioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoproductoservicioAux.setsDescripcionGeneralEntityReporte1(tipoproductoservicioAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoProductoServicio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoProductoServicio=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=true;
				this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=true;
			}
			
			this.isVisibilidadCeldaModificarTipoProductoServicio=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicio=false;
			this.isVisibilidadCeldaEliminarTipoProductoServicio=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoProductoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=false;
			this.isVisibilidadCeldaModificarTipoProductoServicio=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicio=true;
			this.isVisibilidadCeldaEliminarTipoProductoServicio=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoProductoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=false;
			this.isVisibilidadCeldaModificarTipoProductoServicio=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicio=true;
			this.isVisibilidadCeldaEliminarTipoProductoServicio=true;
			this.isVisibilidadCeldaCancelarTipoProductoServicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoProductoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=false;
			this.isVisibilidadCeldaModificarTipoProductoServicio=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicio=true;
			this.isVisibilidadCeldaEliminarTipoProductoServicio=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoProductoServicio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=true;
			this.isVisibilidadCeldaModificarTipoProductoServicio=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicio=false;
			this.isVisibilidadCeldaEliminarTipoProductoServicio=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoProductoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicio=false;
			this.isVisibilidadCeldaEliminarTipoProductoServicio=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoProductoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=false;
			this.isVisibilidadCeldaModificarTipoProductoServicio=true;
			this.isVisibilidadCeldaActualizarTipoProductoServicio=false;
			this.isVisibilidadCeldaEliminarTipoProductoServicio=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoProductoServicioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoProductoServicio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=true;
		} else {
			this.actualizarEstadoPanelsTipoProductoServicio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoProductoServicio=false;
			//this.isVisibilidadCeldaVerFormTipoProductoServicio=false;
			this.isVisibilidadCeldaDuplicarTipoProductoServicio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoProductoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
			if(!tipoproductoservicioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=false;												
			}
			
			this.jButtonCerrarTipoProductoServicio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicio=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoproductoservicio)) {
			this.isVisibilidadCeldaActualizarTipoProductoServicio=false;
			this.isVisibilidadCeldaEliminarTipoProductoServicio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProductoServicio() {
		this.isVisibilidadCeldaNuevoTipoProductoServicio=false;
		this.isVisibilidadCeldaGuardarCambiosTipoProductoServicio=false;
	}
	
	public void actualizarEstadoPanelsTipoProductoServicio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoProductoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicio!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProductoServicio!=null) {
				this.jScrollPanelDatosTipoProductoServicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProductoServicio!=null) {
				this.jPanelPaginacionTipoProductoServicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicio!=null) {
				this.jPanelParametrosReportesTipoProductoServicio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoProductoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicio!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicio.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoProductoServicio!=null) {
				this.jScrollPanelDatosTipoProductoServicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProductoServicio!=null) {
				this.jPanelPaginacionTipoProductoServicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicio!=null) {
				this.jPanelParametrosReportesTipoProductoServicio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoProductoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicio.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicio!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProductoServicio!=null) {
				this.jScrollPanelDatosTipoProductoServicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProductoServicio!=null) {
				this.jPanelPaginacionTipoProductoServicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicio!=null) {
				this.jPanelParametrosReportesTipoProductoServicio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoProductoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicio!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProductoServicio!=null) {
				this.jScrollPanelDatosTipoProductoServicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProductoServicio!=null) {
				this.jPanelPaginacionTipoProductoServicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicio!=null) {
				this.jPanelParametrosReportesTipoProductoServicio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoProductoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicio!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProductoServicio!=null) {
				this.jScrollPanelDatosTipoProductoServicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProductoServicio!=null) {
				this.jPanelPaginacionTipoProductoServicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicio!=null) {
				this.jPanelParametrosReportesTipoProductoServicio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoProductoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicio!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProductoServicio!=null) {
				this.jScrollPanelDatosTipoProductoServicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProductoServicio!=null) {
				this.jPanelPaginacionTipoProductoServicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicio!=null) {
				this.jPanelParametrosReportesTipoProductoServicio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoProductoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicio!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProductoServicio!=null) {
				this.jScrollPanelDatosTipoProductoServicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProductoServicio!=null) {
				this.jPanelPaginacionTipoProductoServicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicio!=null) {
				this.jPanelParametrosReportesTipoProductoServicio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoProductoServicio!=null) {
					this.jTabbedPaneBusquedasTipoProductoServicio.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicio!=null) {
				this.jPanelParametrosReportesTipoProductoServicio.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicio!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicio.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicio!=null) {
				this.jPanelParametrosReportesTipoProductoServicio.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionTipoProductoServicioParaCuentaContableTipos() throws Exception {
		Boolean isPaginaPopupCuentaContableTipo=false;

		try {

			if(this.tipoproductoservicioSessionBean==null) {
				this.tipoproductoservicioSessionBean=new TipoProductoServicioSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoSessionBean.setsPathNavegacionActual(tipoproductoservicioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCuentaContableTipo=this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContableTipo(true);
			this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContableTipo(TipoProductoServicioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProductoServicio(true);
			this.jInternalFrameDetalleFormTipoProductoServicio.cuentacontabletipoSessionBean.setlidTipoProductoServicioActual(this.idTipoProductoServicioActual);

			tipoproductoservicioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProductoServicio(true);
			tipoproductoservicioSessionBean.setlIdTipoProductoServicioActualForeignKey(this.idTipoProductoServicioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoProductoServicioParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.tipoproductoservicioSessionBean==null) {
				this.tipoproductoservicioSessionBean=new TipoProductoServicioSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoSessionBean.setsPathNavegacionActual(tipoproductoservicioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(TipoProductoServicioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProductoServicio(true);
			this.jInternalFrameDetalleFormTipoProductoServicio.parametroinventariodefectoSessionBean.setlidTipoProductoServicioActual(this.idTipoProductoServicioActual);

			tipoproductoservicioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProductoServicio(true);
			tipoproductoservicioSessionBean.setlIdTipoProductoServicioActualForeignKey(this.idTipoProductoServicioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoProductoServicioSessionBean tipoproductoservicioSessionBean=new TipoProductoServicioSessionBean();
		
		if(this.tipoproductoservicioSessionBean==null) {
			this.tipoproductoservicioSessionBean=new TipoProductoServicioSessionBean();
		}
		
		this.tipoproductoservicioSessionBean.setsUltimaBusquedaTipoProductoServicio(this.getsAccionBusqueda());
		this.tipoproductoservicioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoproductoservicioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoproductoservicioSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoProductoServicioSessionBean tipoproductoservicioSessionBean=new TipoProductoServicioSessionBean();
		
		if(this.tipoproductoservicioSessionBean==null) {
			this.tipoproductoservicioSessionBean=new TipoProductoServicioSessionBean();
		}
		
		if(this.tipoproductoservicioSessionBean.getsUltimaBusquedaTipoProductoServicio()!=null&&!this.tipoproductoservicioSessionBean.getsUltimaBusquedaTipoProductoServicio().equals("")) {
			this.setsAccionBusqueda(tipoproductoservicioSessionBean.getsUltimaBusquedaTipoProductoServicio());
			this.setiNumeroPaginacion(tipoproductoservicioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoproductoservicioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoproductoservicioSessionBean.getnombre());
				tipoproductoservicioSessionBean.setnombre("");
			}
		}
		
		this.tipoproductoservicioSessionBean.setsUltimaBusquedaTipoProductoServicio("");
		this.tipoproductoservicioSessionBean.setiNumeroPaginacion(TipoProductoServicioConstantesFunciones.INUMEROPAGINACION);
		this.tipoproductoservicioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoProductoServicio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoProductoServicio() {
		this.updateBorderResaltarBusquedasFormularioTipoProductoServicio();
		this.updateVisibilidadBusquedasFormularioTipoProductoServicio();
		this.updateHabilitarBusquedasFormularioTipoProductoServicio();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoProductoServicio() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoProductoServicio.getComponents().length>0) {
	

		if(this.tipoproductoservicioConstantesFunciones.resaltarBusquedaPorNombreTipoProductoServicio!=null) {
			index= this.jTabbedPaneBusquedasTipoProductoServicio.indexOfComponent(this.jPanelBusquedaPorNombreTipoProductoServicio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProductoServicio.getComponent(index);
				jPanel.setBorder(this.tipoproductoservicioConstantesFunciones.resaltarBusquedaPorNombreTipoProductoServicio);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoProductoServicio() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoProductoServicio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoProductoServicio.indexOfComponent(this.jPanelBusquedaPorNombreTipoProductoServicio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProductoServicio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoproductoservicioConstantesFunciones.mostrarBusquedaPorNombreTipoProductoServicio);
			if(!this.tipoproductoservicioConstantesFunciones.mostrarBusquedaPorNombreTipoProductoServicio && index>-1) {
				this.jTabbedPaneBusquedasTipoProductoServicio.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoProductoServicio() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoProductoServicio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoProductoServicio.indexOfComponent(this.jPanelBusquedaPorNombreTipoProductoServicio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProductoServicio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoproductoservicioConstantesFunciones.activarBusquedaPorNombreTipoProductoServicio);
				this.jTabbedPaneBusquedasTipoProductoServicio.setEnabledAt(index,this.tipoproductoservicioConstantesFunciones.activarBusquedaPorNombreTipoProductoServicio);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoProductoServicio(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoProductoServicio.indexOfComponent(this.jPanelBusquedaPorNombreTipoProductoServicio);

			this.jTabbedPaneBusquedasTipoProductoServicio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProductoServicio.getComponent(index);

			this.tipoproductoservicioConstantesFunciones.setResaltarBusquedaPorNombreTipoProductoServicio(resaltar);

			jPanel.setBorder(this.tipoproductoservicioConstantesFunciones.resaltarBusquedaPorNombreTipoProductoServicio);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoProductoServicio.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoProductoServicio() throws Exception {

		if(this.jInternalFrameDetalleFormTipoProductoServicio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoProductoServicio();
		this.updateVisibilidadResaltarControlesFormularioTipoProductoServicio();
		this.updateHabilitarResaltarControlesFormularioTipoProductoServicio();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoProductoServicio() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProductoServicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoproductoservicioConstantesFunciones.resaltaridTipoProductoServicio!=null && this.jInternalFrameDetalleFormTipoProductoServicio!=null) {this.jInternalFrameDetalleFormTipoProductoServicio.jTextFieldidTipoProductoServicio.setBorder(this.tipoproductoservicioConstantesFunciones.resaltaridTipoProductoServicio);}
		if(this.tipoproductoservicioConstantesFunciones.resaltarnombreTipoProductoServicio!=null && this.jInternalFrameDetalleFormTipoProductoServicio!=null) {this.jInternalFrameDetalleFormTipoProductoServicio.jTextAreanombreTipoProductoServicio.setBorder(this.tipoproductoservicioConstantesFunciones.resaltarnombreTipoProductoServicio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoProductoServicio() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoProductoServicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
	
		//this.jInternalFrameDetalleFormTipoProductoServicio.jTextFieldidTipoProductoServicio.setVisible(this.tipoproductoservicioConstantesFunciones.mostraridTipoProductoServicio);
		this.jInternalFrameDetalleFormTipoProductoServicio.jPanelidTipoProductoServicio.setVisible(this.tipoproductoservicioConstantesFunciones.mostraridTipoProductoServicio);
		//this.jInternalFrameDetalleFormTipoProductoServicio.jTextAreanombreTipoProductoServicio.setVisible(this.tipoproductoservicioConstantesFunciones.mostrarnombreTipoProductoServicio);
		this.jInternalFrameDetalleFormTipoProductoServicio.jPanelnombreTipoProductoServicio.setVisible(this.tipoproductoservicioConstantesFunciones.mostrarnombreTipoProductoServicio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoProductoServicio() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProductoServicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProductoServicio!=null) {
	
		this.jInternalFrameDetalleFormTipoProductoServicio.jTextFieldidTipoProductoServicio.setEnabled(this.tipoproductoservicioConstantesFunciones.activaridTipoProductoServicio);
		this.jInternalFrameDetalleFormTipoProductoServicio.jTextAreanombreTipoProductoServicio.setEnabled(this.tipoproductoservicioConstantesFunciones.activarnombreTipoProductoServicio);
		}
	}
	
		
}