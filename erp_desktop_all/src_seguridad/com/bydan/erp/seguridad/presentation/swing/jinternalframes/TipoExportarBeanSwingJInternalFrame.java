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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.TipoExportarConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoExportarParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoExportarParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoExportarBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
public class TipoExportarBeanSwingJInternalFrame extends TipoExportarJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoExportarBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoExportar> tipoexportarValidator = new ClassValidator<TipoExportar>(TipoExportar.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoExportar tipoexportar;	
	public TipoExportar tipoexportarAux;
	public TipoExportar tipoexportarAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoExportar tipoexportarTotales;
	public Long idTipoExportarActual;
	public Long iIdNuevoTipoExportar=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoTipoExportar;
	public Boolean isPermisoNuevoTipoExportar;
	public Boolean isPermisoActualizarTipoExportar;
	public Boolean isPermisoActualizarOriginalTipoExportar;
	public Boolean isPermisoEliminarTipoExportar;
	public Boolean isPermisoGuardarCambiosTipoExportar;
	public Boolean isPermisoConsultaTipoExportar;
	public Boolean isPermisoBusquedaTipoExportar;
	public Boolean isPermisoReporteTipoExportar;
	public Boolean isPermisoPaginacionMedioTipoExportar;
	public Boolean isPermisoPaginacionAltoTipoExportar;
	public Boolean isPermisoPaginacionTodoTipoExportar;
	public Boolean isPermisoCopiarTipoExportar;
	public Boolean isPermisoVerFormTipoExportar;
	public Boolean isPermisoDuplicarTipoExportar;
	public Boolean isPermisoOrdenTipoExportar;
	
	
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
	
	public TipoExportarParameterReturnGeneral tipoexportarReturnGeneral;
	public TipoExportarParameterReturnGeneral tipoexportarParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoExportar=false;
	public Boolean esParaAccionDesdeFormularioTipoExportar=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoExportarLogic tipoexportarLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoExportar tipoexportarBean;
	public TipoExportarConstantesFunciones tipoexportarConstantesFunciones;
	//public TipoExportarParameterReturnGeneral tipoexportarReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoExportar> tipoexportars;	
	//public List<TipoExportar> tipoexportarsEliminados;
	//public List<TipoExportar> tipoexportarsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoExportar=false;
	public Boolean isVisibilidadCeldaDuplicarTipoExportar=true;
	public Boolean isVisibilidadCeldaCopiarTipoExportar=true;
	public Boolean isVisibilidadCeldaVerFormTipoExportar=true;
	public Boolean isVisibilidadCeldaOrdenTipoExportar=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoExportar=false;
	public Boolean isVisibilidadCeldaModificarTipoExportar=false;
	public Boolean isVisibilidadCeldaActualizarTipoExportar=false;
	public Boolean isVisibilidadCeldaEliminarTipoExportar=false;
	public Boolean isVisibilidadCeldaCancelarTipoExportar=false;
	public Boolean isVisibilidadCeldaGuardarTipoExportar=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoExportar=false;	
	
	
	
	public Long getiIdNuevoTipoExportar() {
		return this.iIdNuevoTipoExportar;
	}

	public void setiIdNuevoTipoExportar(Long iIdNuevoTipoExportar) {
		this.iIdNuevoTipoExportar = iIdNuevoTipoExportar;
	}
	
	public Long getidTipoExportarActual() {
		return this.idTipoExportarActual;
	}

	public void setidTipoExportarActual(Long idTipoExportarActual) {
		this.idTipoExportarActual = idTipoExportarActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoExportar gettipoexportar() {
		return this.tipoexportar;
	}

	public void settipoexportar(TipoExportar tipoexportar) {
		this.tipoexportar = tipoexportar;
	}
	
	public TipoExportar gettipoexportarAux() {
		return this.tipoexportarAux;
	}

	public void settipoexportarAux(TipoExportar tipoexportarAux) {
		this.tipoexportarAux = tipoexportarAux;
	}				
	
	public TipoExportar gettipoexportarAnterior() {
		return this.tipoexportarAnterior;
	}

	public void settipoexportarAnterior(TipoExportar tipoexportarAnterior) {
		this.tipoexportarAnterior = tipoexportarAnterior;
	}	
	
	public TipoExportar gettipoexportarTotales() {
		return this.tipoexportarTotales;
	}

	public void settipoexportarTotales(TipoExportar tipoexportarTotales) {
		this.tipoexportarTotales = tipoexportarTotales;
	}	
	
	public TipoExportar gettipoexportarBean() {
		return this.tipoexportarBean;
	}

	public void settipoexportarBean(TipoExportar tipoexportarBean) {
		this.tipoexportarBean = tipoexportarBean;
	}	
	
	public TipoExportarParameterReturnGeneral gettipoexportarReturnGeneral() {
		return this.tipoexportarReturnGeneral;
	}

	public void settipoexportarReturnGeneral(TipoExportarParameterReturnGeneral tipoexportarReturnGeneral) {
		this.tipoexportarReturnGeneral = tipoexportarReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoExportarLogic getTipoExportarLogic()	{		
		return tipoexportarLogic;
	}

	public void setTipoExportarLogic(TipoExportarLogic tipoexportarLogic) {
		this.tipoexportarLogic = tipoexportarLogic;
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
	
	public Boolean getIsEsNuevoTipoExportar() {
		return isEsNuevoTipoExportar;
	}

	public void setIsEsNuevoTipoExportar(Boolean isEsNuevoTipoExportar) {
		this.isEsNuevoTipoExportar = isEsNuevoTipoExportar;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoExportar() {
		return esParaAccionDesdeFormularioTipoExportar;
	}
	
	public void setEsParaAccionDesdeFormularioTipoExportar(Boolean esParaAccionDesdeFormularioTipoExportar) {
		this.esParaAccionDesdeFormularioTipoExportar = esParaAccionDesdeFormularioTipoExportar;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoExportar() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoExportarConstantesFunciones.refrescarForeignKeysDescripcionesTipoExportar(this.tipoexportarLogic.getTipoExportars());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoExportarConstantesFunciones.refrescarForeignKeysDescripcionesTipoExportar(this.tipoexportars);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoexportarLogic.setTipoExportars(this.tipoexportars);
			tipoexportarLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoExportarParameterReturnGeneral getTipoExportarParameterGeneral() {
		return this.tipoexportarParameterGeneral;
	}
	
	public void setTipoExportarParameterGeneral(TipoExportarParameterReturnGeneral tipoexportarParameterGeneral) {
		this.tipoexportarParameterGeneral = tipoexportarParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoExportar() {
		return isPermisoTodoTipoExportar;
	}

	public void setIsPermisoTodoTipoExportar(Boolean isPermisoTodoTipoExportar) {
		this.isPermisoTodoTipoExportar = isPermisoTodoTipoExportar;
	}

	public Boolean getIsPermisoNuevoTipoExportar() {
		return isPermisoNuevoTipoExportar;
	}

	public void setIsPermisoNuevoTipoExportar(Boolean isPermisoNuevoTipoExportar) {
		this.isPermisoNuevoTipoExportar = isPermisoNuevoTipoExportar;
	}

	public Boolean getIsPermisoActualizarTipoExportar() {
		return isPermisoActualizarTipoExportar;
	}

	public void setIsPermisoActualizarTipoExportar(Boolean isPermisoActualizarTipoExportar) {
		this.isPermisoActualizarTipoExportar = isPermisoActualizarTipoExportar;
	}

	public Boolean getIsPermisoEliminarTipoExportar() {
		return isPermisoEliminarTipoExportar;
	}

	public void setIsPermisoEliminarTipoExportar(Boolean isPermisoEliminarTipoExportar) {
		this.isPermisoEliminarTipoExportar = isPermisoEliminarTipoExportar;
	}

	public Boolean getIsPermisoGuardarCambiosTipoExportar() {
		return isPermisoGuardarCambiosTipoExportar;
	}

	public void setIsPermisoGuardarCambiosTipoExportar(Boolean isPermisoGuardarCambiosTipoExportar) {
		this.isPermisoGuardarCambiosTipoExportar = isPermisoGuardarCambiosTipoExportar;
	}
	
	public Boolean getIsPermisoConsultaTipoExportar() {
		return isPermisoConsultaTipoExportar;
	}

	public void setIsPermisoConsultaTipoExportar(Boolean isPermisoConsultaTipoExportar) {
		this.isPermisoConsultaTipoExportar = isPermisoConsultaTipoExportar;
	}

	public Boolean getIsPermisoBusquedaTipoExportar() {
		return isPermisoBusquedaTipoExportar;
	}

	public void setIsPermisoBusquedaTipoExportar(Boolean isPermisoBusquedaTipoExportar) {
		this.isPermisoBusquedaTipoExportar = isPermisoBusquedaTipoExportar;
	}

	public Boolean getIsPermisoReporteTipoExportar() {
		return isPermisoReporteTipoExportar;
	}

	public void setIsPermisoReporteTipoExportar(Boolean isPermisoReporteTipoExportar) {
		this.isPermisoReporteTipoExportar = isPermisoReporteTipoExportar;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoExportar() {
		return isPermisoPaginacionMedioTipoExportar;
	}

	public void setIsPermisoPaginacionMedioTipoExportar(Boolean isPermisoPaginacionMedioTipoExportar) {
		this.isPermisoPaginacionMedioTipoExportar = isPermisoPaginacionMedioTipoExportar;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoExportar() {
		return isPermisoPaginacionTodoTipoExportar;
	}

	public void setIsPermisoPaginacionTodoTipoExportar(Boolean isPermisoPaginacionTodoTipoExportar) {
		this.isPermisoPaginacionTodoTipoExportar = isPermisoPaginacionTodoTipoExportar;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoExportar() {
		return isPermisoPaginacionAltoTipoExportar;
	}

	public void setIsPermisoPaginacionAltoTipoExportar(Boolean isPermisoPaginacionAltoTipoExportar) {
		this.isPermisoPaginacionAltoTipoExportar = isPermisoPaginacionAltoTipoExportar;
	}
	
	public Boolean getIsPermisoCopiarTipoExportar() {
		return isPermisoCopiarTipoExportar;
	}

	public void setIsPermisoCopiarTipoExportar(Boolean isPermisoCopiarTipoExportar) {
		this.isPermisoCopiarTipoExportar = isPermisoCopiarTipoExportar;
	}
	
	public Boolean getIsPermisoVerFormTipoExportar() {
		return isPermisoVerFormTipoExportar;
	}

	public void setIsPermisoVerFormTipoExportar(Boolean isPermisoVerFormTipoExportar) {
		this.isPermisoVerFormTipoExportar = isPermisoVerFormTipoExportar;
	}
	
	public Boolean getIsPermisoDuplicarTipoExportar() {
		return isPermisoDuplicarTipoExportar;
	}

	public void setIsPermisoDuplicarTipoExportar(Boolean isPermisoDuplicarTipoExportar) {
		this.isPermisoDuplicarTipoExportar = isPermisoDuplicarTipoExportar;
	}
	
	public Boolean getIsPermisoOrdenTipoExportar() {
		return isPermisoOrdenTipoExportar;
	}

	public void setIsPermisoOrdenTipoExportar(Boolean isPermisoOrdenTipoExportar) {
		this.isPermisoOrdenTipoExportar = isPermisoOrdenTipoExportar;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoExportar() {
		return isVisibilidadCeldaNuevoTipoExportar;
	}

	public void setIsVisibilidadCeldaNuevoTipoExportar(Boolean isVisibilidadCeldaNuevoTipoExportar) {
		this.isVisibilidadCeldaNuevoTipoExportar = isVisibilidadCeldaNuevoTipoExportar;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoExportar() {
		return isVisibilidadCeldaDuplicarTipoExportar;
	}

	public void setIsVisibilidadCeldaDuplicarTipoExportar(Boolean isVisibilidadCeldaDuplicarTipoExportar) {
		this.isVisibilidadCeldaDuplicarTipoExportar = isVisibilidadCeldaDuplicarTipoExportar;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoExportar() {
		return isVisibilidadCeldaCopiarTipoExportar;
	}

	public void setIsVisibilidadCeldaCopiarTipoExportar(Boolean isVisibilidadCeldaCopiarTipoExportar) {
		this.isVisibilidadCeldaCopiarTipoExportar = isVisibilidadCeldaCopiarTipoExportar;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoExportar() {
		return isVisibilidadCeldaVerFormTipoExportar;
	}

	public void setIsVisibilidadCeldaVerFormTipoExportar(Boolean isVisibilidadCeldaVerFormTipoExportar) {
		this.isVisibilidadCeldaVerFormTipoExportar = isVisibilidadCeldaVerFormTipoExportar;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoExportar() {
		return isVisibilidadCeldaOrdenTipoExportar;
	}

	public void setIsVisibilidadCeldaOrdenTipoExportar(Boolean isVisibilidadCeldaOrdenTipoExportar) {
		this.isVisibilidadCeldaOrdenTipoExportar = isVisibilidadCeldaOrdenTipoExportar;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoExportar() {
		return isVisibilidadCeldaNuevoRelacionesTipoExportar;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoExportar(Boolean isVisibilidadCeldaNuevoRelacionesTipoExportar) {
		this.isVisibilidadCeldaNuevoRelacionesTipoExportar = isVisibilidadCeldaNuevoRelacionesTipoExportar;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoExportar() {
		return isVisibilidadCeldaModificarTipoExportar;
	}

	public void setIsVisibilidadCeldaModificarTipoExportar(Boolean isVisibilidadCeldaModificarTipoExportar) {
		this.isVisibilidadCeldaModificarTipoExportar = isVisibilidadCeldaModificarTipoExportar;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoExportar() {
		return isVisibilidadCeldaActualizarTipoExportar;
	}

	public void setIsVisibilidadCeldaActualizarTipoExportar(Boolean isVisibilidadCeldaActualizarTipoExportar) {
		this.isVisibilidadCeldaActualizarTipoExportar = isVisibilidadCeldaActualizarTipoExportar;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoExportar() {
		return isVisibilidadCeldaEliminarTipoExportar;
	}

	public void setIsVisibilidadCeldaEliminarTipoExportar(Boolean isVisibilidadCeldaEliminarTipoExportar) {
		this.isVisibilidadCeldaEliminarTipoExportar = isVisibilidadCeldaEliminarTipoExportar;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoExportar() {
		return isVisibilidadCeldaCancelarTipoExportar;
	}

	public void setIsVisibilidadCeldaCancelarTipoExportar(Boolean isVisibilidadCeldaCancelarTipoExportar) {
		this.isVisibilidadCeldaCancelarTipoExportar = isVisibilidadCeldaCancelarTipoExportar;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoExportar() {
		return isVisibilidadCeldaGuardarTipoExportar;
	}

	public void setIsVisibilidadCeldaGuardarTipoExportar(Boolean isVisibilidadCeldaGuardarTipoExportar) {
		this.isVisibilidadCeldaGuardarTipoExportar = isVisibilidadCeldaGuardarTipoExportar;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoExportar() {
		return isVisibilidadCeldaGuardarCambiosTipoExportar;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoExportar(Boolean isVisibilidadCeldaGuardarCambiosTipoExportar) {
		this.isVisibilidadCeldaGuardarCambiosTipoExportar = isVisibilidadCeldaGuardarCambiosTipoExportar;
	}
		
	public TipoExportarSessionBean gettipoexportarSessionBean() {
		return this.tipoexportarSessionBean;
	}
	
	public void settipoexportarSessionBean(TipoExportarSessionBean tipoexportarSessionBean) {
		this.tipoexportarSessionBean=tipoexportarSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoExportar(TipoExportar tipoexportar)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoExportar tipoexportar,TipoExportar tipoexportarAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoExportar(tipoexportar);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoexportarAux.setId(tipoexportar.getId());
		tipoexportarAux.setVersionRow(tipoexportar.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoExportar();
		
			int intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportar =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoexportar =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoExportarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoExportar(this.tipoexportar,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(this.tipoexportar);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoexportarValidator.getInvalidValues(this.tipoexportar);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoexportarLogic.setDatosCliente(datosCliente);
			tipoexportarLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoexportarAux=new  TipoExportar();
				
				tipoexportarAux.setIsNew(true);
				tipoexportarAux.setIsChanged(true);
				
				tipoexportarAux.setTipoExportarOriginal(this.tipoexportar);
				
				tipoexportarAux.setId(this.tipoexportar.getId());	
				tipoexportarAux.setVersionRow(this.tipoexportar.getVersionRow());	
				tipoexportarAux.setcodigo(this.tipoexportar.getcodigo());	
				tipoexportarAux.setnombre(this.tipoexportar.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoexportarSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoexportarSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoexportarAux,tipoexportarLogic.getTipoExportars());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoexportarAux,tipoexportars);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoexportarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoexportarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoexportarLogic.saveTipoExportars();//WithConnection
						//tipoexportarLogic.getSetVersionRowTipoExportars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoexportar,tipoexportarAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoexportarAux=new  TipoExportar();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoexportarSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoexportarSessionBean.getEsGuardarRelacionado() && this.tipoexportar.getId()>=0)) {
						
					tipoexportarAux.setIsNew(false);
				}
				
				tipoexportarAux.setIsDeleted(false);
			
				tipoexportarAux.setId(this.tipoexportar.getId());	
				tipoexportarAux.setVersionRow(this.tipoexportar.getVersionRow());	
				tipoexportarAux.setcodigo(this.tipoexportar.getcodigo());	
				tipoexportarAux.setnombre(this.tipoexportar.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoexportarAux,tipoexportarLogic.getTipoExportars());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoexportarAux,tipoexportars);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoexportarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoexportarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoexportarLogic.saveTipoExportars();//WithConnection
						//tipoexportarLogic.getSetVersionRowTipoExportars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoexportar,tipoexportarAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoexportarAux=new  TipoExportar();
				
				tipoexportarAux.setIsNew(false);
				tipoexportarAux.setIsChanged(false);
				
				tipoexportarAux.setIsDeleted(true);
				
				tipoexportarAux.setId(this.tipoexportar.getId());	
				tipoexportarAux.setVersionRow(this.tipoexportar.getVersionRow());	
				tipoexportarAux.setcodigo(this.tipoexportar.getcodigo());	
				tipoexportarAux.setnombre(this.tipoexportar.getnombre());	
				
				if(this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoexportarAux.getId()>=0) {	
						this.tipoexportarsEliminados.add(tipoexportarAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoexportarAux,tipoexportarLogic.getTipoExportars());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoexportarAux,tipoexportars);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoexportarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoexportarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoexportarLogic.saveTipoExportars();//WithConnection
						//tipoexportarLogic.getSetVersionRowTipoExportars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarLogic.getTipoExportars().addAll(this.tipoexportarsEliminados);
					
					tipoexportarLogic.saveTipoExportars();//WithConnection
					//tipoexportarLogic.getSetVersionRowTipoExportars();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoexportarsEliminados= new ArrayList<TipoExportar>();		
			}
			
			if(this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Exportar GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Exportar",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoexportar=tipoexportarAux;
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
      		//this.finishProcessTipoExportar();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoExportar tipoexportarLocal) throws Exception {
		
		if(this.tipoexportarSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoExportar tipoexportarLocal) throws Exception {	
		if(this.tipoexportarSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoExportarActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoexportar =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoexportar =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoexportarValidator.getInvalidValues(this.tipoexportar);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoExportar tipoexportar,List<TipoExportar> tipoexportars) throws Exception {
		try	{		
			TipoExportarConstantesFunciones.actualizarLista(tipoexportar,tipoexportars,this.tipoexportarSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoExportar tipoexportar,List<TipoExportar> tipoexportars) throws Exception {
		try	{			
			TipoExportarConstantesFunciones.actualizarSelectedLista(tipoexportar,tipoexportars);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoExportar> tipoexportarsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoexportarsLocal=this.tipoexportarLogic.getTipoExportars();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoexportarsLocal=this.tipoexportars;
			}
			//ARCHITECTURE
		
			for(TipoExportar tipoexportarLocal:tipoexportarsLocal) {
				if(this.permiteMantenimiento(tipoexportarLocal) && tipoexportarLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoExportarConstantesFunciones.getTipoExportarLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoExportarConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoExportar.jLabelcodigoTipoExportar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoExportarConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoExportar.jLabelnombreTipoExportar,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoExportar.jLabelcodigoTipoExportar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoExportar.jLabelnombreTipoExportar,"");
		
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
		this.iIdNuevoTipoExportar--;	
		
		
		this.tipoexportarAux=new TipoExportar();
		
		this.tipoexportarAux.setId(this.iIdNuevoTipoExportar);
		this.tipoexportarAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoexportarLogic.getTipoExportars().add(this.tipoexportarAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoexportars.add(this.tipoexportarAux);
		}
		//ARCHITECTURE
		
		this.tipoexportar=this.tipoexportarAux;
		
		if(TipoExportarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoExportar(this.tipoexportar);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoExportar(this.tipoexportar);
		}
				
		//this.setDefaultControlesTipoExportar();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoExportar();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoExportar();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoExportar();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoExportar(this.tipoexportarBean,this.tipoexportar,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(this.tipoexportar);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoExportarConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoexportarSessionBean.getConGuardarRelaciones()) {
			classes=TipoExportarConstantesFunciones.getClassesRelationshipsOfTipoExportar(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoexportarReturnGeneral=tipoexportarLogic.procesarEventosTipoExportarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoexportarLogic.getTipoExportars(),this.tipoexportar,this.tipoexportarParameterGeneral,this.isEsNuevoTipoExportar,classes);//this.tipoexportarLogic.getTipoExportar()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoExportar(this.tipoexportarReturnGeneral,this.tipoexportarBean,false);
		
		if(this.tipoexportarReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoExportar(this.tipoexportarReturnGeneral.getTipoExportar());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoExportar(this.tipoexportarReturnGeneral.getTipoExportar());
		}
		
		if(this.tipoexportarReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoExportar(this.tipoexportarReturnGeneral.getTipoExportar(),classes);//this.tipoexportarBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoExportar(this.tipoexportar,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoExportar();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoExportar();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoExportar(false);
						
			if(tipoexportarSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoExportarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoExportar();
			}
			
			this.actualizarVisualTableDatosTipoExportar();
			
			this.jTableDatosTipoExportar.setRowSelectionInterval(this.getIndiceNuevoTipoExportar(), this.getIndiceNuevoTipoExportar());
			
			this.seleccionarFilaTablaTipoExportarActual();
						
			this.actualizarEstadoCeldasBotonesTipoExportar("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoExportar(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoExportar.jTextFieldcodigoTipoExportar.setEnabled(isHabilitar && this.tipoexportarConstantesFunciones.activarcodigoTipoExportar);
		this.jInternalFrameDetalleFormTipoExportar.jTextAreanombreTipoExportar.setEnabled(isHabilitar && this.tipoexportarConstantesFunciones.activarnombreTipoExportar);	
		
	};
	
	public void setDefaultControlesTipoExportar() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoExportar(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoexportarSessionBean.setConGuardarRelaciones(true);			
			this.tipoexportarSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoExportar.jTabbedPaneRelacionesTipoExportar.setVisible(true);
			
					
		} else {
			//this.tipoexportarSessionBean.setConGuardarRelaciones(false);			
			this.tipoexportarSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoExportar.jTabbedPaneRelacionesTipoExportar.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoExportar() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoExportar tipoexportarAux:this.tipoexportarLogic.getTipoExportars()) {
				if(tipoexportarAux.getId().equals(this.iIdNuevoTipoExportar)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoExportar tipoexportarAux:this.tipoexportars) {
				if(tipoexportarAux.getId().equals(this.iIdNuevoTipoExportar)) {
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
	
	public int getIndiceActualTipoExportar(TipoExportar tipoexportar,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoExportar tipoexportarAux:this.tipoexportarLogic.getTipoExportars()) {
				if(tipoexportarAux.getId().equals(tipoexportar.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoExportar tipoexportarAux:this.tipoexportars) {
				if(tipoexportarAux.getId().equals(tipoexportar.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoExportar(TipoExportar tipoexportarOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoExportar tipoexportarAux:this.tipoexportarLogic.getTipoExportars()) {
				if(tipoexportarAux.getTipoExportarOriginal().getId().equals(tipoexportarOriginal.getId())) {
					existe=true;
					tipoexportarOriginal.setId(tipoexportarAux.getId());
					tipoexportarOriginal.setVersionRow(tipoexportarAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoExportar tipoexportarAux:this.tipoexportars) {
				if(tipoexportarAux.getTipoExportarOriginal().getId().equals(tipoexportarOriginal.getId())) {
					existe=true;
					tipoexportarOriginal.setId(tipoexportarAux.getId());
					tipoexportarOriginal.setVersionRow(tipoexportarAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoExportar(Boolean esParaCancelar) throws Exception {
		tipoexportarsAux=new ArrayList<TipoExportar>();
		tipoexportarAux=new TipoExportar();
		
		if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoExportar tipoexportarAux:this.tipoexportarLogic.getTipoExportars()) {
					if(tipoexportarAux.getId()<0) {
						tipoexportarsAux.add(tipoexportarAux);
					}		
				}
				this.iIdNuevoTipoExportar=0L;
				this.tipoexportarLogic.getTipoExportars().removeAll(tipoexportarsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoExportar tipoexportarAux:this.tipoexportars) {
					if(tipoexportarAux.getId()<0) {
						tipoexportarsAux.add(tipoexportarAux);
					}		
				}
				this.iIdNuevoTipoExportar=0L;
				this.tipoexportars.removeAll(tipoexportarsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoExportar 
					&& this.tipoexportarLogic.getTipoExportars().size()>0
					) {
					tipoexportarAux=this.tipoexportarLogic.getTipoExportars().get(this.tipoexportarLogic.getTipoExportars().size() - 1);
				
					if(tipoexportarAux.getId()<0) {
						this.tipoexportarLogic.getTipoExportars().remove(tipoexportarAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoExportar && this.tipoexportars.size()>0) {
					tipoexportarAux=this.tipoexportars.get(this.tipoexportars.size() - 1);
				
					if(tipoexportarAux.getId()<0) {
						this.tipoexportars.remove(tipoexportarAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoExportar(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoexportar.getId()<0) {
				this.tipoexportarLogic.getTipoExportars().remove(this.tipoexportar);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoexportar.getId()<0) {
				this.tipoexportars.remove(this.tipoexportar);
			}
		}			
	}
	
	public void setEstadosInicialesTipoExportar(List<TipoExportar> tipoexportarsAux) throws Exception {
		TipoExportarConstantesFunciones.setEstadosInicialesTipoExportar(tipoexportarsAux);
	}
	
	public void setEstadosInicialesTipoExportar(TipoExportar tipoexportarAux) throws Exception {
		TipoExportarConstantesFunciones.setEstadosInicialesTipoExportar(tipoexportarAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoExportarActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoExportar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoExportarActual()) {
				if(!this.isEsNuevoTipoExportar) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoExportar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoExportar=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoExportarActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Exportar ?", "MANTENIMIENTO DE Tipo Exportar", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoExportar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoExportar tipoexportar) throws Exception {
		TipoExportarConstantesFunciones.seleccionarAsignar(this.tipoexportar,tipoexportar);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoExportar=this.isPermisoActualizarOriginalTipoExportar;
			
			
			this.seleccionarAsignar(tipoexportar);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoExportarConstantesFunciones.quitarEspaciosTipoExportar(this.tipoexportar,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoExportar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoexportarSessionBean.setsFuncionBusquedaRapida(this.tipoexportarSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoExportar) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoExportar(esParaCancelar);				
				this.cancelarNuevoTipoExportar(esParaCancelar);								
			}
			
			this.tipoexportar=new TipoExportar();
			
			this.inicializarTipoExportar();
			
			this.actualizarEstadoCeldasBotonesTipoExportar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoExportar() throws Exception {
		try {
			TipoExportarConstantesFunciones.inicializarTipoExportar(this.tipoexportar);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoexportarLogic.getTipoExportars().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoExportars(String sAccionBusqueda,List<TipoExportar> tipoexportarsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoExportar"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoExportarMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoExportarMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoExportar"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Exportars");		
		parameters.put("busquedapor", TipoExportarConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoExportar=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoExportarConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoExportarConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoExportar=new JRBeanArrayDataSource(TipoExportarJInternalFrame.TraerTipoExportarBeans(tipoexportarsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoExportar);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoExportarConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoExportarConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoExportarBean.TraerTipoExportarBeans(tipoexportarsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoExportars(sAccionBusqueda,sTipoArchivoReporte,tipoexportarsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoExportars(sAccionBusqueda,sTipoArchivoReporte,tipoexportarsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoExportarActionPerformed(null);
					//this.generarExcelReporteTipoExportars(sAccionBusqueda,sTipoArchivoReporte,tipoexportarsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoExportars(sAccionBusqueda,sTipoArchivoReporte,tipoexportarsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoExportars(sAccionBusqueda,sTipoArchivoReporte,tipoexportarsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoExportars(sAccionBusqueda,sTipoArchivoReporte,tipoexportarsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoExportars(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoExportar> tipoexportarsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoexportar";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoExportars");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoExportar("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoExportar tipoexportar : tipoexportarsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoExportarConstantesFunciones.generarExcelReporteDataTipoExportar("NORMAL",row,workbook,tipoexportar,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Exportar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoExportar(String sTipo,Row row,Workbook workbook) {
		
		TipoExportarConstantesFunciones.generarExcelReporteHeaderTipoExportar(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoExportars(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoExportar> tipoexportarsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoexportar_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoExportars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoExportar tipoexportar : tipoexportarsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoExportarConstantesFunciones.getTipoExportarDescripcion(tipoexportar));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoExportarConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoExportarConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoexportar.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoExportarConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoExportarConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoexportar.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Exportar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoExportars(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoExportar> tipoexportarsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoExportar> tipoexportarsRespaldo=null;
		
		classes=TipoExportarConstantesFunciones.getClassesRelationshipsOfTipoExportar(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoexportarLogic.setDatosCliente(this.datosCliente);
		this.tipoexportarLogic.setDatosDeep(this.datosDeep);
		this.tipoexportarLogic.setIsConDeep(true);
		
		tipoexportarsRespaldo=this.tipoexportarLogic.getTipoExportars();
		
		this.tipoexportarLogic.setTipoExportars(tipoexportarsParaReportes);	
		this.tipoexportarLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoexportarsParaReportes=this.tipoexportarLogic.getTipoExportars();
		this.tipoexportarLogic.setTipoExportars(tipoexportarsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoexportar_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoExportars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoExportar("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoExportar tipoexportar : tipoexportarsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoExportar("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoExportarConstantesFunciones.generarExcelReporteDataTipoExportar("NORMAL",row,workbook,tipoexportar,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoExportarConstantesFunciones.getTipoExportarDescripcion(tipoexportar));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Exportar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoExportar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoExportar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoExportar.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoExportar.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoExportar() throws Exception {		
		this.startProcessTipoExportar(true);
	}
	
	public void startProcessTipoExportar(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoExportar, this.jScrollPanelDatosTipoExportar,this.jPanelPaginacionTipoExportar, this.jScrollPanelDatosEdicionTipoExportar, this.jPanelAccionesTipoExportar,this.jPanelAccionesFormularioTipoExportar,this.jmenuBarTipoExportar,this.jmenuBarDetalleTipoExportar,this.jTtoolBarTipoExportar,this.jTtoolBarDetalleTipoExportar);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoExportar=null; 
		
		final JPanel jPanelParametrosReportesTipoExportar=this.jPanelParametrosReportesTipoExportar;
		//final JScrollPane jScrollPanelDatosTipoExportar=this.jScrollPanelDatosTipoExportar;
		final JTable jTableDatosTipoExportar=this.jTableDatosTipoExportar;		
		final JPanel jPanelPaginacionTipoExportar=this.jPanelPaginacionTipoExportar;
		//final JScrollPane jScrollPanelDatosEdicionTipoExportar=this.jScrollPanelDatosEdicionTipoExportar;
		final JPanel jPanelAccionesTipoExportar=this.jPanelAccionesTipoExportar;
		
		JPanel jPanelCamposAuxiliarTipoExportar=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoExportar=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) {
			jPanelCamposAuxiliarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jPanelCamposTipoExportar;
			jPanelAccionesFormularioAuxiliarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jPanelAccionesFormularioTipoExportar;
		}
		
		final JPanel jPanelCamposTipoExportar=jPanelCamposAuxiliarTipoExportar;
		final JPanel jPanelAccionesFormularioTipoExportar=jPanelAccionesFormularioAuxiliarTipoExportar;
		
		
		final JMenuBar jmenuBarTipoExportar=this.jmenuBarTipoExportar;
		final JToolBar jTtoolBarTipoExportar=this.jTtoolBarTipoExportar;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoExportar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoExportar=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) {
			jmenuBarDetalleAuxiliarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jmenuBarDetalleTipoExportar;
			jTtoolBarDetalleAuxiliarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jTtoolBarDetalleTipoExportar;
		}
		
		final JMenuBar jmenuBarDetalleTipoExportar=jmenuBarDetalleAuxiliarTipoExportar;
		final JToolBar jTtoolBarDetalleTipoExportar=jTtoolBarDetalleAuxiliarTipoExportar;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoExportar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoExportar;
			processRunnable.jTableDatos=jTableDatosTipoExportar;
			processRunnable.jPanelCampos=jPanelCamposTipoExportar;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoExportar;
			processRunnable.jPanelAcciones=jPanelAccionesTipoExportar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoExportar;
			
			
			processRunnable.jmenuBar=jmenuBarTipoExportar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoExportar;
			processRunnable.jTtoolBar=jTtoolBarTipoExportar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoExportar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoExportar ,jPanelParametrosReportesTipoExportar,jTableDatosTipoExportar, /*jScrollPanelDatosTipoExportar,*/jPanelCamposTipoExportar,jPanelPaginacionTipoExportar, /*jScrollPanelDatosEdicionTipoExportar,*/ jPanelAccionesTipoExportar,jPanelAccionesFormularioTipoExportar,jmenuBarTipoExportar,jmenuBarDetalleTipoExportar,jTtoolBarTipoExportar,jTtoolBarDetalleTipoExportar);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoExportar, jScrollPanelDatosTipoExportar,jPanelPaginacionTipoExportar, jScrollPanelDatosEdicionTipoExportar, jPanelAccionesTipoExportar,jPanelAccionesFormularioTipoExportar,jmenuBarTipoExportar,jmenuBarDetalleTipoExportar,jTtoolBarTipoExportar,jTtoolBarDetalleTipoExportar);
						
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
	
	public void finishProcessTipoExportar() {// throws Exception 
		this.finishProcessTipoExportar(true);
	}
	
	public void finishProcessTipoExportar(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoExportar, this.jScrollPanelDatosTipoExportar,this.jPanelPaginacionTipoExportar, this.jScrollPanelDatosEdicionTipoExportar, this.jPanelAccionesTipoExportar,this.jPanelAccionesFormularioTipoExportar,this.jmenuBarTipoExportar,this.jmenuBarDetalleTipoExportar,this.jTtoolBarTipoExportar,this.jTtoolBarDetalleTipoExportar);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoExportar=null; 
		
		final JPanel jPanelParametrosReportesTipoExportar=this.jPanelParametrosReportesTipoExportar;
		//final JScrollPane jScrollPanelDatosTipoExportar=this.jScrollPanelDatosTipoExportar;
		final JTable jTableDatosTipoExportar=this.jTableDatosTipoExportar;		
		final JPanel jPanelPaginacionTipoExportar=this.jPanelPaginacionTipoExportar;
		//final JScrollPane jScrollPanelDatosEdicionTipoExportar=this.jScrollPanelDatosEdicionTipoExportar;
		final JPanel jPanelAccionesTipoExportar=this.jPanelAccionesTipoExportar;
		
		JPanel jPanelCamposAuxiliarTipoExportar=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoExportar=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) {
			jPanelCamposAuxiliarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jPanelCamposTipoExportar;
			jPanelAccionesFormularioAuxiliarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jPanelAccionesFormularioTipoExportar;
		}
		
		final JPanel jPanelCamposTipoExportar=jPanelCamposAuxiliarTipoExportar;
		final JPanel jPanelAccionesFormularioTipoExportar=jPanelAccionesFormularioAuxiliarTipoExportar;
		
		
		final JMenuBar jmenuBarTipoExportar=this.jmenuBarTipoExportar;		
		final JToolBar jTtoolBarTipoExportar=this.jTtoolBarTipoExportar;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoExportar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoExportar=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) {
			jmenuBarDetalleAuxiliarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jmenuBarDetalleTipoExportar;
			jTtoolBarDetalleAuxiliarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jTtoolBarDetalleTipoExportar;		
		}
		
		final JMenuBar jmenuBarDetalleTipoExportar=jmenuBarDetalleAuxiliarTipoExportar;
		final JToolBar jTtoolBarDetalleTipoExportar=jTtoolBarDetalleAuxiliarTipoExportar;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoExportar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoExportar;
			processRunnable.jTableDatos=jTableDatosTipoExportar;
			processRunnable.jPanelCampos=jPanelCamposTipoExportar;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoExportar;
			processRunnable.jPanelAcciones=jPanelAccionesTipoExportar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoExportar;
			
			
			processRunnable.jmenuBar=jmenuBarTipoExportar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoExportar;
			processRunnable.jTtoolBar=jTtoolBarTipoExportar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoExportar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoExportar ,jPanelParametrosReportesTipoExportar, jTableDatosTipoExportar,/*jScrollPanelDatosTipoExportar,*/jPanelCamposTipoExportar,jPanelPaginacionTipoExportar, /*jScrollPanelDatosEdicionTipoExportar,*/ jPanelAccionesTipoExportar,jPanelAccionesFormularioTipoExportar,jmenuBarTipoExportar,jmenuBarDetalleTipoExportar,jTtoolBarTipoExportar,jTtoolBarDetalleTipoExportar));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoExportar(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoExportar(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoExportar(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoExportar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoExportar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoExportar,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoExportar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoExportar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoExportar,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoexportarConstantesFunciones.getsFinalQueryTipoExportar();
		String  finalQueryPaginacionTodos=this.tipoexportarConstantesFunciones.getsFinalQueryTipoExportar();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoExportarConstantesFunciones.getArrayColumnasGlobalesNoTipoExportar(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoExportarConstantesFunciones.getArrayColumnasGlobalesTipoExportar(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoExportarConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoexportarsEliminados= new ArrayList<TipoExportar>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoExportar();
		
				///*TipoExportarSessionBean*/this.tipoexportarSessionBean=new TipoExportarSessionBean();
			
			if(this.tipoexportarSessionBean==null) {
				this.tipoexportarSessionBean=new TipoExportarSessionBean();
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
					this.iNumeroPaginacion=TipoExportarConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoExportarConstantesFunciones.getClassesForeignKeysOfTipoExportar(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoexportar."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoexportarsAux= new ArrayList<TipoExportar>();
			
				
			tipoexportarLogic.setDatosCliente(this.datosCliente);
			tipoexportarLogic.setDatosDeep(this.datosDeep);
			tipoexportarLogic.setIsConDeep(true);
			
			
			tipoexportarLogic.getTipoExportarDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoexportarLogic.getTodosTipoExportars(finalQueryGlobal,pagination);
					
					//tipoexportarLogic.getTodosTipoExportarsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoexportarLogic.getTipoExportars()==null|| tipoexportarLogic.getTipoExportars().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoexportarsAux= new ArrayList<TipoExportar>();
							tipoexportarsAux.addAll(tipoexportarLogic.getTipoExportars());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoexportarsAux= new ArrayList<TipoExportar>();
							tipoexportarsAux.addAll(tipoexportars);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoexportarLogic.getTodosTipoExportars(finalQueryGlobal+"",this.pagination);												
							
							//tipoexportarLogic.getTodosTipoExportarsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoExportars("Todos",tipoexportarLogic.getTipoExportars() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoexportarLogic.setTipoExportars(new ArrayList<TipoExportar>());					
							tipoexportarLogic.getTipoExportars().addAll(tipoexportarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoexportars=new ArrayList<TipoExportar>();
							tipoexportars.addAll(tipoexportarsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoExportar=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoExportar=this.idActual;
				
				} else if(this.idTipoExportarActual!=null && this.idTipoExportarActual!=0L) {
					idTipoExportar=idTipoExportarActual;
				}
				
					
				this.sDetalleReporte=TipoExportarConstantesFunciones.getDetalleIndicePorId(idTipoExportar);
				
				this.tipoexportars=new ArrayList<TipoExportar>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoexportarLogic.getEntity(idTipoExportar);
					
					//tipoexportarLogic.getEntityWithConnection(idTipoExportar);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoexportarLogic.setTipoExportars(new ArrayList<TipoExportar>());
					tipoexportarLogic.getTipoExportars().add(tipoexportarLogic.getTipoExportar());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoexportars=new ArrayList<TipoExportar>();
					this.tipoexportars.add(tipoexportar);
				}
				
				if(tipoexportarLogic.getTipoExportar()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoExportar();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoExportar();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoexportarLogic.getTipoExportars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoexportars.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoexportarLogic.getTipoExportars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoexportars.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoExportar tipoexportar) {
		Boolean permite=true;
		
		if(this.tipoexportar.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoExportarConstantesFunciones.getOrderByListaTipoExportar();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoExportarConstantesFunciones.getOrderByListaTipoExportar();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoExportar tipoexportar:tipoexportarLogic.getTipoExportars()) {
				if(tipoexportar.getsType().equals(Constantes2.S_TOTALES)) {
					tipoexportarTotales=tipoexportar;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoExportar tipoexportar:this.tipoexportars) {
				if(tipoexportar.getsType().equals(Constantes2.S_TOTALES)) {
					tipoexportarTotales=tipoexportar;
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
			this.tipoexportarAux=new TipoExportar();
			this.tipoexportarAux.setsType(Constantes2.S_TOTALES);
			this.tipoexportarAux.setIsNew(false);
			this.tipoexportarAux.setIsChanged(false);
			this.tipoexportarAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoExportarConstantesFunciones.TotalizarValoresFilaTipoExportar(this.tipoexportarLogic.getTipoExportars(),this.tipoexportarAux);
				
				this.tipoexportarLogic.getTipoExportars().add(this.tipoexportarAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoExportarConstantesFunciones.TotalizarValoresFilaTipoExportar(this.tipoexportars,this.tipoexportarAux);
				
				this.tipoexportars.add(this.tipoexportarAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoexportarTotales=new TipoExportar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoexportarLogic.getTipoExportars().remove(tipoexportarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoexportars.remove(tipoexportarTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoexportarTotales=new TipoExportar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoExportar tipoexportar:tipoexportarLogic.getTipoExportars()) {
				if(tipoexportar.getsType().equals(Constantes2.S_TOTALES)) {
					tipoexportarTotales=tipoexportar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoExportarConstantesFunciones.TotalizarValoresFilaTipoExportar(this.tipoexportarLogic.getTipoExportars(),tipoexportarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoExportar tipoexportar:this.tipoexportars) {
				if(tipoexportar.getsType().equals(Constantes2.S_TOTALES)) {
					tipoexportarTotales=tipoexportar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoExportarConstantesFunciones.TotalizarValoresFilaTipoExportar(this.tipoexportars,tipoexportarTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoExportar() {
		this.isPermisoTodoTipoExportar=false;
		this.isPermisoNuevoTipoExportar=false;
		this.isPermisoActualizarTipoExportar=false;
		this.isPermisoActualizarOriginalTipoExportar=false;
		this.isPermisoEliminarTipoExportar=false;
		this.isPermisoGuardarCambiosTipoExportar=false;
		this.isPermisoConsultaTipoExportar=false;
		this.isPermisoBusquedaTipoExportar=false;
		this.isPermisoReporteTipoExportar=false;		
		this.isPermisoOrdenTipoExportar=false;		
		this.isPermisoPaginacionMedioTipoExportar=false;		
		this.isPermisoPaginacionAltoTipoExportar=false;
		this.isPermisoPaginacionTodoTipoExportar=false;
		this.isPermisoCopiarTipoExportar=false;		
		this.isPermisoVerFormTipoExportar=false;		
		this.isPermisoDuplicarTipoExportar=false;		
		this.isPermisoOrdenTipoExportar=false;		
	}
	
	public void setPermisosUsuarioTipoExportar(Boolean isPermiso) {
		this.isPermisoTodoTipoExportar=isPermiso;
		this.isPermisoNuevoTipoExportar=isPermiso;
		this.isPermisoActualizarTipoExportar=isPermiso;
		this.isPermisoActualizarOriginalTipoExportar=isPermiso;
		this.isPermisoEliminarTipoExportar=isPermiso;
		this.isPermisoGuardarCambiosTipoExportar=isPermiso;
		this.isPermisoConsultaTipoExportar=isPermiso;
		this.isPermisoBusquedaTipoExportar=isPermiso;
		this.isPermisoReporteTipoExportar=isPermiso;
		this.isPermisoOrdenTipoExportar=isPermiso;		
		this.isPermisoPaginacionMedioTipoExportar=isPermiso;		
		this.isPermisoPaginacionAltoTipoExportar=isPermiso;		
		this.isPermisoPaginacionTodoTipoExportar=isPermiso;		
		this.isPermisoCopiarTipoExportar=isPermiso;		
		this.isPermisoVerFormTipoExportar=isPermiso;		
		this.isPermisoDuplicarTipoExportar=isPermiso;
		this.isPermisoOrdenTipoExportar=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoExportar(Boolean isPermiso) {
		//this.isPermisoTodoTipoExportar=isPermiso;
		this.isPermisoNuevoTipoExportar=isPermiso;
		this.isPermisoActualizarTipoExportar=isPermiso;
		this.isPermisoActualizarOriginalTipoExportar=isPermiso;
		this.isPermisoEliminarTipoExportar=isPermiso;
		this.isPermisoGuardarCambiosTipoExportar=isPermiso;
		//this.isPermisoConsultaTipoExportar=isPermiso;
		//this.isPermisoBusquedaTipoExportar=isPermiso;
		//this.isPermisoReporteTipoExportar=isPermiso;
		//this.isPermisoOrdenTipoExportar=isPermiso;		
		//this.isPermisoPaginacionMedioTipoExportar=isPermiso;		
		//this.isPermisoPaginacionAltoTipoExportar=isPermiso;		
		//this.isPermisoPaginacionTodoTipoExportar=isPermiso;		
		//this.isPermisoCopiarTipoExportar=isPermiso;		
		//this.isPermisoDuplicarTipoExportar=isPermiso;
		//this.isPermisoOrdenTipoExportar=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoExportarClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoExportarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoExportar(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoExportarClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoExportarClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoExportarClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoExportarClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoExportar() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoExportarJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoExportarConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoExportar=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoExportar=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoExportar=this.isPermisoActualizarTipoExportar;
			this.isPermisoEliminarTipoExportar=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoExportar=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoExportar=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoExportar=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoExportar=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoExportar=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoExportar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoExportar=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoExportar=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoExportar=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoExportar=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoExportar=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoExportar=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoExportar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoExportar.setToolTipText(this.jTableDatosTipoExportar.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoExportar(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoExportar(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoExportarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoExportarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoExportar() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoExportarListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoExportarListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoExportarJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoExportarListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoExportarListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoExportar()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoExportar()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoExportar(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoExportar()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoExportar();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoExportar(TipoExportar tipoexportar)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoExportar(TipoExportar tipoexportar,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoExportar()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoExportar()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoExportar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoExportar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoExportar()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoExportar()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoExportar(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoExportar()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoExportarBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoExportarBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoExportarBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoexportarSessionBean=new TipoExportarSessionBean(); 
		this.tipoexportarConstantesFunciones=new TipoExportarConstantesFunciones(); 
		this.tipoexportarBean=new TipoExportar();//(this.tipoexportarConstantesFunciones); 		
		this.tipoexportarReturnGeneral=new TipoExportarParameterReturnGeneral(); 
		
		this.tipoexportarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoexportarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoExportarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoExportarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoExportarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoExportar(true);
			
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
			
			this.tipoexportarConstantesFunciones=new TipoExportarConstantesFunciones(); 
			this.tipoexportarBean=new TipoExportar();//this.tipoexportarConstantesFunciones); 			
			this.tipoexportarReturnGeneral=new TipoExportarParameterReturnGeneral(); 
		
			TipoExportarBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Exportar Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoexportar=new TipoExportar();
			this.tipoexportars = new ArrayList<TipoExportar>();
			this.tipoexportarsAux = new ArrayList<TipoExportar>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic=new TipoExportarLogic();
				this.tipoexportarLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoexportarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoexportarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoExportar);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoExportar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoExportar);	
					}
					
					if(this.jInternalFrameImportacionTipoExportar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoExportar);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoExportar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoExportar);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoExportar!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoExportar);
				this.jInternalFrameDetalleFormTipoExportar.setVisible(false);
				this.jInternalFrameDetalleFormTipoExportar.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoExportar!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoExportar);
					this.jInternalFrameReporteDinamicoTipoExportar.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoExportar.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoExportar!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoExportar);
					this.jInternalFrameImportacionTipoExportar.setVisible(false);
					this.jInternalFrameImportacionTipoExportar.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoExportar!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoExportar);
					this.jInternalFrameOrderByTipoExportar.setVisible(false);
					this.jInternalFrameOrderByTipoExportar.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoExportarActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoExportarConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoexportarReturnGeneral=new TipoExportarParameterReturnGeneral();
			
			this.tipoexportarParameterGeneral=new TipoExportarParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoexportarLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoExportarJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoExportarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoexportarSessionBean.getEsGuardarRelacionado(),this.tipoexportarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoExportarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoexportarSessionBean.getEsGuardarRelacionado(),this.tipoexportarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoExportar=false;
			this.isVisibilidadCeldaDuplicarTipoExportar=true;
			this.isVisibilidadCeldaCopiarTipoExportar=true;
			this.isVisibilidadCeldaVerFormTipoExportar=true;
			this.isVisibilidadCeldaOrdenTipoExportar=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoExportar=false;
			this.isVisibilidadCeldaModificarTipoExportar=false;
			this.isVisibilidadCeldaActualizarTipoExportar=false;
			this.isVisibilidadCeldaEliminarTipoExportar=false;
			this.isVisibilidadCeldaCancelarTipoExportar=false;
			this.isVisibilidadCeldaGuardarTipoExportar=false;
			this.isVisibilidadCeldaGuardarCambiosTipoExportar=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoExportar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoExportar();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoExportar(false);
			
			this.setPermisosUsuarioTipoExportar();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoexportarSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoexportarSessionBean.getEsGuardarRelacionado() && this.tipoexportarSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoExportarClasesRelacionadas();
			}
			
			if(this.tipoexportarSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoExportarClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoExportarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoExportar();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoExportar();
			}
			
			if(!this.isPermisoBusquedaTipoExportar) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoExportar,this.isPermisoPaginacionMedioTipoExportar,this.isPermisoPaginacionTodoTipoExportar);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoExportarConstantesFunciones.getTiposSeleccionarTipoExportar());
				
				this.tiposColumnasSelect=TipoExportarConstantesFunciones.getTiposSeleccionarTipoExportar(true);
				
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
			//if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoExportar();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoExportar(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoExportar(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoExportar() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoexportarImplementable= (TipoExportarImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoExportarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoexportarImplementableHome= (TipoExportarImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoExportarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoexportars= new ArrayList<TipoExportar>();
			this.tipoexportarsEliminados= new ArrayList<TipoExportar>();
						
			this.isEsNuevoTipoExportar=false;
			this.esParaAccionDesdeFormularioTipoExportar=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoExportar(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoExportar();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoExportarConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoExportar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoExportar(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoExportar!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoExportar();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoExportar();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoExportar(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoExportar: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoExportar() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoExportar")) {
				iIndex=this.jInternalFrameDetalleFormTipoExportar.jTabbedPaneRelacionesTipoExportar.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoExportar.jTabbedPaneRelacionesTipoExportar.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoExportar();	
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
	
	public void cargarCombosForeignKeyTipoExportar(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoExportar(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoExportar(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoExportarListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoExportar();
		
		this.cargarCombosFrameForeignKeyTipoExportar();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoExportar();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoExportar();
		}
	}
	
	
	
	public void jButtonNuevoTipoExportarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoexportarSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoExportar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			
			
			if(jTableDatosTipoExportar.getRowCount()>=1) {
				jTableDatosTipoExportar.removeRowSelectionInterval(0, jTableDatosTipoExportar.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoExportar=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoExportar(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoExportar(true);			
			//this.tipoexportar=new TipoExportar();
			//this.tipoexportar.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoExportar(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoExportar() ;
			
			if(TipoExportarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoExportar(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoexportar);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);				
			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			
			if(this.tipoexportarSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoExportar: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoExportarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoExportar.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoExportar.getSelectedRows().length;			
			}
			
			tipoexportarsSeleccionados=this.getTipoExportarsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoExportar--;			
				//TipoExportar tipoexportarAux= new TipoExportar();			
				//tipoexportarAux.setId(this.iIdNuevoTipoExportar);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoExportar tipoexportarOrigen=new TipoExportar();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoExportar tipoexportarOrigen : tipoexportarsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoexportarOrigen =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoexportarOrigen =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoExportar();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoexportar.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoExportar(tipoexportarOrigen,this.tipoexportar,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(this.tipoexportar);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoexportarLogic.getTipoExportars().add(this.tipoexportarAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoexportars.add(this.tipoexportarAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoExportar(false);
				
				this.jTableDatosTipoExportar.setRowSelectionInterval(this.getIndiceNuevoTipoExportar(), this.getIndiceNuevoTipoExportar());
				
				int iLastRow =  this.jTableDatosTipoExportar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoExportar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoExportar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoExportar(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoExportarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();									
		
			TipoExportar tipoexportarOrigen=new TipoExportar();
			TipoExportar tipoexportarDestino=new TipoExportar();
				
			tipoexportarsSeleccionados=this.getTipoExportarsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoExportar.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoexportarsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoExportar.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoexportarOrigen =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoexportarOrigen =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoexportarDestino =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoexportarDestino =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoexportarOrigen =tipoexportarsSeleccionados.get(0);
				tipoexportarDestino =tipoexportarsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoExportar(tipoexportarOrigen,tipoexportarDestino,true,false);
				
				tipoexportarDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoexportarDestino,tipoexportarLogic.getTipoExportars());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoexportarDestino,tipoexportars);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoExportar(false);
				
				//this.jTableDatosTipoExportar.setRowSelectionInterval(this.getIndiceNuevoTipoExportar(), this.getIndiceNuevoTipoExportar());
				
				int iLastRow =  this.jTableDatosTipoExportar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoExportar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoExportar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoExportar(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoExportarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoExportar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoExportar.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoExportarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoExportar.isVisible();
			
			
			this.jPanelParametrosReportesTipoExportar.setVisible(!isVisible);
			this.jPanelPaginacionTipoExportar.setVisible(!isVisible);
			this.jPanelAccionesTipoExportar.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoExportarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoExportar();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoExportarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoExportar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoExportarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoExportar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoExportarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoExportar();
			
			this.abrirFrameOrderByTipoExportar();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoExportarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoExportar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoExportar(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoExportar);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoExportar.isMaximum()) {
					this.jInternalFrameDetalleFormTipoExportar.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoExportar.setSize(this.jInternalFrameDetalleFormTipoExportar.iWidthFormulario,this.jInternalFrameDetalleFormTipoExportar.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoExportar.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoExportar.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoExportar.isMaximum()) {
						this.jInternalFrameDetalleFormTipoExportar.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoExportar.jContentPaneDetalleTipoExportar.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoExportar.jTabbedPaneRelacionesTipoExportar.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoExportar.jContentPaneDetalleTipoExportar.getWidth(),TipoExportarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoExportar.jTabbedPaneRelacionesTipoExportar.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoExportar.jContentPaneDetalleTipoExportar.getWidth(),TipoExportarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoExportar.jTabbedPaneRelacionesTipoExportar.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoExportar.jContentPaneDetalleTipoExportar.getWidth(),TipoExportarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoExportar.setVisible(true);
	        this.jInternalFrameDetalleFormTipoExportar.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoExportar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoExportar==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoExportar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoExportar,false,this);
				} else {
					this.jInternalFrameOrderByTipoExportar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoExportar,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoExportar);
				this.jInternalFrameOrderByTipoExportar.setVisible(false);
				this.jInternalFrameOrderByTipoExportar.setSelected(false);
				
				this.jInternalFrameOrderByTipoExportar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoExportar"));
				
				this.inicializarActualizarBindingTablaOrderByTipoExportar();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoExportar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoExportar==null) {
				
				this.jInternalFrameImportacionTipoExportar=new ImportacionJInternalFrame(TipoExportarConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoExportar);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoExportar);
				this.jInternalFrameImportacionTipoExportar.setVisible(false);
				this.jInternalFrameImportacionTipoExportar.setSelected(false);


				this.jInternalFrameImportacionTipoExportar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoExportar"));
				this.jInternalFrameImportacionTipoExportar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoExportar"));
				this.jInternalFrameImportacionTipoExportar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoExportar"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoExportar() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoExportar==null) {
				this.jInternalFrameReporteDinamicoTipoExportar=new ReporteDinamicoJInternalFrame(TipoExportarConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoExportar);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoExportar);
				this.jInternalFrameReporteDinamicoTipoExportar.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoExportar.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoExportar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoExportar"));
				this.jInternalFrameReporteDinamicoTipoExportar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoExportar"));
				this.jInternalFrameReporteDinamicoTipoExportar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoExportar"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoExportar();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoExportar() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoExportar);
			
	       	this.jInternalFrameDetalleFormTipoExportar.setVisible(false);
	        this.jInternalFrameDetalleFormTipoExportar.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoExportar.dispose();
			//this.jInternalFrameDetalleFormTipoExportar=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoExportar() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoExportar.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoExportar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoExportar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoExportar.setVisible(true);
	        this.jInternalFrameImportacionTipoExportar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoExportar() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoExportar.setVisible(true);
	        this.jInternalFrameOrderByTipoExportar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoExportar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoExportar.setVisible(false);
	        this.jInternalFrameOrderByTipoExportar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoExportar() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoExportar.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoExportar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoExportar() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoExportar.setVisible(false);
	        this.jInternalFrameImportacionTipoExportar.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoExportarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoExportar(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoExportar(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoExportar(true);
			//this.isEsNuevoTipoExportar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportar =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoexportar =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoExportar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoExportar(false) ;
			
			if(tipoexportarSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoExportarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoExportar(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoExportar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoExportarActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportar =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoexportar =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoExportar(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoExportar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoExportar(true);
			//this.isEsNuevoTipoExportar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportar =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoexportar =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoexportar.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoExportar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoExportar(false) ;
			
			if(TipoExportarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoExportar(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoExportar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoExportarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoExportar(false);
			
			//if(!this.isEsNuevoTipoExportar) {								
				int intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportar =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoexportar =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoExportarJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoExportar(this.tipoexportar,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(this.tipoexportar);
				
			}
			
			if(this.permiteMantenimiento(this.tipoexportar)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoExportar=true;
					this.inicializarActualizarBindingTablaTipoExportar(false);
					this.isEsNuevoTipoExportar=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoExportar=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoExportar=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoExportar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoExportar(false);
				
				this.habilitarDeshabilitarControlesTipoExportar(false);
			
												
				
				if(TipoExportarJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoExportar();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoExportarActionPerformed(evt,tipoexportarSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoExportar(this.tipoexportar,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoExportar.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoexportarSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoexportar.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoExportar.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoExportar.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoExportarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportar =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				this.tipoexportar.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoexportar =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				this.tipoexportar.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoexportar)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoExportarModel) this.jTableDatosTipoExportar.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoExportar=true;
				this.inicializarActualizarBindingTablaTipoExportar(false);
				this.isEsNuevoTipoExportar=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoExportar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoExportar(false);
				
				this.habilitarDeshabilitarControlesTipoExportar(false);
				
				
				
				if(TipoExportarJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoExportar();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoExportarActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoExportar.getRowCount()>=1) {
				jTableDatosTipoExportar.removeRowSelectionInterval(0, jTableDatosTipoExportar.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoExportar(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoExportar(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoExportar(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoExportar(false) ;
			
			this.isEsNuevoTipoExportar=false;
			
			if(TipoExportarJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoExportar();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoExportarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoExportar(false);
				
				//SI ES MANUAL
				if(TipoExportarJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoExportar();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoExportarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoExportar--;			
			//TipoExportar tipoexportarAux= new TipoExportar();			
			//tipoexportarAux.setId(this.iIdNuevoTipoExportar);
			
			if(this.jInternalFrameDetalleFormTipoExportar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoExportar();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(this.tipoexportar);
			
			this.tipoexportar.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoexportarLogic.getTipoExportars().add(this.tipoexportarAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoexportars.add(this.tipoexportarAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoExportar(false);
			
			this.jTableDatosTipoExportar.setRowSelectionInterval(this.getIndiceNuevoTipoExportar(), this.getIndiceNuevoTipoExportar());
			
			int iLastRow =  this.jTableDatosTipoExportar.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoExportar.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoExportar.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoExportar(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoExportarActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoExportar(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoExportar(false);
			
			//SI ES MANUAL
			if(TipoExportarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoExportar();
			}
			
			//this.abrirFrameTreeTipoExportar();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoExportarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ExportarS ?", "MANTENIMIENTO DE Tipo Exportar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoExportar.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoExportar();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoexportarReturnGeneral=tipoexportarLogic.procesarImportacionTipoExportarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoexportarParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoExportarReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoExportarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoExportar.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoExportar.setFileImportacion(this.jInternalFrameImportacionTipoExportar.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoExportar.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoExportar.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoExportar.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoExportar.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoExportarActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();		

		tipoexportarsSeleccionados=this.getTipoExportarsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoExportar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoExportar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoExportarBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoExportarBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoExportars("Todos",tipoexportarsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Exportar",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoExportar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoExportar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoExportarConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoExportarConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoExportar.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoExportar.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoExportar.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoExportarConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoExportarConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoExportar.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoExportarConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoExportarConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoExportar.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoExportar.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoExportarConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoExportarConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoExportarActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();		
		
		tipoexportarsSeleccionados=this.getTipoExportarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoexportar";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoExportars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoExportar.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoExportar.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoExportarConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoExportarConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoExportar tipoexportar:tipoexportarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoexportar.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoExportarConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoExportarConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoExportar tipoexportar:tipoexportarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoexportar.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoExportar(row);				
			//	iRow++;
			//}				
			
			//for(TipoExportar tipoexportarAux:tipoexportarsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoExportar(tipoexportarAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Exportar",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoexportarLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoExportar(false);
			
			//SI ES MANUAL
			if(TipoExportarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoExportar();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoExportarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoExportar(false);
			
			//SI ES MANUAL
			if(TipoExportarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoExportar();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoExportarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoExportar(false);
			
			//SI ES MANUAL
			if(TipoExportarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoExportar();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoexportarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoExportar() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoExportar.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoExportar.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoExportar.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoExportar.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoExportar.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoExportar.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoExportar.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoExportar(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoExportar(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoExportar(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoExportar(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoExportar(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoExportar(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoExportar(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoExportar(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoExportarJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoExportarJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoExportar() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoExportar();
		
		this.inicializarActualizarBindingBotonesManualTipoExportar(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoExportar();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoExportar() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoExportar(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoExportar(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoExportar.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoExportar.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoExportar.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoExportar!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoExportar.jCheckBoxPostAccionNuevoTipoExportar.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoExportar.jCheckBoxPostAccionSinCerrarTipoExportar.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoExportar.jCheckBoxPostAccionSinMensajeTipoExportar.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoExportar.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoExportar.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoExportar.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoExportar!=null) {
				this.jInternalFrameDetalleFormTipoExportar.jCheckBoxPostAccionNuevoTipoExportar.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoExportar.jCheckBoxPostAccionSinCerrarTipoExportar.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoExportar.jCheckBoxPostAccionSinMensajeTipoExportar.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoExportar.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoExportar.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoExportar!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoExportar.jComboBoxTiposAccionesFormularioTipoExportar.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoExportar.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoExportar!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoExportar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoExportar.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoExportar.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoExportar.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoExportar.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoExportar!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoExportar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoExportar.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoExportar.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoExportar(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoExportarJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoExportar(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoExportar() throws Exception {
		try	{
			if(TipoExportarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoExportar();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoExportar() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoExportar.jComboBoxTiposAccionesFormularioTipoExportar.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoExportar.jComboBoxTiposAccionesFormularioTipoExportar.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoExportar() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoExportar.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoExportar.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoExportar.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoExportar.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoExportar.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoExportar.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoExportar.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoExportar.addItem(reporte);
			}
			
			
			if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoExportar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoExportar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoExportar.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoExportar.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoExportar.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoExportar.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoExportar.jComboBoxTiposAccionesFormularioTipoExportar.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoExportar.jComboBoxTiposAccionesFormularioTipoExportar.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoExportar.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoExportar.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoExportar.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoExportar();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoExportar() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoExportar!=null) {
				this.jInternalFrameReporteDinamicoTipoExportar.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoExportar.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoExportar!=null) {
				this.jInternalFrameReporteDinamicoTipoExportar.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoExportar.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoExportar!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoExportar.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoExportar.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoExportar.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoExportar.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoExportar.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoExportar.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoExportar()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoExportar(Boolean esInicializar) throws Exception {				
		if(TipoExportarJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoExportar();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoExportar() throws Exception {
		this.inicializarActualizarBindingTablaTipoExportar(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoExportar() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoExportarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoExportarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoExportarOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoExportarOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoExportarPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoExportarPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoExportar(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoexportarLogic.getTipoExportars().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoexportars.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoExportarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoExportar.setModel(new TipoExportarModel(this.tipoexportarLogic.getTipoExportars(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoExportar.setModel(new TipoExportarModel(this.tipoexportars,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoExportar!=null && this.jInternalFrameOrderByTipoExportar.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoExportar();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoExportar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoExportar,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoExportarPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoExportarConstantesFunciones.SCLASSWEBTITULO,tipoexportarConstantesFunciones.resaltarSeleccionarTipoExportar,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoExportarConstantesFunciones.SCLASSWEBTITULO,tipoexportarConstantesFunciones.resaltarSeleccionarTipoExportar,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoExportar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoExportar,TipoExportarConstantesFunciones.LABEL_ID));

		if(this.tipoexportarConstantesFunciones.mostraridTipoExportar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoExportarConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoexportarConstantesFunciones.resaltaridTipoExportar,this.tipoexportarConstantesFunciones.activaridTipoExportar,this,true,"idTipoExportar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoexportarConstantesFunciones.resaltaridTipoExportar,this.tipoexportarConstantesFunciones.activaridTipoExportar,this,true,"idTipoExportar","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoExportar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoExportar,TipoExportarConstantesFunciones.LABEL_CODIGO));

		if(this.tipoexportarConstantesFunciones.mostrarcodigoTipoExportar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoExportarConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoexportarConstantesFunciones.resaltarcodigoTipoExportar,this.tipoexportarConstantesFunciones.activarcodigoTipoExportar,this,true,"codigoTipoExportar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoexportarConstantesFunciones.resaltarcodigoTipoExportar,this.tipoexportarConstantesFunciones.activarcodigoTipoExportar,this,true,"codigoTipoExportar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoExportarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoExportar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoExportar,TipoExportarConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoexportarConstantesFunciones.mostrarnombreTipoExportar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoExportarConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoexportarConstantesFunciones.resaltarnombreTipoExportar,this.tipoexportarConstantesFunciones.activarnombreTipoExportar,this,true,"nombreTipoExportar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoexportarConstantesFunciones.resaltarnombreTipoExportar,this.tipoexportarConstantesFunciones.activarnombreTipoExportar,this,true,"nombreTipoExportar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoExportarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoexportarSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoexportarSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoExportar.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoexportarSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoexportarSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoExportar.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoExportar && this.isPermisoGuardarCambiosTipoExportar) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoexportarSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoexportarSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoExportar.addColumn(tableColumn);
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
			
			this.jTableDatosTipoExportar.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoExportar && this.isPermisoGuardarCambiosTipoExportar) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoExportar && this.isPermisoGuardarCambiosTipoExportar) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoExportar.moveColumn(this.jTableDatosTipoExportar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoExportar.moveColumn(this.jTableDatosTipoExportar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoExportar.moveColumn(this.jTableDatosTipoExportar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoExportar.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoExportar.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoExportar,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoExportarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoExportar.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoExportar.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoExportarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoExportarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoExportar.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoExportar.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoExportar.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoexportarLogic.getTipoExportars().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoexportars.size()-1;
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
		//this.jTableDatosTipoExportar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoExportar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoExportar();
			
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
				
				//this.isEsNuevoTipoExportar=false;
					
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			
				if(this.tipoexportarSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoExportar==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoExportar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoExportar.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportar =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoexportar =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoexportar.getsType().equals("DUPLICADO")
				   || this.tipoexportar.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoExportar=true;
				
				} else {
					this.isEsNuevoTipoExportar=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoexportar.getId()>=0 && !this.tipoexportar.getIsNew()) {						
						this.isEsNuevoTipoExportar=false;
						
					} else {
						this.isEsNuevoTipoExportar=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoExportar(esRelaciones);						
				
				this.seleccionarTipoExportar(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoexportar.getId()<0) {
					this.isEsNuevoTipoExportar=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoExportar(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoExportar(evt,rowIndex);
				}	
				
				if(this.tipoexportarSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoExportar: " + this.dDif); 
					}
				}								
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoExportar(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoexportar)) {
					if(this.tipoexportar.getId()>0) {
						this.tipoexportar.setIsDeleted(true);
						
						this.tipoexportarsEliminados.add(this.tipoexportar);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoexportarLogic.getTipoExportars().remove(this.tipoexportar);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoexportars.remove(this.tipoexportar);				
					}
					
					
					((TipoExportarModel) this.jTableDatosTipoExportar.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoExportar(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoExportar(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoExportar) {
			
			if(this.jInternalFrameDetalleFormTipoExportar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoExportar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoExportar.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportar =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoexportar =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoExportarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoExportar(this.tipoexportar);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoExportar("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoExportar(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoExportar() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoExportar(TipoExportar tipoexportar) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoExportar(tipoexportar,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoExportar(TipoExportar tipoexportar,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoExportar(tipoexportar);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoExportar(tipoexportar,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoExportar(tipoexportar);
	}
	
	public void setVariablesObjetoActualToFormularioTipoExportar(TipoExportar tipoexportar) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoExportar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoExportar.jTextFieldidTipoExportar.setText(tipoexportar.getId().toString());
			this.jInternalFrameDetalleFormTipoExportar.jTextFieldcodigoTipoExportar.setText(tipoexportar.getcodigo());
			this.jInternalFrameDetalleFormTipoExportar.jTextAreanombreTipoExportar.setText(tipoexportar.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoExportar tipoexportarLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoexportarLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoExportar tipoexportarLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoexportarLocal=this.tipoexportar;
			} else {
				tipoexportarLocal=this.tipoexportarAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoexportarLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoExportar(tipoexportarLocal,true);
					
					if(tipoexportarSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoexportarLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoexportarLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoExportar(TipoExportar tipoexportar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoExportar(tipoexportar,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(tipoexportar);
	}
	
	public void setVariablesFormularioToObjetoActualTipoExportar(TipoExportar tipoexportar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoExportar(tipoexportar,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoExportar(TipoExportar tipoexportar,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoExportar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoExportar.jTextFieldidTipoExportar.getText()==null || this.jInternalFrameDetalleFormTipoExportar.jTextFieldidTipoExportar.getText()=="" || this.jInternalFrameDetalleFormTipoExportar.jTextFieldidTipoExportar.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoExportar.jTextFieldidTipoExportar.setText("0");
			}

			if(conColumnasBase) {tipoexportar.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoExportar.jTextFieldidTipoExportar.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoExportarConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoExportar.jLabelIdTipoExportar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoexportar.setcodigo(this.jInternalFrameDetalleFormTipoExportar.jTextFieldcodigoTipoExportar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoExportarConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoExportar.jLabelcodigoTipoExportar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoexportar.setnombre(this.jInternalFrameDetalleFormTipoExportar.jTextAreanombreTipoExportar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoExportarConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoExportar.jLabelnombreTipoExportar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoExportar(TipoExportar tipoexportarBean,TipoExportar tipoexportar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoExportar(TipoExportar tipoexportarOrigen,TipoExportar tipoexportar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoexportarOrigen.getId()!=null && !tipoexportarOrigen.getId().equals(0L))) {tipoexportar.setId(tipoexportarOrigen.getId());}}
			if(conDefault || (!conDefault && tipoexportarOrigen.getcodigo()!=null && !tipoexportarOrigen.getcodigo().equals(""))) {tipoexportar.setcodigo(tipoexportarOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoexportarOrigen.getnombre()!=null && !tipoexportarOrigen.getnombre().equals(""))) {tipoexportar.setnombre(tipoexportarOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoExportar(TipoExportar tipoexportar) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoExportar.jTextFieldidTipoExportar.setText(tipoexportar.getId().toString());
			this.jInternalFrameDetalleFormTipoExportar.jTextFieldcodigoTipoExportar.setText(tipoexportar.getcodigo());
			this.jInternalFrameDetalleFormTipoExportar.jTextAreanombreTipoExportar.setText(tipoexportar.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoExportar(TipoExportarBean tipoexportarBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoExportar.jTextFieldidTipoExportar.setText(tipoexportarBean.getId().toString());
			this.jInternalFrameDetalleFormTipoExportar.jTextFieldcodigoTipoExportar.setText(tipoexportarBean.getcodigo());
			this.jInternalFrameDetalleFormTipoExportar.jTextAreanombreTipoExportar.setText(tipoexportarBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoExportar(TipoExportarParameterReturnGeneral tipoexportarReturnGeneral,TipoExportarBean tipoexportarBean,Boolean conDefault) throws Exception { 
		try {
			TipoExportar tipoexportarLocal=new TipoExportar();
			
			tipoexportarLocal=tipoexportarReturnGeneral.getTipoExportar();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoexportarLocal.getId()!=null && !tipoexportarLocal.getId().equals(0L))) {tipoexportarBean.setId(tipoexportarLocal.getId());}}
			if(conDefault || (!conDefault && tipoexportarLocal.getcodigo()!=null && !tipoexportarLocal.getcodigo().equals(""))) {tipoexportarBean.setcodigo(tipoexportarLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoexportarLocal.getnombre()!=null && !tipoexportarLocal.getnombre().equals(""))) {tipoexportarBean.setnombre(tipoexportarLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoExportarGenerico(Long idTipoExportarSeleccionado,JComboBox jComboBoxTipoExportar,List<TipoExportar> tipoexportarsLocal)throws Exception {
		try {
			TipoExportar  tipoexportarTemp=null;

			for(TipoExportar tipoexportarAux:tipoexportarsLocal) {
				if(tipoexportarAux.getId()!=null && tipoexportarAux.getId().equals(idTipoExportarSeleccionado)) {
					tipoexportarTemp=tipoexportarAux;
					break;
				}
			}

			jComboBoxTipoExportar.setSelectedItem(tipoexportarTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoExportarGenerico(JComboBox jComboBoxTipoExportar,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoExportar.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoExportar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoExportar.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoExportar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoexportar=(TipoExportar) tipoexportarLogic.getTipoExportars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoexportar =(TipoExportar) tipoexportars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoExportar tipoexportarRow=new TipoExportar();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoexportarRow=(TipoExportar) tipoexportarLogic.getTipoExportars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoexportarRow=(TipoExportar) tipoexportars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoExportar(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoExportar.setVisible((this.isVisibilidadCeldaNuevoTipoExportar && this.isPermisoNuevoTipoExportar));			
			this.jButtonDuplicarTipoExportar.setVisible((this.isVisibilidadCeldaDuplicarTipoExportar && this.isPermisoDuplicarTipoExportar));			
			this.jButtonCopiarTipoExportar.setVisible((this.isVisibilidadCeldaCopiarTipoExportar && this.isPermisoCopiarTipoExportar));
			this.jButtonVerFormTipoExportar.setVisible((this.isVisibilidadCeldaVerFormTipoExportar && this.isPermisoVerFormTipoExportar));
			
			this.jButtonAbrirOrderByTipoExportar.setVisible((this.isVisibilidadCeldaOrdenTipoExportar && this.isPermisoOrdenTipoExportar));			
			
			this.jButtonNuevoRelacionesTipoExportar.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoExportar && this.isPermisoNuevoTipoExportar));			
			this.jButtonNuevoGuardarCambiosTipoExportar.setVisible((this.isVisibilidadCeldaNuevoTipoExportar && this.isPermisoNuevoTipoExportar && this.isPermisoGuardarCambiosTipoExportar));
			
			if(this.jInternalFrameDetalleFormTipoExportar!=null) {
			this.jInternalFrameDetalleFormTipoExportar.jButtonModificarTipoExportar.setVisible((this.isVisibilidadCeldaModificarTipoExportar && this.isPermisoActualizarTipoExportar));	
			this.jInternalFrameDetalleFormTipoExportar.jButtonActualizarTipoExportar.setVisible((this.isVisibilidadCeldaActualizarTipoExportar && this.isPermisoActualizarTipoExportar));	
			this.jInternalFrameDetalleFormTipoExportar.jButtonEliminarTipoExportar.setVisible((this.isVisibilidadCeldaEliminarTipoExportar && this.isPermisoEliminarTipoExportar));
			this.jInternalFrameDetalleFormTipoExportar.jButtonCancelarTipoExportar.setVisible(this.isVisibilidadCeldaCancelarTipoExportar);							
			this.jInternalFrameDetalleFormTipoExportar.jButtonGuardarCambiosTipoExportar.setVisible((this.isVisibilidadCeldaGuardarTipoExportar && this.isPermisoGuardarCambiosTipoExportar));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoExportar.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoExportar && this.isPermisoGuardarCambiosTipoExportar));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoExportar.setVisible((this.isVisibilidadCeldaNuevoTipoExportar && this.isPermisoNuevoTipoExportar));						
			this.jButtonDuplicarToolBarTipoExportar.setVisible((this.isVisibilidadCeldaDuplicarTipoExportar && this.isPermisoDuplicarTipoExportar));						
			this.jButtonCopiarToolBarTipoExportar.setVisible((this.isVisibilidadCeldaCopiarTipoExportar && this.isPermisoCopiarTipoExportar));			
			this.jButtonVerFormToolBarTipoExportar.setVisible((this.isVisibilidadCeldaVerFormTipoExportar && this.isPermisoVerFormTipoExportar));			
			this.jButtonAbrirOrderByToolBarTipoExportar.setVisible((this.isVisibilidadCeldaOrdenTipoExportar && this.isPermisoOrdenTipoExportar));
			this.jButtonNuevoRelacionesToolBarTipoExportar.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoExportar && this.isPermisoNuevoTipoExportar));			
			this.jButtonNuevoGuardarCambiosToolBarTipoExportar.setVisible((this.isVisibilidadCeldaNuevoTipoExportar && this.isPermisoNuevoTipoExportar && this.isPermisoGuardarCambiosTipoExportar));			
			
			if(this.jInternalFrameDetalleFormTipoExportar!=null) {
			this.jInternalFrameDetalleFormTipoExportar.jButtonModificarToolBarTipoExportar.setVisible((this.isVisibilidadCeldaModificarTipoExportar && this.isPermisoActualizarTipoExportar));	
			this.jInternalFrameDetalleFormTipoExportar.jButtonActualizarToolBarTipoExportar.setVisible((this.isVisibilidadCeldaActualizarTipoExportar  && this.isPermisoActualizarTipoExportar));	
			this.jInternalFrameDetalleFormTipoExportar.jButtonEliminarToolBarTipoExportar.setVisible((this.isVisibilidadCeldaEliminarTipoExportar && this.isPermisoEliminarTipoExportar));
			this.jInternalFrameDetalleFormTipoExportar.jButtonCancelarToolBarTipoExportar.setVisible(this.isVisibilidadCeldaCancelarTipoExportar);				
			this.jInternalFrameDetalleFormTipoExportar.jButtonGuardarCambiosToolBarTipoExportar.setVisible((this.isVisibilidadCeldaGuardarTipoExportar && this.isPermisoGuardarCambiosTipoExportar));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoExportar.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoExportar && this.isPermisoGuardarCambiosTipoExportar));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoExportar.setVisible((this.isVisibilidadCeldaNuevoTipoExportar && this.isPermisoNuevoTipoExportar));			
			this.jMenuItemDuplicarTipoExportar.setVisible((this.isVisibilidadCeldaDuplicarTipoExportar && this.isPermisoDuplicarTipoExportar));			
			this.jMenuItemCopiarTipoExportar.setVisible((this.isVisibilidadCeldaCopiarTipoExportar && this.isPermisoCopiarTipoExportar));			
			this.jMenuItemVerFormTipoExportar.setVisible((this.isVisibilidadCeldaVerFormTipoExportar && this.isPermisoVerFormTipoExportar));			
			this.jMenuItemAbrirOrderByTipoExportar.setVisible((this.isVisibilidadCeldaOrdenTipoExportar && this.isPermisoOrdenTipoExportar));			
			//this.jMenuItemMostrarOcultarTipoExportar.setVisible((this.isVisibilidadCeldaOrdenTipoExportar && this.isPermisoOrdenTipoExportar));
			this.jMenuItemDetalleAbrirOrderByTipoExportar.setVisible((this.isVisibilidadCeldaOrdenTipoExportar && this.isPermisoOrdenTipoExportar));			
			//this.jMenuItemDetalleMostrarOcultarTipoExportar.setVisible((this.isVisibilidadCeldaOrdenTipoExportar && this.isPermisoOrdenTipoExportar));			
			this.jMenuItemNuevoRelacionesTipoExportar.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoExportar && this.isPermisoNuevoTipoExportar));			
			this.jMenuItemNuevoGuardarCambiosTipoExportar.setVisible((this.isVisibilidadCeldaNuevoTipoExportar && this.isPermisoNuevoTipoExportar && this.isPermisoGuardarCambiosTipoExportar));									
			
			if(this.jInternalFrameDetalleFormTipoExportar!=null) {
			this.jInternalFrameDetalleFormTipoExportar.jMenuItemModificarTipoExportar.setVisible((this.isVisibilidadCeldaModificarTipoExportar && this.isPermisoActualizarTipoExportar));	
			this.jInternalFrameDetalleFormTipoExportar.jMenuItemActualizarTipoExportar.setVisible((this.isVisibilidadCeldaActualizarTipoExportar && this.isPermisoActualizarTipoExportar));	
			this.jInternalFrameDetalleFormTipoExportar.jMenuItemEliminarTipoExportar.setVisible((this.isVisibilidadCeldaEliminarTipoExportar && this.isPermisoEliminarTipoExportar));
			this.jInternalFrameDetalleFormTipoExportar.jMenuItemCancelarTipoExportar.setVisible(this.isVisibilidadCeldaCancelarTipoExportar);				
			}
			
			this.jMenuItemGuardarCambiosTipoExportar.setVisible((this.isVisibilidadCeldaGuardarTipoExportar && this.isPermisoGuardarCambiosTipoExportar));						
			this.jMenuItemGuardarCambiosTablaTipoExportar.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoExportar && this.isPermisoGuardarCambiosTipoExportar));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoExportar=this.jButtonNuevoTipoExportar.isVisible();
			this.isVisibilidadCeldaDuplicarTipoExportar=this.jButtonDuplicarTipoExportar.isVisible();
			this.isVisibilidadCeldaCopiarTipoExportar=this.jButtonCopiarTipoExportar.isVisible();
			this.isVisibilidadCeldaVerFormTipoExportar=this.jButtonVerFormTipoExportar.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoExportar=this.jButtonAbrirOrderByTipoExportar.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoExportar=this.jButtonNuevoRelacionesTipoExportar.isVisible();
			this.isVisibilidadCeldaModificarTipoExportar=this.jButtonModificarTipoExportar.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoExportar!=null) {
			this.isVisibilidadCeldaActualizarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jButtonActualizarTipoExportar.isVisible();
			this.isVisibilidadCeldaEliminarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jButtonEliminarTipoExportar.isVisible();
			this.isVisibilidadCeldaCancelarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jButtonCancelarTipoExportar.isVisible();
			this.isVisibilidadCeldaGuardarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jButtonGuardarCambiosTipoExportar.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoExportar=this.jButtonGuardarCambiosTablaTipoExportar.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoExportar=this.jButtonNuevoToolBarTipoExportar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoExportar=this.jButtonNuevoRelacionesToolBarTipoExportar.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoExportar!=null) {
			this.isVisibilidadCeldaModificarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jButtonModificarToolBarTipoExportar.isVisible();
			this.isVisibilidadCeldaActualizarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jButtonActualizarToolBarTipoExportar.isVisible();
			this.isVisibilidadCeldaEliminarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jButtonEliminarToolBarTipoExportar.isVisible();
			this.isVisibilidadCeldaCancelarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jButtonCancelarToolBarTipoExportar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoExportar=this.jButtonGuardarCambiosToolBarTipoExportar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoExportar=this.jButtonGuardarCambiosTablaToolBarTipoExportar.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoExportar=this.jMenuItemNuevoTipoExportar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoExportar=this.jMenuItemNuevoRelacionesTipoExportar.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoExportar!=null) {
			this.isVisibilidadCeldaModificarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jMenuItemModificarTipoExportar.isVisible();
			this.isVisibilidadCeldaActualizarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jMenuItemActualizarTipoExportar.isVisible();
			this.isVisibilidadCeldaEliminarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jMenuItemEliminarTipoExportar.isVisible();
			this.isVisibilidadCeldaCancelarTipoExportar=this.jInternalFrameDetalleFormTipoExportar.jMenuItemCancelarTipoExportar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoExportar=this.jMenuItemGuardarCambiosTipoExportar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoExportar=this.jMenuItemGuardarCambiosTablaTipoExportar.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoExportar(Boolean esInicializar) {
		if(TipoExportarJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoexportarSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoExportar();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoExportar(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoExportar() {
		this.jButtonNuevoTipoExportar.setVisible(this.isPermisoNuevoTipoExportar);			
		this.jButtonDuplicarTipoExportar.setVisible(this.isPermisoDuplicarTipoExportar);			
		this.jButtonCopiarTipoExportar.setVisible(this.isPermisoCopiarTipoExportar);			
		this.jButtonVerFormTipoExportar.setVisible(this.isPermisoVerFormTipoExportar);			
		
		this.jButtonAbrirOrderByTipoExportar.setVisible(this.isPermisoOrdenTipoExportar);					
		
		this.jButtonNuevoRelacionesTipoExportar.setVisible(this.isPermisoNuevoTipoExportar);			
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.jButtonModificarTipoExportar.setVisible(this.isPermisoActualizarTipoExportar);	
			this.jInternalFrameDetalleFormTipoExportar.jButtonActualizarTipoExportar.setVisible(this.isPermisoActualizarTipoExportar);	
			this.jInternalFrameDetalleFormTipoExportar.jButtonEliminarTipoExportar.setVisible(this.isPermisoEliminarTipoExportar);
			this.jInternalFrameDetalleFormTipoExportar.jButtonCancelarTipoExportar.setVisible(this.isVisibilidadCeldaCancelarTipoExportar);						
			this.jInternalFrameDetalleFormTipoExportar.jButtonGuardarCambiosTipoExportar.setVisible(this.isPermisoGuardarCambiosTipoExportar);							
		}
		
		this.jButtonGuardarCambiosTablaTipoExportar.setVisible(this.isPermisoActualizarTipoExportar);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoExportar() {
		this.jInternalFrameDetalleFormTipoExportar.jButtonModificarTipoExportar.setVisible(this.isPermisoActualizarTipoExportar);	
		this.jInternalFrameDetalleFormTipoExportar.jButtonActualizarTipoExportar.setVisible(this.isPermisoActualizarTipoExportar);	
		this.jInternalFrameDetalleFormTipoExportar.jButtonEliminarTipoExportar.setVisible(this.isPermisoEliminarTipoExportar);
		this.jInternalFrameDetalleFormTipoExportar.jButtonCancelarTipoExportar.setVisible(this.isVisibilidadCeldaCancelarTipoExportar);							
		this.jInternalFrameDetalleFormTipoExportar.jButtonGuardarCambiosTipoExportar.setVisible((this.isVisibilidadCeldaGuardarTipoExportar && this.isPermisoGuardarCambiosTipoExportar));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoExportar() {
		if(TipoExportarJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoExportar();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoExportar() {
	}
	
	public void jTableDatosTipoExportarListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoExportar(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoExportarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoExportar(this.gettipoexportar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(this.tipoexportar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoexportar =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoexportar =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoexportar==null) {
						this.tipoexportar = new TipoExportar();
					}

					this.setVariablesFormularioToObjetoActualTipoExportar(this.tipoexportar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(this.tipoexportar);
				}

				if(this.tipoexportar.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoexportar.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoExportar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoExportarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoExportar(this.gettipoexportar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(this.tipoexportar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoexportar =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoexportar =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoexportar==null) {
						this.tipoexportar = new TipoExportar();
					}

					this.setVariablesFormularioToObjetoActualTipoExportar(this.tipoexportar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(this.tipoexportar);
				}

				if(this.tipoexportar.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoexportar.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoExportar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoExportarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoExportar(this.gettipoexportar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(this.tipoexportar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoexportar =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoexportar =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoexportar==null) {
						this.tipoexportar = new TipoExportar();
					}

					this.setVariablesFormularioToObjetoActualTipoExportar(this.tipoexportar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(this.tipoexportar);
				}

				if(this.tipoexportar.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoexportar.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoExportar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoExportar() {
		if(this.jInternalFrameDetalleFormTipoExportar!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) {
			this.jInternalFrameDetalleFormTipoExportar.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoExportar.dispose();
			this.jInternalFrameDetalleFormTipoExportar=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoExportar!=null) {
			this.jInternalFrameReporteDinamicoTipoExportar.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoExportar.dispose();
			this.jInternalFrameReporteDinamicoTipoExportar=null;
		}
		
		if(this.jInternalFrameImportacionTipoExportar!=null) {
			this.jInternalFrameImportacionTipoExportar.setVisible(false);	    			
			this.jInternalFrameImportacionTipoExportar.dispose();
			this.jInternalFrameImportacionTipoExportar=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoExportar();
			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoExportar")) {
				jButtonNuevoTipoExportarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoExportar")) {
				jButtonDuplicarTipoExportarActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoExportar")) {
				jButtonCopiarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoExportar")) {
				jButtonVerFormTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoExportar")) {
				jButtonNuevoTipoExportarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoExportar")) {
				jButtonDuplicarTipoExportarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoExportar")) {
				jButtonNuevoTipoExportarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoExportar")) {
				jButtonDuplicarTipoExportarActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoExportar")) {
				jButtonNuevoTipoExportarActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoExportar")) {
				jButtonNuevoTipoExportarActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoExportar")) {
				jButtonNuevoTipoExportarActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoExportar")) {
				jButtonModificarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoExportar")) {
				jButtonModificarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoExportar")) {
				jButtonModificarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoExportar")) {
				jButtonActualizarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoExportar")) {
				jButtonActualizarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoExportar")) {
				jButtonActualizarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoExportar")) {
				jButtonEliminarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoExportar")) {
				jButtonEliminarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoExportar")) {
				jButtonEliminarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoExportar")) {
				jButtonCancelarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoExportar")) {
				jButtonCancelarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoExportar")) {
				jButtonCancelarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoExportar")) {
				jButtonCerrarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoExportar")) {
				jButtonCerrarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoExportar")) {
				jButtonCerrarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoExportar")) {
				jButtonMostrarOcultarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoExportar")) {
				jButtonCancelarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoExportar")) {
				jButtonGuardarCambiosTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoExportar")) {
				jButtonGuardarCambiosTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoExportar")) {
				jButtonCopiarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoExportar")) {
				jButtonVerFormTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoExportar")) {
				jButtonGuardarCambiosTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoExportar")) {
				jButtonCopiarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoExportar")) {
				jButtonVerFormTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoExportar")) {
				jButtonGuardarCambiosTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoExportar")) {
				jButtonGuardarCambiosTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoExportar")) {
				jButtonGuardarCambiosTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoExportar")) {
				jButtonRecargarInformacionTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoExportar")) {
				jButtonRecargarInformacionTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoExportar")) {
				jButtonRecargarInformacionTipoExportarActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoExportar")) {
				jButtonAnterioresTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoExportar")) {
				jButtonAnterioresTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoExportar")) {
				jButtonAnterioresTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoExportar")) {
				jButtonSiguientesTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoExportar")) {
				jButtonSiguientesTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoExportar")) {
				jButtonSiguientesTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoExportar") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoExportar")) {
				jButtonAbrirOrderByTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoExportar") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoExportar")) {
				jButtonMostrarOcultarTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoExportar")) {
				jButtonNuevoGuardarCambiosTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoExportar")) {
				jButtonNuevoGuardarCambiosTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoExportar")) {
				jButtonNuevoGuardarCambiosTipoExportarActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoExportar")) {
				jButtonCerrarReporteDinamicoTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoExportar")) {
				jButtonGenerarReporteDinamicoTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoExportar")) {
				
				jButtonGenerarExcelReporteDinamicoTipoExportarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoExportar")) {
				jButtonCerrarImportacionTipoExportarActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoExportar")) {
				
				jButtonGenerarImportacionTipoExportarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoExportar")) {
				
				jButtonAbrirImportacionTipoExportarActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoExportar")) {
				jComboBoxTiposAccionesTipoExportarActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoExportar")) {
				jComboBoxTiposRelacionesTipoExportarActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoExportar")) {
				jComboBoxTiposAccionesTipoExportarActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoExportar")) {
				
				jComboBoxTiposSeleccionarTipoExportarActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoExportar")) {
				jTextFieldValorCampoGeneralTipoExportarActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoExportar")) {
				jButtonAbrirOrderByTipoExportarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoExportar")) {
				jButtonAbrirOrderByTipoExportarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoExportar")) {
				jButtonCerrarOrderByTipoExportarActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoExportarBusqueda")) {
				this.jButtonidTipoExportarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoExportarBusqueda")) {
				this.jButtoncodigoTipoExportarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoExportarBusqueda")) {
				this.jButtonnombreTipoExportarBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoExportar();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoExportarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				


				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoExportar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoExportar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoExportar tipoexportarLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoexportarLocal=this.tipoexportar;
			} else {
				tipoexportarLocal=this.tipoexportarAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
							
				
				


				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoExportar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoExportar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoExportarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarAnterior =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoexportarAnterior =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
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
			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			
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
			
			


			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoExportarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
								
						
				


				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoExportar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoExportar.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
								
				
				


				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoExportar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoExportar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoExportarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarAnterior =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoexportarAnterior =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoExportarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarAnterior =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoexportarAnterior =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoExportarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
							
				
				


				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoExportar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoExportar.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoExportarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoexportarAnterior =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoexportarAnterior =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
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
			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			
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
			
			


			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoExportarActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
								
				
				


				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoExportar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoExportar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoExportarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarAnterior =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoexportarAnterior =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoExportarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoExportarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoExportar")) {
					jCheckBoxSeleccionarTodosTipoExportarItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoExportar")) {
					jCheckBoxSeleccionadosTipoExportarItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoExportar")) {
					
				}
				
				


				
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoExportar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoExportar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
												
				
				


				
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoExportar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoExportar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoExportarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoexportarAnterior =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoexportarAnterior =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoExportarActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
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
			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
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
			
			


			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoExportarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoExportar.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoExportar.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoexportar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoexportar);
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
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
				
				


				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoExportar.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoExportar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoExportarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoexportarAnterior =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoexportarAnterior =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoExportar")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoExportarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoExportar.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoexportar =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoexportar =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoexportar);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoExportar")) {
				
				}
				
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoExportar")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoExportar.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoExportar")) {
			
			}
			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoExportar();
			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			
			if(sTipo.equals("NuevoTipoExportar")) {
				jButtonNuevoTipoExportarActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoExportar")) {
				jButtonDuplicarTipoExportarActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoExportar")) {
				jButtonCopiarTipoExportarActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoExportar")) {
				jButtonVerFormTipoExportarActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoExportar")) {
				jButtonNuevoTipoExportarActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoExportar")) {
				jButtonModificarTipoExportarActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoExportar")) {
				jButtonActualizarTipoExportarActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoExportar")) {
				jButtonEliminarTipoExportarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoExportar")) {
				jButtonGuardarCambiosTipoExportarActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoExportar")) {
				jButtonCancelarTipoExportarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoExportar")) {
				jButtonCerrarTipoExportarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoExportar")) {
				jButtonGuardarCambiosTipoExportarActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoExportar")) {
				jButtonNuevoGuardarCambiosTipoExportarActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoExportar")) {
				jButtonAbrirOrderByTipoExportarActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoExportar")) {
				jButtonRecargarInformacionTipoExportarActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoExportar")) {
				jButtonAnterioresTipoExportarActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoExportar")) {
				jButtonSiguientesTipoExportarActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoExportarBusqueda")) {
				this.jButtonidTipoExportarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoExportarBusqueda")) {
				this.jButtoncodigoTipoExportarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoExportarBusqueda")) {
				this.jButtonnombreTipoExportarBusquedaActionPerformed(evt);
			}
			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoExportar();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoExportar")) {
				closingInternalFrameTipoExportar();
				
			} else if(sTipo.equals("jButtonCancelarTipoExportar")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoExportar = (JInternalFrameBase)evt.getSource();
	            	
	            TipoExportarBeanSwingJInternalFrame jInternalFrameParent=(TipoExportarBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoExportar.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoExportarActionPerformed(null);
			}
			
			TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoexportar,new Object(),this.tipoexportarParameterGeneral,this.tipoexportarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoExportar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoExportar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoExportar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoexportar)) {
			if(!esControlTabla) {
				if(TipoExportarJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoExportar(this.tipoexportar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(this.tipoexportar);			
				}
				
				if(this.tipoexportarSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoExportar(this.tipoexportar,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoexportarReturnGeneral=tipoexportarLogic.procesarEventosTipoExportarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoexportarLogic.getTipoExportars(),this.tipoexportar,this.tipoexportarParameterGeneral,this.isEsNuevoTipoExportar,classes);//this.tipoexportarLogic.getTipoExportar()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoExportar(this.tipoexportarReturnGeneral,this.tipoexportarBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoexportarSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoExportar(classes,this.tipoexportarReturnGeneral,this.tipoexportarBean,false);
					}
						
					if(this.tipoexportarReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoExportar(this.tipoexportarReturnGeneral.getTipoExportar());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoExportar(this.tipoexportarReturnGeneral.getTipoExportar());	
					}
						
					if(this.tipoexportarReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoExportar(this.tipoexportarReturnGeneral.getTipoExportar(),classes);//this.tipoexportarBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoExportar(this.tipoexportar,classes);//this.tipoexportarBean);									
				}
			
				if(TipoExportarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoExportar(this.tipoexportar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoExportar(this.tipoexportar);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoexportarAnterior!=null) {
						this.tipoexportar=this.tipoexportarAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoexportarReturnGeneral=tipoexportarLogic.procesarEventosTipoExportarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoexportarLogic.getTipoExportars(),this.tipoexportar,this.tipoexportarParameterGeneral,this.isEsNuevoTipoExportar,classes);//this.tipoexportarLogic.getTipoExportar()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoexportarSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoexportarSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoexportarReturnGeneral.getTipoExportar(),tipoexportarLogic.getTipoExportars());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoexportarReturnGeneral.getTipoExportar(),this.tipoexportars);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoExportar.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoExportar.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoExportar();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoExportar() throws Exception {
		
		TipoExportarModel tipoexportarModel=(TipoExportarModel)this.jTableDatosTipoExportar.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoexportarModel.tipoexportars=this.tipoexportarLogic.getTipoExportars();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoexportarModel.tipoexportars=this.tipoexportars;
		}
		
		
		((TipoExportarModel) this.jTableDatosTipoExportar.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoExportar() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoexportarAnterior(),this.tipoexportarLogic.getTipoExportars());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoexportarAnterior(),this.tipoexportars);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoExportar();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoExportar(TipoExportar tipoexportar,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
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
										
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoexportar,new Object(),generalEntityParameterGeneral,this.tipoexportarReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoexportarSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoExportarConstantesFunciones.getClassesRelationshipsOfTipoExportar(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoExportarConstantesFunciones.getClassesRelationshipsFromStringsOfTipoExportar(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoExportar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoExportarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoexportar,new Object(),generalEntityParameterGeneral,this.tipoexportarReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoExportar(TipoExportarBean tipoexportarBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoExportar(ArrayList<Classe> classes,TipoExportarReturnGeneral tipoexportarReturnGeneral,TipoExportarBean tipoexportarBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoExportar(TipoExportar tipoexportar,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoexportar)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoExportar = new TipoExportarDetalleFormJInternalFrame(jDesktopPane,this.tipoexportarSessionBean.getConGuardarRelaciones(),this.tipoexportarSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoExportar);
		this.jInternalFrameDetalleFormTipoExportar.setVisible(false);
		this.jInternalFrameDetalleFormTipoExportar.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoExportar.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoExportar.tipoexportarLogic=this.tipoexportarLogic;
		
		this.cargarCombosFrameForeignKeyTipoExportar("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoExportar();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoExportar();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoExportar("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoExportar();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoExportar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoExportar"));
		
		this.jInternalFrameDetalleFormTipoExportar.jButtonModificarTipoExportar.addActionListener(new ButtonActionListener(this,"ModificarTipoExportar"));

		
		this.jInternalFrameDetalleFormTipoExportar.jButtonModificarToolBarTipoExportar.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoExportar"));
					
		this.jInternalFrameDetalleFormTipoExportar.jMenuItemModificarTipoExportar.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoExportar"));		
		
		
		
		this.jInternalFrameDetalleFormTipoExportar.jButtonActualizarTipoExportar.addActionListener (new ButtonActionListener(this,"ActualizarTipoExportar"));
		
		
		this.jInternalFrameDetalleFormTipoExportar.jButtonActualizarToolBarTipoExportar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoExportar"));
						
		this.jInternalFrameDetalleFormTipoExportar.jMenuItemActualizarTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoExportar"));		
		
		
		
		this.jInternalFrameDetalleFormTipoExportar.jButtonEliminarTipoExportar.addActionListener (new ButtonActionListener(this,"EliminarTipoExportar"));
		
		
		this.jInternalFrameDetalleFormTipoExportar.jButtonEliminarToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoExportar"));
								
		this.jInternalFrameDetalleFormTipoExportar.jMenuItemEliminarTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoExportar"));		
		
		
		
		this.jInternalFrameDetalleFormTipoExportar.jButtonCancelarTipoExportar.addActionListener (new ButtonActionListener(this,"CancelarTipoExportar"));
		
		
		this.jInternalFrameDetalleFormTipoExportar.jButtonCancelarToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoExportar"));
					
		this.jInternalFrameDetalleFormTipoExportar.jMenuItemCancelarTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoExportar"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoExportar.jMenuItemDetalleCerrarTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoExportar"));		
		
		
		
		this.jInternalFrameDetalleFormTipoExportar.jButtonGuardarCambiosToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoExportar"));
		
		
		
		this.jInternalFrameDetalleFormTipoExportar.jButtonGuardarCambiosToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoExportar"));
		
		
		
		this.jInternalFrameDetalleFormTipoExportar.jComboBoxTiposAccionesFormularioTipoExportar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoExportar"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoExportar.jButtonidTipoExportarBusqueda.addActionListener(new ButtonActionListener(this,"idTipoExportarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoExportar.jButtoncodigoTipoExportarBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoExportarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoExportar.jButtonnombreTipoExportarBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoExportarBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoExportar.jTabbedPaneRelacionesTipoExportar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoExportar"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoExportar"));
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoExportar"));
		}
		
		this.jTableDatosTipoExportar.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoExportar"));
		
		this.jTableDatosTipoExportar.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoExportar"));
		
		this.jButtonNuevoTipoExportar.addActionListener(new ButtonActionListener(this,"NuevoTipoExportar"));
		
		this.jButtonDuplicarTipoExportar.addActionListener(new ButtonActionListener(this,"DuplicarTipoExportar"));
		
		this.jButtonCopiarTipoExportar.addActionListener(new ButtonActionListener(this,"CopiarTipoExportar"));
		
		this.jButtonVerFormTipoExportar.addActionListener(new ButtonActionListener(this,"VerFormTipoExportar"));
		
		
		this.jButtonNuevoToolBarTipoExportar.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoExportar"));
			
		this.jButtonDuplicarToolBarTipoExportar.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoExportar"));
			
		this.jMenuItemNuevoTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoExportar"));
			
		this.jMenuItemDuplicarTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoExportar"));		
		
		
		this.jButtonNuevoRelacionesTipoExportar.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoExportar"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoExportar.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoExportar"));
			
		this.jMenuItemNuevoRelacionesTipoExportar.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoExportar"));		
		
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.jButtonModificarTipoExportar.addActionListener(new ButtonActionListener(this,"ModificarTipoExportar"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.jButtonModificarToolBarTipoExportar.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoExportar"));
			
			this.jInternalFrameDetalleFormTipoExportar.jMenuItemModificarTipoExportar.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoExportar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoExportar.jButtonActualizarTipoExportar.addActionListener (new ButtonActionListener(this,"ActualizarTipoExportar"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.jButtonActualizarToolBarTipoExportar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoExportar"));
				
			this.jInternalFrameDetalleFormTipoExportar.jMenuItemActualizarTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoExportar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.jButtonEliminarTipoExportar.addActionListener (new ButtonActionListener(this,"EliminarTipoExportar"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.jButtonEliminarToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoExportar"));
						
			this.jInternalFrameDetalleFormTipoExportar.jMenuItemEliminarTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoExportar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.jButtonCancelarTipoExportar.addActionListener (new ButtonActionListener(this,"CancelarTipoExportar"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.jButtonCancelarToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoExportar"));
			
			this.jInternalFrameDetalleFormTipoExportar.jMenuItemCancelarTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoExportar"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoExportar"));		
		
		
		this.jButtonCerrarTipoExportar.addActionListener (new ButtonActionListener(this,"CerrarTipoExportar"));
		
		
		this.jButtonCerrarToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoExportar"));
			
		this.jMenuItemCerrarTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoExportar"));
			
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.jMenuItemDetalleCerrarTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoExportar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.jButtonGuardarCambiosTipoExportar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoExportar"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.jButtonGuardarCambiosToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoExportar"));
		}
		
		this.jButtonCopiarToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoExportar"));
			
		this.jButtonVerFormToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoExportar"));
		
		this.jMenuItemGuardarCambiosTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoExportar"));
			
		this.jMenuItemCopiarTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoExportar"));		
		
		this.jMenuItemVerFormTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoExportar"));		
		
		
		this.jButtonGuardarCambiosTablaTipoExportar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoExportar"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoExportar"));
			
		this.jMenuItemGuardarCambiosTablaTipoExportar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoExportar"));		
		
		
		
		this.jButtonRecargarInformacionTipoExportar.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoExportar"));
					
		this.jButtonRecargarInformacionToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoExportar"));
		
		this.jMenuItemRecargarInformacionTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoExportar"));		
		
		
		
		this.jButtonAnterioresTipoExportar.addActionListener (new ButtonActionListener(this,"AnterioresTipoExportar"));
		
		
		this.jButtonAnterioresToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoExportar"));
		
		this.jMenuItemAnterioresTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoExportar"));		
		
		
		this.jButtonSiguientesTipoExportar.addActionListener (new ButtonActionListener(this,"SiguientesTipoExportar"));
		
		
		this.jButtonSiguientesToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoExportar"));
			
		this.jMenuItemSiguientesTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoExportar"));
			
		this.jMenuItemAbrirOrderByTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoExportar"));
			
		this.jMenuItemMostrarOcultarTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoExportar"));
			
		this.jMenuItemDetalleAbrirOrderByTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoExportar"));
			
		this.jMenuItemDetalleMostarOcultarTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoExportar"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoExportar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoExportar"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoExportar"));
			
		this.jMenuItemNuevoGuardarCambiosTipoExportar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoExportar"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoExportar.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoExportar"));

		this.jCheckBoxSeleccionadosTipoExportar.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoExportar"));
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.jComboBoxTiposAccionesFormularioTipoExportar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoExportar"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoExportar.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoExportar"));
			
		this.jComboBoxTiposAccionesTipoExportar.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoExportar"));
					
		this.jComboBoxTiposSeleccionarTipoExportar.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoExportar"));
			
		this.jTextFieldValorCampoGeneralTipoExportar.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoExportar"));		
		
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoExportar.jButtonidTipoExportarBusqueda.addActionListener(new ButtonActionListener(this,"idTipoExportarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoExportar.jButtoncodigoTipoExportarBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoExportarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoExportar.jButtonnombreTipoExportarBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoExportarBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoExportar!=null) {
				this.jInternalFrameReporteDinamicoTipoExportar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoExportar"));
				this.jInternalFrameReporteDinamicoTipoExportar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoExportar"));
				this.jInternalFrameReporteDinamicoTipoExportar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoExportar"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoExportar.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoExportar"));				
			//this.jButtonGenerarReporteDinamicoTipoExportar.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoExportar"));
			//this.jButtonGenerarExcelReporteDinamicoTipoExportar.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoExportar"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoExportar!=null) {
				this.jInternalFrameImportacionTipoExportar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoExportar"));
				this.jInternalFrameImportacionTipoExportar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoExportar"));
				this.jInternalFrameImportacionTipoExportar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoExportar"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoExportar.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoExportar"));
			
			this.jButtonAbrirOrderByToolBarTipoExportar.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoExportar"));			
			
			if(this.jInternalFrameOrderByTipoExportar!=null) {
				this.jInternalFrameOrderByTipoExportar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoExportar"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoExportar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoExportar.jTabbedPaneRelacionesTipoExportar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoExportar"));
		
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
            		closingInternalFrameTipoExportar();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoExportar.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoExportar = (JInternalFrameBase)event.getSource();
	            	
	            TipoExportarBeanSwingJInternalFrame jInternalFrameParent=(TipoExportarBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoExportar.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoExportarActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoExportar.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoExportarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoExportar.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoExportar.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoExportarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoExportarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoExportarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoExportar";
		inputMap = this.jButtonNuevoTipoExportar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoExportar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoExportarActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoExportarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoExportarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoExportarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoExportar";
		inputMap = this.jButtonNuevoRelacionesTipoExportar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoExportar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoExportarActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoExportar";
		inputMap = this.jButtonModificarTipoExportar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoExportar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoExportarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoExportar";
		inputMap = this.jButtonActualizarTipoExportar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoExportar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoExportarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoExportar";
		inputMap = this.jButtonEliminarTipoExportar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoExportar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoExportarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoExportar";
		inputMap = this.jButtonCancelarTipoExportar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoExportar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoExportarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoExportar";
		inputMap = this.jButtonCerrarTipoExportar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoExportar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoExportarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoExportar.jButtonGuardarCambiosTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoExportar";
		inputMap = this.jInternalFrameDetalleFormTipoExportar.jButtonGuardarCambiosTipoExportar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoExportar.jButtonGuardarCambiosTipoExportar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoExportarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoExportar.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoExportarItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoExportar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoExportarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoExportar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoExportarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoExportar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoExportarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoExportar.jButtonidTipoExportarBusqueda.addActionListener(new ButtonActionListener(this,"idTipoExportarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoExportar.jButtoncodigoTipoExportarBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoExportarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoExportar.jButtonnombreTipoExportarBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoExportarBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoExportar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoExportarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoExportarActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoExportar.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoExportar(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoExportar tipoexportarAux:this.tipoexportarLogic.getTipoExportars()) {
					tipoexportarAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoExportar tipoexportarAux:tipoexportars) {
					tipoexportarAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoExportarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoExportar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoExportar tipoexportarAux:this.tipoexportarLogic.getTipoExportars()) {
						tipoexportarAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoExportar tipoexportarAux:tipoexportars) {
						tipoexportarAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoExportar tipoexportarAux:this.tipoexportarLogic.getTipoExportars()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoExportar tipoexportarAux:tipoexportars) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoExportar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoExportar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoExportar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoExportar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoExportarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoExportar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoExportar.getSelectedRows();
			
			TipoExportar tipoexportarLocal=new TipoExportar();
			
			//this.seleccionarTodosTipoExportar(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoexportarLocal =(TipoExportar) this.tipoexportarLogic.getTipoExportars().toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoexportarLocal =(TipoExportar) this.tipoexportars.toArray()[this.jTableDatosTipoExportar.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoexportarLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoExportar tipoexportarAux:this.tipoexportarLogic.getTipoExportars()) {
						tipoexportarAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoExportar tipoexportarAux:tipoexportars) {
						tipoexportarAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoExportar(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoExportar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoExportar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoExportar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoExportarItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoExportarParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoExportarActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoExportar(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoExportar.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoExportar tipoexportarAux:this.tipoexportarLogic.getTipoExportars()) {
				
						if(sTipoSeleccionar.equals(TipoExportarConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoexportarAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoExportarConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoexportarAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoExportar tipoexportarAux:tipoexportars) {
					
						if(sTipoSeleccionar.equals(TipoExportarConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoexportarAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoExportarConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoexportarAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoExportar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoExportarActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoExportar(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoExportar=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoExportar.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoExportar.jComboBoxTiposAccionesFormularioTipoExportar.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoExportar) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoExportar(conSplash);
				
					this.generarReporteTipoExportarsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoExportar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoExportar.jComboBoxTiposAccionesFormularioTipoExportar.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoExportarsSeleccionados();
				//this.jComboBoxTiposAccionesTipoExportar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoExportarsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoExportar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoExportarsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoExportar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoExportar();
				
				this.exportarTipoExportarsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoExportar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoExportar.jComboBoxTiposAccionesFormularioTipoExportar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoExportars();
				//this.importarTipoExportars();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoExportar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoExportar.jComboBoxTiposAccionesFormularioTipoExportar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoExportar();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoExportarsSeleccionados();
				//this.jComboBoxTiposAccionesTipoExportar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Exportar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoExportar();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoExportar)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoExportar(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Exportar",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoExportar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoExportar.jComboBoxTiposAccionesFormularioTipoExportar.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoExportar();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoExportar(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoExportarActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoExportar();
			
			if(this.jInternalFrameDetalleFormTipoExportar==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();		
			TipoExportar tipoexportar=new TipoExportar();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoExportar(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoExportar.getSelectedItem();
			
			
			
			
			tipoexportarsSeleccionados=this.getTipoExportarsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoexportarsSeleccionados.size()==1) {
				for(TipoExportar tipoexportarAux:tipoexportarsSeleccionados) {
					tipoexportar=tipoexportarAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoExportar();
			
      		//this.finishProcessTipoExportar(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoExportarReturnGeneral() throws Exception {
		if(this.tipoexportarReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoexportarReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoexportarReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoexportarReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoexportarReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoexportarReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoExportar(false);
		}
		
		if(this.tipoexportarReturnGeneral.getConRetornoLista() || this.tipoexportarReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoexportarReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoexportarLogic.setTipoExportars(this.tipoexportarReturnGeneral.getTipoExportars());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoexportarReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoexportarLogic.setTipoExportar(this.tipoexportarReturnGeneral.getTipoExportar());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoExportar(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoExportar() throws Exception {
		
		
	}
	
	public ArrayList<TipoExportar> getTipoExportarsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoExportar) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoExportar tipoexportarAux:tipoexportarLogic.getTipoExportars()) {
					if(tipoexportarAux.getIsSelected()) {
						tipoexportarsSeleccionados.add(tipoexportarAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoExportar tipoexportarAux:this.tipoexportars) {
					if(tipoexportarAux.getIsSelected()) {
						tipoexportarsSeleccionados.add(tipoexportarAux);				
					}
				}
			}
			
			if(tipoexportarsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoexportarsSeleccionados.addAll(this.tipoexportarLogic.getTipoExportars());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoexportarsSeleccionados.addAll(this.tipoexportars);				
					}
				}
			}
		} else {
			tipoexportarsSeleccionados.add(this.tipoexportar);
		}
		
		return tipoexportarsSeleccionados;
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
	
	public void generarReporteTipoExportarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoExportarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoExportarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoExportarsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoExportarsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Exportar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoExportarsSeleccionados() throws Exception {
		ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();		
		
		tipoexportarsSeleccionados=this.getTipoExportarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoExportars("Todos",tipoexportarsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoExportarsSeleccionados() throws Exception {
		ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();		
		
		tipoexportarsSeleccionados=this.getTipoExportarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoExportars("Todos",tipoexportarsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoExportarsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();
		
		tipoexportarsSeleccionados=this.getTipoExportarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoExportars("Todos",tipoexportarsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoExportarsSeleccionados() throws Exception {
		ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoExportar();
		
		
		tipoexportarsSeleccionados=this.getTipoExportarsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoExportar();
		
		
		//this.generarReporteTipoExportars("Todos",tipoexportarsSeleccionados ,tipoexportarImplementable,tipoexportarImplementableHome);
	}
	
	public void mostrarImportacionTipoExportars() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoExportar();
		
		this.abrirFrameImportacionTipoExportar();		
		
			
		//this.generarReporteTipoExportars("Todos",tipoexportarsSeleccionados ,tipoexportarImplementable,tipoexportarImplementableHome);
	}
	
	public void importarTipoExportars() throws Exception {		
	
	}
	
	public void exportarTipoExportarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoExportarsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoExportarsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoExportarsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Exportar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoExportarsSeleccionados() throws Exception {
		ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();		
		
		tipoexportarsSeleccionados=this.getTipoExportarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoexportar."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoExportar(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoExportar tipoexportarAux:tipoexportarsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoExportar(tipoexportarAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoexportarAux.setsDetalleGeneralEntityReporte(tipoexportarAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Exportar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoExportar(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoExportarConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoExportarConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoExportarConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoExportarConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoExportar(TipoExportar tipoexportar,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoexportar.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoexportar.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoexportar.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoexportar.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoExportarsSeleccionados() throws Exception {
		ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();		
		
		tipoexportarsSeleccionados=this.getTipoExportarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoexportar.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoExportars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoExportar(row);				
				iRow++;
			}				
			
			for(TipoExportar tipoexportarAux:tipoexportarsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoExportar(tipoexportarAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Exportar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoExportarsSeleccionados() throws Exception {
		ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();		
		
		tipoexportarsSeleccionados=this.getTipoExportarsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoexportar.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoexportars");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoexportar");
			//elementRoot.appendChild(element);
		
			for(TipoExportar tipoexportarAux:tipoexportarsSeleccionados) {
				element = document.createElement("tipoexportar");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoExportar(tipoexportarAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Exportar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoExportar(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoExportarConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoExportarConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoExportarConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoExportarConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoExportar(TipoExportar tipoexportar,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoexportar.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoexportar.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoexportar.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoExportar(TipoExportar tipoexportar,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoExportarConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoexportar.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoExportarConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoexportar.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoExportarConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoexportar.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoExportarConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoexportar.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoExportarsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoExportar> tipoexportarsSeleccionados=new ArrayList<TipoExportar>();
		
		tipoexportarsSeleccionados=this.getTipoExportarsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoExportar(tipoexportarsSeleccionados);
		
		this.generarReporteTipoExportars("Todos",tipoexportarsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoExportar(ArrayList<TipoExportar> tipoexportarsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoExportar tipoexportarAux:tipoexportarsSeleccionados) {
				tipoexportarAux.setsDetalleGeneralEntityReporte(tipoexportarAux.toString());
			
				if(sTipoSeleccionar.equals(TipoExportarConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoexportarAux.setsDescripcionGeneralEntityReporte1(tipoexportarAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoExportarConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoexportarAux.setsDescripcionGeneralEntityReporte1(tipoexportarAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoExportarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoExportar(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoExportar=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoExportar=true;
				this.isVisibilidadCeldaGuardarCambiosTipoExportar=true;
			}
			
			this.isVisibilidadCeldaModificarTipoExportar=false;
			this.isVisibilidadCeldaActualizarTipoExportar=false;
			this.isVisibilidadCeldaEliminarTipoExportar=false;
			this.isVisibilidadCeldaCancelarTipoExportar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoExportar=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoExportar=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoExportar=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoExportar=false;
			this.isVisibilidadCeldaGuardarCambiosTipoExportar=false;
			this.isVisibilidadCeldaModificarTipoExportar=false;
			this.isVisibilidadCeldaActualizarTipoExportar=true;
			this.isVisibilidadCeldaEliminarTipoExportar=false;
			this.isVisibilidadCeldaCancelarTipoExportar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoExportar=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoExportar=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoExportar=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoExportar=false;
			this.isVisibilidadCeldaGuardarCambiosTipoExportar=false;
			this.isVisibilidadCeldaModificarTipoExportar=false;
			this.isVisibilidadCeldaActualizarTipoExportar=true;
			this.isVisibilidadCeldaEliminarTipoExportar=true;
			this.isVisibilidadCeldaCancelarTipoExportar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoExportar=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoExportar=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoExportar=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoExportar=false;
			this.isVisibilidadCeldaGuardarCambiosTipoExportar=false;
			this.isVisibilidadCeldaModificarTipoExportar=false;
			this.isVisibilidadCeldaActualizarTipoExportar=true;
			this.isVisibilidadCeldaEliminarTipoExportar=false;
			this.isVisibilidadCeldaCancelarTipoExportar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoExportar=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoExportar=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoExportar=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoExportar=true;
			this.isVisibilidadCeldaGuardarCambiosTipoExportar=true;
			this.isVisibilidadCeldaModificarTipoExportar=false;
			this.isVisibilidadCeldaActualizarTipoExportar=false;
			this.isVisibilidadCeldaEliminarTipoExportar=false;
			this.isVisibilidadCeldaCancelarTipoExportar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoExportar=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoExportar=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoExportar=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoExportar=false;
			this.isVisibilidadCeldaGuardarCambiosTipoExportar=false;
			this.isVisibilidadCeldaActualizarTipoExportar=false;
			this.isVisibilidadCeldaEliminarTipoExportar=false;
			this.isVisibilidadCeldaCancelarTipoExportar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoExportar=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoExportar=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoExportar=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoExportar=false;
			this.isVisibilidadCeldaGuardarCambiosTipoExportar=false;
			this.isVisibilidadCeldaModificarTipoExportar=true;
			this.isVisibilidadCeldaActualizarTipoExportar=false;
			this.isVisibilidadCeldaEliminarTipoExportar=false;
			this.isVisibilidadCeldaCancelarTipoExportar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoExportar=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoExportar=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoExportarJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoExportar=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoExportar=true;
			this.isVisibilidadCeldaGuardarCambiosTipoExportar=true;
		} else {
			this.actualizarEstadoPanelsTipoExportar(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoExportar=false;
			//this.isVisibilidadCeldaVerFormTipoExportar=false;
			this.isVisibilidadCeldaDuplicarTipoExportar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoexportarSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoExportar=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoExportar=false;
			this.isVisibilidadCeldaGuardarCambiosTipoExportar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoexportarSessionBean.getEsGuardarRelacionado()) {
			if(!tipoexportarSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoExportar=false;												
			}
			
			this.jButtonCerrarTipoExportar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoExportar=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoexportar)) {
			this.isVisibilidadCeldaActualizarTipoExportar=false;
			this.isVisibilidadCeldaEliminarTipoExportar=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoExportar() {
	}
	
	public void actualizarEstadoPanelsTipoExportar(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoExportar!=null) {
				this.jScrollPanelDatosEdicionTipoExportar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoExportar!=null) {
				this.jScrollPanelDatosTipoExportar.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoExportar!=null) {
				this.jPanelPaginacionTipoExportar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoExportar!=null) {
				this.jPanelParametrosReportesTipoExportar.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoExportar!=null) {
				this.jScrollPanelDatosEdicionTipoExportar.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoExportar!=null) {
				this.jScrollPanelDatosTipoExportar.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoExportar!=null) {
				this.jPanelPaginacionTipoExportar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoExportar!=null) {
				this.jPanelParametrosReportesTipoExportar.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoExportar!=null) {
				this.jScrollPanelDatosEdicionTipoExportar.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoExportar!=null) {
				this.jScrollPanelDatosTipoExportar.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoExportar!=null) {
				this.jPanelPaginacionTipoExportar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoExportar!=null) {
				this.jPanelParametrosReportesTipoExportar.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoExportar!=null) {
				this.jScrollPanelDatosEdicionTipoExportar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoExportar!=null) {
				this.jScrollPanelDatosTipoExportar.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoExportar!=null) {
				this.jPanelPaginacionTipoExportar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoExportar!=null) {
				this.jPanelParametrosReportesTipoExportar.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoExportar!=null) {
				this.jScrollPanelDatosEdicionTipoExportar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoExportar!=null) {
				this.jScrollPanelDatosTipoExportar.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoExportar!=null) {
				this.jPanelPaginacionTipoExportar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoExportar!=null) {
				this.jPanelParametrosReportesTipoExportar.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoExportar!=null) {
				this.jScrollPanelDatosEdicionTipoExportar.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoExportar!=null) {
				this.jScrollPanelDatosTipoExportar.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoExportar!=null) {
				this.jPanelPaginacionTipoExportar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoExportar!=null) {
				this.jPanelParametrosReportesTipoExportar.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoExportar!=null) {
				this.jScrollPanelDatosEdicionTipoExportar.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoExportar!=null) {
				this.jScrollPanelDatosTipoExportar.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoExportar!=null) {
				this.jPanelPaginacionTipoExportar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoExportar!=null) {
				this.jPanelParametrosReportesTipoExportar.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoExportarSessionBean tipoexportarSessionBean=new TipoExportarSessionBean();
		
		if(this.tipoexportarSessionBean==null) {
			this.tipoexportarSessionBean=new TipoExportarSessionBean();
		}
		
		this.tipoexportarSessionBean.setsUltimaBusquedaTipoExportar(this.getsAccionBusqueda());
		this.tipoexportarSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoexportarSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoExportarSessionBean tipoexportarSessionBean=new TipoExportarSessionBean();
		
		if(this.tipoexportarSessionBean==null) {
			this.tipoexportarSessionBean=new TipoExportarSessionBean();
		}
		
		if(this.tipoexportarSessionBean.getsUltimaBusquedaTipoExportar()!=null&&!this.tipoexportarSessionBean.getsUltimaBusquedaTipoExportar().equals("")) {
			this.setsAccionBusqueda(tipoexportarSessionBean.getsUltimaBusquedaTipoExportar());
			this.setiNumeroPaginacion(tipoexportarSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoexportarSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoexportarSessionBean.setsUltimaBusquedaTipoExportar("");
		this.tipoexportarSessionBean.setiNumeroPaginacion(TipoExportarConstantesFunciones.INUMEROPAGINACION);
		this.tipoexportarSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoExportar(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoExportar() {
		this.updateBorderResaltarBusquedasFormularioTipoExportar();
		this.updateVisibilidadBusquedasFormularioTipoExportar();
		this.updateHabilitarBusquedasFormularioTipoExportar();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoExportar() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoExportar() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoExportar() {
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
	
	public void updateControlesFormularioTipoExportar() throws Exception {

		if(this.jInternalFrameDetalleFormTipoExportar==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoExportar();
		this.updateVisibilidadResaltarControlesFormularioTipoExportar();
		this.updateHabilitarResaltarControlesFormularioTipoExportar();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoExportar() throws Exception {
		if(this.jInternalFrameDetalleFormTipoExportar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoexportarConstantesFunciones.resaltaridTipoExportar!=null && this.jInternalFrameDetalleFormTipoExportar!=null) {this.jInternalFrameDetalleFormTipoExportar.jTextFieldidTipoExportar.setBorder(this.tipoexportarConstantesFunciones.resaltaridTipoExportar);}
		if(this.tipoexportarConstantesFunciones.resaltarcodigoTipoExportar!=null && this.jInternalFrameDetalleFormTipoExportar!=null) {this.jInternalFrameDetalleFormTipoExportar.jTextFieldcodigoTipoExportar.setBorder(this.tipoexportarConstantesFunciones.resaltarcodigoTipoExportar);}
		if(this.tipoexportarConstantesFunciones.resaltarnombreTipoExportar!=null && this.jInternalFrameDetalleFormTipoExportar!=null) {this.jInternalFrameDetalleFormTipoExportar.jTextAreanombreTipoExportar.setBorder(this.tipoexportarConstantesFunciones.resaltarnombreTipoExportar);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoExportar() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoExportar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) {
	
		//this.jInternalFrameDetalleFormTipoExportar.jTextFieldidTipoExportar.setVisible(this.tipoexportarConstantesFunciones.mostraridTipoExportar);
		this.jInternalFrameDetalleFormTipoExportar.jPanelidTipoExportar.setVisible(this.tipoexportarConstantesFunciones.mostraridTipoExportar);
		//this.jInternalFrameDetalleFormTipoExportar.jTextFieldcodigoTipoExportar.setVisible(this.tipoexportarConstantesFunciones.mostrarcodigoTipoExportar);
		this.jInternalFrameDetalleFormTipoExportar.jPanelcodigoTipoExportar.setVisible(this.tipoexportarConstantesFunciones.mostrarcodigoTipoExportar);
		//this.jInternalFrameDetalleFormTipoExportar.jTextAreanombreTipoExportar.setVisible(this.tipoexportarConstantesFunciones.mostrarnombreTipoExportar);
		this.jInternalFrameDetalleFormTipoExportar.jPanelnombreTipoExportar.setVisible(this.tipoexportarConstantesFunciones.mostrarnombreTipoExportar);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoExportar() throws Exception {
		if(this.jInternalFrameDetalleFormTipoExportar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoExportar!=null) {
	
		this.jInternalFrameDetalleFormTipoExportar.jTextFieldidTipoExportar.setEnabled(this.tipoexportarConstantesFunciones.activaridTipoExportar);
		this.jInternalFrameDetalleFormTipoExportar.jTextFieldcodigoTipoExportar.setEnabled(this.tipoexportarConstantesFunciones.activarcodigoTipoExportar);
		this.jInternalFrameDetalleFormTipoExportar.jTextAreanombreTipoExportar.setEnabled(this.tipoexportarConstantesFunciones.activarnombreTipoExportar);
		}
	}
	
		
}