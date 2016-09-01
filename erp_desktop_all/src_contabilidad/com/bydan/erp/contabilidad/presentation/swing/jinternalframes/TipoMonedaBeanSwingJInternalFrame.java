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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.TipoMonedaConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoMonedaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoMonedaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoMonedaBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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




@SuppressWarnings("unused")
public class TipoMonedaBeanSwingJInternalFrame extends TipoMonedaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoMonedaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoMoneda> tipomonedaValidator = new ClassValidator<TipoMoneda>(TipoMoneda.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoMoneda tipomoneda;	
	public TipoMoneda tipomonedaAux;
	public TipoMoneda tipomonedaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoMoneda tipomonedaTotales;
	public Long idTipoMonedaActual;
	public Long iIdNuevoTipoMoneda=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosParametroContabilidadDefecto=false;

	public Boolean getIsTienePermisosParametroContabilidadDefecto() {
		return isTienePermisosParametroContabilidadDefecto;
	}

	public void setIsTienePermisosParametroContabilidadDefecto(Boolean isTienePermisosParametroContabilidadDefecto) {
		this.isTienePermisosParametroContabilidadDefecto= isTienePermisosParametroContabilidadDefecto;
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
	
	public Boolean isPermisoTodoTipoMoneda;
	public Boolean isPermisoNuevoTipoMoneda;
	public Boolean isPermisoActualizarTipoMoneda;
	public Boolean isPermisoActualizarOriginalTipoMoneda;
	public Boolean isPermisoEliminarTipoMoneda;
	public Boolean isPermisoGuardarCambiosTipoMoneda;
	public Boolean isPermisoConsultaTipoMoneda;
	public Boolean isPermisoBusquedaTipoMoneda;
	public Boolean isPermisoReporteTipoMoneda;
	public Boolean isPermisoPaginacionMedioTipoMoneda;
	public Boolean isPermisoPaginacionAltoTipoMoneda;
	public Boolean isPermisoPaginacionTodoTipoMoneda;
	public Boolean isPermisoCopiarTipoMoneda;
	public Boolean isPermisoVerFormTipoMoneda;
	public Boolean isPermisoDuplicarTipoMoneda;
	public Boolean isPermisoOrdenTipoMoneda;
	
	
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
	
	public TipoMonedaParameterReturnGeneral tipomonedaReturnGeneral;
	public TipoMonedaParameterReturnGeneral tipomonedaParameterGeneral;
	
	

	public ParametroContabilidadDefectoLogic parametrocontabilidaddefectoLogic=null;

	public ParametroContabilidadDefectoLogic getParametroContabilidadDefectoLogic() {
		return parametrocontabilidaddefectoLogic;
	}

	public void setParametroContabilidadDefectoLogic(ParametroContabilidadDefectoLogic parametrocontabilidaddefectoLogic) {
		this.parametrocontabilidaddefectoLogic = parametrocontabilidaddefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoMoneda=false;
	public Boolean esParaAccionDesdeFormularioTipoMoneda=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoMonedaSessionBeanAdditional tipomonedaSessionBeanAdditional=null;
	
	public TipoMonedaSessionBeanAdditional getTipoMonedaSessionBeanAdditional() {
		return this.tipomonedaSessionBeanAdditional;
	}
	
	public void setTipoMonedaSessionBeanAdditional(TipoMonedaSessionBeanAdditional tipomonedaSessionBeanAdditional) {
		try {
			this.tipomonedaSessionBeanAdditional=tipomonedaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoMonedaBeanSwingJInternalFrameAdditional tipomonedaBeanSwingJInternalFrameAdditional=null;
	//public class TipoMonedaBeanSwingJInternalFrame
	
	public TipoMonedaBeanSwingJInternalFrameAdditional getTipoMonedaBeanSwingJInternalFrameAdditional() {
		return this.tipomonedaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoMonedaBeanSwingJInternalFrameAdditional(TipoMonedaBeanSwingJInternalFrameAdditional tipomonedaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipomonedaBeanSwingJInternalFrameAdditional=tipomonedaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoMonedaLogic tipomonedaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoMoneda tipomonedaBean;
	public TipoMonedaConstantesFunciones tipomonedaConstantesFunciones;
	//public TipoMonedaParameterReturnGeneral tipomonedaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoMoneda> tipomonedas;	
	//public List<TipoMoneda> tipomonedasEliminados;
	//public List<TipoMoneda> tipomonedasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoMoneda=false;
	public Boolean isVisibilidadCeldaDuplicarTipoMoneda=true;
	public Boolean isVisibilidadCeldaCopiarTipoMoneda=true;
	public Boolean isVisibilidadCeldaVerFormTipoMoneda=true;
	public Boolean isVisibilidadCeldaOrdenTipoMoneda=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoMoneda=false;
	public Boolean isVisibilidadCeldaModificarTipoMoneda=false;
	public Boolean isVisibilidadCeldaActualizarTipoMoneda=false;
	public Boolean isVisibilidadCeldaEliminarTipoMoneda=false;
	public Boolean isVisibilidadCeldaCancelarTipoMoneda=false;
	public Boolean isVisibilidadCeldaGuardarTipoMoneda=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoMoneda=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadBusquedaPorSigla=false;
	public Boolean isVisibilidadBusquedaPorSimbolo=false;
	
	public Long getiIdNuevoTipoMoneda() {
		return this.iIdNuevoTipoMoneda;
	}

	public void setiIdNuevoTipoMoneda(Long iIdNuevoTipoMoneda) {
		this.iIdNuevoTipoMoneda = iIdNuevoTipoMoneda;
	}
	
	public Long getidTipoMonedaActual() {
		return this.idTipoMonedaActual;
	}

	public void setidTipoMonedaActual(Long idTipoMonedaActual) {
		this.idTipoMonedaActual = idTipoMonedaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoMoneda gettipomoneda() {
		return this.tipomoneda;
	}

	public void settipomoneda(TipoMoneda tipomoneda) {
		this.tipomoneda = tipomoneda;
	}
	
	public TipoMoneda gettipomonedaAux() {
		return this.tipomonedaAux;
	}

	public void settipomonedaAux(TipoMoneda tipomonedaAux) {
		this.tipomonedaAux = tipomonedaAux;
	}				
	
	public TipoMoneda gettipomonedaAnterior() {
		return this.tipomonedaAnterior;
	}

	public void settipomonedaAnterior(TipoMoneda tipomonedaAnterior) {
		this.tipomonedaAnterior = tipomonedaAnterior;
	}	
	
	public TipoMoneda gettipomonedaTotales() {
		return this.tipomonedaTotales;
	}

	public void settipomonedaTotales(TipoMoneda tipomonedaTotales) {
		this.tipomonedaTotales = tipomonedaTotales;
	}	
	
	public TipoMoneda gettipomonedaBean() {
		return this.tipomonedaBean;
	}

	public void settipomonedaBean(TipoMoneda tipomonedaBean) {
		this.tipomonedaBean = tipomonedaBean;
	}	
	
	public TipoMonedaParameterReturnGeneral gettipomonedaReturnGeneral() {
		return this.tipomonedaReturnGeneral;
	}

	public void settipomonedaReturnGeneral(TipoMonedaParameterReturnGeneral tipomonedaReturnGeneral) {
		this.tipomonedaReturnGeneral = tipomonedaReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public String siglaBusquedaPorSigla="";

	public String getsiglaBusquedaPorSigla() {
		return this.siglaBusquedaPorSigla;
	}

	public void setsiglaBusquedaPorSigla(String siglaBusquedaPorSigla) {
		this.siglaBusquedaPorSigla = siglaBusquedaPorSigla;
	}

	public String simboloBusquedaPorSimbolo="";

	public String getsimboloBusquedaPorSimbolo() {
		return this.simboloBusquedaPorSimbolo;
	}

	public void setsimboloBusquedaPorSimbolo(String simboloBusquedaPorSimbolo) {
		this.simboloBusquedaPorSimbolo = simboloBusquedaPorSimbolo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoMonedaLogic getTipoMonedaLogic()	{		
		return tipomonedaLogic;
	}

	public void setTipoMonedaLogic(TipoMonedaLogic tipomonedaLogic) {
		this.tipomonedaLogic = tipomonedaLogic;
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
	
	public Boolean getIsEsNuevoTipoMoneda() {
		return isEsNuevoTipoMoneda;
	}

	public void setIsEsNuevoTipoMoneda(Boolean isEsNuevoTipoMoneda) {
		this.isEsNuevoTipoMoneda = isEsNuevoTipoMoneda;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoMoneda() {
		return esParaAccionDesdeFormularioTipoMoneda;
	}
	
	public void setEsParaAccionDesdeFormularioTipoMoneda(Boolean esParaAccionDesdeFormularioTipoMoneda) {
		this.esParaAccionDesdeFormularioTipoMoneda = esParaAccionDesdeFormularioTipoMoneda;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoMoneda() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoMonedaConstantesFunciones.refrescarForeignKeysDescripcionesTipoMoneda(this.tipomonedaLogic.getTipoMonedas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoMonedaConstantesFunciones.refrescarForeignKeysDescripcionesTipoMoneda(this.tipomonedas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipomonedaLogic.setTipoMonedas(this.tipomonedas);
			tipomonedaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoMonedaParameterReturnGeneral getTipoMonedaParameterGeneral() {
		return this.tipomonedaParameterGeneral;
	}
	
	public void setTipoMonedaParameterGeneral(TipoMonedaParameterReturnGeneral tipomonedaParameterGeneral) {
		this.tipomonedaParameterGeneral = tipomonedaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoMoneda() {
		return isPermisoTodoTipoMoneda;
	}

	public void setIsPermisoTodoTipoMoneda(Boolean isPermisoTodoTipoMoneda) {
		this.isPermisoTodoTipoMoneda = isPermisoTodoTipoMoneda;
	}

	public Boolean getIsPermisoNuevoTipoMoneda() {
		return isPermisoNuevoTipoMoneda;
	}

	public void setIsPermisoNuevoTipoMoneda(Boolean isPermisoNuevoTipoMoneda) {
		this.isPermisoNuevoTipoMoneda = isPermisoNuevoTipoMoneda;
	}

	public Boolean getIsPermisoActualizarTipoMoneda() {
		return isPermisoActualizarTipoMoneda;
	}

	public void setIsPermisoActualizarTipoMoneda(Boolean isPermisoActualizarTipoMoneda) {
		this.isPermisoActualizarTipoMoneda = isPermisoActualizarTipoMoneda;
	}

	public Boolean getIsPermisoEliminarTipoMoneda() {
		return isPermisoEliminarTipoMoneda;
	}

	public void setIsPermisoEliminarTipoMoneda(Boolean isPermisoEliminarTipoMoneda) {
		this.isPermisoEliminarTipoMoneda = isPermisoEliminarTipoMoneda;
	}

	public Boolean getIsPermisoGuardarCambiosTipoMoneda() {
		return isPermisoGuardarCambiosTipoMoneda;
	}

	public void setIsPermisoGuardarCambiosTipoMoneda(Boolean isPermisoGuardarCambiosTipoMoneda) {
		this.isPermisoGuardarCambiosTipoMoneda = isPermisoGuardarCambiosTipoMoneda;
	}
	
	public Boolean getIsPermisoConsultaTipoMoneda() {
		return isPermisoConsultaTipoMoneda;
	}

	public void setIsPermisoConsultaTipoMoneda(Boolean isPermisoConsultaTipoMoneda) {
		this.isPermisoConsultaTipoMoneda = isPermisoConsultaTipoMoneda;
	}

	public Boolean getIsPermisoBusquedaTipoMoneda() {
		return isPermisoBusquedaTipoMoneda;
	}

	public void setIsPermisoBusquedaTipoMoneda(Boolean isPermisoBusquedaTipoMoneda) {
		this.isPermisoBusquedaTipoMoneda = isPermisoBusquedaTipoMoneda;
	}

	public Boolean getIsPermisoReporteTipoMoneda() {
		return isPermisoReporteTipoMoneda;
	}

	public void setIsPermisoReporteTipoMoneda(Boolean isPermisoReporteTipoMoneda) {
		this.isPermisoReporteTipoMoneda = isPermisoReporteTipoMoneda;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoMoneda() {
		return isPermisoPaginacionMedioTipoMoneda;
	}

	public void setIsPermisoPaginacionMedioTipoMoneda(Boolean isPermisoPaginacionMedioTipoMoneda) {
		this.isPermisoPaginacionMedioTipoMoneda = isPermisoPaginacionMedioTipoMoneda;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoMoneda() {
		return isPermisoPaginacionTodoTipoMoneda;
	}

	public void setIsPermisoPaginacionTodoTipoMoneda(Boolean isPermisoPaginacionTodoTipoMoneda) {
		this.isPermisoPaginacionTodoTipoMoneda = isPermisoPaginacionTodoTipoMoneda;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoMoneda() {
		return isPermisoPaginacionAltoTipoMoneda;
	}

	public void setIsPermisoPaginacionAltoTipoMoneda(Boolean isPermisoPaginacionAltoTipoMoneda) {
		this.isPermisoPaginacionAltoTipoMoneda = isPermisoPaginacionAltoTipoMoneda;
	}
	
	public Boolean getIsPermisoCopiarTipoMoneda() {
		return isPermisoCopiarTipoMoneda;
	}

	public void setIsPermisoCopiarTipoMoneda(Boolean isPermisoCopiarTipoMoneda) {
		this.isPermisoCopiarTipoMoneda = isPermisoCopiarTipoMoneda;
	}
	
	public Boolean getIsPermisoVerFormTipoMoneda() {
		return isPermisoVerFormTipoMoneda;
	}

	public void setIsPermisoVerFormTipoMoneda(Boolean isPermisoVerFormTipoMoneda) {
		this.isPermisoVerFormTipoMoneda = isPermisoVerFormTipoMoneda;
	}
	
	public Boolean getIsPermisoDuplicarTipoMoneda() {
		return isPermisoDuplicarTipoMoneda;
	}

	public void setIsPermisoDuplicarTipoMoneda(Boolean isPermisoDuplicarTipoMoneda) {
		this.isPermisoDuplicarTipoMoneda = isPermisoDuplicarTipoMoneda;
	}
	
	public Boolean getIsPermisoOrdenTipoMoneda() {
		return isPermisoOrdenTipoMoneda;
	}

	public void setIsPermisoOrdenTipoMoneda(Boolean isPermisoOrdenTipoMoneda) {
		this.isPermisoOrdenTipoMoneda = isPermisoOrdenTipoMoneda;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoMoneda() {
		return isVisibilidadCeldaNuevoTipoMoneda;
	}

	public void setIsVisibilidadCeldaNuevoTipoMoneda(Boolean isVisibilidadCeldaNuevoTipoMoneda) {
		this.isVisibilidadCeldaNuevoTipoMoneda = isVisibilidadCeldaNuevoTipoMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoMoneda() {
		return isVisibilidadCeldaDuplicarTipoMoneda;
	}

	public void setIsVisibilidadCeldaDuplicarTipoMoneda(Boolean isVisibilidadCeldaDuplicarTipoMoneda) {
		this.isVisibilidadCeldaDuplicarTipoMoneda = isVisibilidadCeldaDuplicarTipoMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoMoneda() {
		return isVisibilidadCeldaCopiarTipoMoneda;
	}

	public void setIsVisibilidadCeldaCopiarTipoMoneda(Boolean isVisibilidadCeldaCopiarTipoMoneda) {
		this.isVisibilidadCeldaCopiarTipoMoneda = isVisibilidadCeldaCopiarTipoMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoMoneda() {
		return isVisibilidadCeldaVerFormTipoMoneda;
	}

	public void setIsVisibilidadCeldaVerFormTipoMoneda(Boolean isVisibilidadCeldaVerFormTipoMoneda) {
		this.isVisibilidadCeldaVerFormTipoMoneda = isVisibilidadCeldaVerFormTipoMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoMoneda() {
		return isVisibilidadCeldaOrdenTipoMoneda;
	}

	public void setIsVisibilidadCeldaOrdenTipoMoneda(Boolean isVisibilidadCeldaOrdenTipoMoneda) {
		this.isVisibilidadCeldaOrdenTipoMoneda = isVisibilidadCeldaOrdenTipoMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoMoneda() {
		return isVisibilidadCeldaNuevoRelacionesTipoMoneda;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoMoneda(Boolean isVisibilidadCeldaNuevoRelacionesTipoMoneda) {
		this.isVisibilidadCeldaNuevoRelacionesTipoMoneda = isVisibilidadCeldaNuevoRelacionesTipoMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoMoneda() {
		return isVisibilidadCeldaModificarTipoMoneda;
	}

	public void setIsVisibilidadCeldaModificarTipoMoneda(Boolean isVisibilidadCeldaModificarTipoMoneda) {
		this.isVisibilidadCeldaModificarTipoMoneda = isVisibilidadCeldaModificarTipoMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoMoneda() {
		return isVisibilidadCeldaActualizarTipoMoneda;
	}

	public void setIsVisibilidadCeldaActualizarTipoMoneda(Boolean isVisibilidadCeldaActualizarTipoMoneda) {
		this.isVisibilidadCeldaActualizarTipoMoneda = isVisibilidadCeldaActualizarTipoMoneda;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoMoneda() {
		return isVisibilidadCeldaEliminarTipoMoneda;
	}

	public void setIsVisibilidadCeldaEliminarTipoMoneda(Boolean isVisibilidadCeldaEliminarTipoMoneda) {
		this.isVisibilidadCeldaEliminarTipoMoneda = isVisibilidadCeldaEliminarTipoMoneda;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoMoneda() {
		return isVisibilidadCeldaCancelarTipoMoneda;
	}

	public void setIsVisibilidadCeldaCancelarTipoMoneda(Boolean isVisibilidadCeldaCancelarTipoMoneda) {
		this.isVisibilidadCeldaCancelarTipoMoneda = isVisibilidadCeldaCancelarTipoMoneda;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoMoneda() {
		return isVisibilidadCeldaGuardarTipoMoneda;
	}

	public void setIsVisibilidadCeldaGuardarTipoMoneda(Boolean isVisibilidadCeldaGuardarTipoMoneda) {
		this.isVisibilidadCeldaGuardarTipoMoneda = isVisibilidadCeldaGuardarTipoMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoMoneda() {
		return isVisibilidadCeldaGuardarCambiosTipoMoneda;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoMoneda(Boolean isVisibilidadCeldaGuardarCambiosTipoMoneda) {
		this.isVisibilidadCeldaGuardarCambiosTipoMoneda = isVisibilidadCeldaGuardarCambiosTipoMoneda;
	}
		
	public TipoMonedaSessionBean gettipomonedaSessionBean() {
		return this.tipomonedaSessionBean;
	}
	
	public void settipomonedaSessionBean(TipoMonedaSessionBean tipomonedaSessionBean) {
		this.tipomonedaSessionBean=tipomonedaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadBusquedaPorSigla() {
		return this.isVisibilidadBusquedaPorSigla;
	}

	public void setisVisibilidadBusquedaPorSigla(Boolean isVisibilidadBusquedaPorSigla) {
		this.isVisibilidadBusquedaPorSigla=isVisibilidadBusquedaPorSigla;
	}

	public Boolean getisVisibilidadBusquedaPorSimbolo() {
		return this.isVisibilidadBusquedaPorSimbolo;
	}

	public void setisVisibilidadBusquedaPorSimbolo(Boolean isVisibilidadBusquedaPorSimbolo) {
		this.isVisibilidadBusquedaPorSimbolo=isVisibilidadBusquedaPorSimbolo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(TipoMoneda tipomoneda)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoMoneda tipomoneda,TipoMoneda tipomonedaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoMoneda(tipomoneda);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipomonedaAux.setId(tipomoneda.getId());
		tipomonedaAux.setVersionRow(tipomoneda.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoMoneda();
		
			int intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoMonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoMoneda(this.tipomoneda,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipomonedaValidator.getInvalidValues(this.tipomoneda);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipomonedaLogic.setDatosCliente(datosCliente);
			tipomonedaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipomonedaAux=new  TipoMoneda();
				
				tipomonedaAux.setIsNew(true);
				tipomonedaAux.setIsChanged(true);
				
				tipomonedaAux.setTipoMonedaOriginal(this.tipomoneda);
				
				tipomonedaAux.setId(this.tipomoneda.getId());	
				tipomonedaAux.setVersionRow(this.tipomoneda.getVersionRow());	
				tipomonedaAux.setnombre(this.tipomoneda.getnombre());	
				tipomonedaAux.setsigla(this.tipomoneda.getsigla());	
				tipomonedaAux.setsimbolo(this.tipomoneda.getsimbolo());	
				tipomonedaAux.setesta_activo(this.tipomoneda.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomonedaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomonedaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipomonedaAux,tipomonedaLogic.getTipoMonedas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomonedaAux,tipomonedas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipomonedaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomonedaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomonedaLogic.saveTipoMonedas();//WithConnection
						//tipomonedaLogic.getSetVersionRowTipoMonedas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomoneda,tipomonedaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomonedaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectos.addAll(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomonedaLogic.saveTipoMonedaRelaciones(tipomonedaAux,this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());//WithConnection
								//tipomonedaLogic.getSetVersionRowTipoMonedas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomoneda,tipomonedaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectos= new ArrayList<ParametroContabilidadDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomonedaAux.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomonedaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomonedaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomonedaAux,tipomonedaLogic.getTipoMonedas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomonedaAux,tipomonedas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomoneda,tipomonedaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipomonedaAux=new  TipoMoneda();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipomonedaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipomonedaSessionBean.getEsGuardarRelacionado() && this.tipomoneda.getId()>=0)) {
						
					tipomonedaAux.setIsNew(false);
				}
				
				tipomonedaAux.setIsDeleted(false);
			
				tipomonedaAux.setId(this.tipomoneda.getId());	
				tipomonedaAux.setVersionRow(this.tipomoneda.getVersionRow());	
				tipomonedaAux.setnombre(this.tipomoneda.getnombre());	
				tipomonedaAux.setsigla(this.tipomoneda.getsigla());	
				tipomonedaAux.setsimbolo(this.tipomoneda.getsimbolo());	
				tipomonedaAux.setesta_activo(this.tipomoneda.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomonedaAux,tipomonedaLogic.getTipoMonedas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomonedaAux,tipomonedas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipomonedaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomonedaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomonedaLogic.saveTipoMonedas();//WithConnection
						//tipomonedaLogic.getSetVersionRowTipoMonedas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomoneda,tipomonedaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomonedaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectos.addAll(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomonedaLogic.saveTipoMonedaRelaciones(tipomonedaAux,this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());//WithConnection
								//tipomonedaLogic.getSetVersionRowTipoMonedas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomoneda,tipomonedaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectos= new ArrayList<ParametroContabilidadDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomonedaAux.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomonedaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomonedaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomonedaAux,tipomonedaLogic.getTipoMonedas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomonedaAux,tipomonedas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomoneda,tipomonedaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipomonedaAux=new  TipoMoneda();
				
				tipomonedaAux.setIsNew(false);
				tipomonedaAux.setIsChanged(false);
				
				tipomonedaAux.setIsDeleted(true);
				
				tipomonedaAux.setId(this.tipomoneda.getId());	
				tipomonedaAux.setVersionRow(this.tipomoneda.getVersionRow());	
				tipomonedaAux.setnombre(this.tipomoneda.getnombre());	
				tipomonedaAux.setsigla(this.tipomoneda.getsigla());	
				tipomonedaAux.setsimbolo(this.tipomoneda.getsimbolo());	
				tipomonedaAux.setesta_activo(this.tipomoneda.getesta_activo());	
				
				if(this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipomonedaAux.getId()>=0) {	
						this.tipomonedasEliminados.add(tipomonedaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipomonedaAux,tipomonedaLogic.getTipoMonedas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomonedaAux,tipomonedas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipomonedaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomonedaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomonedaLogic.saveTipoMonedas();//WithConnection
						//tipomonedaLogic.getSetVersionRowTipoMonedas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomonedaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectos.addAll(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomonedaLogic.saveTipoMonedaRelaciones(tipomonedaAux,this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());//WithConnection
								//tipomonedaLogic.getSetVersionRowTipoMonedas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectos= new ArrayList<ParametroContabilidadDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomonedaAux.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipomonedaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipomonedaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipomonedaAux,tipomonedaLogic.getTipoMonedas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipomonedaAux,tipomonedas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.getTipoMonedas().addAll(this.tipomonedasEliminados);
					
					tipomonedaLogic.saveTipoMonedas();//WithConnection
					//tipomonedaLogic.getSetVersionRowTipoMonedas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipomonedasEliminados= new ArrayList<TipoMoneda>();		
			}
			
			if(this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Moneda GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Moneda",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipomoneda=tipomonedaAux;
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
      		//this.finishProcessTipoMoneda();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoMoneda tipomonedaLocal) throws Exception {
		
		if(this.tipomonedaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipomonedaLocal.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
			
			} else {
			
				tipomonedaLocal.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoMoneda tipomonedaLocal) throws Exception {	
		if(this.tipomonedaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoMonedaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipomonedaValidator.getInvalidValues(this.tipomoneda);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoMoneda tipomoneda,List<TipoMoneda> tipomonedas) throws Exception {
		try	{		
			TipoMonedaConstantesFunciones.actualizarLista(tipomoneda,tipomonedas,this.tipomonedaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoMoneda tipomoneda,List<TipoMoneda> tipomonedas) throws Exception {
		try	{			
			TipoMonedaConstantesFunciones.actualizarSelectedLista(tipomoneda,tipomonedas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoMoneda> tipomonedasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipomonedasLocal=this.tipomonedaLogic.getTipoMonedas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipomonedasLocal=this.tipomonedas;
			}
			//ARCHITECTURE
		
			for(TipoMoneda tipomonedaLocal:tipomonedasLocal) {
				if(this.permiteMantenimiento(tipomonedaLocal) && tipomonedaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoMonedaConstantesFunciones.getTipoMonedaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoMonedaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoneda.jLabelnombreTipoMoneda,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMonedaConstantesFunciones.SIGLA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoneda.jLabelsiglaTipoMoneda,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMonedaConstantesFunciones.SIMBOLO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoneda.jLabelsimboloTipoMoneda,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMonedaConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoneda.jLabelesta_activoTipoMoneda,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMoneda.jLabelnombreTipoMoneda,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMoneda.jLabelsiglaTipoMoneda,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMoneda.jLabelsimboloTipoMoneda,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMoneda.jLabelesta_activoTipoMoneda,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ParametroContabilidadDefecto")) {
			if(this.tipomoneda==null) {
				this.tipomoneda= new TipoMoneda();
			}

			if(this.tipomonedaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoMoneda
				this.setVariablesFormularioToObjetoActualTipoMoneda(this.tipomoneda,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);

				this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.getparametrocontabilidaddefecto().setTipoMoneda(this.tipomoneda);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoMoneda--;	
		
		
		this.tipomonedaAux=new TipoMoneda();
		
		this.tipomonedaAux.setId(this.iIdNuevoTipoMoneda);
		this.tipomonedaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomonedaLogic.getTipoMonedas().add(this.tipomonedaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipomonedas.add(this.tipomonedaAux);
		}
		//ARCHITECTURE
		
		this.tipomoneda=this.tipomonedaAux;
		
		if(TipoMonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoMoneda(this.tipomoneda);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMoneda(this.tipomoneda);
		}
				
		//this.setDefaultControlesTipoMoneda();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoMoneda();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoMoneda();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMoneda();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMoneda(this.tipomonedaBean,this.tipomoneda,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoMonedaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipomonedaSessionBean.getConGuardarRelaciones()) {
			classes=TipoMonedaConstantesFunciones.getClassesRelationshipsOfTipoMoneda(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipomonedaReturnGeneral=tipomonedaLogic.procesarEventosTipoMonedasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomonedaLogic.getTipoMonedas(),this.tipomoneda,this.tipomonedaParameterGeneral,this.isEsNuevoTipoMoneda,classes);//this.tipomonedaLogic.getTipoMoneda()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoMoneda(this.tipomonedaReturnGeneral,this.tipomonedaBean,false);
		
		if(this.tipomonedaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMoneda(this.tipomonedaReturnGeneral.getTipoMoneda());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoMoneda(this.tipomonedaReturnGeneral.getTipoMoneda());
		}
		
		if(this.tipomonedaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoMoneda(this.tipomonedaReturnGeneral.getTipoMoneda(),classes);//this.tipomonedaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoMoneda(this.tipomoneda,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoMoneda();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoMoneda();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMonedaBeanSwingJInternalFrameAdditional.RecargarFormTipoMoneda(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoMoneda(false);
						
			if(tipomonedaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() && ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroContabilidadDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoMonedaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMoneda();
			}
			
			this.actualizarVisualTableDatosTipoMoneda();
			
			this.jTableDatosTipoMoneda.setRowSelectionInterval(this.getIndiceNuevoTipoMoneda(), this.getIndiceNuevoTipoMoneda());
			
			this.seleccionarFilaTablaTipoMonedaActual();
						
			this.actualizarEstadoCeldasBotonesTipoMoneda("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoMoneda(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoMoneda.jTextFieldnombreTipoMoneda.setEnabled(isHabilitar && this.tipomonedaConstantesFunciones.activarnombreTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsiglaTipoMoneda.setEnabled(isHabilitar && this.tipomonedaConstantesFunciones.activarsiglaTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsimboloTipoMoneda.setEnabled(isHabilitar && this.tipomonedaConstantesFunciones.activarsimboloTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxesta_activoTipoMoneda.setEnabled(isHabilitar && this.tipomonedaConstantesFunciones.activaresta_activoTipoMoneda);	
		
	};
	
	public void setDefaultControlesTipoMoneda() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoMoneda(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipomonedaSessionBean.setConGuardarRelaciones(true);			
			this.tipomonedaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoMoneda.jTabbedPaneRelacionesTipoMoneda.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipomonedaSessionBean.setConGuardarRelaciones(false);			
			this.tipomonedaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoMoneda.jTabbedPaneRelacionesTipoMoneda.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoMoneda() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMoneda tipomonedaAux:this.tipomonedaLogic.getTipoMonedas()) {
				if(tipomonedaAux.getId().equals(this.iIdNuevoTipoMoneda)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMoneda tipomonedaAux:this.tipomonedas) {
				if(tipomonedaAux.getId().equals(this.iIdNuevoTipoMoneda)) {
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
	
	public int getIndiceActualTipoMoneda(TipoMoneda tipomoneda,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMoneda tipomonedaAux:this.tipomonedaLogic.getTipoMonedas()) {
				if(tipomonedaAux.getId().equals(tipomoneda.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMoneda tipomonedaAux:this.tipomonedas) {
				if(tipomonedaAux.getId().equals(tipomoneda.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoMoneda(TipoMoneda tipomonedaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMoneda tipomonedaAux:this.tipomonedaLogic.getTipoMonedas()) {
				if(tipomonedaAux.getTipoMonedaOriginal().getId().equals(tipomonedaOriginal.getId())) {
					existe=true;
					tipomonedaOriginal.setId(tipomonedaAux.getId());
					tipomonedaOriginal.setVersionRow(tipomonedaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMoneda tipomonedaAux:this.tipomonedas) {
				if(tipomonedaAux.getTipoMonedaOriginal().getId().equals(tipomonedaOriginal.getId())) {
					existe=true;
					tipomonedaOriginal.setId(tipomonedaAux.getId());
					tipomonedaOriginal.setVersionRow(tipomonedaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoMoneda(Boolean esParaCancelar) throws Exception {
		tipomonedasAux=new ArrayList<TipoMoneda>();
		tipomonedaAux=new TipoMoneda();
		
		if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMoneda tipomonedaAux:this.tipomonedaLogic.getTipoMonedas()) {
					if(tipomonedaAux.getId()<0) {
						tipomonedasAux.add(tipomonedaAux);
					}		
				}
				this.iIdNuevoTipoMoneda=0L;
				this.tipomonedaLogic.getTipoMonedas().removeAll(tipomonedasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMoneda tipomonedaAux:this.tipomonedas) {
					if(tipomonedaAux.getId()<0) {
						tipomonedasAux.add(tipomonedaAux);
					}		
				}
				this.iIdNuevoTipoMoneda=0L;
				this.tipomonedas.removeAll(tipomonedasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoMoneda 
					&& this.tipomonedaLogic.getTipoMonedas().size()>0
					) {
					tipomonedaAux=this.tipomonedaLogic.getTipoMonedas().get(this.tipomonedaLogic.getTipoMonedas().size() - 1);
				
					if(tipomonedaAux.getId()<0) {
						this.tipomonedaLogic.getTipoMonedas().remove(tipomonedaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoMoneda && this.tipomonedas.size()>0) {
					tipomonedaAux=this.tipomonedas.get(this.tipomonedas.size() - 1);
				
					if(tipomonedaAux.getId()<0) {
						this.tipomonedas.remove(tipomonedaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoMoneda(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipomoneda.getId()<0) {
				this.tipomonedaLogic.getTipoMonedas().remove(this.tipomoneda);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipomoneda.getId()<0) {
				this.tipomonedas.remove(this.tipomoneda);
			}
		}			
	}
	
	public void setEstadosInicialesTipoMoneda(List<TipoMoneda> tipomonedasAux) throws Exception {
		TipoMonedaConstantesFunciones.setEstadosInicialesTipoMoneda(tipomonedasAux);
	}
	
	public void setEstadosInicialesTipoMoneda(TipoMoneda tipomonedaAux) throws Exception {
		TipoMonedaConstantesFunciones.setEstadosInicialesTipoMoneda(tipomonedaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoMonedaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoMoneda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoMonedaActual()) {
				if(!this.isEsNuevoTipoMoneda) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoMoneda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoMoneda=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoMonedaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Moneda ?", "MANTENIMIENTO DE Tipo Moneda", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoMoneda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoMoneda tipomoneda) throws Exception {
		TipoMonedaConstantesFunciones.seleccionarAsignar(this.tipomoneda,tipomoneda);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoMoneda=this.isPermisoActualizarOriginalTipoMoneda;
			
			
			this.seleccionarAsignar(tipomoneda);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMonedaConstantesFunciones.quitarEspaciosTipoMoneda(this.tipomoneda,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoMoneda("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipomonedaSessionBean.setsFuncionBusquedaRapida(this.tipomonedaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoMoneda) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoMoneda(esParaCancelar);				
				this.cancelarNuevoTipoMoneda(esParaCancelar);								
			}
			
			this.tipomoneda=new TipoMoneda();
			
			this.inicializarTipoMoneda();
			
			this.actualizarEstadoCeldasBotonesTipoMoneda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoMoneda() throws Exception {
		try {
			TipoMonedaConstantesFunciones.inicializarTipoMoneda(this.tipomoneda);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipomonedaLogic.getTipoMonedas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoMonedas(String sAccionBusqueda,List<TipoMoneda> tipomonedasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoMoneda"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoMonedaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoMonedaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoMoneda"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Monedas");		
		parameters.put("busquedapor", TipoMonedaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ParametroContabilidadDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoMonedaLogic tipomonedaLogicAuxiliar=new TipoMonedaLogic();
					tipomonedaLogicAuxiliar.setDatosCliente(tipomonedaLogic.getDatosCliente());				
					tipomonedaLogicAuxiliar.setTipoMonedas(tipomonedasParaReportes);
					
					tipomonedaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoMonedaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipomonedasParaReportes=tipomonedaLogicAuxiliar.getTipoMonedas();
					
					//tipomonedaLogic.getNewConnexionToDeep();
					
					//for (TipoMoneda tipomoneda:tipomonedasParaReportes) {
					//	tipomonedaLogic.deepLoad(tipomoneda, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipomonedaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipomonedaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileParametroContabilidadDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroContabilidadDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocontabilidaddefecto", reportFileParametroContabilidadDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoMoneda=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoMonedaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoMonedaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoMoneda=new JRBeanArrayDataSource(TipoMonedaJInternalFrame.TraerTipoMonedaBeans(tipomonedasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoMoneda);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoMonedaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoMonedaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoMonedaBean.TraerTipoMonedaBeans(tipomonedasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoMonedas(sAccionBusqueda,sTipoArchivoReporte,tipomonedasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoMonedas(sAccionBusqueda,sTipoArchivoReporte,tipomonedasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoMonedaActionPerformed(null);
					//this.generarExcelReporteTipoMonedas(sAccionBusqueda,sTipoArchivoReporte,tipomonedasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoMonedas(sAccionBusqueda,sTipoArchivoReporte,tipomonedasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoMonedas(sAccionBusqueda,sTipoArchivoReporte,tipomonedasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoMonedas(sAccionBusqueda,sTipoArchivoReporte,tipomonedasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoMonedas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMoneda> tipomonedasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomoneda";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMonedas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMoneda("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoMoneda tipomoneda : tipomonedasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoMonedaConstantesFunciones.generarExcelReporteDataTipoMoneda("NORMAL",row,workbook,tipomoneda,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Moneda",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoMoneda(String sTipo,Row row,Workbook workbook) {
		
		TipoMonedaConstantesFunciones.generarExcelReporteHeaderTipoMoneda(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoMonedas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMoneda> tipomonedasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomoneda_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMonedas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoMoneda tipomoneda : tipomonedasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoMonedaConstantesFunciones.getTipoMonedaDescripcion(tipomoneda));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMonedaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomoneda.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMonedaConstantesFunciones.LABEL_SIGLA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_SIGLA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomoneda.getsigla());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMonedaConstantesFunciones.LABEL_SIMBOLO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_SIMBOLO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomoneda.getsimbolo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tipomoneda.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Moneda",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoMonedas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMoneda> tipomonedasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoMoneda> tipomonedasRespaldo=null;
		
		classes=TipoMonedaConstantesFunciones.getClassesRelationshipsOfTipoMoneda(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipomonedaLogic.setDatosCliente(this.datosCliente);
		this.tipomonedaLogic.setDatosDeep(this.datosDeep);
		this.tipomonedaLogic.setIsConDeep(true);
		
		tipomonedasRespaldo=this.tipomonedaLogic.getTipoMonedas();
		
		this.tipomonedaLogic.setTipoMonedas(tipomonedasParaReportes);	
		this.tipomonedaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipomonedasParaReportes=this.tipomonedaLogic.getTipoMonedas();
		this.tipomonedaLogic.setTipoMonedas(tipomonedasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomoneda_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMonedas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMoneda("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoMoneda tipomoneda : tipomonedasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoMoneda("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoMonedaConstantesFunciones.generarExcelReporteDataTipoMoneda("NORMAL",row,workbook,tipomoneda,cellStyleDataAux);
		
			
			


				//ParametroContabilidadDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipomoneda.getParametroContabilidadDefectos()!=null && tipomoneda.getParametroContabilidadDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroContabilidadDefectoConstantesFunciones.generarExcelReporteHeaderParametroContabilidadDefecto("RELACIONADO",row,workbook);
				}

				if(tipomoneda.getParametroContabilidadDefectos()!=null) {
					i2=0;
					for(ParametroContabilidadDefecto parametrocontabilidaddefecto : tipomoneda.getParametroContabilidadDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroContabilidadDefectoConstantesFunciones.generarExcelReporteDataParametroContabilidadDefecto("RELACIONADO",row,workbook,parametrocontabilidaddefecto,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoMonedaConstantesFunciones.getTipoMonedaDescripcion(tipomoneda));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Moneda",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMoneda.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMoneda.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMoneda.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMoneda.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoMoneda() throws Exception {		
		this.startProcessTipoMoneda(true);
	}
	
	public void startProcessTipoMoneda(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoMoneda ,this.jPanelParametrosReportesTipoMoneda, this.jScrollPanelDatosTipoMoneda,this.jPanelPaginacionTipoMoneda, this.jScrollPanelDatosEdicionTipoMoneda, this.jPanelAccionesTipoMoneda,this.jPanelAccionesFormularioTipoMoneda,this.jmenuBarTipoMoneda,this.jmenuBarDetalleTipoMoneda,this.jTtoolBarTipoMoneda,this.jTtoolBarDetalleTipoMoneda);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMoneda=this.jTabbedPaneBusquedasTipoMoneda; 
		
		final JPanel jPanelParametrosReportesTipoMoneda=this.jPanelParametrosReportesTipoMoneda;
		//final JScrollPane jScrollPanelDatosTipoMoneda=this.jScrollPanelDatosTipoMoneda;
		final JTable jTableDatosTipoMoneda=this.jTableDatosTipoMoneda;		
		final JPanel jPanelPaginacionTipoMoneda=this.jPanelPaginacionTipoMoneda;
		//final JScrollPane jScrollPanelDatosEdicionTipoMoneda=this.jScrollPanelDatosEdicionTipoMoneda;
		final JPanel jPanelAccionesTipoMoneda=this.jPanelAccionesTipoMoneda;
		
		JPanel jPanelCamposAuxiliarTipoMoneda=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoMoneda=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
			jPanelCamposAuxiliarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jPanelCamposTipoMoneda;
			jPanelAccionesFormularioAuxiliarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jPanelAccionesFormularioTipoMoneda;
		}
		
		final JPanel jPanelCamposTipoMoneda=jPanelCamposAuxiliarTipoMoneda;
		final JPanel jPanelAccionesFormularioTipoMoneda=jPanelAccionesFormularioAuxiliarTipoMoneda;
		
		
		final JMenuBar jmenuBarTipoMoneda=this.jmenuBarTipoMoneda;
		final JToolBar jTtoolBarTipoMoneda=this.jTtoolBarTipoMoneda;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoMoneda=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMoneda=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
			jmenuBarDetalleAuxiliarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jmenuBarDetalleTipoMoneda;
			jTtoolBarDetalleAuxiliarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jTtoolBarDetalleTipoMoneda;
		}
		
		final JMenuBar jmenuBarDetalleTipoMoneda=jmenuBarDetalleAuxiliarTipoMoneda;
		final JToolBar jTtoolBarDetalleTipoMoneda=jTtoolBarDetalleAuxiliarTipoMoneda;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMoneda;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMoneda;
			processRunnable.jTableDatos=jTableDatosTipoMoneda;
			processRunnable.jPanelCampos=jPanelCamposTipoMoneda;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMoneda;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMoneda;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMoneda;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMoneda;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMoneda;
			processRunnable.jTtoolBar=jTtoolBarTipoMoneda;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMoneda;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMoneda ,jPanelParametrosReportesTipoMoneda,jTableDatosTipoMoneda, /*jScrollPanelDatosTipoMoneda,*/jPanelCamposTipoMoneda,jPanelPaginacionTipoMoneda, /*jScrollPanelDatosEdicionTipoMoneda,*/ jPanelAccionesTipoMoneda,jPanelAccionesFormularioTipoMoneda,jmenuBarTipoMoneda,jmenuBarDetalleTipoMoneda,jTtoolBarTipoMoneda,jTtoolBarDetalleTipoMoneda);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMoneda ,jPanelParametrosReportesTipoMoneda, jScrollPanelDatosTipoMoneda,jPanelPaginacionTipoMoneda, jScrollPanelDatosEdicionTipoMoneda, jPanelAccionesTipoMoneda,jPanelAccionesFormularioTipoMoneda,jmenuBarTipoMoneda,jmenuBarDetalleTipoMoneda,jTtoolBarTipoMoneda,jTtoolBarDetalleTipoMoneda);
						
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
	
	public void finishProcessTipoMoneda() {// throws Exception 
		this.finishProcessTipoMoneda(true);
	}
	
	public void finishProcessTipoMoneda(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoMoneda ,this.jPanelParametrosReportesTipoMoneda, this.jScrollPanelDatosTipoMoneda,this.jPanelPaginacionTipoMoneda, this.jScrollPanelDatosEdicionTipoMoneda, this.jPanelAccionesTipoMoneda,this.jPanelAccionesFormularioTipoMoneda,this.jmenuBarTipoMoneda,this.jmenuBarDetalleTipoMoneda,this.jTtoolBarTipoMoneda,this.jTtoolBarDetalleTipoMoneda);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMoneda=this.jTabbedPaneBusquedasTipoMoneda; 
		
		final JPanel jPanelParametrosReportesTipoMoneda=this.jPanelParametrosReportesTipoMoneda;
		//final JScrollPane jScrollPanelDatosTipoMoneda=this.jScrollPanelDatosTipoMoneda;
		final JTable jTableDatosTipoMoneda=this.jTableDatosTipoMoneda;		
		final JPanel jPanelPaginacionTipoMoneda=this.jPanelPaginacionTipoMoneda;
		//final JScrollPane jScrollPanelDatosEdicionTipoMoneda=this.jScrollPanelDatosEdicionTipoMoneda;
		final JPanel jPanelAccionesTipoMoneda=this.jPanelAccionesTipoMoneda;
		
		JPanel jPanelCamposAuxiliarTipoMoneda=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoMoneda=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
			jPanelCamposAuxiliarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jPanelCamposTipoMoneda;
			jPanelAccionesFormularioAuxiliarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jPanelAccionesFormularioTipoMoneda;
		}
		
		final JPanel jPanelCamposTipoMoneda=jPanelCamposAuxiliarTipoMoneda;
		final JPanel jPanelAccionesFormularioTipoMoneda=jPanelAccionesFormularioAuxiliarTipoMoneda;
		
		
		final JMenuBar jmenuBarTipoMoneda=this.jmenuBarTipoMoneda;		
		final JToolBar jTtoolBarTipoMoneda=this.jTtoolBarTipoMoneda;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoMoneda=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMoneda=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
			jmenuBarDetalleAuxiliarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jmenuBarDetalleTipoMoneda;
			jTtoolBarDetalleAuxiliarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jTtoolBarDetalleTipoMoneda;		
		}
		
		final JMenuBar jmenuBarDetalleTipoMoneda=jmenuBarDetalleAuxiliarTipoMoneda;
		final JToolBar jTtoolBarDetalleTipoMoneda=jTtoolBarDetalleAuxiliarTipoMoneda;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMoneda;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMoneda;
			processRunnable.jTableDatos=jTableDatosTipoMoneda;
			processRunnable.jPanelCampos=jPanelCamposTipoMoneda;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMoneda;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMoneda;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMoneda;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMoneda;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMoneda;
			processRunnable.jTtoolBar=jTtoolBarTipoMoneda;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMoneda;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoMoneda ,jPanelParametrosReportesTipoMoneda, jTableDatosTipoMoneda,/*jScrollPanelDatosTipoMoneda,*/jPanelCamposTipoMoneda,jPanelPaginacionTipoMoneda, /*jScrollPanelDatosEdicionTipoMoneda,*/ jPanelAccionesTipoMoneda,jPanelAccionesFormularioTipoMoneda,jmenuBarTipoMoneda,jmenuBarDetalleTipoMoneda,jTtoolBarTipoMoneda,jTtoolBarDetalleTipoMoneda));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoMoneda(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoMoneda(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoMoneda(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoMoneda(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoMoneda,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoMoneda,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoMoneda(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoMoneda,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoMoneda,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipomonedaConstantesFunciones.getsFinalQueryTipoMoneda();
		String  finalQueryPaginacionTodos=this.tipomonedaConstantesFunciones.getsFinalQueryTipoMoneda();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoMonedaConstantesFunciones.getArrayColumnasGlobalesNoTipoMoneda(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoMonedaConstantesFunciones.getArrayColumnasGlobalesTipoMoneda(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoMonedaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipomonedasEliminados= new ArrayList<TipoMoneda>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoMoneda();
		
				///*TipoMonedaSessionBean*/this.tipomonedaSessionBean=new TipoMonedaSessionBean();
			
			if(this.tipomonedaSessionBean==null) {
				this.tipomonedaSessionBean=new TipoMonedaSessionBean();
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
					this.iNumeroPaginacion=TipoMonedaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoMonedaConstantesFunciones.getClassesForeignKeysOfTipoMoneda(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipomoneda."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipomonedasAux= new ArrayList<TipoMoneda>();
			
				
			tipomonedaLogic.setDatosCliente(this.datosCliente);
			tipomonedaLogic.setDatosDeep(this.datosDeep);
			tipomonedaLogic.setIsConDeep(true);
			
			
			tipomonedaLogic.getTipoMonedaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipomonedaLogic.getTodosTipoMonedas(finalQueryGlobal,pagination);
					
					//tipomonedaLogic.getTodosTipoMonedasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipomonedaLogic.getTipoMonedas()==null|| tipomonedaLogic.getTipoMonedas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomonedasAux= new ArrayList<TipoMoneda>();
							tipomonedasAux.addAll(tipomonedaLogic.getTipoMonedas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomonedasAux= new ArrayList<TipoMoneda>();
							tipomonedasAux.addAll(tipomonedas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomonedaLogic.getTodosTipoMonedas(finalQueryGlobal+"",this.pagination);												
							
							//tipomonedaLogic.getTodosTipoMonedasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoMonedas("Todos",tipomonedaLogic.getTipoMonedas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomonedaLogic.setTipoMonedas(new ArrayList<TipoMoneda>());					
							tipomonedaLogic.getTipoMonedas().addAll(tipomonedasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomonedas=new ArrayList<TipoMoneda>();
							tipomonedas.addAll(tipomonedasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoMoneda=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoMoneda=this.idActual;
				
				} else if(this.idTipoMonedaActual!=null && this.idTipoMonedaActual!=0L) {
					idTipoMoneda=idTipoMonedaActual;
				}
				
					
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndicePorId(idTipoMoneda);
				
				this.tipomonedas=new ArrayList<TipoMoneda>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipomonedaLogic.getEntity(idTipoMoneda);
					
					//tipomonedaLogic.getEntityWithConnection(idTipoMoneda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomonedaLogic.setTipoMonedas(new ArrayList<TipoMoneda>());
					tipomonedaLogic.getTipoMonedas().add(tipomonedaLogic.getTipoMoneda());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomonedas=new ArrayList<TipoMoneda>();
					this.tipomonedas.add(tipomoneda);
				}
				
				if(tipomonedaLogic.getTipoMoneda()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomonedaLogic.getTipoMonedasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomonedaLogic.getTipoMonedas()==null||tipomonedaLogic.getTipoMonedas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomonedas==null|| tipomonedas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomonedasAux=new ArrayList<TipoMoneda>();
						tipomonedasAux.addAll(tipomonedaLogic.getTipoMonedas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomonedasAux=new ArrayList<TipoMoneda>();
							tipomonedasAux.addAll(tipomonedas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomonedaLogic.getTipoMonedasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMonedas("BusquedaPorNombre",tipomonedaLogic.getTipoMonedas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMonedas("BusquedaPorNombre",tipomonedas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomonedaLogic.setTipoMonedas(new ArrayList<TipoMoneda>());
						tipomonedaLogic.getTipoMonedas().addAll(tipomonedasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomonedas=new ArrayList<TipoMoneda>();
							tipomonedas.addAll(tipomonedasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorSigla")) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorSigla(siglaBusquedaPorSigla);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomonedaLogic.getTipoMonedasBusquedaPorSigla(finalQueryGlobal,pagination,siglaBusquedaPorSigla);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorSigla(siglaBusquedaPorSigla);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorSigla(siglaBusquedaPorSigla);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomonedaLogic.getTipoMonedas()==null||tipomonedaLogic.getTipoMonedas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomonedas==null|| tipomonedas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomonedasAux=new ArrayList<TipoMoneda>();
						tipomonedasAux.addAll(tipomonedaLogic.getTipoMonedas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomonedasAux=new ArrayList<TipoMoneda>();
							tipomonedasAux.addAll(tipomonedas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomonedaLogic.getTipoMonedasBusquedaPorSigla(finalQueryGlobal,pagination,siglaBusquedaPorSigla);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorSigla(siglaBusquedaPorSigla);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorSigla(siglaBusquedaPorSigla);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMonedas("BusquedaPorSigla",tipomonedaLogic.getTipoMonedas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMonedas("BusquedaPorSigla",tipomonedas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomonedaLogic.setTipoMonedas(new ArrayList<TipoMoneda>());
						tipomonedaLogic.getTipoMonedas().addAll(tipomonedasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomonedas=new ArrayList<TipoMoneda>();
							tipomonedas.addAll(tipomonedasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorSimbolo")) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorSimbolo(simboloBusquedaPorSimbolo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomonedaLogic.getTipoMonedasBusquedaPorSimbolo(finalQueryGlobal,pagination,simboloBusquedaPorSimbolo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorSimbolo(simboloBusquedaPorSimbolo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorSimbolo(simboloBusquedaPorSimbolo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomonedaLogic.getTipoMonedas()==null||tipomonedaLogic.getTipoMonedas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomonedas==null|| tipomonedas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomonedasAux=new ArrayList<TipoMoneda>();
						tipomonedasAux.addAll(tipomonedaLogic.getTipoMonedas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomonedasAux=new ArrayList<TipoMoneda>();
							tipomonedasAux.addAll(tipomonedas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomonedaLogic.getTipoMonedasBusquedaPorSimbolo(finalQueryGlobal,pagination,simboloBusquedaPorSimbolo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorSimbolo(simboloBusquedaPorSimbolo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMonedaConstantesFunciones.getDetalleIndiceBusquedaPorSimbolo(simboloBusquedaPorSimbolo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMonedas("BusquedaPorSimbolo",tipomonedaLogic.getTipoMonedas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMonedas("BusquedaPorSimbolo",tipomonedas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomonedaLogic.setTipoMonedas(new ArrayList<TipoMoneda>());
						tipomonedaLogic.getTipoMonedas().addAll(tipomonedasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomonedas=new ArrayList<TipoMoneda>();
							tipomonedas.addAll(tipomonedasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoMoneda();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoMoneda();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomonedaLogic.getTipoMonedas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomonedas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomonedaLogic.getTipoMonedas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomonedas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoMoneda tipomoneda) {
		Boolean permite=true;
		
		if(this.tipomoneda.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoMonedaConstantesFunciones.getOrderByListaTipoMoneda();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoMonedaConstantesFunciones.getOrderByListaTipoMoneda();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMoneda tipomoneda:tipomonedaLogic.getTipoMonedas()) {
				if(tipomoneda.getsType().equals(Constantes2.S_TOTALES)) {
					tipomonedaTotales=tipomoneda;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMoneda tipomoneda:this.tipomonedas) {
				if(tipomoneda.getsType().equals(Constantes2.S_TOTALES)) {
					tipomonedaTotales=tipomoneda;
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
			this.tipomonedaAux=new TipoMoneda();
			this.tipomonedaAux.setsType(Constantes2.S_TOTALES);
			this.tipomonedaAux.setIsNew(false);
			this.tipomonedaAux.setIsChanged(false);
			this.tipomonedaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoMonedaConstantesFunciones.TotalizarValoresFilaTipoMoneda(this.tipomonedaLogic.getTipoMonedas(),this.tipomonedaAux);
				
				this.tipomonedaLogic.getTipoMonedas().add(this.tipomonedaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoMonedaConstantesFunciones.TotalizarValoresFilaTipoMoneda(this.tipomonedas,this.tipomonedaAux);
				
				this.tipomonedas.add(this.tipomonedaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipomonedaTotales=new TipoMoneda();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomonedaLogic.getTipoMonedas().remove(tipomonedaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomonedas.remove(tipomonedaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipomonedaTotales=new TipoMoneda();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMoneda tipomoneda:tipomonedaLogic.getTipoMonedas()) {
				if(tipomoneda.getsType().equals(Constantes2.S_TOTALES)) {
					tipomonedaTotales=tipomoneda;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMonedaConstantesFunciones.TotalizarValoresFilaTipoMoneda(this.tipomonedaLogic.getTipoMonedas(),tipomonedaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMoneda tipomoneda:this.tipomonedas) {
				if(tipomoneda.getsType().equals(Constantes2.S_TOTALES)) {
					tipomonedaTotales=tipomoneda;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMonedaConstantesFunciones.TotalizarValoresFilaTipoMoneda(this.tipomonedas,tipomonedaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoMonedasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoMonedasBusquedaPorSigla()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorSigla";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoMonedasBusquedaPorSimbolo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorSimbolo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoMonedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoMonedasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomonedaLogic.getTipoMonedasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoMonedasBusquedaPorSigla(String sFinalQuery,String sigla)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomonedaLogic.getTipoMonedasBusquedaPorSigla(sFinalQuery,this.pagination,sigla);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoMonedasBusquedaPorSimbolo(String sFinalQuery,String simbolo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomonedaLogic.getTipoMonedasBusquedaPorSimbolo(sFinalQuery,this.pagination,simbolo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoMonedaPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomonedaLogic.getTipoMonedaPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoMoneda() {
		this.isPermisoTodoTipoMoneda=false;
		this.isPermisoNuevoTipoMoneda=false;
		this.isPermisoActualizarTipoMoneda=false;
		this.isPermisoActualizarOriginalTipoMoneda=false;
		this.isPermisoEliminarTipoMoneda=false;
		this.isPermisoGuardarCambiosTipoMoneda=false;
		this.isPermisoConsultaTipoMoneda=false;
		this.isPermisoBusquedaTipoMoneda=false;
		this.isPermisoReporteTipoMoneda=false;		
		this.isPermisoOrdenTipoMoneda=false;		
		this.isPermisoPaginacionMedioTipoMoneda=false;		
		this.isPermisoPaginacionAltoTipoMoneda=false;
		this.isPermisoPaginacionTodoTipoMoneda=false;
		this.isPermisoCopiarTipoMoneda=false;		
		this.isPermisoVerFormTipoMoneda=false;		
		this.isPermisoDuplicarTipoMoneda=false;		
		this.isPermisoOrdenTipoMoneda=false;		
	}
	
	public void setPermisosUsuarioTipoMoneda(Boolean isPermiso) {
		this.isPermisoTodoTipoMoneda=isPermiso;
		this.isPermisoNuevoTipoMoneda=isPermiso;
		this.isPermisoActualizarTipoMoneda=isPermiso;
		this.isPermisoActualizarOriginalTipoMoneda=isPermiso;
		this.isPermisoEliminarTipoMoneda=isPermiso;
		this.isPermisoGuardarCambiosTipoMoneda=isPermiso;
		this.isPermisoConsultaTipoMoneda=isPermiso;
		this.isPermisoBusquedaTipoMoneda=isPermiso;
		this.isPermisoReporteTipoMoneda=isPermiso;
		this.isPermisoOrdenTipoMoneda=isPermiso;		
		this.isPermisoPaginacionMedioTipoMoneda=isPermiso;		
		this.isPermisoPaginacionAltoTipoMoneda=isPermiso;		
		this.isPermisoPaginacionTodoTipoMoneda=isPermiso;		
		this.isPermisoCopiarTipoMoneda=isPermiso;		
		this.isPermisoVerFormTipoMoneda=isPermiso;		
		this.isPermisoDuplicarTipoMoneda=isPermiso;
		this.isPermisoOrdenTipoMoneda=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoMoneda(Boolean isPermiso) {
		//this.isPermisoTodoTipoMoneda=isPermiso;
		this.isPermisoNuevoTipoMoneda=isPermiso;
		this.isPermisoActualizarTipoMoneda=isPermiso;
		this.isPermisoActualizarOriginalTipoMoneda=isPermiso;
		this.isPermisoEliminarTipoMoneda=isPermiso;
		this.isPermisoGuardarCambiosTipoMoneda=isPermiso;
		//this.isPermisoConsultaTipoMoneda=isPermiso;
		//this.isPermisoBusquedaTipoMoneda=isPermiso;
		//this.isPermisoReporteTipoMoneda=isPermiso;
		//this.isPermisoOrdenTipoMoneda=isPermiso;		
		//this.isPermisoPaginacionMedioTipoMoneda=isPermiso;		
		//this.isPermisoPaginacionAltoTipoMoneda=isPermiso;		
		//this.isPermisoPaginacionTodoTipoMoneda=isPermiso;		
		//this.isPermisoCopiarTipoMoneda=isPermiso;		
		//this.isPermisoDuplicarTipoMoneda=isPermiso;
		//this.isPermisoOrdenTipoMoneda=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoMonedaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ParametroContabilidadDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoMonedaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosParametroContabilidadDefecto=false;
		this.isTienePermisosParametroContabilidadDefecto=this.verificarGetPermisosUsuarioOpcionTipoMonedaClaseRelacionada(this.opcionsRelacionadas,ParametroContabilidadDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoMoneda(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoMonedaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosParametroContabilidadDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoMonedaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoMonedaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoMonedaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosParametroContabilidadDefecto && this.jInternalFrameDetalleFormTipoMoneda!=null && this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMoneda.jTabbedPaneRelacionesTipoMoneda.remove(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoMoneda() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoMonedaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoMonedaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoMoneda=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoMoneda=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoMoneda=this.isPermisoActualizarTipoMoneda;
			this.isPermisoEliminarTipoMoneda=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoMoneda=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoMoneda=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoMoneda=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoMoneda=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoMoneda=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMoneda=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoMoneda=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoMoneda=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoMoneda=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoMoneda=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoMoneda=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoMoneda=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMoneda=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoMoneda.setToolTipText(this.jTableDatosTipoMoneda.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoMoneda(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoMoneda(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoMonedaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoMonedaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoMoneda() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosParametroContabilidadDefecto && this.tipomonedaConstantesFunciones.mostrarParametroContabilidadDefectoTipoMoneda && !TipoMonedaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Contabilidad Defecto");
			reporte.setsDescripcion("Parametro Contabilidad Defecto");
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
	
		
	public void inicializarCombosForeignKeyTipoMonedaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoMonedaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoMonedaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoMonedaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoMonedaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoMoneda()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoMoneda()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoMoneda(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoMoneda()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMoneda();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoMoneda(TipoMoneda tipomoneda)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoMoneda(TipoMoneda tipomoneda,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoMoneda()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMoneda()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoMoneda()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoMoneda()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoMoneda()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoMoneda()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoMoneda(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoMoneda()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoMonedaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoMonedaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoMonedaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipomonedaSessionBean=new TipoMonedaSessionBean(); 
		this.tipomonedaConstantesFunciones=new TipoMonedaConstantesFunciones(); 
		this.tipomonedaBean=new TipoMoneda();//(this.tipomonedaConstantesFunciones); 		
		this.tipomonedaReturnGeneral=new TipoMonedaParameterReturnGeneral(); 
		
		this.tipomonedaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomonedaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoMonedaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoMonedaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoMonedaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoMoneda(true);
			
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
			
			this.tipomonedaConstantesFunciones=new TipoMonedaConstantesFunciones(); 
			this.tipomonedaBean=new TipoMoneda();//this.tipomonedaConstantesFunciones); 			
			this.tipomonedaReturnGeneral=new TipoMonedaParameterReturnGeneral(); 
		
			TipoMonedaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Moneda Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipomoneda=new TipoMoneda();
			this.tipomonedas = new ArrayList<TipoMoneda>();
			this.tipomonedasAux = new ArrayList<TipoMoneda>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic=new TipoMonedaLogic();
				this.tipomonedaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipomonedaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipomonedaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoMoneda);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoMoneda!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMoneda);	
					}
					
					if(this.jInternalFrameImportacionTipoMoneda!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMoneda);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoMoneda!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoMoneda);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMoneda);
				this.jInternalFrameDetalleFormTipoMoneda.setVisible(false);
				this.jInternalFrameDetalleFormTipoMoneda.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoMoneda!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMoneda);
					this.jInternalFrameReporteDinamicoTipoMoneda.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoMoneda.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoMoneda!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoMoneda);
					this.jInternalFrameImportacionTipoMoneda.setVisible(false);
					this.jInternalFrameImportacionTipoMoneda.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoMoneda!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoMoneda);
					this.jInternalFrameOrderByTipoMoneda.setVisible(false);
					this.jInternalFrameOrderByTipoMoneda.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoMonedaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoMonedaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipomonedaReturnGeneral=new TipoMonedaParameterReturnGeneral();
			
			this.tipomonedaParameterGeneral=new TipoMonedaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipomonedaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoMonedaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ParametroContabilidadDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMonedaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomonedaSessionBean.getEsGuardarRelacionado(),this.tipomonedaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMonedaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomonedaSessionBean.getEsGuardarRelacionado(),this.tipomonedaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoMoneda=false;
			this.isVisibilidadCeldaDuplicarTipoMoneda=true;
			this.isVisibilidadCeldaCopiarTipoMoneda=true;
			this.isVisibilidadCeldaVerFormTipoMoneda=true;
			this.isVisibilidadCeldaOrdenTipoMoneda=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=false;
			this.isVisibilidadCeldaModificarTipoMoneda=false;
			this.isVisibilidadCeldaActualizarTipoMoneda=false;
			this.isVisibilidadCeldaEliminarTipoMoneda=false;
			this.isVisibilidadCeldaCancelarTipoMoneda=false;
			this.isVisibilidadCeldaGuardarTipoMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoneda=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadBusquedaPorSigla=true;
			this.isVisibilidadBusquedaPorSimbolo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoMoneda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoMoneda();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoMoneda(false);
			
			this.setPermisosUsuarioTipoMoneda();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomonedaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipomonedaSessionBean.getEsGuardarRelacionado() && this.tipomonedaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoMonedaClasesRelacionadas();
			}
			
			if(this.tipomonedaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoMonedaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoMonedaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoMoneda();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoMoneda();
			}
			
			if(!this.isPermisoBusquedaTipoMoneda) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoMoneda.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoMoneda,this.isPermisoPaginacionMedioTipoMoneda,this.isPermisoPaginacionTodoTipoMoneda);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoMonedaConstantesFunciones.getTiposSeleccionarTipoMoneda());
				
				this.tiposColumnasSelect=TipoMonedaConstantesFunciones.getTiposSeleccionarTipoMoneda(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoMoneda();				
				//this.tiposRelacionesSelect=TipoMonedaConstantesFunciones.getTiposRelacionesTipoMoneda(true);
				
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
			//if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoMoneda();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoMoneda(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoMoneda(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMoneda() ;
			
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
			
			
			this.parametrocontabilidaddefectoLogic=new ParametroContabilidadDefectoLogic(); 
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
				tipomonedaImplementable= (TipoMonedaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMonedaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipomonedaImplementableHome= (TipoMonedaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMonedaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipomonedas= new ArrayList<TipoMoneda>();
			this.tipomonedasEliminados= new ArrayList<TipoMoneda>();
						
			this.isEsNuevoTipoMoneda=false;
			this.esParaAccionDesdeFormularioTipoMoneda=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoMoneda(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoMoneda();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoMonedaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoMonedaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoMoneda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoMoneda(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoMoneda!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoMoneda();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoMoneda();
			}
			
			TipoMonedaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoMoneda.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoMoneda.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoMoneda.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoMoneda(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoMoneda: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoMoneda() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoMoneda")) {
				iIndex=this.jInternalFrameDetalleFormTipoMoneda.jTabbedPaneRelacionesTipoMoneda.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoMoneda.jTabbedPaneRelacionesTipoMoneda.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Contabilidad Defectos")) {
					if(!ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoMoneda();

						this.cargarParteTabPanelRelacionadaParametroContabilidadDefecto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoMoneda();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroContabilidadDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoMoneda.cargarSessionConBeanSwingJInternalFrameParametroContabilidadDefecto(false,true,iIndex);
		this.jButtonParametroContabilidadDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroContabilidadDefecto();

		//this.jTabbedPaneRelacionesTipoMoneda.updateUI();
		//this.jTabbedPaneRelacionesTipoMoneda.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoMoneda.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ParametroContabilidadDefecto")) {
				int row=this.jTableDatosTipoMoneda.getSelectedRow();
				jButtonParametroContabilidadDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Parametro Contabilidad Defecto")) {

					if(this.isTienePermisosParametroContabilidadDefecto && this.tipomonedaConstantesFunciones.mostrarParametroContabilidadDefectoTipoMoneda && !TipoMonedaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Contabilidad Defectos"+"("+ParametroContabilidadDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Contabilidad Defectos");

						if(tipomonedaConstantesFunciones.resaltarParametroContabilidadDefectoTipoMoneda!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipomonedaConstantesFunciones.resaltarParametroContabilidadDefectoTipoMoneda);
						}

						jmenuItem.setEnabled(this.tipomonedaConstantesFunciones.activarParametroContabilidadDefectoTipoMoneda);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroContabilidadDefecto"));

						

						this.jInternalFrameDetalleFormTipoMoneda.jmenuDetalleTipoMoneda.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoMoneda(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoMoneda(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoMoneda(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoMonedaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoMoneda();
		
		this.cargarCombosFrameForeignKeyTipoMoneda();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoMoneda();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoMoneda();
		}
	}
	
	
	
	public void jButtonNuevoTipoMonedaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipomonedaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			
			
			if(jTableDatosTipoMoneda.getRowCount()>=1) {
				jTableDatosTipoMoneda.removeRowSelectionInterval(0, jTableDatosTipoMoneda.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoMoneda=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoMoneda(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoMoneda(true);			
			//this.tipomoneda=new TipoMoneda();
			//this.tipomoneda.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMoneda(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMoneda() ;
			
			if(TipoMonedaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMoneda(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipomoneda);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);				
			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			
			if(this.tipomonedaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoMoneda: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoMonedaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoMoneda.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoMoneda.getSelectedRows().length;			
			}
			
			tipomonedasSeleccionados=this.getTipoMonedasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoMoneda--;			
				//TipoMoneda tipomonedaAux= new TipoMoneda();			
				//tipomonedaAux.setId(this.iIdNuevoTipoMoneda);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoMoneda tipomonedaOrigen=new TipoMoneda();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoMoneda tipomonedaOrigen : tipomonedasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipomonedaOrigen =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomonedaOrigen =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoMoneda();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipomoneda.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoMoneda(tipomonedaOrigen,this.tipomoneda,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomonedaLogic.getTipoMonedas().add(this.tipomonedaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomonedas.add(this.tipomonedaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoMoneda(false);
				
				this.jTableDatosTipoMoneda.setRowSelectionInterval(this.getIndiceNuevoTipoMoneda(), this.getIndiceNuevoTipoMoneda());
				
				int iLastRow =  this.jTableDatosTipoMoneda.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMoneda.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMoneda.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMoneda(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();									
		
			TipoMoneda tipomonedaOrigen=new TipoMoneda();
			TipoMoneda tipomonedaDestino=new TipoMoneda();
				
			tipomonedasSeleccionados=this.getTipoMonedasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoMoneda.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipomonedasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoMoneda.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomonedaOrigen =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomonedaOrigen =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomonedaDestino =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomonedaDestino =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipomonedaOrigen =tipomonedasSeleccionados.get(0);
				tipomonedaDestino =tipomonedasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoMoneda(tipomonedaOrigen,tipomonedaDestino,true,false);
				
				tipomonedaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomonedaDestino,tipomonedaLogic.getTipoMonedas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomonedaDestino,tipomonedas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoMoneda(false);
				
				//this.jTableDatosTipoMoneda.setRowSelectionInterval(this.getIndiceNuevoTipoMoneda(), this.getIndiceNuevoTipoMoneda());
				
				int iLastRow =  this.jTableDatosTipoMoneda.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMoneda.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMoneda.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMoneda(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoMoneda.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoMoneda.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoMoneda.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoMoneda.setVisible(!isVisible);
			this.jPanelPaginacionTipoMoneda.setVisible(!isVisible);
			this.jPanelAccionesTipoMoneda.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoMoneda();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoMoneda();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoMoneda();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoMoneda();
			
			this.abrirFrameOrderByTipoMoneda();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoMoneda();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoMoneda(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMoneda);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoMoneda.isMaximum()) {
					this.jInternalFrameDetalleFormTipoMoneda.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoMoneda.setSize(this.jInternalFrameDetalleFormTipoMoneda.iWidthFormulario,this.jInternalFrameDetalleFormTipoMoneda.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoMoneda.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoMoneda.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoMoneda.isMaximum()) {
						this.jInternalFrameDetalleFormTipoMoneda.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoMoneda.jContentPaneDetalleTipoMoneda.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoMoneda.jTabbedPaneRelacionesTipoMoneda.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoMoneda.jContentPaneDetalleTipoMoneda.getWidth(),TipoMonedaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMoneda.jTabbedPaneRelacionesTipoMoneda.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoMoneda.jContentPaneDetalleTipoMoneda.getWidth(),TipoMonedaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMoneda.jTabbedPaneRelacionesTipoMoneda.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoMoneda.jContentPaneDetalleTipoMoneda.getWidth(),TipoMonedaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroContabilidadDefecto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoMoneda.setVisible(true);
	        this.jInternalFrameDetalleFormTipoMoneda.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoMoneda() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoMoneda==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoMoneda=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMoneda,false,this);
				} else {
					this.jInternalFrameOrderByTipoMoneda=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMoneda,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoMoneda);
				this.jInternalFrameOrderByTipoMoneda.setVisible(false);
				this.jInternalFrameOrderByTipoMoneda.setSelected(false);
				
				this.jInternalFrameOrderByTipoMoneda.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMoneda"));
				
				this.inicializarActualizarBindingTablaOrderByTipoMoneda();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoMoneda() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoMoneda==null) {
				
				this.jInternalFrameImportacionTipoMoneda=new ImportacionJInternalFrame(TipoMonedaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMoneda);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoMoneda);
				this.jInternalFrameImportacionTipoMoneda.setVisible(false);
				this.jInternalFrameImportacionTipoMoneda.setSelected(false);


				this.jInternalFrameImportacionTipoMoneda.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMoneda"));
				this.jInternalFrameImportacionTipoMoneda.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMoneda"));
				this.jInternalFrameImportacionTipoMoneda.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMoneda"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoMoneda() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoMoneda==null) {
				this.jInternalFrameReporteDinamicoTipoMoneda=new ReporteDinamicoJInternalFrame(TipoMonedaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMoneda);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMoneda);
				this.jInternalFrameReporteDinamicoTipoMoneda.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoMoneda.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoMoneda.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMoneda"));
				this.jInternalFrameReporteDinamicoTipoMoneda.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMoneda"));
				this.jInternalFrameReporteDinamicoTipoMoneda.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMoneda"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMoneda();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroContabilidadDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoMoneda.jContentPaneDetalleTipoMoneda.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoMoneda() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMoneda);
			
	       	this.jInternalFrameDetalleFormTipoMoneda.setVisible(false);
	        this.jInternalFrameDetalleFormTipoMoneda.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoMoneda.dispose();
			//this.jInternalFrameDetalleFormTipoMoneda=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoMoneda() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoMoneda.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoMoneda.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoMoneda() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoMoneda.setVisible(true);
	        this.jInternalFrameImportacionTipoMoneda.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoMoneda() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoMoneda.setVisible(true);
	        this.jInternalFrameOrderByTipoMoneda.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoMoneda() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoMoneda.setVisible(false);
	        this.jInternalFrameOrderByTipoMoneda.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoMoneda() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoMoneda.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoMoneda.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoMoneda() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoMoneda.setVisible(false);
	        this.jInternalFrameImportacionTipoMoneda.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoMoneda(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoMoneda(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoMoneda(true);
			//this.isEsNuevoTipoMoneda=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoMoneda("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMoneda(false) ;
			
			if(tipomonedaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() && ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroContabilidadDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoMonedaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMoneda(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMoneda(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoMonedaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoMoneda(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoMoneda(true);
			//this.isEsNuevoTipoMoneda=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipomoneda.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoMoneda("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoMoneda(false) ;
			
			if(TipoMonedaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMoneda(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMoneda(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoMoneda(false);
			
			//if(!this.isEsNuevoTipoMoneda) {								
				int intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoMonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoMoneda(this.tipomoneda,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
				
			}
			
			if(this.permiteMantenimiento(this.tipomoneda)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoMoneda=true;
					this.inicializarActualizarBindingTablaTipoMoneda(false);
					this.isEsNuevoTipoMoneda=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoMoneda=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoMoneda=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMoneda(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMoneda(false);
				
				this.habilitarDeshabilitarControlesTipoMoneda(false);
			
												
				
				if(TipoMonedaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoMoneda();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoMonedaActionPerformed(evt,tipomonedaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoMoneda(this.tipomoneda,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoMoneda.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipomonedaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipomoneda.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoMoneda.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoneda.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				this.tipomoneda.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				this.tipomoneda.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipomoneda)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoMonedaModel) this.jTableDatosTipoMoneda.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoMoneda=true;
				this.inicializarActualizarBindingTablaTipoMoneda(false);
				this.isEsNuevoTipoMoneda=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMoneda(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMoneda(false);
				
				this.habilitarDeshabilitarControlesTipoMoneda(false);
				
				
				
				if(TipoMonedaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoMoneda();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoMonedaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoMoneda.getRowCount()>=1) {
				jTableDatosTipoMoneda.removeRowSelectionInterval(0, jTableDatosTipoMoneda.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoMoneda(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoMoneda(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMoneda(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMoneda(false) ;
			
			this.isEsNuevoTipoMoneda=false;
			
			if(TipoMonedaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoMoneda();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoMonedaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoMoneda(false);
				
				//SI ES MANUAL
				if(TipoMonedaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoMoneda();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoMonedaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoMoneda--;			
			//TipoMoneda tipomonedaAux= new TipoMoneda();			
			//tipomonedaAux.setId(this.iIdNuevoTipoMoneda);
			
			if(this.jInternalFrameDetalleFormTipoMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoMoneda();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
			
			this.tipomoneda.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipomonedaLogic.getTipoMonedas().add(this.tipomonedaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipomonedas.add(this.tipomonedaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoMoneda(false);
			
			this.jTableDatosTipoMoneda.setRowSelectionInterval(this.getIndiceNuevoTipoMoneda(), this.getIndiceNuevoTipoMoneda());
			
			int iLastRow =  this.jTableDatosTipoMoneda.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoMoneda.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoMoneda.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoMoneda(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoMonedaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoMoneda(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMoneda(false);
			
			//SI ES MANUAL
			if(TipoMonedaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMoneda();
			}
			
			//this.abrirFrameTreeTipoMoneda();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoMonedaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo MonedaS ?", "MANTENIMIENTO DE Tipo Moneda", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoMoneda.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoMoneda();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipomonedaReturnGeneral=tipomonedaLogic.procesarImportacionTipoMonedasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipomonedaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoMonedaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoMonedaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoMoneda.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoMoneda.setFileImportacion(this.jInternalFrameImportacionTipoMoneda.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoMoneda.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoMoneda.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoMoneda.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoMoneda.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoMonedaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();		

		tipomonedasSeleccionados=this.getTipoMonedasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMoneda.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMoneda.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoMonedaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoMonedaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoMonedas("Todos",tipomonedasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Moneda",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMoneda.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMoneda.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMonedaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMonedaConstantesFunciones.LABEL_SIGLA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gla_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gla_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gla_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gla_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMonedaConstantesFunciones.LABEL_SIMBOLO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbolo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbolo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbolo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbolo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoMoneda.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMoneda.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMoneda.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoMonedaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoMonedaConstantesFunciones.LABEL_SIGLA:
					sNombreCampoCategoria="sigla";
					break;

				case TipoMonedaConstantesFunciones.LABEL_SIMBOLO:
					sNombreCampoCategoria="simbolo";
					break;

				case TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoMoneda.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoMonedaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoMonedaConstantesFunciones.LABEL_SIGLA:
					sNombreCampoCategoriaValor="sigla";
					break;

				case TipoMonedaConstantesFunciones.LABEL_SIMBOLO:
					sNombreCampoCategoriaValor="simbolo";
					break;

				case TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoMoneda.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMoneda.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMonedaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoMonedaConstantesFunciones.LABEL_SIGLA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sigla",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sigla");
					break;

				case TipoMonedaConstantesFunciones.LABEL_SIMBOLO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Simbolo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"simbolo");
					break;

				case TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoMonedaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();		
		
		tipomonedasSeleccionados=this.getTipoMonedasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomoneda";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoMonedas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoMoneda.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMoneda.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoMonedaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoMoneda tipomoneda:tipomonedasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomoneda.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMonedaConstantesFunciones.LABEL_SIGLA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_SIGLA);
					iRow++;

					for(TipoMoneda tipomoneda:tipomonedasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomoneda.getsigla());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMonedaConstantesFunciones.LABEL_SIMBOLO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_SIMBOLO);
					iRow++;

					for(TipoMoneda tipomoneda:tipomonedasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomoneda.getsimbolo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(TipoMoneda tipomoneda:tipomonedasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomoneda.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelTipoMoneda(row);				
			//	iRow++;
			//}				
			
			//for(TipoMoneda tipomonedaAux:tipomonedasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoMoneda(tipomonedaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Moneda",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipomonedaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMoneda(false);
			
			//SI ES MANUAL
			if(TipoMonedaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMoneda();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoMonedaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMoneda(false);
			
			//SI ES MANUAL
			if(TipoMonedaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMoneda();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoMonedaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMoneda(false);
			
			//SI ES MANUAL
			if(TipoMonedaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMoneda();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoMoneda() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoMoneda.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoMoneda.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoMoneda.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoMoneda.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoMoneda.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoMoneda.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoMoneda.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoMoneda(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoMoneda(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoMoneda(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoMoneda(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoMoneda(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoMoneda(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMoneda(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoMoneda(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoMonedaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoMonedaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoMoneda() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoMoneda();
		
		this.inicializarActualizarBindingBotonesManualTipoMoneda(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMoneda();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMoneda() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMoneda(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMoneda(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoMoneda.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoMoneda.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoMoneda.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxPostAccionNuevoTipoMoneda.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxPostAccionSinCerrarTipoMoneda.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxPostAccionSinMensajeTipoMoneda.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoMoneda.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoMoneda.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoMoneda.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
				this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxPostAccionNuevoTipoMoneda.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxPostAccionSinCerrarTipoMoneda.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxPostAccionSinMensajeTipoMoneda.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoMoneda.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoMoneda.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoMoneda.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoMoneda!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMoneda.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoMoneda.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoMoneda.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoMoneda.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoMoneda.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoMoneda!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMoneda.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoMoneda.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoMoneda.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoMoneda(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoMonedaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMoneda(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoMoneda() throws Exception {
		try	{
			if(TipoMonedaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMoneda();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMoneda() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMoneda() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoMoneda.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoMoneda.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoMoneda.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoMoneda.addItem(reporte);
			}
			
			
			if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoMoneda.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoMoneda.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoMoneda.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoMoneda.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoMoneda.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoMoneda.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMoneda();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMoneda() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMoneda!=null) {
				this.jInternalFrameReporteDinamicoTipoMoneda.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMoneda.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMoneda!=null) {
				this.jInternalFrameReporteDinamicoTipoMoneda.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMoneda.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoMoneda!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoMoneda.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMoneda.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMoneda.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoMoneda.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMoneda.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMoneda.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoMoneda()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreTipoMoneda.getText();
		this.siglaBusquedaPorSigla=this.jTextFieldsiglaBusquedaPorSiglaTipoMoneda.getText();
		this.simboloBusquedaPorSimbolo=this.jTextFieldsimboloBusquedaPorSimboloTipoMoneda.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoMoneda(Boolean esInicializar) throws Exception {				
		if(TipoMonedaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMoneda();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoMoneda() throws Exception {
		this.inicializarActualizarBindingTablaTipoMoneda(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoMoneda() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoMonedaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoMonedaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoMonedaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMonedaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoMonedaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoMonedaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoMoneda(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipomonedaLogic.getTipoMonedas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipomonedas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoMonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoMoneda.setModel(new TipoMonedaModel(this.tipomonedaLogic.getTipoMonedas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoMoneda.setModel(new TipoMonedaModel(this.tipomonedas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoMoneda!=null && this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoMoneda();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMoneda,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoMonedaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO,tipomonedaConstantesFunciones.resaltarSeleccionarTipoMoneda,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO,tipomonedaConstantesFunciones.resaltarSeleccionarTipoMoneda,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMoneda,TipoMonedaConstantesFunciones.LABEL_ID));

		if(this.tipomonedaConstantesFunciones.mostraridTipoMoneda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMonedaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipomonedaConstantesFunciones.resaltaridTipoMoneda,this.tipomonedaConstantesFunciones.activaridTipoMoneda,this,true,"idTipoMoneda","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomonedaConstantesFunciones.resaltaridTipoMoneda,this.tipomonedaConstantesFunciones.activaridTipoMoneda,this,true,"idTipoMoneda","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMoneda,TipoMonedaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipomonedaConstantesFunciones.mostrarnombreTipoMoneda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMonedaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomonedaConstantesFunciones.resaltarnombreTipoMoneda,this.tipomonedaConstantesFunciones.activarnombreTipoMoneda,this,true,"nombreTipoMoneda","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomonedaConstantesFunciones.resaltarnombreTipoMoneda,this.tipomonedaConstantesFunciones.activarnombreTipoMoneda,this,true,"nombreTipoMoneda","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMonedaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMoneda,TipoMonedaConstantesFunciones.LABEL_SIGLA));

		if(this.tipomonedaConstantesFunciones.mostrarsiglaTipoMoneda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMonedaConstantesFunciones.LABEL_SIGLA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomonedaConstantesFunciones.resaltarsiglaTipoMoneda,this.tipomonedaConstantesFunciones.activarsiglaTipoMoneda,this,true,"siglaTipoMoneda","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomonedaConstantesFunciones.resaltarsiglaTipoMoneda,this.tipomonedaConstantesFunciones.activarsiglaTipoMoneda,this,true,"siglaTipoMoneda","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMonedaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMoneda,TipoMonedaConstantesFunciones.LABEL_SIMBOLO));

		if(this.tipomonedaConstantesFunciones.mostrarsimboloTipoMoneda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMonedaConstantesFunciones.LABEL_SIMBOLO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomonedaConstantesFunciones.resaltarsimboloTipoMoneda,this.tipomonedaConstantesFunciones.activarsimboloTipoMoneda,this,true,"simboloTipoMoneda","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomonedaConstantesFunciones.resaltarsimboloTipoMoneda,this.tipomonedaConstantesFunciones.activarsimboloTipoMoneda,this,true,"simboloTipoMoneda","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMonedaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMoneda,TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.tipomonedaConstantesFunciones.mostraresta_activoTipoMoneda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tipomonedaConstantesFunciones.resaltaresta_activoTipoMoneda,this.tipomonedaConstantesFunciones.activaresta_activoTipoMoneda));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tipomonedaConstantesFunciones.resaltaresta_activoTipoMoneda,this.tipomonedaConstantesFunciones.activaresta_activoTipoMoneda,this,true,"esta_activoTipoMoneda","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoMonedaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosParametroContabilidadDefecto && this.tipomonedaConstantesFunciones.mostrarParametroContabilidadDefectoTipoMoneda && !TipoMonedaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Contabilidad Defectos");
				tableColumn.setHeaderValue("Parametro Contabilidad Defectos");
				tableColumn.setCellRenderer(new ParametroContabilidadDefectoTableCell(tipomonedaConstantesFunciones.resaltarParametroContabilidadDefectoTipoMoneda,this,this.tipomonedaConstantesFunciones.activarParametroContabilidadDefectoTipoMoneda));
				tableColumn.setCellEditor(new ParametroContabilidadDefectoTableCell(tipomonedaConstantesFunciones.resaltarParametroContabilidadDefectoTipoMoneda,this,this.tipomonedaConstantesFunciones.activarParametroContabilidadDefectoTipoMoneda));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoMoneda.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomonedaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomonedaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMoneda.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomonedaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomonedaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMoneda.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoMoneda && this.isPermisoGuardarCambiosTipoMoneda) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipomonedaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipomonedaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoMoneda.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipomonedaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoMoneda.addColumn(tableColumn);
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
			
			this.jTableDatosTipoMoneda.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMoneda && this.isPermisoGuardarCambiosTipoMoneda) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipomonedaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMoneda && this.isPermisoGuardarCambiosTipoMoneda) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoMoneda.moveColumn(this.jTableDatosTipoMoneda.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoMoneda.moveColumn(this.jTableDatosTipoMoneda.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipomonedaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoMoneda.moveColumn(this.jTableDatosTipoMoneda.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoMoneda.moveColumn(this.jTableDatosTipoMoneda.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoMoneda.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoMoneda.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoMoneda,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoMonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoMoneda.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoMoneda.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoMonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoMonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoMoneda.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoMoneda.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoMoneda.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipomonedaLogic.getTipoMonedas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipomonedas.size()-1;
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
		//this.jTableDatosTipoMoneda.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoMoneda();
			
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
				
				//this.isEsNuevoTipoMoneda=false;
					
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			
				if(this.tipomonedaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoMoneda==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMoneda.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMoneda.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipomoneda.getsType().equals("DUPLICADO")
				   || this.tipomoneda.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoMoneda=true;
				
				} else {
					this.isEsNuevoTipoMoneda=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipomoneda.getId()>=0 && !this.tipomoneda.getIsNew()) {						
						this.isEsNuevoTipoMoneda=false;
						
					} else {
						this.isEsNuevoTipoMoneda=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoMoneda(esRelaciones);						
				
				this.seleccionarTipoMoneda(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipomoneda.getId()<0) {
					this.isEsNuevoTipoMoneda=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoMoneda(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoMoneda(evt,rowIndex);
				}	
				
				if(this.tipomonedaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoMoneda: " + this.dDif); 
					}
				}								
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoMoneda(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipomoneda)) {
					if(this.tipomoneda.getId()>0) {
						this.tipomoneda.setIsDeleted(true);
						
						this.tipomonedasEliminados.add(this.tipomoneda);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomonedaLogic.getTipoMonedas().remove(this.tipomoneda);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomonedas.remove(this.tipomoneda);				
					}
					
					
					((TipoMonedaModel) this.jTableDatosTipoMoneda.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMoneda(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoMoneda(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoMoneda) {
			
			if(this.jInternalFrameDetalleFormTipoMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMoneda.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMoneda.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoMonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoMoneda(this.tipomoneda);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoMoneda("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoMoneda(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMoneda() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMoneda(TipoMoneda tipomoneda) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoMoneda(tipomoneda,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMoneda(TipoMoneda tipomoneda,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoMoneda(tipomoneda);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoMoneda(tipomoneda,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoMoneda(tipomoneda);
	}
	
	public void setVariablesObjetoActualToFormularioTipoMoneda(TipoMoneda tipomoneda) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoMoneda.jTextFieldidTipoMoneda.setText(tipomoneda.getId().toString());
			this.jInternalFrameDetalleFormTipoMoneda.jTextFieldnombreTipoMoneda.setText(tipomoneda.getnombre());
			this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsiglaTipoMoneda.setText(tipomoneda.getsigla());
			this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsimboloTipoMoneda.setText(tipomoneda.getsimbolo());
			this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxesta_activoTipoMoneda.setSelected(tipomoneda.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoMoneda tipomonedaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipomonedaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoMoneda tipomonedaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipomonedaLocal=this.tipomoneda;
			} else {
				tipomonedaLocal=this.tipomonedaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipomonedaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoMoneda(tipomonedaLocal,true);
					
					if(tipomonedaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipomonedaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipomonedaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoMoneda(TipoMoneda tipomoneda,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMoneda(tipomoneda,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(tipomoneda);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMoneda(TipoMoneda tipomoneda,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMoneda(tipomoneda,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMoneda(TipoMoneda tipomoneda,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoMoneda.jTextFieldidTipoMoneda.getText()==null || this.jInternalFrameDetalleFormTipoMoneda.jTextFieldidTipoMoneda.getText()=="" || this.jInternalFrameDetalleFormTipoMoneda.jTextFieldidTipoMoneda.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoMoneda.jTextFieldidTipoMoneda.setText("0");
			}

			if(conColumnasBase) {tipomoneda.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoMoneda.jTextFieldidTipoMoneda.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMonedaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoneda.jLabelIdTipoMoneda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomoneda.setnombre(this.jInternalFrameDetalleFormTipoMoneda.jTextFieldnombreTipoMoneda.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMonedaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoneda.jLabelnombreTipoMoneda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomoneda.setsigla(this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsiglaTipoMoneda.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMonedaConstantesFunciones.LABEL_SIGLA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoneda.jLabelsiglaTipoMoneda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomoneda.setsimbolo(this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsimboloTipoMoneda.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMonedaConstantesFunciones.LABEL_SIMBOLO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoneda.jLabelsimboloTipoMoneda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomoneda.setesta_activo(this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxesta_activoTipoMoneda.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoneda.jLabelesta_activoTipoMoneda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMoneda(TipoMoneda tipomonedaBean,TipoMoneda tipomoneda,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoMoneda(TipoMoneda tipomonedaOrigen,TipoMoneda tipomoneda,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomonedaOrigen.getId()!=null && !tipomonedaOrigen.getId().equals(0L))) {tipomoneda.setId(tipomonedaOrigen.getId());}}
			if(conDefault || (!conDefault && tipomonedaOrigen.getnombre()!=null && !tipomonedaOrigen.getnombre().equals(""))) {tipomoneda.setnombre(tipomonedaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipomonedaOrigen.getsigla()!=null && !tipomonedaOrigen.getsigla().equals(""))) {tipomoneda.setsigla(tipomonedaOrigen.getsigla());}
			if(conDefault || (!conDefault && tipomonedaOrigen.getsimbolo()!=null && !tipomonedaOrigen.getsimbolo().equals(""))) {tipomoneda.setsimbolo(tipomonedaOrigen.getsimbolo());}
			if(conDefault || (!conDefault && tipomonedaOrigen.getesta_activo()!=null && !tipomonedaOrigen.getesta_activo().equals(false))) {tipomoneda.setesta_activo(tipomonedaOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMoneda(TipoMoneda tipomoneda) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMoneda.jTextFieldidTipoMoneda.setText(tipomoneda.getId().toString());
			this.jInternalFrameDetalleFormTipoMoneda.jTextFieldnombreTipoMoneda.setText(tipomoneda.getnombre());
			this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsiglaTipoMoneda.setText(tipomoneda.getsigla());
			this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsimboloTipoMoneda.setText(tipomoneda.getsimbolo());
			this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxesta_activoTipoMoneda.setSelected(tipomoneda.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMoneda(TipoMonedaBean tipomonedaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMoneda.jTextFieldidTipoMoneda.setText(tipomonedaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoMoneda.jTextFieldnombreTipoMoneda.setText(tipomonedaBean.getnombre());
			this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsiglaTipoMoneda.setText(tipomonedaBean.getsigla());
			this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsimboloTipoMoneda.setText(tipomonedaBean.getsimbolo());
			this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxesta_activoTipoMoneda.setSelected(tipomonedaBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoMoneda(TipoMonedaParameterReturnGeneral tipomonedaReturnGeneral,TipoMonedaBean tipomonedaBean,Boolean conDefault) throws Exception { 
		try {
			TipoMoneda tipomonedaLocal=new TipoMoneda();
			
			tipomonedaLocal=tipomonedaReturnGeneral.getTipoMoneda();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomonedaLocal.getId()!=null && !tipomonedaLocal.getId().equals(0L))) {tipomonedaBean.setId(tipomonedaLocal.getId());}}
			if(conDefault || (!conDefault && tipomonedaLocal.getnombre()!=null && !tipomonedaLocal.getnombre().equals(""))) {tipomonedaBean.setnombre(tipomonedaLocal.getnombre());}
			if(conDefault || (!conDefault && tipomonedaLocal.getsigla()!=null && !tipomonedaLocal.getsigla().equals(""))) {tipomonedaBean.setsigla(tipomonedaLocal.getsigla());}
			if(conDefault || (!conDefault && tipomonedaLocal.getsimbolo()!=null && !tipomonedaLocal.getsimbolo().equals(""))) {tipomonedaBean.setsimbolo(tipomonedaLocal.getsimbolo());}
			if(conDefault || (!conDefault && tipomonedaLocal.getesta_activo()!=null && !tipomonedaLocal.getesta_activo().equals(false))) {tipomonedaBean.setesta_activo(tipomonedaLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoMonedaGenerico(Long idTipoMonedaSeleccionado,JComboBox jComboBoxTipoMoneda,List<TipoMoneda> tipomonedasLocal)throws Exception {
		try {
			TipoMoneda  tipomonedaTemp=null;

			for(TipoMoneda tipomonedaAux:tipomonedasLocal) {
				if(tipomonedaAux.getId()!=null && tipomonedaAux.getId().equals(idTipoMonedaSeleccionado)) {
					tipomonedaTemp=tipomonedaAux;
					break;
				}
			}

			jComboBoxTipoMoneda.setSelectedItem(tipomonedaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoMonedaGenerico(JComboBox jComboBoxTipoMoneda,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMoneda.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoMoneda.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMoneda.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoMoneda.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ParametroContabilidadDefecto")) {
			jButtonParametroContabilidadDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomoneda=(TipoMoneda) tipomonedaLogic.getTipoMonedas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomoneda =(TipoMoneda) tipomonedas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoMoneda tipomonedaRow=new TipoMoneda();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomonedaRow=(TipoMoneda) tipomonedaLogic.getTipoMonedas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomonedaRow=(TipoMoneda) tipomonedas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonParametroContabilidadDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoMoneda tipomoneda) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoMoneda==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomoneda = (TipoMoneda)this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipomoneda = (TipoMoneda)this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipomoneda!=null) {
						this.tipomoneda = tipomoneda;
					} else {
						this.tipomoneda = new TipoMoneda();
					}
				}

				if(this.isTienePermisosParametroContabilidadDefecto && this.permiteMantenimiento(this.tipomoneda)) {
					ParametroContabilidadDefectoBeanSwingJInternalFrame parametrocontabilidaddefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFramePopup=new ParametroContabilidadDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocontabilidaddefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFramePopup;
					} else {
						parametrocontabilidaddefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame;
					}

					List<TipoMoneda> tipomonedas=new ArrayList<TipoMoneda>();
					tipomonedas.add(this.tipomoneda);
					if(!esRelacionado) {
						//parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setConGuardarRelaciones(false);
						//parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocontabilidaddefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoMoneda.cargarParametroContabilidadDefectoBeanSwingJInternalFrame(tipomonedas,this.tipomoneda,parametrocontabilidaddefectoBeanSwingJInternalFrame,/*conInicializar,*/parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones(),parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
					parametrocontabilidaddefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocontabilidaddefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContabilidadDefecto("no_relacionado");

						parametrocontabilidaddefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroContabilidadDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroContabilidadDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocontabilidaddefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoMoneda=(TitledBorder)this.jScrollPanelDatosTipoMoneda.getBorder();
						TitledBorder titledBorderParametroContabilidadDefecto=(TitledBorder)parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.getBorder();

						titledBorderParametroContabilidadDefecto.setTitle(titledBorderTipoMoneda.getTitle() + " -> Parametro Contabilidad Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocontabilidaddefectoBeanSwingJInternalFrame);
						}

						parametrocontabilidaddefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocontabilidaddefectoBeanSwingJInternalFrame);

						parametrocontabilidaddefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipomonedaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Contabilidad Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoMoneda(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoMoneda.setVisible((this.isVisibilidadCeldaNuevoTipoMoneda && this.isPermisoNuevoTipoMoneda));			
			this.jButtonDuplicarTipoMoneda.setVisible((this.isVisibilidadCeldaDuplicarTipoMoneda && this.isPermisoDuplicarTipoMoneda));			
			this.jButtonCopiarTipoMoneda.setVisible((this.isVisibilidadCeldaCopiarTipoMoneda && this.isPermisoCopiarTipoMoneda));
			this.jButtonVerFormTipoMoneda.setVisible((this.isVisibilidadCeldaVerFormTipoMoneda && this.isPermisoVerFormTipoMoneda));
			
			this.jButtonAbrirOrderByTipoMoneda.setVisible((this.isVisibilidadCeldaOrdenTipoMoneda && this.isPermisoOrdenTipoMoneda));			
			
			this.jButtonNuevoRelacionesTipoMoneda.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMoneda && this.isPermisoNuevoTipoMoneda));			
			this.jButtonNuevoGuardarCambiosTipoMoneda.setVisible((this.isVisibilidadCeldaNuevoTipoMoneda && this.isPermisoNuevoTipoMoneda && this.isPermisoGuardarCambiosTipoMoneda));
			
			if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
			this.jInternalFrameDetalleFormTipoMoneda.jButtonModificarTipoMoneda.setVisible((this.isVisibilidadCeldaModificarTipoMoneda && this.isPermisoActualizarTipoMoneda));	
			this.jInternalFrameDetalleFormTipoMoneda.jButtonActualizarTipoMoneda.setVisible((this.isVisibilidadCeldaActualizarTipoMoneda && this.isPermisoActualizarTipoMoneda));	
			this.jInternalFrameDetalleFormTipoMoneda.jButtonEliminarTipoMoneda.setVisible((this.isVisibilidadCeldaEliminarTipoMoneda && this.isPermisoEliminarTipoMoneda));
			this.jInternalFrameDetalleFormTipoMoneda.jButtonCancelarTipoMoneda.setVisible(this.isVisibilidadCeldaCancelarTipoMoneda);							
			this.jInternalFrameDetalleFormTipoMoneda.jButtonGuardarCambiosTipoMoneda.setVisible((this.isVisibilidadCeldaGuardarTipoMoneda && this.isPermisoGuardarCambiosTipoMoneda));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoMoneda.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMoneda && this.isPermisoGuardarCambiosTipoMoneda));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoMoneda.setVisible((this.isVisibilidadCeldaNuevoTipoMoneda && this.isPermisoNuevoTipoMoneda));						
			this.jButtonDuplicarToolBarTipoMoneda.setVisible((this.isVisibilidadCeldaDuplicarTipoMoneda && this.isPermisoDuplicarTipoMoneda));						
			this.jButtonCopiarToolBarTipoMoneda.setVisible((this.isVisibilidadCeldaCopiarTipoMoneda && this.isPermisoCopiarTipoMoneda));			
			this.jButtonVerFormToolBarTipoMoneda.setVisible((this.isVisibilidadCeldaVerFormTipoMoneda && this.isPermisoVerFormTipoMoneda));			
			this.jButtonAbrirOrderByToolBarTipoMoneda.setVisible((this.isVisibilidadCeldaOrdenTipoMoneda && this.isPermisoOrdenTipoMoneda));
			this.jButtonNuevoRelacionesToolBarTipoMoneda.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMoneda && this.isPermisoNuevoTipoMoneda));			
			this.jButtonNuevoGuardarCambiosToolBarTipoMoneda.setVisible((this.isVisibilidadCeldaNuevoTipoMoneda && this.isPermisoNuevoTipoMoneda && this.isPermisoGuardarCambiosTipoMoneda));			
			
			if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
			this.jInternalFrameDetalleFormTipoMoneda.jButtonModificarToolBarTipoMoneda.setVisible((this.isVisibilidadCeldaModificarTipoMoneda && this.isPermisoActualizarTipoMoneda));	
			this.jInternalFrameDetalleFormTipoMoneda.jButtonActualizarToolBarTipoMoneda.setVisible((this.isVisibilidadCeldaActualizarTipoMoneda  && this.isPermisoActualizarTipoMoneda));	
			this.jInternalFrameDetalleFormTipoMoneda.jButtonEliminarToolBarTipoMoneda.setVisible((this.isVisibilidadCeldaEliminarTipoMoneda && this.isPermisoEliminarTipoMoneda));
			this.jInternalFrameDetalleFormTipoMoneda.jButtonCancelarToolBarTipoMoneda.setVisible(this.isVisibilidadCeldaCancelarTipoMoneda);				
			this.jInternalFrameDetalleFormTipoMoneda.jButtonGuardarCambiosToolBarTipoMoneda.setVisible((this.isVisibilidadCeldaGuardarTipoMoneda && this.isPermisoGuardarCambiosTipoMoneda));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoMoneda.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMoneda && this.isPermisoGuardarCambiosTipoMoneda));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoMoneda.setVisible((this.isVisibilidadCeldaNuevoTipoMoneda && this.isPermisoNuevoTipoMoneda));			
			this.jMenuItemDuplicarTipoMoneda.setVisible((this.isVisibilidadCeldaDuplicarTipoMoneda && this.isPermisoDuplicarTipoMoneda));			
			this.jMenuItemCopiarTipoMoneda.setVisible((this.isVisibilidadCeldaCopiarTipoMoneda && this.isPermisoCopiarTipoMoneda));			
			this.jMenuItemVerFormTipoMoneda.setVisible((this.isVisibilidadCeldaVerFormTipoMoneda && this.isPermisoVerFormTipoMoneda));			
			this.jMenuItemAbrirOrderByTipoMoneda.setVisible((this.isVisibilidadCeldaOrdenTipoMoneda && this.isPermisoOrdenTipoMoneda));			
			//this.jMenuItemMostrarOcultarTipoMoneda.setVisible((this.isVisibilidadCeldaOrdenTipoMoneda && this.isPermisoOrdenTipoMoneda));
			this.jMenuItemDetalleAbrirOrderByTipoMoneda.setVisible((this.isVisibilidadCeldaOrdenTipoMoneda && this.isPermisoOrdenTipoMoneda));			
			//this.jMenuItemDetalleMostrarOcultarTipoMoneda.setVisible((this.isVisibilidadCeldaOrdenTipoMoneda && this.isPermisoOrdenTipoMoneda));			
			this.jMenuItemNuevoRelacionesTipoMoneda.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMoneda && this.isPermisoNuevoTipoMoneda));			
			this.jMenuItemNuevoGuardarCambiosTipoMoneda.setVisible((this.isVisibilidadCeldaNuevoTipoMoneda && this.isPermisoNuevoTipoMoneda && this.isPermisoGuardarCambiosTipoMoneda));									
			
			if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
			this.jInternalFrameDetalleFormTipoMoneda.jMenuItemModificarTipoMoneda.setVisible((this.isVisibilidadCeldaModificarTipoMoneda && this.isPermisoActualizarTipoMoneda));	
			this.jInternalFrameDetalleFormTipoMoneda.jMenuItemActualizarTipoMoneda.setVisible((this.isVisibilidadCeldaActualizarTipoMoneda && this.isPermisoActualizarTipoMoneda));	
			this.jInternalFrameDetalleFormTipoMoneda.jMenuItemEliminarTipoMoneda.setVisible((this.isVisibilidadCeldaEliminarTipoMoneda && this.isPermisoEliminarTipoMoneda));
			this.jInternalFrameDetalleFormTipoMoneda.jMenuItemCancelarTipoMoneda.setVisible(this.isVisibilidadCeldaCancelarTipoMoneda);				
			}
			
			this.jMenuItemGuardarCambiosTipoMoneda.setVisible((this.isVisibilidadCeldaGuardarTipoMoneda && this.isPermisoGuardarCambiosTipoMoneda));						
			this.jMenuItemGuardarCambiosTablaTipoMoneda.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMoneda && this.isPermisoGuardarCambiosTipoMoneda));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoMoneda=this.jButtonNuevoTipoMoneda.isVisible();
			this.isVisibilidadCeldaDuplicarTipoMoneda=this.jButtonDuplicarTipoMoneda.isVisible();
			this.isVisibilidadCeldaCopiarTipoMoneda=this.jButtonCopiarTipoMoneda.isVisible();
			this.isVisibilidadCeldaVerFormTipoMoneda=this.jButtonVerFormTipoMoneda.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoMoneda=this.jButtonAbrirOrderByTipoMoneda.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=this.jButtonNuevoRelacionesTipoMoneda.isVisible();
			this.isVisibilidadCeldaModificarTipoMoneda=this.jButtonModificarTipoMoneda.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
			this.isVisibilidadCeldaActualizarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jButtonActualizarTipoMoneda.isVisible();
			this.isVisibilidadCeldaEliminarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jButtonEliminarTipoMoneda.isVisible();
			this.isVisibilidadCeldaCancelarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jButtonCancelarTipoMoneda.isVisible();
			this.isVisibilidadCeldaGuardarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jButtonGuardarCambiosTipoMoneda.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoMoneda=this.jButtonGuardarCambiosTablaTipoMoneda.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoMoneda=this.jButtonNuevoToolBarTipoMoneda.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=this.jButtonNuevoRelacionesToolBarTipoMoneda.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
			this.isVisibilidadCeldaModificarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jButtonModificarToolBarTipoMoneda.isVisible();
			this.isVisibilidadCeldaActualizarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jButtonActualizarToolBarTipoMoneda.isVisible();
			this.isVisibilidadCeldaEliminarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jButtonEliminarToolBarTipoMoneda.isVisible();
			this.isVisibilidadCeldaCancelarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jButtonCancelarToolBarTipoMoneda.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMoneda=this.jButtonGuardarCambiosToolBarTipoMoneda.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMoneda=this.jButtonGuardarCambiosTablaToolBarTipoMoneda.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoMoneda=this.jMenuItemNuevoTipoMoneda.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=this.jMenuItemNuevoRelacionesTipoMoneda.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
			this.isVisibilidadCeldaModificarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jMenuItemModificarTipoMoneda.isVisible();
			this.isVisibilidadCeldaActualizarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jMenuItemActualizarTipoMoneda.isVisible();
			this.isVisibilidadCeldaEliminarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jMenuItemEliminarTipoMoneda.isVisible();
			this.isVisibilidadCeldaCancelarTipoMoneda=this.jInternalFrameDetalleFormTipoMoneda.jMenuItemCancelarTipoMoneda.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMoneda=this.jMenuItemGuardarCambiosTipoMoneda.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMoneda=this.jMenuItemGuardarCambiosTablaTipoMoneda.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoMoneda(Boolean esInicializar) {
		if(TipoMonedaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipomonedaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMoneda();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoMoneda(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoMoneda() {
		this.jButtonNuevoTipoMoneda.setVisible(this.isPermisoNuevoTipoMoneda);			
		this.jButtonDuplicarTipoMoneda.setVisible(this.isPermisoDuplicarTipoMoneda);			
		this.jButtonCopiarTipoMoneda.setVisible(this.isPermisoCopiarTipoMoneda);			
		this.jButtonVerFormTipoMoneda.setVisible(this.isPermisoVerFormTipoMoneda);			
		
		this.jButtonAbrirOrderByTipoMoneda.setVisible(this.isPermisoOrdenTipoMoneda);					
		
		this.jButtonNuevoRelacionesTipoMoneda.setVisible(this.isPermisoNuevoTipoMoneda);			
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.jButtonModificarTipoMoneda.setVisible(this.isPermisoActualizarTipoMoneda);	
			this.jInternalFrameDetalleFormTipoMoneda.jButtonActualizarTipoMoneda.setVisible(this.isPermisoActualizarTipoMoneda);	
			this.jInternalFrameDetalleFormTipoMoneda.jButtonEliminarTipoMoneda.setVisible(this.isPermisoEliminarTipoMoneda);
			this.jInternalFrameDetalleFormTipoMoneda.jButtonCancelarTipoMoneda.setVisible(this.isVisibilidadCeldaCancelarTipoMoneda);						
			this.jInternalFrameDetalleFormTipoMoneda.jButtonGuardarCambiosTipoMoneda.setVisible(this.isPermisoGuardarCambiosTipoMoneda);							
		}
		
		this.jButtonGuardarCambiosTablaTipoMoneda.setVisible(this.isPermisoActualizarTipoMoneda);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMoneda() {
		this.jInternalFrameDetalleFormTipoMoneda.jButtonModificarTipoMoneda.setVisible(this.isPermisoActualizarTipoMoneda);	
		this.jInternalFrameDetalleFormTipoMoneda.jButtonActualizarTipoMoneda.setVisible(this.isPermisoActualizarTipoMoneda);	
		this.jInternalFrameDetalleFormTipoMoneda.jButtonEliminarTipoMoneda.setVisible(this.isPermisoEliminarTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.jButtonCancelarTipoMoneda.setVisible(this.isVisibilidadCeldaCancelarTipoMoneda);							
		this.jInternalFrameDetalleFormTipoMoneda.jButtonGuardarCambiosTipoMoneda.setVisible((this.isVisibilidadCeldaGuardarTipoMoneda && this.isPermisoGuardarCambiosTipoMoneda));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoMoneda() {
		if(TipoMonedaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoMoneda();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoMoneda() {
	}
	
	public void jTableDatosTipoMonedaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoMoneda(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoMonedaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMoneda(this.gettipomoneda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomoneda==null) {
						this.tipomoneda = new TipoMoneda();
					}

					this.setVariablesFormularioToObjetoActualTipoMoneda(this.tipomoneda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
				}

				if(this.tipomoneda.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipomoneda.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMoneda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoMonedaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMoneda(this.gettipomoneda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomoneda==null) {
						this.tipomoneda = new TipoMoneda();
					}

					this.setVariablesFormularioToObjetoActualTipoMoneda(this.tipomoneda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
				}

				if(this.tipomoneda.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipomoneda.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMoneda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsiglaTipoMonedaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMoneda(this.gettipomoneda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomoneda==null) {
						this.tipomoneda = new TipoMoneda();
					}

					this.setVariablesFormularioToObjetoActualTipoMoneda(this.tipomoneda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
				}

				if(this.tipomoneda.getsigla()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sigla like '%"+this.tipomoneda.getsigla()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMoneda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsimboloTipoMonedaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMoneda(this.gettipomoneda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomoneda==null) {
						this.tipomoneda = new TipoMoneda();
					}

					this.setVariablesFormularioToObjetoActualTipoMoneda(this.tipomoneda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
				}

				if(this.tipomoneda.getsimbolo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where simbolo like '%"+this.tipomoneda.getsimbolo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMoneda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoTipoMonedaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMoneda(this.gettipomoneda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomoneda==null) {
						this.tipomoneda = new TipoMoneda();
					}

					this.setVariablesFormularioToObjetoActualTipoMoneda(this.tipomoneda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);
				}

				if(this.tipomoneda.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.tipomoneda.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMoneda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoMonedaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMoneda(false,false);

			this.getTipoMonedasBusquedaPorNombre();

			this.inicializarActualizarBindingTipoMoneda(false);

			//if(TipoMonedaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMoneda(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorSiglaTipoMonedaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMoneda(false,false);

			this.getTipoMonedasBusquedaPorSigla();

			this.inicializarActualizarBindingTipoMoneda(false);

			//if(TipoMonedaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMoneda(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorSimboloTipoMonedaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMoneda(false,false);

			this.getTipoMonedasBusquedaPorSimbolo();

			this.inicializarActualizarBindingTipoMoneda(false);

			//if(TipoMonedaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMoneda(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomonedaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoMoneda() {
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
		

		if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
			this.jInternalFrameDetalleFormTipoMoneda.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoMoneda.dispose();
			this.jInternalFrameDetalleFormTipoMoneda=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoMoneda!=null) {
			this.jInternalFrameReporteDinamicoTipoMoneda.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoMoneda.dispose();
			this.jInternalFrameReporteDinamicoTipoMoneda=null;
		}
		
		if(this.jInternalFrameImportacionTipoMoneda!=null) {
			this.jInternalFrameImportacionTipoMoneda.setVisible(false);	    			
			this.jInternalFrameImportacionTipoMoneda.dispose();
			this.jInternalFrameImportacionTipoMoneda=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoMoneda();
			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoMoneda")) {
				jButtonNuevoTipoMonedaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoMoneda")) {
				jButtonDuplicarTipoMonedaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoMoneda")) {
				jButtonCopiarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoMoneda")) {
				jButtonVerFormTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoMoneda")) {
				jButtonNuevoTipoMonedaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoMoneda")) {
				jButtonDuplicarTipoMonedaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoMoneda")) {
				jButtonNuevoTipoMonedaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoMoneda")) {
				jButtonDuplicarTipoMonedaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoMoneda")) {
				jButtonNuevoTipoMonedaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoMoneda")) {
				jButtonNuevoTipoMonedaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoMoneda")) {
				jButtonNuevoTipoMonedaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoMoneda")) {
				jButtonModificarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoMoneda")) {
				jButtonModificarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoMoneda")) {
				jButtonModificarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoMoneda")) {
				jButtonActualizarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoMoneda")) {
				jButtonActualizarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoMoneda")) {
				jButtonActualizarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoMoneda")) {
				jButtonEliminarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoMoneda")) {
				jButtonEliminarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoMoneda")) {
				jButtonEliminarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoMoneda")) {
				jButtonCancelarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoMoneda")) {
				jButtonCancelarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoMoneda")) {
				jButtonCancelarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoMoneda")) {
				jButtonCerrarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoMoneda")) {
				jButtonCerrarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoMoneda")) {
				jButtonCerrarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoMoneda")) {
				jButtonMostrarOcultarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoMoneda")) {
				jButtonCancelarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoMoneda")) {
				jButtonGuardarCambiosTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoMoneda")) {
				jButtonGuardarCambiosTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoMoneda")) {
				jButtonCopiarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoMoneda")) {
				jButtonVerFormTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoMoneda")) {
				jButtonGuardarCambiosTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoMoneda")) {
				jButtonCopiarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoMoneda")) {
				jButtonVerFormTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoMoneda")) {
				jButtonGuardarCambiosTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoMoneda")) {
				jButtonGuardarCambiosTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoMoneda")) {
				jButtonGuardarCambiosTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoMoneda")) {
				jButtonRecargarInformacionTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoMoneda")) {
				jButtonRecargarInformacionTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoMoneda")) {
				jButtonRecargarInformacionTipoMonedaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoMoneda")) {
				jButtonAnterioresTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoMoneda")) {
				jButtonAnterioresTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoMoneda")) {
				jButtonAnterioresTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoMoneda")) {
				jButtonSiguientesTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoMoneda")) {
				jButtonSiguientesTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoMoneda")) {
				jButtonSiguientesTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoMoneda") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoMoneda")) {
				jButtonAbrirOrderByTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoMoneda") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoMoneda")) {
				jButtonMostrarOcultarTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMoneda")) {
				jButtonNuevoGuardarCambiosTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoMoneda")) {
				jButtonNuevoGuardarCambiosTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoMoneda")) {
				jButtonNuevoGuardarCambiosTipoMonedaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoMoneda")) {
				jButtonCerrarReporteDinamicoTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoMoneda")) {
				jButtonGenerarReporteDinamicoTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoMoneda")) {
				
				jButtonGenerarExcelReporteDinamicoTipoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoMoneda")) {
				jButtonCerrarImportacionTipoMonedaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoMoneda")) {
				
				jButtonGenerarImportacionTipoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoMoneda")) {
				
				jButtonAbrirImportacionTipoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoMoneda")) {
				jComboBoxTiposAccionesTipoMonedaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoMoneda")) {
				jComboBoxTiposRelacionesTipoMonedaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoMoneda")) {
				jComboBoxTiposAccionesTipoMonedaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoMoneda")) {
				
				jComboBoxTiposSeleccionarTipoMonedaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoMoneda")) {
				jTextFieldValorCampoGeneralTipoMonedaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoMoneda")) {
				jButtonAbrirOrderByTipoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoMoneda")) {
				jButtonAbrirOrderByTipoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoMoneda")) {
				jButtonCerrarOrderByTipoMonedaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMonedaBusqueda")) {
				this.jButtonidTipoMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMonedaBusqueda")) {
				this.jButtonnombreTipoMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglaTipoMonedaBusqueda")) {
				this.jButtonsiglaTipoMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("simboloTipoMonedaBusqueda")) {
				this.jButtonsimboloTipoMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoTipoMonedaBusqueda")) {
				this.jButtonesta_activoTipoMonedaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoMoneda")) {
				this.jButtonBusquedaPorNombreTipoMonedaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorSiglaTipoMoneda")) {
				this.jButtonBusquedaPorSiglaTipoMonedaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorSimboloTipoMoneda")) {
				this.jButtonBusquedaPorSimboloTipoMonedaActionPerformed(evt);
			}
			
			;
			
			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoMoneda();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMonedaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				


				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoMoneda tipomonedaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipomonedaLocal=this.tipomoneda;
			} else {
				tipomonedaLocal=this.tipomonedaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
							
				
				


				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMonedaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaAnterior =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomonedaAnterior =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
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
			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			
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
			
			


			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMonedaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
								
						
				


				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoneda.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
								
				
				


				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMonedaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaAnterior =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomonedaAnterior =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMonedaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaAnterior =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomonedaAnterior =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMonedaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
							
				
				


				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoneda.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMonedaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomonedaAnterior =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomonedaAnterior =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
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
			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			
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
			
			


			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMonedaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
								
				
				


				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMonedaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaAnterior =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomonedaAnterior =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMonedaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMonedaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoMoneda")) {
					jCheckBoxSeleccionarTodosTipoMonedaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoMoneda")) {
					jCheckBoxSeleccionadosTipoMonedaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoMoneda")) {
					
				}
				
				


				
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
												
				
				


				
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMonedaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomonedaAnterior =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomonedaAnterior =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMonedaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
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
			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
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
			
			


			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMonedaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoneda.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoneda.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomoneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomoneda);
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
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
				
				


				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoneda.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMonedaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomonedaAnterior =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomonedaAnterior =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoMoneda")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoMonedaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoMoneda.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipomoneda =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipomoneda =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipomoneda);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoMoneda")) {
				
				}
				
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoMoneda")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoMoneda.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoMoneda")) {
			
			}
			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoMoneda();
			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoMoneda")) {
				jButtonNuevoTipoMonedaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoMoneda")) {
				jButtonDuplicarTipoMonedaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoMoneda")) {
				jButtonCopiarTipoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoMoneda")) {
				jButtonVerFormTipoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoMoneda")) {
				jButtonNuevoTipoMonedaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoMoneda")) {
				jButtonModificarTipoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoMoneda")) {
				jButtonActualizarTipoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoMoneda")) {
				jButtonEliminarTipoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoMoneda")) {
				jButtonGuardarCambiosTipoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoMoneda")) {
				jButtonCancelarTipoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoMoneda")) {
				jButtonCerrarTipoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoMoneda")) {
				jButtonGuardarCambiosTipoMonedaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMoneda")) {
				jButtonNuevoGuardarCambiosTipoMonedaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoMoneda")) {
				jButtonAbrirOrderByTipoMonedaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoMoneda")) {
				jButtonRecargarInformacionTipoMonedaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoMoneda")) {
				jButtonAnterioresTipoMonedaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoMoneda")) {
				jButtonSiguientesTipoMonedaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMonedaBusqueda")) {
				this.jButtonidTipoMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMonedaBusqueda")) {
				this.jButtonnombreTipoMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglaTipoMonedaBusqueda")) {
				this.jButtonsiglaTipoMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("simboloTipoMonedaBusqueda")) {
				this.jButtonsimboloTipoMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoTipoMonedaBusqueda")) {
				this.jButtonesta_activoTipoMonedaBusquedaActionPerformed(evt);
			}
			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoMoneda();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoMoneda")) {
				closingInternalFrameTipoMoneda();
				
			} else if(sTipo.equals("jButtonCancelarTipoMoneda")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoMoneda = (JInternalFrameBase)evt.getSource();
	            	
	            TipoMonedaBeanSwingJInternalFrame jInternalFrameParent=(TipoMonedaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMoneda.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoMonedaActionPerformed(null);
			}
			
			TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomoneda,new Object(),this.tipomonedaParameterGeneral,this.tipomonedaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoMoneda(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoMoneda(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoMoneda(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipomoneda)) {
			if(!esControlTabla) {
				if(TipoMonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoMoneda(this.tipomoneda,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);			
				}
				
				if(this.tipomonedaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoMoneda(this.tipomoneda,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomonedaReturnGeneral=tipomonedaLogic.procesarEventosTipoMonedasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomonedaLogic.getTipoMonedas(),this.tipomoneda,this.tipomonedaParameterGeneral,this.isEsNuevoTipoMoneda,classes);//this.tipomonedaLogic.getTipoMoneda()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoMoneda(this.tipomonedaReturnGeneral,this.tipomonedaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipomonedaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoMoneda(classes,this.tipomonedaReturnGeneral,this.tipomonedaBean,false);
					}
						
					if(this.tipomonedaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoMoneda(this.tipomonedaReturnGeneral.getTipoMoneda());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoMoneda(this.tipomonedaReturnGeneral.getTipoMoneda());	
					}
						
					if(this.tipomonedaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoMoneda(this.tipomonedaReturnGeneral.getTipoMoneda(),classes);//this.tipomonedaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoMoneda(this.tipomoneda,classes);//this.tipomonedaBean);									
				}
			
				if(TipoMonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoMoneda(this.tipomoneda,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoneda(this.tipomoneda);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipomonedaAnterior!=null) {
						this.tipomoneda=this.tipomonedaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomonedaReturnGeneral=tipomonedaLogic.procesarEventosTipoMonedasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomonedaLogic.getTipoMonedas(),this.tipomoneda,this.tipomonedaParameterGeneral,this.isEsNuevoTipoMoneda,classes);//this.tipomonedaLogic.getTipoMoneda()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomonedaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomonedaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipomonedaReturnGeneral.getTipoMoneda(),tipomonedaLogic.getTipoMonedas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipomonedaReturnGeneral.getTipoMoneda(),this.tipomonedas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoMoneda.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoMoneda.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoMoneda();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoMoneda() throws Exception {
		
		TipoMonedaModel tipomonedaModel=(TipoMonedaModel)this.jTableDatosTipoMoneda.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomonedaModel.tipomonedas=this.tipomonedaLogic.getTipoMonedas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipomonedaModel.tipomonedas=this.tipomonedas;
		}
		
		
		((TipoMonedaModel) this.jTableDatosTipoMoneda.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoMoneda() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipomonedaAnterior(),this.tipomonedaLogic.getTipoMonedas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipomonedaAnterior(),this.tipomonedas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoMoneda();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoMoneda(TipoMoneda tipomoneda,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroContabilidadDefecto.class)) {
					this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(tipomoneda.getParametroContabilidadDefectos());
					this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
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
										
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomoneda,new Object(),generalEntityParameterGeneral,this.tipomonedaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipomonedaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoMonedaConstantesFunciones.getClassesRelationshipsOfTipoMoneda(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoMonedaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoMoneda(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoMoneda(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoMonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomoneda,new Object(),generalEntityParameterGeneral,this.tipomonedaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoMoneda(TipoMonedaBean tipomonedaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroContabilidadDefecto.class)) {
					this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(tipomoneda.getParametroContabilidadDefectos());
					this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoMoneda(ArrayList<Classe> classes,TipoMonedaReturnGeneral tipomonedaReturnGeneral,TipoMonedaBean tipomonedaBean,Boolean conDefault) throws Exception {
		
			this.tipomonedaBean.setParametroContabilidadDefectos(tipomonedaReturnGeneral.getTipoMoneda().getParametroContabilidadDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoMoneda(TipoMoneda tipomoneda,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroContabilidadDefecto.class)) {
					tipomoneda.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipomoneda)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoMoneda = new TipoMonedaDetalleFormJInternalFrame(jDesktopPane,this.tipomonedaSessionBean.getConGuardarRelaciones(),this.tipomonedaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.setVisible(false);
		this.jInternalFrameDetalleFormTipoMoneda.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoMoneda.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoMoneda.tipomonedaLogic=this.tipomonedaLogic;
		
		this.cargarCombosFrameForeignKeyTipoMoneda("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMoneda();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMoneda();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoMoneda("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoMoneda();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoMoneda.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMoneda"));
		
		this.jInternalFrameDetalleFormTipoMoneda.jButtonModificarTipoMoneda.addActionListener(new ButtonActionListener(this,"ModificarTipoMoneda"));

		
		this.jInternalFrameDetalleFormTipoMoneda.jButtonModificarToolBarTipoMoneda.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMoneda"));
					
		this.jInternalFrameDetalleFormTipoMoneda.jMenuItemModificarTipoMoneda.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMoneda"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMoneda.jButtonActualizarTipoMoneda.addActionListener (new ButtonActionListener(this,"ActualizarTipoMoneda"));
		
		
		this.jInternalFrameDetalleFormTipoMoneda.jButtonActualizarToolBarTipoMoneda.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMoneda"));
						
		this.jInternalFrameDetalleFormTipoMoneda.jMenuItemActualizarTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMoneda"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMoneda.jButtonEliminarTipoMoneda.addActionListener (new ButtonActionListener(this,"EliminarTipoMoneda"));
		
		
		this.jInternalFrameDetalleFormTipoMoneda.jButtonEliminarToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMoneda"));
								
		this.jInternalFrameDetalleFormTipoMoneda.jMenuItemEliminarTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMoneda"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMoneda.jButtonCancelarTipoMoneda.addActionListener (new ButtonActionListener(this,"CancelarTipoMoneda"));
		
		
		this.jInternalFrameDetalleFormTipoMoneda.jButtonCancelarToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMoneda"));
					
		this.jInternalFrameDetalleFormTipoMoneda.jMenuItemCancelarTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMoneda"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoMoneda.jMenuItemDetalleCerrarTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMoneda"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMoneda.jButtonGuardarCambiosToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMoneda"));
		
		
		
		this.jInternalFrameDetalleFormTipoMoneda.jButtonGuardarCambiosToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMoneda"));
		
		
		
		this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMoneda"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonidTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonnombreTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonsiglaTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"siglaTipoMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonsimboloTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"simboloTipoMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonesta_activoTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoTipoMonedaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoMoneda.jTabbedPaneRelacionesTipoMoneda.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMoneda"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoMoneda"));
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMoneda"));
		}
		
		this.jTableDatosTipoMoneda.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoMoneda"));
		
		this.jTableDatosTipoMoneda.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoMoneda"));
		
		this.jButtonNuevoTipoMoneda.addActionListener(new ButtonActionListener(this,"NuevoTipoMoneda"));
		
		this.jButtonDuplicarTipoMoneda.addActionListener(new ButtonActionListener(this,"DuplicarTipoMoneda"));
		
		this.jButtonCopiarTipoMoneda.addActionListener(new ButtonActionListener(this,"CopiarTipoMoneda"));
		
		this.jButtonVerFormTipoMoneda.addActionListener(new ButtonActionListener(this,"VerFormTipoMoneda"));
		
		
		this.jButtonNuevoToolBarTipoMoneda.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoMoneda"));
			
		this.jButtonDuplicarToolBarTipoMoneda.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoMoneda"));
			
		this.jMenuItemNuevoTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoMoneda"));
			
		this.jMenuItemDuplicarTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoMoneda"));		
		
		
		this.jButtonNuevoRelacionesTipoMoneda.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoMoneda"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoMoneda.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoMoneda"));
			
		this.jMenuItemNuevoRelacionesTipoMoneda.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoMoneda"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.jButtonModificarTipoMoneda.addActionListener(new ButtonActionListener(this,"ModificarTipoMoneda"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.jButtonModificarToolBarTipoMoneda.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMoneda"));
			
			this.jInternalFrameDetalleFormTipoMoneda.jMenuItemModificarTipoMoneda.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMoneda"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoMoneda.jButtonActualizarTipoMoneda.addActionListener (new ButtonActionListener(this,"ActualizarTipoMoneda"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.jButtonActualizarToolBarTipoMoneda.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMoneda"));
				
			this.jInternalFrameDetalleFormTipoMoneda.jMenuItemActualizarTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMoneda"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.jButtonEliminarTipoMoneda.addActionListener (new ButtonActionListener(this,"EliminarTipoMoneda"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.jButtonEliminarToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMoneda"));
						
			this.jInternalFrameDetalleFormTipoMoneda.jMenuItemEliminarTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMoneda"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.jButtonCancelarTipoMoneda.addActionListener (new ButtonActionListener(this,"CancelarTipoMoneda"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.jButtonCancelarToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMoneda"));
			
			this.jInternalFrameDetalleFormTipoMoneda.jMenuItemCancelarTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMoneda"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoMoneda"));		
		
		
		this.jButtonCerrarTipoMoneda.addActionListener (new ButtonActionListener(this,"CerrarTipoMoneda"));
		
		
		this.jButtonCerrarToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoMoneda"));
			
		this.jMenuItemCerrarTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoMoneda"));
			
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.jMenuItemDetalleCerrarTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMoneda"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.jButtonGuardarCambiosTipoMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoMoneda"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.jButtonGuardarCambiosToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMoneda"));
		}
		
		this.jButtonCopiarToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoMoneda"));
			
		this.jButtonVerFormToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoMoneda"));
		
		this.jMenuItemGuardarCambiosTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoMoneda"));
			
		this.jMenuItemCopiarTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoMoneda"));		
		
		this.jMenuItemVerFormTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoMoneda"));		
		
		
		this.jButtonGuardarCambiosTablaTipoMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMoneda"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoMoneda"));
			
		this.jMenuItemGuardarCambiosTablaTipoMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMoneda"));		
		
		
		
		this.jButtonRecargarInformacionTipoMoneda.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoMoneda"));
					
		this.jButtonRecargarInformacionToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoMoneda"));
		
		this.jMenuItemRecargarInformacionTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoMoneda"));		
		
		
		
		this.jButtonAnterioresTipoMoneda.addActionListener (new ButtonActionListener(this,"AnterioresTipoMoneda"));
		
		
		this.jButtonAnterioresToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoMoneda"));
		
		this.jMenuItemAnterioresTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoMoneda"));		
		
		
		this.jButtonSiguientesTipoMoneda.addActionListener (new ButtonActionListener(this,"SiguientesTipoMoneda"));
		
		
		this.jButtonSiguientesToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoMoneda"));
			
		this.jMenuItemSiguientesTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoMoneda"));
			
		this.jMenuItemAbrirOrderByTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoMoneda"));
			
		this.jMenuItemMostrarOcultarTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoMoneda"));
			
		this.jMenuItemDetalleAbrirOrderByTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoMoneda"));
			
		this.jMenuItemDetalleMostarOcultarTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoMoneda"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoMoneda.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoMoneda"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoMoneda"));
			
		this.jMenuItemNuevoGuardarCambiosTipoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoMoneda"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoMoneda.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoMoneda"));

		this.jCheckBoxSeleccionadosTipoMoneda.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoMoneda"));
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMoneda"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoMoneda.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoMoneda"));
			
		this.jComboBoxTiposAccionesTipoMoneda.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoMoneda"));
					
		this.jComboBoxTiposSeleccionarTipoMoneda.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoMoneda"));
			
		this.jTextFieldValorCampoGeneralTipoMoneda.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoMoneda"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonidTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonnombreTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonsiglaTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"siglaTipoMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonsimboloTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"simboloTipoMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonesta_activoTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoTipoMonedaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoMoneda.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoMoneda"));

			this.jButtonBusquedaPorSiglaTipoMoneda.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglaTipoMoneda"));

			this.jButtonBusquedaPorSimboloTipoMoneda.addActionListener(new ButtonActionListener(this,"BusquedaPorSimboloTipoMoneda"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoMoneda!=null) {
				this.jInternalFrameReporteDinamicoTipoMoneda.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMoneda"));
				this.jInternalFrameReporteDinamicoTipoMoneda.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMoneda"));
				this.jInternalFrameReporteDinamicoTipoMoneda.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMoneda"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoMoneda.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMoneda"));				
			//this.jButtonGenerarReporteDinamicoTipoMoneda.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMoneda"));
			//this.jButtonGenerarExcelReporteDinamicoTipoMoneda.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMoneda"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoMoneda!=null) {
				this.jInternalFrameImportacionTipoMoneda.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMoneda"));
				this.jInternalFrameImportacionTipoMoneda.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMoneda"));
				this.jInternalFrameImportacionTipoMoneda.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMoneda"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoMoneda.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoMoneda"));
			
			this.jButtonAbrirOrderByToolBarTipoMoneda.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoMoneda"));			
			
			if(this.jInternalFrameOrderByTipoMoneda!=null) {
				this.jInternalFrameOrderByTipoMoneda.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMoneda"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoneda.jTabbedPaneRelacionesTipoMoneda.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMoneda"));
		
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
            		closingInternalFrameTipoMoneda();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoMoneda.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoMoneda = (JInternalFrameBase)event.getSource();
	            	
	            TipoMonedaBeanSwingJInternalFrame jInternalFrameParent=(TipoMonedaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMoneda.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoMonedaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoMoneda.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoMonedaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoMoneda.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoMoneda.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMonedaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMonedaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMonedaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoMoneda";
		inputMap = this.jButtonNuevoTipoMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMonedaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMonedaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMonedaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMonedaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoMoneda";
		inputMap = this.jButtonNuevoRelacionesTipoMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMonedaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoMoneda";
		inputMap = this.jButtonModificarTipoMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoMonedaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoMoneda";
		inputMap = this.jButtonActualizarTipoMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoMonedaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoMoneda";
		inputMap = this.jButtonEliminarTipoMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoMonedaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoMoneda";
		inputMap = this.jButtonCancelarTipoMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoMonedaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoMoneda";
		inputMap = this.jButtonCerrarTipoMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoMonedaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoMoneda.jButtonGuardarCambiosTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoMoneda";
		inputMap = this.jInternalFrameDetalleFormTipoMoneda.jButtonGuardarCambiosTipoMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoMoneda.jButtonGuardarCambiosTipoMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoMonedaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoMoneda.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoMonedaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoMoneda.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoMonedaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoMoneda.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoMonedaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoMoneda.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoMonedaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonidTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonnombreTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonsiglaTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"siglaTipoMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonsimboloTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"simboloTipoMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoneda.jButtonesta_activoTipoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoTipoMonedaBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoMoneda.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoMoneda"));

		this.jButtonBusquedaPorSiglaTipoMoneda.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglaTipoMoneda"));

		this.jButtonBusquedaPorSimboloTipoMoneda.addActionListener(new ButtonActionListener(this,"BusquedaPorSimboloTipoMoneda"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoMonedaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoMoneda.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoMoneda(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoMoneda tipomonedaAux:this.tipomonedaLogic.getTipoMonedas()) {
					tipomonedaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMoneda tipomonedaAux:tipomonedas) {
					tipomonedaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoMonedaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMoneda(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMoneda tipomonedaAux:this.tipomonedaLogic.getTipoMonedas()) {
						tipomonedaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMoneda tipomonedaAux:tipomonedas) {
						tipomonedaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoMoneda tipomonedaAux:this.tipomonedaLogic.getTipoMonedas()) {
					
						if(sTipoSeleccionar.equals(TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							tipomonedaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMoneda tipomonedaAux:tipomonedas) {
						
						if(sTipoSeleccionar.equals(TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							tipomonedaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMoneda(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMoneda.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMoneda.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMoneda,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoMonedaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMoneda(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoMoneda.getSelectedRows();
			
			TipoMoneda tipomonedaLocal=new TipoMoneda();
			
			//this.seleccionarTodosTipoMoneda(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomonedaLocal =(TipoMoneda) this.tipomonedaLogic.getTipoMonedas().toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipomonedaLocal =(TipoMoneda) this.tipomonedas.toArray()[this.jTableDatosTipoMoneda.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipomonedaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMoneda tipomonedaAux:this.tipomonedaLogic.getTipoMonedas()) {
						tipomonedaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMoneda tipomonedaAux:tipomonedas) {
						tipomonedaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoMoneda(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMoneda.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMoneda.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMoneda,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoMonedaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoMonedaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoMonedaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoMoneda(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoMoneda.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMoneda tipomonedaAux:this.tipomonedaLogic.getTipoMonedas()) {
				
						if(sTipoSeleccionar.equals(TipoMonedaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomonedaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMonedaConstantesFunciones.LABEL_SIGLA)) {
							existe=true;
							tipomonedaAux.setsigla(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMonedaConstantesFunciones.LABEL_SIMBOLO)) {
							existe=true;
							tipomonedaAux.setsimbolo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMoneda tipomonedaAux:tipomonedas) {
					
						if(sTipoSeleccionar.equals(TipoMonedaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomonedaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMonedaConstantesFunciones.LABEL_SIGLA)) {
							existe=true;
							tipomonedaAux.setsigla(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMonedaConstantesFunciones.LABEL_SIMBOLO)) {
							existe=true;
							tipomonedaAux.setsimbolo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMoneda(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoMonedaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoMoneda(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoMoneda=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoMoneda.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoMoneda) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoMoneda(conSplash);
				
					this.generarReporteTipoMonedasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMoneda.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoMonedasSeleccionados();
				//this.jComboBoxTiposAccionesTipoMoneda.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMonedasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoMoneda.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMonedasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoMoneda.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMoneda();
				
				this.exportarTipoMonedasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMoneda.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoMonedas();
				//this.importarTipoMonedas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMoneda.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMoneda();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoMonedasSeleccionados();
				//this.jComboBoxTiposAccionesTipoMoneda.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Moneda", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoMoneda();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoMoneda)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoMoneda(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Moneda",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMoneda.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoMonedaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoMoneda) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoMoneda(conSplash);
					
						//this.actualizarParametrosGeneralTipoMoneda();
						
						this.generarReporteProcesoAccionTipoMonedasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoMoneda.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoMonedaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo MonedaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Moneda", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoMoneda();
				
						this.actualizarParametrosGeneralTipoMoneda();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipomonedaReturnGeneral=tipomonedaLogic.procesarAccionTipoMonedasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipomonedaLogic.getTipoMonedas(),this.tipomonedaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoMonedaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoMoneda.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoMoneda();
					
					TipoMonedaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoMonedaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoMoneda.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoMoneda.jComboBoxTiposAccionesFormularioTipoMoneda.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoMoneda(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoMonedaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoMoneda();
			
			if(this.jInternalFrameDetalleFormTipoMoneda==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();		
			TipoMoneda tipomoneda=new TipoMoneda();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoMoneda(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoMoneda.getSelectedItem();
			
			
			
			
			tipomonedasSeleccionados=this.getTipoMonedasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipomonedasSeleccionados.size()==1) {
				for(TipoMoneda tipomonedaAux:tipomonedasSeleccionados) {
					tipomoneda=tipomonedaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Parametro Contabilidad Defecto")) {
					jButtonParametroContabilidadDefectoActionPerformed(null,rowIndex,true,false,tipomoneda);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoMoneda();
			
      		//this.finishProcessTipoMoneda(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoMonedaReturnGeneral() throws Exception {
		if(this.tipomonedaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipomonedaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipomonedaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipomonedaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipomonedaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipomonedaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoMoneda(false);
		}
		
		if(this.tipomonedaReturnGeneral.getConRetornoLista() || this.tipomonedaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipomonedaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomonedaLogic.setTipoMonedas(this.tipomonedaReturnGeneral.getTipoMonedas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipomonedaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomonedaLogic.setTipoMoneda(this.tipomonedaReturnGeneral.getTipoMoneda());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoMoneda(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoMoneda() throws Exception {
		
		
	}
	
	public ArrayList<TipoMoneda> getTipoMonedasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoMoneda) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoMoneda tipomonedaAux:tipomonedaLogic.getTipoMonedas()) {
					if(tipomonedaAux.getIsSelected()) {
						tipomonedasSeleccionados.add(tipomonedaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMoneda tipomonedaAux:this.tipomonedas) {
					if(tipomonedaAux.getIsSelected()) {
						tipomonedasSeleccionados.add(tipomonedaAux);				
					}
				}
			}
			
			if(tipomonedasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipomonedasSeleccionados.addAll(this.tipomonedaLogic.getTipoMonedas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipomonedasSeleccionados.addAll(this.tipomonedas);				
					}
				}
			}
		} else {
			tipomonedasSeleccionados.add(this.tipomoneda);
		}
		
		return tipomonedasSeleccionados;
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
	
	public void generarReporteTipoMonedasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoMonedasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoMonedasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMonedasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMonedasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoMonedasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Moneda",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoMonedasSeleccionados() throws Exception {
		ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();		
		
		tipomonedasSeleccionados=this.getTipoMonedasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoMonedas("Todos",tipomonedasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoMonedasSeleccionados() throws Exception {
		ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();		
		
		tipomonedasSeleccionados=this.getTipoMonedasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoMonedas("Todos",tipomonedasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoMonedasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();
		
		tipomonedasSeleccionados=this.getTipoMonedasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoMonedas("Todos",tipomonedasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoMonedasSeleccionados() throws Exception {
		ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoMoneda();
		
		
		tipomonedasSeleccionados=this.getTipoMonedasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoMoneda();
		
		
		//this.generarReporteTipoMonedas("Todos",tipomonedasSeleccionados ,tipomonedaImplementable,tipomonedaImplementableHome);
	}
	
	public void mostrarImportacionTipoMonedas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoMoneda();
		
		this.abrirFrameImportacionTipoMoneda();		
		
			
		//this.generarReporteTipoMonedas("Todos",tipomonedasSeleccionados ,tipomonedaImplementable,tipomonedaImplementableHome);
	}
	
	public void importarTipoMonedas() throws Exception {		
	
	}
	
	public void exportarTipoMonedasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoMonedasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoMonedasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoMonedasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Moneda",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoMonedasSeleccionados() throws Exception {
		ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();		
		
		tipomonedasSeleccionados=this.getTipoMonedasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomoneda."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoMoneda(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoMoneda tipomonedaAux:tipomonedasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoMoneda(tipomonedaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipomonedaAux.setsDetalleGeneralEntityReporte(tipomonedaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Moneda",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoMoneda(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoMonedaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMonedaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMonedaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMonedaConstantesFunciones.LABEL_SIGLA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMonedaConstantesFunciones.LABEL_SIMBOLO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoMoneda(TipoMoneda tipomoneda,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipomoneda.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomoneda.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomoneda.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomoneda.getsigla();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomoneda.getsimbolo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomoneda.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoMonedasSeleccionados() throws Exception {
		ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();		
		
		tipomonedasSeleccionados=this.getTipoMonedasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomoneda.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoMonedas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoMoneda(row);				
				iRow++;
			}				
			
			for(TipoMoneda tipomonedaAux:tipomonedasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoMoneda(tipomonedaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Moneda",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoMonedasSeleccionados() throws Exception {
		ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();		
		
		tipomonedasSeleccionados=this.getTipoMonedasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomoneda.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipomonedas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipomoneda");
			//elementRoot.appendChild(element);
		
			for(TipoMoneda tipomonedaAux:tipomonedasSeleccionados) {
				element = document.createElement("tipomoneda");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoMoneda(tipomonedaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Moneda",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoMoneda(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_SIGLA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_SIMBOLO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoMoneda(TipoMoneda tipomoneda,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipomoneda.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomoneda.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomoneda.getsigla());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomoneda.getsimbolo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomoneda.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlTipoMoneda(TipoMoneda tipomoneda,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoMonedaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipomoneda.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoMonedaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipomoneda.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoMonedaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipomoneda.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementsigla = document.createElement(TipoMonedaConstantesFunciones.SIGLA);
		elementsigla.appendChild(document.createTextNode(tipomoneda.getsigla().trim()));
		element.appendChild(elementsigla);

		Element elementsimbolo = document.createElement(TipoMonedaConstantesFunciones.SIMBOLO);
		elementsimbolo.appendChild(document.createTextNode(tipomoneda.getsimbolo().trim()));
		element.appendChild(elementsimbolo);

		Element elementesta_activo = document.createElement(TipoMonedaConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(tipomoneda.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoTipoMonedasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoMoneda> tipomonedasSeleccionados=new ArrayList<TipoMoneda>();
		
		tipomonedasSeleccionados=this.getTipoMonedasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoMoneda(tipomonedasSeleccionados);
		
		this.generarReporteTipoMonedas("Todos",tipomonedasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoMoneda(ArrayList<TipoMoneda> tipomonedasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoMoneda tipomonedaAux:tipomonedasSeleccionados) {
				tipomonedaAux.setsDetalleGeneralEntityReporte(tipomonedaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoMonedaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipomonedaAux.setsDescripcionGeneralEntityReporte1(tipomonedaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoMonedaConstantesFunciones.LABEL_SIGLA)) {
					existe=true;
					tipomonedaAux.setsDescripcionGeneralEntityReporte1(tipomonedaAux.getsigla());
				}
				 else if(sTipoSeleccionar.equals(TipoMonedaConstantesFunciones.LABEL_SIMBOLO)) {
					existe=true;
					tipomonedaAux.setsDescripcionGeneralEntityReporte1(tipomonedaAux.getsimbolo());
				}
				 else if(sTipoSeleccionar.equals(TipoMonedaConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					tipomonedaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tipomonedaAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoMoneda(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoMoneda=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=true;
				this.isVisibilidadCeldaGuardarCambiosTipoMoneda=true;
			}
			
			this.isVisibilidadCeldaModificarTipoMoneda=false;
			this.isVisibilidadCeldaActualizarTipoMoneda=false;
			this.isVisibilidadCeldaEliminarTipoMoneda=false;
			this.isVisibilidadCeldaCancelarTipoMoneda=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoneda=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoneda=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoMoneda=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoneda=false;
			this.isVisibilidadCeldaModificarTipoMoneda=false;
			this.isVisibilidadCeldaActualizarTipoMoneda=true;
			this.isVisibilidadCeldaEliminarTipoMoneda=false;
			this.isVisibilidadCeldaCancelarTipoMoneda=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoneda=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoneda=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoMoneda=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoneda=false;
			this.isVisibilidadCeldaModificarTipoMoneda=false;
			this.isVisibilidadCeldaActualizarTipoMoneda=true;
			this.isVisibilidadCeldaEliminarTipoMoneda=true;
			this.isVisibilidadCeldaCancelarTipoMoneda=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoneda=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoneda=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoMoneda=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoneda=false;
			this.isVisibilidadCeldaModificarTipoMoneda=false;
			this.isVisibilidadCeldaActualizarTipoMoneda=true;
			this.isVisibilidadCeldaEliminarTipoMoneda=false;
			this.isVisibilidadCeldaCancelarTipoMoneda=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoneda=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoneda=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoMoneda=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMoneda=true;
			this.isVisibilidadCeldaModificarTipoMoneda=false;
			this.isVisibilidadCeldaActualizarTipoMoneda=false;
			this.isVisibilidadCeldaEliminarTipoMoneda=false;
			this.isVisibilidadCeldaCancelarTipoMoneda=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoneda=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoneda=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoMoneda=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoneda=false;
			this.isVisibilidadCeldaActualizarTipoMoneda=false;
			this.isVisibilidadCeldaEliminarTipoMoneda=false;
			this.isVisibilidadCeldaCancelarTipoMoneda=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoneda=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoneda=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoMoneda=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoneda=false;
			this.isVisibilidadCeldaModificarTipoMoneda=true;
			this.isVisibilidadCeldaActualizarTipoMoneda=false;
			this.isVisibilidadCeldaEliminarTipoMoneda=false;
			this.isVisibilidadCeldaCancelarTipoMoneda=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoneda=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoneda=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoMonedaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoMoneda=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMoneda=true;
		} else {
			this.actualizarEstadoPanelsTipoMoneda(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoMoneda=false;
			//this.isVisibilidadCeldaVerFormTipoMoneda=false;
			this.isVisibilidadCeldaDuplicarTipoMoneda=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipomonedaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoneda=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipomonedaSessionBean.getEsGuardarRelacionado()) {
			if(!tipomonedaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=false;												
			}
			
			this.jButtonCerrarTipoMoneda.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMoneda=false;
		}
		
		if(!this.permiteMantenimiento(this.tipomoneda)) {
			this.isVisibilidadCeldaActualizarTipoMoneda=false;
			this.isVisibilidadCeldaEliminarTipoMoneda=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMoneda() {
		this.isVisibilidadCeldaNuevoTipoMoneda=false;
		this.isVisibilidadCeldaGuardarCambiosTipoMoneda=false;
	}
	
	public void actualizarEstadoPanelsTipoMoneda(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoMoneda!=null) {
				this.jScrollPanelDatosEdicionTipoMoneda.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoneda!=null) {
				this.jTabbedPaneBusquedasTipoMoneda.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMoneda!=null) {
				this.jScrollPanelDatosTipoMoneda.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMoneda!=null) {
				this.jPanelPaginacionTipoMoneda.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMoneda!=null) {
				this.jPanelParametrosReportesTipoMoneda.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoMoneda!=null) {
				this.jScrollPanelDatosEdicionTipoMoneda.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoneda!=null) {
				this.jTabbedPaneBusquedasTipoMoneda.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoMoneda!=null) {
				this.jScrollPanelDatosTipoMoneda.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMoneda!=null) {
				this.jPanelPaginacionTipoMoneda.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMoneda!=null) {
				this.jPanelParametrosReportesTipoMoneda.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoMoneda!=null) {
				this.jScrollPanelDatosEdicionTipoMoneda.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoneda!=null) {
				this.jTabbedPaneBusquedasTipoMoneda.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMoneda!=null) {
				this.jScrollPanelDatosTipoMoneda.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMoneda!=null) {
				this.jPanelPaginacionTipoMoneda.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMoneda!=null) {
				this.jPanelParametrosReportesTipoMoneda.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoMoneda!=null) {
				this.jScrollPanelDatosEdicionTipoMoneda.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoneda!=null) {
				this.jTabbedPaneBusquedasTipoMoneda.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMoneda!=null) {
				this.jScrollPanelDatosTipoMoneda.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMoneda!=null) {
				this.jPanelPaginacionTipoMoneda.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMoneda!=null) {
				this.jPanelParametrosReportesTipoMoneda.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoMoneda!=null) {
				this.jScrollPanelDatosEdicionTipoMoneda.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoneda!=null) {
				this.jTabbedPaneBusquedasTipoMoneda.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMoneda!=null) {
				this.jScrollPanelDatosTipoMoneda.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMoneda!=null) {
				this.jPanelPaginacionTipoMoneda.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMoneda!=null) {
				this.jPanelParametrosReportesTipoMoneda.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoMoneda!=null) {
				this.jScrollPanelDatosEdicionTipoMoneda.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoneda!=null) {
				this.jTabbedPaneBusquedasTipoMoneda.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMoneda!=null) {
				this.jScrollPanelDatosTipoMoneda.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMoneda!=null) {
				this.jPanelPaginacionTipoMoneda.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMoneda!=null) {
				this.jPanelParametrosReportesTipoMoneda.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoMoneda!=null) {
				this.jScrollPanelDatosEdicionTipoMoneda.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoneda!=null) {
				this.jTabbedPaneBusquedasTipoMoneda.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMoneda!=null) {
				this.jScrollPanelDatosTipoMoneda.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMoneda!=null) {
				this.jPanelPaginacionTipoMoneda.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMoneda!=null) {
				this.jPanelParametrosReportesTipoMoneda.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoMoneda!=null) {
					this.jTabbedPaneBusquedasTipoMoneda.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoMoneda!=null) {
				this.jPanelParametrosReportesTipoMoneda.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoneda!=null) {
				this.jTabbedPaneBusquedasTipoMoneda.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoMoneda!=null) {
				this.jPanelParametrosReportesTipoMoneda.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionTipoMonedaParaParametroContabilidadDefectos() throws Exception {
		Boolean isPaginaPopupParametroContabilidadDefecto=false;

		try {

			if(this.tipomonedaSessionBean==null) {
				this.tipomonedaSessionBean=new TipoMonedaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoSessionBean.setsPathNavegacionActual(tipomonedaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroContabilidadDefecto=this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto(true);
			this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto(TipoMonedaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoMoneda(true);
			this.jInternalFrameDetalleFormTipoMoneda.parametrocontabilidaddefectoSessionBean.setlidTipoMonedaActual(this.idTipoMonedaActual);

			tipomonedaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoMoneda(true);
			tipomonedaSessionBean.setlIdTipoMonedaActualForeignKey(this.idTipoMonedaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoMonedaSessionBean tipomonedaSessionBean=new TipoMonedaSessionBean();
		
		if(this.tipomonedaSessionBean==null) {
			this.tipomonedaSessionBean=new TipoMonedaSessionBean();
		}
		
		this.tipomonedaSessionBean.setsUltimaBusquedaTipoMoneda(this.getsAccionBusqueda());
		this.tipomonedaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipomonedaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipomonedaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorSigla")) {
			tipomonedaSessionBean.setsigla(this.getsiglaBusquedaPorSigla());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorSimbolo")) {
			tipomonedaSessionBean.setsimbolo(this.getsimboloBusquedaPorSimbolo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoMonedaSessionBean tipomonedaSessionBean=new TipoMonedaSessionBean();
		
		if(this.tipomonedaSessionBean==null) {
			this.tipomonedaSessionBean=new TipoMonedaSessionBean();
		}
		
		if(this.tipomonedaSessionBean.getsUltimaBusquedaTipoMoneda()!=null&&!this.tipomonedaSessionBean.getsUltimaBusquedaTipoMoneda().equals("")) {
			this.setsAccionBusqueda(tipomonedaSessionBean.getsUltimaBusquedaTipoMoneda());
			this.setiNumeroPaginacion(tipomonedaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipomonedaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipomonedaSessionBean.getnombre());
				tipomonedaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorSigla")) {
				this.setsiglaBusquedaPorSigla(tipomonedaSessionBean.getsigla());
				tipomonedaSessionBean.setsigla("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorSimbolo")) {
				this.setsimboloBusquedaPorSimbolo(tipomonedaSessionBean.getsimbolo());
				tipomonedaSessionBean.setsimbolo("");
			}
		}
		
		this.tipomonedaSessionBean.setsUltimaBusquedaTipoMoneda("");
		this.tipomonedaSessionBean.setiNumeroPaginacion(TipoMonedaConstantesFunciones.INUMEROPAGINACION);
		this.tipomonedaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoMoneda(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoMoneda() {
		this.updateBorderResaltarBusquedasFormularioTipoMoneda();
		this.updateVisibilidadBusquedasFormularioTipoMoneda();
		this.updateHabilitarBusquedasFormularioTipoMoneda();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoMoneda() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoMoneda.getComponents().length>0) {
	

		if(this.tipomonedaConstantesFunciones.resaltarBusquedaPorNombreTipoMoneda!=null) {
			index= this.jTabbedPaneBusquedasTipoMoneda.indexOfComponent(this.jPanelBusquedaPorNombreTipoMoneda);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMoneda.getComponent(index);
				jPanel.setBorder(this.tipomonedaConstantesFunciones.resaltarBusquedaPorNombreTipoMoneda);
			}
		}

		if(this.tipomonedaConstantesFunciones.resaltarBusquedaPorSiglaTipoMoneda!=null) {
			index= this.jTabbedPaneBusquedasTipoMoneda.indexOfComponent(this.jPanelBusquedaPorSiglaTipoMoneda);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMoneda.getComponent(index);
				jPanel.setBorder(this.tipomonedaConstantesFunciones.resaltarBusquedaPorSiglaTipoMoneda);
			}
		}

		if(this.tipomonedaConstantesFunciones.resaltarBusquedaPorSimboloTipoMoneda!=null) {
			index= this.jTabbedPaneBusquedasTipoMoneda.indexOfComponent(this.jPanelBusquedaPorSimboloTipoMoneda);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMoneda.getComponent(index);
				jPanel.setBorder(this.tipomonedaConstantesFunciones.resaltarBusquedaPorSimboloTipoMoneda);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoMoneda() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoMoneda.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoMoneda.indexOfComponent(this.jPanelBusquedaPorNombreTipoMoneda);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMoneda.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipomonedaConstantesFunciones.mostrarBusquedaPorNombreTipoMoneda);
			if(!this.tipomonedaConstantesFunciones.mostrarBusquedaPorNombreTipoMoneda && index>-1) {
				this.jTabbedPaneBusquedasTipoMoneda.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoMoneda.indexOfComponent(this.jPanelBusquedaPorSiglaTipoMoneda);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMoneda.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipomonedaConstantesFunciones.mostrarBusquedaPorSiglaTipoMoneda);
			if(!this.tipomonedaConstantesFunciones.mostrarBusquedaPorSiglaTipoMoneda && index>-1) {
				this.jTabbedPaneBusquedasTipoMoneda.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoMoneda.indexOfComponent(this.jPanelBusquedaPorSimboloTipoMoneda);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMoneda.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipomonedaConstantesFunciones.mostrarBusquedaPorSimboloTipoMoneda);
			if(!this.tipomonedaConstantesFunciones.mostrarBusquedaPorSimboloTipoMoneda && index>-1) {
				this.jTabbedPaneBusquedasTipoMoneda.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoMoneda() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoMoneda.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoMoneda.indexOfComponent(this.jPanelBusquedaPorNombreTipoMoneda);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMoneda.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipomonedaConstantesFunciones.activarBusquedaPorNombreTipoMoneda);
				this.jTabbedPaneBusquedasTipoMoneda.setEnabledAt(index,this.tipomonedaConstantesFunciones.activarBusquedaPorNombreTipoMoneda);
			}

			index= this.jTabbedPaneBusquedasTipoMoneda.indexOfComponent(this.jPanelBusquedaPorSiglaTipoMoneda);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMoneda.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipomonedaConstantesFunciones.activarBusquedaPorSiglaTipoMoneda);
				this.jTabbedPaneBusquedasTipoMoneda.setEnabledAt(index,this.tipomonedaConstantesFunciones.activarBusquedaPorSiglaTipoMoneda);
			}

			index= this.jTabbedPaneBusquedasTipoMoneda.indexOfComponent(this.jPanelBusquedaPorSimboloTipoMoneda);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMoneda.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipomonedaConstantesFunciones.activarBusquedaPorSimboloTipoMoneda);
				this.jTabbedPaneBusquedasTipoMoneda.setEnabledAt(index,this.tipomonedaConstantesFunciones.activarBusquedaPorSimboloTipoMoneda);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoMoneda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoMoneda.indexOfComponent(this.jPanelBusquedaPorNombreTipoMoneda);

			this.jTabbedPaneBusquedasTipoMoneda.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMoneda.getComponent(index);

			this.tipomonedaConstantesFunciones.setResaltarBusquedaPorNombreTipoMoneda(resaltar);

			jPanel.setBorder(this.tipomonedaConstantesFunciones.resaltarBusquedaPorNombreTipoMoneda);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorSigla")) {
			index= this.jTabbedPaneBusquedasTipoMoneda.indexOfComponent(this.jPanelBusquedaPorSiglaTipoMoneda);

			this.jTabbedPaneBusquedasTipoMoneda.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMoneda.getComponent(index);

			this.tipomonedaConstantesFunciones.setResaltarBusquedaPorSiglaTipoMoneda(resaltar);

			jPanel.setBorder(this.tipomonedaConstantesFunciones.resaltarBusquedaPorSiglaTipoMoneda);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorSimbolo")) {
			index= this.jTabbedPaneBusquedasTipoMoneda.indexOfComponent(this.jPanelBusquedaPorSimboloTipoMoneda);

			this.jTabbedPaneBusquedasTipoMoneda.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMoneda.getComponent(index);

			this.tipomonedaConstantesFunciones.setResaltarBusquedaPorSimboloTipoMoneda(resaltar);

			jPanel.setBorder(this.tipomonedaConstantesFunciones.resaltarBusquedaPorSimboloTipoMoneda);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoMoneda.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoMoneda() throws Exception {

		if(this.jInternalFrameDetalleFormTipoMoneda==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoMoneda();
		this.updateVisibilidadResaltarControlesFormularioTipoMoneda();
		this.updateHabilitarResaltarControlesFormularioTipoMoneda();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoMoneda() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMoneda==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipomonedaConstantesFunciones.resaltaridTipoMoneda!=null && this.jInternalFrameDetalleFormTipoMoneda!=null) {this.jInternalFrameDetalleFormTipoMoneda.jTextFieldidTipoMoneda.setBorder(this.tipomonedaConstantesFunciones.resaltaridTipoMoneda);}
		if(this.tipomonedaConstantesFunciones.resaltarnombreTipoMoneda!=null && this.jInternalFrameDetalleFormTipoMoneda!=null) {this.jInternalFrameDetalleFormTipoMoneda.jTextFieldnombreTipoMoneda.setBorder(this.tipomonedaConstantesFunciones.resaltarnombreTipoMoneda);}
		if(this.tipomonedaConstantesFunciones.resaltarsiglaTipoMoneda!=null && this.jInternalFrameDetalleFormTipoMoneda!=null) {this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsiglaTipoMoneda.setBorder(this.tipomonedaConstantesFunciones.resaltarsiglaTipoMoneda);}
		if(this.tipomonedaConstantesFunciones.resaltarsimboloTipoMoneda!=null && this.jInternalFrameDetalleFormTipoMoneda!=null) {this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsimboloTipoMoneda.setBorder(this.tipomonedaConstantesFunciones.resaltarsimboloTipoMoneda);}
		if(this.tipomonedaConstantesFunciones.resaltaresta_activoTipoMoneda!=null && this.jInternalFrameDetalleFormTipoMoneda!=null) {this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxesta_activoTipoMoneda.setBorderPainted(true);this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxesta_activoTipoMoneda.setBorder(this.tipomonedaConstantesFunciones.resaltaresta_activoTipoMoneda);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoMoneda() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoMoneda==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
	
		//this.jInternalFrameDetalleFormTipoMoneda.jTextFieldidTipoMoneda.setVisible(this.tipomonedaConstantesFunciones.mostraridTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.jPanelidTipoMoneda.setVisible(this.tipomonedaConstantesFunciones.mostraridTipoMoneda);
		//this.jInternalFrameDetalleFormTipoMoneda.jTextFieldnombreTipoMoneda.setVisible(this.tipomonedaConstantesFunciones.mostrarnombreTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.jPanelnombreTipoMoneda.setVisible(this.tipomonedaConstantesFunciones.mostrarnombreTipoMoneda);
		//this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsiglaTipoMoneda.setVisible(this.tipomonedaConstantesFunciones.mostrarsiglaTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.jPanelsiglaTipoMoneda.setVisible(this.tipomonedaConstantesFunciones.mostrarsiglaTipoMoneda);
		//this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsimboloTipoMoneda.setVisible(this.tipomonedaConstantesFunciones.mostrarsimboloTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.jPanelsimboloTipoMoneda.setVisible(this.tipomonedaConstantesFunciones.mostrarsimboloTipoMoneda);
		//this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxesta_activoTipoMoneda.setVisible(this.tipomonedaConstantesFunciones.mostraresta_activoTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.jPanelesta_activoTipoMoneda.setVisible(this.tipomonedaConstantesFunciones.mostraresta_activoTipoMoneda);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoMoneda() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMoneda==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMoneda!=null) {
	
		this.jInternalFrameDetalleFormTipoMoneda.jTextFieldidTipoMoneda.setEnabled(this.tipomonedaConstantesFunciones.activaridTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.jTextFieldnombreTipoMoneda.setEnabled(this.tipomonedaConstantesFunciones.activarnombreTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsiglaTipoMoneda.setEnabled(this.tipomonedaConstantesFunciones.activarsiglaTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.jTextFieldsimboloTipoMoneda.setEnabled(this.tipomonedaConstantesFunciones.activarsimboloTipoMoneda);
		this.jInternalFrameDetalleFormTipoMoneda.jCheckBoxesta_activoTipoMoneda.setEnabled(this.tipomonedaConstantesFunciones.activaresta_activoTipoMoneda);
		}
	}
	
		
}