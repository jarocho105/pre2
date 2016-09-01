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

import com.bydan.erp.contabilidad.util.TipoImportacionConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoImportacionParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoImportacionParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoImportacionBean;
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
public class TipoImportacionBeanSwingJInternalFrame extends TipoImportacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoImportacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoImportacion> tipoimportacionValidator = new ClassValidator<TipoImportacion>(TipoImportacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoImportacion tipoimportacion;	
	public TipoImportacion tipoimportacionAux;
	public TipoImportacion tipoimportacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoImportacion tipoimportacionTotales;
	public Long idTipoImportacionActual;
	public Long iIdNuevoTipoImportacion=0L;
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
	
	public Boolean isPermisoTodoTipoImportacion;
	public Boolean isPermisoNuevoTipoImportacion;
	public Boolean isPermisoActualizarTipoImportacion;
	public Boolean isPermisoActualizarOriginalTipoImportacion;
	public Boolean isPermisoEliminarTipoImportacion;
	public Boolean isPermisoGuardarCambiosTipoImportacion;
	public Boolean isPermisoConsultaTipoImportacion;
	public Boolean isPermisoBusquedaTipoImportacion;
	public Boolean isPermisoReporteTipoImportacion;
	public Boolean isPermisoPaginacionMedioTipoImportacion;
	public Boolean isPermisoPaginacionAltoTipoImportacion;
	public Boolean isPermisoPaginacionTodoTipoImportacion;
	public Boolean isPermisoCopiarTipoImportacion;
	public Boolean isPermisoVerFormTipoImportacion;
	public Boolean isPermisoDuplicarTipoImportacion;
	public Boolean isPermisoOrdenTipoImportacion;
	
	
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
	
	public TipoImportacionParameterReturnGeneral tipoimportacionReturnGeneral;
	public TipoImportacionParameterReturnGeneral tipoimportacionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoImportacion=false;
	public Boolean esParaAccionDesdeFormularioTipoImportacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoImportacionLogic tipoimportacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoImportacion tipoimportacionBean;
	public TipoImportacionConstantesFunciones tipoimportacionConstantesFunciones;
	//public TipoImportacionParameterReturnGeneral tipoimportacionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoImportacion> tipoimportacions;	
	//public List<TipoImportacion> tipoimportacionsEliminados;
	//public List<TipoImportacion> tipoimportacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoImportacion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoImportacion=true;
	public Boolean isVisibilidadCeldaCopiarTipoImportacion=true;
	public Boolean isVisibilidadCeldaVerFormTipoImportacion=true;
	public Boolean isVisibilidadCeldaOrdenTipoImportacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoImportacion=false;
	public Boolean isVisibilidadCeldaModificarTipoImportacion=false;
	public Boolean isVisibilidadCeldaActualizarTipoImportacion=false;
	public Boolean isVisibilidadCeldaEliminarTipoImportacion=false;
	public Boolean isVisibilidadCeldaCancelarTipoImportacion=false;
	public Boolean isVisibilidadCeldaGuardarTipoImportacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoImportacion=false;	
	
	
	
	public Long getiIdNuevoTipoImportacion() {
		return this.iIdNuevoTipoImportacion;
	}

	public void setiIdNuevoTipoImportacion(Long iIdNuevoTipoImportacion) {
		this.iIdNuevoTipoImportacion = iIdNuevoTipoImportacion;
	}
	
	public Long getidTipoImportacionActual() {
		return this.idTipoImportacionActual;
	}

	public void setidTipoImportacionActual(Long idTipoImportacionActual) {
		this.idTipoImportacionActual = idTipoImportacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoImportacion gettipoimportacion() {
		return this.tipoimportacion;
	}

	public void settipoimportacion(TipoImportacion tipoimportacion) {
		this.tipoimportacion = tipoimportacion;
	}
	
	public TipoImportacion gettipoimportacionAux() {
		return this.tipoimportacionAux;
	}

	public void settipoimportacionAux(TipoImportacion tipoimportacionAux) {
		this.tipoimportacionAux = tipoimportacionAux;
	}				
	
	public TipoImportacion gettipoimportacionAnterior() {
		return this.tipoimportacionAnterior;
	}

	public void settipoimportacionAnterior(TipoImportacion tipoimportacionAnterior) {
		this.tipoimportacionAnterior = tipoimportacionAnterior;
	}	
	
	public TipoImportacion gettipoimportacionTotales() {
		return this.tipoimportacionTotales;
	}

	public void settipoimportacionTotales(TipoImportacion tipoimportacionTotales) {
		this.tipoimportacionTotales = tipoimportacionTotales;
	}	
	
	public TipoImportacion gettipoimportacionBean() {
		return this.tipoimportacionBean;
	}

	public void settipoimportacionBean(TipoImportacion tipoimportacionBean) {
		this.tipoimportacionBean = tipoimportacionBean;
	}	
	
	public TipoImportacionParameterReturnGeneral gettipoimportacionReturnGeneral() {
		return this.tipoimportacionReturnGeneral;
	}

	public void settipoimportacionReturnGeneral(TipoImportacionParameterReturnGeneral tipoimportacionReturnGeneral) {
		this.tipoimportacionReturnGeneral = tipoimportacionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoImportacionLogic getTipoImportacionLogic()	{		
		return tipoimportacionLogic;
	}

	public void setTipoImportacionLogic(TipoImportacionLogic tipoimportacionLogic) {
		this.tipoimportacionLogic = tipoimportacionLogic;
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
	
	public Boolean getIsEsNuevoTipoImportacion() {
		return isEsNuevoTipoImportacion;
	}

	public void setIsEsNuevoTipoImportacion(Boolean isEsNuevoTipoImportacion) {
		this.isEsNuevoTipoImportacion = isEsNuevoTipoImportacion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoImportacion() {
		return esParaAccionDesdeFormularioTipoImportacion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoImportacion(Boolean esParaAccionDesdeFormularioTipoImportacion) {
		this.esParaAccionDesdeFormularioTipoImportacion = esParaAccionDesdeFormularioTipoImportacion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoImportacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoImportacionConstantesFunciones.refrescarForeignKeysDescripcionesTipoImportacion(this.tipoimportacionLogic.getTipoImportacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoImportacionConstantesFunciones.refrescarForeignKeysDescripcionesTipoImportacion(this.tipoimportacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoimportacionLogic.setTipoImportacions(this.tipoimportacions);
			tipoimportacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoImportacionParameterReturnGeneral getTipoImportacionParameterGeneral() {
		return this.tipoimportacionParameterGeneral;
	}
	
	public void setTipoImportacionParameterGeneral(TipoImportacionParameterReturnGeneral tipoimportacionParameterGeneral) {
		this.tipoimportacionParameterGeneral = tipoimportacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoImportacion() {
		return isPermisoTodoTipoImportacion;
	}

	public void setIsPermisoTodoTipoImportacion(Boolean isPermisoTodoTipoImportacion) {
		this.isPermisoTodoTipoImportacion = isPermisoTodoTipoImportacion;
	}

	public Boolean getIsPermisoNuevoTipoImportacion() {
		return isPermisoNuevoTipoImportacion;
	}

	public void setIsPermisoNuevoTipoImportacion(Boolean isPermisoNuevoTipoImportacion) {
		this.isPermisoNuevoTipoImportacion = isPermisoNuevoTipoImportacion;
	}

	public Boolean getIsPermisoActualizarTipoImportacion() {
		return isPermisoActualizarTipoImportacion;
	}

	public void setIsPermisoActualizarTipoImportacion(Boolean isPermisoActualizarTipoImportacion) {
		this.isPermisoActualizarTipoImportacion = isPermisoActualizarTipoImportacion;
	}

	public Boolean getIsPermisoEliminarTipoImportacion() {
		return isPermisoEliminarTipoImportacion;
	}

	public void setIsPermisoEliminarTipoImportacion(Boolean isPermisoEliminarTipoImportacion) {
		this.isPermisoEliminarTipoImportacion = isPermisoEliminarTipoImportacion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoImportacion() {
		return isPermisoGuardarCambiosTipoImportacion;
	}

	public void setIsPermisoGuardarCambiosTipoImportacion(Boolean isPermisoGuardarCambiosTipoImportacion) {
		this.isPermisoGuardarCambiosTipoImportacion = isPermisoGuardarCambiosTipoImportacion;
	}
	
	public Boolean getIsPermisoConsultaTipoImportacion() {
		return isPermisoConsultaTipoImportacion;
	}

	public void setIsPermisoConsultaTipoImportacion(Boolean isPermisoConsultaTipoImportacion) {
		this.isPermisoConsultaTipoImportacion = isPermisoConsultaTipoImportacion;
	}

	public Boolean getIsPermisoBusquedaTipoImportacion() {
		return isPermisoBusquedaTipoImportacion;
	}

	public void setIsPermisoBusquedaTipoImportacion(Boolean isPermisoBusquedaTipoImportacion) {
		this.isPermisoBusquedaTipoImportacion = isPermisoBusquedaTipoImportacion;
	}

	public Boolean getIsPermisoReporteTipoImportacion() {
		return isPermisoReporteTipoImportacion;
	}

	public void setIsPermisoReporteTipoImportacion(Boolean isPermisoReporteTipoImportacion) {
		this.isPermisoReporteTipoImportacion = isPermisoReporteTipoImportacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoImportacion() {
		return isPermisoPaginacionMedioTipoImportacion;
	}

	public void setIsPermisoPaginacionMedioTipoImportacion(Boolean isPermisoPaginacionMedioTipoImportacion) {
		this.isPermisoPaginacionMedioTipoImportacion = isPermisoPaginacionMedioTipoImportacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoImportacion() {
		return isPermisoPaginacionTodoTipoImportacion;
	}

	public void setIsPermisoPaginacionTodoTipoImportacion(Boolean isPermisoPaginacionTodoTipoImportacion) {
		this.isPermisoPaginacionTodoTipoImportacion = isPermisoPaginacionTodoTipoImportacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoImportacion() {
		return isPermisoPaginacionAltoTipoImportacion;
	}

	public void setIsPermisoPaginacionAltoTipoImportacion(Boolean isPermisoPaginacionAltoTipoImportacion) {
		this.isPermisoPaginacionAltoTipoImportacion = isPermisoPaginacionAltoTipoImportacion;
	}
	
	public Boolean getIsPermisoCopiarTipoImportacion() {
		return isPermisoCopiarTipoImportacion;
	}

	public void setIsPermisoCopiarTipoImportacion(Boolean isPermisoCopiarTipoImportacion) {
		this.isPermisoCopiarTipoImportacion = isPermisoCopiarTipoImportacion;
	}
	
	public Boolean getIsPermisoVerFormTipoImportacion() {
		return isPermisoVerFormTipoImportacion;
	}

	public void setIsPermisoVerFormTipoImportacion(Boolean isPermisoVerFormTipoImportacion) {
		this.isPermisoVerFormTipoImportacion = isPermisoVerFormTipoImportacion;
	}
	
	public Boolean getIsPermisoDuplicarTipoImportacion() {
		return isPermisoDuplicarTipoImportacion;
	}

	public void setIsPermisoDuplicarTipoImportacion(Boolean isPermisoDuplicarTipoImportacion) {
		this.isPermisoDuplicarTipoImportacion = isPermisoDuplicarTipoImportacion;
	}
	
	public Boolean getIsPermisoOrdenTipoImportacion() {
		return isPermisoOrdenTipoImportacion;
	}

	public void setIsPermisoOrdenTipoImportacion(Boolean isPermisoOrdenTipoImportacion) {
		this.isPermisoOrdenTipoImportacion = isPermisoOrdenTipoImportacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoImportacion() {
		return isVisibilidadCeldaNuevoTipoImportacion;
	}

	public void setIsVisibilidadCeldaNuevoTipoImportacion(Boolean isVisibilidadCeldaNuevoTipoImportacion) {
		this.isVisibilidadCeldaNuevoTipoImportacion = isVisibilidadCeldaNuevoTipoImportacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoImportacion() {
		return isVisibilidadCeldaDuplicarTipoImportacion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoImportacion(Boolean isVisibilidadCeldaDuplicarTipoImportacion) {
		this.isVisibilidadCeldaDuplicarTipoImportacion = isVisibilidadCeldaDuplicarTipoImportacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoImportacion() {
		return isVisibilidadCeldaCopiarTipoImportacion;
	}

	public void setIsVisibilidadCeldaCopiarTipoImportacion(Boolean isVisibilidadCeldaCopiarTipoImportacion) {
		this.isVisibilidadCeldaCopiarTipoImportacion = isVisibilidadCeldaCopiarTipoImportacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoImportacion() {
		return isVisibilidadCeldaVerFormTipoImportacion;
	}

	public void setIsVisibilidadCeldaVerFormTipoImportacion(Boolean isVisibilidadCeldaVerFormTipoImportacion) {
		this.isVisibilidadCeldaVerFormTipoImportacion = isVisibilidadCeldaVerFormTipoImportacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoImportacion() {
		return isVisibilidadCeldaOrdenTipoImportacion;
	}

	public void setIsVisibilidadCeldaOrdenTipoImportacion(Boolean isVisibilidadCeldaOrdenTipoImportacion) {
		this.isVisibilidadCeldaOrdenTipoImportacion = isVisibilidadCeldaOrdenTipoImportacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoImportacion() {
		return isVisibilidadCeldaNuevoRelacionesTipoImportacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoImportacion(Boolean isVisibilidadCeldaNuevoRelacionesTipoImportacion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoImportacion = isVisibilidadCeldaNuevoRelacionesTipoImportacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoImportacion() {
		return isVisibilidadCeldaModificarTipoImportacion;
	}

	public void setIsVisibilidadCeldaModificarTipoImportacion(Boolean isVisibilidadCeldaModificarTipoImportacion) {
		this.isVisibilidadCeldaModificarTipoImportacion = isVisibilidadCeldaModificarTipoImportacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoImportacion() {
		return isVisibilidadCeldaActualizarTipoImportacion;
	}

	public void setIsVisibilidadCeldaActualizarTipoImportacion(Boolean isVisibilidadCeldaActualizarTipoImportacion) {
		this.isVisibilidadCeldaActualizarTipoImportacion = isVisibilidadCeldaActualizarTipoImportacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoImportacion() {
		return isVisibilidadCeldaEliminarTipoImportacion;
	}

	public void setIsVisibilidadCeldaEliminarTipoImportacion(Boolean isVisibilidadCeldaEliminarTipoImportacion) {
		this.isVisibilidadCeldaEliminarTipoImportacion = isVisibilidadCeldaEliminarTipoImportacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoImportacion() {
		return isVisibilidadCeldaCancelarTipoImportacion;
	}

	public void setIsVisibilidadCeldaCancelarTipoImportacion(Boolean isVisibilidadCeldaCancelarTipoImportacion) {
		this.isVisibilidadCeldaCancelarTipoImportacion = isVisibilidadCeldaCancelarTipoImportacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoImportacion() {
		return isVisibilidadCeldaGuardarTipoImportacion;
	}

	public void setIsVisibilidadCeldaGuardarTipoImportacion(Boolean isVisibilidadCeldaGuardarTipoImportacion) {
		this.isVisibilidadCeldaGuardarTipoImportacion = isVisibilidadCeldaGuardarTipoImportacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoImportacion() {
		return isVisibilidadCeldaGuardarCambiosTipoImportacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoImportacion(Boolean isVisibilidadCeldaGuardarCambiosTipoImportacion) {
		this.isVisibilidadCeldaGuardarCambiosTipoImportacion = isVisibilidadCeldaGuardarCambiosTipoImportacion;
	}
		
	public TipoImportacionSessionBean gettipoimportacionSessionBean() {
		return this.tipoimportacionSessionBean;
	}
	
	public void settipoimportacionSessionBean(TipoImportacionSessionBean tipoimportacionSessionBean) {
		this.tipoimportacionSessionBean=tipoimportacionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(TipoImportacion tipoimportacion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoImportacion tipoimportacion,TipoImportacion tipoimportacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoImportacion(tipoimportacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoimportacionAux.setId(tipoimportacion.getId());
		tipoimportacionAux.setVersionRow(tipoimportacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoImportacion();
		
			int intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacion =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoimportacion =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoImportacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoImportacion(this.tipoimportacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(this.tipoimportacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoimportacionValidator.getInvalidValues(this.tipoimportacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoimportacionLogic.setDatosCliente(datosCliente);
			tipoimportacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoimportacionAux=new  TipoImportacion();
				
				tipoimportacionAux.setIsNew(true);
				tipoimportacionAux.setIsChanged(true);
				
				tipoimportacionAux.setTipoImportacionOriginal(this.tipoimportacion);
				
				tipoimportacionAux.setId(this.tipoimportacion.getId());	
				tipoimportacionAux.setVersionRow(this.tipoimportacion.getVersionRow());	
				tipoimportacionAux.setcodigo(this.tipoimportacion.getcodigo());	
				tipoimportacionAux.setnombre(this.tipoimportacion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoimportacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoimportacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoimportacionAux,tipoimportacionLogic.getTipoImportacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoimportacionAux,tipoimportacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoimportacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoimportacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimportacionLogic.saveTipoImportacions();//WithConnection
						//tipoimportacionLogic.getSetVersionRowTipoImportacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoimportacion,tipoimportacionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoimportacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoimportacionAux=new  TipoImportacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoimportacionSessionBean.getEsGuardarRelacionado() && this.tipoimportacion.getId()>=0)) {
						
					tipoimportacionAux.setIsNew(false);
				}
				
				tipoimportacionAux.setIsDeleted(false);
			
				tipoimportacionAux.setId(this.tipoimportacion.getId());	
				tipoimportacionAux.setVersionRow(this.tipoimportacion.getVersionRow());	
				tipoimportacionAux.setcodigo(this.tipoimportacion.getcodigo());	
				tipoimportacionAux.setnombre(this.tipoimportacion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoimportacionAux,tipoimportacionLogic.getTipoImportacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoimportacionAux,tipoimportacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoimportacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoimportacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimportacionLogic.saveTipoImportacions();//WithConnection
						//tipoimportacionLogic.getSetVersionRowTipoImportacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoimportacion,tipoimportacionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoimportacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoimportacionAux=new  TipoImportacion();
				
				tipoimportacionAux.setIsNew(false);
				tipoimportacionAux.setIsChanged(false);
				
				tipoimportacionAux.setIsDeleted(true);
				
				tipoimportacionAux.setId(this.tipoimportacion.getId());	
				tipoimportacionAux.setVersionRow(this.tipoimportacion.getVersionRow());	
				tipoimportacionAux.setcodigo(this.tipoimportacion.getcodigo());	
				tipoimportacionAux.setnombre(this.tipoimportacion.getnombre());	
				
				if(this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoimportacionAux.getId()>=0) {	
						this.tipoimportacionsEliminados.add(tipoimportacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoimportacionAux,tipoimportacionLogic.getTipoImportacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoimportacionAux,tipoimportacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoimportacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoimportacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimportacionLogic.saveTipoImportacions();//WithConnection
						//tipoimportacionLogic.getSetVersionRowTipoImportacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoimportacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoimportacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoimportacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoimportacionAux,tipoimportacionLogic.getTipoImportacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoimportacionAux,tipoimportacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionLogic.getTipoImportacions().addAll(this.tipoimportacionsEliminados);
					
					tipoimportacionLogic.saveTipoImportacions();//WithConnection
					//tipoimportacionLogic.getSetVersionRowTipoImportacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoimportacionsEliminados= new ArrayList<TipoImportacion>();		
			}
			
			if(this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Importacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Importacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoimportacion=tipoimportacionAux;
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
      		//this.finishProcessTipoImportacion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoImportacion tipoimportacionLocal) throws Exception {
		
		if(this.tipoimportacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoImportacion tipoimportacionLocal) throws Exception {	
		if(this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoImportacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoimportacion =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoimportacion =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoimportacionValidator.getInvalidValues(this.tipoimportacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoImportacion tipoimportacion,List<TipoImportacion> tipoimportacions) throws Exception {
		try	{		
			TipoImportacionConstantesFunciones.actualizarLista(tipoimportacion,tipoimportacions,this.tipoimportacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoImportacion tipoimportacion,List<TipoImportacion> tipoimportacions) throws Exception {
		try	{			
			TipoImportacionConstantesFunciones.actualizarSelectedLista(tipoimportacion,tipoimportacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoImportacion> tipoimportacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoimportacionsLocal=this.tipoimportacionLogic.getTipoImportacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoimportacionsLocal=this.tipoimportacions;
			}
			//ARCHITECTURE
		
			for(TipoImportacion tipoimportacionLocal:tipoimportacionsLocal) {
				if(this.permiteMantenimiento(tipoimportacionLocal) && tipoimportacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoImportacionConstantesFunciones.getTipoImportacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoImportacionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImportacion.jLabelcodigoTipoImportacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoImportacionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImportacion.jLabelnombreTipoImportacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoImportacion.jLabelcodigoTipoImportacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoImportacion.jLabelnombreTipoImportacion,"");
		
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
		this.iIdNuevoTipoImportacion--;	
		
		
		this.tipoimportacionAux=new TipoImportacion();
		
		this.tipoimportacionAux.setId(this.iIdNuevoTipoImportacion);
		this.tipoimportacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoimportacionLogic.getTipoImportacions().add(this.tipoimportacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoimportacions.add(this.tipoimportacionAux);
		}
		//ARCHITECTURE
		
		this.tipoimportacion=this.tipoimportacionAux;
		
		if(TipoImportacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoImportacion(this.tipoimportacion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoImportacion(this.tipoimportacion);
		}
				
		//this.setDefaultControlesTipoImportacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoImportacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoImportacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoImportacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoImportacion(this.tipoimportacionBean,this.tipoimportacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(this.tipoimportacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoImportacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoimportacionSessionBean.getConGuardarRelaciones()) {
			classes=TipoImportacionConstantesFunciones.getClassesRelationshipsOfTipoImportacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoimportacionReturnGeneral=tipoimportacionLogic.procesarEventosTipoImportacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoimportacionLogic.getTipoImportacions(),this.tipoimportacion,this.tipoimportacionParameterGeneral,this.isEsNuevoTipoImportacion,classes);//this.tipoimportacionLogic.getTipoImportacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoImportacion(this.tipoimportacionReturnGeneral,this.tipoimportacionBean,false);
		
		if(this.tipoimportacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoImportacion(this.tipoimportacionReturnGeneral.getTipoImportacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoImportacion(this.tipoimportacionReturnGeneral.getTipoImportacion());
		}
		
		if(this.tipoimportacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoImportacion(this.tipoimportacionReturnGeneral.getTipoImportacion(),classes);//this.tipoimportacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoImportacion(this.tipoimportacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoImportacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoImportacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoImportacion(false);
						
			if(tipoimportacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoImportacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoImportacion();
			}
			
			this.actualizarVisualTableDatosTipoImportacion();
			
			this.jTableDatosTipoImportacion.setRowSelectionInterval(this.getIndiceNuevoTipoImportacion(), this.getIndiceNuevoTipoImportacion());
			
			this.seleccionarFilaTablaTipoImportacionActual();
						
			this.actualizarEstadoCeldasBotonesTipoImportacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoImportacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoImportacion.jTextFieldcodigoTipoImportacion.setEnabled(isHabilitar && this.tipoimportacionConstantesFunciones.activarcodigoTipoImportacion);
		this.jInternalFrameDetalleFormTipoImportacion.jTextAreanombreTipoImportacion.setEnabled(isHabilitar && this.tipoimportacionConstantesFunciones.activarnombreTipoImportacion);	
		
	};
	
	public void setDefaultControlesTipoImportacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoImportacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoimportacionSessionBean.setConGuardarRelaciones(true);			
			this.tipoimportacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoImportacion.jTabbedPaneRelacionesTipoImportacion.setVisible(true);
			
					
		} else {
			//this.tipoimportacionSessionBean.setConGuardarRelaciones(false);			
			this.tipoimportacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoImportacion.jTabbedPaneRelacionesTipoImportacion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoImportacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImportacion tipoimportacionAux:this.tipoimportacionLogic.getTipoImportacions()) {
				if(tipoimportacionAux.getId().equals(this.iIdNuevoTipoImportacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImportacion tipoimportacionAux:this.tipoimportacions) {
				if(tipoimportacionAux.getId().equals(this.iIdNuevoTipoImportacion)) {
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
	
	public int getIndiceActualTipoImportacion(TipoImportacion tipoimportacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImportacion tipoimportacionAux:this.tipoimportacionLogic.getTipoImportacions()) {
				if(tipoimportacionAux.getId().equals(tipoimportacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImportacion tipoimportacionAux:this.tipoimportacions) {
				if(tipoimportacionAux.getId().equals(tipoimportacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoImportacion(TipoImportacion tipoimportacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImportacion tipoimportacionAux:this.tipoimportacionLogic.getTipoImportacions()) {
				if(tipoimportacionAux.getTipoImportacionOriginal().getId().equals(tipoimportacionOriginal.getId())) {
					existe=true;
					tipoimportacionOriginal.setId(tipoimportacionAux.getId());
					tipoimportacionOriginal.setVersionRow(tipoimportacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImportacion tipoimportacionAux:this.tipoimportacions) {
				if(tipoimportacionAux.getTipoImportacionOriginal().getId().equals(tipoimportacionOriginal.getId())) {
					existe=true;
					tipoimportacionOriginal.setId(tipoimportacionAux.getId());
					tipoimportacionOriginal.setVersionRow(tipoimportacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoImportacion(Boolean esParaCancelar) throws Exception {
		tipoimportacionsAux=new ArrayList<TipoImportacion>();
		tipoimportacionAux=new TipoImportacion();
		
		if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoImportacion tipoimportacionAux:this.tipoimportacionLogic.getTipoImportacions()) {
					if(tipoimportacionAux.getId()<0) {
						tipoimportacionsAux.add(tipoimportacionAux);
					}		
				}
				this.iIdNuevoTipoImportacion=0L;
				this.tipoimportacionLogic.getTipoImportacions().removeAll(tipoimportacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoImportacion tipoimportacionAux:this.tipoimportacions) {
					if(tipoimportacionAux.getId()<0) {
						tipoimportacionsAux.add(tipoimportacionAux);
					}		
				}
				this.iIdNuevoTipoImportacion=0L;
				this.tipoimportacions.removeAll(tipoimportacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoImportacion 
					&& this.tipoimportacionLogic.getTipoImportacions().size()>0
					) {
					tipoimportacionAux=this.tipoimportacionLogic.getTipoImportacions().get(this.tipoimportacionLogic.getTipoImportacions().size() - 1);
				
					if(tipoimportacionAux.getId()<0) {
						this.tipoimportacionLogic.getTipoImportacions().remove(tipoimportacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoImportacion && this.tipoimportacions.size()>0) {
					tipoimportacionAux=this.tipoimportacions.get(this.tipoimportacions.size() - 1);
				
					if(tipoimportacionAux.getId()<0) {
						this.tipoimportacions.remove(tipoimportacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoImportacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoimportacion.getId()<0) {
				this.tipoimportacionLogic.getTipoImportacions().remove(this.tipoimportacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoimportacion.getId()<0) {
				this.tipoimportacions.remove(this.tipoimportacion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoImportacion(List<TipoImportacion> tipoimportacionsAux) throws Exception {
		TipoImportacionConstantesFunciones.setEstadosInicialesTipoImportacion(tipoimportacionsAux);
	}
	
	public void setEstadosInicialesTipoImportacion(TipoImportacion tipoimportacionAux) throws Exception {
		TipoImportacionConstantesFunciones.setEstadosInicialesTipoImportacion(tipoimportacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoImportacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoImportacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoImportacionActual()) {
				if(!this.isEsNuevoTipoImportacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoImportacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoImportacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoImportacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Importacion ?", "MANTENIMIENTO DE Tipo Importacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoImportacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoImportacion tipoimportacion) throws Exception {
		TipoImportacionConstantesFunciones.seleccionarAsignar(this.tipoimportacion,tipoimportacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoImportacion=this.isPermisoActualizarOriginalTipoImportacion;
			
			
			this.seleccionarAsignar(tipoimportacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoImportacionConstantesFunciones.quitarEspaciosTipoImportacion(this.tipoimportacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoImportacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoimportacionSessionBean.setsFuncionBusquedaRapida(this.tipoimportacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoImportacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoImportacion(esParaCancelar);				
				this.cancelarNuevoTipoImportacion(esParaCancelar);								
			}
			
			this.tipoimportacion=new TipoImportacion();
			
			this.inicializarTipoImportacion();
			
			this.actualizarEstadoCeldasBotonesTipoImportacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoImportacion() throws Exception {
		try {
			TipoImportacionConstantesFunciones.inicializarTipoImportacion(this.tipoimportacion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoimportacionLogic.getTipoImportacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoImportacions(String sAccionBusqueda,List<TipoImportacion> tipoimportacionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoImportacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoImportacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoImportacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoImportacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Importacions");		
		parameters.put("busquedapor", TipoImportacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoImportacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoImportacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoImportacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoImportacion=new JRBeanArrayDataSource(TipoImportacionJInternalFrame.TraerTipoImportacionBeans(tipoimportacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoImportacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoImportacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoImportacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoImportacionBean.TraerTipoImportacionBeans(tipoimportacionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoImportacions(sAccionBusqueda,sTipoArchivoReporte,tipoimportacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoImportacions(sAccionBusqueda,sTipoArchivoReporte,tipoimportacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoImportacionActionPerformed(null);
					//this.generarExcelReporteTipoImportacions(sAccionBusqueda,sTipoArchivoReporte,tipoimportacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoImportacions(sAccionBusqueda,sTipoArchivoReporte,tipoimportacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoImportacions(sAccionBusqueda,sTipoArchivoReporte,tipoimportacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoImportacions(sAccionBusqueda,sTipoArchivoReporte,tipoimportacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoImportacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoImportacion> tipoimportacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimportacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoImportacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoImportacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoImportacion tipoimportacion : tipoimportacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoImportacionConstantesFunciones.generarExcelReporteDataTipoImportacion("NORMAL",row,workbook,tipoimportacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Importacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoImportacion(String sTipo,Row row,Workbook workbook) {
		
		TipoImportacionConstantesFunciones.generarExcelReporteHeaderTipoImportacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoImportacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoImportacion> tipoimportacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimportacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoImportacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoImportacion tipoimportacion : tipoimportacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoImportacionConstantesFunciones.getTipoImportacionDescripcion(tipoimportacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoImportacionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoImportacionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoimportacion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoImportacionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoImportacionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoimportacion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Importacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoImportacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoImportacion> tipoimportacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoImportacion> tipoimportacionsRespaldo=null;
		
		classes=TipoImportacionConstantesFunciones.getClassesRelationshipsOfTipoImportacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoimportacionLogic.setDatosCliente(this.datosCliente);
		this.tipoimportacionLogic.setDatosDeep(this.datosDeep);
		this.tipoimportacionLogic.setIsConDeep(true);
		
		tipoimportacionsRespaldo=this.tipoimportacionLogic.getTipoImportacions();
		
		this.tipoimportacionLogic.setTipoImportacions(tipoimportacionsParaReportes);	
		this.tipoimportacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoimportacionsParaReportes=this.tipoimportacionLogic.getTipoImportacions();
		this.tipoimportacionLogic.setTipoImportacions(tipoimportacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimportacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoImportacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoImportacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoImportacion tipoimportacion : tipoimportacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoImportacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoImportacionConstantesFunciones.generarExcelReporteDataTipoImportacion("NORMAL",row,workbook,tipoimportacion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoImportacionConstantesFunciones.getTipoImportacionDescripcion(tipoimportacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Importacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoImportacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImportacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoImportacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImportacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoImportacion() throws Exception {		
		this.startProcessTipoImportacion(true);
	}
	
	public void startProcessTipoImportacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoImportacion, this.jScrollPanelDatosTipoImportacion,this.jPanelPaginacionTipoImportacion, this.jScrollPanelDatosEdicionTipoImportacion, this.jPanelAccionesTipoImportacion,this.jPanelAccionesFormularioTipoImportacion,this.jmenuBarTipoImportacion,this.jmenuBarDetalleTipoImportacion,this.jTtoolBarTipoImportacion,this.jTtoolBarDetalleTipoImportacion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoImportacion=null; 
		
		final JPanel jPanelParametrosReportesTipoImportacion=this.jPanelParametrosReportesTipoImportacion;
		//final JScrollPane jScrollPanelDatosTipoImportacion=this.jScrollPanelDatosTipoImportacion;
		final JTable jTableDatosTipoImportacion=this.jTableDatosTipoImportacion;		
		final JPanel jPanelPaginacionTipoImportacion=this.jPanelPaginacionTipoImportacion;
		//final JScrollPane jScrollPanelDatosEdicionTipoImportacion=this.jScrollPanelDatosEdicionTipoImportacion;
		final JPanel jPanelAccionesTipoImportacion=this.jPanelAccionesTipoImportacion;
		
		JPanel jPanelCamposAuxiliarTipoImportacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoImportacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
			jPanelCamposAuxiliarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jPanelCamposTipoImportacion;
			jPanelAccionesFormularioAuxiliarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jPanelAccionesFormularioTipoImportacion;
		}
		
		final JPanel jPanelCamposTipoImportacion=jPanelCamposAuxiliarTipoImportacion;
		final JPanel jPanelAccionesFormularioTipoImportacion=jPanelAccionesFormularioAuxiliarTipoImportacion;
		
		
		final JMenuBar jmenuBarTipoImportacion=this.jmenuBarTipoImportacion;
		final JToolBar jTtoolBarTipoImportacion=this.jTtoolBarTipoImportacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoImportacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoImportacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
			jmenuBarDetalleAuxiliarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jmenuBarDetalleTipoImportacion;
			jTtoolBarDetalleAuxiliarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jTtoolBarDetalleTipoImportacion;
		}
		
		final JMenuBar jmenuBarDetalleTipoImportacion=jmenuBarDetalleAuxiliarTipoImportacion;
		final JToolBar jTtoolBarDetalleTipoImportacion=jTtoolBarDetalleAuxiliarTipoImportacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoImportacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoImportacion;
			processRunnable.jTableDatos=jTableDatosTipoImportacion;
			processRunnable.jPanelCampos=jPanelCamposTipoImportacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoImportacion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoImportacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoImportacion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoImportacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoImportacion;
			processRunnable.jTtoolBar=jTtoolBarTipoImportacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoImportacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoImportacion ,jPanelParametrosReportesTipoImportacion,jTableDatosTipoImportacion, /*jScrollPanelDatosTipoImportacion,*/jPanelCamposTipoImportacion,jPanelPaginacionTipoImportacion, /*jScrollPanelDatosEdicionTipoImportacion,*/ jPanelAccionesTipoImportacion,jPanelAccionesFormularioTipoImportacion,jmenuBarTipoImportacion,jmenuBarDetalleTipoImportacion,jTtoolBarTipoImportacion,jTtoolBarDetalleTipoImportacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoImportacion, jScrollPanelDatosTipoImportacion,jPanelPaginacionTipoImportacion, jScrollPanelDatosEdicionTipoImportacion, jPanelAccionesTipoImportacion,jPanelAccionesFormularioTipoImportacion,jmenuBarTipoImportacion,jmenuBarDetalleTipoImportacion,jTtoolBarTipoImportacion,jTtoolBarDetalleTipoImportacion);
						
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
	
	public void finishProcessTipoImportacion() {// throws Exception 
		this.finishProcessTipoImportacion(true);
	}
	
	public void finishProcessTipoImportacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoImportacion, this.jScrollPanelDatosTipoImportacion,this.jPanelPaginacionTipoImportacion, this.jScrollPanelDatosEdicionTipoImportacion, this.jPanelAccionesTipoImportacion,this.jPanelAccionesFormularioTipoImportacion,this.jmenuBarTipoImportacion,this.jmenuBarDetalleTipoImportacion,this.jTtoolBarTipoImportacion,this.jTtoolBarDetalleTipoImportacion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoImportacion=null; 
		
		final JPanel jPanelParametrosReportesTipoImportacion=this.jPanelParametrosReportesTipoImportacion;
		//final JScrollPane jScrollPanelDatosTipoImportacion=this.jScrollPanelDatosTipoImportacion;
		final JTable jTableDatosTipoImportacion=this.jTableDatosTipoImportacion;		
		final JPanel jPanelPaginacionTipoImportacion=this.jPanelPaginacionTipoImportacion;
		//final JScrollPane jScrollPanelDatosEdicionTipoImportacion=this.jScrollPanelDatosEdicionTipoImportacion;
		final JPanel jPanelAccionesTipoImportacion=this.jPanelAccionesTipoImportacion;
		
		JPanel jPanelCamposAuxiliarTipoImportacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoImportacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
			jPanelCamposAuxiliarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jPanelCamposTipoImportacion;
			jPanelAccionesFormularioAuxiliarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jPanelAccionesFormularioTipoImportacion;
		}
		
		final JPanel jPanelCamposTipoImportacion=jPanelCamposAuxiliarTipoImportacion;
		final JPanel jPanelAccionesFormularioTipoImportacion=jPanelAccionesFormularioAuxiliarTipoImportacion;
		
		
		final JMenuBar jmenuBarTipoImportacion=this.jmenuBarTipoImportacion;		
		final JToolBar jTtoolBarTipoImportacion=this.jTtoolBarTipoImportacion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoImportacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoImportacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
			jmenuBarDetalleAuxiliarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jmenuBarDetalleTipoImportacion;
			jTtoolBarDetalleAuxiliarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jTtoolBarDetalleTipoImportacion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoImportacion=jmenuBarDetalleAuxiliarTipoImportacion;
		final JToolBar jTtoolBarDetalleTipoImportacion=jTtoolBarDetalleAuxiliarTipoImportacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoImportacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoImportacion;
			processRunnable.jTableDatos=jTableDatosTipoImportacion;
			processRunnable.jPanelCampos=jPanelCamposTipoImportacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoImportacion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoImportacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoImportacion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoImportacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoImportacion;
			processRunnable.jTtoolBar=jTtoolBarTipoImportacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoImportacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoImportacion ,jPanelParametrosReportesTipoImportacion, jTableDatosTipoImportacion,/*jScrollPanelDatosTipoImportacion,*/jPanelCamposTipoImportacion,jPanelPaginacionTipoImportacion, /*jScrollPanelDatosEdicionTipoImportacion,*/ jPanelAccionesTipoImportacion,jPanelAccionesFormularioTipoImportacion,jmenuBarTipoImportacion,jmenuBarDetalleTipoImportacion,jTtoolBarTipoImportacion,jTtoolBarDetalleTipoImportacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoImportacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoImportacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoImportacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoImportacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoImportacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoImportacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoImportacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoImportacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoImportacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoimportacionConstantesFunciones.getsFinalQueryTipoImportacion();
		String  finalQueryPaginacionTodos=this.tipoimportacionConstantesFunciones.getsFinalQueryTipoImportacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoImportacionConstantesFunciones.getArrayColumnasGlobalesNoTipoImportacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoImportacionConstantesFunciones.getArrayColumnasGlobalesTipoImportacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoImportacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoimportacionsEliminados= new ArrayList<TipoImportacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoImportacion();
		
				///*TipoImportacionSessionBean*/this.tipoimportacionSessionBean=new TipoImportacionSessionBean();
			
			if(this.tipoimportacionSessionBean==null) {
				this.tipoimportacionSessionBean=new TipoImportacionSessionBean();
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
					this.iNumeroPaginacion=TipoImportacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoImportacionConstantesFunciones.getClassesForeignKeysOfTipoImportacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoimportacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoimportacionsAux= new ArrayList<TipoImportacion>();
			
				
			tipoimportacionLogic.setDatosCliente(this.datosCliente);
			tipoimportacionLogic.setDatosDeep(this.datosDeep);
			tipoimportacionLogic.setIsConDeep(true);
			
			
			tipoimportacionLogic.getTipoImportacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoimportacionLogic.getTodosTipoImportacions(finalQueryGlobal,pagination);
					
					//tipoimportacionLogic.getTodosTipoImportacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoimportacionLogic.getTipoImportacions()==null|| tipoimportacionLogic.getTipoImportacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoimportacionsAux= new ArrayList<TipoImportacion>();
							tipoimportacionsAux.addAll(tipoimportacionLogic.getTipoImportacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoimportacionsAux= new ArrayList<TipoImportacion>();
							tipoimportacionsAux.addAll(tipoimportacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoimportacionLogic.getTodosTipoImportacions(finalQueryGlobal+"",this.pagination);												
							
							//tipoimportacionLogic.getTodosTipoImportacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoImportacions("Todos",tipoimportacionLogic.getTipoImportacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoimportacionLogic.setTipoImportacions(new ArrayList<TipoImportacion>());					
							tipoimportacionLogic.getTipoImportacions().addAll(tipoimportacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoimportacions=new ArrayList<TipoImportacion>();
							tipoimportacions.addAll(tipoimportacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoImportacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoImportacion=this.idActual;
				
				} else if(this.idTipoImportacionActual!=null && this.idTipoImportacionActual!=0L) {
					idTipoImportacion=idTipoImportacionActual;
				}
				
					
				this.sDetalleReporte=TipoImportacionConstantesFunciones.getDetalleIndicePorId(idTipoImportacion);
				
				this.tipoimportacions=new ArrayList<TipoImportacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoimportacionLogic.getEntity(idTipoImportacion);
					
					//tipoimportacionLogic.getEntityWithConnection(idTipoImportacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoimportacionLogic.setTipoImportacions(new ArrayList<TipoImportacion>());
					tipoimportacionLogic.getTipoImportacions().add(tipoimportacionLogic.getTipoImportacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoimportacions=new ArrayList<TipoImportacion>();
					this.tipoimportacions.add(tipoimportacion);
				}
				
				if(tipoimportacionLogic.getTipoImportacion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoImportacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoImportacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoimportacionLogic.getTipoImportacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoimportacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoimportacionLogic.getTipoImportacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoimportacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoImportacion tipoimportacion) {
		Boolean permite=true;
		
		if(this.tipoimportacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoImportacionConstantesFunciones.getOrderByListaTipoImportacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoImportacionConstantesFunciones.getOrderByListaTipoImportacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImportacion tipoimportacion:tipoimportacionLogic.getTipoImportacions()) {
				if(tipoimportacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoimportacionTotales=tipoimportacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImportacion tipoimportacion:this.tipoimportacions) {
				if(tipoimportacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoimportacionTotales=tipoimportacion;
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
			this.tipoimportacionAux=new TipoImportacion();
			this.tipoimportacionAux.setsType(Constantes2.S_TOTALES);
			this.tipoimportacionAux.setIsNew(false);
			this.tipoimportacionAux.setIsChanged(false);
			this.tipoimportacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoImportacionConstantesFunciones.TotalizarValoresFilaTipoImportacion(this.tipoimportacionLogic.getTipoImportacions(),this.tipoimportacionAux);
				
				this.tipoimportacionLogic.getTipoImportacions().add(this.tipoimportacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoImportacionConstantesFunciones.TotalizarValoresFilaTipoImportacion(this.tipoimportacions,this.tipoimportacionAux);
				
				this.tipoimportacions.add(this.tipoimportacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoimportacionTotales=new TipoImportacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoimportacionLogic.getTipoImportacions().remove(tipoimportacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoimportacions.remove(tipoimportacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoimportacionTotales=new TipoImportacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImportacion tipoimportacion:tipoimportacionLogic.getTipoImportacions()) {
				if(tipoimportacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoimportacionTotales=tipoimportacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoImportacionConstantesFunciones.TotalizarValoresFilaTipoImportacion(this.tipoimportacionLogic.getTipoImportacions(),tipoimportacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImportacion tipoimportacion:this.tipoimportacions) {
				if(tipoimportacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoimportacionTotales=tipoimportacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoImportacionConstantesFunciones.TotalizarValoresFilaTipoImportacion(this.tipoimportacions,tipoimportacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoImportacion() {
		this.isPermisoTodoTipoImportacion=false;
		this.isPermisoNuevoTipoImportacion=false;
		this.isPermisoActualizarTipoImportacion=false;
		this.isPermisoActualizarOriginalTipoImportacion=false;
		this.isPermisoEliminarTipoImportacion=false;
		this.isPermisoGuardarCambiosTipoImportacion=false;
		this.isPermisoConsultaTipoImportacion=false;
		this.isPermisoBusquedaTipoImportacion=false;
		this.isPermisoReporteTipoImportacion=false;		
		this.isPermisoOrdenTipoImportacion=false;		
		this.isPermisoPaginacionMedioTipoImportacion=false;		
		this.isPermisoPaginacionAltoTipoImportacion=false;
		this.isPermisoPaginacionTodoTipoImportacion=false;
		this.isPermisoCopiarTipoImportacion=false;		
		this.isPermisoVerFormTipoImportacion=false;		
		this.isPermisoDuplicarTipoImportacion=false;		
		this.isPermisoOrdenTipoImportacion=false;		
	}
	
	public void setPermisosUsuarioTipoImportacion(Boolean isPermiso) {
		this.isPermisoTodoTipoImportacion=isPermiso;
		this.isPermisoNuevoTipoImportacion=isPermiso;
		this.isPermisoActualizarTipoImportacion=isPermiso;
		this.isPermisoActualizarOriginalTipoImportacion=isPermiso;
		this.isPermisoEliminarTipoImportacion=isPermiso;
		this.isPermisoGuardarCambiosTipoImportacion=isPermiso;
		this.isPermisoConsultaTipoImportacion=isPermiso;
		this.isPermisoBusquedaTipoImportacion=isPermiso;
		this.isPermisoReporteTipoImportacion=isPermiso;
		this.isPermisoOrdenTipoImportacion=isPermiso;		
		this.isPermisoPaginacionMedioTipoImportacion=isPermiso;		
		this.isPermisoPaginacionAltoTipoImportacion=isPermiso;		
		this.isPermisoPaginacionTodoTipoImportacion=isPermiso;		
		this.isPermisoCopiarTipoImportacion=isPermiso;		
		this.isPermisoVerFormTipoImportacion=isPermiso;		
		this.isPermisoDuplicarTipoImportacion=isPermiso;
		this.isPermisoOrdenTipoImportacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoImportacion(Boolean isPermiso) {
		//this.isPermisoTodoTipoImportacion=isPermiso;
		this.isPermisoNuevoTipoImportacion=isPermiso;
		this.isPermisoActualizarTipoImportacion=isPermiso;
		this.isPermisoActualizarOriginalTipoImportacion=isPermiso;
		this.isPermisoEliminarTipoImportacion=isPermiso;
		this.isPermisoGuardarCambiosTipoImportacion=isPermiso;
		//this.isPermisoConsultaTipoImportacion=isPermiso;
		//this.isPermisoBusquedaTipoImportacion=isPermiso;
		//this.isPermisoReporteTipoImportacion=isPermiso;
		//this.isPermisoOrdenTipoImportacion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoImportacion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoImportacion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoImportacion=isPermiso;		
		//this.isPermisoCopiarTipoImportacion=isPermiso;		
		//this.isPermisoDuplicarTipoImportacion=isPermiso;
		//this.isPermisoOrdenTipoImportacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoImportacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoImportacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoImportacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoImportacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoImportacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoImportacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoImportacionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoImportacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoImportacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoImportacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoImportacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoImportacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoImportacion=this.isPermisoActualizarTipoImportacion;
			this.isPermisoEliminarTipoImportacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoImportacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoImportacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoImportacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoImportacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoImportacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoImportacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoImportacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoImportacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoImportacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoImportacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoImportacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoImportacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoImportacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoImportacion.setToolTipText(this.jTableDatosTipoImportacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoImportacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoImportacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoImportacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoImportacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoImportacion() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoImportacionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoImportacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoImportacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoImportacionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoImportacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoImportacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoImportacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoImportacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoImportacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoImportacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoImportacion(TipoImportacion tipoimportacion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoImportacion(TipoImportacion tipoimportacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoImportacion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoImportacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoImportacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoImportacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoImportacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoImportacion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoImportacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoImportacion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoImportacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoImportacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoImportacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoimportacionSessionBean=new TipoImportacionSessionBean(); 
		this.tipoimportacionConstantesFunciones=new TipoImportacionConstantesFunciones(); 
		this.tipoimportacionBean=new TipoImportacion();//(this.tipoimportacionConstantesFunciones); 		
		this.tipoimportacionReturnGeneral=new TipoImportacionParameterReturnGeneral(); 
		
		this.tipoimportacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoimportacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoImportacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoImportacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoImportacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoImportacion(true);
			
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
			
			this.tipoimportacionConstantesFunciones=new TipoImportacionConstantesFunciones(); 
			this.tipoimportacionBean=new TipoImportacion();//this.tipoimportacionConstantesFunciones); 			
			this.tipoimportacionReturnGeneral=new TipoImportacionParameterReturnGeneral(); 
		
			TipoImportacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Importacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoimportacion=new TipoImportacion();
			this.tipoimportacions = new ArrayList<TipoImportacion>();
			this.tipoimportacionsAux = new ArrayList<TipoImportacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic=new TipoImportacionLogic();
				this.tipoimportacionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoimportacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoimportacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoImportacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoImportacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoImportacion);	
					}
					
					if(this.jInternalFrameImportacionTipoImportacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoImportacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoImportacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoImportacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoImportacion);
				this.jInternalFrameDetalleFormTipoImportacion.setVisible(false);
				this.jInternalFrameDetalleFormTipoImportacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoImportacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoImportacion);
					this.jInternalFrameReporteDinamicoTipoImportacion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoImportacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoImportacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoImportacion);
					this.jInternalFrameImportacionTipoImportacion.setVisible(false);
					this.jInternalFrameImportacionTipoImportacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoImportacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoImportacion);
					this.jInternalFrameOrderByTipoImportacion.setVisible(false);
					this.jInternalFrameOrderByTipoImportacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoImportacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoImportacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoimportacionReturnGeneral=new TipoImportacionParameterReturnGeneral();
			
			this.tipoimportacionParameterGeneral=new TipoImportacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoimportacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoImportacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoImportacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoimportacionSessionBean.getEsGuardarRelacionado(),this.tipoimportacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoImportacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoimportacionSessionBean.getEsGuardarRelacionado(),this.tipoimportacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoImportacion=false;
			this.isVisibilidadCeldaDuplicarTipoImportacion=true;
			this.isVisibilidadCeldaCopiarTipoImportacion=true;
			this.isVisibilidadCeldaVerFormTipoImportacion=true;
			this.isVisibilidadCeldaOrdenTipoImportacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=false;
			this.isVisibilidadCeldaModificarTipoImportacion=false;
			this.isVisibilidadCeldaActualizarTipoImportacion=false;
			this.isVisibilidadCeldaEliminarTipoImportacion=false;
			this.isVisibilidadCeldaCancelarTipoImportacion=false;
			this.isVisibilidadCeldaGuardarTipoImportacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImportacion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoImportacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoImportacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoImportacion(false);
			
			this.setPermisosUsuarioTipoImportacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoimportacionSessionBean.getEsGuardarRelacionado() && this.tipoimportacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoImportacionClasesRelacionadas();
			}
			
			if(this.tipoimportacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoImportacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoImportacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoImportacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoImportacion();
			}
			
			if(!this.isPermisoBusquedaTipoImportacion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoImportacion,this.isPermisoPaginacionMedioTipoImportacion,this.isPermisoPaginacionTodoTipoImportacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoImportacionConstantesFunciones.getTiposSeleccionarTipoImportacion());
				
				this.tiposColumnasSelect=TipoImportacionConstantesFunciones.getTiposSeleccionarTipoImportacion(true);
				
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
			//if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoImportacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoImportacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoImportacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoImportacion() ;
			
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
				tipoimportacionImplementable= (TipoImportacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoImportacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoimportacionImplementableHome= (TipoImportacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoImportacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoimportacions= new ArrayList<TipoImportacion>();
			this.tipoimportacionsEliminados= new ArrayList<TipoImportacion>();
						
			this.isEsNuevoTipoImportacion=false;
			this.esParaAccionDesdeFormularioTipoImportacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoImportacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoImportacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoImportacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoImportacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoImportacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoImportacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoImportacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoImportacion();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoImportacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoImportacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoImportacion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoImportacion")) {
				iIndex=this.jInternalFrameDetalleFormTipoImportacion.jTabbedPaneRelacionesTipoImportacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoImportacion.jTabbedPaneRelacionesTipoImportacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoImportacion();	
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
	
	public void cargarCombosForeignKeyTipoImportacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoImportacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoImportacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoImportacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoImportacion();
		
		this.cargarCombosFrameForeignKeyTipoImportacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoImportacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoImportacion();
		}
	}
	
	
	
	public void jButtonNuevoTipoImportacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoimportacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoImportacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			
			
			if(jTableDatosTipoImportacion.getRowCount()>=1) {
				jTableDatosTipoImportacion.removeRowSelectionInterval(0, jTableDatosTipoImportacion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoImportacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoImportacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoImportacion(true);			
			//this.tipoimportacion=new TipoImportacion();
			//this.tipoimportacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoImportacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoImportacion() ;
			
			if(TipoImportacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoImportacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoimportacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);				
			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			
			if(this.tipoimportacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoImportacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoImportacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoImportacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoImportacion.getSelectedRows().length;			
			}
			
			tipoimportacionsSeleccionados=this.getTipoImportacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoImportacion--;			
				//TipoImportacion tipoimportacionAux= new TipoImportacion();			
				//tipoimportacionAux.setId(this.iIdNuevoTipoImportacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoImportacion tipoimportacionOrigen=new TipoImportacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoImportacion tipoimportacionOrigen : tipoimportacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoimportacionOrigen =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoimportacionOrigen =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoImportacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoimportacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoImportacion(tipoimportacionOrigen,this.tipoimportacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(this.tipoimportacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoimportacionLogic.getTipoImportacions().add(this.tipoimportacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoimportacions.add(this.tipoimportacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoImportacion(false);
				
				this.jTableDatosTipoImportacion.setRowSelectionInterval(this.getIndiceNuevoTipoImportacion(), this.getIndiceNuevoTipoImportacion());
				
				int iLastRow =  this.jTableDatosTipoImportacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoImportacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoImportacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoImportacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();									
		
			TipoImportacion tipoimportacionOrigen=new TipoImportacion();
			TipoImportacion tipoimportacionDestino=new TipoImportacion();
				
			tipoimportacionsSeleccionados=this.getTipoImportacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoImportacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoimportacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoImportacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimportacionOrigen =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoimportacionOrigen =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimportacionDestino =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoimportacionDestino =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoimportacionOrigen =tipoimportacionsSeleccionados.get(0);
				tipoimportacionDestino =tipoimportacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoImportacion(tipoimportacionOrigen,tipoimportacionDestino,true,false);
				
				tipoimportacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoimportacionDestino,tipoimportacionLogic.getTipoImportacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoimportacionDestino,tipoimportacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoImportacion(false);
				
				//this.jTableDatosTipoImportacion.setRowSelectionInterval(this.getIndiceNuevoTipoImportacion(), this.getIndiceNuevoTipoImportacion());
				
				int iLastRow =  this.jTableDatosTipoImportacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoImportacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoImportacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoImportacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoImportacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoImportacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoImportacion.isVisible();
			
			
			this.jPanelParametrosReportesTipoImportacion.setVisible(!isVisible);
			this.jPanelPaginacionTipoImportacion.setVisible(!isVisible);
			this.jPanelAccionesTipoImportacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoImportacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoImportacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoImportacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoImportacion();
			
			this.abrirFrameOrderByTipoImportacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoImportacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoImportacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoImportacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoImportacion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoImportacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoImportacion.setSize(this.jInternalFrameDetalleFormTipoImportacion.iWidthFormulario,this.jInternalFrameDetalleFormTipoImportacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoImportacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoImportacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoImportacion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoImportacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoImportacion.jContentPaneDetalleTipoImportacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoImportacion.jTabbedPaneRelacionesTipoImportacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoImportacion.jContentPaneDetalleTipoImportacion.getWidth(),TipoImportacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoImportacion.jTabbedPaneRelacionesTipoImportacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoImportacion.jContentPaneDetalleTipoImportacion.getWidth(),TipoImportacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoImportacion.jTabbedPaneRelacionesTipoImportacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoImportacion.jContentPaneDetalleTipoImportacion.getWidth(),TipoImportacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoImportacion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoImportacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoImportacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoImportacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoImportacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoImportacion,false,this);
				} else {
					this.jInternalFrameOrderByTipoImportacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoImportacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoImportacion);
				this.jInternalFrameOrderByTipoImportacion.setVisible(false);
				this.jInternalFrameOrderByTipoImportacion.setSelected(false);
				
				this.jInternalFrameOrderByTipoImportacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoImportacion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoImportacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoImportacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoImportacion==null) {
				
				this.jInternalFrameImportacionTipoImportacion=new ImportacionJInternalFrame(TipoImportacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoImportacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoImportacion);
				this.jInternalFrameImportacionTipoImportacion.setVisible(false);
				this.jInternalFrameImportacionTipoImportacion.setSelected(false);


				this.jInternalFrameImportacionTipoImportacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoImportacion"));
				this.jInternalFrameImportacionTipoImportacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoImportacion"));
				this.jInternalFrameImportacionTipoImportacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoImportacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoImportacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoImportacion==null) {
				this.jInternalFrameReporteDinamicoTipoImportacion=new ReporteDinamicoJInternalFrame(TipoImportacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoImportacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoImportacion);
				this.jInternalFrameReporteDinamicoTipoImportacion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoImportacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoImportacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoImportacion"));
				this.jInternalFrameReporteDinamicoTipoImportacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoImportacion"));
				this.jInternalFrameReporteDinamicoTipoImportacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoImportacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoImportacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoImportacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoImportacion);
			
	       	this.jInternalFrameDetalleFormTipoImportacion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoImportacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoImportacion.dispose();
			//this.jInternalFrameDetalleFormTipoImportacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoImportacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoImportacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoImportacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoImportacion.setVisible(true);
	        this.jInternalFrameImportacionTipoImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoImportacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoImportacion.setVisible(true);
	        this.jInternalFrameOrderByTipoImportacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoImportacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoImportacion.setVisible(false);
	        this.jInternalFrameOrderByTipoImportacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoImportacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoImportacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoImportacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoImportacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoImportacion.setVisible(false);
	        this.jInternalFrameImportacionTipoImportacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoImportacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoImportacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoImportacion(true);
			//this.isEsNuevoTipoImportacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacion =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoimportacion =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoImportacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoImportacion(false) ;
			
			if(tipoimportacionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoImportacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoImportacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoImportacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoImportacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacion =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimportacion =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoImportacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoImportacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoImportacion(true);
			//this.isEsNuevoTipoImportacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacion =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoimportacion =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoimportacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoImportacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoImportacion(false) ;
			
			if(TipoImportacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoImportacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoImportacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoImportacion(false);
			
			//if(!this.isEsNuevoTipoImportacion) {								
				int intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacion =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoimportacion =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoImportacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoImportacion(this.tipoimportacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(this.tipoimportacion);
				
			}
			
			if(this.permiteMantenimiento(this.tipoimportacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoImportacion=true;
					this.inicializarActualizarBindingTablaTipoImportacion(false);
					this.isEsNuevoTipoImportacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoImportacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoImportacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoImportacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoImportacion(false);
				
				this.habilitarDeshabilitarControlesTipoImportacion(false);
			
												
				
				if(TipoImportacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoImportacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoImportacionActionPerformed(evt,tipoimportacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoImportacion(this.tipoimportacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoImportacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoimportacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoimportacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoImportacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImportacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoImportacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacion =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				this.tipoimportacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoimportacion =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				this.tipoimportacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoimportacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoImportacionModel) this.jTableDatosTipoImportacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoImportacion=true;
				this.inicializarActualizarBindingTablaTipoImportacion(false);
				this.isEsNuevoTipoImportacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoImportacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoImportacion(false);
				
				this.habilitarDeshabilitarControlesTipoImportacion(false);
				
				
				
				if(TipoImportacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoImportacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoImportacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoImportacion.getRowCount()>=1) {
				jTableDatosTipoImportacion.removeRowSelectionInterval(0, jTableDatosTipoImportacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoImportacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoImportacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoImportacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoImportacion(false) ;
			
			this.isEsNuevoTipoImportacion=false;
			
			if(TipoImportacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoImportacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoImportacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoImportacion(false);
				
				//SI ES MANUAL
				if(TipoImportacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoImportacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoImportacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoImportacion--;			
			//TipoImportacion tipoimportacionAux= new TipoImportacion();			
			//tipoimportacionAux.setId(this.iIdNuevoTipoImportacion);
			
			if(this.jInternalFrameDetalleFormTipoImportacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoImportacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(this.tipoimportacion);
			
			this.tipoimportacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoimportacionLogic.getTipoImportacions().add(this.tipoimportacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoimportacions.add(this.tipoimportacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoImportacion(false);
			
			this.jTableDatosTipoImportacion.setRowSelectionInterval(this.getIndiceNuevoTipoImportacion(), this.getIndiceNuevoTipoImportacion());
			
			int iLastRow =  this.jTableDatosTipoImportacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoImportacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoImportacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoImportacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoImportacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoImportacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoImportacion(false);
			
			//SI ES MANUAL
			if(TipoImportacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoImportacion();
			}
			
			//this.abrirFrameTreeTipoImportacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoImportacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ImportacionS ?", "MANTENIMIENTO DE Tipo Importacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoImportacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoImportacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoimportacionReturnGeneral=tipoimportacionLogic.procesarImportacionTipoImportacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoimportacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoImportacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoImportacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoImportacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoImportacion.setFileImportacion(this.jInternalFrameImportacionTipoImportacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoImportacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoImportacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoImportacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoImportacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoImportacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();		

		tipoimportacionsSeleccionados=this.getTipoImportacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoImportacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoImportacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoImportacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoImportacionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoImportacions("Todos",tipoimportacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Importacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoImportacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImportacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoImportacionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoImportacionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoImportacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoImportacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoImportacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoImportacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoImportacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoImportacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoImportacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoImportacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoImportacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImportacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoImportacionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoImportacionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoImportacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();		
		
		tipoimportacionsSeleccionados=this.getTipoImportacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimportacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoImportacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoImportacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImportacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoImportacionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoImportacionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoImportacion tipoimportacion:tipoimportacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoimportacion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoImportacionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoImportacionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoImportacion tipoimportacion:tipoimportacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoimportacion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoImportacion(row);				
			//	iRow++;
			//}				
			
			//for(TipoImportacion tipoimportacionAux:tipoimportacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoImportacion(tipoimportacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Importacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoimportacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoImportacion(false);
			
			//SI ES MANUAL
			if(TipoImportacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoImportacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoImportacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoImportacion(false);
			
			//SI ES MANUAL
			if(TipoImportacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoImportacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoImportacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoImportacion(false);
			
			//SI ES MANUAL
			if(TipoImportacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoImportacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimportacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoImportacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoImportacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoImportacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoImportacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoImportacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoImportacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoImportacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoImportacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoImportacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoImportacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoImportacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoImportacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoImportacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoImportacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoImportacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoImportacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoImportacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoImportacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoImportacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoImportacion();
		
		this.inicializarActualizarBindingBotonesManualTipoImportacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoImportacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoImportacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoImportacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoImportacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoImportacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoImportacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoImportacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoImportacion.jCheckBoxPostAccionNuevoTipoImportacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoImportacion.jCheckBoxPostAccionSinCerrarTipoImportacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoImportacion.jCheckBoxPostAccionSinMensajeTipoImportacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoImportacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoImportacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoImportacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
				this.jInternalFrameDetalleFormTipoImportacion.jCheckBoxPostAccionNuevoTipoImportacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoImportacion.jCheckBoxPostAccionSinCerrarTipoImportacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoImportacion.jCheckBoxPostAccionSinMensajeTipoImportacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoImportacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoImportacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoImportacion.jComboBoxTiposAccionesFormularioTipoImportacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoImportacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoImportacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoImportacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoImportacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoImportacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoImportacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoImportacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoImportacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoImportacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoImportacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoImportacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoImportacion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoImportacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoImportacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoImportacion() throws Exception {
		try	{
			if(TipoImportacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoImportacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoImportacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoImportacion.jComboBoxTiposAccionesFormularioTipoImportacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoImportacion.jComboBoxTiposAccionesFormularioTipoImportacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoImportacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoImportacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoImportacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoImportacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoImportacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoImportacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoImportacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoImportacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoImportacion.addItem(reporte);
			}
			
			
			if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoImportacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoImportacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoImportacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoImportacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoImportacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoImportacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoImportacion.jComboBoxTiposAccionesFormularioTipoImportacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoImportacion.jComboBoxTiposAccionesFormularioTipoImportacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoImportacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoImportacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoImportacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoImportacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoImportacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoImportacion!=null) {
				this.jInternalFrameReporteDinamicoTipoImportacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoImportacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoImportacion!=null) {
				this.jInternalFrameReporteDinamicoTipoImportacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoImportacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoImportacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoImportacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoImportacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoImportacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoImportacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoImportacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoImportacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoImportacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoImportacion(Boolean esInicializar) throws Exception {				
		if(TipoImportacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoImportacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoImportacion() throws Exception {
		this.inicializarActualizarBindingTablaTipoImportacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoImportacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoImportacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoImportacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoImportacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImportacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoImportacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoImportacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoImportacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoimportacionLogic.getTipoImportacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoimportacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoImportacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoImportacion.setModel(new TipoImportacionModel(this.tipoimportacionLogic.getTipoImportacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoImportacion.setModel(new TipoImportacionModel(this.tipoimportacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoImportacion!=null && this.jInternalFrameOrderByTipoImportacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoImportacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoImportacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImportacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoImportacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO,tipoimportacionConstantesFunciones.resaltarSeleccionarTipoImportacion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO,tipoimportacionConstantesFunciones.resaltarSeleccionarTipoImportacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoImportacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImportacion,TipoImportacionConstantesFunciones.LABEL_ID));

		if(this.tipoimportacionConstantesFunciones.mostraridTipoImportacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoImportacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoimportacionConstantesFunciones.resaltaridTipoImportacion,this.tipoimportacionConstantesFunciones.activaridTipoImportacion,this,true,"idTipoImportacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoimportacionConstantesFunciones.resaltaridTipoImportacion,this.tipoimportacionConstantesFunciones.activaridTipoImportacion,this,true,"idTipoImportacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoImportacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImportacion,TipoImportacionConstantesFunciones.LABEL_CODIGO));

		if(this.tipoimportacionConstantesFunciones.mostrarcodigoTipoImportacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoImportacionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoimportacionConstantesFunciones.resaltarcodigoTipoImportacion,this.tipoimportacionConstantesFunciones.activarcodigoTipoImportacion,this,true,"codigoTipoImportacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoimportacionConstantesFunciones.resaltarcodigoTipoImportacion,this.tipoimportacionConstantesFunciones.activarcodigoTipoImportacion,this,true,"codigoTipoImportacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoImportacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoImportacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImportacion,TipoImportacionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoimportacionConstantesFunciones.mostrarnombreTipoImportacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoImportacionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoimportacionConstantesFunciones.resaltarnombreTipoImportacion,this.tipoimportacionConstantesFunciones.activarnombreTipoImportacion,this,true,"nombreTipoImportacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoimportacionConstantesFunciones.resaltarnombreTipoImportacion,this.tipoimportacionConstantesFunciones.activarnombreTipoImportacion,this,true,"nombreTipoImportacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoImportacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoimportacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoimportacionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoImportacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoimportacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoimportacionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoImportacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoImportacion && this.isPermisoGuardarCambiosTipoImportacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoimportacionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoimportacionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoImportacion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoImportacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoImportacion && this.isPermisoGuardarCambiosTipoImportacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoImportacion && this.isPermisoGuardarCambiosTipoImportacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoImportacion.moveColumn(this.jTableDatosTipoImportacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoImportacion.moveColumn(this.jTableDatosTipoImportacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoImportacion.moveColumn(this.jTableDatosTipoImportacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoImportacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoImportacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoImportacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoImportacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoImportacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoImportacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoImportacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoImportacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoImportacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoImportacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoImportacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoimportacionLogic.getTipoImportacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoimportacions.size()-1;
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
		//this.jTableDatosTipoImportacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoImportacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoImportacion();
			
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
				
				//this.isEsNuevoTipoImportacion=false;
					
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			
				if(this.tipoimportacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoImportacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoImportacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoImportacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacion =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimportacion =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoimportacion.getsType().equals("DUPLICADO")
				   || this.tipoimportacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoImportacion=true;
				
				} else {
					this.isEsNuevoTipoImportacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoimportacion.getId()>=0 && !this.tipoimportacion.getIsNew()) {						
						this.isEsNuevoTipoImportacion=false;
						
					} else {
						this.isEsNuevoTipoImportacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoImportacion(esRelaciones);						
				
				this.seleccionarTipoImportacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoimportacion.getId()<0) {
					this.isEsNuevoTipoImportacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoImportacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoImportacion(evt,rowIndex);
				}	
				
				if(this.tipoimportacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoImportacion: " + this.dDif); 
					}
				}								
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoImportacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoimportacion)) {
					if(this.tipoimportacion.getId()>0) {
						this.tipoimportacion.setIsDeleted(true);
						
						this.tipoimportacionsEliminados.add(this.tipoimportacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoimportacionLogic.getTipoImportacions().remove(this.tipoimportacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoimportacions.remove(this.tipoimportacion);				
					}
					
					
					((TipoImportacionModel) this.jTableDatosTipoImportacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoImportacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoImportacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoImportacion) {
			
			if(this.jInternalFrameDetalleFormTipoImportacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoImportacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoImportacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacion =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimportacion =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoImportacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoImportacion(this.tipoimportacion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoImportacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoImportacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoImportacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoImportacion(TipoImportacion tipoimportacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoImportacion(tipoimportacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoImportacion(TipoImportacion tipoimportacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoImportacion(tipoimportacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoImportacion(tipoimportacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoImportacion(tipoimportacion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoImportacion(TipoImportacion tipoimportacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoImportacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoImportacion.jTextFieldidTipoImportacion.setText(tipoimportacion.getId().toString());
			this.jInternalFrameDetalleFormTipoImportacion.jTextFieldcodigoTipoImportacion.setText(tipoimportacion.getcodigo());
			this.jInternalFrameDetalleFormTipoImportacion.jTextAreanombreTipoImportacion.setText(tipoimportacion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoImportacion tipoimportacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoimportacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoImportacion tipoimportacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoimportacionLocal=this.tipoimportacion;
			} else {
				tipoimportacionLocal=this.tipoimportacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoimportacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoImportacion(tipoimportacionLocal,true);
					
					if(tipoimportacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoimportacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoimportacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoImportacion(TipoImportacion tipoimportacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoImportacion(tipoimportacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(tipoimportacion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoImportacion(TipoImportacion tipoimportacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoImportacion(tipoimportacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoImportacion(TipoImportacion tipoimportacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoImportacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoImportacion.jTextFieldidTipoImportacion.getText()==null || this.jInternalFrameDetalleFormTipoImportacion.jTextFieldidTipoImportacion.getText()=="" || this.jInternalFrameDetalleFormTipoImportacion.jTextFieldidTipoImportacion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoImportacion.jTextFieldidTipoImportacion.setText("0");
			}

			if(conColumnasBase) {tipoimportacion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoImportacion.jTextFieldidTipoImportacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoImportacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImportacion.jLabelIdTipoImportacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoimportacion.setcodigo(this.jInternalFrameDetalleFormTipoImportacion.jTextFieldcodigoTipoImportacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoImportacionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImportacion.jLabelcodigoTipoImportacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoimportacion.setnombre(this.jInternalFrameDetalleFormTipoImportacion.jTextAreanombreTipoImportacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoImportacionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImportacion.jLabelnombreTipoImportacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoImportacion(TipoImportacion tipoimportacionBean,TipoImportacion tipoimportacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoImportacion(TipoImportacion tipoimportacionOrigen,TipoImportacion tipoimportacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoimportacionOrigen.getId()!=null && !tipoimportacionOrigen.getId().equals(0L))) {tipoimportacion.setId(tipoimportacionOrigen.getId());}}
			if(conDefault || (!conDefault && tipoimportacionOrigen.getcodigo()!=null && !tipoimportacionOrigen.getcodigo().equals(""))) {tipoimportacion.setcodigo(tipoimportacionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoimportacionOrigen.getnombre()!=null && !tipoimportacionOrigen.getnombre().equals(""))) {tipoimportacion.setnombre(tipoimportacionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoImportacion(TipoImportacion tipoimportacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoImportacion.jTextFieldidTipoImportacion.setText(tipoimportacion.getId().toString());
			this.jInternalFrameDetalleFormTipoImportacion.jTextFieldcodigoTipoImportacion.setText(tipoimportacion.getcodigo());
			this.jInternalFrameDetalleFormTipoImportacion.jTextAreanombreTipoImportacion.setText(tipoimportacion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoImportacion(TipoImportacionBean tipoimportacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoImportacion.jTextFieldidTipoImportacion.setText(tipoimportacionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoImportacion.jTextFieldcodigoTipoImportacion.setText(tipoimportacionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoImportacion.jTextAreanombreTipoImportacion.setText(tipoimportacionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoImportacion(TipoImportacionParameterReturnGeneral tipoimportacionReturnGeneral,TipoImportacionBean tipoimportacionBean,Boolean conDefault) throws Exception { 
		try {
			TipoImportacion tipoimportacionLocal=new TipoImportacion();
			
			tipoimportacionLocal=tipoimportacionReturnGeneral.getTipoImportacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoimportacionLocal.getId()!=null && !tipoimportacionLocal.getId().equals(0L))) {tipoimportacionBean.setId(tipoimportacionLocal.getId());}}
			if(conDefault || (!conDefault && tipoimportacionLocal.getcodigo()!=null && !tipoimportacionLocal.getcodigo().equals(""))) {tipoimportacionBean.setcodigo(tipoimportacionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoimportacionLocal.getnombre()!=null && !tipoimportacionLocal.getnombre().equals(""))) {tipoimportacionBean.setnombre(tipoimportacionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoImportacionGenerico(Long idTipoImportacionSeleccionado,JComboBox jComboBoxTipoImportacion,List<TipoImportacion> tipoimportacionsLocal)throws Exception {
		try {
			TipoImportacion  tipoimportacionTemp=null;

			for(TipoImportacion tipoimportacionAux:tipoimportacionsLocal) {
				if(tipoimportacionAux.getId()!=null && tipoimportacionAux.getId().equals(idTipoImportacionSeleccionado)) {
					tipoimportacionTemp=tipoimportacionAux;
					break;
				}
			}

			jComboBoxTipoImportacion.setSelectedItem(tipoimportacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoImportacionGenerico(JComboBox jComboBoxTipoImportacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoImportacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoImportacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoImportacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoImportacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoImportacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoImportacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoImportacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoImportacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoImportacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoImportacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoimportacion=(TipoImportacion) tipoimportacionLogic.getTipoImportacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoimportacion =(TipoImportacion) tipoimportacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoImportacion tipoimportacionRow=new TipoImportacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoimportacionRow=(TipoImportacion) tipoimportacionLogic.getTipoImportacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoimportacionRow=(TipoImportacion) tipoimportacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoImportacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoImportacion.setVisible((this.isVisibilidadCeldaNuevoTipoImportacion && this.isPermisoNuevoTipoImportacion));			
			this.jButtonDuplicarTipoImportacion.setVisible((this.isVisibilidadCeldaDuplicarTipoImportacion && this.isPermisoDuplicarTipoImportacion));			
			this.jButtonCopiarTipoImportacion.setVisible((this.isVisibilidadCeldaCopiarTipoImportacion && this.isPermisoCopiarTipoImportacion));
			this.jButtonVerFormTipoImportacion.setVisible((this.isVisibilidadCeldaVerFormTipoImportacion && this.isPermisoVerFormTipoImportacion));
			
			this.jButtonAbrirOrderByTipoImportacion.setVisible((this.isVisibilidadCeldaOrdenTipoImportacion && this.isPermisoOrdenTipoImportacion));			
			
			this.jButtonNuevoRelacionesTipoImportacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoImportacion && this.isPermisoNuevoTipoImportacion));			
			this.jButtonNuevoGuardarCambiosTipoImportacion.setVisible((this.isVisibilidadCeldaNuevoTipoImportacion && this.isPermisoNuevoTipoImportacion && this.isPermisoGuardarCambiosTipoImportacion));
			
			if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
			this.jInternalFrameDetalleFormTipoImportacion.jButtonModificarTipoImportacion.setVisible((this.isVisibilidadCeldaModificarTipoImportacion && this.isPermisoActualizarTipoImportacion));	
			this.jInternalFrameDetalleFormTipoImportacion.jButtonActualizarTipoImportacion.setVisible((this.isVisibilidadCeldaActualizarTipoImportacion && this.isPermisoActualizarTipoImportacion));	
			this.jInternalFrameDetalleFormTipoImportacion.jButtonEliminarTipoImportacion.setVisible((this.isVisibilidadCeldaEliminarTipoImportacion && this.isPermisoEliminarTipoImportacion));
			this.jInternalFrameDetalleFormTipoImportacion.jButtonCancelarTipoImportacion.setVisible(this.isVisibilidadCeldaCancelarTipoImportacion);							
			this.jInternalFrameDetalleFormTipoImportacion.jButtonGuardarCambiosTipoImportacion.setVisible((this.isVisibilidadCeldaGuardarTipoImportacion && this.isPermisoGuardarCambiosTipoImportacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoImportacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoImportacion && this.isPermisoGuardarCambiosTipoImportacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoImportacion.setVisible((this.isVisibilidadCeldaNuevoTipoImportacion && this.isPermisoNuevoTipoImportacion));						
			this.jButtonDuplicarToolBarTipoImportacion.setVisible((this.isVisibilidadCeldaDuplicarTipoImportacion && this.isPermisoDuplicarTipoImportacion));						
			this.jButtonCopiarToolBarTipoImportacion.setVisible((this.isVisibilidadCeldaCopiarTipoImportacion && this.isPermisoCopiarTipoImportacion));			
			this.jButtonVerFormToolBarTipoImportacion.setVisible((this.isVisibilidadCeldaVerFormTipoImportacion && this.isPermisoVerFormTipoImportacion));			
			this.jButtonAbrirOrderByToolBarTipoImportacion.setVisible((this.isVisibilidadCeldaOrdenTipoImportacion && this.isPermisoOrdenTipoImportacion));
			this.jButtonNuevoRelacionesToolBarTipoImportacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoImportacion && this.isPermisoNuevoTipoImportacion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoImportacion.setVisible((this.isVisibilidadCeldaNuevoTipoImportacion && this.isPermisoNuevoTipoImportacion && this.isPermisoGuardarCambiosTipoImportacion));			
			
			if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
			this.jInternalFrameDetalleFormTipoImportacion.jButtonModificarToolBarTipoImportacion.setVisible((this.isVisibilidadCeldaModificarTipoImportacion && this.isPermisoActualizarTipoImportacion));	
			this.jInternalFrameDetalleFormTipoImportacion.jButtonActualizarToolBarTipoImportacion.setVisible((this.isVisibilidadCeldaActualizarTipoImportacion  && this.isPermisoActualizarTipoImportacion));	
			this.jInternalFrameDetalleFormTipoImportacion.jButtonEliminarToolBarTipoImportacion.setVisible((this.isVisibilidadCeldaEliminarTipoImportacion && this.isPermisoEliminarTipoImportacion));
			this.jInternalFrameDetalleFormTipoImportacion.jButtonCancelarToolBarTipoImportacion.setVisible(this.isVisibilidadCeldaCancelarTipoImportacion);				
			this.jInternalFrameDetalleFormTipoImportacion.jButtonGuardarCambiosToolBarTipoImportacion.setVisible((this.isVisibilidadCeldaGuardarTipoImportacion && this.isPermisoGuardarCambiosTipoImportacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoImportacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoImportacion && this.isPermisoGuardarCambiosTipoImportacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoImportacion.setVisible((this.isVisibilidadCeldaNuevoTipoImportacion && this.isPermisoNuevoTipoImportacion));			
			this.jMenuItemDuplicarTipoImportacion.setVisible((this.isVisibilidadCeldaDuplicarTipoImportacion && this.isPermisoDuplicarTipoImportacion));			
			this.jMenuItemCopiarTipoImportacion.setVisible((this.isVisibilidadCeldaCopiarTipoImportacion && this.isPermisoCopiarTipoImportacion));			
			this.jMenuItemVerFormTipoImportacion.setVisible((this.isVisibilidadCeldaVerFormTipoImportacion && this.isPermisoVerFormTipoImportacion));			
			this.jMenuItemAbrirOrderByTipoImportacion.setVisible((this.isVisibilidadCeldaOrdenTipoImportacion && this.isPermisoOrdenTipoImportacion));			
			//this.jMenuItemMostrarOcultarTipoImportacion.setVisible((this.isVisibilidadCeldaOrdenTipoImportacion && this.isPermisoOrdenTipoImportacion));
			this.jMenuItemDetalleAbrirOrderByTipoImportacion.setVisible((this.isVisibilidadCeldaOrdenTipoImportacion && this.isPermisoOrdenTipoImportacion));			
			//this.jMenuItemDetalleMostrarOcultarTipoImportacion.setVisible((this.isVisibilidadCeldaOrdenTipoImportacion && this.isPermisoOrdenTipoImportacion));			
			this.jMenuItemNuevoRelacionesTipoImportacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoImportacion && this.isPermisoNuevoTipoImportacion));			
			this.jMenuItemNuevoGuardarCambiosTipoImportacion.setVisible((this.isVisibilidadCeldaNuevoTipoImportacion && this.isPermisoNuevoTipoImportacion && this.isPermisoGuardarCambiosTipoImportacion));									
			
			if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
			this.jInternalFrameDetalleFormTipoImportacion.jMenuItemModificarTipoImportacion.setVisible((this.isVisibilidadCeldaModificarTipoImportacion && this.isPermisoActualizarTipoImportacion));	
			this.jInternalFrameDetalleFormTipoImportacion.jMenuItemActualizarTipoImportacion.setVisible((this.isVisibilidadCeldaActualizarTipoImportacion && this.isPermisoActualizarTipoImportacion));	
			this.jInternalFrameDetalleFormTipoImportacion.jMenuItemEliminarTipoImportacion.setVisible((this.isVisibilidadCeldaEliminarTipoImportacion && this.isPermisoEliminarTipoImportacion));
			this.jInternalFrameDetalleFormTipoImportacion.jMenuItemCancelarTipoImportacion.setVisible(this.isVisibilidadCeldaCancelarTipoImportacion);				
			}
			
			this.jMenuItemGuardarCambiosTipoImportacion.setVisible((this.isVisibilidadCeldaGuardarTipoImportacion && this.isPermisoGuardarCambiosTipoImportacion));						
			this.jMenuItemGuardarCambiosTablaTipoImportacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoImportacion && this.isPermisoGuardarCambiosTipoImportacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoImportacion=this.jButtonNuevoTipoImportacion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoImportacion=this.jButtonDuplicarTipoImportacion.isVisible();
			this.isVisibilidadCeldaCopiarTipoImportacion=this.jButtonCopiarTipoImportacion.isVisible();
			this.isVisibilidadCeldaVerFormTipoImportacion=this.jButtonVerFormTipoImportacion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoImportacion=this.jButtonAbrirOrderByTipoImportacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=this.jButtonNuevoRelacionesTipoImportacion.isVisible();
			this.isVisibilidadCeldaModificarTipoImportacion=this.jButtonModificarTipoImportacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
			this.isVisibilidadCeldaActualizarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jButtonActualizarTipoImportacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jButtonEliminarTipoImportacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jButtonCancelarTipoImportacion.isVisible();
			this.isVisibilidadCeldaGuardarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jButtonGuardarCambiosTipoImportacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoImportacion=this.jButtonGuardarCambiosTablaTipoImportacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoImportacion=this.jButtonNuevoToolBarTipoImportacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=this.jButtonNuevoRelacionesToolBarTipoImportacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
			this.isVisibilidadCeldaModificarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jButtonModificarToolBarTipoImportacion.isVisible();
			this.isVisibilidadCeldaActualizarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jButtonActualizarToolBarTipoImportacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jButtonEliminarToolBarTipoImportacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jButtonCancelarToolBarTipoImportacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoImportacion=this.jButtonGuardarCambiosToolBarTipoImportacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoImportacion=this.jButtonGuardarCambiosTablaToolBarTipoImportacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoImportacion=this.jMenuItemNuevoTipoImportacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=this.jMenuItemNuevoRelacionesTipoImportacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
			this.isVisibilidadCeldaModificarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jMenuItemModificarTipoImportacion.isVisible();
			this.isVisibilidadCeldaActualizarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jMenuItemActualizarTipoImportacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jMenuItemEliminarTipoImportacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoImportacion=this.jInternalFrameDetalleFormTipoImportacion.jMenuItemCancelarTipoImportacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoImportacion=this.jMenuItemGuardarCambiosTipoImportacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoImportacion=this.jMenuItemGuardarCambiosTablaTipoImportacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoImportacion(Boolean esInicializar) {
		if(TipoImportacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoimportacionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoImportacion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoImportacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoImportacion() {
		this.jButtonNuevoTipoImportacion.setVisible(this.isPermisoNuevoTipoImportacion);			
		this.jButtonDuplicarTipoImportacion.setVisible(this.isPermisoDuplicarTipoImportacion);			
		this.jButtonCopiarTipoImportacion.setVisible(this.isPermisoCopiarTipoImportacion);			
		this.jButtonVerFormTipoImportacion.setVisible(this.isPermisoVerFormTipoImportacion);			
		
		this.jButtonAbrirOrderByTipoImportacion.setVisible(this.isPermisoOrdenTipoImportacion);					
		
		this.jButtonNuevoRelacionesTipoImportacion.setVisible(this.isPermisoNuevoTipoImportacion);			
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.jButtonModificarTipoImportacion.setVisible(this.isPermisoActualizarTipoImportacion);	
			this.jInternalFrameDetalleFormTipoImportacion.jButtonActualizarTipoImportacion.setVisible(this.isPermisoActualizarTipoImportacion);	
			this.jInternalFrameDetalleFormTipoImportacion.jButtonEliminarTipoImportacion.setVisible(this.isPermisoEliminarTipoImportacion);
			this.jInternalFrameDetalleFormTipoImportacion.jButtonCancelarTipoImportacion.setVisible(this.isVisibilidadCeldaCancelarTipoImportacion);						
			this.jInternalFrameDetalleFormTipoImportacion.jButtonGuardarCambiosTipoImportacion.setVisible(this.isPermisoGuardarCambiosTipoImportacion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoImportacion.setVisible(this.isPermisoActualizarTipoImportacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoImportacion() {
		this.jInternalFrameDetalleFormTipoImportacion.jButtonModificarTipoImportacion.setVisible(this.isPermisoActualizarTipoImportacion);	
		this.jInternalFrameDetalleFormTipoImportacion.jButtonActualizarTipoImportacion.setVisible(this.isPermisoActualizarTipoImportacion);	
		this.jInternalFrameDetalleFormTipoImportacion.jButtonEliminarTipoImportacion.setVisible(this.isPermisoEliminarTipoImportacion);
		this.jInternalFrameDetalleFormTipoImportacion.jButtonCancelarTipoImportacion.setVisible(this.isVisibilidadCeldaCancelarTipoImportacion);							
		this.jInternalFrameDetalleFormTipoImportacion.jButtonGuardarCambiosTipoImportacion.setVisible((this.isVisibilidadCeldaGuardarTipoImportacion && this.isPermisoGuardarCambiosTipoImportacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoImportacion() {
		if(TipoImportacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoImportacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoImportacion() {
	}
	
	public void jTableDatosTipoImportacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoImportacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoImportacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoImportacion(this.gettipoimportacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(this.tipoimportacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimportacion =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoimportacion =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoimportacion==null) {
						this.tipoimportacion = new TipoImportacion();
					}

					this.setVariablesFormularioToObjetoActualTipoImportacion(this.tipoimportacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(this.tipoimportacion);
				}

				if(this.tipoimportacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoimportacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoImportacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoImportacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoImportacion(this.gettipoimportacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(this.tipoimportacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimportacion =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoimportacion =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoimportacion==null) {
						this.tipoimportacion = new TipoImportacion();
					}

					this.setVariablesFormularioToObjetoActualTipoImportacion(this.tipoimportacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(this.tipoimportacion);
				}

				if(this.tipoimportacion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoimportacion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoImportacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoImportacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoImportacion(this.gettipoimportacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(this.tipoimportacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimportacion =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoimportacion =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoimportacion==null) {
						this.tipoimportacion = new TipoImportacion();
					}

					this.setVariablesFormularioToObjetoActualTipoImportacion(this.tipoimportacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(this.tipoimportacion);
				}

				if(this.tipoimportacion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoimportacion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoImportacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoImportacion() {
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
			this.jInternalFrameDetalleFormTipoImportacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoImportacion.dispose();
			this.jInternalFrameDetalleFormTipoImportacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoImportacion!=null) {
			this.jInternalFrameReporteDinamicoTipoImportacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoImportacion.dispose();
			this.jInternalFrameReporteDinamicoTipoImportacion=null;
		}
		
		if(this.jInternalFrameImportacionTipoImportacion!=null) {
			this.jInternalFrameImportacionTipoImportacion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoImportacion.dispose();
			this.jInternalFrameImportacionTipoImportacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoImportacion();
			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoImportacion")) {
				jButtonNuevoTipoImportacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoImportacion")) {
				jButtonDuplicarTipoImportacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoImportacion")) {
				jButtonCopiarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoImportacion")) {
				jButtonVerFormTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoImportacion")) {
				jButtonNuevoTipoImportacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoImportacion")) {
				jButtonDuplicarTipoImportacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoImportacion")) {
				jButtonNuevoTipoImportacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoImportacion")) {
				jButtonDuplicarTipoImportacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoImportacion")) {
				jButtonNuevoTipoImportacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoImportacion")) {
				jButtonNuevoTipoImportacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoImportacion")) {
				jButtonNuevoTipoImportacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoImportacion")) {
				jButtonModificarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoImportacion")) {
				jButtonModificarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoImportacion")) {
				jButtonModificarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoImportacion")) {
				jButtonActualizarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoImportacion")) {
				jButtonActualizarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoImportacion")) {
				jButtonActualizarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoImportacion")) {
				jButtonEliminarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoImportacion")) {
				jButtonEliminarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoImportacion")) {
				jButtonEliminarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoImportacion")) {
				jButtonCancelarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoImportacion")) {
				jButtonCancelarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoImportacion")) {
				jButtonCancelarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoImportacion")) {
				jButtonCerrarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoImportacion")) {
				jButtonCerrarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoImportacion")) {
				jButtonCerrarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoImportacion")) {
				jButtonMostrarOcultarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoImportacion")) {
				jButtonCancelarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoImportacion")) {
				jButtonGuardarCambiosTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoImportacion")) {
				jButtonGuardarCambiosTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoImportacion")) {
				jButtonCopiarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoImportacion")) {
				jButtonVerFormTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoImportacion")) {
				jButtonGuardarCambiosTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoImportacion")) {
				jButtonCopiarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoImportacion")) {
				jButtonVerFormTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoImportacion")) {
				jButtonGuardarCambiosTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoImportacion")) {
				jButtonGuardarCambiosTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoImportacion")) {
				jButtonGuardarCambiosTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoImportacion")) {
				jButtonRecargarInformacionTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoImportacion")) {
				jButtonRecargarInformacionTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoImportacion")) {
				jButtonRecargarInformacionTipoImportacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoImportacion")) {
				jButtonAnterioresTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoImportacion")) {
				jButtonAnterioresTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoImportacion")) {
				jButtonAnterioresTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoImportacion")) {
				jButtonSiguientesTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoImportacion")) {
				jButtonSiguientesTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoImportacion")) {
				jButtonSiguientesTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoImportacion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoImportacion")) {
				jButtonAbrirOrderByTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoImportacion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoImportacion")) {
				jButtonMostrarOcultarTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoImportacion")) {
				jButtonNuevoGuardarCambiosTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoImportacion")) {
				jButtonNuevoGuardarCambiosTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoImportacion")) {
				jButtonNuevoGuardarCambiosTipoImportacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoImportacion")) {
				jButtonCerrarReporteDinamicoTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoImportacion")) {
				jButtonGenerarReporteDinamicoTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoImportacion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoImportacion")) {
				jButtonCerrarImportacionTipoImportacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoImportacion")) {
				
				jButtonGenerarImportacionTipoImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoImportacion")) {
				
				jButtonAbrirImportacionTipoImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoImportacion")) {
				jComboBoxTiposAccionesTipoImportacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoImportacion")) {
				jComboBoxTiposRelacionesTipoImportacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoImportacion")) {
				jComboBoxTiposAccionesTipoImportacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoImportacion")) {
				
				jComboBoxTiposSeleccionarTipoImportacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoImportacion")) {
				jTextFieldValorCampoGeneralTipoImportacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoImportacion")) {
				jButtonAbrirOrderByTipoImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoImportacion")) {
				jButtonAbrirOrderByTipoImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoImportacion")) {
				jButtonCerrarOrderByTipoImportacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoImportacionBusqueda")) {
				this.jButtonidTipoImportacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoImportacionBusqueda")) {
				this.jButtoncodigoTipoImportacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoImportacionBusqueda")) {
				this.jButtonnombreTipoImportacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoImportacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImportacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				


				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImportacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImportacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoImportacion tipoimportacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoimportacionLocal=this.tipoimportacion;
			} else {
				tipoimportacionLocal=this.tipoimportacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
							
				
				


				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImportacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImportacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImportacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
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
			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			
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
			
			


			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImportacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
								
						
				


				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImportacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImportacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
								
				
				


				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImportacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImportacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImportacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImportacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImportacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
							
				
				


				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImportacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImportacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImportacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
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
			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			
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
			
			


			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImportacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
								
				
				


				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImportacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImportacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImportacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImportacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImportacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoImportacion")) {
					jCheckBoxSeleccionarTodosTipoImportacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoImportacion")) {
					jCheckBoxSeleccionadosTipoImportacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoImportacion")) {
					
				}
				
				


				
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImportacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImportacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
												
				
				


				
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImportacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImportacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImportacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImportacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
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
			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
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
			
			


			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImportacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImportacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImportacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimportacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimportacion);
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
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
				
				


				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImportacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImportacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImportacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimportacionAnterior =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoImportacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoImportacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoImportacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoimportacion =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoimportacion =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoimportacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoImportacion")) {
				
				}
				
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoImportacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoImportacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoImportacion")) {
			
			}
			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoImportacion();
			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoImportacion")) {
				jButtonNuevoTipoImportacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoImportacion")) {
				jButtonDuplicarTipoImportacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoImportacion")) {
				jButtonCopiarTipoImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoImportacion")) {
				jButtonVerFormTipoImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoImportacion")) {
				jButtonNuevoTipoImportacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoImportacion")) {
				jButtonModificarTipoImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoImportacion")) {
				jButtonActualizarTipoImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoImportacion")) {
				jButtonEliminarTipoImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoImportacion")) {
				jButtonGuardarCambiosTipoImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoImportacion")) {
				jButtonCancelarTipoImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoImportacion")) {
				jButtonCerrarTipoImportacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoImportacion")) {
				jButtonGuardarCambiosTipoImportacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoImportacion")) {
				jButtonNuevoGuardarCambiosTipoImportacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoImportacion")) {
				jButtonAbrirOrderByTipoImportacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoImportacion")) {
				jButtonRecargarInformacionTipoImportacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoImportacion")) {
				jButtonAnterioresTipoImportacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoImportacion")) {
				jButtonSiguientesTipoImportacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoImportacionBusqueda")) {
				this.jButtonidTipoImportacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoImportacionBusqueda")) {
				this.jButtoncodigoTipoImportacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoImportacionBusqueda")) {
				this.jButtonnombreTipoImportacionBusquedaActionPerformed(evt);
			}
			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoImportacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoImportacion")) {
				closingInternalFrameTipoImportacion();
				
			} else if(sTipo.equals("jButtonCancelarTipoImportacion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoImportacion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoImportacionBeanSwingJInternalFrame jInternalFrameParent=(TipoImportacionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoImportacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoImportacionActionPerformed(null);
			}
			
			TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoimportacion,new Object(),this.tipoimportacionParameterGeneral,this.tipoimportacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoImportacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoImportacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoImportacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoimportacion)) {
			if(!esControlTabla) {
				if(TipoImportacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoImportacion(this.tipoimportacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(this.tipoimportacion);			
				}
				
				if(this.tipoimportacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoImportacion(this.tipoimportacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoimportacionReturnGeneral=tipoimportacionLogic.procesarEventosTipoImportacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoimportacionLogic.getTipoImportacions(),this.tipoimportacion,this.tipoimportacionParameterGeneral,this.isEsNuevoTipoImportacion,classes);//this.tipoimportacionLogic.getTipoImportacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoImportacion(this.tipoimportacionReturnGeneral,this.tipoimportacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoimportacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoImportacion(classes,this.tipoimportacionReturnGeneral,this.tipoimportacionBean,false);
					}
						
					if(this.tipoimportacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoImportacion(this.tipoimportacionReturnGeneral.getTipoImportacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoImportacion(this.tipoimportacionReturnGeneral.getTipoImportacion());	
					}
						
					if(this.tipoimportacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoImportacion(this.tipoimportacionReturnGeneral.getTipoImportacion(),classes);//this.tipoimportacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoImportacion(this.tipoimportacion,classes);//this.tipoimportacionBean);									
				}
			
				if(TipoImportacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoImportacion(this.tipoimportacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImportacion(this.tipoimportacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoimportacionAnterior!=null) {
						this.tipoimportacion=this.tipoimportacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoimportacionReturnGeneral=tipoimportacionLogic.procesarEventosTipoImportacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoimportacionLogic.getTipoImportacions(),this.tipoimportacion,this.tipoimportacionParameterGeneral,this.isEsNuevoTipoImportacion,classes);//this.tipoimportacionLogic.getTipoImportacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoimportacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoimportacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoimportacionReturnGeneral.getTipoImportacion(),tipoimportacionLogic.getTipoImportacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoimportacionReturnGeneral.getTipoImportacion(),this.tipoimportacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoImportacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoImportacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoImportacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoImportacion() throws Exception {
		
		TipoImportacionModel tipoimportacionModel=(TipoImportacionModel)this.jTableDatosTipoImportacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoimportacionModel.tipoimportacions=this.tipoimportacionLogic.getTipoImportacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoimportacionModel.tipoimportacions=this.tipoimportacions;
		}
		
		
		((TipoImportacionModel) this.jTableDatosTipoImportacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoImportacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoimportacionAnterior(),this.tipoimportacionLogic.getTipoImportacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoimportacionAnterior(),this.tipoimportacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoImportacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoImportacion(TipoImportacion tipoimportacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
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
										
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoimportacion,new Object(),generalEntityParameterGeneral,this.tipoimportacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoimportacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoImportacionConstantesFunciones.getClassesRelationshipsOfTipoImportacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoImportacionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoImportacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoImportacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoImportacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoimportacion,new Object(),generalEntityParameterGeneral,this.tipoimportacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoImportacion(TipoImportacionBean tipoimportacionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoImportacion(ArrayList<Classe> classes,TipoImportacionReturnGeneral tipoimportacionReturnGeneral,TipoImportacionBean tipoimportacionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoImportacion(TipoImportacion tipoimportacion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoimportacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoImportacion = new TipoImportacionDetalleFormJInternalFrame(jDesktopPane,this.tipoimportacionSessionBean.getConGuardarRelaciones(),this.tipoimportacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoImportacion);
		this.jInternalFrameDetalleFormTipoImportacion.setVisible(false);
		this.jInternalFrameDetalleFormTipoImportacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoImportacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoImportacion.tipoimportacionLogic=this.tipoimportacionLogic;
		
		this.cargarCombosFrameForeignKeyTipoImportacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoImportacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoImportacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoImportacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoImportacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoImportacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoImportacion"));
		
		this.jInternalFrameDetalleFormTipoImportacion.jButtonModificarTipoImportacion.addActionListener(new ButtonActionListener(this,"ModificarTipoImportacion"));

		
		this.jInternalFrameDetalleFormTipoImportacion.jButtonModificarToolBarTipoImportacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoImportacion"));
					
		this.jInternalFrameDetalleFormTipoImportacion.jMenuItemModificarTipoImportacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoImportacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoImportacion.jButtonActualizarTipoImportacion.addActionListener (new ButtonActionListener(this,"ActualizarTipoImportacion"));
		
		
		this.jInternalFrameDetalleFormTipoImportacion.jButtonActualizarToolBarTipoImportacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoImportacion"));
						
		this.jInternalFrameDetalleFormTipoImportacion.jMenuItemActualizarTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoImportacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoImportacion.jButtonEliminarTipoImportacion.addActionListener (new ButtonActionListener(this,"EliminarTipoImportacion"));
		
		
		this.jInternalFrameDetalleFormTipoImportacion.jButtonEliminarToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoImportacion"));
								
		this.jInternalFrameDetalleFormTipoImportacion.jMenuItemEliminarTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoImportacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoImportacion.jButtonCancelarTipoImportacion.addActionListener (new ButtonActionListener(this,"CancelarTipoImportacion"));
		
		
		this.jInternalFrameDetalleFormTipoImportacion.jButtonCancelarToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoImportacion"));
					
		this.jInternalFrameDetalleFormTipoImportacion.jMenuItemCancelarTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoImportacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoImportacion.jMenuItemDetalleCerrarTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoImportacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoImportacion.jButtonGuardarCambiosToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoImportacion"));
		
		
		
		this.jInternalFrameDetalleFormTipoImportacion.jButtonGuardarCambiosToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoImportacion"));
		
		
		
		this.jInternalFrameDetalleFormTipoImportacion.jComboBoxTiposAccionesFormularioTipoImportacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoImportacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImportacion.jButtonidTipoImportacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoImportacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImportacion.jButtoncodigoTipoImportacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoImportacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImportacion.jButtonnombreTipoImportacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoImportacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoImportacion.jTabbedPaneRelacionesTipoImportacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoImportacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoImportacion"));
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoImportacion"));
		}
		
		this.jTableDatosTipoImportacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoImportacion"));
		
		this.jTableDatosTipoImportacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoImportacion"));
		
		this.jButtonNuevoTipoImportacion.addActionListener(new ButtonActionListener(this,"NuevoTipoImportacion"));
		
		this.jButtonDuplicarTipoImportacion.addActionListener(new ButtonActionListener(this,"DuplicarTipoImportacion"));
		
		this.jButtonCopiarTipoImportacion.addActionListener(new ButtonActionListener(this,"CopiarTipoImportacion"));
		
		this.jButtonVerFormTipoImportacion.addActionListener(new ButtonActionListener(this,"VerFormTipoImportacion"));
		
		
		this.jButtonNuevoToolBarTipoImportacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoImportacion"));
			
		this.jButtonDuplicarToolBarTipoImportacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoImportacion"));
			
		this.jMenuItemNuevoTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoImportacion"));
			
		this.jMenuItemDuplicarTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoImportacion"));		
		
		
		this.jButtonNuevoRelacionesTipoImportacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoImportacion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoImportacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoImportacion"));
			
		this.jMenuItemNuevoRelacionesTipoImportacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoImportacion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.jButtonModificarTipoImportacion.addActionListener(new ButtonActionListener(this,"ModificarTipoImportacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.jButtonModificarToolBarTipoImportacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoImportacion"));
			
			this.jInternalFrameDetalleFormTipoImportacion.jMenuItemModificarTipoImportacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoImportacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoImportacion.jButtonActualizarTipoImportacion.addActionListener (new ButtonActionListener(this,"ActualizarTipoImportacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.jButtonActualizarToolBarTipoImportacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoImportacion"));
				
			this.jInternalFrameDetalleFormTipoImportacion.jMenuItemActualizarTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoImportacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.jButtonEliminarTipoImportacion.addActionListener (new ButtonActionListener(this,"EliminarTipoImportacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.jButtonEliminarToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoImportacion"));
						
			this.jInternalFrameDetalleFormTipoImportacion.jMenuItemEliminarTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoImportacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.jButtonCancelarTipoImportacion.addActionListener (new ButtonActionListener(this,"CancelarTipoImportacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.jButtonCancelarToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoImportacion"));
			
			this.jInternalFrameDetalleFormTipoImportacion.jMenuItemCancelarTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoImportacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoImportacion"));		
		
		
		this.jButtonCerrarTipoImportacion.addActionListener (new ButtonActionListener(this,"CerrarTipoImportacion"));
		
		
		this.jButtonCerrarToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoImportacion"));
			
		this.jMenuItemCerrarTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoImportacion"));
			
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.jMenuItemDetalleCerrarTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoImportacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.jButtonGuardarCambiosTipoImportacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoImportacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.jButtonGuardarCambiosToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoImportacion"));
		}
		
		this.jButtonCopiarToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoImportacion"));
			
		this.jButtonVerFormToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoImportacion"));
		
		this.jMenuItemGuardarCambiosTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoImportacion"));
			
		this.jMenuItemCopiarTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoImportacion"));		
		
		this.jMenuItemVerFormTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoImportacion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoImportacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoImportacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoImportacion"));
			
		this.jMenuItemGuardarCambiosTablaTipoImportacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoImportacion"));		
		
		
		
		this.jButtonRecargarInformacionTipoImportacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoImportacion"));
					
		this.jButtonRecargarInformacionToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoImportacion"));
		
		this.jMenuItemRecargarInformacionTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoImportacion"));		
		
		
		
		this.jButtonAnterioresTipoImportacion.addActionListener (new ButtonActionListener(this,"AnterioresTipoImportacion"));
		
		
		this.jButtonAnterioresToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoImportacion"));
		
		this.jMenuItemAnterioresTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoImportacion"));		
		
		
		this.jButtonSiguientesTipoImportacion.addActionListener (new ButtonActionListener(this,"SiguientesTipoImportacion"));
		
		
		this.jButtonSiguientesToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoImportacion"));
			
		this.jMenuItemSiguientesTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoImportacion"));
			
		this.jMenuItemAbrirOrderByTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoImportacion"));
			
		this.jMenuItemMostrarOcultarTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoImportacion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoImportacion"));
			
		this.jMenuItemDetalleMostarOcultarTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoImportacion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoImportacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoImportacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoImportacion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoImportacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoImportacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoImportacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoImportacion"));

		this.jCheckBoxSeleccionadosTipoImportacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoImportacion"));
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.jComboBoxTiposAccionesFormularioTipoImportacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoImportacion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoImportacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoImportacion"));
			
		this.jComboBoxTiposAccionesTipoImportacion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoImportacion"));
					
		this.jComboBoxTiposSeleccionarTipoImportacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoImportacion"));
			
		this.jTextFieldValorCampoGeneralTipoImportacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoImportacion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImportacion.jButtonidTipoImportacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoImportacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImportacion.jButtoncodigoTipoImportacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoImportacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImportacion.jButtonnombreTipoImportacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoImportacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoImportacion!=null) {
				this.jInternalFrameReporteDinamicoTipoImportacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoImportacion"));
				this.jInternalFrameReporteDinamicoTipoImportacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoImportacion"));
				this.jInternalFrameReporteDinamicoTipoImportacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoImportacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoImportacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoImportacion"));				
			//this.jButtonGenerarReporteDinamicoTipoImportacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoImportacion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoImportacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoImportacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoImportacion!=null) {
				this.jInternalFrameImportacionTipoImportacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoImportacion"));
				this.jInternalFrameImportacionTipoImportacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoImportacion"));
				this.jInternalFrameImportacionTipoImportacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoImportacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoImportacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoImportacion"));
			
			this.jButtonAbrirOrderByToolBarTipoImportacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoImportacion"));			
			
			if(this.jInternalFrameOrderByTipoImportacion!=null) {
				this.jInternalFrameOrderByTipoImportacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoImportacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImportacion.jTabbedPaneRelacionesTipoImportacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoImportacion"));
		
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
            		closingInternalFrameTipoImportacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoImportacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoImportacion = (JInternalFrameBase)event.getSource();
	            	
	            TipoImportacionBeanSwingJInternalFrame jInternalFrameParent=(TipoImportacionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoImportacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoImportacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoImportacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoImportacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoImportacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoImportacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImportacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImportacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImportacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoImportacion";
		inputMap = this.jButtonNuevoTipoImportacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoImportacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoImportacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImportacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImportacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImportacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoImportacion";
		inputMap = this.jButtonNuevoRelacionesTipoImportacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoImportacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoImportacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoImportacion";
		inputMap = this.jButtonModificarTipoImportacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoImportacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoImportacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoImportacion";
		inputMap = this.jButtonActualizarTipoImportacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoImportacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoImportacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoImportacion";
		inputMap = this.jButtonEliminarTipoImportacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoImportacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoImportacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoImportacion";
		inputMap = this.jButtonCancelarTipoImportacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoImportacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoImportacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoImportacion";
		inputMap = this.jButtonCerrarTipoImportacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoImportacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoImportacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoImportacion.jButtonGuardarCambiosTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoImportacion";
		inputMap = this.jInternalFrameDetalleFormTipoImportacion.jButtonGuardarCambiosTipoImportacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoImportacion.jButtonGuardarCambiosTipoImportacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoImportacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoImportacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoImportacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoImportacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoImportacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoImportacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoImportacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoImportacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoImportacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImportacion.jButtonidTipoImportacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoImportacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImportacion.jButtoncodigoTipoImportacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoImportacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImportacion.jButtonnombreTipoImportacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoImportacionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoImportacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoImportacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoImportacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoImportacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoImportacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoImportacion tipoimportacionAux:this.tipoimportacionLogic.getTipoImportacions()) {
					tipoimportacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoImportacion tipoimportacionAux:tipoimportacions) {
					tipoimportacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoImportacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoImportacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoImportacion tipoimportacionAux:this.tipoimportacionLogic.getTipoImportacions()) {
						tipoimportacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoImportacion tipoimportacionAux:tipoimportacions) {
						tipoimportacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoImportacion tipoimportacionAux:this.tipoimportacionLogic.getTipoImportacions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoImportacion tipoimportacionAux:tipoimportacions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoImportacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoImportacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoImportacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoImportacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoImportacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoImportacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoImportacion.getSelectedRows();
			
			TipoImportacion tipoimportacionLocal=new TipoImportacion();
			
			//this.seleccionarTodosTipoImportacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoimportacionLocal =(TipoImportacion) this.tipoimportacionLogic.getTipoImportacions().toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoimportacionLocal =(TipoImportacion) this.tipoimportacions.toArray()[this.jTableDatosTipoImportacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoimportacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoImportacion tipoimportacionAux:this.tipoimportacionLogic.getTipoImportacions()) {
						tipoimportacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoImportacion tipoimportacionAux:tipoimportacions) {
						tipoimportacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoImportacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoImportacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoImportacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoImportacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoImportacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoImportacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoImportacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoImportacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoImportacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoImportacion tipoimportacionAux:this.tipoimportacionLogic.getTipoImportacions()) {
				
						if(sTipoSeleccionar.equals(TipoImportacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoimportacionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoImportacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoimportacionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoImportacion tipoimportacionAux:tipoimportacions) {
					
						if(sTipoSeleccionar.equals(TipoImportacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoimportacionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoImportacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoimportacionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoImportacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoImportacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoImportacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoImportacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoImportacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoImportacion.jComboBoxTiposAccionesFormularioTipoImportacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoImportacion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoImportacion(conSplash);
				
					this.generarReporteTipoImportacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoImportacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoImportacion.jComboBoxTiposAccionesFormularioTipoImportacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoImportacionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoImportacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoImportacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoImportacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoImportacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoImportacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoImportacion();
				
				this.exportarTipoImportacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoImportacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoImportacion.jComboBoxTiposAccionesFormularioTipoImportacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoImportacions();
				//this.importarTipoImportacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoImportacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoImportacion.jComboBoxTiposAccionesFormularioTipoImportacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoImportacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoImportacionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoImportacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Importacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoImportacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoImportacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoImportacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Importacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoImportacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoImportacion.jComboBoxTiposAccionesFormularioTipoImportacion.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoImportacion();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoImportacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoImportacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoImportacion();
			
			if(this.jInternalFrameDetalleFormTipoImportacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();		
			TipoImportacion tipoimportacion=new TipoImportacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoImportacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoImportacion.getSelectedItem();
			
			
			
			
			tipoimportacionsSeleccionados=this.getTipoImportacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoimportacionsSeleccionados.size()==1) {
				for(TipoImportacion tipoimportacionAux:tipoimportacionsSeleccionados) {
					tipoimportacion=tipoimportacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoImportacion();
			
      		//this.finishProcessTipoImportacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoImportacionReturnGeneral() throws Exception {
		if(this.tipoimportacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoimportacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoimportacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoimportacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoimportacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoimportacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoImportacion(false);
		}
		
		if(this.tipoimportacionReturnGeneral.getConRetornoLista() || this.tipoimportacionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoimportacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoimportacionLogic.setTipoImportacions(this.tipoimportacionReturnGeneral.getTipoImportacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoimportacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoimportacionLogic.setTipoImportacion(this.tipoimportacionReturnGeneral.getTipoImportacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoImportacion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoImportacion() throws Exception {
		
		
	}
	
	public ArrayList<TipoImportacion> getTipoImportacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoImportacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoImportacion tipoimportacionAux:tipoimportacionLogic.getTipoImportacions()) {
					if(tipoimportacionAux.getIsSelected()) {
						tipoimportacionsSeleccionados.add(tipoimportacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoImportacion tipoimportacionAux:this.tipoimportacions) {
					if(tipoimportacionAux.getIsSelected()) {
						tipoimportacionsSeleccionados.add(tipoimportacionAux);				
					}
				}
			}
			
			if(tipoimportacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoimportacionsSeleccionados.addAll(this.tipoimportacionLogic.getTipoImportacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoimportacionsSeleccionados.addAll(this.tipoimportacions);				
					}
				}
			}
		} else {
			tipoimportacionsSeleccionados.add(this.tipoimportacion);
		}
		
		return tipoimportacionsSeleccionados;
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
	
	public void generarReporteTipoImportacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoImportacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoImportacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoImportacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoImportacionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Importacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoImportacionsSeleccionados() throws Exception {
		ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();		
		
		tipoimportacionsSeleccionados=this.getTipoImportacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoImportacions("Todos",tipoimportacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoImportacionsSeleccionados() throws Exception {
		ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();		
		
		tipoimportacionsSeleccionados=this.getTipoImportacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoImportacions("Todos",tipoimportacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoImportacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();
		
		tipoimportacionsSeleccionados=this.getTipoImportacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoImportacions("Todos",tipoimportacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoImportacionsSeleccionados() throws Exception {
		ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoImportacion();
		
		
		tipoimportacionsSeleccionados=this.getTipoImportacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoImportacion();
		
		
		//this.generarReporteTipoImportacions("Todos",tipoimportacionsSeleccionados ,tipoimportacionImplementable,tipoimportacionImplementableHome);
	}
	
	public void mostrarImportacionTipoImportacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoImportacion();
		
		this.abrirFrameImportacionTipoImportacion();		
		
			
		//this.generarReporteTipoImportacions("Todos",tipoimportacionsSeleccionados ,tipoimportacionImplementable,tipoimportacionImplementableHome);
	}
	
	public void importarTipoImportacions() throws Exception {		
	
	}
	
	public void exportarTipoImportacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoImportacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoImportacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoImportacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Importacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoImportacionsSeleccionados() throws Exception {
		ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();		
		
		tipoimportacionsSeleccionados=this.getTipoImportacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimportacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoImportacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoImportacion tipoimportacionAux:tipoimportacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoImportacion(tipoimportacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoimportacionAux.setsDetalleGeneralEntityReporte(tipoimportacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Importacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoImportacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoImportacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoImportacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoImportacionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoImportacionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoImportacion(TipoImportacion tipoimportacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoimportacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoimportacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoimportacion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoimportacion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoImportacionsSeleccionados() throws Exception {
		ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();		
		
		tipoimportacionsSeleccionados=this.getTipoImportacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimportacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoImportacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoImportacion(row);				
				iRow++;
			}				
			
			for(TipoImportacion tipoimportacionAux:tipoimportacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoImportacion(tipoimportacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Importacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoImportacionsSeleccionados() throws Exception {
		ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();		
		
		tipoimportacionsSeleccionados=this.getTipoImportacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimportacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoimportacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoimportacion");
			//elementRoot.appendChild(element);
		
			for(TipoImportacion tipoimportacionAux:tipoimportacionsSeleccionados) {
				element = document.createElement("tipoimportacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoImportacion(tipoimportacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Importacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoImportacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoImportacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoImportacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoImportacionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoImportacionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoImportacion(TipoImportacion tipoimportacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoimportacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoimportacion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoimportacion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoImportacion(TipoImportacion tipoimportacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoImportacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoimportacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoImportacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoimportacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoImportacionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoimportacion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoImportacionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoimportacion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoImportacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoImportacion> tipoimportacionsSeleccionados=new ArrayList<TipoImportacion>();
		
		tipoimportacionsSeleccionados=this.getTipoImportacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoImportacion(tipoimportacionsSeleccionados);
		
		this.generarReporteTipoImportacions("Todos",tipoimportacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoImportacion(ArrayList<TipoImportacion> tipoimportacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoImportacion tipoimportacionAux:tipoimportacionsSeleccionados) {
				tipoimportacionAux.setsDetalleGeneralEntityReporte(tipoimportacionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoImportacionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoimportacionAux.setsDescripcionGeneralEntityReporte1(tipoimportacionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoImportacionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoimportacionAux.setsDescripcionGeneralEntityReporte1(tipoimportacionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImportacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoImportacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoImportacion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoImportacion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoImportacion=false;
			this.isVisibilidadCeldaActualizarTipoImportacion=false;
			this.isVisibilidadCeldaEliminarTipoImportacion=false;
			this.isVisibilidadCeldaCancelarTipoImportacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImportacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoImportacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoImportacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImportacion=false;
			this.isVisibilidadCeldaModificarTipoImportacion=false;
			this.isVisibilidadCeldaActualizarTipoImportacion=true;
			this.isVisibilidadCeldaEliminarTipoImportacion=false;
			this.isVisibilidadCeldaCancelarTipoImportacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImportacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoImportacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoImportacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImportacion=false;
			this.isVisibilidadCeldaModificarTipoImportacion=false;
			this.isVisibilidadCeldaActualizarTipoImportacion=true;
			this.isVisibilidadCeldaEliminarTipoImportacion=true;
			this.isVisibilidadCeldaCancelarTipoImportacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImportacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoImportacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoImportacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImportacion=false;
			this.isVisibilidadCeldaModificarTipoImportacion=false;
			this.isVisibilidadCeldaActualizarTipoImportacion=true;
			this.isVisibilidadCeldaEliminarTipoImportacion=false;
			this.isVisibilidadCeldaCancelarTipoImportacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImportacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoImportacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoImportacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoImportacion=true;
			this.isVisibilidadCeldaModificarTipoImportacion=false;
			this.isVisibilidadCeldaActualizarTipoImportacion=false;
			this.isVisibilidadCeldaEliminarTipoImportacion=false;
			this.isVisibilidadCeldaCancelarTipoImportacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImportacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoImportacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoImportacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImportacion=false;
			this.isVisibilidadCeldaActualizarTipoImportacion=false;
			this.isVisibilidadCeldaEliminarTipoImportacion=false;
			this.isVisibilidadCeldaCancelarTipoImportacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImportacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoImportacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoImportacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImportacion=false;
			this.isVisibilidadCeldaModificarTipoImportacion=true;
			this.isVisibilidadCeldaActualizarTipoImportacion=false;
			this.isVisibilidadCeldaEliminarTipoImportacion=false;
			this.isVisibilidadCeldaCancelarTipoImportacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImportacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoImportacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoImportacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoImportacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoImportacion=true;
		} else {
			this.actualizarEstadoPanelsTipoImportacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoImportacion=false;
			//this.isVisibilidadCeldaVerFormTipoImportacion=false;
			this.isVisibilidadCeldaDuplicarTipoImportacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoimportacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoImportacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImportacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoimportacionSessionBean.getEsGuardarRelacionado()) {
			if(!tipoimportacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=false;												
			}
			
			this.jButtonCerrarTipoImportacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoImportacion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoimportacion)) {
			this.isVisibilidadCeldaActualizarTipoImportacion=false;
			this.isVisibilidadCeldaEliminarTipoImportacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoImportacion() {
	}
	
	public void actualizarEstadoPanelsTipoImportacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoImportacion!=null) {
				this.jScrollPanelDatosEdicionTipoImportacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoImportacion!=null) {
				this.jScrollPanelDatosTipoImportacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoImportacion!=null) {
				this.jPanelPaginacionTipoImportacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoImportacion!=null) {
				this.jPanelParametrosReportesTipoImportacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoImportacion!=null) {
				this.jScrollPanelDatosEdicionTipoImportacion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoImportacion!=null) {
				this.jScrollPanelDatosTipoImportacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoImportacion!=null) {
				this.jPanelPaginacionTipoImportacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoImportacion!=null) {
				this.jPanelParametrosReportesTipoImportacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoImportacion!=null) {
				this.jScrollPanelDatosEdicionTipoImportacion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoImportacion!=null) {
				this.jScrollPanelDatosTipoImportacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoImportacion!=null) {
				this.jPanelPaginacionTipoImportacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoImportacion!=null) {
				this.jPanelParametrosReportesTipoImportacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoImportacion!=null) {
				this.jScrollPanelDatosEdicionTipoImportacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoImportacion!=null) {
				this.jScrollPanelDatosTipoImportacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoImportacion!=null) {
				this.jPanelPaginacionTipoImportacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoImportacion!=null) {
				this.jPanelParametrosReportesTipoImportacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoImportacion!=null) {
				this.jScrollPanelDatosEdicionTipoImportacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoImportacion!=null) {
				this.jScrollPanelDatosTipoImportacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoImportacion!=null) {
				this.jPanelPaginacionTipoImportacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoImportacion!=null) {
				this.jPanelParametrosReportesTipoImportacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoImportacion!=null) {
				this.jScrollPanelDatosEdicionTipoImportacion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoImportacion!=null) {
				this.jScrollPanelDatosTipoImportacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoImportacion!=null) {
				this.jPanelPaginacionTipoImportacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoImportacion!=null) {
				this.jPanelParametrosReportesTipoImportacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoImportacion!=null) {
				this.jScrollPanelDatosEdicionTipoImportacion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoImportacion!=null) {
				this.jScrollPanelDatosTipoImportacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoImportacion!=null) {
				this.jPanelPaginacionTipoImportacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoImportacion!=null) {
				this.jPanelParametrosReportesTipoImportacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoImportacionSessionBean tipoimportacionSessionBean=new TipoImportacionSessionBean();
		
		if(this.tipoimportacionSessionBean==null) {
			this.tipoimportacionSessionBean=new TipoImportacionSessionBean();
		}
		
		this.tipoimportacionSessionBean.setsUltimaBusquedaTipoImportacion(this.getsAccionBusqueda());
		this.tipoimportacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoimportacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoImportacionSessionBean tipoimportacionSessionBean=new TipoImportacionSessionBean();
		
		if(this.tipoimportacionSessionBean==null) {
			this.tipoimportacionSessionBean=new TipoImportacionSessionBean();
		}
		
		if(this.tipoimportacionSessionBean.getsUltimaBusquedaTipoImportacion()!=null&&!this.tipoimportacionSessionBean.getsUltimaBusquedaTipoImportacion().equals("")) {
			this.setsAccionBusqueda(tipoimportacionSessionBean.getsUltimaBusquedaTipoImportacion());
			this.setiNumeroPaginacion(tipoimportacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoimportacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoimportacionSessionBean.setsUltimaBusquedaTipoImportacion("");
		this.tipoimportacionSessionBean.setiNumeroPaginacion(TipoImportacionConstantesFunciones.INUMEROPAGINACION);
		this.tipoimportacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoImportacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoImportacion() {
		this.updateBorderResaltarBusquedasFormularioTipoImportacion();
		this.updateVisibilidadBusquedasFormularioTipoImportacion();
		this.updateHabilitarBusquedasFormularioTipoImportacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoImportacion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoImportacion() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoImportacion() {
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
	
	public void updateControlesFormularioTipoImportacion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoImportacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoImportacion();
		this.updateVisibilidadResaltarControlesFormularioTipoImportacion();
		this.updateHabilitarResaltarControlesFormularioTipoImportacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoImportacion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoImportacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoimportacionConstantesFunciones.resaltaridTipoImportacion!=null && this.jInternalFrameDetalleFormTipoImportacion!=null) {this.jInternalFrameDetalleFormTipoImportacion.jTextFieldidTipoImportacion.setBorder(this.tipoimportacionConstantesFunciones.resaltaridTipoImportacion);}
		if(this.tipoimportacionConstantesFunciones.resaltarcodigoTipoImportacion!=null && this.jInternalFrameDetalleFormTipoImportacion!=null) {this.jInternalFrameDetalleFormTipoImportacion.jTextFieldcodigoTipoImportacion.setBorder(this.tipoimportacionConstantesFunciones.resaltarcodigoTipoImportacion);}
		if(this.tipoimportacionConstantesFunciones.resaltarnombreTipoImportacion!=null && this.jInternalFrameDetalleFormTipoImportacion!=null) {this.jInternalFrameDetalleFormTipoImportacion.jTextAreanombreTipoImportacion.setBorder(this.tipoimportacionConstantesFunciones.resaltarnombreTipoImportacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoImportacion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoImportacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
	
		//this.jInternalFrameDetalleFormTipoImportacion.jTextFieldidTipoImportacion.setVisible(this.tipoimportacionConstantesFunciones.mostraridTipoImportacion);
		this.jInternalFrameDetalleFormTipoImportacion.jPanelidTipoImportacion.setVisible(this.tipoimportacionConstantesFunciones.mostraridTipoImportacion);
		//this.jInternalFrameDetalleFormTipoImportacion.jTextFieldcodigoTipoImportacion.setVisible(this.tipoimportacionConstantesFunciones.mostrarcodigoTipoImportacion);
		this.jInternalFrameDetalleFormTipoImportacion.jPanelcodigoTipoImportacion.setVisible(this.tipoimportacionConstantesFunciones.mostrarcodigoTipoImportacion);
		//this.jInternalFrameDetalleFormTipoImportacion.jTextAreanombreTipoImportacion.setVisible(this.tipoimportacionConstantesFunciones.mostrarnombreTipoImportacion);
		this.jInternalFrameDetalleFormTipoImportacion.jPanelnombreTipoImportacion.setVisible(this.tipoimportacionConstantesFunciones.mostrarnombreTipoImportacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoImportacion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoImportacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoImportacion!=null) {
	
		this.jInternalFrameDetalleFormTipoImportacion.jTextFieldidTipoImportacion.setEnabled(this.tipoimportacionConstantesFunciones.activaridTipoImportacion);
		this.jInternalFrameDetalleFormTipoImportacion.jTextFieldcodigoTipoImportacion.setEnabled(this.tipoimportacionConstantesFunciones.activarcodigoTipoImportacion);
		this.jInternalFrameDetalleFormTipoImportacion.jTextAreanombreTipoImportacion.setEnabled(this.tipoimportacionConstantesFunciones.activarnombreTipoImportacion);
		}
	}
	
		
}