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

import com.bydan.erp.seguridad.util.TipoPeriodoConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoPeriodoParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoPeriodoParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoPeriodoBean;
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

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoPeriodoBeanSwingJInternalFrame extends TipoPeriodoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoPeriodoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoPeriodo> tipoperiodoValidator = new ClassValidator<TipoPeriodo>(TipoPeriodo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoPeriodo tipoperiodo;	
	public TipoPeriodo tipoperiodoAux;
	public TipoPeriodo tipoperiodoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoPeriodo tipoperiodoTotales;
	public Long idTipoPeriodoActual;
	public Long iIdNuevoTipoPeriodo=0L;
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
	
	public Boolean isPermisoTodoTipoPeriodo;
	public Boolean isPermisoNuevoTipoPeriodo;
	public Boolean isPermisoActualizarTipoPeriodo;
	public Boolean isPermisoActualizarOriginalTipoPeriodo;
	public Boolean isPermisoEliminarTipoPeriodo;
	public Boolean isPermisoGuardarCambiosTipoPeriodo;
	public Boolean isPermisoConsultaTipoPeriodo;
	public Boolean isPermisoBusquedaTipoPeriodo;
	public Boolean isPermisoReporteTipoPeriodo;
	public Boolean isPermisoPaginacionMedioTipoPeriodo;
	public Boolean isPermisoPaginacionAltoTipoPeriodo;
	public Boolean isPermisoPaginacionTodoTipoPeriodo;
	public Boolean isPermisoCopiarTipoPeriodo;
	public Boolean isPermisoVerFormTipoPeriodo;
	public Boolean isPermisoDuplicarTipoPeriodo;
	public Boolean isPermisoOrdenTipoPeriodo;
	
	
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
	
	public TipoPeriodoParameterReturnGeneral tipoperiodoReturnGeneral;
	public TipoPeriodoParameterReturnGeneral tipoperiodoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoPeriodo=false;
	public Boolean esParaAccionDesdeFormularioTipoPeriodo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoPeriodoLogic tipoperiodoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoPeriodo tipoperiodoBean;
	public TipoPeriodoConstantesFunciones tipoperiodoConstantesFunciones;
	//public TipoPeriodoParameterReturnGeneral tipoperiodoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoPeriodo> tipoperiodos;	
	//public List<TipoPeriodo> tipoperiodosEliminados;
	//public List<TipoPeriodo> tipoperiodosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoPeriodo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoPeriodo=true;
	public Boolean isVisibilidadCeldaCopiarTipoPeriodo=true;
	public Boolean isVisibilidadCeldaVerFormTipoPeriodo=true;
	public Boolean isVisibilidadCeldaOrdenTipoPeriodo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoPeriodo=false;
	public Boolean isVisibilidadCeldaModificarTipoPeriodo=false;
	public Boolean isVisibilidadCeldaActualizarTipoPeriodo=false;
	public Boolean isVisibilidadCeldaEliminarTipoPeriodo=false;
	public Boolean isVisibilidadCeldaCancelarTipoPeriodo=false;
	public Boolean isVisibilidadCeldaGuardarTipoPeriodo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoPeriodo=false;	
	
	
	
	public Long getiIdNuevoTipoPeriodo() {
		return this.iIdNuevoTipoPeriodo;
	}

	public void setiIdNuevoTipoPeriodo(Long iIdNuevoTipoPeriodo) {
		this.iIdNuevoTipoPeriodo = iIdNuevoTipoPeriodo;
	}
	
	public Long getidTipoPeriodoActual() {
		return this.idTipoPeriodoActual;
	}

	public void setidTipoPeriodoActual(Long idTipoPeriodoActual) {
		this.idTipoPeriodoActual = idTipoPeriodoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoPeriodo gettipoperiodo() {
		return this.tipoperiodo;
	}

	public void settipoperiodo(TipoPeriodo tipoperiodo) {
		this.tipoperiodo = tipoperiodo;
	}
	
	public TipoPeriodo gettipoperiodoAux() {
		return this.tipoperiodoAux;
	}

	public void settipoperiodoAux(TipoPeriodo tipoperiodoAux) {
		this.tipoperiodoAux = tipoperiodoAux;
	}				
	
	public TipoPeriodo gettipoperiodoAnterior() {
		return this.tipoperiodoAnterior;
	}

	public void settipoperiodoAnterior(TipoPeriodo tipoperiodoAnterior) {
		this.tipoperiodoAnterior = tipoperiodoAnterior;
	}	
	
	public TipoPeriodo gettipoperiodoTotales() {
		return this.tipoperiodoTotales;
	}

	public void settipoperiodoTotales(TipoPeriodo tipoperiodoTotales) {
		this.tipoperiodoTotales = tipoperiodoTotales;
	}	
	
	public TipoPeriodo gettipoperiodoBean() {
		return this.tipoperiodoBean;
	}

	public void settipoperiodoBean(TipoPeriodo tipoperiodoBean) {
		this.tipoperiodoBean = tipoperiodoBean;
	}	
	
	public TipoPeriodoParameterReturnGeneral gettipoperiodoReturnGeneral() {
		return this.tipoperiodoReturnGeneral;
	}

	public void settipoperiodoReturnGeneral(TipoPeriodoParameterReturnGeneral tipoperiodoReturnGeneral) {
		this.tipoperiodoReturnGeneral = tipoperiodoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoPeriodoLogic getTipoPeriodoLogic()	{		
		return tipoperiodoLogic;
	}

	public void setTipoPeriodoLogic(TipoPeriodoLogic tipoperiodoLogic) {
		this.tipoperiodoLogic = tipoperiodoLogic;
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
	
	public Boolean getIsEsNuevoTipoPeriodo() {
		return isEsNuevoTipoPeriodo;
	}

	public void setIsEsNuevoTipoPeriodo(Boolean isEsNuevoTipoPeriodo) {
		this.isEsNuevoTipoPeriodo = isEsNuevoTipoPeriodo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoPeriodo() {
		return esParaAccionDesdeFormularioTipoPeriodo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoPeriodo(Boolean esParaAccionDesdeFormularioTipoPeriodo) {
		this.esParaAccionDesdeFormularioTipoPeriodo = esParaAccionDesdeFormularioTipoPeriodo;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoPeriodo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoPeriodoConstantesFunciones.refrescarForeignKeysDescripcionesTipoPeriodo(this.tipoperiodoLogic.getTipoPeriodos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoPeriodoConstantesFunciones.refrescarForeignKeysDescripcionesTipoPeriodo(this.tipoperiodos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoperiodoLogic.setTipoPeriodos(this.tipoperiodos);
			tipoperiodoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoPeriodoParameterReturnGeneral getTipoPeriodoParameterGeneral() {
		return this.tipoperiodoParameterGeneral;
	}
	
	public void setTipoPeriodoParameterGeneral(TipoPeriodoParameterReturnGeneral tipoperiodoParameterGeneral) {
		this.tipoperiodoParameterGeneral = tipoperiodoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoPeriodo() {
		return isPermisoTodoTipoPeriodo;
	}

	public void setIsPermisoTodoTipoPeriodo(Boolean isPermisoTodoTipoPeriodo) {
		this.isPermisoTodoTipoPeriodo = isPermisoTodoTipoPeriodo;
	}

	public Boolean getIsPermisoNuevoTipoPeriodo() {
		return isPermisoNuevoTipoPeriodo;
	}

	public void setIsPermisoNuevoTipoPeriodo(Boolean isPermisoNuevoTipoPeriodo) {
		this.isPermisoNuevoTipoPeriodo = isPermisoNuevoTipoPeriodo;
	}

	public Boolean getIsPermisoActualizarTipoPeriodo() {
		return isPermisoActualizarTipoPeriodo;
	}

	public void setIsPermisoActualizarTipoPeriodo(Boolean isPermisoActualizarTipoPeriodo) {
		this.isPermisoActualizarTipoPeriodo = isPermisoActualizarTipoPeriodo;
	}

	public Boolean getIsPermisoEliminarTipoPeriodo() {
		return isPermisoEliminarTipoPeriodo;
	}

	public void setIsPermisoEliminarTipoPeriodo(Boolean isPermisoEliminarTipoPeriodo) {
		this.isPermisoEliminarTipoPeriodo = isPermisoEliminarTipoPeriodo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoPeriodo() {
		return isPermisoGuardarCambiosTipoPeriodo;
	}

	public void setIsPermisoGuardarCambiosTipoPeriodo(Boolean isPermisoGuardarCambiosTipoPeriodo) {
		this.isPermisoGuardarCambiosTipoPeriodo = isPermisoGuardarCambiosTipoPeriodo;
	}
	
	public Boolean getIsPermisoConsultaTipoPeriodo() {
		return isPermisoConsultaTipoPeriodo;
	}

	public void setIsPermisoConsultaTipoPeriodo(Boolean isPermisoConsultaTipoPeriodo) {
		this.isPermisoConsultaTipoPeriodo = isPermisoConsultaTipoPeriodo;
	}

	public Boolean getIsPermisoBusquedaTipoPeriodo() {
		return isPermisoBusquedaTipoPeriodo;
	}

	public void setIsPermisoBusquedaTipoPeriodo(Boolean isPermisoBusquedaTipoPeriodo) {
		this.isPermisoBusquedaTipoPeriodo = isPermisoBusquedaTipoPeriodo;
	}

	public Boolean getIsPermisoReporteTipoPeriodo() {
		return isPermisoReporteTipoPeriodo;
	}

	public void setIsPermisoReporteTipoPeriodo(Boolean isPermisoReporteTipoPeriodo) {
		this.isPermisoReporteTipoPeriodo = isPermisoReporteTipoPeriodo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoPeriodo() {
		return isPermisoPaginacionMedioTipoPeriodo;
	}

	public void setIsPermisoPaginacionMedioTipoPeriodo(Boolean isPermisoPaginacionMedioTipoPeriodo) {
		this.isPermisoPaginacionMedioTipoPeriodo = isPermisoPaginacionMedioTipoPeriodo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoPeriodo() {
		return isPermisoPaginacionTodoTipoPeriodo;
	}

	public void setIsPermisoPaginacionTodoTipoPeriodo(Boolean isPermisoPaginacionTodoTipoPeriodo) {
		this.isPermisoPaginacionTodoTipoPeriodo = isPermisoPaginacionTodoTipoPeriodo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoPeriodo() {
		return isPermisoPaginacionAltoTipoPeriodo;
	}

	public void setIsPermisoPaginacionAltoTipoPeriodo(Boolean isPermisoPaginacionAltoTipoPeriodo) {
		this.isPermisoPaginacionAltoTipoPeriodo = isPermisoPaginacionAltoTipoPeriodo;
	}
	
	public Boolean getIsPermisoCopiarTipoPeriodo() {
		return isPermisoCopiarTipoPeriodo;
	}

	public void setIsPermisoCopiarTipoPeriodo(Boolean isPermisoCopiarTipoPeriodo) {
		this.isPermisoCopiarTipoPeriodo = isPermisoCopiarTipoPeriodo;
	}
	
	public Boolean getIsPermisoVerFormTipoPeriodo() {
		return isPermisoVerFormTipoPeriodo;
	}

	public void setIsPermisoVerFormTipoPeriodo(Boolean isPermisoVerFormTipoPeriodo) {
		this.isPermisoVerFormTipoPeriodo = isPermisoVerFormTipoPeriodo;
	}
	
	public Boolean getIsPermisoDuplicarTipoPeriodo() {
		return isPermisoDuplicarTipoPeriodo;
	}

	public void setIsPermisoDuplicarTipoPeriodo(Boolean isPermisoDuplicarTipoPeriodo) {
		this.isPermisoDuplicarTipoPeriodo = isPermisoDuplicarTipoPeriodo;
	}
	
	public Boolean getIsPermisoOrdenTipoPeriodo() {
		return isPermisoOrdenTipoPeriodo;
	}

	public void setIsPermisoOrdenTipoPeriodo(Boolean isPermisoOrdenTipoPeriodo) {
		this.isPermisoOrdenTipoPeriodo = isPermisoOrdenTipoPeriodo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoPeriodo() {
		return isVisibilidadCeldaNuevoTipoPeriodo;
	}

	public void setIsVisibilidadCeldaNuevoTipoPeriodo(Boolean isVisibilidadCeldaNuevoTipoPeriodo) {
		this.isVisibilidadCeldaNuevoTipoPeriodo = isVisibilidadCeldaNuevoTipoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoPeriodo() {
		return isVisibilidadCeldaDuplicarTipoPeriodo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoPeriodo(Boolean isVisibilidadCeldaDuplicarTipoPeriodo) {
		this.isVisibilidadCeldaDuplicarTipoPeriodo = isVisibilidadCeldaDuplicarTipoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoPeriodo() {
		return isVisibilidadCeldaCopiarTipoPeriodo;
	}

	public void setIsVisibilidadCeldaCopiarTipoPeriodo(Boolean isVisibilidadCeldaCopiarTipoPeriodo) {
		this.isVisibilidadCeldaCopiarTipoPeriodo = isVisibilidadCeldaCopiarTipoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoPeriodo() {
		return isVisibilidadCeldaVerFormTipoPeriodo;
	}

	public void setIsVisibilidadCeldaVerFormTipoPeriodo(Boolean isVisibilidadCeldaVerFormTipoPeriodo) {
		this.isVisibilidadCeldaVerFormTipoPeriodo = isVisibilidadCeldaVerFormTipoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoPeriodo() {
		return isVisibilidadCeldaOrdenTipoPeriodo;
	}

	public void setIsVisibilidadCeldaOrdenTipoPeriodo(Boolean isVisibilidadCeldaOrdenTipoPeriodo) {
		this.isVisibilidadCeldaOrdenTipoPeriodo = isVisibilidadCeldaOrdenTipoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoPeriodo() {
		return isVisibilidadCeldaNuevoRelacionesTipoPeriodo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoPeriodo(Boolean isVisibilidadCeldaNuevoRelacionesTipoPeriodo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo = isVisibilidadCeldaNuevoRelacionesTipoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoPeriodo() {
		return isVisibilidadCeldaModificarTipoPeriodo;
	}

	public void setIsVisibilidadCeldaModificarTipoPeriodo(Boolean isVisibilidadCeldaModificarTipoPeriodo) {
		this.isVisibilidadCeldaModificarTipoPeriodo = isVisibilidadCeldaModificarTipoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoPeriodo() {
		return isVisibilidadCeldaActualizarTipoPeriodo;
	}

	public void setIsVisibilidadCeldaActualizarTipoPeriodo(Boolean isVisibilidadCeldaActualizarTipoPeriodo) {
		this.isVisibilidadCeldaActualizarTipoPeriodo = isVisibilidadCeldaActualizarTipoPeriodo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoPeriodo() {
		return isVisibilidadCeldaEliminarTipoPeriodo;
	}

	public void setIsVisibilidadCeldaEliminarTipoPeriodo(Boolean isVisibilidadCeldaEliminarTipoPeriodo) {
		this.isVisibilidadCeldaEliminarTipoPeriodo = isVisibilidadCeldaEliminarTipoPeriodo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoPeriodo() {
		return isVisibilidadCeldaCancelarTipoPeriodo;
	}

	public void setIsVisibilidadCeldaCancelarTipoPeriodo(Boolean isVisibilidadCeldaCancelarTipoPeriodo) {
		this.isVisibilidadCeldaCancelarTipoPeriodo = isVisibilidadCeldaCancelarTipoPeriodo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoPeriodo() {
		return isVisibilidadCeldaGuardarTipoPeriodo;
	}

	public void setIsVisibilidadCeldaGuardarTipoPeriodo(Boolean isVisibilidadCeldaGuardarTipoPeriodo) {
		this.isVisibilidadCeldaGuardarTipoPeriodo = isVisibilidadCeldaGuardarTipoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoPeriodo() {
		return isVisibilidadCeldaGuardarCambiosTipoPeriodo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoPeriodo(Boolean isVisibilidadCeldaGuardarCambiosTipoPeriodo) {
		this.isVisibilidadCeldaGuardarCambiosTipoPeriodo = isVisibilidadCeldaGuardarCambiosTipoPeriodo;
	}
		
	public TipoPeriodoSessionBean gettipoperiodoSessionBean() {
		return this.tipoperiodoSessionBean;
	}
	
	public void settipoperiodoSessionBean(TipoPeriodoSessionBean tipoperiodoSessionBean) {
		this.tipoperiodoSessionBean=tipoperiodoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(TipoPeriodo tipoperiodo)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoPeriodo tipoperiodo,TipoPeriodo tipoperiodoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoPeriodo(tipoperiodo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoperiodoAux.setId(tipoperiodo.getId());
		tipoperiodoAux.setVersionRow(tipoperiodo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoPeriodo();
		
			int intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodo =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoperiodo =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoPeriodo(this.tipoperiodo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(this.tipoperiodo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoperiodoValidator.getInvalidValues(this.tipoperiodo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoperiodoLogic.setDatosCliente(datosCliente);
			tipoperiodoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoperiodoAux=new  TipoPeriodo();
				
				tipoperiodoAux.setIsNew(true);
				tipoperiodoAux.setIsChanged(true);
				
				tipoperiodoAux.setTipoPeriodoOriginal(this.tipoperiodo);
				
				tipoperiodoAux.setId(this.tipoperiodo.getId());	
				tipoperiodoAux.setVersionRow(this.tipoperiodo.getVersionRow());	
				tipoperiodoAux.setcodigo(this.tipoperiodo.getcodigo());	
				tipoperiodoAux.setnombre(this.tipoperiodo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoperiodoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoperiodoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoperiodoAux,tipoperiodoLogic.getTipoPeriodos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoperiodoAux,tipoperiodos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoperiodoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoperiodoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoperiodoLogic.saveTipoPeriodos();//WithConnection
						//tipoperiodoLogic.getSetVersionRowTipoPeriodos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoperiodo,tipoperiodoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoperiodoAux=new  TipoPeriodo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoperiodoSessionBean.getEsGuardarRelacionado() && this.tipoperiodo.getId()>=0)) {
						
					tipoperiodoAux.setIsNew(false);
				}
				
				tipoperiodoAux.setIsDeleted(false);
			
				tipoperiodoAux.setId(this.tipoperiodo.getId());	
				tipoperiodoAux.setVersionRow(this.tipoperiodo.getVersionRow());	
				tipoperiodoAux.setcodigo(this.tipoperiodo.getcodigo());	
				tipoperiodoAux.setnombre(this.tipoperiodo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoperiodoAux,tipoperiodoLogic.getTipoPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoperiodoAux,tipoperiodos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoperiodoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoperiodoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoperiodoLogic.saveTipoPeriodos();//WithConnection
						//tipoperiodoLogic.getSetVersionRowTipoPeriodos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoperiodo,tipoperiodoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoperiodoAux=new  TipoPeriodo();
				
				tipoperiodoAux.setIsNew(false);
				tipoperiodoAux.setIsChanged(false);
				
				tipoperiodoAux.setIsDeleted(true);
				
				tipoperiodoAux.setId(this.tipoperiodo.getId());	
				tipoperiodoAux.setVersionRow(this.tipoperiodo.getVersionRow());	
				tipoperiodoAux.setcodigo(this.tipoperiodo.getcodigo());	
				tipoperiodoAux.setnombre(this.tipoperiodo.getnombre());	
				
				if(this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoperiodoAux.getId()>=0) {	
						this.tipoperiodosEliminados.add(tipoperiodoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoperiodoAux,tipoperiodoLogic.getTipoPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoperiodoAux,tipoperiodos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoperiodoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoperiodoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoperiodoLogic.saveTipoPeriodos();//WithConnection
						//tipoperiodoLogic.getSetVersionRowTipoPeriodos();//WithConnection
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
					this.tipoperiodoLogic.getTipoPeriodos().addAll(this.tipoperiodosEliminados);
					
					tipoperiodoLogic.saveTipoPeriodos();//WithConnection
					//tipoperiodoLogic.getSetVersionRowTipoPeriodos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoperiodosEliminados= new ArrayList<TipoPeriodo>();		
			}
			
			if(this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Periodo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Periodo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoperiodo=tipoperiodoAux;
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
      		//this.finishProcessTipoPeriodo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoPeriodo tipoperiodoLocal) throws Exception {
		
		if(this.tipoperiodoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoPeriodo tipoperiodoLocal) throws Exception {	
		if(this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoPeriodoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoperiodo =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoperiodo =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoperiodoValidator.getInvalidValues(this.tipoperiodo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoPeriodo tipoperiodo,List<TipoPeriodo> tipoperiodos) throws Exception {
		try	{		
			TipoPeriodoConstantesFunciones.actualizarLista(tipoperiodo,tipoperiodos,this.tipoperiodoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoPeriodo tipoperiodo,List<TipoPeriodo> tipoperiodos) throws Exception {
		try	{			
			TipoPeriodoConstantesFunciones.actualizarSelectedLista(tipoperiodo,tipoperiodos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoPeriodo> tipoperiodosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoperiodosLocal=this.tipoperiodoLogic.getTipoPeriodos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoperiodosLocal=this.tipoperiodos;
			}
			//ARCHITECTURE
		
			for(TipoPeriodo tipoperiodoLocal:tipoperiodosLocal) {
				if(this.permiteMantenimiento(tipoperiodoLocal) && tipoperiodoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoPeriodoConstantesFunciones.getTipoPeriodoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoPeriodoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPeriodo.jLabelcodigoTipoPeriodo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPeriodoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPeriodo.jLabelnombreTipoPeriodo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPeriodo.jLabelcodigoTipoPeriodo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPeriodo.jLabelnombreTipoPeriodo,"");
		
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
		this.iIdNuevoTipoPeriodo--;	
		
		
		this.tipoperiodoAux=new TipoPeriodo();
		
		this.tipoperiodoAux.setId(this.iIdNuevoTipoPeriodo);
		this.tipoperiodoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoperiodoLogic.getTipoPeriodos().add(this.tipoperiodoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoperiodos.add(this.tipoperiodoAux);
		}
		//ARCHITECTURE
		
		this.tipoperiodo=this.tipoperiodoAux;
		
		if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoPeriodo(this.tipoperiodo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPeriodo(this.tipoperiodo);
		}
				
		//this.setDefaultControlesTipoPeriodo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoPeriodo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoPeriodo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPeriodo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPeriodo(this.tipoperiodoBean,this.tipoperiodo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(this.tipoperiodo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoPeriodoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoperiodoSessionBean.getConGuardarRelaciones()) {
			classes=TipoPeriodoConstantesFunciones.getClassesRelationshipsOfTipoPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoperiodoReturnGeneral=tipoperiodoLogic.procesarEventosTipoPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoperiodoLogic.getTipoPeriodos(),this.tipoperiodo,this.tipoperiodoParameterGeneral,this.isEsNuevoTipoPeriodo,classes);//this.tipoperiodoLogic.getTipoPeriodo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoPeriodo(this.tipoperiodoReturnGeneral,this.tipoperiodoBean,false);
		
		if(this.tipoperiodoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPeriodo(this.tipoperiodoReturnGeneral.getTipoPeriodo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoPeriodo(this.tipoperiodoReturnGeneral.getTipoPeriodo());
		}
		
		if(this.tipoperiodoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoPeriodo(this.tipoperiodoReturnGeneral.getTipoPeriodo(),classes);//this.tipoperiodoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoPeriodo(this.tipoperiodo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoPeriodo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoPeriodo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoPeriodo(false);
						
			if(tipoperiodoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPeriodo();
			}
			
			this.actualizarVisualTableDatosTipoPeriodo();
			
			this.jTableDatosTipoPeriodo.setRowSelectionInterval(this.getIndiceNuevoTipoPeriodo(), this.getIndiceNuevoTipoPeriodo());
			
			this.seleccionarFilaTablaTipoPeriodoActual();
						
			this.actualizarEstadoCeldasBotonesTipoPeriodo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoPeriodo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldcodigoTipoPeriodo.setEnabled(isHabilitar && this.tipoperiodoConstantesFunciones.activarcodigoTipoPeriodo);
		this.jInternalFrameDetalleFormTipoPeriodo.jTextAreanombreTipoPeriodo.setEnabled(isHabilitar && this.tipoperiodoConstantesFunciones.activarnombreTipoPeriodo);	
		
	};
	
	public void setDefaultControlesTipoPeriodo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoPeriodo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoperiodoSessionBean.setConGuardarRelaciones(true);			
			this.tipoperiodoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoPeriodo.jTabbedPaneRelacionesTipoPeriodo.setVisible(true);
			
					
		} else {
			//this.tipoperiodoSessionBean.setConGuardarRelaciones(false);			
			this.tipoperiodoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoPeriodo.jTabbedPaneRelacionesTipoPeriodo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoPeriodo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPeriodo tipoperiodoAux:this.tipoperiodoLogic.getTipoPeriodos()) {
				if(tipoperiodoAux.getId().equals(this.iIdNuevoTipoPeriodo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPeriodo tipoperiodoAux:this.tipoperiodos) {
				if(tipoperiodoAux.getId().equals(this.iIdNuevoTipoPeriodo)) {
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
	
	public int getIndiceActualTipoPeriodo(TipoPeriodo tipoperiodo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPeriodo tipoperiodoAux:this.tipoperiodoLogic.getTipoPeriodos()) {
				if(tipoperiodoAux.getId().equals(tipoperiodo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPeriodo tipoperiodoAux:this.tipoperiodos) {
				if(tipoperiodoAux.getId().equals(tipoperiodo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoPeriodo(TipoPeriodo tipoperiodoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPeriodo tipoperiodoAux:this.tipoperiodoLogic.getTipoPeriodos()) {
				if(tipoperiodoAux.getTipoPeriodoOriginal().getId().equals(tipoperiodoOriginal.getId())) {
					existe=true;
					tipoperiodoOriginal.setId(tipoperiodoAux.getId());
					tipoperiodoOriginal.setVersionRow(tipoperiodoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPeriodo tipoperiodoAux:this.tipoperiodos) {
				if(tipoperiodoAux.getTipoPeriodoOriginal().getId().equals(tipoperiodoOriginal.getId())) {
					existe=true;
					tipoperiodoOriginal.setId(tipoperiodoAux.getId());
					tipoperiodoOriginal.setVersionRow(tipoperiodoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoPeriodo(Boolean esParaCancelar) throws Exception {
		tipoperiodosAux=new ArrayList<TipoPeriodo>();
		tipoperiodoAux=new TipoPeriodo();
		
		if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPeriodo tipoperiodoAux:this.tipoperiodoLogic.getTipoPeriodos()) {
					if(tipoperiodoAux.getId()<0) {
						tipoperiodosAux.add(tipoperiodoAux);
					}		
				}
				this.iIdNuevoTipoPeriodo=0L;
				this.tipoperiodoLogic.getTipoPeriodos().removeAll(tipoperiodosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPeriodo tipoperiodoAux:this.tipoperiodos) {
					if(tipoperiodoAux.getId()<0) {
						tipoperiodosAux.add(tipoperiodoAux);
					}		
				}
				this.iIdNuevoTipoPeriodo=0L;
				this.tipoperiodos.removeAll(tipoperiodosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoPeriodo 
					&& this.tipoperiodoLogic.getTipoPeriodos().size()>0
					) {
					tipoperiodoAux=this.tipoperiodoLogic.getTipoPeriodos().get(this.tipoperiodoLogic.getTipoPeriodos().size() - 1);
				
					if(tipoperiodoAux.getId()<0) {
						this.tipoperiodoLogic.getTipoPeriodos().remove(tipoperiodoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoPeriodo && this.tipoperiodos.size()>0) {
					tipoperiodoAux=this.tipoperiodos.get(this.tipoperiodos.size() - 1);
				
					if(tipoperiodoAux.getId()<0) {
						this.tipoperiodos.remove(tipoperiodoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoPeriodo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoperiodo.getId()<0) {
				this.tipoperiodoLogic.getTipoPeriodos().remove(this.tipoperiodo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoperiodo.getId()<0) {
				this.tipoperiodos.remove(this.tipoperiodo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoPeriodo(List<TipoPeriodo> tipoperiodosAux) throws Exception {
		TipoPeriodoConstantesFunciones.setEstadosInicialesTipoPeriodo(tipoperiodosAux);
	}
	
	public void setEstadosInicialesTipoPeriodo(TipoPeriodo tipoperiodoAux) throws Exception {
		TipoPeriodoConstantesFunciones.setEstadosInicialesTipoPeriodo(tipoperiodoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoPeriodoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoPeriodoActual()) {
				if(!this.isEsNuevoTipoPeriodo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoPeriodo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoPeriodoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Periodo ?", "MANTENIMIENTO DE Tipo Periodo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoPeriodo tipoperiodo) throws Exception {
		TipoPeriodoConstantesFunciones.seleccionarAsignar(this.tipoperiodo,tipoperiodo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoPeriodo=this.isPermisoActualizarOriginalTipoPeriodo;
			
			
			this.seleccionarAsignar(tipoperiodo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPeriodoConstantesFunciones.quitarEspaciosTipoPeriodo(this.tipoperiodo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoPeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoperiodoSessionBean.setsFuncionBusquedaRapida(this.tipoperiodoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoPeriodo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoPeriodo(esParaCancelar);				
				this.cancelarNuevoTipoPeriodo(esParaCancelar);								
			}
			
			this.tipoperiodo=new TipoPeriodo();
			
			this.inicializarTipoPeriodo();
			
			this.actualizarEstadoCeldasBotonesTipoPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoPeriodo() throws Exception {
		try {
			TipoPeriodoConstantesFunciones.inicializarTipoPeriodo(this.tipoperiodo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoperiodoLogic.getTipoPeriodos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoPeriodos(String sAccionBusqueda,List<TipoPeriodo> tipoperiodosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoPeriodo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoPeriodoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoPeriodoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoPeriodo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Periodos");		
		parameters.put("busquedapor", TipoPeriodoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoPeriodo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoPeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoPeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoPeriodo=new JRBeanArrayDataSource(TipoPeriodoJInternalFrame.TraerTipoPeriodoBeans(tipoperiodosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoPeriodo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoPeriodoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoPeriodoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoPeriodoBean.TraerTipoPeriodoBeans(tipoperiodosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoPeriodos(sAccionBusqueda,sTipoArchivoReporte,tipoperiodosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoPeriodos(sAccionBusqueda,sTipoArchivoReporte,tipoperiodosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoPeriodoActionPerformed(null);
					//this.generarExcelReporteTipoPeriodos(sAccionBusqueda,sTipoArchivoReporte,tipoperiodosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoPeriodos(sAccionBusqueda,sTipoArchivoReporte,tipoperiodosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoPeriodos(sAccionBusqueda,sTipoArchivoReporte,tipoperiodosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoPeriodos(sAccionBusqueda,sTipoArchivoReporte,tipoperiodosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoPeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPeriodo> tipoperiodosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoperiodo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPeriodos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPeriodo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoPeriodo tipoperiodo : tipoperiodosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoPeriodoConstantesFunciones.generarExcelReporteDataTipoPeriodo("NORMAL",row,workbook,tipoperiodo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Periodo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoPeriodo(String sTipo,Row row,Workbook workbook) {
		
		TipoPeriodoConstantesFunciones.generarExcelReporteHeaderTipoPeriodo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoPeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPeriodo> tipoperiodosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoperiodo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPeriodos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoPeriodo tipoperiodo : tipoperiodosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoPeriodoConstantesFunciones.getTipoPeriodoDescripcion(tipoperiodo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPeriodoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPeriodoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoperiodo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPeriodoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPeriodoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoperiodo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Periodo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoPeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPeriodo> tipoperiodosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoPeriodo> tipoperiodosRespaldo=null;
		
		classes=TipoPeriodoConstantesFunciones.getClassesRelationshipsOfTipoPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoperiodoLogic.setDatosCliente(this.datosCliente);
		this.tipoperiodoLogic.setDatosDeep(this.datosDeep);
		this.tipoperiodoLogic.setIsConDeep(true);
		
		tipoperiodosRespaldo=this.tipoperiodoLogic.getTipoPeriodos();
		
		this.tipoperiodoLogic.setTipoPeriodos(tipoperiodosParaReportes);	
		this.tipoperiodoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoperiodosParaReportes=this.tipoperiodoLogic.getTipoPeriodos();
		this.tipoperiodoLogic.setTipoPeriodos(tipoperiodosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoperiodo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPeriodos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPeriodo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoPeriodo tipoperiodo : tipoperiodosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoPeriodo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoPeriodoConstantesFunciones.generarExcelReporteDataTipoPeriodo("NORMAL",row,workbook,tipoperiodo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoPeriodoConstantesFunciones.getTipoPeriodoDescripcion(tipoperiodo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Periodo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPeriodo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPeriodo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoPeriodo() throws Exception {		
		this.startProcessTipoPeriodo(true);
	}
	
	public void startProcessTipoPeriodo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoPeriodo, this.jScrollPanelDatosTipoPeriodo,this.jPanelPaginacionTipoPeriodo, this.jScrollPanelDatosEdicionTipoPeriodo, this.jPanelAccionesTipoPeriodo,this.jPanelAccionesFormularioTipoPeriodo,this.jmenuBarTipoPeriodo,this.jmenuBarDetalleTipoPeriodo,this.jTtoolBarTipoPeriodo,this.jTtoolBarDetalleTipoPeriodo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPeriodo=null; 
		
		final JPanel jPanelParametrosReportesTipoPeriodo=this.jPanelParametrosReportesTipoPeriodo;
		//final JScrollPane jScrollPanelDatosTipoPeriodo=this.jScrollPanelDatosTipoPeriodo;
		final JTable jTableDatosTipoPeriodo=this.jTableDatosTipoPeriodo;		
		final JPanel jPanelPaginacionTipoPeriodo=this.jPanelPaginacionTipoPeriodo;
		//final JScrollPane jScrollPanelDatosEdicionTipoPeriodo=this.jScrollPanelDatosEdicionTipoPeriodo;
		final JPanel jPanelAccionesTipoPeriodo=this.jPanelAccionesTipoPeriodo;
		
		JPanel jPanelCamposAuxiliarTipoPeriodo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoPeriodo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
			jPanelCamposAuxiliarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jPanelCamposTipoPeriodo;
			jPanelAccionesFormularioAuxiliarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jPanelAccionesFormularioTipoPeriodo;
		}
		
		final JPanel jPanelCamposTipoPeriodo=jPanelCamposAuxiliarTipoPeriodo;
		final JPanel jPanelAccionesFormularioTipoPeriodo=jPanelAccionesFormularioAuxiliarTipoPeriodo;
		
		
		final JMenuBar jmenuBarTipoPeriodo=this.jmenuBarTipoPeriodo;
		final JToolBar jTtoolBarTipoPeriodo=this.jTtoolBarTipoPeriodo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoPeriodo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPeriodo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
			jmenuBarDetalleAuxiliarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jmenuBarDetalleTipoPeriodo;
			jTtoolBarDetalleAuxiliarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jTtoolBarDetalleTipoPeriodo;
		}
		
		final JMenuBar jmenuBarDetalleTipoPeriodo=jmenuBarDetalleAuxiliarTipoPeriodo;
		final JToolBar jTtoolBarDetalleTipoPeriodo=jTtoolBarDetalleAuxiliarTipoPeriodo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPeriodo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPeriodo;
			processRunnable.jTableDatos=jTableDatosTipoPeriodo;
			processRunnable.jPanelCampos=jPanelCamposTipoPeriodo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPeriodo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPeriodo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPeriodo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPeriodo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPeriodo;
			processRunnable.jTtoolBar=jTtoolBarTipoPeriodo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPeriodo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPeriodo ,jPanelParametrosReportesTipoPeriodo,jTableDatosTipoPeriodo, /*jScrollPanelDatosTipoPeriodo,*/jPanelCamposTipoPeriodo,jPanelPaginacionTipoPeriodo, /*jScrollPanelDatosEdicionTipoPeriodo,*/ jPanelAccionesTipoPeriodo,jPanelAccionesFormularioTipoPeriodo,jmenuBarTipoPeriodo,jmenuBarDetalleTipoPeriodo,jTtoolBarTipoPeriodo,jTtoolBarDetalleTipoPeriodo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoPeriodo, jScrollPanelDatosTipoPeriodo,jPanelPaginacionTipoPeriodo, jScrollPanelDatosEdicionTipoPeriodo, jPanelAccionesTipoPeriodo,jPanelAccionesFormularioTipoPeriodo,jmenuBarTipoPeriodo,jmenuBarDetalleTipoPeriodo,jTtoolBarTipoPeriodo,jTtoolBarDetalleTipoPeriodo);
						
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
	
	public void finishProcessTipoPeriodo() {// throws Exception 
		this.finishProcessTipoPeriodo(true);
	}
	
	public void finishProcessTipoPeriodo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoPeriodo, this.jScrollPanelDatosTipoPeriodo,this.jPanelPaginacionTipoPeriodo, this.jScrollPanelDatosEdicionTipoPeriodo, this.jPanelAccionesTipoPeriodo,this.jPanelAccionesFormularioTipoPeriodo,this.jmenuBarTipoPeriodo,this.jmenuBarDetalleTipoPeriodo,this.jTtoolBarTipoPeriodo,this.jTtoolBarDetalleTipoPeriodo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPeriodo=null; 
		
		final JPanel jPanelParametrosReportesTipoPeriodo=this.jPanelParametrosReportesTipoPeriodo;
		//final JScrollPane jScrollPanelDatosTipoPeriodo=this.jScrollPanelDatosTipoPeriodo;
		final JTable jTableDatosTipoPeriodo=this.jTableDatosTipoPeriodo;		
		final JPanel jPanelPaginacionTipoPeriodo=this.jPanelPaginacionTipoPeriodo;
		//final JScrollPane jScrollPanelDatosEdicionTipoPeriodo=this.jScrollPanelDatosEdicionTipoPeriodo;
		final JPanel jPanelAccionesTipoPeriodo=this.jPanelAccionesTipoPeriodo;
		
		JPanel jPanelCamposAuxiliarTipoPeriodo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoPeriodo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
			jPanelCamposAuxiliarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jPanelCamposTipoPeriodo;
			jPanelAccionesFormularioAuxiliarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jPanelAccionesFormularioTipoPeriodo;
		}
		
		final JPanel jPanelCamposTipoPeriodo=jPanelCamposAuxiliarTipoPeriodo;
		final JPanel jPanelAccionesFormularioTipoPeriodo=jPanelAccionesFormularioAuxiliarTipoPeriodo;
		
		
		final JMenuBar jmenuBarTipoPeriodo=this.jmenuBarTipoPeriodo;		
		final JToolBar jTtoolBarTipoPeriodo=this.jTtoolBarTipoPeriodo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoPeriodo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPeriodo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
			jmenuBarDetalleAuxiliarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jmenuBarDetalleTipoPeriodo;
			jTtoolBarDetalleAuxiliarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jTtoolBarDetalleTipoPeriodo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoPeriodo=jmenuBarDetalleAuxiliarTipoPeriodo;
		final JToolBar jTtoolBarDetalleTipoPeriodo=jTtoolBarDetalleAuxiliarTipoPeriodo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPeriodo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPeriodo;
			processRunnable.jTableDatos=jTableDatosTipoPeriodo;
			processRunnable.jPanelCampos=jPanelCamposTipoPeriodo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPeriodo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPeriodo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPeriodo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPeriodo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPeriodo;
			processRunnable.jTtoolBar=jTtoolBarTipoPeriodo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPeriodo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoPeriodo ,jPanelParametrosReportesTipoPeriodo, jTableDatosTipoPeriodo,/*jScrollPanelDatosTipoPeriodo,*/jPanelCamposTipoPeriodo,jPanelPaginacionTipoPeriodo, /*jScrollPanelDatosEdicionTipoPeriodo,*/ jPanelAccionesTipoPeriodo,jPanelAccionesFormularioTipoPeriodo,jmenuBarTipoPeriodo,jmenuBarDetalleTipoPeriodo,jTtoolBarTipoPeriodo,jTtoolBarDetalleTipoPeriodo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoPeriodo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoPeriodo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoPeriodo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoPeriodo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoPeriodo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoPeriodo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoPeriodo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoPeriodo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoPeriodo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoperiodoConstantesFunciones.getsFinalQueryTipoPeriodo();
		String  finalQueryPaginacionTodos=this.tipoperiodoConstantesFunciones.getsFinalQueryTipoPeriodo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoPeriodoConstantesFunciones.getArrayColumnasGlobalesNoTipoPeriodo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoPeriodoConstantesFunciones.getArrayColumnasGlobalesTipoPeriodo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoPeriodoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoperiodosEliminados= new ArrayList<TipoPeriodo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoPeriodo();
		
				///*TipoPeriodoSessionBean*/this.tipoperiodoSessionBean=new TipoPeriodoSessionBean();
			
			if(this.tipoperiodoSessionBean==null) {
				this.tipoperiodoSessionBean=new TipoPeriodoSessionBean();
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
					this.iNumeroPaginacion=TipoPeriodoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoPeriodoConstantesFunciones.getClassesForeignKeysOfTipoPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoperiodo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoperiodosAux= new ArrayList<TipoPeriodo>();
			
				
			tipoperiodoLogic.setDatosCliente(this.datosCliente);
			tipoperiodoLogic.setDatosDeep(this.datosDeep);
			tipoperiodoLogic.setIsConDeep(true);
			
			
			tipoperiodoLogic.getTipoPeriodoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoperiodoLogic.getTodosTipoPeriodos(finalQueryGlobal,pagination);
					
					//tipoperiodoLogic.getTodosTipoPeriodosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoperiodoLogic.getTipoPeriodos()==null|| tipoperiodoLogic.getTipoPeriodos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoperiodosAux= new ArrayList<TipoPeriodo>();
							tipoperiodosAux.addAll(tipoperiodoLogic.getTipoPeriodos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoperiodosAux= new ArrayList<TipoPeriodo>();
							tipoperiodosAux.addAll(tipoperiodos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoperiodoLogic.getTodosTipoPeriodos(finalQueryGlobal+"",this.pagination);												
							
							//tipoperiodoLogic.getTodosTipoPeriodosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoPeriodos("Todos",tipoperiodoLogic.getTipoPeriodos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoperiodoLogic.setTipoPeriodos(new ArrayList<TipoPeriodo>());					
							tipoperiodoLogic.getTipoPeriodos().addAll(tipoperiodosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoperiodos=new ArrayList<TipoPeriodo>();
							tipoperiodos.addAll(tipoperiodosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoPeriodo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoPeriodo=this.idActual;
				
				} else if(this.idTipoPeriodoActual!=null && this.idTipoPeriodoActual!=0L) {
					idTipoPeriodo=idTipoPeriodoActual;
				}
				
					
				this.sDetalleReporte=TipoPeriodoConstantesFunciones.getDetalleIndicePorId(idTipoPeriodo);
				
				this.tipoperiodos=new ArrayList<TipoPeriodo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoperiodoLogic.getEntity(idTipoPeriodo);
					
					//tipoperiodoLogic.getEntityWithConnection(idTipoPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoperiodoLogic.setTipoPeriodos(new ArrayList<TipoPeriodo>());
					tipoperiodoLogic.getTipoPeriodos().add(tipoperiodoLogic.getTipoPeriodo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoperiodos=new ArrayList<TipoPeriodo>();
					this.tipoperiodos.add(tipoperiodo);
				}
				
				if(tipoperiodoLogic.getTipoPeriodo()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoPeriodo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoPeriodo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoperiodoLogic.getTipoPeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoperiodos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoperiodoLogic.getTipoPeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoperiodos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoPeriodo tipoperiodo) {
		Boolean permite=true;
		
		if(this.tipoperiodo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoPeriodoConstantesFunciones.getOrderByListaTipoPeriodo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoPeriodoConstantesFunciones.getOrderByListaTipoPeriodo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPeriodo tipoperiodo:tipoperiodoLogic.getTipoPeriodos()) {
				if(tipoperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoperiodoTotales=tipoperiodo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPeriodo tipoperiodo:this.tipoperiodos) {
				if(tipoperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoperiodoTotales=tipoperiodo;
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
			this.tipoperiodoAux=new TipoPeriodo();
			this.tipoperiodoAux.setsType(Constantes2.S_TOTALES);
			this.tipoperiodoAux.setIsNew(false);
			this.tipoperiodoAux.setIsChanged(false);
			this.tipoperiodoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoPeriodoConstantesFunciones.TotalizarValoresFilaTipoPeriodo(this.tipoperiodoLogic.getTipoPeriodos(),this.tipoperiodoAux);
				
				this.tipoperiodoLogic.getTipoPeriodos().add(this.tipoperiodoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoPeriodoConstantesFunciones.TotalizarValoresFilaTipoPeriodo(this.tipoperiodos,this.tipoperiodoAux);
				
				this.tipoperiodos.add(this.tipoperiodoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoperiodoTotales=new TipoPeriodo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoperiodoLogic.getTipoPeriodos().remove(tipoperiodoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoperiodos.remove(tipoperiodoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoperiodoTotales=new TipoPeriodo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPeriodo tipoperiodo:tipoperiodoLogic.getTipoPeriodos()) {
				if(tipoperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoperiodoTotales=tipoperiodo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPeriodoConstantesFunciones.TotalizarValoresFilaTipoPeriodo(this.tipoperiodoLogic.getTipoPeriodos(),tipoperiodoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPeriodo tipoperiodo:this.tipoperiodos) {
				if(tipoperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoperiodoTotales=tipoperiodo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPeriodoConstantesFunciones.TotalizarValoresFilaTipoPeriodo(this.tipoperiodos,tipoperiodoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoPeriodo() {
		this.isPermisoTodoTipoPeriodo=false;
		this.isPermisoNuevoTipoPeriodo=false;
		this.isPermisoActualizarTipoPeriodo=false;
		this.isPermisoActualizarOriginalTipoPeriodo=false;
		this.isPermisoEliminarTipoPeriodo=false;
		this.isPermisoGuardarCambiosTipoPeriodo=false;
		this.isPermisoConsultaTipoPeriodo=false;
		this.isPermisoBusquedaTipoPeriodo=false;
		this.isPermisoReporteTipoPeriodo=false;		
		this.isPermisoOrdenTipoPeriodo=false;		
		this.isPermisoPaginacionMedioTipoPeriodo=false;		
		this.isPermisoPaginacionAltoTipoPeriodo=false;
		this.isPermisoPaginacionTodoTipoPeriodo=false;
		this.isPermisoCopiarTipoPeriodo=false;		
		this.isPermisoVerFormTipoPeriodo=false;		
		this.isPermisoDuplicarTipoPeriodo=false;		
		this.isPermisoOrdenTipoPeriodo=false;		
	}
	
	public void setPermisosUsuarioTipoPeriodo(Boolean isPermiso) {
		this.isPermisoTodoTipoPeriodo=isPermiso;
		this.isPermisoNuevoTipoPeriodo=isPermiso;
		this.isPermisoActualizarTipoPeriodo=isPermiso;
		this.isPermisoActualizarOriginalTipoPeriodo=isPermiso;
		this.isPermisoEliminarTipoPeriodo=isPermiso;
		this.isPermisoGuardarCambiosTipoPeriodo=isPermiso;
		this.isPermisoConsultaTipoPeriodo=isPermiso;
		this.isPermisoBusquedaTipoPeriodo=isPermiso;
		this.isPermisoReporteTipoPeriodo=isPermiso;
		this.isPermisoOrdenTipoPeriodo=isPermiso;		
		this.isPermisoPaginacionMedioTipoPeriodo=isPermiso;		
		this.isPermisoPaginacionAltoTipoPeriodo=isPermiso;		
		this.isPermisoPaginacionTodoTipoPeriodo=isPermiso;		
		this.isPermisoCopiarTipoPeriodo=isPermiso;		
		this.isPermisoVerFormTipoPeriodo=isPermiso;		
		this.isPermisoDuplicarTipoPeriodo=isPermiso;
		this.isPermisoOrdenTipoPeriodo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoPeriodo(Boolean isPermiso) {
		//this.isPermisoTodoTipoPeriodo=isPermiso;
		this.isPermisoNuevoTipoPeriodo=isPermiso;
		this.isPermisoActualizarTipoPeriodo=isPermiso;
		this.isPermisoActualizarOriginalTipoPeriodo=isPermiso;
		this.isPermisoEliminarTipoPeriodo=isPermiso;
		this.isPermisoGuardarCambiosTipoPeriodo=isPermiso;
		//this.isPermisoConsultaTipoPeriodo=isPermiso;
		//this.isPermisoBusquedaTipoPeriodo=isPermiso;
		//this.isPermisoReporteTipoPeriodo=isPermiso;
		//this.isPermisoOrdenTipoPeriodo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoPeriodo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoPeriodo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoPeriodo=isPermiso;		
		//this.isPermisoCopiarTipoPeriodo=isPermiso;		
		//this.isPermisoDuplicarTipoPeriodo=isPermiso;
		//this.isPermisoOrdenTipoPeriodo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoPeriodoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoPeriodo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoPeriodoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoPeriodoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoPeriodoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoPeriodoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoPeriodo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoPeriodoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoPeriodo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoPeriodo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoPeriodo=this.isPermisoActualizarTipoPeriodo;
			this.isPermisoEliminarTipoPeriodo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoPeriodo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoPeriodo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoPeriodo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoPeriodo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoPeriodo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPeriodo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoPeriodo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoPeriodo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoPeriodo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoPeriodo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoPeriodo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoPeriodo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPeriodo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoPeriodo.setToolTipText(this.jTableDatosTipoPeriodo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoPeriodo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoPeriodo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoPeriodo() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoPeriodoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoPeriodoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoPeriodoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoPeriodoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoPeriodoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoPeriodo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoPeriodo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoPeriodo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoPeriodo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPeriodo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoPeriodo(TipoPeriodo tipoperiodo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoPeriodo(TipoPeriodo tipoperiodo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoPeriodo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPeriodo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoPeriodo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoPeriodo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoPeriodo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoPeriodo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoPeriodo(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoPeriodo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoPeriodoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoPeriodoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoPeriodoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoperiodoSessionBean=new TipoPeriodoSessionBean(); 
		this.tipoperiodoConstantesFunciones=new TipoPeriodoConstantesFunciones(); 
		this.tipoperiodoBean=new TipoPeriodo();//(this.tipoperiodoConstantesFunciones); 		
		this.tipoperiodoReturnGeneral=new TipoPeriodoParameterReturnGeneral(); 
		
		this.tipoperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoPeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoPeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoPeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoPeriodo(true);
			
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
			
			this.tipoperiodoConstantesFunciones=new TipoPeriodoConstantesFunciones(); 
			this.tipoperiodoBean=new TipoPeriodo();//this.tipoperiodoConstantesFunciones); 			
			this.tipoperiodoReturnGeneral=new TipoPeriodoParameterReturnGeneral(); 
		
			TipoPeriodoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Periodo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoperiodo=new TipoPeriodo();
			this.tipoperiodos = new ArrayList<TipoPeriodo>();
			this.tipoperiodosAux = new ArrayList<TipoPeriodo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic=new TipoPeriodoLogic();
				this.tipoperiodoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoPeriodo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoPeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPeriodo);	
					}
					
					if(this.jInternalFrameImportacionTipoPeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPeriodo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoPeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoPeriodo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPeriodo);
				this.jInternalFrameDetalleFormTipoPeriodo.setVisible(false);
				this.jInternalFrameDetalleFormTipoPeriodo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoPeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPeriodo);
					this.jInternalFrameReporteDinamicoTipoPeriodo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoPeriodo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoPeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoPeriodo);
					this.jInternalFrameImportacionTipoPeriodo.setVisible(false);
					this.jInternalFrameImportacionTipoPeriodo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoPeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoPeriodo);
					this.jInternalFrameOrderByTipoPeriodo.setVisible(false);
					this.jInternalFrameOrderByTipoPeriodo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoPeriodoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoPeriodoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoperiodoReturnGeneral=new TipoPeriodoParameterReturnGeneral();
			
			this.tipoperiodoParameterGeneral=new TipoPeriodoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoperiodoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPeriodoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoperiodoSessionBean.getEsGuardarRelacionado(),this.tipoperiodoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPeriodoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoperiodoSessionBean.getEsGuardarRelacionado(),this.tipoperiodoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoPeriodo=false;
			this.isVisibilidadCeldaDuplicarTipoPeriodo=true;
			this.isVisibilidadCeldaCopiarTipoPeriodo=true;
			this.isVisibilidadCeldaVerFormTipoPeriodo=true;
			this.isVisibilidadCeldaOrdenTipoPeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=false;
			this.isVisibilidadCeldaModificarTipoPeriodo=false;
			this.isVisibilidadCeldaActualizarTipoPeriodo=false;
			this.isVisibilidadCeldaEliminarTipoPeriodo=false;
			this.isVisibilidadCeldaCancelarTipoPeriodo=false;
			this.isVisibilidadCeldaGuardarTipoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPeriodo=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoPeriodo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoPeriodo(false);
			
			this.setPermisosUsuarioTipoPeriodo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoperiodoSessionBean.getEsGuardarRelacionado() && this.tipoperiodoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoPeriodoClasesRelacionadas();
			}
			
			if(this.tipoperiodoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoPeriodoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoPeriodoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoPeriodo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoPeriodo();
			}
			
			if(!this.isPermisoBusquedaTipoPeriodo) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoPeriodo,this.isPermisoPaginacionMedioTipoPeriodo,this.isPermisoPaginacionTodoTipoPeriodo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoPeriodoConstantesFunciones.getTiposSeleccionarTipoPeriodo());
				
				this.tiposColumnasSelect=TipoPeriodoConstantesFunciones.getTiposSeleccionarTipoPeriodo(true);
				
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
			//if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoPeriodo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoPeriodo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoPeriodo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPeriodo() ;
			
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
				tipoperiodoImplementable= (TipoPeriodoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPeriodoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoperiodoImplementableHome= (TipoPeriodoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPeriodoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoperiodos= new ArrayList<TipoPeriodo>();
			this.tipoperiodosEliminados= new ArrayList<TipoPeriodo>();
						
			this.isEsNuevoTipoPeriodo=false;
			this.esParaAccionDesdeFormularioTipoPeriodo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoPeriodo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoPeriodo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoPeriodoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoPeriodo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoPeriodo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoPeriodo();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoPeriodo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoPeriodo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoPeriodo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoPeriodo")) {
				iIndex=this.jInternalFrameDetalleFormTipoPeriodo.jTabbedPaneRelacionesTipoPeriodo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoPeriodo.jTabbedPaneRelacionesTipoPeriodo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoPeriodo();	
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
	
	public void cargarCombosForeignKeyTipoPeriodo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoPeriodo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoPeriodo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoPeriodoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoPeriodo();
		
		this.cargarCombosFrameForeignKeyTipoPeriodo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoPeriodo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoPeriodo();
		}
	}
	
	
	
	public void jButtonNuevoTipoPeriodoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoperiodoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			
			
			if(jTableDatosTipoPeriodo.getRowCount()>=1) {
				jTableDatosTipoPeriodo.removeRowSelectionInterval(0, jTableDatosTipoPeriodo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoPeriodo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoPeriodo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoPeriodo(true);			
			//this.tipoperiodo=new TipoPeriodo();
			//this.tipoperiodo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPeriodo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPeriodo() ;
			
			if(TipoPeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPeriodo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoperiodo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);				
			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			
			if(this.tipoperiodoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoPeriodo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoPeriodoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoPeriodo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoPeriodo.getSelectedRows().length;			
			}
			
			tipoperiodosSeleccionados=this.getTipoPeriodosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoPeriodo--;			
				//TipoPeriodo tipoperiodoAux= new TipoPeriodo();			
				//tipoperiodoAux.setId(this.iIdNuevoTipoPeriodo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoPeriodo tipoperiodoOrigen=new TipoPeriodo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoPeriodo tipoperiodoOrigen : tipoperiodosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoperiodoOrigen =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoperiodoOrigen =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoPeriodo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoperiodo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoPeriodo(tipoperiodoOrigen,this.tipoperiodo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(this.tipoperiodo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoperiodoLogic.getTipoPeriodos().add(this.tipoperiodoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoperiodos.add(this.tipoperiodoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoPeriodo(false);
				
				this.jTableDatosTipoPeriodo.setRowSelectionInterval(this.getIndiceNuevoTipoPeriodo(), this.getIndiceNuevoTipoPeriodo());
				
				int iLastRow =  this.jTableDatosTipoPeriodo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPeriodo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPeriodo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPeriodo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();									
		
			TipoPeriodo tipoperiodoOrigen=new TipoPeriodo();
			TipoPeriodo tipoperiodoDestino=new TipoPeriodo();
				
			tipoperiodosSeleccionados=this.getTipoPeriodosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoPeriodo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoperiodosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoPeriodo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoperiodoOrigen =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoperiodoOrigen =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoperiodoDestino =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoperiodoDestino =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoperiodoOrigen =tipoperiodosSeleccionados.get(0);
				tipoperiodoDestino =tipoperiodosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoPeriodo(tipoperiodoOrigen,tipoperiodoDestino,true,false);
				
				tipoperiodoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoperiodoDestino,tipoperiodoLogic.getTipoPeriodos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoperiodoDestino,tipoperiodos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoPeriodo(false);
				
				//this.jTableDatosTipoPeriodo.setRowSelectionInterval(this.getIndiceNuevoTipoPeriodo(), this.getIndiceNuevoTipoPeriodo());
				
				int iLastRow =  this.jTableDatosTipoPeriodo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPeriodo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPeriodo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPeriodo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoPeriodo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoPeriodo.isVisible();
			
			
			this.jPanelParametrosReportesTipoPeriodo.setVisible(!isVisible);
			this.jPanelPaginacionTipoPeriodo.setVisible(!isVisible);
			this.jPanelAccionesTipoPeriodo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoPeriodo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoPeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoPeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoPeriodo();
			
			this.abrirFrameOrderByTipoPeriodo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoPeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoPeriodo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPeriodo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoPeriodo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoPeriodo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoPeriodo.setSize(this.jInternalFrameDetalleFormTipoPeriodo.iWidthFormulario,this.jInternalFrameDetalleFormTipoPeriodo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoPeriodo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoPeriodo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoPeriodo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoPeriodo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoPeriodo.jContentPaneDetalleTipoPeriodo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoPeriodo.jTabbedPaneRelacionesTipoPeriodo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoPeriodo.jContentPaneDetalleTipoPeriodo.getWidth(),TipoPeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPeriodo.jTabbedPaneRelacionesTipoPeriodo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoPeriodo.jContentPaneDetalleTipoPeriodo.getWidth(),TipoPeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPeriodo.jTabbedPaneRelacionesTipoPeriodo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoPeriodo.jContentPaneDetalleTipoPeriodo.getWidth(),TipoPeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoPeriodo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoPeriodo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoPeriodo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoPeriodo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPeriodo,false,this);
				} else {
					this.jInternalFrameOrderByTipoPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPeriodo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoPeriodo);
				this.jInternalFrameOrderByTipoPeriodo.setVisible(false);
				this.jInternalFrameOrderByTipoPeriodo.setSelected(false);
				
				this.jInternalFrameOrderByTipoPeriodo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPeriodo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoPeriodo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoPeriodo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoPeriodo==null) {
				
				this.jInternalFrameImportacionTipoPeriodo=new ImportacionJInternalFrame(TipoPeriodoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPeriodo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoPeriodo);
				this.jInternalFrameImportacionTipoPeriodo.setVisible(false);
				this.jInternalFrameImportacionTipoPeriodo.setSelected(false);


				this.jInternalFrameImportacionTipoPeriodo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPeriodo"));
				this.jInternalFrameImportacionTipoPeriodo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPeriodo"));
				this.jInternalFrameImportacionTipoPeriodo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPeriodo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoPeriodo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoPeriodo==null) {
				this.jInternalFrameReporteDinamicoTipoPeriodo=new ReporteDinamicoJInternalFrame(TipoPeriodoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPeriodo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPeriodo);
				this.jInternalFrameReporteDinamicoTipoPeriodo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoPeriodo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoPeriodo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPeriodo"));
				this.jInternalFrameReporteDinamicoTipoPeriodo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPeriodo"));
				this.jInternalFrameReporteDinamicoTipoPeriodo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPeriodo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPeriodo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoPeriodo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPeriodo);
			
	       	this.jInternalFrameDetalleFormTipoPeriodo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoPeriodo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoPeriodo.dispose();
			//this.jInternalFrameDetalleFormTipoPeriodo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoPeriodo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoPeriodo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoPeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoPeriodo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoPeriodo.setVisible(true);
	        this.jInternalFrameImportacionTipoPeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoPeriodo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoPeriodo.setVisible(true);
	        this.jInternalFrameOrderByTipoPeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoPeriodo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoPeriodo.setVisible(false);
	        this.jInternalFrameOrderByTipoPeriodo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoPeriodo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoPeriodo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoPeriodo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoPeriodo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoPeriodo.setVisible(false);
	        this.jInternalFrameImportacionTipoPeriodo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoPeriodo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoPeriodo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoPeriodo(true);
			//this.isEsNuevoTipoPeriodo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodo =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoperiodo =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoPeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPeriodo(false) ;
			
			if(tipoperiodoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoPeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPeriodo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPeriodo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoPeriodoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodo =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoperiodo =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoPeriodo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoPeriodo(true);
			//this.isEsNuevoTipoPeriodo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodo =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoperiodo =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoperiodo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoPeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoPeriodo(false) ;
			
			if(TipoPeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPeriodo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPeriodo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoPeriodo(false);
			
			//if(!this.isEsNuevoTipoPeriodo) {								
				int intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodo =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoperiodo =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoPeriodo(this.tipoperiodo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(this.tipoperiodo);
				
			}
			
			if(this.permiteMantenimiento(this.tipoperiodo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoPeriodo=true;
					this.inicializarActualizarBindingTablaTipoPeriodo(false);
					this.isEsNuevoTipoPeriodo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoPeriodo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoPeriodo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPeriodo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPeriodo(false);
				
				this.habilitarDeshabilitarControlesTipoPeriodo(false);
			
												
				
				if(TipoPeriodoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoPeriodo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoPeriodoActionPerformed(evt,tipoperiodoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoPeriodo(this.tipoperiodo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoPeriodo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoperiodoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoperiodo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoPeriodo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPeriodo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodo =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				this.tipoperiodo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoperiodo =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				this.tipoperiodo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoperiodo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoPeriodoModel) this.jTableDatosTipoPeriodo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoPeriodo=true;
				this.inicializarActualizarBindingTablaTipoPeriodo(false);
				this.isEsNuevoTipoPeriodo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPeriodo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPeriodo(false);
				
				this.habilitarDeshabilitarControlesTipoPeriodo(false);
				
				
				
				if(TipoPeriodoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoPeriodo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoPeriodo.getRowCount()>=1) {
				jTableDatosTipoPeriodo.removeRowSelectionInterval(0, jTableDatosTipoPeriodo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoPeriodo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoPeriodo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPeriodo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPeriodo(false) ;
			
			this.isEsNuevoTipoPeriodo=false;
			
			if(TipoPeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoPeriodo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoPeriodo(false);
				
				//SI ES MANUAL
				if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoPeriodo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoPeriodo--;			
			//TipoPeriodo tipoperiodoAux= new TipoPeriodo();			
			//tipoperiodoAux.setId(this.iIdNuevoTipoPeriodo);
			
			if(this.jInternalFrameDetalleFormTipoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoPeriodo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(this.tipoperiodo);
			
			this.tipoperiodo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoperiodoLogic.getTipoPeriodos().add(this.tipoperiodoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoperiodos.add(this.tipoperiodoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoPeriodo(false);
			
			this.jTableDatosTipoPeriodo.setRowSelectionInterval(this.getIndiceNuevoTipoPeriodo(), this.getIndiceNuevoTipoPeriodo());
			
			int iLastRow =  this.jTableDatosTipoPeriodo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoPeriodo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoPeriodo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoPeriodo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoPeriodo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPeriodo(false);
			
			//SI ES MANUAL
			if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPeriodo();
			}
			
			//this.abrirFrameTreeTipoPeriodo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo PeriodoS ?", "MANTENIMIENTO DE Tipo Periodo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoPeriodo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoPeriodo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoperiodoReturnGeneral=tipoperiodoLogic.procesarImportacionTipoPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoperiodoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoPeriodoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoPeriodo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoPeriodo.setFileImportacion(this.jInternalFrameImportacionTipoPeriodo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoPeriodo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoPeriodo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoPeriodo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoPeriodo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();		

		tipoperiodosSeleccionados=this.getTipoPeriodosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPeriodo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPeriodo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoPeriodoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoPeriodoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoPeriodos("Todos",tipoperiodosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPeriodoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPeriodoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoPeriodo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPeriodo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPeriodo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoPeriodoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoPeriodoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoPeriodo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoPeriodoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoPeriodoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoPeriodo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPeriodo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPeriodoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoPeriodoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();		
		
		tipoperiodosSeleccionados=this.getTipoPeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoperiodo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoPeriodos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoPeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoPeriodoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPeriodoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoPeriodo tipoperiodo:tipoperiodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoperiodo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPeriodoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPeriodoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoPeriodo tipoperiodo:tipoperiodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoperiodo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoPeriodo(row);				
			//	iRow++;
			//}				
			
			//for(TipoPeriodo tipoperiodoAux:tipoperiodosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoPeriodo(tipoperiodoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Periodo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPeriodo(false);
			
			//SI ES MANUAL
			if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPeriodo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPeriodo(false);
			
			//SI ES MANUAL
			if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPeriodo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPeriodo(false);
			
			//SI ES MANUAL
			if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPeriodo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoPeriodo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoPeriodo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoPeriodo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoPeriodo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoPeriodo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoPeriodo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoPeriodo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoPeriodo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoPeriodo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoPeriodo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoPeriodo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoPeriodo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoPeriodo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoPeriodo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPeriodo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoPeriodo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoPeriodoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoPeriodo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoPeriodo();
		
		this.inicializarActualizarBindingBotonesManualTipoPeriodo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPeriodo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPeriodo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPeriodo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPeriodo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoPeriodo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoPeriodo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoPeriodo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoPeriodo.jCheckBoxPostAccionNuevoTipoPeriodo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoPeriodo.jCheckBoxPostAccionSinCerrarTipoPeriodo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoPeriodo.jCheckBoxPostAccionSinMensajeTipoPeriodo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoPeriodo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoPeriodo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoPeriodo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
				this.jInternalFrameDetalleFormTipoPeriodo.jCheckBoxPostAccionNuevoTipoPeriodo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoPeriodo.jCheckBoxPostAccionSinCerrarTipoPeriodo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoPeriodo.jCheckBoxPostAccionSinMensajeTipoPeriodo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoPeriodo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoPeriodo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoPeriodo.jComboBoxTiposAccionesFormularioTipoPeriodo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoPeriodo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoPeriodo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPeriodo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoPeriodo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoPeriodo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoPeriodo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoPeriodo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoPeriodo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPeriodo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoPeriodo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoPeriodo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoPeriodo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPeriodo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoPeriodo() throws Exception {
		try	{
			if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPeriodo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPeriodo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoPeriodo.jComboBoxTiposAccionesFormularioTipoPeriodo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoPeriodo.jComboBoxTiposAccionesFormularioTipoPeriodo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPeriodo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoPeriodo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoPeriodo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoPeriodo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoPeriodo.addItem(reporte);
			}
			
			
			if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoPeriodo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoPeriodo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoPeriodo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoPeriodo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoPeriodo.jComboBoxTiposAccionesFormularioTipoPeriodo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoPeriodo.jComboBoxTiposAccionesFormularioTipoPeriodo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoPeriodo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoPeriodo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPeriodo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPeriodo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPeriodo!=null) {
				this.jInternalFrameReporteDinamicoTipoPeriodo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPeriodo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPeriodo!=null) {
				this.jInternalFrameReporteDinamicoTipoPeriodo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPeriodo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoPeriodo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoPeriodo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPeriodo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPeriodo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoPeriodo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPeriodo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPeriodo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoPeriodo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoPeriodo(Boolean esInicializar) throws Exception {				
		if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPeriodo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoPeriodo() throws Exception {
		this.inicializarActualizarBindingTablaTipoPeriodo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoPeriodo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoPeriodoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoPeriodoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoPeriodoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPeriodoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoPeriodoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoPeriodoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoPeriodo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoperiodoLogic.getTipoPeriodos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoperiodos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoPeriodo.setModel(new TipoPeriodoModel(this.tipoperiodoLogic.getTipoPeriodos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoPeriodo.setModel(new TipoPeriodoModel(this.tipoperiodos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoPeriodo!=null && this.jInternalFrameOrderByTipoPeriodo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoPeriodo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPeriodo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoPeriodoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO,tipoperiodoConstantesFunciones.resaltarSeleccionarTipoPeriodo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO,tipoperiodoConstantesFunciones.resaltarSeleccionarTipoPeriodo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPeriodo,TipoPeriodoConstantesFunciones.LABEL_ID));

		if(this.tipoperiodoConstantesFunciones.mostraridTipoPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPeriodoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoperiodoConstantesFunciones.resaltaridTipoPeriodo,this.tipoperiodoConstantesFunciones.activaridTipoPeriodo,this,true,"idTipoPeriodo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoperiodoConstantesFunciones.resaltaridTipoPeriodo,this.tipoperiodoConstantesFunciones.activaridTipoPeriodo,this,true,"idTipoPeriodo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPeriodo,TipoPeriodoConstantesFunciones.LABEL_CODIGO));

		if(this.tipoperiodoConstantesFunciones.mostrarcodigoTipoPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPeriodoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoperiodoConstantesFunciones.resaltarcodigoTipoPeriodo,this.tipoperiodoConstantesFunciones.activarcodigoTipoPeriodo,this,true,"codigoTipoPeriodo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoperiodoConstantesFunciones.resaltarcodigoTipoPeriodo,this.tipoperiodoConstantesFunciones.activarcodigoTipoPeriodo,this,true,"codigoTipoPeriodo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPeriodo,TipoPeriodoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoperiodoConstantesFunciones.mostrarnombreTipoPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPeriodoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoperiodoConstantesFunciones.resaltarnombreTipoPeriodo,this.tipoperiodoConstantesFunciones.activarnombreTipoPeriodo,this,true,"nombreTipoPeriodo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoperiodoConstantesFunciones.resaltarnombreTipoPeriodo,this.tipoperiodoConstantesFunciones.activarnombreTipoPeriodo,this,true,"nombreTipoPeriodo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoperiodoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoperiodoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPeriodo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoperiodoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoperiodoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPeriodo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoPeriodo && this.isPermisoGuardarCambiosTipoPeriodo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoperiodoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoperiodoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoPeriodo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoPeriodo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPeriodo && this.isPermisoGuardarCambiosTipoPeriodo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPeriodo && this.isPermisoGuardarCambiosTipoPeriodo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoPeriodo.moveColumn(this.jTableDatosTipoPeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoPeriodo.moveColumn(this.jTableDatosTipoPeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoPeriodo.moveColumn(this.jTableDatosTipoPeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoPeriodo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoPeriodo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoPeriodo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoPeriodo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoPeriodo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoPeriodo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoPeriodo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoPeriodo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoperiodoLogic.getTipoPeriodos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoperiodos.size()-1;
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
		//this.jTableDatosTipoPeriodo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoPeriodo();
			
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
				
				//this.isEsNuevoTipoPeriodo=false;
					
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			
				if(this.tipoperiodoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoPeriodo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPeriodo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPeriodo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodo =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoperiodo =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoperiodo.getsType().equals("DUPLICADO")
				   || this.tipoperiodo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoPeriodo=true;
				
				} else {
					this.isEsNuevoTipoPeriodo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoperiodo.getId()>=0 && !this.tipoperiodo.getIsNew()) {						
						this.isEsNuevoTipoPeriodo=false;
						
					} else {
						this.isEsNuevoTipoPeriodo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoPeriodo(esRelaciones);						
				
				this.seleccionarTipoPeriodo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoperiodo.getId()<0) {
					this.isEsNuevoTipoPeriodo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoPeriodo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoPeriodo(evt,rowIndex);
				}	
				
				if(this.tipoperiodoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoPeriodo: " + this.dDif); 
					}
				}								
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoPeriodo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoperiodo)) {
					if(this.tipoperiodo.getId()>0) {
						this.tipoperiodo.setIsDeleted(true);
						
						this.tipoperiodosEliminados.add(this.tipoperiodo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoperiodoLogic.getTipoPeriodos().remove(this.tipoperiodo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoperiodos.remove(this.tipoperiodo);				
					}
					
					
					((TipoPeriodoModel) this.jTableDatosTipoPeriodo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPeriodo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoPeriodo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoPeriodo) {
			
			if(this.jInternalFrameDetalleFormTipoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPeriodo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPeriodo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodo =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoperiodo =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoPeriodo(this.tipoperiodo);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoPeriodo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoPeriodo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPeriodo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPeriodo(TipoPeriodo tipoperiodo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoPeriodo(tipoperiodo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPeriodo(TipoPeriodo tipoperiodo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoPeriodo(tipoperiodo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoPeriodo(tipoperiodo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoPeriodo(tipoperiodo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoPeriodo(TipoPeriodo tipoperiodo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldidTipoPeriodo.setText(tipoperiodo.getId().toString());
			this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldcodigoTipoPeriodo.setText(tipoperiodo.getcodigo());
			this.jInternalFrameDetalleFormTipoPeriodo.jTextAreanombreTipoPeriodo.setText(tipoperiodo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoPeriodo tipoperiodoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoperiodoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoPeriodo tipoperiodoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoperiodoLocal=this.tipoperiodo;
			} else {
				tipoperiodoLocal=this.tipoperiodoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoperiodoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoPeriodo(tipoperiodoLocal,true);
					
					if(tipoperiodoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoperiodoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoperiodoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoPeriodo(TipoPeriodo tipoperiodo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPeriodo(tipoperiodo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(tipoperiodo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPeriodo(TipoPeriodo tipoperiodo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPeriodo(tipoperiodo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPeriodo(TipoPeriodo tipoperiodo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldidTipoPeriodo.getText()==null || this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldidTipoPeriodo.getText()=="" || this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldidTipoPeriodo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldidTipoPeriodo.setText("0");
			}

			if(conColumnasBase) {tipoperiodo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldidTipoPeriodo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPeriodoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPeriodo.jLabelIdTipoPeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoperiodo.setcodigo(this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldcodigoTipoPeriodo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPeriodoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPeriodo.jLabelcodigoTipoPeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoperiodo.setnombre(this.jInternalFrameDetalleFormTipoPeriodo.jTextAreanombreTipoPeriodo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPeriodoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPeriodo.jLabelnombreTipoPeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPeriodo(TipoPeriodo tipoperiodoBean,TipoPeriodo tipoperiodo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoPeriodo(TipoPeriodo tipoperiodoOrigen,TipoPeriodo tipoperiodo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoperiodoOrigen.getId()!=null && !tipoperiodoOrigen.getId().equals(0L))) {tipoperiodo.setId(tipoperiodoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoperiodoOrigen.getcodigo()!=null && !tipoperiodoOrigen.getcodigo().equals(""))) {tipoperiodo.setcodigo(tipoperiodoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoperiodoOrigen.getnombre()!=null && !tipoperiodoOrigen.getnombre().equals(""))) {tipoperiodo.setnombre(tipoperiodoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPeriodo(TipoPeriodo tipoperiodo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldidTipoPeriodo.setText(tipoperiodo.getId().toString());
			this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldcodigoTipoPeriodo.setText(tipoperiodo.getcodigo());
			this.jInternalFrameDetalleFormTipoPeriodo.jTextAreanombreTipoPeriodo.setText(tipoperiodo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPeriodo(TipoPeriodoBean tipoperiodoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldidTipoPeriodo.setText(tipoperiodoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldcodigoTipoPeriodo.setText(tipoperiodoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoPeriodo.jTextAreanombreTipoPeriodo.setText(tipoperiodoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoPeriodo(TipoPeriodoParameterReturnGeneral tipoperiodoReturnGeneral,TipoPeriodoBean tipoperiodoBean,Boolean conDefault) throws Exception { 
		try {
			TipoPeriodo tipoperiodoLocal=new TipoPeriodo();
			
			tipoperiodoLocal=tipoperiodoReturnGeneral.getTipoPeriodo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoperiodoLocal.getId()!=null && !tipoperiodoLocal.getId().equals(0L))) {tipoperiodoBean.setId(tipoperiodoLocal.getId());}}
			if(conDefault || (!conDefault && tipoperiodoLocal.getcodigo()!=null && !tipoperiodoLocal.getcodigo().equals(""))) {tipoperiodoBean.setcodigo(tipoperiodoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoperiodoLocal.getnombre()!=null && !tipoperiodoLocal.getnombre().equals(""))) {tipoperiodoBean.setnombre(tipoperiodoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoPeriodoGenerico(Long idTipoPeriodoSeleccionado,JComboBox jComboBoxTipoPeriodo,List<TipoPeriodo> tipoperiodosLocal)throws Exception {
		try {
			TipoPeriodo  tipoperiodoTemp=null;

			for(TipoPeriodo tipoperiodoAux:tipoperiodosLocal) {
				if(tipoperiodoAux.getId()!=null && tipoperiodoAux.getId().equals(idTipoPeriodoSeleccionado)) {
					tipoperiodoTemp=tipoperiodoAux;
					break;
				}
			}

			jComboBoxTipoPeriodo.setSelectedItem(tipoperiodoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoPeriodoGenerico(JComboBox jComboBoxTipoPeriodo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPeriodo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoPeriodo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPeriodo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoPeriodo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoperiodo=(TipoPeriodo) tipoperiodoLogic.getTipoPeriodos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoperiodo =(TipoPeriodo) tipoperiodos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoPeriodo tipoperiodoRow=new TipoPeriodo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoperiodoRow=(TipoPeriodo) tipoperiodoLogic.getTipoPeriodos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoperiodoRow=(TipoPeriodo) tipoperiodos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoPeriodo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoPeriodo.setVisible((this.isVisibilidadCeldaNuevoTipoPeriodo && this.isPermisoNuevoTipoPeriodo));			
			this.jButtonDuplicarTipoPeriodo.setVisible((this.isVisibilidadCeldaDuplicarTipoPeriodo && this.isPermisoDuplicarTipoPeriodo));			
			this.jButtonCopiarTipoPeriodo.setVisible((this.isVisibilidadCeldaCopiarTipoPeriodo && this.isPermisoCopiarTipoPeriodo));
			this.jButtonVerFormTipoPeriodo.setVisible((this.isVisibilidadCeldaVerFormTipoPeriodo && this.isPermisoVerFormTipoPeriodo));
			
			this.jButtonAbrirOrderByTipoPeriodo.setVisible((this.isVisibilidadCeldaOrdenTipoPeriodo && this.isPermisoOrdenTipoPeriodo));			
			
			this.jButtonNuevoRelacionesTipoPeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo && this.isPermisoNuevoTipoPeriodo));			
			this.jButtonNuevoGuardarCambiosTipoPeriodo.setVisible((this.isVisibilidadCeldaNuevoTipoPeriodo && this.isPermisoNuevoTipoPeriodo && this.isPermisoGuardarCambiosTipoPeriodo));
			
			if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonModificarTipoPeriodo.setVisible((this.isVisibilidadCeldaModificarTipoPeriodo && this.isPermisoActualizarTipoPeriodo));	
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonActualizarTipoPeriodo.setVisible((this.isVisibilidadCeldaActualizarTipoPeriodo && this.isPermisoActualizarTipoPeriodo));	
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonEliminarTipoPeriodo.setVisible((this.isVisibilidadCeldaEliminarTipoPeriodo && this.isPermisoEliminarTipoPeriodo));
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonCancelarTipoPeriodo.setVisible(this.isVisibilidadCeldaCancelarTipoPeriodo);							
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonGuardarCambiosTipoPeriodo.setVisible((this.isVisibilidadCeldaGuardarTipoPeriodo && this.isPermisoGuardarCambiosTipoPeriodo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoPeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPeriodo && this.isPermisoGuardarCambiosTipoPeriodo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoPeriodo.setVisible((this.isVisibilidadCeldaNuevoTipoPeriodo && this.isPermisoNuevoTipoPeriodo));						
			this.jButtonDuplicarToolBarTipoPeriodo.setVisible((this.isVisibilidadCeldaDuplicarTipoPeriodo && this.isPermisoDuplicarTipoPeriodo));						
			this.jButtonCopiarToolBarTipoPeriodo.setVisible((this.isVisibilidadCeldaCopiarTipoPeriodo && this.isPermisoCopiarTipoPeriodo));			
			this.jButtonVerFormToolBarTipoPeriodo.setVisible((this.isVisibilidadCeldaVerFormTipoPeriodo && this.isPermisoVerFormTipoPeriodo));			
			this.jButtonAbrirOrderByToolBarTipoPeriodo.setVisible((this.isVisibilidadCeldaOrdenTipoPeriodo && this.isPermisoOrdenTipoPeriodo));
			this.jButtonNuevoRelacionesToolBarTipoPeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo && this.isPermisoNuevoTipoPeriodo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoPeriodo.setVisible((this.isVisibilidadCeldaNuevoTipoPeriodo && this.isPermisoNuevoTipoPeriodo && this.isPermisoGuardarCambiosTipoPeriodo));			
			
			if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonModificarToolBarTipoPeriodo.setVisible((this.isVisibilidadCeldaModificarTipoPeriodo && this.isPermisoActualizarTipoPeriodo));	
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonActualizarToolBarTipoPeriodo.setVisible((this.isVisibilidadCeldaActualizarTipoPeriodo  && this.isPermisoActualizarTipoPeriodo));	
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonEliminarToolBarTipoPeriodo.setVisible((this.isVisibilidadCeldaEliminarTipoPeriodo && this.isPermisoEliminarTipoPeriodo));
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonCancelarToolBarTipoPeriodo.setVisible(this.isVisibilidadCeldaCancelarTipoPeriodo);				
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonGuardarCambiosToolBarTipoPeriodo.setVisible((this.isVisibilidadCeldaGuardarTipoPeriodo && this.isPermisoGuardarCambiosTipoPeriodo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoPeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPeriodo && this.isPermisoGuardarCambiosTipoPeriodo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoPeriodo.setVisible((this.isVisibilidadCeldaNuevoTipoPeriodo && this.isPermisoNuevoTipoPeriodo));			
			this.jMenuItemDuplicarTipoPeriodo.setVisible((this.isVisibilidadCeldaDuplicarTipoPeriodo && this.isPermisoDuplicarTipoPeriodo));			
			this.jMenuItemCopiarTipoPeriodo.setVisible((this.isVisibilidadCeldaCopiarTipoPeriodo && this.isPermisoCopiarTipoPeriodo));			
			this.jMenuItemVerFormTipoPeriodo.setVisible((this.isVisibilidadCeldaVerFormTipoPeriodo && this.isPermisoVerFormTipoPeriodo));			
			this.jMenuItemAbrirOrderByTipoPeriodo.setVisible((this.isVisibilidadCeldaOrdenTipoPeriodo && this.isPermisoOrdenTipoPeriodo));			
			//this.jMenuItemMostrarOcultarTipoPeriodo.setVisible((this.isVisibilidadCeldaOrdenTipoPeriodo && this.isPermisoOrdenTipoPeriodo));
			this.jMenuItemDetalleAbrirOrderByTipoPeriodo.setVisible((this.isVisibilidadCeldaOrdenTipoPeriodo && this.isPermisoOrdenTipoPeriodo));			
			//this.jMenuItemDetalleMostrarOcultarTipoPeriodo.setVisible((this.isVisibilidadCeldaOrdenTipoPeriodo && this.isPermisoOrdenTipoPeriodo));			
			this.jMenuItemNuevoRelacionesTipoPeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo && this.isPermisoNuevoTipoPeriodo));			
			this.jMenuItemNuevoGuardarCambiosTipoPeriodo.setVisible((this.isVisibilidadCeldaNuevoTipoPeriodo && this.isPermisoNuevoTipoPeriodo && this.isPermisoGuardarCambiosTipoPeriodo));									
			
			if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
			this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemModificarTipoPeriodo.setVisible((this.isVisibilidadCeldaModificarTipoPeriodo && this.isPermisoActualizarTipoPeriodo));	
			this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemActualizarTipoPeriodo.setVisible((this.isVisibilidadCeldaActualizarTipoPeriodo && this.isPermisoActualizarTipoPeriodo));	
			this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemEliminarTipoPeriodo.setVisible((this.isVisibilidadCeldaEliminarTipoPeriodo && this.isPermisoEliminarTipoPeriodo));
			this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemCancelarTipoPeriodo.setVisible(this.isVisibilidadCeldaCancelarTipoPeriodo);				
			}
			
			this.jMenuItemGuardarCambiosTipoPeriodo.setVisible((this.isVisibilidadCeldaGuardarTipoPeriodo && this.isPermisoGuardarCambiosTipoPeriodo));						
			this.jMenuItemGuardarCambiosTablaTipoPeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPeriodo && this.isPermisoGuardarCambiosTipoPeriodo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoPeriodo=this.jButtonNuevoTipoPeriodo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoPeriodo=this.jButtonDuplicarTipoPeriodo.isVisible();
			this.isVisibilidadCeldaCopiarTipoPeriodo=this.jButtonCopiarTipoPeriodo.isVisible();
			this.isVisibilidadCeldaVerFormTipoPeriodo=this.jButtonVerFormTipoPeriodo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoPeriodo=this.jButtonAbrirOrderByTipoPeriodo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=this.jButtonNuevoRelacionesTipoPeriodo.isVisible();
			this.isVisibilidadCeldaModificarTipoPeriodo=this.jButtonModificarTipoPeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
			this.isVisibilidadCeldaActualizarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jButtonActualizarTipoPeriodo.isVisible();
			this.isVisibilidadCeldaEliminarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jButtonEliminarTipoPeriodo.isVisible();
			this.isVisibilidadCeldaCancelarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jButtonCancelarTipoPeriodo.isVisible();
			this.isVisibilidadCeldaGuardarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jButtonGuardarCambiosTipoPeriodo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoPeriodo=this.jButtonGuardarCambiosTablaTipoPeriodo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoPeriodo=this.jButtonNuevoToolBarTipoPeriodo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=this.jButtonNuevoRelacionesToolBarTipoPeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
			this.isVisibilidadCeldaModificarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jButtonModificarToolBarTipoPeriodo.isVisible();
			this.isVisibilidadCeldaActualizarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jButtonActualizarToolBarTipoPeriodo.isVisible();
			this.isVisibilidadCeldaEliminarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jButtonEliminarToolBarTipoPeriodo.isVisible();
			this.isVisibilidadCeldaCancelarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jButtonCancelarToolBarTipoPeriodo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPeriodo=this.jButtonGuardarCambiosToolBarTipoPeriodo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPeriodo=this.jButtonGuardarCambiosTablaToolBarTipoPeriodo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoPeriodo=this.jMenuItemNuevoTipoPeriodo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=this.jMenuItemNuevoRelacionesTipoPeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
			this.isVisibilidadCeldaModificarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemModificarTipoPeriodo.isVisible();
			this.isVisibilidadCeldaActualizarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemActualizarTipoPeriodo.isVisible();
			this.isVisibilidadCeldaEliminarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemEliminarTipoPeriodo.isVisible();
			this.isVisibilidadCeldaCancelarTipoPeriodo=this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemCancelarTipoPeriodo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPeriodo=this.jMenuItemGuardarCambiosTipoPeriodo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPeriodo=this.jMenuItemGuardarCambiosTablaTipoPeriodo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoPeriodo(Boolean esInicializar) {
		if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoperiodoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPeriodo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoPeriodo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoPeriodo() {
		this.jButtonNuevoTipoPeriodo.setVisible(this.isPermisoNuevoTipoPeriodo);			
		this.jButtonDuplicarTipoPeriodo.setVisible(this.isPermisoDuplicarTipoPeriodo);			
		this.jButtonCopiarTipoPeriodo.setVisible(this.isPermisoCopiarTipoPeriodo);			
		this.jButtonVerFormTipoPeriodo.setVisible(this.isPermisoVerFormTipoPeriodo);			
		
		this.jButtonAbrirOrderByTipoPeriodo.setVisible(this.isPermisoOrdenTipoPeriodo);					
		
		this.jButtonNuevoRelacionesTipoPeriodo.setVisible(this.isPermisoNuevoTipoPeriodo);			
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonModificarTipoPeriodo.setVisible(this.isPermisoActualizarTipoPeriodo);	
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonActualizarTipoPeriodo.setVisible(this.isPermisoActualizarTipoPeriodo);	
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonEliminarTipoPeriodo.setVisible(this.isPermisoEliminarTipoPeriodo);
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonCancelarTipoPeriodo.setVisible(this.isVisibilidadCeldaCancelarTipoPeriodo);						
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonGuardarCambiosTipoPeriodo.setVisible(this.isPermisoGuardarCambiosTipoPeriodo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoPeriodo.setVisible(this.isPermisoActualizarTipoPeriodo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPeriodo() {
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonModificarTipoPeriodo.setVisible(this.isPermisoActualizarTipoPeriodo);	
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonActualizarTipoPeriodo.setVisible(this.isPermisoActualizarTipoPeriodo);	
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonEliminarTipoPeriodo.setVisible(this.isPermisoEliminarTipoPeriodo);
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonCancelarTipoPeriodo.setVisible(this.isVisibilidadCeldaCancelarTipoPeriodo);							
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonGuardarCambiosTipoPeriodo.setVisible((this.isVisibilidadCeldaGuardarTipoPeriodo && this.isPermisoGuardarCambiosTipoPeriodo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoPeriodo() {
		if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoPeriodo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoPeriodo() {
	}
	
	public void jTableDatosTipoPeriodoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoPeriodo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPeriodo(this.gettipoperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(this.tipoperiodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoperiodo =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoperiodo =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoperiodo==null) {
						this.tipoperiodo = new TipoPeriodo();
					}

					this.setVariablesFormularioToObjetoActualTipoPeriodo(this.tipoperiodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(this.tipoperiodo);
				}

				if(this.tipoperiodo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoperiodo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPeriodo(this.gettipoperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(this.tipoperiodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoperiodo =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoperiodo =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoperiodo==null) {
						this.tipoperiodo = new TipoPeriodo();
					}

					this.setVariablesFormularioToObjetoActualTipoPeriodo(this.tipoperiodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(this.tipoperiodo);
				}

				if(this.tipoperiodo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoperiodo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPeriodo(this.gettipoperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(this.tipoperiodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoperiodo =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoperiodo =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoperiodo==null) {
						this.tipoperiodo = new TipoPeriodo();
					}

					this.setVariablesFormularioToObjetoActualTipoPeriodo(this.tipoperiodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(this.tipoperiodo);
				}

				if(this.tipoperiodo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoperiodo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoPeriodo() {
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
			this.jInternalFrameDetalleFormTipoPeriodo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoPeriodo.dispose();
			this.jInternalFrameDetalleFormTipoPeriodo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoPeriodo!=null) {
			this.jInternalFrameReporteDinamicoTipoPeriodo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoPeriodo.dispose();
			this.jInternalFrameReporteDinamicoTipoPeriodo=null;
		}
		
		if(this.jInternalFrameImportacionTipoPeriodo!=null) {
			this.jInternalFrameImportacionTipoPeriodo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoPeriodo.dispose();
			this.jInternalFrameImportacionTipoPeriodo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoPeriodo();
			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoPeriodo")) {
				jButtonNuevoTipoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoPeriodo")) {
				jButtonDuplicarTipoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoPeriodo")) {
				jButtonCopiarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoPeriodo")) {
				jButtonVerFormTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoPeriodo")) {
				jButtonNuevoTipoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoPeriodo")) {
				jButtonDuplicarTipoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoPeriodo")) {
				jButtonNuevoTipoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoPeriodo")) {
				jButtonDuplicarTipoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoPeriodo")) {
				jButtonNuevoTipoPeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoPeriodo")) {
				jButtonNuevoTipoPeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoPeriodo")) {
				jButtonNuevoTipoPeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoPeriodo")) {
				jButtonModificarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoPeriodo")) {
				jButtonModificarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoPeriodo")) {
				jButtonModificarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoPeriodo")) {
				jButtonActualizarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoPeriodo")) {
				jButtonActualizarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoPeriodo")) {
				jButtonActualizarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoPeriodo")) {
				jButtonEliminarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoPeriodo")) {
				jButtonEliminarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoPeriodo")) {
				jButtonEliminarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoPeriodo")) {
				jButtonCancelarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoPeriodo")) {
				jButtonCancelarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoPeriodo")) {
				jButtonCancelarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoPeriodo")) {
				jButtonCerrarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoPeriodo")) {
				jButtonCerrarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoPeriodo")) {
				jButtonCerrarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoPeriodo")) {
				jButtonMostrarOcultarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoPeriodo")) {
				jButtonCancelarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoPeriodo")) {
				jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoPeriodo")) {
				jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoPeriodo")) {
				jButtonCopiarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoPeriodo")) {
				jButtonVerFormTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoPeriodo")) {
				jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoPeriodo")) {
				jButtonCopiarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoPeriodo")) {
				jButtonVerFormTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoPeriodo")) {
				jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoPeriodo")) {
				jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoPeriodo")) {
				jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoPeriodo")) {
				jButtonRecargarInformacionTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoPeriodo")) {
				jButtonRecargarInformacionTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoPeriodo")) {
				jButtonRecargarInformacionTipoPeriodoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoPeriodo")) {
				jButtonAnterioresTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoPeriodo")) {
				jButtonAnterioresTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoPeriodo")) {
				jButtonAnterioresTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoPeriodo")) {
				jButtonSiguientesTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoPeriodo")) {
				jButtonSiguientesTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoPeriodo")) {
				jButtonSiguientesTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoPeriodo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoPeriodo")) {
				jButtonAbrirOrderByTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoPeriodo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoPeriodo")) {
				jButtonMostrarOcultarTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPeriodo")) {
				jButtonNuevoGuardarCambiosTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoPeriodo")) {
				jButtonNuevoGuardarCambiosTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoPeriodo")) {
				jButtonNuevoGuardarCambiosTipoPeriodoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoPeriodo")) {
				jButtonCerrarReporteDinamicoTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoPeriodo")) {
				jButtonGenerarReporteDinamicoTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoPeriodo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoPeriodo")) {
				jButtonCerrarImportacionTipoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoPeriodo")) {
				
				jButtonGenerarImportacionTipoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoPeriodo")) {
				
				jButtonAbrirImportacionTipoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoPeriodo")) {
				jComboBoxTiposAccionesTipoPeriodoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoPeriodo")) {
				jComboBoxTiposRelacionesTipoPeriodoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoPeriodo")) {
				jComboBoxTiposAccionesTipoPeriodoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoPeriodo")) {
				
				jComboBoxTiposSeleccionarTipoPeriodoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoPeriodo")) {
				jTextFieldValorCampoGeneralTipoPeriodoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoPeriodo")) {
				jButtonAbrirOrderByTipoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoPeriodo")) {
				jButtonAbrirOrderByTipoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoPeriodo")) {
				jButtonCerrarOrderByTipoPeriodoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPeriodoBusqueda")) {
				this.jButtonidTipoPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPeriodoBusqueda")) {
				this.jButtoncodigoTipoPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPeriodoBusqueda")) {
				this.jButtonnombreTipoPeriodoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoPeriodo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPeriodoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				


				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoPeriodo tipoperiodoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoperiodoLocal=this.tipoperiodo;
			} else {
				tipoperiodoLocal=this.tipoperiodoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
							
				
				


				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
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
			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			
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
			
			


			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPeriodoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
								
						
				


				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPeriodo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
								
				
				


				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPeriodoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
							
				
				


				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPeriodo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPeriodoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
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
			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			
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
			
			


			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPeriodoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
								
				
				


				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPeriodoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPeriodoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoPeriodo")) {
					jCheckBoxSeleccionarTodosTipoPeriodoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoPeriodo")) {
					jCheckBoxSeleccionadosTipoPeriodoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoPeriodo")) {
					
				}
				
				


				
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
												
				
				


				
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPeriodoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPeriodoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
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
			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
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
			
			


			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPeriodoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPeriodo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPeriodo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoperiodo);
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
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
				
				


				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPeriodo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoperiodoAnterior =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoPeriodo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoPeriodoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoPeriodo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoperiodo =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoperiodo =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoperiodo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoPeriodo")) {
				
				}
				
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoPeriodo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoPeriodo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoPeriodo")) {
			
			}
			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoPeriodo();
			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoPeriodo")) {
				jButtonNuevoTipoPeriodoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoPeriodo")) {
				jButtonDuplicarTipoPeriodoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoPeriodo")) {
				jButtonCopiarTipoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoPeriodo")) {
				jButtonVerFormTipoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoPeriodo")) {
				jButtonNuevoTipoPeriodoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoPeriodo")) {
				jButtonModificarTipoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoPeriodo")) {
				jButtonActualizarTipoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoPeriodo")) {
				jButtonEliminarTipoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoPeriodo")) {
				jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoPeriodo")) {
				jButtonCancelarTipoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoPeriodo")) {
				jButtonCerrarTipoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoPeriodo")) {
				jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPeriodo")) {
				jButtonNuevoGuardarCambiosTipoPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoPeriodo")) {
				jButtonAbrirOrderByTipoPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoPeriodo")) {
				jButtonRecargarInformacionTipoPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoPeriodo")) {
				jButtonAnterioresTipoPeriodoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoPeriodo")) {
				jButtonSiguientesTipoPeriodoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPeriodoBusqueda")) {
				this.jButtonidTipoPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPeriodoBusqueda")) {
				this.jButtoncodigoTipoPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPeriodoBusqueda")) {
				this.jButtonnombreTipoPeriodoBusquedaActionPerformed(evt);
			}
			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoPeriodo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoPeriodo")) {
				closingInternalFrameTipoPeriodo();
				
			} else if(sTipo.equals("jButtonCancelarTipoPeriodo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoPeriodo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoPeriodoBeanSwingJInternalFrame jInternalFrameParent=(TipoPeriodoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPeriodo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoPeriodoActionPerformed(null);
			}
			
			TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoperiodo,new Object(),this.tipoperiodoParameterGeneral,this.tipoperiodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoPeriodo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoPeriodo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoPeriodo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoperiodo)) {
			if(!esControlTabla) {
				if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoPeriodo(this.tipoperiodo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(this.tipoperiodo);			
				}
				
				if(this.tipoperiodoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoPeriodo(this.tipoperiodo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoperiodoReturnGeneral=tipoperiodoLogic.procesarEventosTipoPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoperiodoLogic.getTipoPeriodos(),this.tipoperiodo,this.tipoperiodoParameterGeneral,this.isEsNuevoTipoPeriodo,classes);//this.tipoperiodoLogic.getTipoPeriodo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoPeriodo(this.tipoperiodoReturnGeneral,this.tipoperiodoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoperiodoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoPeriodo(classes,this.tipoperiodoReturnGeneral,this.tipoperiodoBean,false);
					}
						
					if(this.tipoperiodoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoPeriodo(this.tipoperiodoReturnGeneral.getTipoPeriodo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoPeriodo(this.tipoperiodoReturnGeneral.getTipoPeriodo());	
					}
						
					if(this.tipoperiodoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoPeriodo(this.tipoperiodoReturnGeneral.getTipoPeriodo(),classes);//this.tipoperiodoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoPeriodo(this.tipoperiodo,classes);//this.tipoperiodoBean);									
				}
			
				if(TipoPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoPeriodo(this.tipoperiodo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPeriodo(this.tipoperiodo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoperiodoAnterior!=null) {
						this.tipoperiodo=this.tipoperiodoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoperiodoReturnGeneral=tipoperiodoLogic.procesarEventosTipoPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoperiodoLogic.getTipoPeriodos(),this.tipoperiodo,this.tipoperiodoParameterGeneral,this.isEsNuevoTipoPeriodo,classes);//this.tipoperiodoLogic.getTipoPeriodo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoperiodoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoperiodoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoperiodoReturnGeneral.getTipoPeriodo(),tipoperiodoLogic.getTipoPeriodos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoperiodoReturnGeneral.getTipoPeriodo(),this.tipoperiodos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoPeriodo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoPeriodo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoPeriodo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoPeriodo() throws Exception {
		
		TipoPeriodoModel tipoperiodoModel=(TipoPeriodoModel)this.jTableDatosTipoPeriodo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoperiodoModel.tipoperiodos=this.tipoperiodoLogic.getTipoPeriodos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoperiodoModel.tipoperiodos=this.tipoperiodos;
		}
		
		
		((TipoPeriodoModel) this.jTableDatosTipoPeriodo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoPeriodo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoperiodoAnterior(),this.tipoperiodoLogic.getTipoPeriodos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoperiodoAnterior(),this.tipoperiodos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoPeriodo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoPeriodo(TipoPeriodo tipoperiodo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
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
										
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoperiodo,new Object(),generalEntityParameterGeneral,this.tipoperiodoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoperiodoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoPeriodoConstantesFunciones.getClassesRelationshipsOfTipoPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoPeriodoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoPeriodo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoPeriodo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoperiodo,new Object(),generalEntityParameterGeneral,this.tipoperiodoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoPeriodo(TipoPeriodoBean tipoperiodoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoPeriodo(ArrayList<Classe> classes,TipoPeriodoReturnGeneral tipoperiodoReturnGeneral,TipoPeriodoBean tipoperiodoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoPeriodo(TipoPeriodo tipoperiodo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoperiodo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoPeriodo = new TipoPeriodoDetalleFormJInternalFrame(jDesktopPane,this.tipoperiodoSessionBean.getConGuardarRelaciones(),this.tipoperiodoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPeriodo);
		this.jInternalFrameDetalleFormTipoPeriodo.setVisible(false);
		this.jInternalFrameDetalleFormTipoPeriodo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoPeriodo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoPeriodo.tipoperiodoLogic=this.tipoperiodoLogic;
		
		this.cargarCombosFrameForeignKeyTipoPeriodo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPeriodo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPeriodo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoPeriodo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoPeriodo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoPeriodo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPeriodo"));
		
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonModificarTipoPeriodo.addActionListener(new ButtonActionListener(this,"ModificarTipoPeriodo"));

		
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonModificarToolBarTipoPeriodo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPeriodo"));
					
		this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemModificarTipoPeriodo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonActualizarTipoPeriodo.addActionListener (new ButtonActionListener(this,"ActualizarTipoPeriodo"));
		
		
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonActualizarToolBarTipoPeriodo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPeriodo"));
						
		this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemActualizarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonEliminarTipoPeriodo.addActionListener (new ButtonActionListener(this,"EliminarTipoPeriodo"));
		
		
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonEliminarToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPeriodo"));
								
		this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemEliminarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonCancelarTipoPeriodo.addActionListener (new ButtonActionListener(this,"CancelarTipoPeriodo"));
		
		
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonCancelarToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPeriodo"));
					
		this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemCancelarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPeriodo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemDetalleCerrarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonGuardarCambiosToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPeriodo"));
		
		
		
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonGuardarCambiosToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPeriodo"));
		
		
		
		this.jInternalFrameDetalleFormTipoPeriodo.jComboBoxTiposAccionesFormularioTipoPeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPeriodo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonidTipoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPeriodo.jButtoncodigoTipoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonnombreTipoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPeriodoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoPeriodo.jTabbedPaneRelacionesTipoPeriodo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPeriodo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoPeriodo"));
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPeriodo"));
		}
		
		this.jTableDatosTipoPeriodo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoPeriodo"));
		
		this.jTableDatosTipoPeriodo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoPeriodo"));
		
		this.jButtonNuevoTipoPeriodo.addActionListener(new ButtonActionListener(this,"NuevoTipoPeriodo"));
		
		this.jButtonDuplicarTipoPeriodo.addActionListener(new ButtonActionListener(this,"DuplicarTipoPeriodo"));
		
		this.jButtonCopiarTipoPeriodo.addActionListener(new ButtonActionListener(this,"CopiarTipoPeriodo"));
		
		this.jButtonVerFormTipoPeriodo.addActionListener(new ButtonActionListener(this,"VerFormTipoPeriodo"));
		
		
		this.jButtonNuevoToolBarTipoPeriodo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoPeriodo"));
			
		this.jButtonDuplicarToolBarTipoPeriodo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoPeriodo"));
			
		this.jMenuItemNuevoTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoPeriodo"));
			
		this.jMenuItemDuplicarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoPeriodo"));		
		
		
		this.jButtonNuevoRelacionesTipoPeriodo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoPeriodo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoPeriodo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoPeriodo"));
			
		this.jMenuItemNuevoRelacionesTipoPeriodo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoPeriodo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonModificarTipoPeriodo.addActionListener(new ButtonActionListener(this,"ModificarTipoPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonModificarToolBarTipoPeriodo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPeriodo"));
			
			this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemModificarTipoPeriodo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonActualizarTipoPeriodo.addActionListener (new ButtonActionListener(this,"ActualizarTipoPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonActualizarToolBarTipoPeriodo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPeriodo"));
				
			this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemActualizarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonEliminarTipoPeriodo.addActionListener (new ButtonActionListener(this,"EliminarTipoPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonEliminarToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPeriodo"));
						
			this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemEliminarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonCancelarTipoPeriodo.addActionListener (new ButtonActionListener(this,"CancelarTipoPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonCancelarToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPeriodo"));
			
			this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemCancelarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPeriodo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoPeriodo"));		
		
		
		this.jButtonCerrarTipoPeriodo.addActionListener (new ButtonActionListener(this,"CerrarTipoPeriodo"));
		
		
		this.jButtonCerrarToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoPeriodo"));
			
		this.jMenuItemCerrarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoPeriodo"));
			
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.jMenuItemDetalleCerrarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonGuardarCambiosTipoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.jButtonGuardarCambiosToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPeriodo"));
		}
		
		this.jButtonCopiarToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoPeriodo"));
			
		this.jButtonVerFormToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoPeriodo"));
		
		this.jMenuItemGuardarCambiosTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoPeriodo"));
			
		this.jMenuItemCopiarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoPeriodo"));		
		
		this.jMenuItemVerFormTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoPeriodo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPeriodo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoPeriodo"));
			
		this.jMenuItemGuardarCambiosTablaTipoPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPeriodo"));		
		
		
		
		this.jButtonRecargarInformacionTipoPeriodo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoPeriodo"));
					
		this.jButtonRecargarInformacionToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoPeriodo"));
		
		this.jMenuItemRecargarInformacionTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoPeriodo"));		
		
		
		
		this.jButtonAnterioresTipoPeriodo.addActionListener (new ButtonActionListener(this,"AnterioresTipoPeriodo"));
		
		
		this.jButtonAnterioresToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoPeriodo"));
		
		this.jMenuItemAnterioresTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoPeriodo"));		
		
		
		this.jButtonSiguientesTipoPeriodo.addActionListener (new ButtonActionListener(this,"SiguientesTipoPeriodo"));
		
		
		this.jButtonSiguientesToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoPeriodo"));
			
		this.jMenuItemSiguientesTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoPeriodo"));
			
		this.jMenuItemAbrirOrderByTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoPeriodo"));
			
		this.jMenuItemMostrarOcultarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoPeriodo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoPeriodo"));
			
		this.jMenuItemDetalleMostarOcultarTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoPeriodo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoPeriodo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoPeriodo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoPeriodo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoPeriodo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoPeriodo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoPeriodo"));

		this.jCheckBoxSeleccionadosTipoPeriodo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoPeriodo"));
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.jComboBoxTiposAccionesFormularioTipoPeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPeriodo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoPeriodo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoPeriodo"));
			
		this.jComboBoxTiposAccionesTipoPeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoPeriodo"));
					
		this.jComboBoxTiposSeleccionarTipoPeriodo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoPeriodo"));
			
		this.jTextFieldValorCampoGeneralTipoPeriodo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoPeriodo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonidTipoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPeriodo.jButtoncodigoTipoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonnombreTipoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPeriodoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoPeriodo!=null) {
				this.jInternalFrameReporteDinamicoTipoPeriodo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPeriodo"));
				this.jInternalFrameReporteDinamicoTipoPeriodo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPeriodo"));
				this.jInternalFrameReporteDinamicoTipoPeriodo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPeriodo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoPeriodo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPeriodo"));				
			//this.jButtonGenerarReporteDinamicoTipoPeriodo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPeriodo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoPeriodo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPeriodo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoPeriodo!=null) {
				this.jInternalFrameImportacionTipoPeriodo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPeriodo"));
				this.jInternalFrameImportacionTipoPeriodo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPeriodo"));
				this.jInternalFrameImportacionTipoPeriodo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPeriodo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoPeriodo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoPeriodo"));
			
			this.jButtonAbrirOrderByToolBarTipoPeriodo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoPeriodo"));			
			
			if(this.jInternalFrameOrderByTipoPeriodo!=null) {
				this.jInternalFrameOrderByTipoPeriodo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPeriodo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPeriodo.jTabbedPaneRelacionesTipoPeriodo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPeriodo"));
		
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
            		closingInternalFrameTipoPeriodo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoPeriodo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoPeriodo = (JInternalFrameBase)event.getSource();
	            	
	            TipoPeriodoBeanSwingJInternalFrame jInternalFrameParent=(TipoPeriodoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPeriodo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoPeriodoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoPeriodo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoPeriodoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoPeriodo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoPeriodo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoPeriodo";
		inputMap = this.jButtonNuevoTipoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPeriodoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoPeriodo";
		inputMap = this.jButtonNuevoRelacionesTipoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPeriodoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoPeriodo";
		inputMap = this.jButtonModificarTipoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoPeriodo";
		inputMap = this.jButtonActualizarTipoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoPeriodo";
		inputMap = this.jButtonEliminarTipoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoPeriodo";
		inputMap = this.jButtonCancelarTipoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoPeriodo";
		inputMap = this.jButtonCerrarTipoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonGuardarCambiosTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoPeriodo";
		inputMap = this.jInternalFrameDetalleFormTipoPeriodo.jButtonGuardarCambiosTipoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonGuardarCambiosTipoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoPeriodo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoPeriodoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoPeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoPeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoPeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoPeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoPeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoPeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonidTipoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPeriodo.jButtoncodigoTipoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPeriodo.jButtonnombreTipoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPeriodoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoPeriodoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoPeriodo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoPeriodo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoPeriodo tipoperiodoAux:this.tipoperiodoLogic.getTipoPeriodos()) {
					tipoperiodoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPeriodo tipoperiodoAux:tipoperiodos) {
					tipoperiodoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoPeriodoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPeriodo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPeriodo tipoperiodoAux:this.tipoperiodoLogic.getTipoPeriodos()) {
						tipoperiodoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPeriodo tipoperiodoAux:tipoperiodos) {
						tipoperiodoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoPeriodo tipoperiodoAux:this.tipoperiodoLogic.getTipoPeriodos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPeriodo tipoperiodoAux:tipoperiodos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPeriodo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPeriodo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPeriodo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPeriodo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoPeriodoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPeriodo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoPeriodo.getSelectedRows();
			
			TipoPeriodo tipoperiodoLocal=new TipoPeriodo();
			
			//this.seleccionarTodosTipoPeriodo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoperiodoLocal =(TipoPeriodo) this.tipoperiodoLogic.getTipoPeriodos().toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoperiodoLocal =(TipoPeriodo) this.tipoperiodos.toArray()[this.jTableDatosTipoPeriodo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoperiodoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPeriodo tipoperiodoAux:this.tipoperiodoLogic.getTipoPeriodos()) {
						tipoperiodoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPeriodo tipoperiodoAux:tipoperiodos) {
						tipoperiodoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoPeriodo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPeriodo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPeriodo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPeriodo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoPeriodoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoPeriodoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoPeriodoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoPeriodo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoPeriodo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPeriodo tipoperiodoAux:this.tipoperiodoLogic.getTipoPeriodos()) {
				
						if(sTipoSeleccionar.equals(TipoPeriodoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoperiodoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPeriodoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoperiodoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPeriodo tipoperiodoAux:tipoperiodos) {
					
						if(sTipoSeleccionar.equals(TipoPeriodoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoperiodoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPeriodoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoperiodoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPeriodo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoPeriodoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoPeriodo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoPeriodo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoPeriodo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoPeriodo.jComboBoxTiposAccionesFormularioTipoPeriodo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoPeriodo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoPeriodo(conSplash);
				
					this.generarReporteTipoPeriodosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPeriodo.jComboBoxTiposAccionesFormularioTipoPeriodo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoPeriodosSeleccionados();
				//this.jComboBoxTiposAccionesTipoPeriodo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPeriodosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoPeriodo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPeriodosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoPeriodo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPeriodo();
				
				this.exportarTipoPeriodosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPeriodo.jComboBoxTiposAccionesFormularioTipoPeriodo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoPeriodos();
				//this.importarTipoPeriodos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPeriodo.jComboBoxTiposAccionesFormularioTipoPeriodo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPeriodo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoPeriodosSeleccionados();
				//this.jComboBoxTiposAccionesTipoPeriodo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Periodo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoPeriodo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoPeriodo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoPeriodo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Periodo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPeriodo.jComboBoxTiposAccionesFormularioTipoPeriodo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoPeriodo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoPeriodo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoPeriodoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoPeriodo();
			
			if(this.jInternalFrameDetalleFormTipoPeriodo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();		
			TipoPeriodo tipoperiodo=new TipoPeriodo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoPeriodo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoPeriodo.getSelectedItem();
			
			
			
			
			tipoperiodosSeleccionados=this.getTipoPeriodosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoperiodosSeleccionados.size()==1) {
				for(TipoPeriodo tipoperiodoAux:tipoperiodosSeleccionados) {
					tipoperiodo=tipoperiodoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoPeriodo();
			
      		//this.finishProcessTipoPeriodo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoPeriodoReturnGeneral() throws Exception {
		if(this.tipoperiodoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoperiodoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoperiodoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoperiodoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoperiodoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoperiodoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoPeriodo(false);
		}
		
		if(this.tipoperiodoReturnGeneral.getConRetornoLista() || this.tipoperiodoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoperiodoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoperiodoLogic.setTipoPeriodos(this.tipoperiodoReturnGeneral.getTipoPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoperiodoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoperiodoLogic.setTipoPeriodo(this.tipoperiodoReturnGeneral.getTipoPeriodo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoPeriodo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoPeriodo() throws Exception {
		
		
	}
	
	public ArrayList<TipoPeriodo> getTipoPeriodosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoPeriodo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoPeriodo tipoperiodoAux:tipoperiodoLogic.getTipoPeriodos()) {
					if(tipoperiodoAux.getIsSelected()) {
						tipoperiodosSeleccionados.add(tipoperiodoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPeriodo tipoperiodoAux:this.tipoperiodos) {
					if(tipoperiodoAux.getIsSelected()) {
						tipoperiodosSeleccionados.add(tipoperiodoAux);				
					}
				}
			}
			
			if(tipoperiodosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoperiodosSeleccionados.addAll(this.tipoperiodoLogic.getTipoPeriodos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoperiodosSeleccionados.addAll(this.tipoperiodos);				
					}
				}
			}
		} else {
			tipoperiodosSeleccionados.add(this.tipoperiodo);
		}
		
		return tipoperiodosSeleccionados;
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
	
	public void generarReporteTipoPeriodosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoPeriodosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoPeriodosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPeriodosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPeriodosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Periodo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoPeriodosSeleccionados() throws Exception {
		ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();		
		
		tipoperiodosSeleccionados=this.getTipoPeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoPeriodos("Todos",tipoperiodosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoPeriodosSeleccionados() throws Exception {
		ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();		
		
		tipoperiodosSeleccionados=this.getTipoPeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoPeriodos("Todos",tipoperiodosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoPeriodosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();
		
		tipoperiodosSeleccionados=this.getTipoPeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoPeriodos("Todos",tipoperiodosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoPeriodosSeleccionados() throws Exception {
		ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoPeriodo();
		
		
		tipoperiodosSeleccionados=this.getTipoPeriodosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoPeriodo();
		
		
		//this.generarReporteTipoPeriodos("Todos",tipoperiodosSeleccionados ,tipoperiodoImplementable,tipoperiodoImplementableHome);
	}
	
	public void mostrarImportacionTipoPeriodos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoPeriodo();
		
		this.abrirFrameImportacionTipoPeriodo();		
		
			
		//this.generarReporteTipoPeriodos("Todos",tipoperiodosSeleccionados ,tipoperiodoImplementable,tipoperiodoImplementableHome);
	}
	
	public void importarTipoPeriodos() throws Exception {		
	
	}
	
	public void exportarTipoPeriodosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoPeriodosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoPeriodosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoPeriodosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Periodo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoPeriodosSeleccionados() throws Exception {
		ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();		
		
		tipoperiodosSeleccionados=this.getTipoPeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoperiodo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoPeriodo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoPeriodo tipoperiodoAux:tipoperiodosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoPeriodo(tipoperiodoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoperiodoAux.setsDetalleGeneralEntityReporte(tipoperiodoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoPeriodo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoPeriodoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPeriodoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPeriodoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPeriodoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoPeriodo(TipoPeriodo tipoperiodo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoperiodo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoperiodo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoperiodo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoperiodo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoPeriodosSeleccionados() throws Exception {
		ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();		
		
		tipoperiodosSeleccionados=this.getTipoPeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoperiodo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoPeriodos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoPeriodo(row);				
				iRow++;
			}				
			
			for(TipoPeriodo tipoperiodoAux:tipoperiodosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoPeriodo(tipoperiodoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoPeriodosSeleccionados() throws Exception {
		ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();		
		
		tipoperiodosSeleccionados=this.getTipoPeriodosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoperiodo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoperiodos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoperiodo");
			//elementRoot.appendChild(element);
		
			for(TipoPeriodo tipoperiodoAux:tipoperiodosSeleccionados) {
				element = document.createElement("tipoperiodo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoPeriodo(tipoperiodoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoPeriodo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPeriodoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPeriodoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoPeriodoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPeriodoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoPeriodo(TipoPeriodo tipoperiodo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoperiodo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoperiodo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoperiodo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoPeriodo(TipoPeriodo tipoperiodo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoPeriodoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoperiodo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoPeriodoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoperiodo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoPeriodoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoperiodo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoPeriodoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoperiodo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoPeriodosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoPeriodo> tipoperiodosSeleccionados=new ArrayList<TipoPeriodo>();
		
		tipoperiodosSeleccionados=this.getTipoPeriodosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoPeriodo(tipoperiodosSeleccionados);
		
		this.generarReporteTipoPeriodos("Todos",tipoperiodosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoPeriodo(ArrayList<TipoPeriodo> tipoperiodosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoPeriodo tipoperiodoAux:tipoperiodosSeleccionados) {
				tipoperiodoAux.setsDetalleGeneralEntityReporte(tipoperiodoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoPeriodoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoperiodoAux.setsDescripcionGeneralEntityReporte1(tipoperiodoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoPeriodoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoperiodoAux.setsDescripcionGeneralEntityReporte1(tipoperiodoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoPeriodo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoPeriodo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoPeriodo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoPeriodo=false;
			this.isVisibilidadCeldaActualizarTipoPeriodo=false;
			this.isVisibilidadCeldaEliminarTipoPeriodo=false;
			this.isVisibilidadCeldaCancelarTipoPeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPeriodo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPeriodo=false;
			this.isVisibilidadCeldaModificarTipoPeriodo=false;
			this.isVisibilidadCeldaActualizarTipoPeriodo=true;
			this.isVisibilidadCeldaEliminarTipoPeriodo=false;
			this.isVisibilidadCeldaCancelarTipoPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPeriodo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPeriodo=false;
			this.isVisibilidadCeldaModificarTipoPeriodo=false;
			this.isVisibilidadCeldaActualizarTipoPeriodo=true;
			this.isVisibilidadCeldaEliminarTipoPeriodo=true;
			this.isVisibilidadCeldaCancelarTipoPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPeriodo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPeriodo=false;
			this.isVisibilidadCeldaModificarTipoPeriodo=false;
			this.isVisibilidadCeldaActualizarTipoPeriodo=true;
			this.isVisibilidadCeldaEliminarTipoPeriodo=false;
			this.isVisibilidadCeldaCancelarTipoPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPeriodo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoPeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPeriodo=true;
			this.isVisibilidadCeldaModificarTipoPeriodo=false;
			this.isVisibilidadCeldaActualizarTipoPeriodo=false;
			this.isVisibilidadCeldaEliminarTipoPeriodo=false;
			this.isVisibilidadCeldaCancelarTipoPeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPeriodo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPeriodo=false;
			this.isVisibilidadCeldaActualizarTipoPeriodo=false;
			this.isVisibilidadCeldaEliminarTipoPeriodo=false;
			this.isVisibilidadCeldaCancelarTipoPeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPeriodo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPeriodo=false;
			this.isVisibilidadCeldaModificarTipoPeriodo=true;
			this.isVisibilidadCeldaActualizarTipoPeriodo=false;
			this.isVisibilidadCeldaEliminarTipoPeriodo=false;
			this.isVisibilidadCeldaCancelarTipoPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPeriodo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoPeriodoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoPeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPeriodo=true;
		} else {
			this.actualizarEstadoPanelsTipoPeriodo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoPeriodo=false;
			//this.isVisibilidadCeldaVerFormTipoPeriodo=false;
			this.isVisibilidadCeldaDuplicarTipoPeriodo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoperiodoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPeriodo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoperiodoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoperiodoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=false;												
			}
			
			this.jButtonCerrarTipoPeriodo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPeriodo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoperiodo)) {
			this.isVisibilidadCeldaActualizarTipoPeriodo=false;
			this.isVisibilidadCeldaEliminarTipoPeriodo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPeriodo() {
	}
	
	public void actualizarEstadoPanelsTipoPeriodo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoPeriodo!=null) {
				this.jScrollPanelDatosEdicionTipoPeriodo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPeriodo!=null) {
				this.jScrollPanelDatosTipoPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPeriodo!=null) {
				this.jPanelPaginacionTipoPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPeriodo!=null) {
				this.jPanelParametrosReportesTipoPeriodo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoPeriodo!=null) {
				this.jScrollPanelDatosEdicionTipoPeriodo.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoPeriodo!=null) {
				this.jScrollPanelDatosTipoPeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPeriodo!=null) {
				this.jPanelPaginacionTipoPeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPeriodo!=null) {
				this.jPanelParametrosReportesTipoPeriodo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoPeriodo!=null) {
				this.jScrollPanelDatosEdicionTipoPeriodo.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoPeriodo!=null) {
				this.jScrollPanelDatosTipoPeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPeriodo!=null) {
				this.jPanelPaginacionTipoPeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPeriodo!=null) {
				this.jPanelParametrosReportesTipoPeriodo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoPeriodo!=null) {
				this.jScrollPanelDatosEdicionTipoPeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPeriodo!=null) {
				this.jScrollPanelDatosTipoPeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPeriodo!=null) {
				this.jPanelPaginacionTipoPeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPeriodo!=null) {
				this.jPanelParametrosReportesTipoPeriodo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoPeriodo!=null) {
				this.jScrollPanelDatosEdicionTipoPeriodo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPeriodo!=null) {
				this.jScrollPanelDatosTipoPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPeriodo!=null) {
				this.jPanelPaginacionTipoPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPeriodo!=null) {
				this.jPanelParametrosReportesTipoPeriodo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoPeriodo!=null) {
				this.jScrollPanelDatosEdicionTipoPeriodo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoPeriodo!=null) {
				this.jScrollPanelDatosTipoPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPeriodo!=null) {
				this.jPanelPaginacionTipoPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPeriodo!=null) {
				this.jPanelParametrosReportesTipoPeriodo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoPeriodo!=null) {
				this.jScrollPanelDatosEdicionTipoPeriodo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoPeriodo!=null) {
				this.jScrollPanelDatosTipoPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPeriodo!=null) {
				this.jPanelPaginacionTipoPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPeriodo!=null) {
				this.jPanelParametrosReportesTipoPeriodo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoPeriodoSessionBean tipoperiodoSessionBean=new TipoPeriodoSessionBean();
		
		if(this.tipoperiodoSessionBean==null) {
			this.tipoperiodoSessionBean=new TipoPeriodoSessionBean();
		}
		
		this.tipoperiodoSessionBean.setsUltimaBusquedaTipoPeriodo(this.getsAccionBusqueda());
		this.tipoperiodoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoperiodoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoPeriodoSessionBean tipoperiodoSessionBean=new TipoPeriodoSessionBean();
		
		if(this.tipoperiodoSessionBean==null) {
			this.tipoperiodoSessionBean=new TipoPeriodoSessionBean();
		}
		
		if(this.tipoperiodoSessionBean.getsUltimaBusquedaTipoPeriodo()!=null&&!this.tipoperiodoSessionBean.getsUltimaBusquedaTipoPeriodo().equals("")) {
			this.setsAccionBusqueda(tipoperiodoSessionBean.getsUltimaBusquedaTipoPeriodo());
			this.setiNumeroPaginacion(tipoperiodoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoperiodoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoperiodoSessionBean.setsUltimaBusquedaTipoPeriodo("");
		this.tipoperiodoSessionBean.setiNumeroPaginacion(TipoPeriodoConstantesFunciones.INUMEROPAGINACION);
		this.tipoperiodoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoPeriodo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoPeriodo() {
		this.updateBorderResaltarBusquedasFormularioTipoPeriodo();
		this.updateVisibilidadBusquedasFormularioTipoPeriodo();
		this.updateHabilitarBusquedasFormularioTipoPeriodo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoPeriodo() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoPeriodo() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoPeriodo() {
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
	
	public void updateControlesFormularioTipoPeriodo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoPeriodo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoPeriodo();
		this.updateVisibilidadResaltarControlesFormularioTipoPeriodo();
		this.updateHabilitarResaltarControlesFormularioTipoPeriodo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoPeriodo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoperiodoConstantesFunciones.resaltaridTipoPeriodo!=null && this.jInternalFrameDetalleFormTipoPeriodo!=null) {this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldidTipoPeriodo.setBorder(this.tipoperiodoConstantesFunciones.resaltaridTipoPeriodo);}
		if(this.tipoperiodoConstantesFunciones.resaltarcodigoTipoPeriodo!=null && this.jInternalFrameDetalleFormTipoPeriodo!=null) {this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldcodigoTipoPeriodo.setBorder(this.tipoperiodoConstantesFunciones.resaltarcodigoTipoPeriodo);}
		if(this.tipoperiodoConstantesFunciones.resaltarnombreTipoPeriodo!=null && this.jInternalFrameDetalleFormTipoPeriodo!=null) {this.jInternalFrameDetalleFormTipoPeriodo.jTextAreanombreTipoPeriodo.setBorder(this.tipoperiodoConstantesFunciones.resaltarnombreTipoPeriodo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoPeriodo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoPeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
	
		//this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldidTipoPeriodo.setVisible(this.tipoperiodoConstantesFunciones.mostraridTipoPeriodo);
		this.jInternalFrameDetalleFormTipoPeriodo.jPanelidTipoPeriodo.setVisible(this.tipoperiodoConstantesFunciones.mostraridTipoPeriodo);
		//this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldcodigoTipoPeriodo.setVisible(this.tipoperiodoConstantesFunciones.mostrarcodigoTipoPeriodo);
		this.jInternalFrameDetalleFormTipoPeriodo.jPanelcodigoTipoPeriodo.setVisible(this.tipoperiodoConstantesFunciones.mostrarcodigoTipoPeriodo);
		//this.jInternalFrameDetalleFormTipoPeriodo.jTextAreanombreTipoPeriodo.setVisible(this.tipoperiodoConstantesFunciones.mostrarnombreTipoPeriodo);
		this.jInternalFrameDetalleFormTipoPeriodo.jPanelnombreTipoPeriodo.setVisible(this.tipoperiodoConstantesFunciones.mostrarnombreTipoPeriodo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoPeriodo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPeriodo!=null) {
	
		this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldidTipoPeriodo.setEnabled(this.tipoperiodoConstantesFunciones.activaridTipoPeriodo);
		this.jInternalFrameDetalleFormTipoPeriodo.jTextFieldcodigoTipoPeriodo.setEnabled(this.tipoperiodoConstantesFunciones.activarcodigoTipoPeriodo);
		this.jInternalFrameDetalleFormTipoPeriodo.jTextAreanombreTipoPeriodo.setEnabled(this.tipoperiodoConstantesFunciones.activarnombreTipoPeriodo);
		}
	}
	
		
}