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

import com.bydan.erp.inventario.util.TipoServicioConstantesFunciones;
import com.bydan.erp.inventario.util.TipoServicioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoServicioParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoServicioBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoServicioBeanSwingJInternalFrame extends TipoServicioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoServicioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoServicio> tiposervicioValidator = new ClassValidator<TipoServicio>(TipoServicio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoServicio tiposervicio;	
	public TipoServicio tiposervicioAux;
	public TipoServicio tiposervicioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoServicio tiposervicioTotales;
	public Long idTipoServicioActual;
	public Long iIdNuevoTipoServicio=0L;
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
	
	public Boolean isPermisoTodoTipoServicio;
	public Boolean isPermisoNuevoTipoServicio;
	public Boolean isPermisoActualizarTipoServicio;
	public Boolean isPermisoActualizarOriginalTipoServicio;
	public Boolean isPermisoEliminarTipoServicio;
	public Boolean isPermisoGuardarCambiosTipoServicio;
	public Boolean isPermisoConsultaTipoServicio;
	public Boolean isPermisoBusquedaTipoServicio;
	public Boolean isPermisoReporteTipoServicio;
	public Boolean isPermisoPaginacionMedioTipoServicio;
	public Boolean isPermisoPaginacionAltoTipoServicio;
	public Boolean isPermisoPaginacionTodoTipoServicio;
	public Boolean isPermisoCopiarTipoServicio;
	public Boolean isPermisoVerFormTipoServicio;
	public Boolean isPermisoDuplicarTipoServicio;
	public Boolean isPermisoOrdenTipoServicio;
	
	
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
	
	public TipoServicioParameterReturnGeneral tiposervicioReturnGeneral;
	public TipoServicioParameterReturnGeneral tiposervicioParameterGeneral;
	
	

	public ParametroInventarioDefectoLogic parametroinventariodefectoLogic=null;

	public ParametroInventarioDefectoLogic getParametroInventarioDefectoLogic() {
		return parametroinventariodefectoLogic;
	}

	public void setParametroInventarioDefectoLogic(ParametroInventarioDefectoLogic parametroinventariodefectoLogic) {
		this.parametroinventariodefectoLogic = parametroinventariodefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoServicio=false;
	public Boolean esParaAccionDesdeFormularioTipoServicio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoServicioLogic tiposervicioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoServicio tiposervicioBean;
	public TipoServicioConstantesFunciones tiposervicioConstantesFunciones;
	//public TipoServicioParameterReturnGeneral tiposervicioReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoServicio> tiposervicios;	
	//public List<TipoServicio> tiposerviciosEliminados;
	//public List<TipoServicio> tiposerviciosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoServicio=false;
	public Boolean isVisibilidadCeldaDuplicarTipoServicio=true;
	public Boolean isVisibilidadCeldaCopiarTipoServicio=true;
	public Boolean isVisibilidadCeldaVerFormTipoServicio=true;
	public Boolean isVisibilidadCeldaOrdenTipoServicio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoServicio=false;
	public Boolean isVisibilidadCeldaModificarTipoServicio=false;
	public Boolean isVisibilidadCeldaActualizarTipoServicio=false;
	public Boolean isVisibilidadCeldaEliminarTipoServicio=false;
	public Boolean isVisibilidadCeldaCancelarTipoServicio=false;
	public Boolean isVisibilidadCeldaGuardarTipoServicio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoServicio=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoServicio() {
		return this.iIdNuevoTipoServicio;
	}

	public void setiIdNuevoTipoServicio(Long iIdNuevoTipoServicio) {
		this.iIdNuevoTipoServicio = iIdNuevoTipoServicio;
	}
	
	public Long getidTipoServicioActual() {
		return this.idTipoServicioActual;
	}

	public void setidTipoServicioActual(Long idTipoServicioActual) {
		this.idTipoServicioActual = idTipoServicioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoServicio gettiposervicio() {
		return this.tiposervicio;
	}

	public void settiposervicio(TipoServicio tiposervicio) {
		this.tiposervicio = tiposervicio;
	}
	
	public TipoServicio gettiposervicioAux() {
		return this.tiposervicioAux;
	}

	public void settiposervicioAux(TipoServicio tiposervicioAux) {
		this.tiposervicioAux = tiposervicioAux;
	}				
	
	public TipoServicio gettiposervicioAnterior() {
		return this.tiposervicioAnterior;
	}

	public void settiposervicioAnterior(TipoServicio tiposervicioAnterior) {
		this.tiposervicioAnterior = tiposervicioAnterior;
	}	
	
	public TipoServicio gettiposervicioTotales() {
		return this.tiposervicioTotales;
	}

	public void settiposervicioTotales(TipoServicio tiposervicioTotales) {
		this.tiposervicioTotales = tiposervicioTotales;
	}	
	
	public TipoServicio gettiposervicioBean() {
		return this.tiposervicioBean;
	}

	public void settiposervicioBean(TipoServicio tiposervicioBean) {
		this.tiposervicioBean = tiposervicioBean;
	}	
	
	public TipoServicioParameterReturnGeneral gettiposervicioReturnGeneral() {
		return this.tiposervicioReturnGeneral;
	}

	public void settiposervicioReturnGeneral(TipoServicioParameterReturnGeneral tiposervicioReturnGeneral) {
		this.tiposervicioReturnGeneral = tiposervicioReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
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
	
	
	public TipoServicioLogic getTipoServicioLogic()	{		
		return tiposervicioLogic;
	}

	public void setTipoServicioLogic(TipoServicioLogic tiposervicioLogic) {
		this.tiposervicioLogic = tiposervicioLogic;
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
	
	public Boolean getIsEsNuevoTipoServicio() {
		return isEsNuevoTipoServicio;
	}

	public void setIsEsNuevoTipoServicio(Boolean isEsNuevoTipoServicio) {
		this.isEsNuevoTipoServicio = isEsNuevoTipoServicio;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoServicio() {
		return esParaAccionDesdeFormularioTipoServicio;
	}
	
	public void setEsParaAccionDesdeFormularioTipoServicio(Boolean esParaAccionDesdeFormularioTipoServicio) {
		this.esParaAccionDesdeFormularioTipoServicio = esParaAccionDesdeFormularioTipoServicio;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoServicio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoServicioConstantesFunciones.refrescarForeignKeysDescripcionesTipoServicio(this.tiposervicioLogic.getTipoServicios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoServicioConstantesFunciones.refrescarForeignKeysDescripcionesTipoServicio(this.tiposervicios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiposervicioLogic.setTipoServicios(this.tiposervicios);
			tiposervicioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoServicioParameterReturnGeneral getTipoServicioParameterGeneral() {
		return this.tiposervicioParameterGeneral;
	}
	
	public void setTipoServicioParameterGeneral(TipoServicioParameterReturnGeneral tiposervicioParameterGeneral) {
		this.tiposervicioParameterGeneral = tiposervicioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoServicio() {
		return isPermisoTodoTipoServicio;
	}

	public void setIsPermisoTodoTipoServicio(Boolean isPermisoTodoTipoServicio) {
		this.isPermisoTodoTipoServicio = isPermisoTodoTipoServicio;
	}

	public Boolean getIsPermisoNuevoTipoServicio() {
		return isPermisoNuevoTipoServicio;
	}

	public void setIsPermisoNuevoTipoServicio(Boolean isPermisoNuevoTipoServicio) {
		this.isPermisoNuevoTipoServicio = isPermisoNuevoTipoServicio;
	}

	public Boolean getIsPermisoActualizarTipoServicio() {
		return isPermisoActualizarTipoServicio;
	}

	public void setIsPermisoActualizarTipoServicio(Boolean isPermisoActualizarTipoServicio) {
		this.isPermisoActualizarTipoServicio = isPermisoActualizarTipoServicio;
	}

	public Boolean getIsPermisoEliminarTipoServicio() {
		return isPermisoEliminarTipoServicio;
	}

	public void setIsPermisoEliminarTipoServicio(Boolean isPermisoEliminarTipoServicio) {
		this.isPermisoEliminarTipoServicio = isPermisoEliminarTipoServicio;
	}

	public Boolean getIsPermisoGuardarCambiosTipoServicio() {
		return isPermisoGuardarCambiosTipoServicio;
	}

	public void setIsPermisoGuardarCambiosTipoServicio(Boolean isPermisoGuardarCambiosTipoServicio) {
		this.isPermisoGuardarCambiosTipoServicio = isPermisoGuardarCambiosTipoServicio;
	}
	
	public Boolean getIsPermisoConsultaTipoServicio() {
		return isPermisoConsultaTipoServicio;
	}

	public void setIsPermisoConsultaTipoServicio(Boolean isPermisoConsultaTipoServicio) {
		this.isPermisoConsultaTipoServicio = isPermisoConsultaTipoServicio;
	}

	public Boolean getIsPermisoBusquedaTipoServicio() {
		return isPermisoBusquedaTipoServicio;
	}

	public void setIsPermisoBusquedaTipoServicio(Boolean isPermisoBusquedaTipoServicio) {
		this.isPermisoBusquedaTipoServicio = isPermisoBusquedaTipoServicio;
	}

	public Boolean getIsPermisoReporteTipoServicio() {
		return isPermisoReporteTipoServicio;
	}

	public void setIsPermisoReporteTipoServicio(Boolean isPermisoReporteTipoServicio) {
		this.isPermisoReporteTipoServicio = isPermisoReporteTipoServicio;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoServicio() {
		return isPermisoPaginacionMedioTipoServicio;
	}

	public void setIsPermisoPaginacionMedioTipoServicio(Boolean isPermisoPaginacionMedioTipoServicio) {
		this.isPermisoPaginacionMedioTipoServicio = isPermisoPaginacionMedioTipoServicio;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoServicio() {
		return isPermisoPaginacionTodoTipoServicio;
	}

	public void setIsPermisoPaginacionTodoTipoServicio(Boolean isPermisoPaginacionTodoTipoServicio) {
		this.isPermisoPaginacionTodoTipoServicio = isPermisoPaginacionTodoTipoServicio;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoServicio() {
		return isPermisoPaginacionAltoTipoServicio;
	}

	public void setIsPermisoPaginacionAltoTipoServicio(Boolean isPermisoPaginacionAltoTipoServicio) {
		this.isPermisoPaginacionAltoTipoServicio = isPermisoPaginacionAltoTipoServicio;
	}
	
	public Boolean getIsPermisoCopiarTipoServicio() {
		return isPermisoCopiarTipoServicio;
	}

	public void setIsPermisoCopiarTipoServicio(Boolean isPermisoCopiarTipoServicio) {
		this.isPermisoCopiarTipoServicio = isPermisoCopiarTipoServicio;
	}
	
	public Boolean getIsPermisoVerFormTipoServicio() {
		return isPermisoVerFormTipoServicio;
	}

	public void setIsPermisoVerFormTipoServicio(Boolean isPermisoVerFormTipoServicio) {
		this.isPermisoVerFormTipoServicio = isPermisoVerFormTipoServicio;
	}
	
	public Boolean getIsPermisoDuplicarTipoServicio() {
		return isPermisoDuplicarTipoServicio;
	}

	public void setIsPermisoDuplicarTipoServicio(Boolean isPermisoDuplicarTipoServicio) {
		this.isPermisoDuplicarTipoServicio = isPermisoDuplicarTipoServicio;
	}
	
	public Boolean getIsPermisoOrdenTipoServicio() {
		return isPermisoOrdenTipoServicio;
	}

	public void setIsPermisoOrdenTipoServicio(Boolean isPermisoOrdenTipoServicio) {
		this.isPermisoOrdenTipoServicio = isPermisoOrdenTipoServicio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoServicio() {
		return isVisibilidadCeldaNuevoTipoServicio;
	}

	public void setIsVisibilidadCeldaNuevoTipoServicio(Boolean isVisibilidadCeldaNuevoTipoServicio) {
		this.isVisibilidadCeldaNuevoTipoServicio = isVisibilidadCeldaNuevoTipoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoServicio() {
		return isVisibilidadCeldaDuplicarTipoServicio;
	}

	public void setIsVisibilidadCeldaDuplicarTipoServicio(Boolean isVisibilidadCeldaDuplicarTipoServicio) {
		this.isVisibilidadCeldaDuplicarTipoServicio = isVisibilidadCeldaDuplicarTipoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoServicio() {
		return isVisibilidadCeldaCopiarTipoServicio;
	}

	public void setIsVisibilidadCeldaCopiarTipoServicio(Boolean isVisibilidadCeldaCopiarTipoServicio) {
		this.isVisibilidadCeldaCopiarTipoServicio = isVisibilidadCeldaCopiarTipoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoServicio() {
		return isVisibilidadCeldaVerFormTipoServicio;
	}

	public void setIsVisibilidadCeldaVerFormTipoServicio(Boolean isVisibilidadCeldaVerFormTipoServicio) {
		this.isVisibilidadCeldaVerFormTipoServicio = isVisibilidadCeldaVerFormTipoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoServicio() {
		return isVisibilidadCeldaOrdenTipoServicio;
	}

	public void setIsVisibilidadCeldaOrdenTipoServicio(Boolean isVisibilidadCeldaOrdenTipoServicio) {
		this.isVisibilidadCeldaOrdenTipoServicio = isVisibilidadCeldaOrdenTipoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoServicio() {
		return isVisibilidadCeldaNuevoRelacionesTipoServicio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoServicio(Boolean isVisibilidadCeldaNuevoRelacionesTipoServicio) {
		this.isVisibilidadCeldaNuevoRelacionesTipoServicio = isVisibilidadCeldaNuevoRelacionesTipoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoServicio() {
		return isVisibilidadCeldaModificarTipoServicio;
	}

	public void setIsVisibilidadCeldaModificarTipoServicio(Boolean isVisibilidadCeldaModificarTipoServicio) {
		this.isVisibilidadCeldaModificarTipoServicio = isVisibilidadCeldaModificarTipoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoServicio() {
		return isVisibilidadCeldaActualizarTipoServicio;
	}

	public void setIsVisibilidadCeldaActualizarTipoServicio(Boolean isVisibilidadCeldaActualizarTipoServicio) {
		this.isVisibilidadCeldaActualizarTipoServicio = isVisibilidadCeldaActualizarTipoServicio;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoServicio() {
		return isVisibilidadCeldaEliminarTipoServicio;
	}

	public void setIsVisibilidadCeldaEliminarTipoServicio(Boolean isVisibilidadCeldaEliminarTipoServicio) {
		this.isVisibilidadCeldaEliminarTipoServicio = isVisibilidadCeldaEliminarTipoServicio;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoServicio() {
		return isVisibilidadCeldaCancelarTipoServicio;
	}

	public void setIsVisibilidadCeldaCancelarTipoServicio(Boolean isVisibilidadCeldaCancelarTipoServicio) {
		this.isVisibilidadCeldaCancelarTipoServicio = isVisibilidadCeldaCancelarTipoServicio;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoServicio() {
		return isVisibilidadCeldaGuardarTipoServicio;
	}

	public void setIsVisibilidadCeldaGuardarTipoServicio(Boolean isVisibilidadCeldaGuardarTipoServicio) {
		this.isVisibilidadCeldaGuardarTipoServicio = isVisibilidadCeldaGuardarTipoServicio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoServicio() {
		return isVisibilidadCeldaGuardarCambiosTipoServicio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoServicio(Boolean isVisibilidadCeldaGuardarCambiosTipoServicio) {
		this.isVisibilidadCeldaGuardarCambiosTipoServicio = isVisibilidadCeldaGuardarCambiosTipoServicio;
	}
		
	public TipoServicioSessionBean gettiposervicioSessionBean() {
		return this.tiposervicioSessionBean;
	}
	
	public void settiposervicioSessionBean(TipoServicioSessionBean tiposervicioSessionBean) {
		this.tiposervicioSessionBean=tiposervicioSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoServicio(TipoServicio tiposervicio)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoServicio tiposervicio,TipoServicio tiposervicioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoServicio(tiposervicio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiposervicioAux.setId(tiposervicio.getId());
		tiposervicioAux.setVersionRow(tiposervicio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoServicio();
		
			int intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicio =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiposervicio =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoServicio(this.tiposervicio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiposervicioValidator.getInvalidValues(this.tiposervicio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiposervicioLogic.setDatosCliente(datosCliente);
			tiposervicioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiposervicioAux=new  TipoServicio();
				
				tiposervicioAux.setIsNew(true);
				tiposervicioAux.setIsChanged(true);
				
				tiposervicioAux.setTipoServicioOriginal(this.tiposervicio);
				
				tiposervicioAux.setId(this.tiposervicio.getId());	
				tiposervicioAux.setVersionRow(this.tiposervicio.getVersionRow());	
				tiposervicioAux.setcodigo(this.tiposervicio.getcodigo());	
				tiposervicioAux.setnombre(this.tiposervicio.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiposervicioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiposervicioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiposervicioAux,tiposervicioLogic.getTipoServicios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposervicioAux,tiposervicios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiposervicioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposervicioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposervicioLogic.saveTipoServicios();//WithConnection
						//tiposervicioLogic.getSetVersionRowTipoServicios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiposervicio,tiposervicioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposervicioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiposervicioAux=new  TipoServicio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiposervicioSessionBean.getEsGuardarRelacionado() 
					|| (this.tiposervicioSessionBean.getEsGuardarRelacionado() && this.tiposervicio.getId()>=0)) {
						
					tiposervicioAux.setIsNew(false);
				}
				
				tiposervicioAux.setIsDeleted(false);
			
				tiposervicioAux.setId(this.tiposervicio.getId());	
				tiposervicioAux.setVersionRow(this.tiposervicio.getVersionRow());	
				tiposervicioAux.setcodigo(this.tiposervicio.getcodigo());	
				tiposervicioAux.setnombre(this.tiposervicio.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiposervicioAux,tiposervicioLogic.getTipoServicios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposervicioAux,tiposervicios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiposervicioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposervicioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposervicioLogic.saveTipoServicios();//WithConnection
						//tiposervicioLogic.getSetVersionRowTipoServicios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiposervicio,tiposervicioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposervicioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiposervicioAux=new  TipoServicio();
				
				tiposervicioAux.setIsNew(false);
				tiposervicioAux.setIsChanged(false);
				
				tiposervicioAux.setIsDeleted(true);
				
				tiposervicioAux.setId(this.tiposervicio.getId());	
				tiposervicioAux.setVersionRow(this.tiposervicio.getVersionRow());	
				tiposervicioAux.setcodigo(this.tiposervicio.getcodigo());	
				tiposervicioAux.setnombre(this.tiposervicio.getnombre());	
				
				if(this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiposervicioAux.getId()>=0) {	
						this.tiposerviciosEliminados.add(tiposervicioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiposervicioAux,tiposervicioLogic.getTipoServicios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposervicioAux,tiposervicios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiposervicioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposervicioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposervicioLogic.saveTipoServicios();//WithConnection
						//tiposervicioLogic.getSetVersionRowTipoServicios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposervicioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tiposervicioAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiposervicioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiposervicioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiposervicioAux,tiposervicioLogic.getTipoServicios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiposervicioAux,tiposervicios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.getTipoServicios().addAll(this.tiposerviciosEliminados);
					
					tiposervicioLogic.saveTipoServicios();//WithConnection
					//tiposervicioLogic.getSetVersionRowTipoServicios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tiposerviciosEliminados= new ArrayList<TipoServicio>();		
			}
			
			if(this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Servicio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Servicio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiposervicio=tiposervicioAux;
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
      		//this.finishProcessTipoServicio();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoServicio tiposervicioLocal) throws Exception {
		
		if(this.tiposervicioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiposervicioLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				tiposervicioLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoServicio tiposervicioLocal) throws Exception {	
		if(this.tiposervicioSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoServicioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiposervicio =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiposervicio =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiposervicioValidator.getInvalidValues(this.tiposervicio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoServicio tiposervicio,List<TipoServicio> tiposervicios) throws Exception {
		try	{		
			TipoServicioConstantesFunciones.actualizarLista(tiposervicio,tiposervicios,this.tiposervicioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoServicio tiposervicio,List<TipoServicio> tiposervicios) throws Exception {
		try	{			
			TipoServicioConstantesFunciones.actualizarSelectedLista(tiposervicio,tiposervicios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoServicio> tiposerviciosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiposerviciosLocal=this.tiposervicioLogic.getTipoServicios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiposerviciosLocal=this.tiposervicios;
			}
			//ARCHITECTURE
		
			for(TipoServicio tiposervicioLocal:tiposerviciosLocal) {
				if(this.permiteMantenimiento(tiposervicioLocal) && tiposervicioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoServicioConstantesFunciones.getTipoServicioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoServicioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoServicio.jLabelcodigoTipoServicio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoServicioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoServicio.jLabelnombreTipoServicio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoServicio.jLabelcodigoTipoServicio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoServicio.jLabelnombreTipoServicio,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.tiposervicio==null) {
				this.tiposervicio= new TipoServicio();
			}

			if(this.tiposervicioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoServicio
				this.setVariablesFormularioToObjetoActualTipoServicio(this.tiposervicio,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);

				this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setTipoServicio(this.tiposervicio);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoServicio--;	
		
		
		this.tiposervicioAux=new TipoServicio();
		
		this.tiposervicioAux.setId(this.iIdNuevoTipoServicio);
		this.tiposervicioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiposervicioLogic.getTipoServicios().add(this.tiposervicioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiposervicios.add(this.tiposervicioAux);
		}
		//ARCHITECTURE
		
		this.tiposervicio=this.tiposervicioAux;
		
		if(TipoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoServicio(this.tiposervicio);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoServicio(this.tiposervicio);
		}
				
		//this.setDefaultControlesTipoServicio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoServicio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoServicio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoServicio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoServicio(this.tiposervicioBean,this.tiposervicio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoServicioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiposervicioSessionBean.getConGuardarRelaciones()) {
			classes=TipoServicioConstantesFunciones.getClassesRelationshipsOfTipoServicio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiposervicioReturnGeneral=tiposervicioLogic.procesarEventosTipoServiciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposervicioLogic.getTipoServicios(),this.tiposervicio,this.tiposervicioParameterGeneral,this.isEsNuevoTipoServicio,classes);//this.tiposervicioLogic.getTipoServicio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoServicio(this.tiposervicioReturnGeneral,this.tiposervicioBean,false);
		
		if(this.tiposervicioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoServicio(this.tiposervicioReturnGeneral.getTipoServicio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoServicio(this.tiposervicioReturnGeneral.getTipoServicio());
		}
		
		if(this.tiposervicioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoServicio(this.tiposervicioReturnGeneral.getTipoServicio(),classes);//this.tiposervicioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoServicio(this.tiposervicio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoServicio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoServicio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoServicio(false);
						
			if(tiposervicioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoServicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoServicio();
			}
			
			this.actualizarVisualTableDatosTipoServicio();
			
			this.jTableDatosTipoServicio.setRowSelectionInterval(this.getIndiceNuevoTipoServicio(), this.getIndiceNuevoTipoServicio());
			
			this.seleccionarFilaTablaTipoServicioActual();
						
			this.actualizarEstadoCeldasBotonesTipoServicio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoServicio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoServicio.jTextFieldcodigoTipoServicio.setEnabled(isHabilitar && this.tiposervicioConstantesFunciones.activarcodigoTipoServicio);
		this.jInternalFrameDetalleFormTipoServicio.jTextFieldnombreTipoServicio.setEnabled(isHabilitar && this.tiposervicioConstantesFunciones.activarnombreTipoServicio);	
		
	};
	
	public void setDefaultControlesTipoServicio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoServicio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiposervicioSessionBean.setConGuardarRelaciones(true);			
			this.tiposervicioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoServicio.jTabbedPaneRelacionesTipoServicio.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiposervicioSessionBean.setConGuardarRelaciones(false);			
			this.tiposervicioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoServicio.jTabbedPaneRelacionesTipoServicio.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoServicio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoServicio tiposervicioAux:this.tiposervicioLogic.getTipoServicios()) {
				if(tiposervicioAux.getId().equals(this.iIdNuevoTipoServicio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoServicio tiposervicioAux:this.tiposervicios) {
				if(tiposervicioAux.getId().equals(this.iIdNuevoTipoServicio)) {
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
	
	public int getIndiceActualTipoServicio(TipoServicio tiposervicio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoServicio tiposervicioAux:this.tiposervicioLogic.getTipoServicios()) {
				if(tiposervicioAux.getId().equals(tiposervicio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoServicio tiposervicioAux:this.tiposervicios) {
				if(tiposervicioAux.getId().equals(tiposervicio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoServicio(TipoServicio tiposervicioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoServicio tiposervicioAux:this.tiposervicioLogic.getTipoServicios()) {
				if(tiposervicioAux.getTipoServicioOriginal().getId().equals(tiposervicioOriginal.getId())) {
					existe=true;
					tiposervicioOriginal.setId(tiposervicioAux.getId());
					tiposervicioOriginal.setVersionRow(tiposervicioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoServicio tiposervicioAux:this.tiposervicios) {
				if(tiposervicioAux.getTipoServicioOriginal().getId().equals(tiposervicioOriginal.getId())) {
					existe=true;
					tiposervicioOriginal.setId(tiposervicioAux.getId());
					tiposervicioOriginal.setVersionRow(tiposervicioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoServicio(Boolean esParaCancelar) throws Exception {
		tiposerviciosAux=new ArrayList<TipoServicio>();
		tiposervicioAux=new TipoServicio();
		
		if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoServicio tiposervicioAux:this.tiposervicioLogic.getTipoServicios()) {
					if(tiposervicioAux.getId()<0) {
						tiposerviciosAux.add(tiposervicioAux);
					}		
				}
				this.iIdNuevoTipoServicio=0L;
				this.tiposervicioLogic.getTipoServicios().removeAll(tiposerviciosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoServicio tiposervicioAux:this.tiposervicios) {
					if(tiposervicioAux.getId()<0) {
						tiposerviciosAux.add(tiposervicioAux);
					}		
				}
				this.iIdNuevoTipoServicio=0L;
				this.tiposervicios.removeAll(tiposerviciosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoServicio 
					&& this.tiposervicioLogic.getTipoServicios().size()>0
					) {
					tiposervicioAux=this.tiposervicioLogic.getTipoServicios().get(this.tiposervicioLogic.getTipoServicios().size() - 1);
				
					if(tiposervicioAux.getId()<0) {
						this.tiposervicioLogic.getTipoServicios().remove(tiposervicioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoServicio && this.tiposervicios.size()>0) {
					tiposervicioAux=this.tiposervicios.get(this.tiposervicios.size() - 1);
				
					if(tiposervicioAux.getId()<0) {
						this.tiposervicios.remove(tiposervicioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoServicio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiposervicio.getId()<0) {
				this.tiposervicioLogic.getTipoServicios().remove(this.tiposervicio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiposervicio.getId()<0) {
				this.tiposervicios.remove(this.tiposervicio);
			}
		}			
	}
	
	public void setEstadosInicialesTipoServicio(List<TipoServicio> tiposerviciosAux) throws Exception {
		TipoServicioConstantesFunciones.setEstadosInicialesTipoServicio(tiposerviciosAux);
	}
	
	public void setEstadosInicialesTipoServicio(TipoServicio tiposervicioAux) throws Exception {
		TipoServicioConstantesFunciones.setEstadosInicialesTipoServicio(tiposervicioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoServicioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoServicioActual()) {
				if(!this.isEsNuevoTipoServicio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoServicio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoServicioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Servicio ?", "MANTENIMIENTO DE Tipo Servicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoServicio tiposervicio) throws Exception {
		TipoServicioConstantesFunciones.seleccionarAsignar(this.tiposervicio,tiposervicio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoServicio=this.isPermisoActualizarOriginalTipoServicio;
			
			
			this.seleccionarAsignar(tiposervicio);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoServicioConstantesFunciones.quitarEspaciosTipoServicio(this.tiposervicio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoServicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiposervicioSessionBean.setsFuncionBusquedaRapida(this.tiposervicioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoServicio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoServicio(esParaCancelar);				
				this.cancelarNuevoTipoServicio(esParaCancelar);								
			}
			
			this.tiposervicio=new TipoServicio();
			
			this.inicializarTipoServicio();
			
			this.actualizarEstadoCeldasBotonesTipoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoServicio() throws Exception {
		try {
			TipoServicioConstantesFunciones.inicializarTipoServicio(this.tiposervicio);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiposervicioLogic.getTipoServicios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoServicios(String sAccionBusqueda,List<TipoServicio> tiposerviciosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoServicio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoServicioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoServicioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoServicio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Servicioes");		
		parameters.put("busquedapor", TipoServicioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					TipoServicioLogic tiposervicioLogicAuxiliar=new TipoServicioLogic();
					tiposervicioLogicAuxiliar.setDatosCliente(tiposervicioLogic.getDatosCliente());				
					tiposervicioLogicAuxiliar.setTipoServicios(tiposerviciosParaReportes);
					
					tiposervicioLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoServicioWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiposerviciosParaReportes=tiposervicioLogicAuxiliar.getTipoServicios();
					
					//tiposervicioLogic.getNewConnexionToDeep();
					
					//for (TipoServicio tiposervicio:tiposerviciosParaReportes) {
					//	tiposervicioLogic.deepLoad(tiposervicio, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiposervicioLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiposervicioLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoServicio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoServicioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoServicioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoServicio=new JRBeanArrayDataSource(TipoServicioJInternalFrame.TraerTipoServicioBeans(tiposerviciosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoServicio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoServicioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoServicioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoServicioBean.TraerTipoServicioBeans(tiposerviciosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoServicios(sAccionBusqueda,sTipoArchivoReporte,tiposerviciosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoServicios(sAccionBusqueda,sTipoArchivoReporte,tiposerviciosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoServicioActionPerformed(null);
					//this.generarExcelReporteTipoServicios(sAccionBusqueda,sTipoArchivoReporte,tiposerviciosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoServicios(sAccionBusqueda,sTipoArchivoReporte,tiposerviciosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoServicios(sAccionBusqueda,sTipoArchivoReporte,tiposerviciosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoServicios(sAccionBusqueda,sTipoArchivoReporte,tiposerviciosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoServicios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoServicio> tiposerviciosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposervicio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoServicios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoServicio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoServicio tiposervicio : tiposerviciosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoServicioConstantesFunciones.generarExcelReporteDataTipoServicio("NORMAL",row,workbook,tiposervicio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Servicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoServicio(String sTipo,Row row,Workbook workbook) {
		
		TipoServicioConstantesFunciones.generarExcelReporteHeaderTipoServicio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoServicios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoServicio> tiposerviciosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposervicio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoServicios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoServicio tiposervicio : tiposerviciosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoServicioConstantesFunciones.getTipoServicioDescripcion(tiposervicio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoServicioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoServicioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposervicio.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoServicioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoServicioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposervicio.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Servicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoServicios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoServicio> tiposerviciosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoServicio> tiposerviciosRespaldo=null;
		
		classes=TipoServicioConstantesFunciones.getClassesRelationshipsOfTipoServicio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiposervicioLogic.setDatosCliente(this.datosCliente);
		this.tiposervicioLogic.setDatosDeep(this.datosDeep);
		this.tiposervicioLogic.setIsConDeep(true);
		
		tiposerviciosRespaldo=this.tiposervicioLogic.getTipoServicios();
		
		this.tiposervicioLogic.setTipoServicios(tiposerviciosParaReportes);	
		this.tiposervicioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiposerviciosParaReportes=this.tiposervicioLogic.getTipoServicios();
		this.tiposervicioLogic.setTipoServicios(tiposerviciosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposervicio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoServicios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoServicio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoServicio tiposervicio : tiposerviciosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoServicio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoServicioConstantesFunciones.generarExcelReporteDataTipoServicio("NORMAL",row,workbook,tiposervicio,cellStyleDataAux);
		
			
			


				//ParametroInventarioDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiposervicio.getParametroInventarioDefectos()!=null && tiposervicio.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(tiposervicio.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : tiposervicio.getParametroInventarioDefectos()) {
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
		cell.setCellValue(TipoServicioConstantesFunciones.getTipoServicioDescripcion(tiposervicio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Servicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoServicio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoServicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoServicio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoServicio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoServicio() throws Exception {		
		this.startProcessTipoServicio(true);
	}
	
	public void startProcessTipoServicio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoServicio ,this.jPanelParametrosReportesTipoServicio, this.jScrollPanelDatosTipoServicio,this.jPanelPaginacionTipoServicio, this.jScrollPanelDatosEdicionTipoServicio, this.jPanelAccionesTipoServicio,this.jPanelAccionesFormularioTipoServicio,this.jmenuBarTipoServicio,this.jmenuBarDetalleTipoServicio,this.jTtoolBarTipoServicio,this.jTtoolBarDetalleTipoServicio);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoServicio=this.jTabbedPaneBusquedasTipoServicio; 
		
		final JPanel jPanelParametrosReportesTipoServicio=this.jPanelParametrosReportesTipoServicio;
		//final JScrollPane jScrollPanelDatosTipoServicio=this.jScrollPanelDatosTipoServicio;
		final JTable jTableDatosTipoServicio=this.jTableDatosTipoServicio;		
		final JPanel jPanelPaginacionTipoServicio=this.jPanelPaginacionTipoServicio;
		//final JScrollPane jScrollPanelDatosEdicionTipoServicio=this.jScrollPanelDatosEdicionTipoServicio;
		final JPanel jPanelAccionesTipoServicio=this.jPanelAccionesTipoServicio;
		
		JPanel jPanelCamposAuxiliarTipoServicio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoServicio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) {
			jPanelCamposAuxiliarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jPanelCamposTipoServicio;
			jPanelAccionesFormularioAuxiliarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jPanelAccionesFormularioTipoServicio;
		}
		
		final JPanel jPanelCamposTipoServicio=jPanelCamposAuxiliarTipoServicio;
		final JPanel jPanelAccionesFormularioTipoServicio=jPanelAccionesFormularioAuxiliarTipoServicio;
		
		
		final JMenuBar jmenuBarTipoServicio=this.jmenuBarTipoServicio;
		final JToolBar jTtoolBarTipoServicio=this.jTtoolBarTipoServicio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoServicio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoServicio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) {
			jmenuBarDetalleAuxiliarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jmenuBarDetalleTipoServicio;
			jTtoolBarDetalleAuxiliarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jTtoolBarDetalleTipoServicio;
		}
		
		final JMenuBar jmenuBarDetalleTipoServicio=jmenuBarDetalleAuxiliarTipoServicio;
		final JToolBar jTtoolBarDetalleTipoServicio=jTtoolBarDetalleAuxiliarTipoServicio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoServicio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoServicio;
			processRunnable.jTableDatos=jTableDatosTipoServicio;
			processRunnable.jPanelCampos=jPanelCamposTipoServicio;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoServicio;
			processRunnable.jPanelAcciones=jPanelAccionesTipoServicio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoServicio;
			
			
			processRunnable.jmenuBar=jmenuBarTipoServicio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoServicio;
			processRunnable.jTtoolBar=jTtoolBarTipoServicio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoServicio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoServicio ,jPanelParametrosReportesTipoServicio,jTableDatosTipoServicio, /*jScrollPanelDatosTipoServicio,*/jPanelCamposTipoServicio,jPanelPaginacionTipoServicio, /*jScrollPanelDatosEdicionTipoServicio,*/ jPanelAccionesTipoServicio,jPanelAccionesFormularioTipoServicio,jmenuBarTipoServicio,jmenuBarDetalleTipoServicio,jTtoolBarTipoServicio,jTtoolBarDetalleTipoServicio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoServicio ,jPanelParametrosReportesTipoServicio, jScrollPanelDatosTipoServicio,jPanelPaginacionTipoServicio, jScrollPanelDatosEdicionTipoServicio, jPanelAccionesTipoServicio,jPanelAccionesFormularioTipoServicio,jmenuBarTipoServicio,jmenuBarDetalleTipoServicio,jTtoolBarTipoServicio,jTtoolBarDetalleTipoServicio);
						
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
	
	public void finishProcessTipoServicio() {// throws Exception 
		this.finishProcessTipoServicio(true);
	}
	
	public void finishProcessTipoServicio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoServicio ,this.jPanelParametrosReportesTipoServicio, this.jScrollPanelDatosTipoServicio,this.jPanelPaginacionTipoServicio, this.jScrollPanelDatosEdicionTipoServicio, this.jPanelAccionesTipoServicio,this.jPanelAccionesFormularioTipoServicio,this.jmenuBarTipoServicio,this.jmenuBarDetalleTipoServicio,this.jTtoolBarTipoServicio,this.jTtoolBarDetalleTipoServicio);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoServicio=this.jTabbedPaneBusquedasTipoServicio; 
		
		final JPanel jPanelParametrosReportesTipoServicio=this.jPanelParametrosReportesTipoServicio;
		//final JScrollPane jScrollPanelDatosTipoServicio=this.jScrollPanelDatosTipoServicio;
		final JTable jTableDatosTipoServicio=this.jTableDatosTipoServicio;		
		final JPanel jPanelPaginacionTipoServicio=this.jPanelPaginacionTipoServicio;
		//final JScrollPane jScrollPanelDatosEdicionTipoServicio=this.jScrollPanelDatosEdicionTipoServicio;
		final JPanel jPanelAccionesTipoServicio=this.jPanelAccionesTipoServicio;
		
		JPanel jPanelCamposAuxiliarTipoServicio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoServicio=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) {
			jPanelCamposAuxiliarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jPanelCamposTipoServicio;
			jPanelAccionesFormularioAuxiliarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jPanelAccionesFormularioTipoServicio;
		}
		
		final JPanel jPanelCamposTipoServicio=jPanelCamposAuxiliarTipoServicio;
		final JPanel jPanelAccionesFormularioTipoServicio=jPanelAccionesFormularioAuxiliarTipoServicio;
		
		
		final JMenuBar jmenuBarTipoServicio=this.jmenuBarTipoServicio;		
		final JToolBar jTtoolBarTipoServicio=this.jTtoolBarTipoServicio;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoServicio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoServicio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) {
			jmenuBarDetalleAuxiliarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jmenuBarDetalleTipoServicio;
			jTtoolBarDetalleAuxiliarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jTtoolBarDetalleTipoServicio;		
		}
		
		final JMenuBar jmenuBarDetalleTipoServicio=jmenuBarDetalleAuxiliarTipoServicio;
		final JToolBar jTtoolBarDetalleTipoServicio=jTtoolBarDetalleAuxiliarTipoServicio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoServicio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoServicio;
			processRunnable.jTableDatos=jTableDatosTipoServicio;
			processRunnable.jPanelCampos=jPanelCamposTipoServicio;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoServicio;
			processRunnable.jPanelAcciones=jPanelAccionesTipoServicio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoServicio;
			
			
			processRunnable.jmenuBar=jmenuBarTipoServicio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoServicio;
			processRunnable.jTtoolBar=jTtoolBarTipoServicio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoServicio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoServicio ,jPanelParametrosReportesTipoServicio, jTableDatosTipoServicio,/*jScrollPanelDatosTipoServicio,*/jPanelCamposTipoServicio,jPanelPaginacionTipoServicio, /*jScrollPanelDatosEdicionTipoServicio,*/ jPanelAccionesTipoServicio,jPanelAccionesFormularioTipoServicio,jmenuBarTipoServicio,jmenuBarDetalleTipoServicio,jTtoolBarTipoServicio,jTtoolBarDetalleTipoServicio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoServicio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoServicio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoServicio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoServicio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoServicio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoServicio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoServicio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoServicio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoServicio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiposervicioConstantesFunciones.getsFinalQueryTipoServicio();
		String  finalQueryPaginacionTodos=this.tiposervicioConstantesFunciones.getsFinalQueryTipoServicio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoServicioConstantesFunciones.getArrayColumnasGlobalesNoTipoServicio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoServicioConstantesFunciones.getArrayColumnasGlobalesTipoServicio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoServicioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiposerviciosEliminados= new ArrayList<TipoServicio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoServicio();
		
				///*TipoServicioSessionBean*/this.tiposervicioSessionBean=new TipoServicioSessionBean();
			
			if(this.tiposervicioSessionBean==null) {
				this.tiposervicioSessionBean=new TipoServicioSessionBean();
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
					this.iNumeroPaginacion=TipoServicioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoServicioConstantesFunciones.getClassesForeignKeysOfTipoServicio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiposervicio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiposerviciosAux= new ArrayList<TipoServicio>();
			
				
			tiposervicioLogic.setDatosCliente(this.datosCliente);
			tiposervicioLogic.setDatosDeep(this.datosDeep);
			tiposervicioLogic.setIsConDeep(true);
			
			
			tiposervicioLogic.getTipoServicioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiposervicioLogic.getTodosTipoServicios(finalQueryGlobal,pagination);
					
					//tiposervicioLogic.getTodosTipoServiciosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiposervicioLogic.getTipoServicios()==null|| tiposervicioLogic.getTipoServicios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposerviciosAux= new ArrayList<TipoServicio>();
							tiposerviciosAux.addAll(tiposervicioLogic.getTipoServicios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposerviciosAux= new ArrayList<TipoServicio>();
							tiposerviciosAux.addAll(tiposervicios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposervicioLogic.getTodosTipoServicios(finalQueryGlobal+"",this.pagination);												
							
							//tiposervicioLogic.getTodosTipoServiciosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoServicios("Todos",tiposervicioLogic.getTipoServicios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposervicioLogic.setTipoServicios(new ArrayList<TipoServicio>());					
							tiposervicioLogic.getTipoServicios().addAll(tiposerviciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposervicios=new ArrayList<TipoServicio>();
							tiposervicios.addAll(tiposerviciosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoServicio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoServicio=this.idActual;
				
				} else if(this.idTipoServicioActual!=null && this.idTipoServicioActual!=0L) {
					idTipoServicio=idTipoServicioActual;
				}
				
					
				this.sDetalleReporte=TipoServicioConstantesFunciones.getDetalleIndicePorId(idTipoServicio);
				
				this.tiposervicios=new ArrayList<TipoServicio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiposervicioLogic.getEntity(idTipoServicio);
					
					//tiposervicioLogic.getEntityWithConnection(idTipoServicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposervicioLogic.setTipoServicios(new ArrayList<TipoServicio>());
					tiposervicioLogic.getTipoServicios().add(tiposervicioLogic.getTipoServicio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposervicios=new ArrayList<TipoServicio>();
					this.tiposervicios.add(tiposervicio);
				}
				
				if(tiposervicioLogic.getTipoServicio()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoServicioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiposervicioLogic.getTipoServiciosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoServicioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoServicioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiposervicioLogic.getTipoServicios()==null||tiposervicioLogic.getTipoServicios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiposervicios==null|| tiposervicios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposerviciosAux=new ArrayList<TipoServicio>();
						tiposerviciosAux.addAll(tiposervicioLogic.getTipoServicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposerviciosAux=new ArrayList<TipoServicio>();
							tiposerviciosAux.addAll(tiposervicios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiposervicioLogic.getTipoServiciosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoServicioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoServicioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoServicios("BusquedaPorCodigo",tiposervicioLogic.getTipoServicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoServicios("BusquedaPorCodigo",tiposervicios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposervicioLogic.setTipoServicios(new ArrayList<TipoServicio>());
						tiposervicioLogic.getTipoServicios().addAll(tiposerviciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposervicios=new ArrayList<TipoServicio>();
							tiposervicios.addAll(tiposerviciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoServicioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiposervicioLogic.getTipoServiciosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoServicioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoServicioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiposervicioLogic.getTipoServicios()==null||tiposervicioLogic.getTipoServicios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiposervicios==null|| tiposervicios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposerviciosAux=new ArrayList<TipoServicio>();
						tiposerviciosAux.addAll(tiposervicioLogic.getTipoServicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposerviciosAux=new ArrayList<TipoServicio>();
							tiposerviciosAux.addAll(tiposervicios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiposervicioLogic.getTipoServiciosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoServicioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoServicioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoServicios("BusquedaPorNombre",tiposervicioLogic.getTipoServicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoServicios("BusquedaPorNombre",tiposervicios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposervicioLogic.setTipoServicios(new ArrayList<TipoServicio>());
						tiposervicioLogic.getTipoServicios().addAll(tiposerviciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposervicios=new ArrayList<TipoServicio>();
							tiposervicios.addAll(tiposerviciosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoServicio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoServicio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiposervicioLogic.getTipoServicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposervicios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiposervicioLogic.getTipoServicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposervicios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoServicio tiposervicio) {
		Boolean permite=true;
		
		if(this.tiposervicio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoServicioConstantesFunciones.getOrderByListaTipoServicio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoServicioConstantesFunciones.getOrderByListaTipoServicio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoServicio tiposervicio:tiposervicioLogic.getTipoServicios()) {
				if(tiposervicio.getsType().equals(Constantes2.S_TOTALES)) {
					tiposervicioTotales=tiposervicio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoServicio tiposervicio:this.tiposervicios) {
				if(tiposervicio.getsType().equals(Constantes2.S_TOTALES)) {
					tiposervicioTotales=tiposervicio;
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
			this.tiposervicioAux=new TipoServicio();
			this.tiposervicioAux.setsType(Constantes2.S_TOTALES);
			this.tiposervicioAux.setIsNew(false);
			this.tiposervicioAux.setIsChanged(false);
			this.tiposervicioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoServicioConstantesFunciones.TotalizarValoresFilaTipoServicio(this.tiposervicioLogic.getTipoServicios(),this.tiposervicioAux);
				
				this.tiposervicioLogic.getTipoServicios().add(this.tiposervicioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoServicioConstantesFunciones.TotalizarValoresFilaTipoServicio(this.tiposervicios,this.tiposervicioAux);
				
				this.tiposervicios.add(this.tiposervicioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiposervicioTotales=new TipoServicio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiposervicioLogic.getTipoServicios().remove(tiposervicioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiposervicios.remove(tiposervicioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiposervicioTotales=new TipoServicio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoServicio tiposervicio:tiposervicioLogic.getTipoServicios()) {
				if(tiposervicio.getsType().equals(Constantes2.S_TOTALES)) {
					tiposervicioTotales=tiposervicio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoServicioConstantesFunciones.TotalizarValoresFilaTipoServicio(this.tiposervicioLogic.getTipoServicios(),tiposervicioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoServicio tiposervicio:this.tiposervicios) {
				if(tiposervicio.getsType().equals(Constantes2.S_TOTALES)) {
					tiposervicioTotales=tiposervicio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoServicioConstantesFunciones.TotalizarValoresFilaTipoServicio(this.tiposervicios,tiposervicioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoServiciosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoServiciosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoServiciosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposervicioLogic.getTipoServiciosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoServiciosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposervicioLogic.getTipoServiciosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
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
	
	public void inicializarPermisosTipoServicio() {
		this.isPermisoTodoTipoServicio=false;
		this.isPermisoNuevoTipoServicio=false;
		this.isPermisoActualizarTipoServicio=false;
		this.isPermisoActualizarOriginalTipoServicio=false;
		this.isPermisoEliminarTipoServicio=false;
		this.isPermisoGuardarCambiosTipoServicio=false;
		this.isPermisoConsultaTipoServicio=false;
		this.isPermisoBusquedaTipoServicio=false;
		this.isPermisoReporteTipoServicio=false;		
		this.isPermisoOrdenTipoServicio=false;		
		this.isPermisoPaginacionMedioTipoServicio=false;		
		this.isPermisoPaginacionAltoTipoServicio=false;
		this.isPermisoPaginacionTodoTipoServicio=false;
		this.isPermisoCopiarTipoServicio=false;		
		this.isPermisoVerFormTipoServicio=false;		
		this.isPermisoDuplicarTipoServicio=false;		
		this.isPermisoOrdenTipoServicio=false;		
	}
	
	public void setPermisosUsuarioTipoServicio(Boolean isPermiso) {
		this.isPermisoTodoTipoServicio=isPermiso;
		this.isPermisoNuevoTipoServicio=isPermiso;
		this.isPermisoActualizarTipoServicio=isPermiso;
		this.isPermisoActualizarOriginalTipoServicio=isPermiso;
		this.isPermisoEliminarTipoServicio=isPermiso;
		this.isPermisoGuardarCambiosTipoServicio=isPermiso;
		this.isPermisoConsultaTipoServicio=isPermiso;
		this.isPermisoBusquedaTipoServicio=isPermiso;
		this.isPermisoReporteTipoServicio=isPermiso;
		this.isPermisoOrdenTipoServicio=isPermiso;		
		this.isPermisoPaginacionMedioTipoServicio=isPermiso;		
		this.isPermisoPaginacionAltoTipoServicio=isPermiso;		
		this.isPermisoPaginacionTodoTipoServicio=isPermiso;		
		this.isPermisoCopiarTipoServicio=isPermiso;		
		this.isPermisoVerFormTipoServicio=isPermiso;		
		this.isPermisoDuplicarTipoServicio=isPermiso;
		this.isPermisoOrdenTipoServicio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoServicio(Boolean isPermiso) {
		//this.isPermisoTodoTipoServicio=isPermiso;
		this.isPermisoNuevoTipoServicio=isPermiso;
		this.isPermisoActualizarTipoServicio=isPermiso;
		this.isPermisoActualizarOriginalTipoServicio=isPermiso;
		this.isPermisoEliminarTipoServicio=isPermiso;
		this.isPermisoGuardarCambiosTipoServicio=isPermiso;
		//this.isPermisoConsultaTipoServicio=isPermiso;
		//this.isPermisoBusquedaTipoServicio=isPermiso;
		//this.isPermisoReporteTipoServicio=isPermiso;
		//this.isPermisoOrdenTipoServicio=isPermiso;		
		//this.isPermisoPaginacionMedioTipoServicio=isPermiso;		
		//this.isPermisoPaginacionAltoTipoServicio=isPermiso;		
		//this.isPermisoPaginacionTodoTipoServicio=isPermiso;		
		//this.isPermisoCopiarTipoServicio=isPermiso;		
		//this.isPermisoDuplicarTipoServicio=isPermiso;
		//this.isPermisoOrdenTipoServicio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoServicioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionTipoServicioClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoServicio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoServicioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoServicioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoServicioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoServicioClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormTipoServicio!=null && this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoServicio.jTabbedPaneRelacionesTipoServicio.remove(this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoServicio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoServicioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoServicio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoServicio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoServicio=this.isPermisoActualizarTipoServicio;
			this.isPermisoEliminarTipoServicio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoServicio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoServicio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoServicio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoServicio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoServicio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoServicio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoServicio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoServicio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoServicio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoServicio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoServicio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoServicio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoServicio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoServicio.setToolTipText(this.jTableDatosTipoServicio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoServicio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoServicio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoServicio() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosParametroInventarioDefecto && this.tiposervicioConstantesFunciones.mostrarParametroInventarioDefectoTipoServicio && !TipoServicioConstantesFunciones.ISGUARDARREL) {

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
	
		
	public void inicializarCombosForeignKeyTipoServicioListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoServicioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoServicioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoServicioListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoServicioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoServicio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoServicio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoServicio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoServicio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoServicio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoServicio(TipoServicio tiposervicio)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoServicio(TipoServicio tiposervicio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoServicio()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoServicio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoServicio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoServicio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoServicio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoServicio()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoServicio(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoServicio()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoServicioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoServicioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoServicioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiposervicioSessionBean=new TipoServicioSessionBean(); 
		this.tiposervicioConstantesFunciones=new TipoServicioConstantesFunciones(); 
		this.tiposervicioBean=new TipoServicio();//(this.tiposervicioConstantesFunciones); 		
		this.tiposervicioReturnGeneral=new TipoServicioParameterReturnGeneral(); 
		
		this.tiposervicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposervicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoServicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoServicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoServicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoServicio(true);
			
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
			
			this.tiposervicioConstantesFunciones=new TipoServicioConstantesFunciones(); 
			this.tiposervicioBean=new TipoServicio();//this.tiposervicioConstantesFunciones); 			
			this.tiposervicioReturnGeneral=new TipoServicioParameterReturnGeneral(); 
		
			TipoServicioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Servicio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiposervicio=new TipoServicio();
			this.tiposervicios = new ArrayList<TipoServicio>();
			this.tiposerviciosAux = new ArrayList<TipoServicio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic=new TipoServicioLogic();
				this.tiposervicioLogic.getNewConnexionToDeep("");
			}
			
			//this.tiposervicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiposervicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoServicio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoServicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoServicio);	
					}
					
					if(this.jInternalFrameImportacionTipoServicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoServicio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoServicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoServicio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoServicio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoServicio);
				this.jInternalFrameDetalleFormTipoServicio.setVisible(false);
				this.jInternalFrameDetalleFormTipoServicio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoServicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoServicio);
					this.jInternalFrameReporteDinamicoTipoServicio.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoServicio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoServicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoServicio);
					this.jInternalFrameImportacionTipoServicio.setVisible(false);
					this.jInternalFrameImportacionTipoServicio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoServicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoServicio);
					this.jInternalFrameOrderByTipoServicio.setVisible(false);
					this.jInternalFrameOrderByTipoServicio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoServicioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoServicioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiposervicioReturnGeneral=new TipoServicioParameterReturnGeneral();
			
			this.tiposervicioParameterGeneral=new TipoServicioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiposervicioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoServicioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoServicioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiposervicioSessionBean.getEsGuardarRelacionado(),this.tiposervicioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoServicioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiposervicioSessionBean.getEsGuardarRelacionado(),this.tiposervicioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoServicio=false;
			this.isVisibilidadCeldaDuplicarTipoServicio=true;
			this.isVisibilidadCeldaCopiarTipoServicio=true;
			this.isVisibilidadCeldaVerFormTipoServicio=true;
			this.isVisibilidadCeldaOrdenTipoServicio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoServicio=false;
			this.isVisibilidadCeldaModificarTipoServicio=false;
			this.isVisibilidadCeldaActualizarTipoServicio=false;
			this.isVisibilidadCeldaEliminarTipoServicio=false;
			this.isVisibilidadCeldaCancelarTipoServicio=false;
			this.isVisibilidadCeldaGuardarTipoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoServicio=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoServicio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoServicio(false);
			
			this.setPermisosUsuarioTipoServicio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposervicioSessionBean.getEsGuardarRelacionado() 
				|| (this.tiposervicioSessionBean.getEsGuardarRelacionado() && this.tiposervicioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoServicioClasesRelacionadas();
			}
			
			if(this.tiposervicioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoServicioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoServicioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoServicio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoServicio();
			}
			
			if(!this.isPermisoBusquedaTipoServicio) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoServicio.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoServicio,this.isPermisoPaginacionMedioTipoServicio,this.isPermisoPaginacionTodoTipoServicio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoServicioConstantesFunciones.getTiposSeleccionarTipoServicio());
				
				this.tiposColumnasSelect=TipoServicioConstantesFunciones.getTiposSeleccionarTipoServicio(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoServicio();				
				//this.tiposRelacionesSelect=TipoServicioConstantesFunciones.getTiposRelacionesTipoServicio(true);
				
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
			//if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoServicio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoServicio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoServicio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoServicio() ;
			
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
				tiposervicioImplementable= (TipoServicioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoServicioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiposervicioImplementableHome= (TipoServicioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoServicioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiposervicios= new ArrayList<TipoServicio>();
			this.tiposerviciosEliminados= new ArrayList<TipoServicio>();
						
			this.isEsNuevoTipoServicio=false;
			this.esParaAccionDesdeFormularioTipoServicio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoServicio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoServicio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoServicioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoServicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoServicio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoServicio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoServicio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoServicio();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoServicio.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoServicio.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoServicio.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoServicio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoServicio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoServicio() {
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
			if(sTipo.equals("RelacionesTipoServicio")) {
				iIndex=this.jInternalFrameDetalleFormTipoServicio.jTabbedPaneRelacionesTipoServicio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoServicio.jTabbedPaneRelacionesTipoServicio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoServicio();

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
				this.finishProcessTipoServicio();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoServicio.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesTipoServicio.updateUI();
		//this.jTabbedPaneRelacionesTipoServicio.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoServicio.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosTipoServicio.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.tiposervicioConstantesFunciones.mostrarParametroInventarioDefectoTipoServicio && !TipoServicioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(tiposervicioConstantesFunciones.resaltarParametroInventarioDefectoTipoServicio!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiposervicioConstantesFunciones.resaltarParametroInventarioDefectoTipoServicio);
						}

						jmenuItem.setEnabled(this.tiposervicioConstantesFunciones.activarParametroInventarioDefectoTipoServicio);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormTipoServicio.jmenuDetalleTipoServicio.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoServicio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoServicio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoServicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoServicioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoServicio();
		
		this.cargarCombosFrameForeignKeyTipoServicio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoServicio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoServicio();
		}
	}
	
	
	
	public void jButtonNuevoTipoServicioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiposervicioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			
			
			if(jTableDatosTipoServicio.getRowCount()>=1) {
				jTableDatosTipoServicio.removeRowSelectionInterval(0, jTableDatosTipoServicio.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoServicio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoServicio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoServicio(true);			
			//this.tiposervicio=new TipoServicio();
			//this.tiposervicio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoServicio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoServicio() ;
			
			if(TipoServicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoServicio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiposervicio);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);				
			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			
			if(this.tiposervicioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoServicio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoServicioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoServicio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoServicio.getSelectedRows().length;			
			}
			
			tiposerviciosSeleccionados=this.getTipoServiciosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoServicio--;			
				//TipoServicio tiposervicioAux= new TipoServicio();			
				//tiposervicioAux.setId(this.iIdNuevoTipoServicio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoServicio tiposervicioOrigen=new TipoServicio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoServicio tiposervicioOrigen : tiposerviciosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiposervicioOrigen =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposervicioOrigen =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoServicio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiposervicio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoServicio(tiposervicioOrigen,this.tiposervicio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiposervicioLogic.getTipoServicios().add(this.tiposervicioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiposervicios.add(this.tiposervicioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoServicio(false);
				
				this.jTableDatosTipoServicio.setRowSelectionInterval(this.getIndiceNuevoTipoServicio(), this.getIndiceNuevoTipoServicio());
				
				int iLastRow =  this.jTableDatosTipoServicio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoServicio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoServicio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoServicio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();									
		
			TipoServicio tiposervicioOrigen=new TipoServicio();
			TipoServicio tiposervicioDestino=new TipoServicio();
				
			tiposerviciosSeleccionados=this.getTipoServiciosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoServicio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiposerviciosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoServicio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposervicioOrigen =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiposervicioOrigen =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposervicioDestino =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiposervicioDestino =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiposervicioOrigen =tiposerviciosSeleccionados.get(0);
				tiposervicioDestino =tiposerviciosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoServicio(tiposervicioOrigen,tiposervicioDestino,true,false);
				
				tiposervicioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiposervicioDestino,tiposervicioLogic.getTipoServicios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposervicioDestino,tiposervicios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoServicio(false);
				
				//this.jTableDatosTipoServicio.setRowSelectionInterval(this.getIndiceNuevoTipoServicio(), this.getIndiceNuevoTipoServicio());
				
				int iLastRow =  this.jTableDatosTipoServicio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoServicio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoServicio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoServicio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoServicio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoServicio.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoServicio.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoServicio.setVisible(!isVisible);
			this.jPanelPaginacionTipoServicio.setVisible(!isVisible);
			this.jPanelAccionesTipoServicio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoServicio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoServicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoServicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoServicio();
			
			this.abrirFrameOrderByTipoServicio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoServicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoServicio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoServicio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoServicio.isMaximum()) {
					this.jInternalFrameDetalleFormTipoServicio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoServicio.setSize(this.jInternalFrameDetalleFormTipoServicio.iWidthFormulario,this.jInternalFrameDetalleFormTipoServicio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoServicio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoServicio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoServicio.isMaximum()) {
						this.jInternalFrameDetalleFormTipoServicio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoServicio.jContentPaneDetalleTipoServicio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoServicio.jTabbedPaneRelacionesTipoServicio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoServicio.jContentPaneDetalleTipoServicio.getWidth(),TipoServicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoServicio.jTabbedPaneRelacionesTipoServicio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoServicio.jContentPaneDetalleTipoServicio.getWidth(),TipoServicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoServicio.jTabbedPaneRelacionesTipoServicio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoServicio.jContentPaneDetalleTipoServicio.getWidth(),TipoServicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoServicio.setVisible(true);
	        this.jInternalFrameDetalleFormTipoServicio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoServicio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoServicio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoServicio,false,this);
				} else {
					this.jInternalFrameOrderByTipoServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoServicio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoServicio);
				this.jInternalFrameOrderByTipoServicio.setVisible(false);
				this.jInternalFrameOrderByTipoServicio.setSelected(false);
				
				this.jInternalFrameOrderByTipoServicio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoServicio"));
				
				this.inicializarActualizarBindingTablaOrderByTipoServicio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoServicio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoServicio==null) {
				
				this.jInternalFrameImportacionTipoServicio=new ImportacionJInternalFrame(TipoServicioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoServicio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoServicio);
				this.jInternalFrameImportacionTipoServicio.setVisible(false);
				this.jInternalFrameImportacionTipoServicio.setSelected(false);


				this.jInternalFrameImportacionTipoServicio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoServicio"));
				this.jInternalFrameImportacionTipoServicio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoServicio"));
				this.jInternalFrameImportacionTipoServicio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoServicio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoServicio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoServicio==null) {
				this.jInternalFrameReporteDinamicoTipoServicio=new ReporteDinamicoJInternalFrame(TipoServicioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoServicio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoServicio);
				this.jInternalFrameReporteDinamicoTipoServicio.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoServicio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoServicio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoServicio"));
				this.jInternalFrameReporteDinamicoTipoServicio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoServicio"));
				this.jInternalFrameReporteDinamicoTipoServicio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoServicio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoServicio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoServicio.jContentPaneDetalleTipoServicio.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoServicio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoServicio);
			
	       	this.jInternalFrameDetalleFormTipoServicio.setVisible(false);
	        this.jInternalFrameDetalleFormTipoServicio.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoServicio.dispose();
			//this.jInternalFrameDetalleFormTipoServicio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoServicio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoServicio.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoServicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoServicio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoServicio.setVisible(true);
	        this.jInternalFrameImportacionTipoServicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoServicio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoServicio.setVisible(true);
	        this.jInternalFrameOrderByTipoServicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoServicio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoServicio.setVisible(false);
	        this.jInternalFrameOrderByTipoServicio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoServicio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoServicio.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoServicio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoServicio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoServicio.setVisible(false);
	        this.jInternalFrameImportacionTipoServicio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoServicio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoServicio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoServicio(true);
			//this.isEsNuevoTipoServicio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicio =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposervicio =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoServicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoServicio(false) ;
			
			if(tiposervicioSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoServicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoServicio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoServicio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoServicioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicio =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposervicio =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoServicio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoServicio(true);
			//this.isEsNuevoTipoServicio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicio =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposervicio =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiposervicio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoServicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoServicio(false) ;
			
			if(TipoServicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoServicio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoServicio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoServicio(false);
			
			//if(!this.isEsNuevoTipoServicio) {								
				int intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicio =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposervicio =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoServicio(this.tiposervicio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);
				
			}
			
			if(this.permiteMantenimiento(this.tiposervicio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoServicio=true;
					this.inicializarActualizarBindingTablaTipoServicio(false);
					this.isEsNuevoTipoServicio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoServicio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoServicio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoServicio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoServicio(false);
				
				this.habilitarDeshabilitarControlesTipoServicio(false);
			
												
				
				if(TipoServicioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoServicio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoServicioActionPerformed(evt,tiposervicioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoServicio(this.tiposervicio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoServicio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiposervicioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiposervicio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoServicio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoServicio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoServicioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicio =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				this.tiposervicio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposervicio =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				this.tiposervicio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiposervicio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoServicioModel) this.jTableDatosTipoServicio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoServicio=true;
				this.inicializarActualizarBindingTablaTipoServicio(false);
				this.isEsNuevoTipoServicio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoServicio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoServicio(false);
				
				this.habilitarDeshabilitarControlesTipoServicio(false);
				
				
				
				if(TipoServicioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoServicio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoServicioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoServicio.getRowCount()>=1) {
				jTableDatosTipoServicio.removeRowSelectionInterval(0, jTableDatosTipoServicio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoServicio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoServicio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoServicio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoServicio(false) ;
			
			this.isEsNuevoTipoServicio=false;
			
			if(TipoServicioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoServicio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoServicio(false);
				
				//SI ES MANUAL
				if(TipoServicioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoServicio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoServicio--;			
			//TipoServicio tiposervicioAux= new TipoServicio();			
			//tiposervicioAux.setId(this.iIdNuevoTipoServicio);
			
			if(this.jInternalFrameDetalleFormTipoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoServicio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);
			
			this.tiposervicio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiposervicioLogic.getTipoServicios().add(this.tiposervicioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiposervicios.add(this.tiposervicioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoServicio(false);
			
			this.jTableDatosTipoServicio.setRowSelectionInterval(this.getIndiceNuevoTipoServicio(), this.getIndiceNuevoTipoServicio());
			
			int iLastRow =  this.jTableDatosTipoServicio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoServicio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoServicio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoServicio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoServicio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoServicio(false);
			
			//SI ES MANUAL
			if(TipoServicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoServicio();
			}
			
			//this.abrirFrameTreeTipoServicio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoServicioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ServicioES ?", "MANTENIMIENTO DE Tipo Servicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoServicio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoServicio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiposervicioReturnGeneral=tiposervicioLogic.procesarImportacionTipoServiciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiposervicioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoServicioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoServicioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoServicio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoServicio.setFileImportacion(this.jInternalFrameImportacionTipoServicio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoServicio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoServicio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoServicio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoServicio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();		

		tiposerviciosSeleccionados=this.getTipoServiciosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoServicio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoServicio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoServicioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoServicioBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoServicios("Todos",tiposerviciosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Servicio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoServicio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoServicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoServicioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoServicioConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoServicio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoServicio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoServicio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoServicioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoServicioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoServicio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoServicioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoServicioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoServicio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoServicio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoServicioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoServicioConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoServicioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();		
		
		tiposerviciosSeleccionados=this.getTipoServiciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposervicio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoServicios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoServicio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoServicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoServicioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoServicioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoServicio tiposervicio:tiposerviciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposervicio.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoServicioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoServicioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoServicio tiposervicio:tiposerviciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposervicio.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoServicio(row);				
			//	iRow++;
			//}				
			
			//for(TipoServicio tiposervicioAux:tiposerviciosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoServicio(tiposervicioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Servicio",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiposervicioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoServicio(false);
			
			//SI ES MANUAL
			if(TipoServicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoServicio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoServicio(false);
			
			//SI ES MANUAL
			if(TipoServicioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoServicio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoServicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoServicio(false);
			
			//SI ES MANUAL
			if(TipoServicioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoServicio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoServicio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoServicio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoServicio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoServicio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoServicio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoServicio.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoServicio.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoServicio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoServicio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoServicio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoServicio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoServicio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoServicio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoServicio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoServicio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoServicio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoServicioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoServicioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoServicio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoServicio();
		
		this.inicializarActualizarBindingBotonesManualTipoServicio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoServicio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoServicio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoServicio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoServicio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoServicio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoServicio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoServicio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoServicio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoServicio.jCheckBoxPostAccionNuevoTipoServicio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoServicio.jCheckBoxPostAccionSinCerrarTipoServicio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoServicio.jCheckBoxPostAccionSinMensajeTipoServicio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoServicio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoServicio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoServicio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoServicio!=null) {
				this.jInternalFrameDetalleFormTipoServicio.jCheckBoxPostAccionNuevoTipoServicio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoServicio.jCheckBoxPostAccionSinCerrarTipoServicio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoServicio.jCheckBoxPostAccionSinMensajeTipoServicio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoServicio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoServicio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoServicio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoServicio.jComboBoxTiposAccionesFormularioTipoServicio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoServicio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoServicio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoServicio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoServicio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoServicio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoServicio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoServicio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoServicio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoServicio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoServicio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoServicio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoServicio(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoServicioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoServicio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoServicio() throws Exception {
		try	{
			if(TipoServicioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoServicio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoServicio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoServicio.jComboBoxTiposAccionesFormularioTipoServicio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoServicio.jComboBoxTiposAccionesFormularioTipoServicio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoServicio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoServicio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoServicio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoServicio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoServicio.addItem(reporte);
			}
			
			
			if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoServicio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoServicio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoServicio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoServicio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoServicio.jComboBoxTiposAccionesFormularioTipoServicio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoServicio.jComboBoxTiposAccionesFormularioTipoServicio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoServicio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoServicio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoServicio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoServicio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoServicio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoServicio!=null) {
				this.jInternalFrameReporteDinamicoTipoServicio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoServicio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoServicio!=null) {
				this.jInternalFrameReporteDinamicoTipoServicio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoServicio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoServicio!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoServicio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoServicio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoServicio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoServicio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoServicio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoServicio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoServicio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoServicio.getText();
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreTipoServicio.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoServicio(Boolean esInicializar) throws Exception {				
		if(TipoServicioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoServicio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoServicio() throws Exception {
		this.inicializarActualizarBindingTablaTipoServicio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoServicio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoServicioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoServicioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoServicioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoServicioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoServicioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoServicioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoServicio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiposervicioLogic.getTipoServicios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiposervicios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoServicio.setModel(new TipoServicioModel(this.tiposervicioLogic.getTipoServicios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoServicio.setModel(new TipoServicioModel(this.tiposervicios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoServicio!=null && this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoServicio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoServicio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoServicioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoServicioConstantesFunciones.SCLASSWEBTITULO,tiposervicioConstantesFunciones.resaltarSeleccionarTipoServicio,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoServicioConstantesFunciones.SCLASSWEBTITULO,tiposervicioConstantesFunciones.resaltarSeleccionarTipoServicio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoServicio,TipoServicioConstantesFunciones.LABEL_ID));

		if(this.tiposervicioConstantesFunciones.mostraridTipoServicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoServicioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiposervicioConstantesFunciones.resaltaridTipoServicio,this.tiposervicioConstantesFunciones.activaridTipoServicio,this,true,"idTipoServicio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposervicioConstantesFunciones.resaltaridTipoServicio,this.tiposervicioConstantesFunciones.activaridTipoServicio,this,true,"idTipoServicio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoServicio,TipoServicioConstantesFunciones.LABEL_CODIGO));

		if(this.tiposervicioConstantesFunciones.mostrarcodigoTipoServicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoServicioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiposervicioConstantesFunciones.resaltarcodigoTipoServicio,this.tiposervicioConstantesFunciones.activarcodigoTipoServicio,this,true,"codigoTipoServicio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposervicioConstantesFunciones.resaltarcodigoTipoServicio,this.tiposervicioConstantesFunciones.activarcodigoTipoServicio,this,true,"codigoTipoServicio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoServicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoServicio,TipoServicioConstantesFunciones.LABEL_NOMBRE));

		if(this.tiposervicioConstantesFunciones.mostrarnombreTipoServicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoServicioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiposervicioConstantesFunciones.resaltarnombreTipoServicio,this.tiposervicioConstantesFunciones.activarnombreTipoServicio,this,true,"nombreTipoServicio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposervicioConstantesFunciones.resaltarnombreTipoServicio,this.tiposervicioConstantesFunciones.activarnombreTipoServicio,this,true,"nombreTipoServicio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoServicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosParametroInventarioDefecto && this.tiposervicioConstantesFunciones.mostrarParametroInventarioDefectoTipoServicio && !TipoServicioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(tiposervicioConstantesFunciones.resaltarParametroInventarioDefectoTipoServicio,this,this.tiposervicioConstantesFunciones.activarParametroInventarioDefectoTipoServicio));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(tiposervicioConstantesFunciones.resaltarParametroInventarioDefectoTipoServicio,this,this.tiposervicioConstantesFunciones.activarParametroInventarioDefectoTipoServicio));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoServicio.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiposervicioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiposervicioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoServicio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiposervicioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiposervicioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoServicio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoServicio && this.isPermisoGuardarCambiosTipoServicio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiposervicioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiposervicioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoServicio.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiposervicioSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoServicio.addColumn(tableColumn);
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
			
			this.jTableDatosTipoServicio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoServicio && this.isPermisoGuardarCambiosTipoServicio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiposervicioSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoServicio && this.isPermisoGuardarCambiosTipoServicio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoServicio.moveColumn(this.jTableDatosTipoServicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoServicio.moveColumn(this.jTableDatosTipoServicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiposervicioSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoServicio.moveColumn(this.jTableDatosTipoServicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoServicio.moveColumn(this.jTableDatosTipoServicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoServicio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoServicio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoServicio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoServicio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoServicio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoServicio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoServicio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoServicio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiposervicioLogic.getTipoServicios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiposervicios.size()-1;
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
		//this.jTableDatosTipoServicio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoServicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoServicio();
			
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
				
				//this.isEsNuevoTipoServicio=false;
					
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			
				if(this.tiposervicioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoServicio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoServicio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoServicio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicio =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposervicio =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiposervicio.getsType().equals("DUPLICADO")
				   || this.tiposervicio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoServicio=true;
				
				} else {
					this.isEsNuevoTipoServicio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
					if(this.tiposervicio.getId()>=0 && !this.tiposervicio.getIsNew()) {						
						this.isEsNuevoTipoServicio=false;
						
					} else {
						this.isEsNuevoTipoServicio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoServicio(esRelaciones);						
				
				this.seleccionarTipoServicio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiposervicio.getId()<0) {
					this.isEsNuevoTipoServicio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoServicio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoServicio(evt,rowIndex);
				}	
				
				if(this.tiposervicioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoServicio: " + this.dDif); 
					}
				}								
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoServicio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiposervicio)) {
					if(this.tiposervicio.getId()>0) {
						this.tiposervicio.setIsDeleted(true);
						
						this.tiposerviciosEliminados.add(this.tiposervicio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiposervicioLogic.getTipoServicios().remove(this.tiposervicio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiposervicios.remove(this.tiposervicio);				
					}
					
					
					((TipoServicioModel) this.jTableDatosTipoServicio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoServicio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoServicio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoServicio) {
			
			if(this.jInternalFrameDetalleFormTipoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoServicio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoServicio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicio =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposervicio =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoServicio(this.tiposervicio);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoServicio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoServicio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoServicio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoServicio(TipoServicio tiposervicio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoServicio(tiposervicio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoServicio(TipoServicio tiposervicio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoServicio(tiposervicio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoServicio(tiposervicio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoServicio(tiposervicio);
	}
	
	public void setVariablesObjetoActualToFormularioTipoServicio(TipoServicio tiposervicio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoServicio.jTextFieldidTipoServicio.setText(tiposervicio.getId().toString());
			this.jInternalFrameDetalleFormTipoServicio.jTextFieldcodigoTipoServicio.setText(tiposervicio.getcodigo());
			this.jInternalFrameDetalleFormTipoServicio.jTextFieldnombreTipoServicio.setText(tiposervicio.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoServicio tiposervicioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiposervicioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoServicio tiposervicioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiposervicioLocal=this.tiposervicio;
			} else {
				tiposervicioLocal=this.tiposervicioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiposervicioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoServicio(tiposervicioLocal,true);
					
					if(tiposervicioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiposervicioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiposervicioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoServicio(TipoServicio tiposervicio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoServicio(tiposervicio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(tiposervicio);
	}
	
	public void setVariablesFormularioToObjetoActualTipoServicio(TipoServicio tiposervicio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoServicio(tiposervicio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoServicio(TipoServicio tiposervicio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoServicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoServicio.jTextFieldidTipoServicio.getText()==null || this.jInternalFrameDetalleFormTipoServicio.jTextFieldidTipoServicio.getText()=="" || this.jInternalFrameDetalleFormTipoServicio.jTextFieldidTipoServicio.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoServicio.jTextFieldidTipoServicio.setText("0");
			}

			if(conColumnasBase) {tiposervicio.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoServicio.jTextFieldidTipoServicio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoServicioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoServicio.jLabelIdTipoServicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiposervicio.setcodigo(this.jInternalFrameDetalleFormTipoServicio.jTextFieldcodigoTipoServicio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoServicioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoServicio.jLabelcodigoTipoServicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiposervicio.setnombre(this.jInternalFrameDetalleFormTipoServicio.jTextFieldnombreTipoServicio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoServicioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoServicio.jLabelnombreTipoServicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoServicio(TipoServicio tiposervicioBean,TipoServicio tiposervicio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoServicio(TipoServicio tiposervicioOrigen,TipoServicio tiposervicio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiposervicioOrigen.getId()!=null && !tiposervicioOrigen.getId().equals(0L))) {tiposervicio.setId(tiposervicioOrigen.getId());}}
			if(conDefault || (!conDefault && tiposervicioOrigen.getcodigo()!=null && !tiposervicioOrigen.getcodigo().equals(""))) {tiposervicio.setcodigo(tiposervicioOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiposervicioOrigen.getnombre()!=null && !tiposervicioOrigen.getnombre().equals(""))) {tiposervicio.setnombre(tiposervicioOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoServicio(TipoServicio tiposervicio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoServicio.jTextFieldidTipoServicio.setText(tiposervicio.getId().toString());
			this.jInternalFrameDetalleFormTipoServicio.jTextFieldcodigoTipoServicio.setText(tiposervicio.getcodigo());
			this.jInternalFrameDetalleFormTipoServicio.jTextFieldnombreTipoServicio.setText(tiposervicio.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoServicio(TipoServicioBean tiposervicioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoServicio.jTextFieldidTipoServicio.setText(tiposervicioBean.getId().toString());
			this.jInternalFrameDetalleFormTipoServicio.jTextFieldcodigoTipoServicio.setText(tiposervicioBean.getcodigo());
			this.jInternalFrameDetalleFormTipoServicio.jTextFieldnombreTipoServicio.setText(tiposervicioBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoServicio(TipoServicioParameterReturnGeneral tiposervicioReturnGeneral,TipoServicioBean tiposervicioBean,Boolean conDefault) throws Exception { 
		try {
			TipoServicio tiposervicioLocal=new TipoServicio();
			
			tiposervicioLocal=tiposervicioReturnGeneral.getTipoServicio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiposervicioLocal.getId()!=null && !tiposervicioLocal.getId().equals(0L))) {tiposervicioBean.setId(tiposervicioLocal.getId());}}
			if(conDefault || (!conDefault && tiposervicioLocal.getcodigo()!=null && !tiposervicioLocal.getcodigo().equals(""))) {tiposervicioBean.setcodigo(tiposervicioLocal.getcodigo());}
			if(conDefault || (!conDefault && tiposervicioLocal.getnombre()!=null && !tiposervicioLocal.getnombre().equals(""))) {tiposervicioBean.setnombre(tiposervicioLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoServicioGenerico(Long idTipoServicioSeleccionado,JComboBox jComboBoxTipoServicio,List<TipoServicio> tiposerviciosLocal)throws Exception {
		try {
			TipoServicio  tiposervicioTemp=null;

			for(TipoServicio tiposervicioAux:tiposerviciosLocal) {
				if(tiposervicioAux.getId()!=null && tiposervicioAux.getId().equals(idTipoServicioSeleccionado)) {
					tiposervicioTemp=tiposervicioAux;
					break;
				}
			}

			jComboBoxTipoServicio.setSelectedItem(tiposervicioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoServicioGenerico(JComboBox jComboBoxTipoServicio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoServicio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoServicio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoServicio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoServicio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposervicio=(TipoServicio) tiposervicioLogic.getTipoServicios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiposervicio =(TipoServicio) tiposervicios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoServicio tiposervicioRow=new TipoServicio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposervicioRow=(TipoServicio) tiposervicioLogic.getTipoServicios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiposervicioRow=(TipoServicio) tiposervicios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoServicio tiposervicio) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoServicio==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposervicio = (TipoServicio)this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiposervicio = (TipoServicio)this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiposervicio!=null) {
						this.tiposervicio = tiposervicio;
					} else {
						this.tiposervicio = new TipoServicio();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.tiposervicio)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<TipoServicio> tiposervicios=new ArrayList<TipoServicio>();
					tiposervicios.add(this.tiposervicio);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoServicio.cargarParametroInventarioDefectoBeanSwingJInternalFrame(tiposervicios,this.tiposervicio,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoServicio=(TitledBorder)this.jScrollPanelDatosTipoServicio.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderTipoServicio.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiposervicioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoServicio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoServicio.setVisible((this.isVisibilidadCeldaNuevoTipoServicio && this.isPermisoNuevoTipoServicio));			
			this.jButtonDuplicarTipoServicio.setVisible((this.isVisibilidadCeldaDuplicarTipoServicio && this.isPermisoDuplicarTipoServicio));			
			this.jButtonCopiarTipoServicio.setVisible((this.isVisibilidadCeldaCopiarTipoServicio && this.isPermisoCopiarTipoServicio));
			this.jButtonVerFormTipoServicio.setVisible((this.isVisibilidadCeldaVerFormTipoServicio && this.isPermisoVerFormTipoServicio));
			
			this.jButtonAbrirOrderByTipoServicio.setVisible((this.isVisibilidadCeldaOrdenTipoServicio && this.isPermisoOrdenTipoServicio));			
			
			this.jButtonNuevoRelacionesTipoServicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoServicio && this.isPermisoNuevoTipoServicio));			
			this.jButtonNuevoGuardarCambiosTipoServicio.setVisible((this.isVisibilidadCeldaNuevoTipoServicio && this.isPermisoNuevoTipoServicio && this.isPermisoGuardarCambiosTipoServicio));
			
			if(this.jInternalFrameDetalleFormTipoServicio!=null) {
			this.jInternalFrameDetalleFormTipoServicio.jButtonModificarTipoServicio.setVisible((this.isVisibilidadCeldaModificarTipoServicio && this.isPermisoActualizarTipoServicio));	
			this.jInternalFrameDetalleFormTipoServicio.jButtonActualizarTipoServicio.setVisible((this.isVisibilidadCeldaActualizarTipoServicio && this.isPermisoActualizarTipoServicio));	
			this.jInternalFrameDetalleFormTipoServicio.jButtonEliminarTipoServicio.setVisible((this.isVisibilidadCeldaEliminarTipoServicio && this.isPermisoEliminarTipoServicio));
			this.jInternalFrameDetalleFormTipoServicio.jButtonCancelarTipoServicio.setVisible(this.isVisibilidadCeldaCancelarTipoServicio);							
			this.jInternalFrameDetalleFormTipoServicio.jButtonGuardarCambiosTipoServicio.setVisible((this.isVisibilidadCeldaGuardarTipoServicio && this.isPermisoGuardarCambiosTipoServicio));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoServicio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoServicio && this.isPermisoGuardarCambiosTipoServicio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoServicio.setVisible((this.isVisibilidadCeldaNuevoTipoServicio && this.isPermisoNuevoTipoServicio));						
			this.jButtonDuplicarToolBarTipoServicio.setVisible((this.isVisibilidadCeldaDuplicarTipoServicio && this.isPermisoDuplicarTipoServicio));						
			this.jButtonCopiarToolBarTipoServicio.setVisible((this.isVisibilidadCeldaCopiarTipoServicio && this.isPermisoCopiarTipoServicio));			
			this.jButtonVerFormToolBarTipoServicio.setVisible((this.isVisibilidadCeldaVerFormTipoServicio && this.isPermisoVerFormTipoServicio));			
			this.jButtonAbrirOrderByToolBarTipoServicio.setVisible((this.isVisibilidadCeldaOrdenTipoServicio && this.isPermisoOrdenTipoServicio));
			this.jButtonNuevoRelacionesToolBarTipoServicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoServicio && this.isPermisoNuevoTipoServicio));			
			this.jButtonNuevoGuardarCambiosToolBarTipoServicio.setVisible((this.isVisibilidadCeldaNuevoTipoServicio && this.isPermisoNuevoTipoServicio && this.isPermisoGuardarCambiosTipoServicio));			
			
			if(this.jInternalFrameDetalleFormTipoServicio!=null) {
			this.jInternalFrameDetalleFormTipoServicio.jButtonModificarToolBarTipoServicio.setVisible((this.isVisibilidadCeldaModificarTipoServicio && this.isPermisoActualizarTipoServicio));	
			this.jInternalFrameDetalleFormTipoServicio.jButtonActualizarToolBarTipoServicio.setVisible((this.isVisibilidadCeldaActualizarTipoServicio  && this.isPermisoActualizarTipoServicio));	
			this.jInternalFrameDetalleFormTipoServicio.jButtonEliminarToolBarTipoServicio.setVisible((this.isVisibilidadCeldaEliminarTipoServicio && this.isPermisoEliminarTipoServicio));
			this.jInternalFrameDetalleFormTipoServicio.jButtonCancelarToolBarTipoServicio.setVisible(this.isVisibilidadCeldaCancelarTipoServicio);				
			this.jInternalFrameDetalleFormTipoServicio.jButtonGuardarCambiosToolBarTipoServicio.setVisible((this.isVisibilidadCeldaGuardarTipoServicio && this.isPermisoGuardarCambiosTipoServicio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoServicio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoServicio && this.isPermisoGuardarCambiosTipoServicio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoServicio.setVisible((this.isVisibilidadCeldaNuevoTipoServicio && this.isPermisoNuevoTipoServicio));			
			this.jMenuItemDuplicarTipoServicio.setVisible((this.isVisibilidadCeldaDuplicarTipoServicio && this.isPermisoDuplicarTipoServicio));			
			this.jMenuItemCopiarTipoServicio.setVisible((this.isVisibilidadCeldaCopiarTipoServicio && this.isPermisoCopiarTipoServicio));			
			this.jMenuItemVerFormTipoServicio.setVisible((this.isVisibilidadCeldaVerFormTipoServicio && this.isPermisoVerFormTipoServicio));			
			this.jMenuItemAbrirOrderByTipoServicio.setVisible((this.isVisibilidadCeldaOrdenTipoServicio && this.isPermisoOrdenTipoServicio));			
			//this.jMenuItemMostrarOcultarTipoServicio.setVisible((this.isVisibilidadCeldaOrdenTipoServicio && this.isPermisoOrdenTipoServicio));
			this.jMenuItemDetalleAbrirOrderByTipoServicio.setVisible((this.isVisibilidadCeldaOrdenTipoServicio && this.isPermisoOrdenTipoServicio));			
			//this.jMenuItemDetalleMostrarOcultarTipoServicio.setVisible((this.isVisibilidadCeldaOrdenTipoServicio && this.isPermisoOrdenTipoServicio));			
			this.jMenuItemNuevoRelacionesTipoServicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoServicio && this.isPermisoNuevoTipoServicio));			
			this.jMenuItemNuevoGuardarCambiosTipoServicio.setVisible((this.isVisibilidadCeldaNuevoTipoServicio && this.isPermisoNuevoTipoServicio && this.isPermisoGuardarCambiosTipoServicio));									
			
			if(this.jInternalFrameDetalleFormTipoServicio!=null) {
			this.jInternalFrameDetalleFormTipoServicio.jMenuItemModificarTipoServicio.setVisible((this.isVisibilidadCeldaModificarTipoServicio && this.isPermisoActualizarTipoServicio));	
			this.jInternalFrameDetalleFormTipoServicio.jMenuItemActualizarTipoServicio.setVisible((this.isVisibilidadCeldaActualizarTipoServicio && this.isPermisoActualizarTipoServicio));	
			this.jInternalFrameDetalleFormTipoServicio.jMenuItemEliminarTipoServicio.setVisible((this.isVisibilidadCeldaEliminarTipoServicio && this.isPermisoEliminarTipoServicio));
			this.jInternalFrameDetalleFormTipoServicio.jMenuItemCancelarTipoServicio.setVisible(this.isVisibilidadCeldaCancelarTipoServicio);				
			}
			
			this.jMenuItemGuardarCambiosTipoServicio.setVisible((this.isVisibilidadCeldaGuardarTipoServicio && this.isPermisoGuardarCambiosTipoServicio));						
			this.jMenuItemGuardarCambiosTablaTipoServicio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoServicio && this.isPermisoGuardarCambiosTipoServicio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoServicio=this.jButtonNuevoTipoServicio.isVisible();
			this.isVisibilidadCeldaDuplicarTipoServicio=this.jButtonDuplicarTipoServicio.isVisible();
			this.isVisibilidadCeldaCopiarTipoServicio=this.jButtonCopiarTipoServicio.isVisible();
			this.isVisibilidadCeldaVerFormTipoServicio=this.jButtonVerFormTipoServicio.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoServicio=this.jButtonAbrirOrderByTipoServicio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoServicio=this.jButtonNuevoRelacionesTipoServicio.isVisible();
			this.isVisibilidadCeldaModificarTipoServicio=this.jButtonModificarTipoServicio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoServicio!=null) {
			this.isVisibilidadCeldaActualizarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jButtonActualizarTipoServicio.isVisible();
			this.isVisibilidadCeldaEliminarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jButtonEliminarTipoServicio.isVisible();
			this.isVisibilidadCeldaCancelarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jButtonCancelarTipoServicio.isVisible();
			this.isVisibilidadCeldaGuardarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jButtonGuardarCambiosTipoServicio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoServicio=this.jButtonGuardarCambiosTablaTipoServicio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoServicio=this.jButtonNuevoToolBarTipoServicio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoServicio=this.jButtonNuevoRelacionesToolBarTipoServicio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoServicio!=null) {
			this.isVisibilidadCeldaModificarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jButtonModificarToolBarTipoServicio.isVisible();
			this.isVisibilidadCeldaActualizarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jButtonActualizarToolBarTipoServicio.isVisible();
			this.isVisibilidadCeldaEliminarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jButtonEliminarToolBarTipoServicio.isVisible();
			this.isVisibilidadCeldaCancelarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jButtonCancelarToolBarTipoServicio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoServicio=this.jButtonGuardarCambiosToolBarTipoServicio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoServicio=this.jButtonGuardarCambiosTablaToolBarTipoServicio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoServicio=this.jMenuItemNuevoTipoServicio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoServicio=this.jMenuItemNuevoRelacionesTipoServicio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoServicio!=null) {
			this.isVisibilidadCeldaModificarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jMenuItemModificarTipoServicio.isVisible();
			this.isVisibilidadCeldaActualizarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jMenuItemActualizarTipoServicio.isVisible();
			this.isVisibilidadCeldaEliminarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jMenuItemEliminarTipoServicio.isVisible();
			this.isVisibilidadCeldaCancelarTipoServicio=this.jInternalFrameDetalleFormTipoServicio.jMenuItemCancelarTipoServicio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoServicio=this.jMenuItemGuardarCambiosTipoServicio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoServicio=this.jMenuItemGuardarCambiosTablaTipoServicio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoServicio(Boolean esInicializar) {
		if(TipoServicioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiposervicioSessionBean.getConGuardarRelaciones()) {
				//if(this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoServicio();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoServicio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoServicio() {
		this.jButtonNuevoTipoServicio.setVisible(this.isPermisoNuevoTipoServicio);			
		this.jButtonDuplicarTipoServicio.setVisible(this.isPermisoDuplicarTipoServicio);			
		this.jButtonCopiarTipoServicio.setVisible(this.isPermisoCopiarTipoServicio);			
		this.jButtonVerFormTipoServicio.setVisible(this.isPermisoVerFormTipoServicio);			
		
		this.jButtonAbrirOrderByTipoServicio.setVisible(this.isPermisoOrdenTipoServicio);					
		
		this.jButtonNuevoRelacionesTipoServicio.setVisible(this.isPermisoNuevoTipoServicio);			
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.jButtonModificarTipoServicio.setVisible(this.isPermisoActualizarTipoServicio);	
			this.jInternalFrameDetalleFormTipoServicio.jButtonActualizarTipoServicio.setVisible(this.isPermisoActualizarTipoServicio);	
			this.jInternalFrameDetalleFormTipoServicio.jButtonEliminarTipoServicio.setVisible(this.isPermisoEliminarTipoServicio);
			this.jInternalFrameDetalleFormTipoServicio.jButtonCancelarTipoServicio.setVisible(this.isVisibilidadCeldaCancelarTipoServicio);						
			this.jInternalFrameDetalleFormTipoServicio.jButtonGuardarCambiosTipoServicio.setVisible(this.isPermisoGuardarCambiosTipoServicio);							
		}
		
		this.jButtonGuardarCambiosTablaTipoServicio.setVisible(this.isPermisoActualizarTipoServicio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoServicio() {
		this.jInternalFrameDetalleFormTipoServicio.jButtonModificarTipoServicio.setVisible(this.isPermisoActualizarTipoServicio);	
		this.jInternalFrameDetalleFormTipoServicio.jButtonActualizarTipoServicio.setVisible(this.isPermisoActualizarTipoServicio);	
		this.jInternalFrameDetalleFormTipoServicio.jButtonEliminarTipoServicio.setVisible(this.isPermisoEliminarTipoServicio);
		this.jInternalFrameDetalleFormTipoServicio.jButtonCancelarTipoServicio.setVisible(this.isVisibilidadCeldaCancelarTipoServicio);							
		this.jInternalFrameDetalleFormTipoServicio.jButtonGuardarCambiosTipoServicio.setVisible((this.isVisibilidadCeldaGuardarTipoServicio && this.isPermisoGuardarCambiosTipoServicio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoServicio() {
		if(TipoServicioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoServicio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoServicio() {
	}
	
	public void jTableDatosTipoServicioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoServicio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoServicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoServicio(this.gettiposervicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposervicio =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposervicio =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposervicio==null) {
						this.tiposervicio = new TipoServicio();
					}

					this.setVariablesFormularioToObjetoActualTipoServicio(this.tiposervicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);
				}

				if(this.tiposervicio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiposervicio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoServicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoServicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoServicio(this.gettiposervicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposervicio =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposervicio =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposervicio==null) {
						this.tiposervicio = new TipoServicio();
					}

					this.setVariablesFormularioToObjetoActualTipoServicio(this.tiposervicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);
				}

				if(this.tiposervicio.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiposervicio.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoServicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoServicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoServicio(this.gettiposervicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposervicio =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposervicio =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposervicio==null) {
						this.tiposervicio = new TipoServicio();
					}

					this.setVariablesFormularioToObjetoActualTipoServicio(this.tiposervicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);
				}

				if(this.tiposervicio.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiposervicio.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoServicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoServicioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoServicio(false,false);

			this.getTipoServiciosBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoServicio(false);

			//if(TipoServicioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoServicio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoServicioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoServicio(false,false);

			this.getTipoServiciosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoServicio(false);

			//if(TipoServicioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoServicio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposervicioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoServicio() {
		if(this.jInternalFrameDetalleFormTipoServicio!=null) {
		

		if(this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) {
			this.jInternalFrameDetalleFormTipoServicio.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoServicio.dispose();
			this.jInternalFrameDetalleFormTipoServicio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoServicio!=null) {
			this.jInternalFrameReporteDinamicoTipoServicio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoServicio.dispose();
			this.jInternalFrameReporteDinamicoTipoServicio=null;
		}
		
		if(this.jInternalFrameImportacionTipoServicio!=null) {
			this.jInternalFrameImportacionTipoServicio.setVisible(false);	    			
			this.jInternalFrameImportacionTipoServicio.dispose();
			this.jInternalFrameImportacionTipoServicio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoServicio();
			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoServicio")) {
				jButtonNuevoTipoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoServicio")) {
				jButtonDuplicarTipoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoServicio")) {
				jButtonCopiarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoServicio")) {
				jButtonVerFormTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoServicio")) {
				jButtonNuevoTipoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoServicio")) {
				jButtonDuplicarTipoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoServicio")) {
				jButtonNuevoTipoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoServicio")) {
				jButtonDuplicarTipoServicioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoServicio")) {
				jButtonNuevoTipoServicioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoServicio")) {
				jButtonNuevoTipoServicioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoServicio")) {
				jButtonNuevoTipoServicioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoServicio")) {
				jButtonModificarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoServicio")) {
				jButtonModificarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoServicio")) {
				jButtonModificarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoServicio")) {
				jButtonActualizarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoServicio")) {
				jButtonActualizarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoServicio")) {
				jButtonActualizarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoServicio")) {
				jButtonEliminarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoServicio")) {
				jButtonEliminarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoServicio")) {
				jButtonEliminarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoServicio")) {
				jButtonCancelarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoServicio")) {
				jButtonCancelarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoServicio")) {
				jButtonCancelarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoServicio")) {
				jButtonCerrarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoServicio")) {
				jButtonCerrarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoServicio")) {
				jButtonCerrarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoServicio")) {
				jButtonMostrarOcultarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoServicio")) {
				jButtonCancelarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoServicio")) {
				jButtonGuardarCambiosTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoServicio")) {
				jButtonGuardarCambiosTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoServicio")) {
				jButtonCopiarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoServicio")) {
				jButtonVerFormTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoServicio")) {
				jButtonGuardarCambiosTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoServicio")) {
				jButtonCopiarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoServicio")) {
				jButtonVerFormTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoServicio")) {
				jButtonGuardarCambiosTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoServicio")) {
				jButtonGuardarCambiosTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoServicio")) {
				jButtonGuardarCambiosTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoServicio")) {
				jButtonRecargarInformacionTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoServicio")) {
				jButtonRecargarInformacionTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoServicio")) {
				jButtonRecargarInformacionTipoServicioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoServicio")) {
				jButtonAnterioresTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoServicio")) {
				jButtonAnterioresTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoServicio")) {
				jButtonAnterioresTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoServicio")) {
				jButtonSiguientesTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoServicio")) {
				jButtonSiguientesTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoServicio")) {
				jButtonSiguientesTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoServicio") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoServicio")) {
				jButtonAbrirOrderByTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoServicio") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoServicio")) {
				jButtonMostrarOcultarTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoServicio")) {
				jButtonNuevoGuardarCambiosTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoServicio")) {
				jButtonNuevoGuardarCambiosTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoServicio")) {
				jButtonNuevoGuardarCambiosTipoServicioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoServicio")) {
				jButtonCerrarReporteDinamicoTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoServicio")) {
				jButtonGenerarReporteDinamicoTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoServicio")) {
				
				jButtonGenerarExcelReporteDinamicoTipoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoServicio")) {
				jButtonCerrarImportacionTipoServicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoServicio")) {
				
				jButtonGenerarImportacionTipoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoServicio")) {
				
				jButtonAbrirImportacionTipoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoServicio")) {
				jComboBoxTiposAccionesTipoServicioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoServicio")) {
				jComboBoxTiposRelacionesTipoServicioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoServicio")) {
				jComboBoxTiposAccionesTipoServicioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoServicio")) {
				
				jComboBoxTiposSeleccionarTipoServicioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoServicio")) {
				jTextFieldValorCampoGeneralTipoServicioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoServicio")) {
				jButtonAbrirOrderByTipoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoServicio")) {
				jButtonAbrirOrderByTipoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoServicio")) {
				jButtonCerrarOrderByTipoServicioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoServicioBusqueda")) {
				this.jButtonidTipoServicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoServicioBusqueda")) {
				this.jButtoncodigoTipoServicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoServicioBusqueda")) {
				this.jButtonnombreTipoServicioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoServicio")) {
				this.jButtonBusquedaPorCodigoTipoServicioActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoServicio")) {
				this.jButtonBusquedaPorNombreTipoServicioActionPerformed(evt);
			}
			
			;
			
			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoServicio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoServicioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				


				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoServicio tiposervicioLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiposervicioLocal=this.tiposervicio;
			} else {
				tiposervicioLocal=this.tiposervicioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
							
				
				


				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioAnterior =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposervicioAnterior =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
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
			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			
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
			
			


			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoServicioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
								
						
				


				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoServicio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
								
				
				


				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioAnterior =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposervicioAnterior =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioAnterior =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposervicioAnterior =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoServicioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
							
				
				


				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoServicio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoServicioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposervicioAnterior =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiposervicioAnterior =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
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
			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			
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
			
			


			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoServicioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
								
				
				


				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioAnterior =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposervicioAnterior =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoServicioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoServicioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoServicio")) {
					jCheckBoxSeleccionarTodosTipoServicioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoServicio")) {
					jCheckBoxSeleccionadosTipoServicioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoServicio")) {
					
				}
				
				


				
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
												
				
				


				
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoServicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoServicioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposervicioAnterior =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiposervicioAnterior =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoServicioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
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
			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
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
			
			


			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoServicioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoServicio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoServicio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposervicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposervicio);
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
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
				
				


				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoServicio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoServicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoServicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposervicioAnterior =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposervicioAnterior =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoServicio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoServicioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoServicio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiposervicio =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiposervicio =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiposervicio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoServicio")) {
				
				}
				
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoServicio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoServicio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoServicio")) {
			
			}
			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoServicio();
			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			
			if(sTipo.equals("NuevoTipoServicio")) {
				jButtonNuevoTipoServicioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoServicio")) {
				jButtonDuplicarTipoServicioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoServicio")) {
				jButtonCopiarTipoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoServicio")) {
				jButtonVerFormTipoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoServicio")) {
				jButtonNuevoTipoServicioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoServicio")) {
				jButtonModificarTipoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoServicio")) {
				jButtonActualizarTipoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoServicio")) {
				jButtonEliminarTipoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoServicio")) {
				jButtonGuardarCambiosTipoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoServicio")) {
				jButtonCancelarTipoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoServicio")) {
				jButtonCerrarTipoServicioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoServicio")) {
				jButtonGuardarCambiosTipoServicioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoServicio")) {
				jButtonNuevoGuardarCambiosTipoServicioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoServicio")) {
				jButtonAbrirOrderByTipoServicioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoServicio")) {
				jButtonRecargarInformacionTipoServicioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoServicio")) {
				jButtonAnterioresTipoServicioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoServicio")) {
				jButtonSiguientesTipoServicioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoServicioBusqueda")) {
				this.jButtonidTipoServicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoServicioBusqueda")) {
				this.jButtoncodigoTipoServicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoServicioBusqueda")) {
				this.jButtonnombreTipoServicioBusquedaActionPerformed(evt);
			}
			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoServicio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoServicio")) {
				closingInternalFrameTipoServicio();
				
			} else if(sTipo.equals("jButtonCancelarTipoServicio")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoServicio = (JInternalFrameBase)evt.getSource();
	            	
	            TipoServicioBeanSwingJInternalFrame jInternalFrameParent=(TipoServicioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoServicio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoServicioActionPerformed(null);
			}
			
			TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiposervicio,new Object(),this.tiposervicioParameterGeneral,this.tiposervicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoServicio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoServicio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoServicio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiposervicio)) {
			if(!esControlTabla) {
				if(TipoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoServicio(this.tiposervicio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);			
				}
				
				if(this.tiposervicioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoServicio(this.tiposervicio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiposervicioReturnGeneral=tiposervicioLogic.procesarEventosTipoServiciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposervicioLogic.getTipoServicios(),this.tiposervicio,this.tiposervicioParameterGeneral,this.isEsNuevoTipoServicio,classes);//this.tiposervicioLogic.getTipoServicio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoServicio(this.tiposervicioReturnGeneral,this.tiposervicioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiposervicioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoServicio(classes,this.tiposervicioReturnGeneral,this.tiposervicioBean,false);
					}
						
					if(this.tiposervicioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoServicio(this.tiposervicioReturnGeneral.getTipoServicio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoServicio(this.tiposervicioReturnGeneral.getTipoServicio());	
					}
						
					if(this.tiposervicioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoServicio(this.tiposervicioReturnGeneral.getTipoServicio(),classes);//this.tiposervicioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoServicio(this.tiposervicio,classes);//this.tiposervicioBean);									
				}
			
				if(TipoServicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoServicio(this.tiposervicio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoServicio(this.tiposervicio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiposervicioAnterior!=null) {
						this.tiposervicio=this.tiposervicioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiposervicioReturnGeneral=tiposervicioLogic.procesarEventosTipoServiciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposervicioLogic.getTipoServicios(),this.tiposervicio,this.tiposervicioParameterGeneral,this.isEsNuevoTipoServicio,classes);//this.tiposervicioLogic.getTipoServicio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiposervicioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiposervicioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiposervicioReturnGeneral.getTipoServicio(),tiposervicioLogic.getTipoServicios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiposervicioReturnGeneral.getTipoServicio(),this.tiposervicios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoServicio.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoServicio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoServicio();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoServicio() throws Exception {
		
		TipoServicioModel tiposervicioModel=(TipoServicioModel)this.jTableDatosTipoServicio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposervicioModel.tiposervicios=this.tiposervicioLogic.getTipoServicios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiposervicioModel.tiposervicios=this.tiposervicios;
		}
		
		
		((TipoServicioModel) this.jTableDatosTipoServicio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoServicio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiposervicioAnterior(),this.tiposervicioLogic.getTipoServicios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiposervicioAnterior(),this.tiposervicios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoServicio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoServicio(TipoServicio tiposervicio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(tiposervicio.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
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
										
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposervicio,new Object(),generalEntityParameterGeneral,this.tiposervicioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiposervicioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoServicioConstantesFunciones.getClassesRelationshipsOfTipoServicio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoServicioConstantesFunciones.getClassesRelationshipsFromStringsOfTipoServicio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoServicio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoServicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposervicio,new Object(),generalEntityParameterGeneral,this.tiposervicioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoServicio(TipoServicioBean tiposervicioBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(tiposervicio.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoServicio(ArrayList<Classe> classes,TipoServicioReturnGeneral tiposervicioReturnGeneral,TipoServicioBean tiposervicioBean,Boolean conDefault) throws Exception {
		
			this.tiposervicioBean.setParametroInventarioDefectos(tiposervicioReturnGeneral.getTipoServicio().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoServicio(TipoServicio tiposervicio,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					tiposervicio.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tiposervicio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoServicio = new TipoServicioDetalleFormJInternalFrame(jDesktopPane,this.tiposervicioSessionBean.getConGuardarRelaciones(),this.tiposervicioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoServicio);
		this.jInternalFrameDetalleFormTipoServicio.setVisible(false);
		this.jInternalFrameDetalleFormTipoServicio.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoServicio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoServicio.tiposervicioLogic=this.tiposervicioLogic;
		
		this.cargarCombosFrameForeignKeyTipoServicio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoServicio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoServicio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoServicio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoServicio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoServicio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoServicio"));
		
		this.jInternalFrameDetalleFormTipoServicio.jButtonModificarTipoServicio.addActionListener(new ButtonActionListener(this,"ModificarTipoServicio"));

		
		this.jInternalFrameDetalleFormTipoServicio.jButtonModificarToolBarTipoServicio.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoServicio"));
					
		this.jInternalFrameDetalleFormTipoServicio.jMenuItemModificarTipoServicio.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoServicio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoServicio.jButtonActualizarTipoServicio.addActionListener (new ButtonActionListener(this,"ActualizarTipoServicio"));
		
		
		this.jInternalFrameDetalleFormTipoServicio.jButtonActualizarToolBarTipoServicio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoServicio"));
						
		this.jInternalFrameDetalleFormTipoServicio.jMenuItemActualizarTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoServicio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoServicio.jButtonEliminarTipoServicio.addActionListener (new ButtonActionListener(this,"EliminarTipoServicio"));
		
		
		this.jInternalFrameDetalleFormTipoServicio.jButtonEliminarToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoServicio"));
								
		this.jInternalFrameDetalleFormTipoServicio.jMenuItemEliminarTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoServicio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoServicio.jButtonCancelarTipoServicio.addActionListener (new ButtonActionListener(this,"CancelarTipoServicio"));
		
		
		this.jInternalFrameDetalleFormTipoServicio.jButtonCancelarToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoServicio"));
					
		this.jInternalFrameDetalleFormTipoServicio.jMenuItemCancelarTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoServicio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoServicio.jMenuItemDetalleCerrarTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoServicio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoServicio.jButtonGuardarCambiosToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoServicio"));
		
		
		
		this.jInternalFrameDetalleFormTipoServicio.jButtonGuardarCambiosToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoServicio"));
		
		
		
		this.jInternalFrameDetalleFormTipoServicio.jComboBoxTiposAccionesFormularioTipoServicio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoServicio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoServicio.jButtonidTipoServicioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoServicio.jButtoncodigoTipoServicioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoServicio.jButtonnombreTipoServicioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoServicioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoServicio.jTabbedPaneRelacionesTipoServicio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoServicio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoServicio"));
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoServicio"));
		}
		
		this.jTableDatosTipoServicio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoServicio"));
		
		this.jTableDatosTipoServicio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoServicio"));
		
		this.jButtonNuevoTipoServicio.addActionListener(new ButtonActionListener(this,"NuevoTipoServicio"));
		
		this.jButtonDuplicarTipoServicio.addActionListener(new ButtonActionListener(this,"DuplicarTipoServicio"));
		
		this.jButtonCopiarTipoServicio.addActionListener(new ButtonActionListener(this,"CopiarTipoServicio"));
		
		this.jButtonVerFormTipoServicio.addActionListener(new ButtonActionListener(this,"VerFormTipoServicio"));
		
		
		this.jButtonNuevoToolBarTipoServicio.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoServicio"));
			
		this.jButtonDuplicarToolBarTipoServicio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoServicio"));
			
		this.jMenuItemNuevoTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoServicio"));
			
		this.jMenuItemDuplicarTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoServicio"));		
		
		
		this.jButtonNuevoRelacionesTipoServicio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoServicio"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoServicio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoServicio"));
			
		this.jMenuItemNuevoRelacionesTipoServicio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoServicio"));		
		
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.jButtonModificarTipoServicio.addActionListener(new ButtonActionListener(this,"ModificarTipoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.jButtonModificarToolBarTipoServicio.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoServicio"));
			
			this.jInternalFrameDetalleFormTipoServicio.jMenuItemModificarTipoServicio.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoServicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoServicio.jButtonActualizarTipoServicio.addActionListener (new ButtonActionListener(this,"ActualizarTipoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.jButtonActualizarToolBarTipoServicio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoServicio"));
				
			this.jInternalFrameDetalleFormTipoServicio.jMenuItemActualizarTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoServicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.jButtonEliminarTipoServicio.addActionListener (new ButtonActionListener(this,"EliminarTipoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.jButtonEliminarToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoServicio"));
						
			this.jInternalFrameDetalleFormTipoServicio.jMenuItemEliminarTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoServicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.jButtonCancelarTipoServicio.addActionListener (new ButtonActionListener(this,"CancelarTipoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.jButtonCancelarToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoServicio"));
			
			this.jInternalFrameDetalleFormTipoServicio.jMenuItemCancelarTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoServicio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoServicio"));		
		
		
		this.jButtonCerrarTipoServicio.addActionListener (new ButtonActionListener(this,"CerrarTipoServicio"));
		
		
		this.jButtonCerrarToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoServicio"));
			
		this.jMenuItemCerrarTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoServicio"));
			
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.jMenuItemDetalleCerrarTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoServicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.jButtonGuardarCambiosTipoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoServicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.jButtonGuardarCambiosToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoServicio"));
		}
		
		this.jButtonCopiarToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoServicio"));
			
		this.jButtonVerFormToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoServicio"));
		
		this.jMenuItemGuardarCambiosTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoServicio"));
			
		this.jMenuItemCopiarTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoServicio"));		
		
		this.jMenuItemVerFormTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoServicio"));		
		
		
		this.jButtonGuardarCambiosTablaTipoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoServicio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoServicio"));
			
		this.jMenuItemGuardarCambiosTablaTipoServicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoServicio"));		
		
		
		
		this.jButtonRecargarInformacionTipoServicio.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoServicio"));
					
		this.jButtonRecargarInformacionToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoServicio"));
		
		this.jMenuItemRecargarInformacionTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoServicio"));		
		
		
		
		this.jButtonAnterioresTipoServicio.addActionListener (new ButtonActionListener(this,"AnterioresTipoServicio"));
		
		
		this.jButtonAnterioresToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoServicio"));
		
		this.jMenuItemAnterioresTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoServicio"));		
		
		
		this.jButtonSiguientesTipoServicio.addActionListener (new ButtonActionListener(this,"SiguientesTipoServicio"));
		
		
		this.jButtonSiguientesToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoServicio"));
			
		this.jMenuItemSiguientesTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoServicio"));
			
		this.jMenuItemAbrirOrderByTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoServicio"));
			
		this.jMenuItemMostrarOcultarTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoServicio"));
			
		this.jMenuItemDetalleAbrirOrderByTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoServicio"));
			
		this.jMenuItemDetalleMostarOcultarTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoServicio"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoServicio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoServicio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoServicio"));
			
		this.jMenuItemNuevoGuardarCambiosTipoServicio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoServicio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoServicio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoServicio"));

		this.jCheckBoxSeleccionadosTipoServicio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoServicio"));
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.jComboBoxTiposAccionesFormularioTipoServicio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoServicio"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoServicio.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoServicio"));
			
		this.jComboBoxTiposAccionesTipoServicio.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoServicio"));
					
		this.jComboBoxTiposSeleccionarTipoServicio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoServicio"));
			
		this.jTextFieldValorCampoGeneralTipoServicio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoServicio"));		
		
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoServicio.jButtonidTipoServicioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoServicio.jButtoncodigoTipoServicioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoServicio.jButtonnombreTipoServicioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoServicioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoServicio.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoServicio"));

			this.jButtonBusquedaPorNombreTipoServicio.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoServicio"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoServicio!=null) {
				this.jInternalFrameReporteDinamicoTipoServicio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoServicio"));
				this.jInternalFrameReporteDinamicoTipoServicio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoServicio"));
				this.jInternalFrameReporteDinamicoTipoServicio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoServicio"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoServicio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoServicio"));				
			//this.jButtonGenerarReporteDinamicoTipoServicio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoServicio"));
			//this.jButtonGenerarExcelReporteDinamicoTipoServicio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoServicio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoServicio!=null) {
				this.jInternalFrameImportacionTipoServicio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoServicio"));
				this.jInternalFrameImportacionTipoServicio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoServicio"));
				this.jInternalFrameImportacionTipoServicio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoServicio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoServicio.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoServicio"));
			
			this.jButtonAbrirOrderByToolBarTipoServicio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoServicio"));			
			
			if(this.jInternalFrameOrderByTipoServicio!=null) {
				this.jInternalFrameOrderByTipoServicio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoServicio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoServicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoServicio.jTabbedPaneRelacionesTipoServicio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoServicio"));
		
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
            		closingInternalFrameTipoServicio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoServicio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoServicio = (JInternalFrameBase)event.getSource();
	            	
	            TipoServicioBeanSwingJInternalFrame jInternalFrameParent=(TipoServicioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoServicio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoServicioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoServicio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoServicioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoServicio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoServicio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoServicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoServicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoServicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoServicio";
		inputMap = this.jButtonNuevoTipoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoServicioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoServicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoServicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoServicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoServicio";
		inputMap = this.jButtonNuevoRelacionesTipoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoServicioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoServicio";
		inputMap = this.jButtonModificarTipoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoServicio";
		inputMap = this.jButtonActualizarTipoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoServicio";
		inputMap = this.jButtonEliminarTipoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoServicio";
		inputMap = this.jButtonCancelarTipoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoServicio";
		inputMap = this.jButtonCerrarTipoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoServicio.jButtonGuardarCambiosTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoServicio";
		inputMap = this.jInternalFrameDetalleFormTipoServicio.jButtonGuardarCambiosTipoServicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoServicio.jButtonGuardarCambiosTipoServicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoServicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoServicio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoServicioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoServicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoServicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoServicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoServicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoServicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoServicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoServicio.jButtonidTipoServicioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoServicio.jButtoncodigoTipoServicioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoServicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoServicio.jButtonnombreTipoServicioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoServicioBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoServicio.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoServicio"));

		this.jButtonBusquedaPorNombreTipoServicio.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoServicio"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoServicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoServicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoServicioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoServicio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoServicio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoServicio tiposervicioAux:this.tiposervicioLogic.getTipoServicios()) {
					tiposervicioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoServicio tiposervicioAux:tiposervicios) {
					tiposervicioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoServicioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoServicio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoServicio tiposervicioAux:this.tiposervicioLogic.getTipoServicios()) {
						tiposervicioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoServicio tiposervicioAux:tiposervicios) {
						tiposervicioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoServicio tiposervicioAux:this.tiposervicioLogic.getTipoServicios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoServicio tiposervicioAux:tiposervicios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoServicio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoServicio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoServicio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoServicio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoServicioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoServicio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoServicio.getSelectedRows();
			
			TipoServicio tiposervicioLocal=new TipoServicio();
			
			//this.seleccionarTodosTipoServicio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposervicioLocal =(TipoServicio) this.tiposervicioLogic.getTipoServicios().toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiposervicioLocal =(TipoServicio) this.tiposervicios.toArray()[this.jTableDatosTipoServicio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiposervicioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoServicio tiposervicioAux:this.tiposervicioLogic.getTipoServicios()) {
						tiposervicioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoServicio tiposervicioAux:tiposervicios) {
						tiposervicioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoServicio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoServicio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoServicio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoServicio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoServicioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoServicioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoServicioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoServicio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoServicio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoServicio tiposervicioAux:this.tiposervicioLogic.getTipoServicios()) {
				
						if(sTipoSeleccionar.equals(TipoServicioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiposervicioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoServicioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiposervicioAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoServicio tiposervicioAux:tiposervicios) {
					
						if(sTipoSeleccionar.equals(TipoServicioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiposervicioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoServicioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiposervicioAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoServicio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoServicioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoServicio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoServicio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoServicio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoServicio.jComboBoxTiposAccionesFormularioTipoServicio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoServicio) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoServicio(conSplash);
				
					this.generarReporteTipoServiciosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoServicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoServicio.jComboBoxTiposAccionesFormularioTipoServicio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoServiciosSeleccionados();
				//this.jComboBoxTiposAccionesTipoServicio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoServiciosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoServicio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoServiciosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoServicio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoServicio();
				
				this.exportarTipoServiciosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoServicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoServicio.jComboBoxTiposAccionesFormularioTipoServicio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoServicios();
				//this.importarTipoServicios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoServicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoServicio.jComboBoxTiposAccionesFormularioTipoServicio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoServicio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoServiciosSeleccionados();
				//this.jComboBoxTiposAccionesTipoServicio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Servicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoServicio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoServicio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoServicio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Servicio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoServicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoServicio.jComboBoxTiposAccionesFormularioTipoServicio.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoServicio();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoServicio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoServicioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoServicio();
			
			if(this.jInternalFrameDetalleFormTipoServicio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();		
			TipoServicio tiposervicio=new TipoServicio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoServicio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoServicio.getSelectedItem();
			
			
			
			
			tiposerviciosSeleccionados=this.getTipoServiciosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiposerviciosSeleccionados.size()==1) {
				for(TipoServicio tiposervicioAux:tiposerviciosSeleccionados) {
					tiposervicio=tiposervicioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,tiposervicio);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoServicio();
			
      		//this.finishProcessTipoServicio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoServicioReturnGeneral() throws Exception {
		if(this.tiposervicioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiposervicioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiposervicioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiposervicioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiposervicioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiposervicioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoServicio(false);
		}
		
		if(this.tiposervicioReturnGeneral.getConRetornoLista() || this.tiposervicioReturnGeneral.getConRetornoObjeto()) {
			if(this.tiposervicioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiposervicioLogic.setTipoServicios(this.tiposervicioReturnGeneral.getTipoServicios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiposervicioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiposervicioLogic.setTipoServicio(this.tiposervicioReturnGeneral.getTipoServicio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoServicio(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoServicio() throws Exception {
		
		
	}
	
	public ArrayList<TipoServicio> getTipoServiciosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoServicio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoServicio tiposervicioAux:tiposervicioLogic.getTipoServicios()) {
					if(tiposervicioAux.getIsSelected()) {
						tiposerviciosSeleccionados.add(tiposervicioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoServicio tiposervicioAux:this.tiposervicios) {
					if(tiposervicioAux.getIsSelected()) {
						tiposerviciosSeleccionados.add(tiposervicioAux);				
					}
				}
			}
			
			if(tiposerviciosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiposerviciosSeleccionados.addAll(this.tiposervicioLogic.getTipoServicios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiposerviciosSeleccionados.addAll(this.tiposervicios);				
					}
				}
			}
		} else {
			tiposerviciosSeleccionados.add(this.tiposervicio);
		}
		
		return tiposerviciosSeleccionados;
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
	
	public void generarReporteTipoServiciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoServiciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoServiciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoServiciosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoServiciosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoServiciosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Servicio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoServiciosSeleccionados() throws Exception {
		ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();		
		
		tiposerviciosSeleccionados=this.getTipoServiciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoServicios("Todos",tiposerviciosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoServiciosSeleccionados() throws Exception {
		ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();		
		
		tiposerviciosSeleccionados=this.getTipoServiciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoServicios("Todos",tiposerviciosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoServiciosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();
		
		tiposerviciosSeleccionados=this.getTipoServiciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoServicios("Todos",tiposerviciosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoServiciosSeleccionados() throws Exception {
		ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoServicio();
		
		
		tiposerviciosSeleccionados=this.getTipoServiciosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoServicio();
		
		
		//this.generarReporteTipoServicios("Todos",tiposerviciosSeleccionados ,tiposervicioImplementable,tiposervicioImplementableHome);
	}
	
	public void mostrarImportacionTipoServicios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoServicio();
		
		this.abrirFrameImportacionTipoServicio();		
		
			
		//this.generarReporteTipoServicios("Todos",tiposerviciosSeleccionados ,tiposervicioImplementable,tiposervicioImplementableHome);
	}
	
	public void importarTipoServicios() throws Exception {		
	
	}
	
	public void exportarTipoServiciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoServiciosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoServiciosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoServiciosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Servicio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoServiciosSeleccionados() throws Exception {
		ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();		
		
		tiposerviciosSeleccionados=this.getTipoServiciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposervicio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoServicio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoServicio tiposervicioAux:tiposerviciosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoServicio(tiposervicioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiposervicioAux.setsDetalleGeneralEntityReporte(tiposervicioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Servicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoServicio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoServicioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoServicioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoServicioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoServicioConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoServicio(TipoServicio tiposervicio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiposervicio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposervicio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposervicio.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposervicio.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoServiciosSeleccionados() throws Exception {
		ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();		
		
		tiposerviciosSeleccionados=this.getTipoServiciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposervicio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoServicios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoServicio(row);				
				iRow++;
			}				
			
			for(TipoServicio tiposervicioAux:tiposerviciosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoServicio(tiposervicioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Servicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoServiciosSeleccionados() throws Exception {
		ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();		
		
		tiposerviciosSeleccionados=this.getTipoServiciosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposervicio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiposervicios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiposervicio");
			//elementRoot.appendChild(element);
		
			for(TipoServicio tiposervicioAux:tiposerviciosSeleccionados) {
				element = document.createElement("tiposervicio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoServicio(tiposervicioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Servicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoServicio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoServicioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoServicioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoServicioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoServicioConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoServicio(TipoServicio tiposervicio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiposervicio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposervicio.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposervicio.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoServicio(TipoServicio tiposervicio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoServicioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiposervicio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoServicioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiposervicio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoServicioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiposervicio.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoServicioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiposervicio.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoServiciosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoServicio> tiposerviciosSeleccionados=new ArrayList<TipoServicio>();
		
		tiposerviciosSeleccionados=this.getTipoServiciosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoServicio(tiposerviciosSeleccionados);
		
		this.generarReporteTipoServicios("Todos",tiposerviciosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoServicio(ArrayList<TipoServicio> tiposerviciosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoServicio tiposervicioAux:tiposerviciosSeleccionados) {
				tiposervicioAux.setsDetalleGeneralEntityReporte(tiposervicioAux.toString());
			
				if(sTipoSeleccionar.equals(TipoServicioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiposervicioAux.setsDescripcionGeneralEntityReporte1(tiposervicioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoServicioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiposervicioAux.setsDescripcionGeneralEntityReporte1(tiposervicioAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoServicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoServicio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoServicio=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoServicio=true;
				this.isVisibilidadCeldaGuardarCambiosTipoServicio=true;
			}
			
			this.isVisibilidadCeldaModificarTipoServicio=false;
			this.isVisibilidadCeldaActualizarTipoServicio=false;
			this.isVisibilidadCeldaEliminarTipoServicio=false;
			this.isVisibilidadCeldaCancelarTipoServicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoServicio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoServicio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoServicio=false;
			this.isVisibilidadCeldaModificarTipoServicio=false;
			this.isVisibilidadCeldaActualizarTipoServicio=true;
			this.isVisibilidadCeldaEliminarTipoServicio=false;
			this.isVisibilidadCeldaCancelarTipoServicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoServicio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoServicio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoServicio=false;
			this.isVisibilidadCeldaModificarTipoServicio=false;
			this.isVisibilidadCeldaActualizarTipoServicio=true;
			this.isVisibilidadCeldaEliminarTipoServicio=true;
			this.isVisibilidadCeldaCancelarTipoServicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoServicio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoServicio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoServicio=false;
			this.isVisibilidadCeldaModificarTipoServicio=false;
			this.isVisibilidadCeldaActualizarTipoServicio=true;
			this.isVisibilidadCeldaEliminarTipoServicio=false;
			this.isVisibilidadCeldaCancelarTipoServicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoServicio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoServicio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoServicio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoServicio=true;
			this.isVisibilidadCeldaGuardarCambiosTipoServicio=true;
			this.isVisibilidadCeldaModificarTipoServicio=false;
			this.isVisibilidadCeldaActualizarTipoServicio=false;
			this.isVisibilidadCeldaEliminarTipoServicio=false;
			this.isVisibilidadCeldaCancelarTipoServicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoServicio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoServicio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoServicio=false;
			this.isVisibilidadCeldaActualizarTipoServicio=false;
			this.isVisibilidadCeldaEliminarTipoServicio=false;
			this.isVisibilidadCeldaCancelarTipoServicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoServicio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoServicio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoServicio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoServicio=false;
			this.isVisibilidadCeldaModificarTipoServicio=true;
			this.isVisibilidadCeldaActualizarTipoServicio=false;
			this.isVisibilidadCeldaEliminarTipoServicio=false;
			this.isVisibilidadCeldaCancelarTipoServicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoServicio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoServicio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoServicioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoServicio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoServicio=true;
			this.isVisibilidadCeldaGuardarCambiosTipoServicio=true;
		} else {
			this.actualizarEstadoPanelsTipoServicio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoServicio=false;
			//this.isVisibilidadCeldaVerFormTipoServicio=false;
			this.isVisibilidadCeldaDuplicarTipoServicio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiposervicioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoServicio=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoServicio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoServicio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiposervicioSessionBean.getEsGuardarRelacionado()) {
			if(!tiposervicioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoServicio=false;												
			}
			
			this.jButtonCerrarTipoServicio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoServicio=false;
		}
		
		if(!this.permiteMantenimiento(this.tiposervicio)) {
			this.isVisibilidadCeldaActualizarTipoServicio=false;
			this.isVisibilidadCeldaEliminarTipoServicio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoServicio() {
		this.isVisibilidadCeldaNuevoTipoServicio=false;
		this.isVisibilidadCeldaGuardarCambiosTipoServicio=false;
	}
	
	public void actualizarEstadoPanelsTipoServicio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoServicio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoServicio!=null) {
				this.jTabbedPaneBusquedasTipoServicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoServicio!=null) {
				this.jScrollPanelDatosTipoServicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoServicio!=null) {
				this.jPanelPaginacionTipoServicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoServicio!=null) {
				this.jPanelParametrosReportesTipoServicio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoServicio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoServicio!=null) {
				this.jTabbedPaneBusquedasTipoServicio.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoServicio!=null) {
				this.jScrollPanelDatosTipoServicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoServicio!=null) {
				this.jPanelPaginacionTipoServicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoServicio!=null) {
				this.jPanelParametrosReportesTipoServicio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoServicio.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoServicio!=null) {
				this.jTabbedPaneBusquedasTipoServicio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoServicio!=null) {
				this.jScrollPanelDatosTipoServicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoServicio!=null) {
				this.jPanelPaginacionTipoServicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoServicio!=null) {
				this.jPanelParametrosReportesTipoServicio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoServicio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoServicio!=null) {
				this.jTabbedPaneBusquedasTipoServicio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoServicio!=null) {
				this.jScrollPanelDatosTipoServicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoServicio!=null) {
				this.jPanelPaginacionTipoServicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoServicio!=null) {
				this.jPanelParametrosReportesTipoServicio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoServicio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoServicio!=null) {
				this.jTabbedPaneBusquedasTipoServicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoServicio!=null) {
				this.jScrollPanelDatosTipoServicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoServicio!=null) {
				this.jPanelPaginacionTipoServicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoServicio!=null) {
				this.jPanelParametrosReportesTipoServicio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoServicio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoServicio!=null) {
				this.jTabbedPaneBusquedasTipoServicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoServicio!=null) {
				this.jScrollPanelDatosTipoServicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoServicio!=null) {
				this.jPanelPaginacionTipoServicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoServicio!=null) {
				this.jPanelParametrosReportesTipoServicio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoServicio!=null) {
				this.jScrollPanelDatosEdicionTipoServicio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoServicio!=null) {
				this.jTabbedPaneBusquedasTipoServicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoServicio!=null) {
				this.jScrollPanelDatosTipoServicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoServicio!=null) {
				this.jPanelPaginacionTipoServicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoServicio!=null) {
				this.jPanelParametrosReportesTipoServicio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoServicio!=null) {
					this.jTabbedPaneBusquedasTipoServicio.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoServicio!=null) {
				this.jPanelParametrosReportesTipoServicio.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoServicio!=null) {
				this.jTabbedPaneBusquedasTipoServicio.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoServicio!=null) {
				this.jPanelParametrosReportesTipoServicio.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionTipoServicioParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.tiposervicioSessionBean==null) {
				this.tiposervicioSessionBean=new TipoServicioSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoSessionBean.setsPathNavegacionActual(tiposervicioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(TipoServicioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoServicio(true);
			this.jInternalFrameDetalleFormTipoServicio.parametroinventariodefectoSessionBean.setlidTipoServicioActual(this.idTipoServicioActual);

			tiposervicioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoServicio(true);
			tiposervicioSessionBean.setlIdTipoServicioActualForeignKey(this.idTipoServicioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoServicioSessionBean tiposervicioSessionBean=new TipoServicioSessionBean();
		
		if(this.tiposervicioSessionBean==null) {
			this.tiposervicioSessionBean=new TipoServicioSessionBean();
		}
		
		this.tiposervicioSessionBean.setsUltimaBusquedaTipoServicio(this.getsAccionBusqueda());
		this.tiposervicioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiposervicioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tiposervicioSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tiposervicioSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoServicioSessionBean tiposervicioSessionBean=new TipoServicioSessionBean();
		
		if(this.tiposervicioSessionBean==null) {
			this.tiposervicioSessionBean=new TipoServicioSessionBean();
		}
		
		if(this.tiposervicioSessionBean.getsUltimaBusquedaTipoServicio()!=null&&!this.tiposervicioSessionBean.getsUltimaBusquedaTipoServicio().equals("")) {
			this.setsAccionBusqueda(tiposervicioSessionBean.getsUltimaBusquedaTipoServicio());
			this.setiNumeroPaginacion(tiposervicioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiposervicioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tiposervicioSessionBean.getcodigo());
				tiposervicioSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tiposervicioSessionBean.getnombre());
				tiposervicioSessionBean.setnombre("");
			}
		}
		
		this.tiposervicioSessionBean.setsUltimaBusquedaTipoServicio("");
		this.tiposervicioSessionBean.setiNumeroPaginacion(TipoServicioConstantesFunciones.INUMEROPAGINACION);
		this.tiposervicioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoServicio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoServicio() {
		this.updateBorderResaltarBusquedasFormularioTipoServicio();
		this.updateVisibilidadBusquedasFormularioTipoServicio();
		this.updateHabilitarBusquedasFormularioTipoServicio();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoServicio() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoServicio.getComponents().length>0) {
	

		if(this.tiposervicioConstantesFunciones.resaltarBusquedaPorCodigoTipoServicio!=null) {
			index= this.jTabbedPaneBusquedasTipoServicio.indexOfComponent(this.jPanelBusquedaPorCodigoTipoServicio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoServicio.getComponent(index);
				jPanel.setBorder(this.tiposervicioConstantesFunciones.resaltarBusquedaPorCodigoTipoServicio);
			}
		}

		if(this.tiposervicioConstantesFunciones.resaltarBusquedaPorNombreTipoServicio!=null) {
			index= this.jTabbedPaneBusquedasTipoServicio.indexOfComponent(this.jPanelBusquedaPorNombreTipoServicio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoServicio.getComponent(index);
				jPanel.setBorder(this.tiposervicioConstantesFunciones.resaltarBusquedaPorNombreTipoServicio);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoServicio() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoServicio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoServicio.indexOfComponent(this.jPanelBusquedaPorCodigoTipoServicio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoServicio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiposervicioConstantesFunciones.mostrarBusquedaPorCodigoTipoServicio);
			if(!this.tiposervicioConstantesFunciones.mostrarBusquedaPorCodigoTipoServicio && index>-1) {
				this.jTabbedPaneBusquedasTipoServicio.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoServicio.indexOfComponent(this.jPanelBusquedaPorNombreTipoServicio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoServicio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiposervicioConstantesFunciones.mostrarBusquedaPorNombreTipoServicio);
			if(!this.tiposervicioConstantesFunciones.mostrarBusquedaPorNombreTipoServicio && index>-1) {
				this.jTabbedPaneBusquedasTipoServicio.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoServicio() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoServicio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoServicio.indexOfComponent(this.jPanelBusquedaPorCodigoTipoServicio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoServicio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiposervicioConstantesFunciones.activarBusquedaPorCodigoTipoServicio);
				this.jTabbedPaneBusquedasTipoServicio.setEnabledAt(index,this.tiposervicioConstantesFunciones.activarBusquedaPorCodigoTipoServicio);
			}

			index= this.jTabbedPaneBusquedasTipoServicio.indexOfComponent(this.jPanelBusquedaPorNombreTipoServicio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoServicio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiposervicioConstantesFunciones.activarBusquedaPorNombreTipoServicio);
				this.jTabbedPaneBusquedasTipoServicio.setEnabledAt(index,this.tiposervicioConstantesFunciones.activarBusquedaPorNombreTipoServicio);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoServicio(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoServicio.indexOfComponent(this.jPanelBusquedaPorCodigoTipoServicio);

			this.jTabbedPaneBusquedasTipoServicio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoServicio.getComponent(index);

			this.tiposervicioConstantesFunciones.setResaltarBusquedaPorCodigoTipoServicio(resaltar);

			jPanel.setBorder(this.tiposervicioConstantesFunciones.resaltarBusquedaPorCodigoTipoServicio);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoServicio.indexOfComponent(this.jPanelBusquedaPorNombreTipoServicio);

			this.jTabbedPaneBusquedasTipoServicio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoServicio.getComponent(index);

			this.tiposervicioConstantesFunciones.setResaltarBusquedaPorNombreTipoServicio(resaltar);

			jPanel.setBorder(this.tiposervicioConstantesFunciones.resaltarBusquedaPorNombreTipoServicio);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoServicio.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoServicio() throws Exception {

		if(this.jInternalFrameDetalleFormTipoServicio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoServicio();
		this.updateVisibilidadResaltarControlesFormularioTipoServicio();
		this.updateHabilitarResaltarControlesFormularioTipoServicio();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoServicio() throws Exception {
		if(this.jInternalFrameDetalleFormTipoServicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiposervicioConstantesFunciones.resaltaridTipoServicio!=null && this.jInternalFrameDetalleFormTipoServicio!=null) {this.jInternalFrameDetalleFormTipoServicio.jTextFieldidTipoServicio.setBorder(this.tiposervicioConstantesFunciones.resaltaridTipoServicio);}
		if(this.tiposervicioConstantesFunciones.resaltarcodigoTipoServicio!=null && this.jInternalFrameDetalleFormTipoServicio!=null) {this.jInternalFrameDetalleFormTipoServicio.jTextFieldcodigoTipoServicio.setBorder(this.tiposervicioConstantesFunciones.resaltarcodigoTipoServicio);}
		if(this.tiposervicioConstantesFunciones.resaltarnombreTipoServicio!=null && this.jInternalFrameDetalleFormTipoServicio!=null) {this.jInternalFrameDetalleFormTipoServicio.jTextFieldnombreTipoServicio.setBorder(this.tiposervicioConstantesFunciones.resaltarnombreTipoServicio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoServicio() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoServicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) {
	
		//this.jInternalFrameDetalleFormTipoServicio.jTextFieldidTipoServicio.setVisible(this.tiposervicioConstantesFunciones.mostraridTipoServicio);
		this.jInternalFrameDetalleFormTipoServicio.jPanelidTipoServicio.setVisible(this.tiposervicioConstantesFunciones.mostraridTipoServicio);
		//this.jInternalFrameDetalleFormTipoServicio.jTextFieldcodigoTipoServicio.setVisible(this.tiposervicioConstantesFunciones.mostrarcodigoTipoServicio);
		this.jInternalFrameDetalleFormTipoServicio.jPanelcodigoTipoServicio.setVisible(this.tiposervicioConstantesFunciones.mostrarcodigoTipoServicio);
		//this.jInternalFrameDetalleFormTipoServicio.jTextFieldnombreTipoServicio.setVisible(this.tiposervicioConstantesFunciones.mostrarnombreTipoServicio);
		this.jInternalFrameDetalleFormTipoServicio.jPanelnombreTipoServicio.setVisible(this.tiposervicioConstantesFunciones.mostrarnombreTipoServicio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoServicio() throws Exception {
		if(this.jInternalFrameDetalleFormTipoServicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoServicio!=null) {
	
		this.jInternalFrameDetalleFormTipoServicio.jTextFieldidTipoServicio.setEnabled(this.tiposervicioConstantesFunciones.activaridTipoServicio);
		this.jInternalFrameDetalleFormTipoServicio.jTextFieldcodigoTipoServicio.setEnabled(this.tiposervicioConstantesFunciones.activarcodigoTipoServicio);
		this.jInternalFrameDetalleFormTipoServicio.jTextFieldnombreTipoServicio.setEnabled(this.tiposervicioConstantesFunciones.activarnombreTipoServicio);
		}
	}
	
		
}