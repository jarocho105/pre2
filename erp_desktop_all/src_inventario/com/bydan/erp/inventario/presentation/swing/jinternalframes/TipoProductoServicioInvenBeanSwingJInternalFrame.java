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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.TipoProductoServicioInvenConstantesFunciones;
import com.bydan.erp.inventario.util.TipoProductoServicioInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoProductoServicioInvenParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoProductoServicioInvenBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoProductoServicioInvenBeanSwingJInternalFrame extends TipoProductoServicioInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoProductoServicioInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoProductoServicioInven> tipoproductoservicioinvenValidator = new ClassValidator<TipoProductoServicioInven>(TipoProductoServicioInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoProductoServicioInven tipoproductoservicioinven;	
	public TipoProductoServicioInven tipoproductoservicioinvenAux;
	public TipoProductoServicioInven tipoproductoservicioinvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoProductoServicioInven tipoproductoservicioinvenTotales;
	public Long idTipoProductoServicioInvenActual;
	public Long iIdNuevoTipoProductoServicioInven=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

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
	
	public Boolean isPermisoTodoTipoProductoServicioInven;
	public Boolean isPermisoNuevoTipoProductoServicioInven;
	public Boolean isPermisoActualizarTipoProductoServicioInven;
	public Boolean isPermisoActualizarOriginalTipoProductoServicioInven;
	public Boolean isPermisoEliminarTipoProductoServicioInven;
	public Boolean isPermisoGuardarCambiosTipoProductoServicioInven;
	public Boolean isPermisoConsultaTipoProductoServicioInven;
	public Boolean isPermisoBusquedaTipoProductoServicioInven;
	public Boolean isPermisoReporteTipoProductoServicioInven;
	public Boolean isPermisoPaginacionMedioTipoProductoServicioInven;
	public Boolean isPermisoPaginacionAltoTipoProductoServicioInven;
	public Boolean isPermisoPaginacionTodoTipoProductoServicioInven;
	public Boolean isPermisoCopiarTipoProductoServicioInven;
	public Boolean isPermisoVerFormTipoProductoServicioInven;
	public Boolean isPermisoDuplicarTipoProductoServicioInven;
	public Boolean isPermisoOrdenTipoProductoServicioInven;
	
	
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
	
	public TipoProductoServicioInvenParameterReturnGeneral tipoproductoservicioinvenReturnGeneral;
	public TipoProductoServicioInvenParameterReturnGeneral tipoproductoservicioinvenParameterGeneral;
	
	

	public ParametroInventarioDefectoLogic parametroinventariodefectoLogic=null;

	public ParametroInventarioDefectoLogic getParametroInventarioDefectoLogic() {
		return parametroinventariodefectoLogic;
	}

	public void setParametroInventarioDefectoLogic(ParametroInventarioDefectoLogic parametroinventariodefectoLogic) {
		this.parametroinventariodefectoLogic = parametroinventariodefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoProductoServicioInven=false;
	public Boolean esParaAccionDesdeFormularioTipoProductoServicioInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoProductoServicioInvenLogic tipoproductoservicioinvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoProductoServicioInven tipoproductoservicioinvenBean;
	public TipoProductoServicioInvenConstantesFunciones tipoproductoservicioinvenConstantesFunciones;
	//public TipoProductoServicioInvenParameterReturnGeneral tipoproductoservicioinvenReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoProductoServicioInven> tipoproductoservicioinvens;	
	//public List<TipoProductoServicioInven> tipoproductoservicioinvensEliminados;
	//public List<TipoProductoServicioInven> tipoproductoservicioinvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoProductoServicioInven=false;
	public Boolean isVisibilidadCeldaDuplicarTipoProductoServicioInven=true;
	public Boolean isVisibilidadCeldaCopiarTipoProductoServicioInven=true;
	public Boolean isVisibilidadCeldaVerFormTipoProductoServicioInven=true;
	public Boolean isVisibilidadCeldaOrdenTipoProductoServicioInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=false;
	public Boolean isVisibilidadCeldaModificarTipoProductoServicioInven=false;
	public Boolean isVisibilidadCeldaActualizarTipoProductoServicioInven=false;
	public Boolean isVisibilidadCeldaEliminarTipoProductoServicioInven=false;
	public Boolean isVisibilidadCeldaCancelarTipoProductoServicioInven=false;
	public Boolean isVisibilidadCeldaGuardarTipoProductoServicioInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoProductoServicioInven() {
		return this.iIdNuevoTipoProductoServicioInven;
	}

	public void setiIdNuevoTipoProductoServicioInven(Long iIdNuevoTipoProductoServicioInven) {
		this.iIdNuevoTipoProductoServicioInven = iIdNuevoTipoProductoServicioInven;
	}
	
	public Long getidTipoProductoServicioInvenActual() {
		return this.idTipoProductoServicioInvenActual;
	}

	public void setidTipoProductoServicioInvenActual(Long idTipoProductoServicioInvenActual) {
		this.idTipoProductoServicioInvenActual = idTipoProductoServicioInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoProductoServicioInven gettipoproductoservicioinven() {
		return this.tipoproductoservicioinven;
	}

	public void settipoproductoservicioinven(TipoProductoServicioInven tipoproductoservicioinven) {
		this.tipoproductoservicioinven = tipoproductoservicioinven;
	}
	
	public TipoProductoServicioInven gettipoproductoservicioinvenAux() {
		return this.tipoproductoservicioinvenAux;
	}

	public void settipoproductoservicioinvenAux(TipoProductoServicioInven tipoproductoservicioinvenAux) {
		this.tipoproductoservicioinvenAux = tipoproductoservicioinvenAux;
	}				
	
	public TipoProductoServicioInven gettipoproductoservicioinvenAnterior() {
		return this.tipoproductoservicioinvenAnterior;
	}

	public void settipoproductoservicioinvenAnterior(TipoProductoServicioInven tipoproductoservicioinvenAnterior) {
		this.tipoproductoservicioinvenAnterior = tipoproductoservicioinvenAnterior;
	}	
	
	public TipoProductoServicioInven gettipoproductoservicioinvenTotales() {
		return this.tipoproductoservicioinvenTotales;
	}

	public void settipoproductoservicioinvenTotales(TipoProductoServicioInven tipoproductoservicioinvenTotales) {
		this.tipoproductoservicioinvenTotales = tipoproductoservicioinvenTotales;
	}	
	
	public TipoProductoServicioInven gettipoproductoservicioinvenBean() {
		return this.tipoproductoservicioinvenBean;
	}

	public void settipoproductoservicioinvenBean(TipoProductoServicioInven tipoproductoservicioinvenBean) {
		this.tipoproductoservicioinvenBean = tipoproductoservicioinvenBean;
	}	
	
	public TipoProductoServicioInvenParameterReturnGeneral gettipoproductoservicioinvenReturnGeneral() {
		return this.tipoproductoservicioinvenReturnGeneral;
	}

	public void settipoproductoservicioinvenReturnGeneral(TipoProductoServicioInvenParameterReturnGeneral tipoproductoservicioinvenReturnGeneral) {
		this.tipoproductoservicioinvenReturnGeneral = tipoproductoservicioinvenReturnGeneral;
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
	
	
	public TipoProductoServicioInvenLogic getTipoProductoServicioInvenLogic()	{		
		return tipoproductoservicioinvenLogic;
	}

	public void setTipoProductoServicioInvenLogic(TipoProductoServicioInvenLogic tipoproductoservicioinvenLogic) {
		this.tipoproductoservicioinvenLogic = tipoproductoservicioinvenLogic;
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
	
	public Boolean getIsEsNuevoTipoProductoServicioInven() {
		return isEsNuevoTipoProductoServicioInven;
	}

	public void setIsEsNuevoTipoProductoServicioInven(Boolean isEsNuevoTipoProductoServicioInven) {
		this.isEsNuevoTipoProductoServicioInven = isEsNuevoTipoProductoServicioInven;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoProductoServicioInven() {
		return esParaAccionDesdeFormularioTipoProductoServicioInven;
	}
	
	public void setEsParaAccionDesdeFormularioTipoProductoServicioInven(Boolean esParaAccionDesdeFormularioTipoProductoServicioInven) {
		this.esParaAccionDesdeFormularioTipoProductoServicioInven = esParaAccionDesdeFormularioTipoProductoServicioInven;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoProductoServicioInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoProductoServicioInvenConstantesFunciones.refrescarForeignKeysDescripcionesTipoProductoServicioInven(this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoProductoServicioInvenConstantesFunciones.refrescarForeignKeysDescripcionesTipoProductoServicioInven(this.tipoproductoservicioinvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoproductoservicioinvenLogic.setTipoProductoServicioInvens(this.tipoproductoservicioinvens);
			tipoproductoservicioinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoProductoServicioInvenParameterReturnGeneral getTipoProductoServicioInvenParameterGeneral() {
		return this.tipoproductoservicioinvenParameterGeneral;
	}
	
	public void setTipoProductoServicioInvenParameterGeneral(TipoProductoServicioInvenParameterReturnGeneral tipoproductoservicioinvenParameterGeneral) {
		this.tipoproductoservicioinvenParameterGeneral = tipoproductoservicioinvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoProductoServicioInven() {
		return isPermisoTodoTipoProductoServicioInven;
	}

	public void setIsPermisoTodoTipoProductoServicioInven(Boolean isPermisoTodoTipoProductoServicioInven) {
		this.isPermisoTodoTipoProductoServicioInven = isPermisoTodoTipoProductoServicioInven;
	}

	public Boolean getIsPermisoNuevoTipoProductoServicioInven() {
		return isPermisoNuevoTipoProductoServicioInven;
	}

	public void setIsPermisoNuevoTipoProductoServicioInven(Boolean isPermisoNuevoTipoProductoServicioInven) {
		this.isPermisoNuevoTipoProductoServicioInven = isPermisoNuevoTipoProductoServicioInven;
	}

	public Boolean getIsPermisoActualizarTipoProductoServicioInven() {
		return isPermisoActualizarTipoProductoServicioInven;
	}

	public void setIsPermisoActualizarTipoProductoServicioInven(Boolean isPermisoActualizarTipoProductoServicioInven) {
		this.isPermisoActualizarTipoProductoServicioInven = isPermisoActualizarTipoProductoServicioInven;
	}

	public Boolean getIsPermisoEliminarTipoProductoServicioInven() {
		return isPermisoEliminarTipoProductoServicioInven;
	}

	public void setIsPermisoEliminarTipoProductoServicioInven(Boolean isPermisoEliminarTipoProductoServicioInven) {
		this.isPermisoEliminarTipoProductoServicioInven = isPermisoEliminarTipoProductoServicioInven;
	}

	public Boolean getIsPermisoGuardarCambiosTipoProductoServicioInven() {
		return isPermisoGuardarCambiosTipoProductoServicioInven;
	}

	public void setIsPermisoGuardarCambiosTipoProductoServicioInven(Boolean isPermisoGuardarCambiosTipoProductoServicioInven) {
		this.isPermisoGuardarCambiosTipoProductoServicioInven = isPermisoGuardarCambiosTipoProductoServicioInven;
	}
	
	public Boolean getIsPermisoConsultaTipoProductoServicioInven() {
		return isPermisoConsultaTipoProductoServicioInven;
	}

	public void setIsPermisoConsultaTipoProductoServicioInven(Boolean isPermisoConsultaTipoProductoServicioInven) {
		this.isPermisoConsultaTipoProductoServicioInven = isPermisoConsultaTipoProductoServicioInven;
	}

	public Boolean getIsPermisoBusquedaTipoProductoServicioInven() {
		return isPermisoBusquedaTipoProductoServicioInven;
	}

	public void setIsPermisoBusquedaTipoProductoServicioInven(Boolean isPermisoBusquedaTipoProductoServicioInven) {
		this.isPermisoBusquedaTipoProductoServicioInven = isPermisoBusquedaTipoProductoServicioInven;
	}

	public Boolean getIsPermisoReporteTipoProductoServicioInven() {
		return isPermisoReporteTipoProductoServicioInven;
	}

	public void setIsPermisoReporteTipoProductoServicioInven(Boolean isPermisoReporteTipoProductoServicioInven) {
		this.isPermisoReporteTipoProductoServicioInven = isPermisoReporteTipoProductoServicioInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoProductoServicioInven() {
		return isPermisoPaginacionMedioTipoProductoServicioInven;
	}

	public void setIsPermisoPaginacionMedioTipoProductoServicioInven(Boolean isPermisoPaginacionMedioTipoProductoServicioInven) {
		this.isPermisoPaginacionMedioTipoProductoServicioInven = isPermisoPaginacionMedioTipoProductoServicioInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoProductoServicioInven() {
		return isPermisoPaginacionTodoTipoProductoServicioInven;
	}

	public void setIsPermisoPaginacionTodoTipoProductoServicioInven(Boolean isPermisoPaginacionTodoTipoProductoServicioInven) {
		this.isPermisoPaginacionTodoTipoProductoServicioInven = isPermisoPaginacionTodoTipoProductoServicioInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoProductoServicioInven() {
		return isPermisoPaginacionAltoTipoProductoServicioInven;
	}

	public void setIsPermisoPaginacionAltoTipoProductoServicioInven(Boolean isPermisoPaginacionAltoTipoProductoServicioInven) {
		this.isPermisoPaginacionAltoTipoProductoServicioInven = isPermisoPaginacionAltoTipoProductoServicioInven;
	}
	
	public Boolean getIsPermisoCopiarTipoProductoServicioInven() {
		return isPermisoCopiarTipoProductoServicioInven;
	}

	public void setIsPermisoCopiarTipoProductoServicioInven(Boolean isPermisoCopiarTipoProductoServicioInven) {
		this.isPermisoCopiarTipoProductoServicioInven = isPermisoCopiarTipoProductoServicioInven;
	}
	
	public Boolean getIsPermisoVerFormTipoProductoServicioInven() {
		return isPermisoVerFormTipoProductoServicioInven;
	}

	public void setIsPermisoVerFormTipoProductoServicioInven(Boolean isPermisoVerFormTipoProductoServicioInven) {
		this.isPermisoVerFormTipoProductoServicioInven = isPermisoVerFormTipoProductoServicioInven;
	}
	
	public Boolean getIsPermisoDuplicarTipoProductoServicioInven() {
		return isPermisoDuplicarTipoProductoServicioInven;
	}

	public void setIsPermisoDuplicarTipoProductoServicioInven(Boolean isPermisoDuplicarTipoProductoServicioInven) {
		this.isPermisoDuplicarTipoProductoServicioInven = isPermisoDuplicarTipoProductoServicioInven;
	}
	
	public Boolean getIsPermisoOrdenTipoProductoServicioInven() {
		return isPermisoOrdenTipoProductoServicioInven;
	}

	public void setIsPermisoOrdenTipoProductoServicioInven(Boolean isPermisoOrdenTipoProductoServicioInven) {
		this.isPermisoOrdenTipoProductoServicioInven = isPermisoOrdenTipoProductoServicioInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoProductoServicioInven() {
		return isVisibilidadCeldaNuevoTipoProductoServicioInven;
	}

	public void setIsVisibilidadCeldaNuevoTipoProductoServicioInven(Boolean isVisibilidadCeldaNuevoTipoProductoServicioInven) {
		this.isVisibilidadCeldaNuevoTipoProductoServicioInven = isVisibilidadCeldaNuevoTipoProductoServicioInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoProductoServicioInven() {
		return isVisibilidadCeldaDuplicarTipoProductoServicioInven;
	}

	public void setIsVisibilidadCeldaDuplicarTipoProductoServicioInven(Boolean isVisibilidadCeldaDuplicarTipoProductoServicioInven) {
		this.isVisibilidadCeldaDuplicarTipoProductoServicioInven = isVisibilidadCeldaDuplicarTipoProductoServicioInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoProductoServicioInven() {
		return isVisibilidadCeldaCopiarTipoProductoServicioInven;
	}

	public void setIsVisibilidadCeldaCopiarTipoProductoServicioInven(Boolean isVisibilidadCeldaCopiarTipoProductoServicioInven) {
		this.isVisibilidadCeldaCopiarTipoProductoServicioInven = isVisibilidadCeldaCopiarTipoProductoServicioInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoProductoServicioInven() {
		return isVisibilidadCeldaVerFormTipoProductoServicioInven;
	}

	public void setIsVisibilidadCeldaVerFormTipoProductoServicioInven(Boolean isVisibilidadCeldaVerFormTipoProductoServicioInven) {
		this.isVisibilidadCeldaVerFormTipoProductoServicioInven = isVisibilidadCeldaVerFormTipoProductoServicioInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoProductoServicioInven() {
		return isVisibilidadCeldaOrdenTipoProductoServicioInven;
	}

	public void setIsVisibilidadCeldaOrdenTipoProductoServicioInven(Boolean isVisibilidadCeldaOrdenTipoProductoServicioInven) {
		this.isVisibilidadCeldaOrdenTipoProductoServicioInven = isVisibilidadCeldaOrdenTipoProductoServicioInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven() {
		return isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven(Boolean isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven) {
		this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven = isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoProductoServicioInven() {
		return isVisibilidadCeldaModificarTipoProductoServicioInven;
	}

	public void setIsVisibilidadCeldaModificarTipoProductoServicioInven(Boolean isVisibilidadCeldaModificarTipoProductoServicioInven) {
		this.isVisibilidadCeldaModificarTipoProductoServicioInven = isVisibilidadCeldaModificarTipoProductoServicioInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoProductoServicioInven() {
		return isVisibilidadCeldaActualizarTipoProductoServicioInven;
	}

	public void setIsVisibilidadCeldaActualizarTipoProductoServicioInven(Boolean isVisibilidadCeldaActualizarTipoProductoServicioInven) {
		this.isVisibilidadCeldaActualizarTipoProductoServicioInven = isVisibilidadCeldaActualizarTipoProductoServicioInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoProductoServicioInven() {
		return isVisibilidadCeldaEliminarTipoProductoServicioInven;
	}

	public void setIsVisibilidadCeldaEliminarTipoProductoServicioInven(Boolean isVisibilidadCeldaEliminarTipoProductoServicioInven) {
		this.isVisibilidadCeldaEliminarTipoProductoServicioInven = isVisibilidadCeldaEliminarTipoProductoServicioInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoProductoServicioInven() {
		return isVisibilidadCeldaCancelarTipoProductoServicioInven;
	}

	public void setIsVisibilidadCeldaCancelarTipoProductoServicioInven(Boolean isVisibilidadCeldaCancelarTipoProductoServicioInven) {
		this.isVisibilidadCeldaCancelarTipoProductoServicioInven = isVisibilidadCeldaCancelarTipoProductoServicioInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoProductoServicioInven() {
		return isVisibilidadCeldaGuardarTipoProductoServicioInven;
	}

	public void setIsVisibilidadCeldaGuardarTipoProductoServicioInven(Boolean isVisibilidadCeldaGuardarTipoProductoServicioInven) {
		this.isVisibilidadCeldaGuardarTipoProductoServicioInven = isVisibilidadCeldaGuardarTipoProductoServicioInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoProductoServicioInven() {
		return isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoProductoServicioInven(Boolean isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven) {
		this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven = isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven;
	}
		
	public TipoProductoServicioInvenSessionBean gettipoproductoservicioinvenSessionBean() {
		return this.tipoproductoservicioinvenSessionBean;
	}
	
	public void settipoproductoservicioinvenSessionBean(TipoProductoServicioInvenSessionBean tipoproductoservicioinvenSessionBean) {
		this.tipoproductoservicioinvenSessionBean=tipoproductoservicioinvenSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoProductoServicioInven tipoproductoservicioinven,TipoProductoServicioInven tipoproductoservicioinvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoProductoServicioInven(tipoproductoservicioinven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoproductoservicioinvenAux.setId(tipoproductoservicioinven.getId());
		tipoproductoservicioinvenAux.setVersionRow(tipoproductoservicioinven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoProductoServicioInven();
		
			int intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoProductoServicioInven(this.tipoproductoservicioinven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(this.tipoproductoservicioinven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoproductoservicioinvenValidator.getInvalidValues(this.tipoproductoservicioinven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoproductoservicioinvenLogic.setDatosCliente(datosCliente);
			tipoproductoservicioinvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoproductoservicioinvenAux=new  TipoProductoServicioInven();
				
				tipoproductoservicioinvenAux.setIsNew(true);
				tipoproductoservicioinvenAux.setIsChanged(true);
				
				tipoproductoservicioinvenAux.setTipoProductoServicioInvenOriginal(this.tipoproductoservicioinven);
				
				tipoproductoservicioinvenAux.setId(this.tipoproductoservicioinven.getId());	
				tipoproductoservicioinvenAux.setVersionRow(this.tipoproductoservicioinven.getVersionRow());	
				tipoproductoservicioinvenAux.setnombre(this.tipoproductoservicioinven.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoproductoservicioinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoproductoservicioinvenAux,tipoproductoservicioinvenLogic.getTipoProductoServicioInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproductoservicioinvenAux,tipoproductoservicioinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoproductoservicioinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoservicioinvenLogic.saveTipoProductoServicioInvens();//WithConnection
						//tipoproductoservicioinvenLogic.getSetVersionRowTipoProductoServicioInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoproductoservicioinven,tipoproductoservicioinvenAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoproductoservicioinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoproductoservicioinvenAux=new  TipoProductoServicioInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado() && this.tipoproductoservicioinven.getId()>=0)) {
						
					tipoproductoservicioinvenAux.setIsNew(false);
				}
				
				tipoproductoservicioinvenAux.setIsDeleted(false);
			
				tipoproductoservicioinvenAux.setId(this.tipoproductoservicioinven.getId());	
				tipoproductoservicioinvenAux.setVersionRow(this.tipoproductoservicioinven.getVersionRow());	
				tipoproductoservicioinvenAux.setnombre(this.tipoproductoservicioinven.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoproductoservicioinvenAux,tipoproductoservicioinvenLogic.getTipoProductoServicioInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproductoservicioinvenAux,tipoproductoservicioinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoproductoservicioinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoservicioinvenLogic.saveTipoProductoServicioInvens();//WithConnection
						//tipoproductoservicioinvenLogic.getSetVersionRowTipoProductoServicioInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoproductoservicioinven,tipoproductoservicioinvenAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoproductoservicioinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoproductoservicioinvenAux=new  TipoProductoServicioInven();
				
				tipoproductoservicioinvenAux.setIsNew(false);
				tipoproductoservicioinvenAux.setIsChanged(false);
				
				tipoproductoservicioinvenAux.setIsDeleted(true);
				
				tipoproductoservicioinvenAux.setId(this.tipoproductoservicioinven.getId());	
				tipoproductoservicioinvenAux.setVersionRow(this.tipoproductoservicioinven.getVersionRow());	
				tipoproductoservicioinvenAux.setnombre(this.tipoproductoservicioinven.getnombre());	
				
				if(this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoproductoservicioinvenAux.getId()>=0) {	
						this.tipoproductoservicioinvensEliminados.add(tipoproductoservicioinvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoproductoservicioinvenAux,tipoproductoservicioinvenLogic.getTipoProductoServicioInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproductoservicioinvenAux,tipoproductoservicioinvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoproductoservicioinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoservicioinvenLogic.saveTipoProductoServicioInvens();//WithConnection
						//tipoproductoservicioinvenLogic.getSetVersionRowTipoProductoServicioInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoproductoservicioinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoservicioinvenAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoproductoservicioinvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoproductoservicioinvenAux,tipoproductoservicioinvenLogic.getTipoProductoServicioInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoproductoservicioinvenAux,tipoproductoservicioinvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().addAll(this.tipoproductoservicioinvensEliminados);
					
					tipoproductoservicioinvenLogic.saveTipoProductoServicioInvens();//WithConnection
					//tipoproductoservicioinvenLogic.getSetVersionRowTipoProductoServicioInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoproductoservicioinvensEliminados= new ArrayList<TipoProductoServicioInven>();		
			}
			
			if(this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Producto Servicio Inventario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Producto Servicio Inventario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoproductoservicioinven=tipoproductoservicioinvenAux;
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
      		//this.finishProcessTipoProductoServicioInven();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoProductoServicioInven tipoproductoservicioinvenLocal) throws Exception {
		
		if(this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoproductoservicioinvenLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				tipoproductoservicioinvenLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoProductoServicioInven tipoproductoservicioinvenLocal) throws Exception {	
		if(this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoProductoServicioInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoproductoservicioinvenValidator.getInvalidValues(this.tipoproductoservicioinven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoProductoServicioInven tipoproductoservicioinven,List<TipoProductoServicioInven> tipoproductoservicioinvens) throws Exception {
		try	{		
			TipoProductoServicioInvenConstantesFunciones.actualizarLista(tipoproductoservicioinven,tipoproductoservicioinvens,this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoProductoServicioInven tipoproductoservicioinven,List<TipoProductoServicioInven> tipoproductoservicioinvens) throws Exception {
		try	{			
			TipoProductoServicioInvenConstantesFunciones.actualizarSelectedLista(tipoproductoservicioinven,tipoproductoservicioinvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoProductoServicioInven> tipoproductoservicioinvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoproductoservicioinvensLocal=this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoproductoservicioinvensLocal=this.tipoproductoservicioinvens;
			}
			//ARCHITECTURE
		
			for(TipoProductoServicioInven tipoproductoservicioinvenLocal:tipoproductoservicioinvensLocal) {
				if(this.permiteMantenimiento(tipoproductoservicioinvenLocal) && tipoproductoservicioinvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoProductoServicioInvenConstantesFunciones.getTipoProductoServicioInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoProductoServicioInvenConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProductoServicioInven.jLabelnombreTipoProductoServicioInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProductoServicioInven.jLabelnombreTipoProductoServicioInven,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.tipoproductoservicioinven==null) {
				this.tipoproductoservicioinven= new TipoProductoServicioInven();
			}

			if(this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProductoServicioInven
				this.setVariablesFormularioToObjetoActualTipoProductoServicioInven(this.tipoproductoservicioinven,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(this.tipoproductoservicioinven);

				this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setTipoProductoServicioInven(this.tipoproductoservicioinven);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoProductoServicioInven--;	
		
		
		this.tipoproductoservicioinvenAux=new TipoProductoServicioInven();
		
		this.tipoproductoservicioinvenAux.setId(this.iIdNuevoTipoProductoServicioInven);
		this.tipoproductoservicioinvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().add(this.tipoproductoservicioinvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoproductoservicioinvens.add(this.tipoproductoservicioinvenAux);
		}
		//ARCHITECTURE
		
		this.tipoproductoservicioinven=this.tipoproductoservicioinvenAux;
		
		if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoProductoServicioInven(this.tipoproductoservicioinven);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProductoServicioInven(this.tipoproductoservicioinven);
		}
				
		//this.setDefaultControlesTipoProductoServicioInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoProductoServicioInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoProductoServicioInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProductoServicioInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProductoServicioInven(this.tipoproductoservicioinvenBean,this.tipoproductoservicioinven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(this.tipoproductoservicioinven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
			classes=TipoProductoServicioInvenConstantesFunciones.getClassesRelationshipsOfTipoProductoServicioInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoproductoservicioinvenReturnGeneral=tipoproductoservicioinvenLogic.procesarEventosTipoProductoServicioInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens(),this.tipoproductoservicioinven,this.tipoproductoservicioinvenParameterGeneral,this.isEsNuevoTipoProductoServicioInven,classes);//this.tipoproductoservicioinvenLogic.getTipoProductoServicioInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoProductoServicioInven(this.tipoproductoservicioinvenReturnGeneral,this.tipoproductoservicioinvenBean,false);
		
		if(this.tipoproductoservicioinvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProductoServicioInven(this.tipoproductoservicioinvenReturnGeneral.getTipoProductoServicioInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoProductoServicioInven(this.tipoproductoservicioinvenReturnGeneral.getTipoProductoServicioInven());
		}
		
		if(this.tipoproductoservicioinvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoProductoServicioInven(this.tipoproductoservicioinvenReturnGeneral.getTipoProductoServicioInven(),classes);//this.tipoproductoservicioinvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoProductoServicioInven(this.tipoproductoservicioinven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoProductoServicioInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoProductoServicioInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoProductoServicioInven(false);
						
			if(tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProductoServicioInven();
			}
			
			this.actualizarVisualTableDatosTipoProductoServicioInven();
			
			this.jTableDatosTipoProductoServicioInven.setRowSelectionInterval(this.getIndiceNuevoTipoProductoServicioInven(), this.getIndiceNuevoTipoProductoServicioInven());
			
			this.seleccionarFilaTablaTipoProductoServicioInvenActual();
						
			this.actualizarEstadoCeldasBotonesTipoProductoServicioInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoProductoServicioInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextAreanombreTipoProductoServicioInven.setEnabled(isHabilitar && this.tipoproductoservicioinvenConstantesFunciones.activarnombreTipoProductoServicioInven);	
		
	};
	
	public void setDefaultControlesTipoProductoServicioInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoProductoServicioInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoproductoservicioinvenSessionBean.setConGuardarRelaciones(true);			
			this.tipoproductoservicioinvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jTabbedPaneRelacionesTipoProductoServicioInven.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoproductoservicioinvenSessionBean.setConGuardarRelaciones(false);			
			this.tipoproductoservicioinvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jTabbedPaneRelacionesTipoProductoServicioInven.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoProductoServicioInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()) {
				if(tipoproductoservicioinvenAux.getId().equals(this.iIdNuevoTipoProductoServicioInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvens) {
				if(tipoproductoservicioinvenAux.getId().equals(this.iIdNuevoTipoProductoServicioInven)) {
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
	
	public int getIndiceActualTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()) {
				if(tipoproductoservicioinvenAux.getId().equals(tipoproductoservicioinven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvens) {
				if(tipoproductoservicioinvenAux.getId().equals(tipoproductoservicioinven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()) {
				if(tipoproductoservicioinvenAux.getTipoProductoServicioInvenOriginal().getId().equals(tipoproductoservicioinvenOriginal.getId())) {
					existe=true;
					tipoproductoservicioinvenOriginal.setId(tipoproductoservicioinvenAux.getId());
					tipoproductoservicioinvenOriginal.setVersionRow(tipoproductoservicioinvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvens) {
				if(tipoproductoservicioinvenAux.getTipoProductoServicioInvenOriginal().getId().equals(tipoproductoservicioinvenOriginal.getId())) {
					existe=true;
					tipoproductoservicioinvenOriginal.setId(tipoproductoservicioinvenAux.getId());
					tipoproductoservicioinvenOriginal.setVersionRow(tipoproductoservicioinvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoProductoServicioInven(Boolean esParaCancelar) throws Exception {
		tipoproductoservicioinvensAux=new ArrayList<TipoProductoServicioInven>();
		tipoproductoservicioinvenAux=new TipoProductoServicioInven();
		
		if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()) {
					if(tipoproductoservicioinvenAux.getId()<0) {
						tipoproductoservicioinvensAux.add(tipoproductoservicioinvenAux);
					}		
				}
				this.iIdNuevoTipoProductoServicioInven=0L;
				this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().removeAll(tipoproductoservicioinvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvens) {
					if(tipoproductoservicioinvenAux.getId()<0) {
						tipoproductoservicioinvensAux.add(tipoproductoservicioinvenAux);
					}		
				}
				this.iIdNuevoTipoProductoServicioInven=0L;
				this.tipoproductoservicioinvens.removeAll(tipoproductoservicioinvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoProductoServicioInven 
					&& this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().size()>0
					) {
					tipoproductoservicioinvenAux=this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().get(this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().size() - 1);
				
					if(tipoproductoservicioinvenAux.getId()<0) {
						this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().remove(tipoproductoservicioinvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoProductoServicioInven && this.tipoproductoservicioinvens.size()>0) {
					tipoproductoservicioinvenAux=this.tipoproductoservicioinvens.get(this.tipoproductoservicioinvens.size() - 1);
				
					if(tipoproductoservicioinvenAux.getId()<0) {
						this.tipoproductoservicioinvens.remove(tipoproductoservicioinvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoProductoServicioInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoproductoservicioinven.getId()<0) {
				this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().remove(this.tipoproductoservicioinven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoproductoservicioinven.getId()<0) {
				this.tipoproductoservicioinvens.remove(this.tipoproductoservicioinven);
			}
		}			
	}
	
	public void setEstadosInicialesTipoProductoServicioInven(List<TipoProductoServicioInven> tipoproductoservicioinvensAux) throws Exception {
		TipoProductoServicioInvenConstantesFunciones.setEstadosInicialesTipoProductoServicioInven(tipoproductoservicioinvensAux);
	}
	
	public void setEstadosInicialesTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinvenAux) throws Exception {
		TipoProductoServicioInvenConstantesFunciones.setEstadosInicialesTipoProductoServicioInven(tipoproductoservicioinvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoProductoServicioInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoProductoServicioInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoProductoServicioInvenActual()) {
				if(!this.isEsNuevoTipoProductoServicioInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoProductoServicioInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoProductoServicioInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoProductoServicioInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Producto Servicio Inventario ?", "MANTENIMIENTO DE Tipo Producto Servicio Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoProductoServicioInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoProductoServicioInven tipoproductoservicioinven) throws Exception {
		TipoProductoServicioInvenConstantesFunciones.seleccionarAsignar(this.tipoproductoservicioinven,tipoproductoservicioinven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoProductoServicioInven=this.isPermisoActualizarOriginalTipoProductoServicioInven;
			
			
			this.seleccionarAsignar(tipoproductoservicioinven);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProductoServicioInvenConstantesFunciones.quitarEspaciosTipoProductoServicioInven(this.tipoproductoservicioinven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoProductoServicioInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoproductoservicioinvenSessionBean.setsFuncionBusquedaRapida(this.tipoproductoservicioinvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoProductoServicioInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoProductoServicioInven(esParaCancelar);				
				this.cancelarNuevoTipoProductoServicioInven(esParaCancelar);								
			}
			
			this.tipoproductoservicioinven=new TipoProductoServicioInven();
			
			this.inicializarTipoProductoServicioInven();
			
			this.actualizarEstadoCeldasBotonesTipoProductoServicioInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoProductoServicioInven() throws Exception {
		try {
			TipoProductoServicioInvenConstantesFunciones.inicializarTipoProductoServicioInven(this.tipoproductoservicioinven);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoProductoServicioInvens(String sAccionBusqueda,List<TipoProductoServicioInven> tipoproductoservicioinvensParaReportes) throws Exception {
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
					sPathReporteFinal="TipoProductoServicioInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoProductoServicioInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoProductoServicioInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoProductoServicioInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Producto Servicio Inventarios");		
		parameters.put("busquedapor", TipoProductoServicioInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ParametroInventarioDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoProductoServicioInvenLogic tipoproductoservicioinvenLogicAuxiliar=new TipoProductoServicioInvenLogic();
					tipoproductoservicioinvenLogicAuxiliar.setDatosCliente(tipoproductoservicioinvenLogic.getDatosCliente());				
					tipoproductoservicioinvenLogicAuxiliar.setTipoProductoServicioInvens(tipoproductoservicioinvensParaReportes);
					
					tipoproductoservicioinvenLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoProductoServicioInvenWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoproductoservicioinvensParaReportes=tipoproductoservicioinvenLogicAuxiliar.getTipoProductoServicioInvens();
					
					//tipoproductoservicioinvenLogic.getNewConnexionToDeep();
					
					//for (TipoProductoServicioInven tipoproductoservicioinven:tipoproductoservicioinvensParaReportes) {
					//	tipoproductoservicioinvenLogic.deepLoad(tipoproductoservicioinven, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoproductoservicioinvenLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoproductoservicioinvenLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileParametroInventarioDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroInventarioDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametroinventariodefecto", reportFileParametroInventarioDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoProductoServicioInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoProductoServicioInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoProductoServicioInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoProductoServicioInven=new JRBeanArrayDataSource(TipoProductoServicioInvenJInternalFrame.TraerTipoProductoServicioInvenBeans(tipoproductoservicioinvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoProductoServicioInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoProductoServicioInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoProductoServicioInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoProductoServicioInvenBean.TraerTipoProductoServicioInvenBeans(tipoproductoservicioinvensParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoProductoServicioInvens(sAccionBusqueda,sTipoArchivoReporte,tipoproductoservicioinvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoProductoServicioInvens(sAccionBusqueda,sTipoArchivoReporte,tipoproductoservicioinvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoProductoServicioInvenActionPerformed(null);
					//this.generarExcelReporteTipoProductoServicioInvens(sAccionBusqueda,sTipoArchivoReporte,tipoproductoservicioinvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoProductoServicioInvens(sAccionBusqueda,sTipoArchivoReporte,tipoproductoservicioinvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoProductoServicioInvens(sAccionBusqueda,sTipoArchivoReporte,tipoproductoservicioinvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoProductoServicioInvens(sAccionBusqueda,sTipoArchivoReporte,tipoproductoservicioinvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoProductoServicioInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProductoServicioInven> tipoproductoservicioinvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicioinven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProductoServicioInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProductoServicioInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoProductoServicioInven tipoproductoservicioinven : tipoproductoservicioinvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoProductoServicioInvenConstantesFunciones.generarExcelReporteDataTipoProductoServicioInven("NORMAL",row,workbook,tipoproductoservicioinven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoProductoServicioInven(String sTipo,Row row,Workbook workbook) {
		
		TipoProductoServicioInvenConstantesFunciones.generarExcelReporteHeaderTipoProductoServicioInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoProductoServicioInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProductoServicioInven> tipoproductoservicioinvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicioinven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProductoServicioInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoProductoServicioInven tipoproductoservicioinven : tipoproductoservicioinvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoProductoServicioInvenConstantesFunciones.getTipoProductoServicioInvenDescripcion(tipoproductoservicioinven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoproductoservicioinven.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoProductoServicioInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProductoServicioInven> tipoproductoservicioinvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoProductoServicioInven> tipoproductoservicioinvensRespaldo=null;
		
		classes=TipoProductoServicioInvenConstantesFunciones.getClassesRelationshipsOfTipoProductoServicioInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoproductoservicioinvenLogic.setDatosCliente(this.datosCliente);
		this.tipoproductoservicioinvenLogic.setDatosDeep(this.datosDeep);
		this.tipoproductoservicioinvenLogic.setIsConDeep(true);
		
		tipoproductoservicioinvensRespaldo=this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens();
		
		this.tipoproductoservicioinvenLogic.setTipoProductoServicioInvens(tipoproductoservicioinvensParaReportes);	
		this.tipoproductoservicioinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoproductoservicioinvensParaReportes=this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens();
		this.tipoproductoservicioinvenLogic.setTipoProductoServicioInvens(tipoproductoservicioinvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicioinven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProductoServicioInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProductoServicioInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoProductoServicioInven tipoproductoservicioinven : tipoproductoservicioinvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoProductoServicioInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoProductoServicioInvenConstantesFunciones.generarExcelReporteDataTipoProductoServicioInven("NORMAL",row,workbook,tipoproductoservicioinven,cellStyleDataAux);
		
			
			


				//ParametroInventarioDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproductoservicioinven.getParametroInventarioDefectos()!=null && tipoproductoservicioinven.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(tipoproductoservicioinven.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : tipoproductoservicioinven.getParametroInventarioDefectos()) {
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
		cell.setCellValue(TipoProductoServicioInvenConstantesFunciones.getTipoProductoServicioInvenDescripcion(tipoproductoservicioinven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoProductoServicioInven() throws Exception {		
		this.startProcessTipoProductoServicioInven(true);
	}
	
	public void startProcessTipoProductoServicioInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoProductoServicioInven ,this.jPanelParametrosReportesTipoProductoServicioInven, this.jScrollPanelDatosTipoProductoServicioInven,this.jPanelPaginacionTipoProductoServicioInven, this.jScrollPanelDatosEdicionTipoProductoServicioInven, this.jPanelAccionesTipoProductoServicioInven,this.jPanelAccionesFormularioTipoProductoServicioInven,this.jmenuBarTipoProductoServicioInven,this.jmenuBarDetalleTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,this.jTtoolBarDetalleTipoProductoServicioInven);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProductoServicioInven=this.jTabbedPaneBusquedasTipoProductoServicioInven; 
		
		final JPanel jPanelParametrosReportesTipoProductoServicioInven=this.jPanelParametrosReportesTipoProductoServicioInven;
		//final JScrollPane jScrollPanelDatosTipoProductoServicioInven=this.jScrollPanelDatosTipoProductoServicioInven;
		final JTable jTableDatosTipoProductoServicioInven=this.jTableDatosTipoProductoServicioInven;		
		final JPanel jPanelPaginacionTipoProductoServicioInven=this.jPanelPaginacionTipoProductoServicioInven;
		//final JScrollPane jScrollPanelDatosEdicionTipoProductoServicioInven=this.jScrollPanelDatosEdicionTipoProductoServicioInven;
		final JPanel jPanelAccionesTipoProductoServicioInven=this.jPanelAccionesTipoProductoServicioInven;
		
		JPanel jPanelCamposAuxiliarTipoProductoServicioInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoProductoServicioInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
			jPanelCamposAuxiliarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jPanelCamposTipoProductoServicioInven;
			jPanelAccionesFormularioAuxiliarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jPanelAccionesFormularioTipoProductoServicioInven;
		}
		
		final JPanel jPanelCamposTipoProductoServicioInven=jPanelCamposAuxiliarTipoProductoServicioInven;
		final JPanel jPanelAccionesFormularioTipoProductoServicioInven=jPanelAccionesFormularioAuxiliarTipoProductoServicioInven;
		
		
		final JMenuBar jmenuBarTipoProductoServicioInven=this.jmenuBarTipoProductoServicioInven;
		final JToolBar jTtoolBarTipoProductoServicioInven=this.jTtoolBarTipoProductoServicioInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoProductoServicioInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProductoServicioInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
			jmenuBarDetalleAuxiliarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jmenuBarDetalleTipoProductoServicioInven;
			jTtoolBarDetalleAuxiliarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jTtoolBarDetalleTipoProductoServicioInven;
		}
		
		final JMenuBar jmenuBarDetalleTipoProductoServicioInven=jmenuBarDetalleAuxiliarTipoProductoServicioInven;
		final JToolBar jTtoolBarDetalleTipoProductoServicioInven=jTtoolBarDetalleAuxiliarTipoProductoServicioInven;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProductoServicioInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProductoServicioInven;
			processRunnable.jTableDatos=jTableDatosTipoProductoServicioInven;
			processRunnable.jPanelCampos=jPanelCamposTipoProductoServicioInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProductoServicioInven;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProductoServicioInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProductoServicioInven;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProductoServicioInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProductoServicioInven;
			processRunnable.jTtoolBar=jTtoolBarTipoProductoServicioInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProductoServicioInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProductoServicioInven ,jPanelParametrosReportesTipoProductoServicioInven,jTableDatosTipoProductoServicioInven, /*jScrollPanelDatosTipoProductoServicioInven,*/jPanelCamposTipoProductoServicioInven,jPanelPaginacionTipoProductoServicioInven, /*jScrollPanelDatosEdicionTipoProductoServicioInven,*/ jPanelAccionesTipoProductoServicioInven,jPanelAccionesFormularioTipoProductoServicioInven,jmenuBarTipoProductoServicioInven,jmenuBarDetalleTipoProductoServicioInven,jTtoolBarTipoProductoServicioInven,jTtoolBarDetalleTipoProductoServicioInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProductoServicioInven ,jPanelParametrosReportesTipoProductoServicioInven, jScrollPanelDatosTipoProductoServicioInven,jPanelPaginacionTipoProductoServicioInven, jScrollPanelDatosEdicionTipoProductoServicioInven, jPanelAccionesTipoProductoServicioInven,jPanelAccionesFormularioTipoProductoServicioInven,jmenuBarTipoProductoServicioInven,jmenuBarDetalleTipoProductoServicioInven,jTtoolBarTipoProductoServicioInven,jTtoolBarDetalleTipoProductoServicioInven);
						
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
	
	public void finishProcessTipoProductoServicioInven() {// throws Exception 
		this.finishProcessTipoProductoServicioInven(true);
	}
	
	public void finishProcessTipoProductoServicioInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoProductoServicioInven ,this.jPanelParametrosReportesTipoProductoServicioInven, this.jScrollPanelDatosTipoProductoServicioInven,this.jPanelPaginacionTipoProductoServicioInven, this.jScrollPanelDatosEdicionTipoProductoServicioInven, this.jPanelAccionesTipoProductoServicioInven,this.jPanelAccionesFormularioTipoProductoServicioInven,this.jmenuBarTipoProductoServicioInven,this.jmenuBarDetalleTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,this.jTtoolBarDetalleTipoProductoServicioInven);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProductoServicioInven=this.jTabbedPaneBusquedasTipoProductoServicioInven; 
		
		final JPanel jPanelParametrosReportesTipoProductoServicioInven=this.jPanelParametrosReportesTipoProductoServicioInven;
		//final JScrollPane jScrollPanelDatosTipoProductoServicioInven=this.jScrollPanelDatosTipoProductoServicioInven;
		final JTable jTableDatosTipoProductoServicioInven=this.jTableDatosTipoProductoServicioInven;		
		final JPanel jPanelPaginacionTipoProductoServicioInven=this.jPanelPaginacionTipoProductoServicioInven;
		//final JScrollPane jScrollPanelDatosEdicionTipoProductoServicioInven=this.jScrollPanelDatosEdicionTipoProductoServicioInven;
		final JPanel jPanelAccionesTipoProductoServicioInven=this.jPanelAccionesTipoProductoServicioInven;
		
		JPanel jPanelCamposAuxiliarTipoProductoServicioInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoProductoServicioInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
			jPanelCamposAuxiliarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jPanelCamposTipoProductoServicioInven;
			jPanelAccionesFormularioAuxiliarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jPanelAccionesFormularioTipoProductoServicioInven;
		}
		
		final JPanel jPanelCamposTipoProductoServicioInven=jPanelCamposAuxiliarTipoProductoServicioInven;
		final JPanel jPanelAccionesFormularioTipoProductoServicioInven=jPanelAccionesFormularioAuxiliarTipoProductoServicioInven;
		
		
		final JMenuBar jmenuBarTipoProductoServicioInven=this.jmenuBarTipoProductoServicioInven;		
		final JToolBar jTtoolBarTipoProductoServicioInven=this.jTtoolBarTipoProductoServicioInven;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoProductoServicioInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProductoServicioInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
			jmenuBarDetalleAuxiliarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jmenuBarDetalleTipoProductoServicioInven;
			jTtoolBarDetalleAuxiliarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jTtoolBarDetalleTipoProductoServicioInven;		
		}
		
		final JMenuBar jmenuBarDetalleTipoProductoServicioInven=jmenuBarDetalleAuxiliarTipoProductoServicioInven;
		final JToolBar jTtoolBarDetalleTipoProductoServicioInven=jTtoolBarDetalleAuxiliarTipoProductoServicioInven;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProductoServicioInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProductoServicioInven;
			processRunnable.jTableDatos=jTableDatosTipoProductoServicioInven;
			processRunnable.jPanelCampos=jPanelCamposTipoProductoServicioInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProductoServicioInven;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProductoServicioInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProductoServicioInven;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProductoServicioInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProductoServicioInven;
			processRunnable.jTtoolBar=jTtoolBarTipoProductoServicioInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProductoServicioInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoProductoServicioInven ,jPanelParametrosReportesTipoProductoServicioInven, jTableDatosTipoProductoServicioInven,/*jScrollPanelDatosTipoProductoServicioInven,*/jPanelCamposTipoProductoServicioInven,jPanelPaginacionTipoProductoServicioInven, /*jScrollPanelDatosEdicionTipoProductoServicioInven,*/ jPanelAccionesTipoProductoServicioInven,jPanelAccionesFormularioTipoProductoServicioInven,jmenuBarTipoProductoServicioInven,jmenuBarDetalleTipoProductoServicioInven,jTtoolBarTipoProductoServicioInven,jTtoolBarDetalleTipoProductoServicioInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoProductoServicioInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoProductoServicioInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoProductoServicioInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoProductoServicioInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoProductoServicioInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoProductoServicioInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoProductoServicioInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoProductoServicioInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoProductoServicioInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoproductoservicioinvenConstantesFunciones.getsFinalQueryTipoProductoServicioInven();
		String  finalQueryPaginacionTodos=this.tipoproductoservicioinvenConstantesFunciones.getsFinalQueryTipoProductoServicioInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoProductoServicioInvenConstantesFunciones.getArrayColumnasGlobalesNoTipoProductoServicioInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoProductoServicioInvenConstantesFunciones.getArrayColumnasGlobalesTipoProductoServicioInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoProductoServicioInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoproductoservicioinvensEliminados= new ArrayList<TipoProductoServicioInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoProductoServicioInven();
		
				///*TipoProductoServicioInvenSessionBean*/this.tipoproductoservicioinvenSessionBean=new TipoProductoServicioInvenSessionBean();
			
			if(this.tipoproductoservicioinvenSessionBean==null) {
				this.tipoproductoservicioinvenSessionBean=new TipoProductoServicioInvenSessionBean();
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
					this.iNumeroPaginacion=TipoProductoServicioInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoProductoServicioInvenConstantesFunciones.getClassesForeignKeysOfTipoProductoServicioInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoproductoservicioinven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoproductoservicioinvensAux= new ArrayList<TipoProductoServicioInven>();
			
				
			tipoproductoservicioinvenLogic.setDatosCliente(this.datosCliente);
			tipoproductoservicioinvenLogic.setDatosDeep(this.datosDeep);
			tipoproductoservicioinvenLogic.setIsConDeep(true);
			
			
			tipoproductoservicioinvenLogic.getTipoProductoServicioInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoproductoservicioinvenLogic.getTodosTipoProductoServicioInvens(finalQueryGlobal,pagination);
					
					//tipoproductoservicioinvenLogic.getTodosTipoProductoServicioInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()==null|| tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoproductoservicioinvensAux= new ArrayList<TipoProductoServicioInven>();
							tipoproductoservicioinvensAux.addAll(tipoproductoservicioinvenLogic.getTipoProductoServicioInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductoservicioinvensAux= new ArrayList<TipoProductoServicioInven>();
							tipoproductoservicioinvensAux.addAll(tipoproductoservicioinvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoproductoservicioinvenLogic.getTodosTipoProductoServicioInvens(finalQueryGlobal+"",this.pagination);												
							
							//tipoproductoservicioinvenLogic.getTodosTipoProductoServicioInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoProductoServicioInvens("Todos",tipoproductoservicioinvenLogic.getTipoProductoServicioInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoproductoservicioinvenLogic.setTipoProductoServicioInvens(new ArrayList<TipoProductoServicioInven>());					
							tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().addAll(tipoproductoservicioinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductoservicioinvens=new ArrayList<TipoProductoServicioInven>();
							tipoproductoservicioinvens.addAll(tipoproductoservicioinvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoProductoServicioInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoProductoServicioInven=this.idActual;
				
				} else if(this.idTipoProductoServicioInvenActual!=null && this.idTipoProductoServicioInvenActual!=0L) {
					idTipoProductoServicioInven=idTipoProductoServicioInvenActual;
				}
				
					
				this.sDetalleReporte=TipoProductoServicioInvenConstantesFunciones.getDetalleIndicePorId(idTipoProductoServicioInven);
				
				this.tipoproductoservicioinvens=new ArrayList<TipoProductoServicioInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoproductoservicioinvenLogic.getEntity(idTipoProductoServicioInven);
					
					//tipoproductoservicioinvenLogic.getEntityWithConnection(idTipoProductoServicioInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoservicioinvenLogic.setTipoProductoServicioInvens(new ArrayList<TipoProductoServicioInven>());
					tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().add(tipoproductoservicioinvenLogic.getTipoProductoServicioInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoproductoservicioinvens=new ArrayList<TipoProductoServicioInven>();
					this.tipoproductoservicioinvens.add(tipoproductoservicioinven);
				}
				
				if(tipoproductoservicioinvenLogic.getTipoProductoServicioInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoProductoServicioInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoproductoservicioinvenLogic.getTipoProductoServicioInvensBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProductoServicioInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProductoServicioInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()==null||tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoproductoservicioinvens==null|| tipoproductoservicioinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoservicioinvensAux=new ArrayList<TipoProductoServicioInven>();
						tipoproductoservicioinvensAux.addAll(tipoproductoservicioinvenLogic.getTipoProductoServicioInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductoservicioinvensAux=new ArrayList<TipoProductoServicioInven>();
							tipoproductoservicioinvensAux.addAll(tipoproductoservicioinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoproductoservicioinvenLogic.getTipoProductoServicioInvensBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProductoServicioInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProductoServicioInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoProductoServicioInvens("BusquedaPorNombre",tipoproductoservicioinvenLogic.getTipoProductoServicioInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoProductoServicioInvens("BusquedaPorNombre",tipoproductoservicioinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoservicioinvenLogic.setTipoProductoServicioInvens(new ArrayList<TipoProductoServicioInven>());
						tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().addAll(tipoproductoservicioinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductoservicioinvens=new ArrayList<TipoProductoServicioInven>();
							tipoproductoservicioinvens.addAll(tipoproductoservicioinvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoProductoServicioInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoProductoServicioInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoproductoservicioinvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoproductoservicioinvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoProductoServicioInven tipoproductoservicioinven) {
		Boolean permite=true;
		
		if(this.tipoproductoservicioinven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoProductoServicioInvenConstantesFunciones.getOrderByListaTipoProductoServicioInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoProductoServicioInvenConstantesFunciones.getOrderByListaTipoProductoServicioInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProductoServicioInven tipoproductoservicioinven:tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()) {
				if(tipoproductoservicioinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproductoservicioinvenTotales=tipoproductoservicioinven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProductoServicioInven tipoproductoservicioinven:this.tipoproductoservicioinvens) {
				if(tipoproductoservicioinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproductoservicioinvenTotales=tipoproductoservicioinven;
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
			this.tipoproductoservicioinvenAux=new TipoProductoServicioInven();
			this.tipoproductoservicioinvenAux.setsType(Constantes2.S_TOTALES);
			this.tipoproductoservicioinvenAux.setIsNew(false);
			this.tipoproductoservicioinvenAux.setIsChanged(false);
			this.tipoproductoservicioinvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoProductoServicioInvenConstantesFunciones.TotalizarValoresFilaTipoProductoServicioInven(this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens(),this.tipoproductoservicioinvenAux);
				
				this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().add(this.tipoproductoservicioinvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoProductoServicioInvenConstantesFunciones.TotalizarValoresFilaTipoProductoServicioInven(this.tipoproductoservicioinvens,this.tipoproductoservicioinvenAux);
				
				this.tipoproductoservicioinvens.add(this.tipoproductoservicioinvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoproductoservicioinvenTotales=new TipoProductoServicioInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().remove(tipoproductoservicioinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoproductoservicioinvens.remove(tipoproductoservicioinvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoproductoservicioinvenTotales=new TipoProductoServicioInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProductoServicioInven tipoproductoservicioinven:tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()) {
				if(tipoproductoservicioinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproductoservicioinvenTotales=tipoproductoservicioinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProductoServicioInvenConstantesFunciones.TotalizarValoresFilaTipoProductoServicioInven(this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens(),tipoproductoservicioinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProductoServicioInven tipoproductoservicioinven:this.tipoproductoservicioinvens) {
				if(tipoproductoservicioinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproductoservicioinvenTotales=tipoproductoservicioinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProductoServicioInvenConstantesFunciones.TotalizarValoresFilaTipoProductoServicioInven(this.tipoproductoservicioinvens,tipoproductoservicioinvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoProductoServicioInvensBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoProductoServicioInvenPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoProductoServicioInvensBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoservicioinvenLogic.getTipoProductoServicioInvensBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoProductoServicioInvenPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoservicioinvenLogic.getTipoProductoServicioInvenPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoProductoServicioInven() {
		this.isPermisoTodoTipoProductoServicioInven=false;
		this.isPermisoNuevoTipoProductoServicioInven=false;
		this.isPermisoActualizarTipoProductoServicioInven=false;
		this.isPermisoActualizarOriginalTipoProductoServicioInven=false;
		this.isPermisoEliminarTipoProductoServicioInven=false;
		this.isPermisoGuardarCambiosTipoProductoServicioInven=false;
		this.isPermisoConsultaTipoProductoServicioInven=false;
		this.isPermisoBusquedaTipoProductoServicioInven=false;
		this.isPermisoReporteTipoProductoServicioInven=false;		
		this.isPermisoOrdenTipoProductoServicioInven=false;		
		this.isPermisoPaginacionMedioTipoProductoServicioInven=false;		
		this.isPermisoPaginacionAltoTipoProductoServicioInven=false;
		this.isPermisoPaginacionTodoTipoProductoServicioInven=false;
		this.isPermisoCopiarTipoProductoServicioInven=false;		
		this.isPermisoVerFormTipoProductoServicioInven=false;		
		this.isPermisoDuplicarTipoProductoServicioInven=false;		
		this.isPermisoOrdenTipoProductoServicioInven=false;		
	}
	
	public void setPermisosUsuarioTipoProductoServicioInven(Boolean isPermiso) {
		this.isPermisoTodoTipoProductoServicioInven=isPermiso;
		this.isPermisoNuevoTipoProductoServicioInven=isPermiso;
		this.isPermisoActualizarTipoProductoServicioInven=isPermiso;
		this.isPermisoActualizarOriginalTipoProductoServicioInven=isPermiso;
		this.isPermisoEliminarTipoProductoServicioInven=isPermiso;
		this.isPermisoGuardarCambiosTipoProductoServicioInven=isPermiso;
		this.isPermisoConsultaTipoProductoServicioInven=isPermiso;
		this.isPermisoBusquedaTipoProductoServicioInven=isPermiso;
		this.isPermisoReporteTipoProductoServicioInven=isPermiso;
		this.isPermisoOrdenTipoProductoServicioInven=isPermiso;		
		this.isPermisoPaginacionMedioTipoProductoServicioInven=isPermiso;		
		this.isPermisoPaginacionAltoTipoProductoServicioInven=isPermiso;		
		this.isPermisoPaginacionTodoTipoProductoServicioInven=isPermiso;		
		this.isPermisoCopiarTipoProductoServicioInven=isPermiso;		
		this.isPermisoVerFormTipoProductoServicioInven=isPermiso;		
		this.isPermisoDuplicarTipoProductoServicioInven=isPermiso;
		this.isPermisoOrdenTipoProductoServicioInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoProductoServicioInven(Boolean isPermiso) {
		//this.isPermisoTodoTipoProductoServicioInven=isPermiso;
		this.isPermisoNuevoTipoProductoServicioInven=isPermiso;
		this.isPermisoActualizarTipoProductoServicioInven=isPermiso;
		this.isPermisoActualizarOriginalTipoProductoServicioInven=isPermiso;
		this.isPermisoEliminarTipoProductoServicioInven=isPermiso;
		this.isPermisoGuardarCambiosTipoProductoServicioInven=isPermiso;
		//this.isPermisoConsultaTipoProductoServicioInven=isPermiso;
		//this.isPermisoBusquedaTipoProductoServicioInven=isPermiso;
		//this.isPermisoReporteTipoProductoServicioInven=isPermiso;
		//this.isPermisoOrdenTipoProductoServicioInven=isPermiso;		
		//this.isPermisoPaginacionMedioTipoProductoServicioInven=isPermiso;		
		//this.isPermisoPaginacionAltoTipoProductoServicioInven=isPermiso;		
		//this.isPermisoPaginacionTodoTipoProductoServicioInven=isPermiso;		
		//this.isPermisoCopiarTipoProductoServicioInven=isPermiso;		
		//this.isPermisoDuplicarTipoProductoServicioInven=isPermiso;
		//this.isPermisoOrdenTipoProductoServicioInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoProductoServicioInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoProductoServicioInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionTipoProductoServicioInvenClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoProductoServicioInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoProductoServicioInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoProductoServicioInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoProductoServicioInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoProductoServicioInvenClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormTipoProductoServicioInven!=null && this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jTabbedPaneRelacionesTipoProductoServicioInven.remove(this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoProductoServicioInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoProductoServicioInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoProductoServicioInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoProductoServicioInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoProductoServicioInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoProductoServicioInven=this.isPermisoActualizarTipoProductoServicioInven;
			this.isPermisoEliminarTipoProductoServicioInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoProductoServicioInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoProductoServicioInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoProductoServicioInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoProductoServicioInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoProductoServicioInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProductoServicioInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoProductoServicioInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoProductoServicioInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoProductoServicioInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoProductoServicioInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoProductoServicioInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoProductoServicioInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProductoServicioInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoProductoServicioInven.setToolTipText(this.jTableDatosTipoProductoServicioInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoProductoServicioInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoProductoServicioInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoProductoServicioInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoProductoServicioInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoProductoServicioInven() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosParametroInventarioDefecto && this.tipoproductoservicioinvenConstantesFunciones.mostrarParametroInventarioDefectoTipoProductoServicioInven && !TipoProductoServicioInvenConstantesFunciones.ISGUARDARREL) {

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
	
		
	public void inicializarCombosForeignKeyTipoProductoServicioInvenListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoProductoServicioInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoProductoServicioInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoProductoServicioInvenListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoProductoServicioInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoProductoServicioInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoProductoServicioInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoProductoServicioInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoProductoServicioInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProductoServicioInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoProductoServicioInven()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProductoServicioInven()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoProductoServicioInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoProductoServicioInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoProductoServicioInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoProductoServicioInven()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoProductoServicioInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoProductoServicioInven()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoProductoServicioInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoProductoServicioInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoProductoServicioInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoproductoservicioinvenSessionBean=new TipoProductoServicioInvenSessionBean(); 
		this.tipoproductoservicioinvenConstantesFunciones=new TipoProductoServicioInvenConstantesFunciones(); 
		this.tipoproductoservicioinvenBean=new TipoProductoServicioInven();//(this.tipoproductoservicioinvenConstantesFunciones); 		
		this.tipoproductoservicioinvenReturnGeneral=new TipoProductoServicioInvenParameterReturnGeneral(); 
		
		this.tipoproductoservicioinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoproductoservicioinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoProductoServicioInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoProductoServicioInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoProductoServicioInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoProductoServicioInven(true);
			
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
			
			this.tipoproductoservicioinvenConstantesFunciones=new TipoProductoServicioInvenConstantesFunciones(); 
			this.tipoproductoservicioinvenBean=new TipoProductoServicioInven();//this.tipoproductoservicioinvenConstantesFunciones); 			
			this.tipoproductoservicioinvenReturnGeneral=new TipoProductoServicioInvenParameterReturnGeneral(); 
		
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Producto Servicio Inventario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoproductoservicioinven=new TipoProductoServicioInven();
			this.tipoproductoservicioinvens = new ArrayList<TipoProductoServicioInven>();
			this.tipoproductoservicioinvensAux = new ArrayList<TipoProductoServicioInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic=new TipoProductoServicioInvenLogic();
				this.tipoproductoservicioinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoproductoservicioinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoproductoservicioinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoProductoServicioInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoProductoServicioInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProductoServicioInven);	
					}
					
					if(this.jInternalFrameImportacionTipoProductoServicioInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProductoServicioInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoProductoServicioInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoProductoServicioInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProductoServicioInven);
				this.jInternalFrameDetalleFormTipoProductoServicioInven.setVisible(false);
				this.jInternalFrameDetalleFormTipoProductoServicioInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoProductoServicioInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProductoServicioInven);
					this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoProductoServicioInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoProductoServicioInven);
					this.jInternalFrameImportacionTipoProductoServicioInven.setVisible(false);
					this.jInternalFrameImportacionTipoProductoServicioInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoProductoServicioInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoProductoServicioInven);
					this.jInternalFrameOrderByTipoProductoServicioInven.setVisible(false);
					this.jInternalFrameOrderByTipoProductoServicioInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoProductoServicioInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoProductoServicioInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoproductoservicioinvenReturnGeneral=new TipoProductoServicioInvenParameterReturnGeneral();
			
			this.tipoproductoservicioinvenParameterGeneral=new TipoProductoServicioInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoproductoservicioinvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoProductoServicioInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProductoServicioInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado(),this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProductoServicioInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado(),this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoProductoServicioInven=false;
			this.isVisibilidadCeldaDuplicarTipoProductoServicioInven=true;
			this.isVisibilidadCeldaCopiarTipoProductoServicioInven=true;
			this.isVisibilidadCeldaVerFormTipoProductoServicioInven=true;
			this.isVisibilidadCeldaOrdenTipoProductoServicioInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=false;
			this.isVisibilidadCeldaModificarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaEliminarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaGuardarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoProductoServicioInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoProductoServicioInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoProductoServicioInven(false);
			
			this.setPermisosUsuarioTipoProductoServicioInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado() && this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoProductoServicioInvenClasesRelacionadas();
			}
			
			if(this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoProductoServicioInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoProductoServicioInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoProductoServicioInven();
			}
			
			if(!this.isPermisoBusquedaTipoProductoServicioInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoProductoServicioInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoProductoServicioInven,this.isPermisoPaginacionMedioTipoProductoServicioInven,this.isPermisoPaginacionTodoTipoProductoServicioInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoProductoServicioInvenConstantesFunciones.getTiposSeleccionarTipoProductoServicioInven());
				
				this.tiposColumnasSelect=TipoProductoServicioInvenConstantesFunciones.getTiposSeleccionarTipoProductoServicioInven(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoProductoServicioInven();				
				//this.tiposRelacionesSelect=TipoProductoServicioInvenConstantesFunciones.getTiposRelacionesTipoProductoServicioInven(true);
				
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
			//if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoProductoServicioInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoProductoServicioInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoProductoServicioInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProductoServicioInven() ;
			
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
				tipoproductoservicioinvenImplementable= (TipoProductoServicioInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProductoServicioInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoproductoservicioinvenImplementableHome= (TipoProductoServicioInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProductoServicioInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoproductoservicioinvens= new ArrayList<TipoProductoServicioInven>();
			this.tipoproductoservicioinvensEliminados= new ArrayList<TipoProductoServicioInven>();
						
			this.isEsNuevoTipoProductoServicioInven=false;
			this.esParaAccionDesdeFormularioTipoProductoServicioInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoProductoServicioInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoProductoServicioInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoProductoServicioInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoProductoServicioInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoProductoServicioInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoProductoServicioInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoProductoServicioInven();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoProductoServicioInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoProductoServicioInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoProductoServicioInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoProductoServicioInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoProductoServicioInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoProductoServicioInven() {
		Reporte reporte=new Reporte();
		
	

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
			if(sTipo.equals("RelacionesTipoProductoServicioInven")) {
				iIndex=this.jInternalFrameDetalleFormTipoProductoServicioInven.jTabbedPaneRelacionesTipoProductoServicioInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoProductoServicioInven.jTabbedPaneRelacionesTipoProductoServicioInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProductoServicioInven();

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
				this.finishProcessTipoProductoServicioInven();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProductoServicioInven.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesTipoProductoServicioInven.updateUI();
		//this.jTabbedPaneRelacionesTipoProductoServicioInven.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProductoServicioInven.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosTipoProductoServicioInven.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.tipoproductoservicioinvenConstantesFunciones.mostrarParametroInventarioDefectoTipoProductoServicioInven && !TipoProductoServicioInvenConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(tipoproductoservicioinvenConstantesFunciones.resaltarParametroInventarioDefectoTipoProductoServicioInven!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproductoservicioinvenConstantesFunciones.resaltarParametroInventarioDefectoTipoProductoServicioInven);
						}

						jmenuItem.setEnabled(this.tipoproductoservicioinvenConstantesFunciones.activarParametroInventarioDefectoTipoProductoServicioInven);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormTipoProductoServicioInven.jmenuDetalleTipoProductoServicioInven.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoProductoServicioInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoProductoServicioInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoProductoServicioInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoProductoServicioInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoProductoServicioInven();
		
		this.cargarCombosFrameForeignKeyTipoProductoServicioInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoProductoServicioInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoProductoServicioInven();
		}
	}
	
	
	
	public void jButtonNuevoTipoProductoServicioInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			
			
			if(jTableDatosTipoProductoServicioInven.getRowCount()>=1) {
				jTableDatosTipoProductoServicioInven.removeRowSelectionInterval(0, jTableDatosTipoProductoServicioInven.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoProductoServicioInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoProductoServicioInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoProductoServicioInven(true);			
			//this.tipoproductoservicioinven=new TipoProductoServicioInven();
			//this.tipoproductoservicioinven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProductoServicioInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProductoServicioInven() ;
			
			if(TipoProductoServicioInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProductoServicioInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoproductoservicioinven);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);				
			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			
			if(this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoProductoServicioInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoProductoServicioInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoProductoServicioInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoProductoServicioInven.getSelectedRows().length;			
			}
			
			tipoproductoservicioinvensSeleccionados=this.getTipoProductoServicioInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoProductoServicioInven--;			
				//TipoProductoServicioInven tipoproductoservicioinvenAux= new TipoProductoServicioInven();			
				//tipoproductoservicioinvenAux.setId(this.iIdNuevoTipoProductoServicioInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoProductoServicioInven tipoproductoservicioinvenOrigen=new TipoProductoServicioInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoProductoServicioInven tipoproductoservicioinvenOrigen : tipoproductoservicioinvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoproductoservicioinvenOrigen =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductoservicioinvenOrigen =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoProductoServicioInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoproductoservicioinven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoProductoServicioInven(tipoproductoservicioinvenOrigen,this.tipoproductoservicioinven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(this.tipoproductoservicioinven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().add(this.tipoproductoservicioinvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoproductoservicioinvens.add(this.tipoproductoservicioinvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
				
				this.jTableDatosTipoProductoServicioInven.setRowSelectionInterval(this.getIndiceNuevoTipoProductoServicioInven(), this.getIndiceNuevoTipoProductoServicioInven());
				
				int iLastRow =  this.jTableDatosTipoProductoServicioInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProductoServicioInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProductoServicioInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();									
		
			TipoProductoServicioInven tipoproductoservicioinvenOrigen=new TipoProductoServicioInven();
			TipoProductoServicioInven tipoproductoservicioinvenDestino=new TipoProductoServicioInven();
				
			tipoproductoservicioinvensSeleccionados=this.getTipoProductoServicioInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoProductoServicioInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoproductoservicioinvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoProductoServicioInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoservicioinvenOrigen =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoproductoservicioinvenOrigen =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoservicioinvenDestino =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoproductoservicioinvenDestino =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoproductoservicioinvenOrigen =tipoproductoservicioinvensSeleccionados.get(0);
				tipoproductoservicioinvenDestino =tipoproductoservicioinvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoProductoServicioInven(tipoproductoservicioinvenOrigen,tipoproductoservicioinvenDestino,true,false);
				
				tipoproductoservicioinvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoproductoservicioinvenDestino,tipoproductoservicioinvenLogic.getTipoProductoServicioInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproductoservicioinvenDestino,tipoproductoservicioinvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
				
				//this.jTableDatosTipoProductoServicioInven.setRowSelectionInterval(this.getIndiceNuevoTipoProductoServicioInven(), this.getIndiceNuevoTipoProductoServicioInven());
				
				int iLastRow =  this.jTableDatosTipoProductoServicioInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProductoServicioInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProductoServicioInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoProductoServicioInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoProductoServicioInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoProductoServicioInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoProductoServicioInven.setVisible(!isVisible);
			this.jPanelPaginacionTipoProductoServicioInven.setVisible(!isVisible);
			this.jPanelAccionesTipoProductoServicioInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoProductoServicioInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoProductoServicioInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoProductoServicioInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoProductoServicioInven();
			
			this.abrirFrameOrderByTipoProductoServicioInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoProductoServicioInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoProductoServicioInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProductoServicioInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoProductoServicioInven.isMaximum()) {
					this.jInternalFrameDetalleFormTipoProductoServicioInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoProductoServicioInven.setSize(this.jInternalFrameDetalleFormTipoProductoServicioInven.iWidthFormulario,this.jInternalFrameDetalleFormTipoProductoServicioInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoProductoServicioInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoProductoServicioInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoProductoServicioInven.isMaximum()) {
						this.jInternalFrameDetalleFormTipoProductoServicioInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoProductoServicioInven.jContentPaneDetalleTipoProductoServicioInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoProductoServicioInven.jTabbedPaneRelacionesTipoProductoServicioInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoProductoServicioInven.jContentPaneDetalleTipoProductoServicioInven.getWidth(),TipoProductoServicioInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProductoServicioInven.jTabbedPaneRelacionesTipoProductoServicioInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoProductoServicioInven.jContentPaneDetalleTipoProductoServicioInven.getWidth(),TipoProductoServicioInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProductoServicioInven.jTabbedPaneRelacionesTipoProductoServicioInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoProductoServicioInven.jContentPaneDetalleTipoProductoServicioInven.getWidth(),TipoProductoServicioInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoProductoServicioInven.setVisible(true);
	        this.jInternalFrameDetalleFormTipoProductoServicioInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoProductoServicioInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoProductoServicioInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoProductoServicioInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProductoServicioInven,false,this);
				} else {
					this.jInternalFrameOrderByTipoProductoServicioInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProductoServicioInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoProductoServicioInven);
				this.jInternalFrameOrderByTipoProductoServicioInven.setVisible(false);
				this.jInternalFrameOrderByTipoProductoServicioInven.setSelected(false);
				
				this.jInternalFrameOrderByTipoProductoServicioInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProductoServicioInven"));
				
				this.inicializarActualizarBindingTablaOrderByTipoProductoServicioInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoProductoServicioInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoProductoServicioInven==null) {
				
				this.jInternalFrameImportacionTipoProductoServicioInven=new ImportacionJInternalFrame(TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProductoServicioInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoProductoServicioInven);
				this.jInternalFrameImportacionTipoProductoServicioInven.setVisible(false);
				this.jInternalFrameImportacionTipoProductoServicioInven.setSelected(false);


				this.jInternalFrameImportacionTipoProductoServicioInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProductoServicioInven"));
				this.jInternalFrameImportacionTipoProductoServicioInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProductoServicioInven"));
				this.jInternalFrameImportacionTipoProductoServicioInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProductoServicioInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoProductoServicioInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoProductoServicioInven==null) {
				this.jInternalFrameReporteDinamicoTipoProductoServicioInven=new ReporteDinamicoJInternalFrame(TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProductoServicioInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProductoServicioInven);
				this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProductoServicioInven"));
				this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProductoServicioInven"));
				this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProductoServicioInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProductoServicioInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProductoServicioInven.jContentPaneDetalleTipoProductoServicioInven.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoProductoServicioInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProductoServicioInven);
			
	       	this.jInternalFrameDetalleFormTipoProductoServicioInven.setVisible(false);
	        this.jInternalFrameDetalleFormTipoProductoServicioInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoProductoServicioInven.dispose();
			//this.jInternalFrameDetalleFormTipoProductoServicioInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoProductoServicioInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoProductoServicioInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoProductoServicioInven.setVisible(true);
	        this.jInternalFrameImportacionTipoProductoServicioInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoProductoServicioInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoProductoServicioInven.setVisible(true);
	        this.jInternalFrameOrderByTipoProductoServicioInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoProductoServicioInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoProductoServicioInven.setVisible(false);
	        this.jInternalFrameOrderByTipoProductoServicioInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoProductoServicioInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoProductoServicioInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoProductoServicioInven.setVisible(false);
	        this.jInternalFrameImportacionTipoProductoServicioInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoProductoServicioInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoProductoServicioInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoProductoServicioInven(true);
			//this.isEsNuevoTipoProductoServicioInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoProductoServicioInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProductoServicioInven(false) ;
			
			if(tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoProductoServicioInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProductoServicioInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProductoServicioInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoProductoServicioInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoProductoServicioInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoProductoServicioInven(true);
			//this.isEsNuevoTipoProductoServicioInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoproductoservicioinven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoProductoServicioInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoProductoServicioInven(false) ;
			
			if(TipoProductoServicioInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProductoServicioInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProductoServicioInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoProductoServicioInven(false);
			
			//if(!this.isEsNuevoTipoProductoServicioInven) {								
				int intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoProductoServicioInven(this.tipoproductoservicioinven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(this.tipoproductoservicioinven);
				
			}
			
			if(this.permiteMantenimiento(this.tipoproductoservicioinven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoProductoServicioInven=true;
					this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
					this.isEsNuevoTipoProductoServicioInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoProductoServicioInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoProductoServicioInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProductoServicioInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProductoServicioInven(false);
				
				this.habilitarDeshabilitarControlesTipoProductoServicioInven(false);
			
												
				
				if(TipoProductoServicioInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoProductoServicioInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,tipoproductoservicioinvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoProductoServicioInven(this.tipoproductoservicioinven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoProductoServicioInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoproductoservicioinvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoproductoservicioinven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicioInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicioInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				this.tipoproductoservicioinven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				this.tipoproductoservicioinven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoproductoservicioinven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoProductoServicioInvenModel) this.jTableDatosTipoProductoServicioInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoProductoServicioInven=true;
				this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
				this.isEsNuevoTipoProductoServicioInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProductoServicioInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProductoServicioInven(false);
				
				this.habilitarDeshabilitarControlesTipoProductoServicioInven(false);
				
				
				
				if(TipoProductoServicioInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoProductoServicioInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoProductoServicioInven.getRowCount()>=1) {
				jTableDatosTipoProductoServicioInven.removeRowSelectionInterval(0, jTableDatosTipoProductoServicioInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoProductoServicioInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProductoServicioInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProductoServicioInven(false) ;
			
			this.isEsNuevoTipoProductoServicioInven=false;
			
			if(TipoProductoServicioInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoProductoServicioInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoProductoServicioInven(false);
				
				//SI ES MANUAL
				if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoProductoServicioInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoProductoServicioInven--;			
			//TipoProductoServicioInven tipoproductoservicioinvenAux= new TipoProductoServicioInven();			
			//tipoproductoservicioinvenAux.setId(this.iIdNuevoTipoProductoServicioInven);
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoProductoServicioInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(this.tipoproductoservicioinven);
			
			this.tipoproductoservicioinven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().add(this.tipoproductoservicioinvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoproductoservicioinvens.add(this.tipoproductoservicioinvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
			
			this.jTableDatosTipoProductoServicioInven.setRowSelectionInterval(this.getIndiceNuevoTipoProductoServicioInven(), this.getIndiceNuevoTipoProductoServicioInven());
			
			int iLastRow =  this.jTableDatosTipoProductoServicioInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoProductoServicioInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoProductoServicioInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoProductoServicioInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProductoServicioInven(false);
			
			//SI ES MANUAL
			if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProductoServicioInven();
			}
			
			//this.abrirFrameTreeTipoProductoServicioInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Producto Servicio InventarioS ?", "MANTENIMIENTO DE Tipo Producto Servicio Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoProductoServicioInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoProductoServicioInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoproductoservicioinvenReturnGeneral=tipoproductoservicioinvenLogic.procesarImportacionTipoProductoServicioInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoproductoservicioinvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoProductoServicioInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoProductoServicioInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoProductoServicioInven.setFileImportacion(this.jInternalFrameImportacionTipoProductoServicioInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoProductoServicioInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoProductoServicioInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoProductoServicioInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoProductoServicioInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();		

		tipoproductoservicioinvensSeleccionados=this.getTipoProductoServicioInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoProductoServicioInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoProductoServicioInvenBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoProductoServicioInvens("Todos",tipoproductoservicioinvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();		
		
		tipoproductoservicioinvensSeleccionados=this.getTipoProductoServicioInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicioinven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoProductoServicioInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoProductoServicioInven tipoproductoservicioinven:tipoproductoservicioinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoproductoservicioinven.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoProductoServicioInven(row);				
			//	iRow++;
			//}				
			
			//for(TipoProductoServicioInven tipoproductoservicioinvenAux:tipoproductoservicioinvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoProductoServicioInven(tipoproductoservicioinvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio Inventario",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoproductoservicioinvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProductoServicioInven(false);
			
			//SI ES MANUAL
			if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProductoServicioInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProductoServicioInven(false);
			
			//SI ES MANUAL
			if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProductoServicioInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProductoServicioInven(false);
			
			//SI ES MANUAL
			if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProductoServicioInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoProductoServicioInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoProductoServicioInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoProductoServicioInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoProductoServicioInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoProductoServicioInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoProductoServicioInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoProductoServicioInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoProductoServicioInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoProductoServicioInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoProductoServicioInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoProductoServicioInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoProductoServicioInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoProductoServicioInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoProductoServicioInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProductoServicioInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoProductoServicioInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoProductoServicioInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoProductoServicioInven();
		
		this.inicializarActualizarBindingBotonesManualTipoProductoServicioInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProductoServicioInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProductoServicioInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProductoServicioInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProductoServicioInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoProductoServicioInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoProductoServicioInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoProductoServicioInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoProductoServicioInven.jCheckBoxPostAccionNuevoTipoProductoServicioInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoProductoServicioInven.jCheckBoxPostAccionSinCerrarTipoProductoServicioInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoProductoServicioInven.jCheckBoxPostAccionSinMensajeTipoProductoServicioInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoProductoServicioInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoProductoServicioInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoProductoServicioInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
				this.jInternalFrameDetalleFormTipoProductoServicioInven.jCheckBoxPostAccionNuevoTipoProductoServicioInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoProductoServicioInven.jCheckBoxPostAccionSinCerrarTipoProductoServicioInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoProductoServicioInven.jCheckBoxPostAccionSinMensajeTipoProductoServicioInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoProductoServicioInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoProductoServicioInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoProductoServicioInven.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoProductoServicioInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoProductoServicioInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoProductoServicioInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoProductoServicioInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoProductoServicioInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoProductoServicioInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoProductoServicioInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoProductoServicioInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoProductoServicioInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoProductoServicioInven(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProductoServicioInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoProductoServicioInven() throws Exception {
		try	{
			if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProductoServicioInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProductoServicioInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProductoServicioInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoProductoServicioInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoProductoServicioInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoProductoServicioInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoProductoServicioInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoProductoServicioInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoProductoServicioInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoProductoServicioInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoProductoServicioInven.addItem(reporte);
			}
			
			
			if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoProductoServicioInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoProductoServicioInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoProductoServicioInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoProductoServicioInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoProductoServicioInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoProductoServicioInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoProductoServicioInven.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoProductoServicioInven.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoProductoServicioInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoProductoServicioInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoProductoServicioInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProductoServicioInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProductoServicioInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProductoServicioInven!=null) {
				this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProductoServicioInven!=null) {
				this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoProductoServicioInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoProductoServicioInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoProductoServicioInven.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoProductoServicioInven(Boolean esInicializar) throws Exception {				
		if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProductoServicioInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoProductoServicioInven() throws Exception {
		this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoProductoServicioInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoProductoServicioInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoProductoServicioInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoProductoServicioInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProductoServicioInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoProductoServicioInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoProductoServicioInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoProductoServicioInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoproductoservicioinvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoProductoServicioInven.setModel(new TipoProductoServicioInvenModel(this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoProductoServicioInven.setModel(new TipoProductoServicioInvenModel(this.tipoproductoservicioinvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoProductoServicioInven!=null && this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoProductoServicioInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoProductoServicioInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProductoServicioInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoProductoServicioInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO,tipoproductoservicioinvenConstantesFunciones.resaltarSeleccionarTipoProductoServicioInven,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO,tipoproductoservicioinvenConstantesFunciones.resaltarSeleccionarTipoProductoServicioInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoProductoServicioInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProductoServicioInven,TipoProductoServicioInvenConstantesFunciones.LABEL_ID));

		if(this.tipoproductoservicioinvenConstantesFunciones.mostraridTipoProductoServicioInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProductoServicioInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoproductoservicioinvenConstantesFunciones.resaltaridTipoProductoServicioInven,this.tipoproductoservicioinvenConstantesFunciones.activaridTipoProductoServicioInven,this,true,"idTipoProductoServicioInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoproductoservicioinvenConstantesFunciones.resaltaridTipoProductoServicioInven,this.tipoproductoservicioinvenConstantesFunciones.activaridTipoProductoServicioInven,this,true,"idTipoProductoServicioInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProductoServicioInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProductoServicioInven,TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoproductoservicioinvenConstantesFunciones.mostrarnombreTipoProductoServicioInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoproductoservicioinvenConstantesFunciones.resaltarnombreTipoProductoServicioInven,this.tipoproductoservicioinvenConstantesFunciones.activarnombreTipoProductoServicioInven,this,true,"nombreTipoProductoServicioInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoproductoservicioinvenConstantesFunciones.resaltarnombreTipoProductoServicioInven,this.tipoproductoservicioinvenConstantesFunciones.activarnombreTipoProductoServicioInven,this,true,"nombreTipoProductoServicioInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProductoServicioInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosParametroInventarioDefecto && this.tipoproductoservicioinvenConstantesFunciones.mostrarParametroInventarioDefectoTipoProductoServicioInven && !TipoProductoServicioInvenConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(tipoproductoservicioinvenConstantesFunciones.resaltarParametroInventarioDefectoTipoProductoServicioInven,this,this.tipoproductoservicioinvenConstantesFunciones.activarParametroInventarioDefectoTipoProductoServicioInven));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(tipoproductoservicioinvenConstantesFunciones.resaltarParametroInventarioDefectoTipoProductoServicioInven,this,this.tipoproductoservicioinvenConstantesFunciones.activarParametroInventarioDefectoTipoProductoServicioInven));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProductoServicioInven.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProductoServicioInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProductoServicioInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoProductoServicioInven && this.isPermisoGuardarCambiosTipoProductoServicioInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoProductoServicioInven.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoProductoServicioInven.addColumn(tableColumn);
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
			
			this.jTableDatosTipoProductoServicioInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProductoServicioInven && this.isPermisoGuardarCambiosTipoProductoServicioInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProductoServicioInven && this.isPermisoGuardarCambiosTipoProductoServicioInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoProductoServicioInven.moveColumn(this.jTableDatosTipoProductoServicioInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoProductoServicioInven.moveColumn(this.jTableDatosTipoProductoServicioInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoProductoServicioInven.moveColumn(this.jTableDatosTipoProductoServicioInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoProductoServicioInven.moveColumn(this.jTableDatosTipoProductoServicioInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoProductoServicioInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoProductoServicioInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoProductoServicioInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoProductoServicioInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoProductoServicioInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoProductoServicioInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoProductoServicioInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoProductoServicioInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoproductoservicioinvens.size()-1;
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
		//this.jTableDatosTipoProductoServicioInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoProductoServicioInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoProductoServicioInven();
			
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
				
				//this.isEsNuevoTipoProductoServicioInven=false;
					
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			
				if(this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProductoServicioInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProductoServicioInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoproductoservicioinven.getsType().equals("DUPLICADO")
				   || this.tipoproductoservicioinven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoProductoServicioInven=true;
				
				} else {
					this.isEsNuevoTipoProductoServicioInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoproductoservicioinven.getId()>=0 && !this.tipoproductoservicioinven.getIsNew()) {						
						this.isEsNuevoTipoProductoServicioInven=false;
						
					} else {
						this.isEsNuevoTipoProductoServicioInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoProductoServicioInven(esRelaciones);						
				
				this.seleccionarTipoProductoServicioInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoproductoservicioinven.getId()<0) {
					this.isEsNuevoTipoProductoServicioInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoProductoServicioInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoProductoServicioInven(evt,rowIndex);
				}	
				
				if(this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoProductoServicioInven: " + this.dDif); 
					}
				}								
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoProductoServicioInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoproductoservicioinven)) {
					if(this.tipoproductoservicioinven.getId()>0) {
						this.tipoproductoservicioinven.setIsDeleted(true);
						
						this.tipoproductoservicioinvensEliminados.add(this.tipoproductoservicioinven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().remove(this.tipoproductoservicioinven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoproductoservicioinvens.remove(this.tipoproductoservicioinven);				
					}
					
					
					((TipoProductoServicioInvenModel) this.jTableDatosTipoProductoServicioInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoProductoServicioInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoProductoServicioInven) {
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProductoServicioInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProductoServicioInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoProductoServicioInven(this.tipoproductoservicioinven);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoProductoServicioInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoProductoServicioInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProductoServicioInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoProductoServicioInven(tipoproductoservicioinven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoProductoServicioInven(tipoproductoservicioinven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoProductoServicioInven(tipoproductoservicioinven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoProductoServicioInven(tipoproductoservicioinven);
	}
	
	public void setVariablesObjetoActualToFormularioTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextFieldidTipoProductoServicioInven.setText(tipoproductoservicioinven.getId().toString());
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextAreanombreTipoProductoServicioInven.setText(tipoproductoservicioinven.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoProductoServicioInven tipoproductoservicioinvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoproductoservicioinvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoProductoServicioInven tipoproductoservicioinvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoproductoservicioinvenLocal=this.tipoproductoservicioinven;
			} else {
				tipoproductoservicioinvenLocal=this.tipoproductoservicioinvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoproductoservicioinvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoProductoServicioInven(tipoproductoservicioinvenLocal,true);
					
					if(tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoproductoservicioinvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoproductoservicioinvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProductoServicioInven(tipoproductoservicioinven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(tipoproductoservicioinven);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProductoServicioInven(tipoproductoservicioinven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextFieldidTipoProductoServicioInven.getText()==null || this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextFieldidTipoProductoServicioInven.getText()=="" || this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextFieldidTipoProductoServicioInven.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextFieldidTipoProductoServicioInven.setText("0");
			}

			if(conColumnasBase) {tipoproductoservicioinven.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextFieldidTipoProductoServicioInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProductoServicioInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProductoServicioInven.jLabelIdTipoProductoServicioInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoproductoservicioinven.setnombre(this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextAreanombreTipoProductoServicioInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProductoServicioInven.jLabelnombreTipoProductoServicioInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinvenBean,TipoProductoServicioInven tipoproductoservicioinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinvenOrigen,TipoProductoServicioInven tipoproductoservicioinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoproductoservicioinvenOrigen.getId()!=null && !tipoproductoservicioinvenOrigen.getId().equals(0L))) {tipoproductoservicioinven.setId(tipoproductoservicioinvenOrigen.getId());}}
			if(conDefault || (!conDefault && tipoproductoservicioinvenOrigen.getnombre()!=null && !tipoproductoservicioinvenOrigen.getnombre().equals(""))) {tipoproductoservicioinven.setnombre(tipoproductoservicioinvenOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextFieldidTipoProductoServicioInven.setText(tipoproductoservicioinven.getId().toString());
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextAreanombreTipoProductoServicioInven.setText(tipoproductoservicioinven.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProductoServicioInven(TipoProductoServicioInvenBean tipoproductoservicioinvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextFieldidTipoProductoServicioInven.setText(tipoproductoservicioinvenBean.getId().toString());
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextAreanombreTipoProductoServicioInven.setText(tipoproductoservicioinvenBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoProductoServicioInven(TipoProductoServicioInvenParameterReturnGeneral tipoproductoservicioinvenReturnGeneral,TipoProductoServicioInvenBean tipoproductoservicioinvenBean,Boolean conDefault) throws Exception { 
		try {
			TipoProductoServicioInven tipoproductoservicioinvenLocal=new TipoProductoServicioInven();
			
			tipoproductoservicioinvenLocal=tipoproductoservicioinvenReturnGeneral.getTipoProductoServicioInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoproductoservicioinvenLocal.getId()!=null && !tipoproductoservicioinvenLocal.getId().equals(0L))) {tipoproductoservicioinvenBean.setId(tipoproductoservicioinvenLocal.getId());}}
			if(conDefault || (!conDefault && tipoproductoservicioinvenLocal.getnombre()!=null && !tipoproductoservicioinvenLocal.getnombre().equals(""))) {tipoproductoservicioinvenBean.setnombre(tipoproductoservicioinvenLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoProductoServicioInvenGenerico(Long idTipoProductoServicioInvenSeleccionado,JComboBox jComboBoxTipoProductoServicioInven,List<TipoProductoServicioInven> tipoproductoservicioinvensLocal)throws Exception {
		try {
			TipoProductoServicioInven  tipoproductoservicioinvenTemp=null;

			for(TipoProductoServicioInven tipoproductoservicioinvenAux:tipoproductoservicioinvensLocal) {
				if(tipoproductoservicioinvenAux.getId()!=null && tipoproductoservicioinvenAux.getId().equals(idTipoProductoServicioInvenSeleccionado)) {
					tipoproductoservicioinvenTemp=tipoproductoservicioinvenAux;
					break;
				}
			}

			jComboBoxTipoProductoServicioInven.setSelectedItem(tipoproductoservicioinvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoProductoServicioInvenGenerico(JComboBox jComboBoxTipoProductoServicioInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoProductoServicioInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProductoServicioInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoProductoServicioInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProductoServicioInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProductoServicioInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoProductoServicioInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProductoServicioInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoProductoServicioInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoProductoServicioInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoProductoServicioInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ParametroInventarioDefecto")) {
			jButtonParametroInventarioDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoproductoservicioinven=(TipoProductoServicioInven) tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoproductoservicioinven =(TipoProductoServicioInven) tipoproductoservicioinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoProductoServicioInven tipoproductoservicioinvenRow=new TipoProductoServicioInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoproductoservicioinvenRow=(TipoProductoServicioInven) tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoproductoservicioinvenRow=(TipoProductoServicioInven) tipoproductoservicioinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProductoServicioInven tipoproductoservicioinven) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproductoservicioinven = (TipoProductoServicioInven)this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproductoservicioinven = (TipoProductoServicioInven)this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproductoservicioinven!=null) {
						this.tipoproductoservicioinven = tipoproductoservicioinven;
					} else {
						this.tipoproductoservicioinven = new TipoProductoServicioInven();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.tipoproductoservicioinven)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<TipoProductoServicioInven> tipoproductoservicioinvens=new ArrayList<TipoProductoServicioInven>();
					tipoproductoservicioinvens.add(this.tipoproductoservicioinven);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProductoServicioInven.cargarParametroInventarioDefectoBeanSwingJInternalFrame(tipoproductoservicioinvens,this.tipoproductoservicioinven,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProductoServicioInven=(TitledBorder)this.jScrollPanelDatosTipoProductoServicioInven.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderTipoProductoServicioInven.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoProductoServicioInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaNuevoTipoProductoServicioInven && this.isPermisoNuevoTipoProductoServicioInven));			
			this.jButtonDuplicarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaDuplicarTipoProductoServicioInven && this.isPermisoDuplicarTipoProductoServicioInven));			
			this.jButtonCopiarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaCopiarTipoProductoServicioInven && this.isPermisoCopiarTipoProductoServicioInven));
			this.jButtonVerFormTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaVerFormTipoProductoServicioInven && this.isPermisoVerFormTipoProductoServicioInven));
			
			this.jButtonAbrirOrderByTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaOrdenTipoProductoServicioInven && this.isPermisoOrdenTipoProductoServicioInven));			
			
			this.jButtonNuevoRelacionesTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven && this.isPermisoNuevoTipoProductoServicioInven));			
			this.jButtonNuevoGuardarCambiosTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaNuevoTipoProductoServicioInven && this.isPermisoNuevoTipoProductoServicioInven && this.isPermisoGuardarCambiosTipoProductoServicioInven));
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonModificarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaModificarTipoProductoServicioInven && this.isPermisoActualizarTipoProductoServicioInven));	
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonActualizarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaActualizarTipoProductoServicioInven && this.isPermisoActualizarTipoProductoServicioInven));	
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonEliminarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaEliminarTipoProductoServicioInven && this.isPermisoEliminarTipoProductoServicioInven));
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonCancelarTipoProductoServicioInven.setVisible(this.isVisibilidadCeldaCancelarTipoProductoServicioInven);							
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonGuardarCambiosTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaGuardarTipoProductoServicioInven && this.isPermisoGuardarCambiosTipoProductoServicioInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven && this.isPermisoGuardarCambiosTipoProductoServicioInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaNuevoTipoProductoServicioInven && this.isPermisoNuevoTipoProductoServicioInven));						
			this.jButtonDuplicarToolBarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaDuplicarTipoProductoServicioInven && this.isPermisoDuplicarTipoProductoServicioInven));						
			this.jButtonCopiarToolBarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaCopiarTipoProductoServicioInven && this.isPermisoCopiarTipoProductoServicioInven));			
			this.jButtonVerFormToolBarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaVerFormTipoProductoServicioInven && this.isPermisoVerFormTipoProductoServicioInven));			
			this.jButtonAbrirOrderByToolBarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaOrdenTipoProductoServicioInven && this.isPermisoOrdenTipoProductoServicioInven));
			this.jButtonNuevoRelacionesToolBarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven && this.isPermisoNuevoTipoProductoServicioInven));			
			this.jButtonNuevoGuardarCambiosToolBarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaNuevoTipoProductoServicioInven && this.isPermisoNuevoTipoProductoServicioInven && this.isPermisoGuardarCambiosTipoProductoServicioInven));			
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonModificarToolBarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaModificarTipoProductoServicioInven && this.isPermisoActualizarTipoProductoServicioInven));	
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonActualizarToolBarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaActualizarTipoProductoServicioInven  && this.isPermisoActualizarTipoProductoServicioInven));	
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonEliminarToolBarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaEliminarTipoProductoServicioInven && this.isPermisoEliminarTipoProductoServicioInven));
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonCancelarToolBarTipoProductoServicioInven.setVisible(this.isVisibilidadCeldaCancelarTipoProductoServicioInven);				
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonGuardarCambiosToolBarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaGuardarTipoProductoServicioInven && this.isPermisoGuardarCambiosTipoProductoServicioInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven && this.isPermisoGuardarCambiosTipoProductoServicioInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaNuevoTipoProductoServicioInven && this.isPermisoNuevoTipoProductoServicioInven));			
			this.jMenuItemDuplicarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaDuplicarTipoProductoServicioInven && this.isPermisoDuplicarTipoProductoServicioInven));			
			this.jMenuItemCopiarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaCopiarTipoProductoServicioInven && this.isPermisoCopiarTipoProductoServicioInven));			
			this.jMenuItemVerFormTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaVerFormTipoProductoServicioInven && this.isPermisoVerFormTipoProductoServicioInven));			
			this.jMenuItemAbrirOrderByTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaOrdenTipoProductoServicioInven && this.isPermisoOrdenTipoProductoServicioInven));			
			//this.jMenuItemMostrarOcultarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaOrdenTipoProductoServicioInven && this.isPermisoOrdenTipoProductoServicioInven));
			this.jMenuItemDetalleAbrirOrderByTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaOrdenTipoProductoServicioInven && this.isPermisoOrdenTipoProductoServicioInven));			
			//this.jMenuItemDetalleMostrarOcultarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaOrdenTipoProductoServicioInven && this.isPermisoOrdenTipoProductoServicioInven));			
			this.jMenuItemNuevoRelacionesTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven && this.isPermisoNuevoTipoProductoServicioInven));			
			this.jMenuItemNuevoGuardarCambiosTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaNuevoTipoProductoServicioInven && this.isPermisoNuevoTipoProductoServicioInven && this.isPermisoGuardarCambiosTipoProductoServicioInven));									
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemModificarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaModificarTipoProductoServicioInven && this.isPermisoActualizarTipoProductoServicioInven));	
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemActualizarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaActualizarTipoProductoServicioInven && this.isPermisoActualizarTipoProductoServicioInven));	
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemEliminarTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaEliminarTipoProductoServicioInven && this.isPermisoEliminarTipoProductoServicioInven));
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemCancelarTipoProductoServicioInven.setVisible(this.isVisibilidadCeldaCancelarTipoProductoServicioInven);				
			}
			
			this.jMenuItemGuardarCambiosTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaGuardarTipoProductoServicioInven && this.isPermisoGuardarCambiosTipoProductoServicioInven));						
			this.jMenuItemGuardarCambiosTablaTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven && this.isPermisoGuardarCambiosTipoProductoServicioInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoProductoServicioInven=this.jButtonNuevoTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaDuplicarTipoProductoServicioInven=this.jButtonDuplicarTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaCopiarTipoProductoServicioInven=this.jButtonCopiarTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaVerFormTipoProductoServicioInven=this.jButtonVerFormTipoProductoServicioInven.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoProductoServicioInven=this.jButtonAbrirOrderByTipoProductoServicioInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=this.jButtonNuevoRelacionesTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaModificarTipoProductoServicioInven=this.jButtonModificarTipoProductoServicioInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
			this.isVisibilidadCeldaActualizarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonActualizarTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonEliminarTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonCancelarTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaGuardarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonGuardarCambiosTipoProductoServicioInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=this.jButtonGuardarCambiosTablaTipoProductoServicioInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoProductoServicioInven=this.jButtonNuevoToolBarTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=this.jButtonNuevoRelacionesToolBarTipoProductoServicioInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
			this.isVisibilidadCeldaModificarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonModificarToolBarTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaActualizarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonActualizarToolBarTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonEliminarToolBarTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonCancelarToolBarTipoProductoServicioInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProductoServicioInven=this.jButtonGuardarCambiosToolBarTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=this.jButtonGuardarCambiosTablaToolBarTipoProductoServicioInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoProductoServicioInven=this.jMenuItemNuevoTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=this.jMenuItemNuevoRelacionesTipoProductoServicioInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
			this.isVisibilidadCeldaModificarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemModificarTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaActualizarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemActualizarTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemEliminarTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoProductoServicioInven=this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemCancelarTipoProductoServicioInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProductoServicioInven=this.jMenuItemGuardarCambiosTipoProductoServicioInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=this.jMenuItemGuardarCambiosTablaTipoProductoServicioInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoProductoServicioInven(Boolean esInicializar) {
		if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProductoServicioInven();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoProductoServicioInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoProductoServicioInven() {
		this.jButtonNuevoTipoProductoServicioInven.setVisible(this.isPermisoNuevoTipoProductoServicioInven);			
		this.jButtonDuplicarTipoProductoServicioInven.setVisible(this.isPermisoDuplicarTipoProductoServicioInven);			
		this.jButtonCopiarTipoProductoServicioInven.setVisible(this.isPermisoCopiarTipoProductoServicioInven);			
		this.jButtonVerFormTipoProductoServicioInven.setVisible(this.isPermisoVerFormTipoProductoServicioInven);			
		
		this.jButtonAbrirOrderByTipoProductoServicioInven.setVisible(this.isPermisoOrdenTipoProductoServicioInven);					
		
		this.jButtonNuevoRelacionesTipoProductoServicioInven.setVisible(this.isPermisoNuevoTipoProductoServicioInven);			
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonModificarTipoProductoServicioInven.setVisible(this.isPermisoActualizarTipoProductoServicioInven);	
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonActualizarTipoProductoServicioInven.setVisible(this.isPermisoActualizarTipoProductoServicioInven);	
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonEliminarTipoProductoServicioInven.setVisible(this.isPermisoEliminarTipoProductoServicioInven);
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonCancelarTipoProductoServicioInven.setVisible(this.isVisibilidadCeldaCancelarTipoProductoServicioInven);						
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonGuardarCambiosTipoProductoServicioInven.setVisible(this.isPermisoGuardarCambiosTipoProductoServicioInven);							
		}
		
		this.jButtonGuardarCambiosTablaTipoProductoServicioInven.setVisible(this.isPermisoActualizarTipoProductoServicioInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProductoServicioInven() {
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonModificarTipoProductoServicioInven.setVisible(this.isPermisoActualizarTipoProductoServicioInven);	
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonActualizarTipoProductoServicioInven.setVisible(this.isPermisoActualizarTipoProductoServicioInven);	
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonEliminarTipoProductoServicioInven.setVisible(this.isPermisoEliminarTipoProductoServicioInven);
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonCancelarTipoProductoServicioInven.setVisible(this.isVisibilidadCeldaCancelarTipoProductoServicioInven);							
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonGuardarCambiosTipoProductoServicioInven.setVisible((this.isVisibilidadCeldaGuardarTipoProductoServicioInven && this.isPermisoGuardarCambiosTipoProductoServicioInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoProductoServicioInven() {
		if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoProductoServicioInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoProductoServicioInven() {
	}
	
	public void jTableDatosTipoProductoServicioInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoProductoServicioInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoProductoServicioInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProductoServicioInven(this.gettipoproductoservicioinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(this.tipoproductoservicioinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoproductoservicioinven==null) {
						this.tipoproductoservicioinven = new TipoProductoServicioInven();
					}

					this.setVariablesFormularioToObjetoActualTipoProductoServicioInven(this.tipoproductoservicioinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(this.tipoproductoservicioinven);
				}

				if(this.tipoproductoservicioinven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoproductoservicioinven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProductoServicioInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoProductoServicioInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProductoServicioInven(this.gettipoproductoservicioinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(this.tipoproductoservicioinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoproductoservicioinven==null) {
						this.tipoproductoservicioinven = new TipoProductoServicioInven();
					}

					this.setVariablesFormularioToObjetoActualTipoProductoServicioInven(this.tipoproductoservicioinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(this.tipoproductoservicioinven);
				}

				if(this.tipoproductoservicioinven.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoproductoservicioinven.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProductoServicioInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoProductoServicioInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoProductoServicioInven(false,false);

			this.getTipoProductoServicioInvensBusquedaPorNombre();

			this.inicializarActualizarBindingTipoProductoServicioInven(false);

			//if(TipoProductoServicioInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoProductoServicioInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoservicioinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoProductoServicioInven() {
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
		

		if(this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoProductoServicioInven.dispose();
			this.jInternalFrameDetalleFormTipoProductoServicioInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoProductoServicioInven!=null) {
			this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoProductoServicioInven.dispose();
			this.jInternalFrameReporteDinamicoTipoProductoServicioInven=null;
		}
		
		if(this.jInternalFrameImportacionTipoProductoServicioInven!=null) {
			this.jInternalFrameImportacionTipoProductoServicioInven.setVisible(false);	    			
			this.jInternalFrameImportacionTipoProductoServicioInven.dispose();
			this.jInternalFrameImportacionTipoProductoServicioInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoProductoServicioInven();
			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoProductoServicioInven")) {
				jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoProductoServicioInven")) {
				jButtonDuplicarTipoProductoServicioInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoProductoServicioInven")) {
				jButtonCopiarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoProductoServicioInven")) {
				jButtonVerFormTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoProductoServicioInven")) {
				jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoProductoServicioInven")) {
				jButtonDuplicarTipoProductoServicioInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoProductoServicioInven")) {
				jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoProductoServicioInven")) {
				jButtonDuplicarTipoProductoServicioInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoProductoServicioInven")) {
				jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoProductoServicioInven")) {
				jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoProductoServicioInven")) {
				jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoProductoServicioInven")) {
				jButtonModificarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoProductoServicioInven")) {
				jButtonModificarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoProductoServicioInven")) {
				jButtonModificarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoProductoServicioInven")) {
				jButtonActualizarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoProductoServicioInven")) {
				jButtonActualizarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoProductoServicioInven")) {
				jButtonActualizarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoProductoServicioInven")) {
				jButtonEliminarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoProductoServicioInven")) {
				jButtonEliminarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoProductoServicioInven")) {
				jButtonEliminarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoProductoServicioInven")) {
				jButtonCancelarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoProductoServicioInven")) {
				jButtonCancelarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoProductoServicioInven")) {
				jButtonCancelarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoProductoServicioInven")) {
				jButtonCerrarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoProductoServicioInven")) {
				jButtonCerrarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoProductoServicioInven")) {
				jButtonCerrarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoProductoServicioInven")) {
				jButtonMostrarOcultarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoProductoServicioInven")) {
				jButtonCancelarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoProductoServicioInven")) {
				jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoProductoServicioInven")) {
				jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoProductoServicioInven")) {
				jButtonCopiarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoProductoServicioInven")) {
				jButtonVerFormTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoProductoServicioInven")) {
				jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoProductoServicioInven")) {
				jButtonCopiarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoProductoServicioInven")) {
				jButtonVerFormTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoProductoServicioInven")) {
				jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoProductoServicioInven")) {
				jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoProductoServicioInven")) {
				jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoProductoServicioInven")) {
				jButtonRecargarInformacionTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoProductoServicioInven")) {
				jButtonRecargarInformacionTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoProductoServicioInven")) {
				jButtonRecargarInformacionTipoProductoServicioInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoProductoServicioInven")) {
				jButtonAnterioresTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoProductoServicioInven")) {
				jButtonAnterioresTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoProductoServicioInven")) {
				jButtonAnterioresTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoProductoServicioInven")) {
				jButtonSiguientesTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoProductoServicioInven")) {
				jButtonSiguientesTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoProductoServicioInven")) {
				jButtonSiguientesTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoProductoServicioInven") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoProductoServicioInven")) {
				jButtonAbrirOrderByTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoProductoServicioInven") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoProductoServicioInven")) {
				jButtonMostrarOcultarTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProductoServicioInven")) {
				jButtonNuevoGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoProductoServicioInven")) {
				jButtonNuevoGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoProductoServicioInven")) {
				jButtonNuevoGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoProductoServicioInven")) {
				jButtonCerrarReporteDinamicoTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoProductoServicioInven")) {
				jButtonGenerarReporteDinamicoTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoProductoServicioInven")) {
				
				jButtonGenerarExcelReporteDinamicoTipoProductoServicioInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoProductoServicioInven")) {
				jButtonCerrarImportacionTipoProductoServicioInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoProductoServicioInven")) {
				
				jButtonGenerarImportacionTipoProductoServicioInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoProductoServicioInven")) {
				
				jButtonAbrirImportacionTipoProductoServicioInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoProductoServicioInven")) {
				jComboBoxTiposAccionesTipoProductoServicioInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoProductoServicioInven")) {
				jComboBoxTiposRelacionesTipoProductoServicioInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoProductoServicioInven")) {
				jComboBoxTiposAccionesTipoProductoServicioInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoProductoServicioInven")) {
				
				jComboBoxTiposSeleccionarTipoProductoServicioInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoProductoServicioInven")) {
				jTextFieldValorCampoGeneralTipoProductoServicioInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoProductoServicioInven")) {
				jButtonAbrirOrderByTipoProductoServicioInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoProductoServicioInven")) {
				jButtonAbrirOrderByTipoProductoServicioInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoProductoServicioInven")) {
				jButtonCerrarOrderByTipoProductoServicioInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProductoServicioInvenBusqueda")) {
				this.jButtonidTipoProductoServicioInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProductoServicioInvenBusqueda")) {
				this.jButtonnombreTipoProductoServicioInvenBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoProductoServicioInven")) {
				this.jButtonBusquedaPorNombreTipoProductoServicioInvenActionPerformed(evt);
			}
			
			;
			
			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoProductoServicioInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				


				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicioInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicioInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoProductoServicioInven tipoproductoservicioinvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoproductoservicioinvenLocal=this.tipoproductoservicioinven;
			} else {
				tipoproductoservicioinvenLocal=this.tipoproductoservicioinvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
							
				
				


				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicioInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicioInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
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
			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			
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
			
			


			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
								
						
				


				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicioInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicioInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
								
				
				


				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicioInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicioInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
							
				
				


				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicioInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicioInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
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
			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			
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
			
			


			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
								
				
				


				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicioInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicioInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoProductoServicioInven")) {
					jCheckBoxSeleccionarTodosTipoProductoServicioInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoProductoServicioInven")) {
					jCheckBoxSeleccionadosTipoProductoServicioInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoProductoServicioInven")) {
					
				}
				
				


				
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicioInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicioInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
												
				
				


				
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicioInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicioInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
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
			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
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
			
			


			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoServicioInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicioInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicioInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproductoservicioinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproductoservicioinven);
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
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
				
				


				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProductoServicioInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProductoServicioInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoServicioInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoservicioinvenAnterior =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoProductoServicioInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoProductoServicioInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoProductoServicioInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoproductoservicioinven =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoproductoservicioinven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoProductoServicioInven")) {
				
				}
				
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoProductoServicioInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoProductoServicioInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoProductoServicioInven")) {
			
			}
			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoProductoServicioInven();
			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			
			if(sTipo.equals("NuevoTipoProductoServicioInven")) {
				jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoProductoServicioInven")) {
				jButtonDuplicarTipoProductoServicioInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoProductoServicioInven")) {
				jButtonCopiarTipoProductoServicioInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoProductoServicioInven")) {
				jButtonVerFormTipoProductoServicioInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoProductoServicioInven")) {
				jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoProductoServicioInven")) {
				jButtonModificarTipoProductoServicioInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoProductoServicioInven")) {
				jButtonActualizarTipoProductoServicioInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoProductoServicioInven")) {
				jButtonEliminarTipoProductoServicioInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoProductoServicioInven")) {
				jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoProductoServicioInven")) {
				jButtonCancelarTipoProductoServicioInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoProductoServicioInven")) {
				jButtonCerrarTipoProductoServicioInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoProductoServicioInven")) {
				jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProductoServicioInven")) {
				jButtonNuevoGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoProductoServicioInven")) {
				jButtonAbrirOrderByTipoProductoServicioInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoProductoServicioInven")) {
				jButtonRecargarInformacionTipoProductoServicioInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoProductoServicioInven")) {
				jButtonAnterioresTipoProductoServicioInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoProductoServicioInven")) {
				jButtonSiguientesTipoProductoServicioInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProductoServicioInvenBusqueda")) {
				this.jButtonidTipoProductoServicioInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProductoServicioInvenBusqueda")) {
				this.jButtonnombreTipoProductoServicioInvenBusquedaActionPerformed(evt);
			}
			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoProductoServicioInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoProductoServicioInven")) {
				closingInternalFrameTipoProductoServicioInven();
				
			} else if(sTipo.equals("jButtonCancelarTipoProductoServicioInven")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoProductoServicioInven = (JInternalFrameBase)evt.getSource();
	            	
	            TipoProductoServicioInvenBeanSwingJInternalFrame jInternalFrameParent=(TipoProductoServicioInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProductoServicioInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoProductoServicioInvenActionPerformed(null);
			}
			
			TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoproductoservicioinven,new Object(),this.tipoproductoservicioinvenParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoProductoServicioInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoProductoServicioInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoProductoServicioInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoproductoservicioinven)) {
			if(!esControlTabla) {
				if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoProductoServicioInven(this.tipoproductoservicioinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(this.tipoproductoservicioinven);			
				}
				
				if(this.tipoproductoservicioinvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoProductoServicioInven(this.tipoproductoservicioinven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoproductoservicioinvenReturnGeneral=tipoproductoservicioinvenLogic.procesarEventosTipoProductoServicioInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens(),this.tipoproductoservicioinven,this.tipoproductoservicioinvenParameterGeneral,this.isEsNuevoTipoProductoServicioInven,classes);//this.tipoproductoservicioinvenLogic.getTipoProductoServicioInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoProductoServicioInven(this.tipoproductoservicioinvenReturnGeneral,this.tipoproductoservicioinvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoproductoservicioinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoProductoServicioInven(classes,this.tipoproductoservicioinvenReturnGeneral,this.tipoproductoservicioinvenBean,false);
					}
						
					if(this.tipoproductoservicioinvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoProductoServicioInven(this.tipoproductoservicioinvenReturnGeneral.getTipoProductoServicioInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoProductoServicioInven(this.tipoproductoservicioinvenReturnGeneral.getTipoProductoServicioInven());	
					}
						
					if(this.tipoproductoservicioinvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoProductoServicioInven(this.tipoproductoservicioinvenReturnGeneral.getTipoProductoServicioInven(),classes);//this.tipoproductoservicioinvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoProductoServicioInven(this.tipoproductoservicioinven,classes);//this.tipoproductoservicioinvenBean);									
				}
			
				if(TipoProductoServicioInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoProductoServicioInven(this.tipoproductoservicioinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProductoServicioInven(this.tipoproductoservicioinven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoproductoservicioinvenAnterior!=null) {
						this.tipoproductoservicioinven=this.tipoproductoservicioinvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoproductoservicioinvenReturnGeneral=tipoproductoservicioinvenLogic.procesarEventosTipoProductoServicioInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens(),this.tipoproductoservicioinven,this.tipoproductoservicioinvenParameterGeneral,this.isEsNuevoTipoProductoServicioInven,classes);//this.tipoproductoservicioinvenLogic.getTipoProductoServicioInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoproductoservicioinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoproductoservicioinvenReturnGeneral.getTipoProductoServicioInven(),tipoproductoservicioinvenLogic.getTipoProductoServicioInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoproductoservicioinvenReturnGeneral.getTipoProductoServicioInven(),this.tipoproductoservicioinvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoProductoServicioInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoProductoServicioInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoProductoServicioInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoProductoServicioInven() throws Exception {
		
		TipoProductoServicioInvenModel tipoproductoservicioinvenModel=(TipoProductoServicioInvenModel)this.jTableDatosTipoProductoServicioInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoproductoservicioinvenModel.tipoproductoservicioinvens=this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoproductoservicioinvenModel.tipoproductoservicioinvens=this.tipoproductoservicioinvens;
		}
		
		
		((TipoProductoServicioInvenModel) this.jTableDatosTipoProductoServicioInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoProductoServicioInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoproductoservicioinvenAnterior(),this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoproductoservicioinvenAnterior(),this.tipoproductoservicioinvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoProductoServicioInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(tipoproductoservicioinven.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
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
										
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproductoservicioinven,new Object(),generalEntityParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoProductoServicioInvenConstantesFunciones.getClassesRelationshipsOfTipoProductoServicioInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoProductoServicioInvenConstantesFunciones.getClassesRelationshipsFromStringsOfTipoProductoServicioInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoProductoServicioInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoProductoServicioInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproductoservicioinven,new Object(),generalEntityParameterGeneral,this.tipoproductoservicioinvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoProductoServicioInven(TipoProductoServicioInvenBean tipoproductoservicioinvenBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(tipoproductoservicioinven.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoProductoServicioInven(ArrayList<Classe> classes,TipoProductoServicioInvenReturnGeneral tipoproductoservicioinvenReturnGeneral,TipoProductoServicioInvenBean tipoproductoservicioinvenBean,Boolean conDefault) throws Exception {
		
			this.tipoproductoservicioinvenBean.setParametroInventarioDefectos(tipoproductoservicioinvenReturnGeneral.getTipoProductoServicioInven().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					tipoproductoservicioinven.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoproductoservicioinven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven = new TipoProductoServicioInvenDetalleFormJInternalFrame(jDesktopPane,this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones(),this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProductoServicioInven);
		this.jInternalFrameDetalleFormTipoProductoServicioInven.setVisible(false);
		this.jInternalFrameDetalleFormTipoProductoServicioInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.tipoproductoservicioinvenLogic=this.tipoproductoservicioinvenLogic;
		
		this.cargarCombosFrameForeignKeyTipoProductoServicioInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProductoServicioInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProductoServicioInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoProductoServicioInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoProductoServicioInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProductoServicioInven"));
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonModificarTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"ModificarTipoProductoServicioInven"));

		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonModificarToolBarTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProductoServicioInven"));
					
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemModificarTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProductoServicioInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonActualizarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"ActualizarTipoProductoServicioInven"));
		
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonActualizarToolBarTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProductoServicioInven"));
						
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemActualizarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProductoServicioInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonEliminarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"EliminarTipoProductoServicioInven"));
		
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonEliminarToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProductoServicioInven"));
								
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemEliminarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProductoServicioInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonCancelarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"CancelarTipoProductoServicioInven"));
		
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonCancelarToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProductoServicioInven"));
					
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemCancelarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProductoServicioInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemDetalleCerrarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProductoServicioInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonGuardarCambiosToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProductoServicioInven"));
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonGuardarCambiosToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProductoServicioInven"));
		
		
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProductoServicioInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonidTipoProductoServicioInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProductoServicioInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonnombreTipoProductoServicioInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProductoServicioInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jTabbedPaneRelacionesTipoProductoServicioInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProductoServicioInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoProductoServicioInven"));
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProductoServicioInven"));
		}
		
		this.jTableDatosTipoProductoServicioInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoProductoServicioInven"));
		
		this.jTableDatosTipoProductoServicioInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoProductoServicioInven"));
		
		this.jButtonNuevoTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"NuevoTipoProductoServicioInven"));
		
		this.jButtonDuplicarTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"DuplicarTipoProductoServicioInven"));
		
		this.jButtonCopiarTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"CopiarTipoProductoServicioInven"));
		
		this.jButtonVerFormTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"VerFormTipoProductoServicioInven"));
		
		
		this.jButtonNuevoToolBarTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoProductoServicioInven"));
			
		this.jButtonDuplicarToolBarTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoProductoServicioInven"));
			
		this.jMenuItemNuevoTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoProductoServicioInven"));
			
		this.jMenuItemDuplicarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoProductoServicioInven"));		
		
		
		this.jButtonNuevoRelacionesTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoProductoServicioInven"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoProductoServicioInven"));
			
		this.jMenuItemNuevoRelacionesTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoProductoServicioInven"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonModificarTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"ModificarTipoProductoServicioInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonModificarToolBarTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProductoServicioInven"));
			
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemModificarTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProductoServicioInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonActualizarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"ActualizarTipoProductoServicioInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonActualizarToolBarTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProductoServicioInven"));
				
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemActualizarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProductoServicioInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonEliminarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"EliminarTipoProductoServicioInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonEliminarToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProductoServicioInven"));
						
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemEliminarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProductoServicioInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonCancelarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"CancelarTipoProductoServicioInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonCancelarToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProductoServicioInven"));
			
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemCancelarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProductoServicioInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoProductoServicioInven"));		
		
		
		this.jButtonCerrarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"CerrarTipoProductoServicioInven"));
		
		
		this.jButtonCerrarToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoProductoServicioInven"));
			
		this.jMenuItemCerrarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoProductoServicioInven"));
			
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jMenuItemDetalleCerrarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProductoServicioInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonGuardarCambiosTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoProductoServicioInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonGuardarCambiosToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProductoServicioInven"));
		}
		
		this.jButtonCopiarToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoProductoServicioInven"));
			
		this.jButtonVerFormToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoProductoServicioInven"));
		
		this.jMenuItemGuardarCambiosTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoProductoServicioInven"));
			
		this.jMenuItemCopiarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoProductoServicioInven"));		
		
		this.jMenuItemVerFormTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoProductoServicioInven"));		
		
		
		this.jButtonGuardarCambiosTablaTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProductoServicioInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoProductoServicioInven"));
			
		this.jMenuItemGuardarCambiosTablaTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProductoServicioInven"));		
		
		
		
		this.jButtonRecargarInformacionTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoProductoServicioInven"));
					
		this.jButtonRecargarInformacionToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoProductoServicioInven"));
		
		this.jMenuItemRecargarInformacionTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoProductoServicioInven"));		
		
		
		
		this.jButtonAnterioresTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"AnterioresTipoProductoServicioInven"));
		
		
		this.jButtonAnterioresToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoProductoServicioInven"));
		
		this.jMenuItemAnterioresTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoProductoServicioInven"));		
		
		
		this.jButtonSiguientesTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"SiguientesTipoProductoServicioInven"));
		
		
		this.jButtonSiguientesToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoProductoServicioInven"));
			
		this.jMenuItemSiguientesTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoProductoServicioInven"));
			
		this.jMenuItemAbrirOrderByTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoProductoServicioInven"));
			
		this.jMenuItemMostrarOcultarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoProductoServicioInven"));
			
		this.jMenuItemDetalleAbrirOrderByTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoProductoServicioInven"));
			
		this.jMenuItemDetalleMostarOcultarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoProductoServicioInven"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoProductoServicioInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoProductoServicioInven"));
			
		this.jMenuItemNuevoGuardarCambiosTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoProductoServicioInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoProductoServicioInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoProductoServicioInven"));

		this.jCheckBoxSeleccionadosTipoProductoServicioInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoProductoServicioInven"));
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProductoServicioInven"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoProductoServicioInven"));
			
		this.jComboBoxTiposAccionesTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoProductoServicioInven"));
					
		this.jComboBoxTiposSeleccionarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoProductoServicioInven"));
			
		this.jTextFieldValorCampoGeneralTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoProductoServicioInven"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonidTipoProductoServicioInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProductoServicioInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonnombreTipoProductoServicioInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProductoServicioInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoProductoServicioInven"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoProductoServicioInven!=null) {
				this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProductoServicioInven"));
				this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProductoServicioInven"));
				this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProductoServicioInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProductoServicioInven"));				
			//this.jButtonGenerarReporteDinamicoTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProductoServicioInven"));
			//this.jButtonGenerarExcelReporteDinamicoTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProductoServicioInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoProductoServicioInven!=null) {
				this.jInternalFrameImportacionTipoProductoServicioInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProductoServicioInven"));
				this.jInternalFrameImportacionTipoProductoServicioInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProductoServicioInven"));
				this.jInternalFrameImportacionTipoProductoServicioInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProductoServicioInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoProductoServicioInven"));
			
			this.jButtonAbrirOrderByToolBarTipoProductoServicioInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoProductoServicioInven"));			
			
			if(this.jInternalFrameOrderByTipoProductoServicioInven!=null) {
				this.jInternalFrameOrderByTipoProductoServicioInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProductoServicioInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProductoServicioInven.jTabbedPaneRelacionesTipoProductoServicioInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProductoServicioInven"));
		
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
            		closingInternalFrameTipoProductoServicioInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoProductoServicioInven = (JInternalFrameBase)event.getSource();
	            	
	            TipoProductoServicioInvenBeanSwingJInternalFrame jInternalFrameParent=(TipoProductoServicioInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProductoServicioInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoProductoServicioInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoProductoServicioInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoProductoServicioInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoProductoServicioInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoProductoServicioInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoProductoServicioInven";
		inputMap = this.jButtonNuevoTipoProductoServicioInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoProductoServicioInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoProductoServicioInven";
		inputMap = this.jButtonNuevoRelacionesTipoProductoServicioInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoProductoServicioInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProductoServicioInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoProductoServicioInven";
		inputMap = this.jButtonModificarTipoProductoServicioInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoProductoServicioInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoProductoServicioInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoProductoServicioInven";
		inputMap = this.jButtonActualizarTipoProductoServicioInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoProductoServicioInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoProductoServicioInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoProductoServicioInven";
		inputMap = this.jButtonEliminarTipoProductoServicioInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoProductoServicioInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoProductoServicioInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoProductoServicioInven";
		inputMap = this.jButtonCancelarTipoProductoServicioInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoProductoServicioInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoProductoServicioInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoProductoServicioInven";
		inputMap = this.jButtonCerrarTipoProductoServicioInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoProductoServicioInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoProductoServicioInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonGuardarCambiosTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoProductoServicioInven";
		inputMap = this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonGuardarCambiosTipoProductoServicioInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonGuardarCambiosTipoProductoServicioInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoProductoServicioInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoProductoServicioInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoProductoServicioInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoProductoServicioInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoProductoServicioInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoProductoServicioInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoProductoServicioInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoProductoServicioInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonidTipoProductoServicioInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProductoServicioInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jButtonnombreTipoProductoServicioInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProductoServicioInvenBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoProductoServicioInven.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoProductoServicioInven"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoProductoServicioInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoProductoServicioInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoProductoServicioInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoProductoServicioInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoProductoServicioInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()) {
					tipoproductoservicioinvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProductoServicioInven tipoproductoservicioinvenAux:tipoproductoservicioinvens) {
					tipoproductoservicioinvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoProductoServicioInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProductoServicioInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()) {
						tipoproductoservicioinvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProductoServicioInven tipoproductoservicioinvenAux:tipoproductoservicioinvens) {
						tipoproductoservicioinvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProductoServicioInven tipoproductoservicioinvenAux:tipoproductoservicioinvens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProductoServicioInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProductoServicioInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProductoServicioInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoProductoServicioInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProductoServicioInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoProductoServicioInven.getSelectedRows();
			
			TipoProductoServicioInven tipoproductoservicioinvenLocal=new TipoProductoServicioInven();
			
			//this.seleccionarTodosTipoProductoServicioInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoservicioinvenLocal =(TipoProductoServicioInven) this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoproductoservicioinvenLocal =(TipoProductoServicioInven) this.tipoproductoservicioinvens.toArray()[this.jTableDatosTipoProductoServicioInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoproductoservicioinvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()) {
						tipoproductoservicioinvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProductoServicioInven tipoproductoservicioinvenAux:tipoproductoservicioinvens) {
						tipoproductoservicioinvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProductoServicioInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProductoServicioInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProductoServicioInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoProductoServicioInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoProductoServicioInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoProductoServicioInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoProductoServicioInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoProductoServicioInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()) {
				
						if(sTipoSeleccionar.equals(TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoproductoservicioinvenAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProductoServicioInven tipoproductoservicioinvenAux:tipoproductoservicioinvens) {
					
						if(sTipoSeleccionar.equals(TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoproductoservicioinvenAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoProductoServicioInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoProductoServicioInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoProductoServicioInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoProductoServicioInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoProductoServicioInven.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoProductoServicioInven) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoProductoServicioInven(conSplash);
				
					this.generarReporteTipoProductoServicioInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProductoServicioInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProductoServicioInven.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoProductoServicioInvensSeleccionados();
				//this.jComboBoxTiposAccionesTipoProductoServicioInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProductoServicioInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoProductoServicioInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProductoServicioInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoProductoServicioInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProductoServicioInven();
				
				this.exportarTipoProductoServicioInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProductoServicioInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProductoServicioInven.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoProductoServicioInvens();
				//this.importarTipoProductoServicioInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProductoServicioInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProductoServicioInven.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProductoServicioInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoProductoServicioInvensSeleccionados();
				//this.jComboBoxTiposAccionesTipoProductoServicioInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Producto Servicio Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoProductoServicioInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoProductoServicioInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoProductoServicioInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Producto Servicio Inventario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProductoServicioInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProductoServicioInven.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoProductoServicioInven();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoProductoServicioInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoProductoServicioInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoProductoServicioInven();
			
			if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();		
			TipoProductoServicioInven tipoproductoservicioinven=new TipoProductoServicioInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoProductoServicioInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoProductoServicioInven.getSelectedItem();
			
			
			
			
			tipoproductoservicioinvensSeleccionados=this.getTipoProductoServicioInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoproductoservicioinvensSeleccionados.size()==1) {
				for(TipoProductoServicioInven tipoproductoservicioinvenAux:tipoproductoservicioinvensSeleccionados) {
					tipoproductoservicioinven=tipoproductoservicioinvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,tipoproductoservicioinven);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoProductoServicioInven();
			
      		//this.finishProcessTipoProductoServicioInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoProductoServicioInvenReturnGeneral() throws Exception {
		if(this.tipoproductoservicioinvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoproductoservicioinvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoproductoservicioinvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoproductoservicioinvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoproductoservicioinvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoproductoservicioinvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoProductoServicioInven(false);
		}
		
		if(this.tipoproductoservicioinvenReturnGeneral.getConRetornoLista() || this.tipoproductoservicioinvenReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoproductoservicioinvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoproductoservicioinvenLogic.setTipoProductoServicioInvens(this.tipoproductoservicioinvenReturnGeneral.getTipoProductoServicioInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoproductoservicioinvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoproductoservicioinvenLogic.setTipoProductoServicioInven(this.tipoproductoservicioinvenReturnGeneral.getTipoProductoServicioInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoProductoServicioInven(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoProductoServicioInven() throws Exception {
		
		
	}
	
	public ArrayList<TipoProductoServicioInven> getTipoProductoServicioInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoProductoServicioInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoProductoServicioInven tipoproductoservicioinvenAux:tipoproductoservicioinvenLogic.getTipoProductoServicioInvens()) {
					if(tipoproductoservicioinvenAux.getIsSelected()) {
						tipoproductoservicioinvensSeleccionados.add(tipoproductoservicioinvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProductoServicioInven tipoproductoservicioinvenAux:this.tipoproductoservicioinvens) {
					if(tipoproductoservicioinvenAux.getIsSelected()) {
						tipoproductoservicioinvensSeleccionados.add(tipoproductoservicioinvenAux);				
					}
				}
			}
			
			if(tipoproductoservicioinvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoproductoservicioinvensSeleccionados.addAll(this.tipoproductoservicioinvenLogic.getTipoProductoServicioInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoproductoservicioinvensSeleccionados.addAll(this.tipoproductoservicioinvens);				
					}
				}
			}
		} else {
			tipoproductoservicioinvensSeleccionados.add(this.tipoproductoservicioinven);
		}
		
		return tipoproductoservicioinvensSeleccionados;
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
	
	public void generarReporteTipoProductoServicioInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoProductoServicioInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoProductoServicioInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProductoServicioInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProductoServicioInvensSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoProductoServicioInvensSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Producto Servicio Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoProductoServicioInvensSeleccionados() throws Exception {
		ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();		
		
		tipoproductoservicioinvensSeleccionados=this.getTipoProductoServicioInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoProductoServicioInvens("Todos",tipoproductoservicioinvensSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoProductoServicioInvensSeleccionados() throws Exception {
		ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();		
		
		tipoproductoservicioinvensSeleccionados=this.getTipoProductoServicioInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoProductoServicioInvens("Todos",tipoproductoservicioinvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoProductoServicioInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();
		
		tipoproductoservicioinvensSeleccionados=this.getTipoProductoServicioInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoProductoServicioInvens("Todos",tipoproductoservicioinvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoProductoServicioInvensSeleccionados() throws Exception {
		ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoProductoServicioInven();
		
		
		tipoproductoservicioinvensSeleccionados=this.getTipoProductoServicioInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoProductoServicioInven();
		
		
		//this.generarReporteTipoProductoServicioInvens("Todos",tipoproductoservicioinvensSeleccionados ,tipoproductoservicioinvenImplementable,tipoproductoservicioinvenImplementableHome);
	}
	
	public void mostrarImportacionTipoProductoServicioInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoProductoServicioInven();
		
		this.abrirFrameImportacionTipoProductoServicioInven();		
		
			
		//this.generarReporteTipoProductoServicioInvens("Todos",tipoproductoservicioinvensSeleccionados ,tipoproductoservicioinvenImplementable,tipoproductoservicioinvenImplementableHome);
	}
	
	public void importarTipoProductoServicioInvens() throws Exception {		
	
	}
	
	public void exportarTipoProductoServicioInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoProductoServicioInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoProductoServicioInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoProductoServicioInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Producto Servicio Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoProductoServicioInvensSeleccionados() throws Exception {
		ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();		
		
		tipoproductoservicioinvensSeleccionados=this.getTipoProductoServicioInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicioinven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoProductoServicioInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoProductoServicioInven tipoproductoservicioinvenAux:tipoproductoservicioinvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoProductoServicioInven(tipoproductoservicioinvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoproductoservicioinvenAux.setsDetalleGeneralEntityReporte(tipoproductoservicioinvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoProductoServicioInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoProductoServicioInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProductoServicioInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoproductoservicioinven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoproductoservicioinven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoproductoservicioinven.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoProductoServicioInvensSeleccionados() throws Exception {
		ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();		
		
		tipoproductoservicioinvensSeleccionados=this.getTipoProductoServicioInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicioinven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoProductoServicioInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoProductoServicioInven(row);				
				iRow++;
			}				
			
			for(TipoProductoServicioInven tipoproductoservicioinvenAux:tipoproductoservicioinvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoProductoServicioInven(tipoproductoservicioinvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoProductoServicioInvensSeleccionados() throws Exception {
		ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();		
		
		tipoproductoservicioinvensSeleccionados=this.getTipoProductoServicioInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproductoservicioinven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoproductoservicioinvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoproductoservicioinven");
			//elementRoot.appendChild(element);
		
			for(TipoProductoServicioInven tipoproductoservicioinvenAux:tipoproductoservicioinvensSeleccionados) {
				element = document.createElement("tipoproductoservicioinven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoProductoServicioInven(tipoproductoservicioinvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto Servicio Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoProductoServicioInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProductoServicioInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProductoServicioInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoproductoservicioinven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoproductoservicioinven.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoProductoServicioInven(TipoProductoServicioInven tipoproductoservicioinven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoProductoServicioInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoproductoservicioinven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoProductoServicioInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoproductoservicioinven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoProductoServicioInvenConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoproductoservicioinven.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoProductoServicioInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados=new ArrayList<TipoProductoServicioInven>();
		
		tipoproductoservicioinvensSeleccionados=this.getTipoProductoServicioInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoProductoServicioInven(tipoproductoservicioinvensSeleccionados);
		
		this.generarReporteTipoProductoServicioInvens("Todos",tipoproductoservicioinvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoProductoServicioInven(ArrayList<TipoProductoServicioInven> tipoproductoservicioinvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoProductoServicioInven tipoproductoservicioinvenAux:tipoproductoservicioinvensSeleccionados) {
				tipoproductoservicioinvenAux.setsDetalleGeneralEntityReporte(tipoproductoservicioinvenAux.toString());
			
				if(sTipoSeleccionar.equals(TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoproductoservicioinvenAux.setsDescripcionGeneralEntityReporte1(tipoproductoservicioinvenAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoServicioInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoProductoServicioInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoProductoServicioInven=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=true;
				this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=true;
			}
			
			this.isVisibilidadCeldaModificarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaEliminarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicioInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoProductoServicioInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=false;
			this.isVisibilidadCeldaModificarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicioInven=true;
			this.isVisibilidadCeldaEliminarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicioInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoProductoServicioInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=false;
			this.isVisibilidadCeldaModificarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicioInven=true;
			this.isVisibilidadCeldaEliminarTipoProductoServicioInven=true;
			this.isVisibilidadCeldaCancelarTipoProductoServicioInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoProductoServicioInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=false;
			this.isVisibilidadCeldaModificarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicioInven=true;
			this.isVisibilidadCeldaEliminarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicioInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoProductoServicioInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=true;
			this.isVisibilidadCeldaModificarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaEliminarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicioInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoProductoServicioInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=false;
			this.isVisibilidadCeldaActualizarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaEliminarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicioInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoProductoServicioInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=false;
			this.isVisibilidadCeldaModificarTipoProductoServicioInven=true;
			this.isVisibilidadCeldaActualizarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaEliminarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaCancelarTipoProductoServicioInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProductoServicioInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoProductoServicioInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoProductoServicioInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=true;
		} else {
			this.actualizarEstadoPanelsTipoProductoServicioInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoProductoServicioInven=false;
			//this.isVisibilidadCeldaVerFormTipoProductoServicioInven=false;
			this.isVisibilidadCeldaDuplicarTipoProductoServicioInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoProductoServicioInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
			if(!tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=false;												
			}
			
			this.jButtonCerrarTipoProductoServicioInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProductoServicioInven=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoproductoservicioinven)) {
			this.isVisibilidadCeldaActualizarTipoProductoServicioInven=false;
			this.isVisibilidadCeldaEliminarTipoProductoServicioInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProductoServicioInven() {
		this.isVisibilidadCeldaNuevoTipoProductoServicioInven=false;
		this.isVisibilidadCeldaGuardarCambiosTipoProductoServicioInven=false;
	}
	
	public void actualizarEstadoPanelsTipoProductoServicioInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicioInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicioInven!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicioInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosTipoProductoServicioInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProductoServicioInven!=null) {
				this.jPanelPaginacionTipoProductoServicioInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicioInven!=null) {
				this.jPanelParametrosReportesTipoProductoServicioInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicioInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicioInven!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicioInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosTipoProductoServicioInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProductoServicioInven!=null) {
				this.jPanelPaginacionTipoProductoServicioInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicioInven!=null) {
				this.jPanelParametrosReportesTipoProductoServicioInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicioInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicioInven!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicioInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosTipoProductoServicioInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProductoServicioInven!=null) {
				this.jPanelPaginacionTipoProductoServicioInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicioInven!=null) {
				this.jPanelParametrosReportesTipoProductoServicioInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicioInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicioInven!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicioInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosTipoProductoServicioInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProductoServicioInven!=null) {
				this.jPanelPaginacionTipoProductoServicioInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicioInven!=null) {
				this.jPanelParametrosReportesTipoProductoServicioInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicioInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicioInven!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicioInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosTipoProductoServicioInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProductoServicioInven!=null) {
				this.jPanelPaginacionTipoProductoServicioInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicioInven!=null) {
				this.jPanelParametrosReportesTipoProductoServicioInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicioInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicioInven!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicioInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosTipoProductoServicioInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProductoServicioInven!=null) {
				this.jPanelPaginacionTipoProductoServicioInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicioInven!=null) {
				this.jPanelParametrosReportesTipoProductoServicioInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosEdicionTipoProductoServicioInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicioInven!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicioInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProductoServicioInven!=null) {
				this.jScrollPanelDatosTipoProductoServicioInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProductoServicioInven!=null) {
				this.jPanelPaginacionTipoProductoServicioInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicioInven!=null) {
				this.jPanelParametrosReportesTipoProductoServicioInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoProductoServicioInven!=null) {
					this.jTabbedPaneBusquedasTipoProductoServicioInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicioInven!=null) {
				this.jPanelParametrosReportesTipoProductoServicioInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProductoServicioInven!=null) {
				this.jTabbedPaneBusquedasTipoProductoServicioInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoProductoServicioInven!=null) {
				this.jPanelParametrosReportesTipoProductoServicioInven.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionTipoProductoServicioInvenParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.tipoproductoservicioinvenSessionBean==null) {
				this.tipoproductoservicioinvenSessionBean=new TipoProductoServicioInvenSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoSessionBean.setsPathNavegacionActual(tipoproductoservicioinvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(TipoProductoServicioInvenConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProductoServicioInven(true);
			this.jInternalFrameDetalleFormTipoProductoServicioInven.parametroinventariodefectoSessionBean.setlidTipoProductoServicioInvenActual(this.idTipoProductoServicioInvenActual);

			tipoproductoservicioinvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProductoServicioInven(true);
			tipoproductoservicioinvenSessionBean.setlIdTipoProductoServicioInvenActualForeignKey(this.idTipoProductoServicioInvenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoProductoServicioInvenSessionBean tipoproductoservicioinvenSessionBean=new TipoProductoServicioInvenSessionBean();
		
		if(this.tipoproductoservicioinvenSessionBean==null) {
			this.tipoproductoservicioinvenSessionBean=new TipoProductoServicioInvenSessionBean();
		}
		
		this.tipoproductoservicioinvenSessionBean.setsUltimaBusquedaTipoProductoServicioInven(this.getsAccionBusqueda());
		this.tipoproductoservicioinvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoproductoservicioinvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoproductoservicioinvenSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoProductoServicioInvenSessionBean tipoproductoservicioinvenSessionBean=new TipoProductoServicioInvenSessionBean();
		
		if(this.tipoproductoservicioinvenSessionBean==null) {
			this.tipoproductoservicioinvenSessionBean=new TipoProductoServicioInvenSessionBean();
		}
		
		if(this.tipoproductoservicioinvenSessionBean.getsUltimaBusquedaTipoProductoServicioInven()!=null&&!this.tipoproductoservicioinvenSessionBean.getsUltimaBusquedaTipoProductoServicioInven().equals("")) {
			this.setsAccionBusqueda(tipoproductoservicioinvenSessionBean.getsUltimaBusquedaTipoProductoServicioInven());
			this.setiNumeroPaginacion(tipoproductoservicioinvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoproductoservicioinvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoproductoservicioinvenSessionBean.getnombre());
				tipoproductoservicioinvenSessionBean.setnombre("");
			}
		}
		
		this.tipoproductoservicioinvenSessionBean.setsUltimaBusquedaTipoProductoServicioInven("");
		this.tipoproductoservicioinvenSessionBean.setiNumeroPaginacion(TipoProductoServicioInvenConstantesFunciones.INUMEROPAGINACION);
		this.tipoproductoservicioinvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoProductoServicioInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoProductoServicioInven() {
		this.updateBorderResaltarBusquedasFormularioTipoProductoServicioInven();
		this.updateVisibilidadBusquedasFormularioTipoProductoServicioInven();
		this.updateHabilitarBusquedasFormularioTipoProductoServicioInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoProductoServicioInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoProductoServicioInven.getComponents().length>0) {
	

		if(this.tipoproductoservicioinvenConstantesFunciones.resaltarBusquedaPorNombreTipoProductoServicioInven!=null) {
			index= this.jTabbedPaneBusquedasTipoProductoServicioInven.indexOfComponent(this.jPanelBusquedaPorNombreTipoProductoServicioInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProductoServicioInven.getComponent(index);
				jPanel.setBorder(this.tipoproductoservicioinvenConstantesFunciones.resaltarBusquedaPorNombreTipoProductoServicioInven);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoProductoServicioInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoProductoServicioInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoProductoServicioInven.indexOfComponent(this.jPanelBusquedaPorNombreTipoProductoServicioInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProductoServicioInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoproductoservicioinvenConstantesFunciones.mostrarBusquedaPorNombreTipoProductoServicioInven);
			if(!this.tipoproductoservicioinvenConstantesFunciones.mostrarBusquedaPorNombreTipoProductoServicioInven && index>-1) {
				this.jTabbedPaneBusquedasTipoProductoServicioInven.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoProductoServicioInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoProductoServicioInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoProductoServicioInven.indexOfComponent(this.jPanelBusquedaPorNombreTipoProductoServicioInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProductoServicioInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoproductoservicioinvenConstantesFunciones.activarBusquedaPorNombreTipoProductoServicioInven);
				this.jTabbedPaneBusquedasTipoProductoServicioInven.setEnabledAt(index,this.tipoproductoservicioinvenConstantesFunciones.activarBusquedaPorNombreTipoProductoServicioInven);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoProductoServicioInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoProductoServicioInven.indexOfComponent(this.jPanelBusquedaPorNombreTipoProductoServicioInven);

			this.jTabbedPaneBusquedasTipoProductoServicioInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProductoServicioInven.getComponent(index);

			this.tipoproductoservicioinvenConstantesFunciones.setResaltarBusquedaPorNombreTipoProductoServicioInven(resaltar);

			jPanel.setBorder(this.tipoproductoservicioinvenConstantesFunciones.resaltarBusquedaPorNombreTipoProductoServicioInven);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoProductoServicioInven.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoProductoServicioInven() throws Exception {

		if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoProductoServicioInven();
		this.updateVisibilidadResaltarControlesFormularioTipoProductoServicioInven();
		this.updateHabilitarResaltarControlesFormularioTipoProductoServicioInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoProductoServicioInven() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoproductoservicioinvenConstantesFunciones.resaltaridTipoProductoServicioInven!=null && this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextFieldidTipoProductoServicioInven.setBorder(this.tipoproductoservicioinvenConstantesFunciones.resaltaridTipoProductoServicioInven);}
		if(this.tipoproductoservicioinvenConstantesFunciones.resaltarnombreTipoProductoServicioInven!=null && this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextAreanombreTipoProductoServicioInven.setBorder(this.tipoproductoservicioinvenConstantesFunciones.resaltarnombreTipoProductoServicioInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoProductoServicioInven() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
	
		//this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextFieldidTipoProductoServicioInven.setVisible(this.tipoproductoservicioinvenConstantesFunciones.mostraridTipoProductoServicioInven);
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jPanelidTipoProductoServicioInven.setVisible(this.tipoproductoservicioinvenConstantesFunciones.mostraridTipoProductoServicioInven);
		//this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextAreanombreTipoProductoServicioInven.setVisible(this.tipoproductoservicioinvenConstantesFunciones.mostrarnombreTipoProductoServicioInven);
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jPanelnombreTipoProductoServicioInven.setVisible(this.tipoproductoservicioinvenConstantesFunciones.mostrarnombreTipoProductoServicioInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoProductoServicioInven() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProductoServicioInven!=null) {
	
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextFieldidTipoProductoServicioInven.setEnabled(this.tipoproductoservicioinvenConstantesFunciones.activaridTipoProductoServicioInven);
		this.jInternalFrameDetalleFormTipoProductoServicioInven.jTextAreanombreTipoProductoServicioInven.setEnabled(this.tipoproductoservicioinvenConstantesFunciones.activarnombreTipoProductoServicioInven);
		}
	}
	
		
}