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

import com.bydan.erp.seguridad.util.TipoDelimiterConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoDelimiterParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoDelimiterParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoDelimiterBean;
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
public class TipoDelimiterBeanSwingJInternalFrame extends TipoDelimiterJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDelimiterBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDelimiter> tipodelimiterValidator = new ClassValidator<TipoDelimiter>(TipoDelimiter.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDelimiter tipodelimiter;	
	public TipoDelimiter tipodelimiterAux;
	public TipoDelimiter tipodelimiterAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDelimiter tipodelimiterTotales;
	public Long idTipoDelimiterActual;
	public Long iIdNuevoTipoDelimiter=0L;
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
	
	public Boolean isPermisoTodoTipoDelimiter;
	public Boolean isPermisoNuevoTipoDelimiter;
	public Boolean isPermisoActualizarTipoDelimiter;
	public Boolean isPermisoActualizarOriginalTipoDelimiter;
	public Boolean isPermisoEliminarTipoDelimiter;
	public Boolean isPermisoGuardarCambiosTipoDelimiter;
	public Boolean isPermisoConsultaTipoDelimiter;
	public Boolean isPermisoBusquedaTipoDelimiter;
	public Boolean isPermisoReporteTipoDelimiter;
	public Boolean isPermisoPaginacionMedioTipoDelimiter;
	public Boolean isPermisoPaginacionAltoTipoDelimiter;
	public Boolean isPermisoPaginacionTodoTipoDelimiter;
	public Boolean isPermisoCopiarTipoDelimiter;
	public Boolean isPermisoVerFormTipoDelimiter;
	public Boolean isPermisoDuplicarTipoDelimiter;
	public Boolean isPermisoOrdenTipoDelimiter;
	
	
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
	
	public TipoDelimiterParameterReturnGeneral tipodelimiterReturnGeneral;
	public TipoDelimiterParameterReturnGeneral tipodelimiterParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDelimiter=false;
	public Boolean esParaAccionDesdeFormularioTipoDelimiter=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDelimiterLogic tipodelimiterLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDelimiter tipodelimiterBean;
	public TipoDelimiterConstantesFunciones tipodelimiterConstantesFunciones;
	//public TipoDelimiterParameterReturnGeneral tipodelimiterReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoDelimiter> tipodelimiters;	
	//public List<TipoDelimiter> tipodelimitersEliminados;
	//public List<TipoDelimiter> tipodelimitersAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDelimiter=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDelimiter=true;
	public Boolean isVisibilidadCeldaCopiarTipoDelimiter=true;
	public Boolean isVisibilidadCeldaVerFormTipoDelimiter=true;
	public Boolean isVisibilidadCeldaOrdenTipoDelimiter=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDelimiter=false;
	public Boolean isVisibilidadCeldaModificarTipoDelimiter=false;
	public Boolean isVisibilidadCeldaActualizarTipoDelimiter=false;
	public Boolean isVisibilidadCeldaEliminarTipoDelimiter=false;
	public Boolean isVisibilidadCeldaCancelarTipoDelimiter=false;
	public Boolean isVisibilidadCeldaGuardarTipoDelimiter=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDelimiter=false;	
	
	
	
	public Long getiIdNuevoTipoDelimiter() {
		return this.iIdNuevoTipoDelimiter;
	}

	public void setiIdNuevoTipoDelimiter(Long iIdNuevoTipoDelimiter) {
		this.iIdNuevoTipoDelimiter = iIdNuevoTipoDelimiter;
	}
	
	public Long getidTipoDelimiterActual() {
		return this.idTipoDelimiterActual;
	}

	public void setidTipoDelimiterActual(Long idTipoDelimiterActual) {
		this.idTipoDelimiterActual = idTipoDelimiterActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDelimiter gettipodelimiter() {
		return this.tipodelimiter;
	}

	public void settipodelimiter(TipoDelimiter tipodelimiter) {
		this.tipodelimiter = tipodelimiter;
	}
	
	public TipoDelimiter gettipodelimiterAux() {
		return this.tipodelimiterAux;
	}

	public void settipodelimiterAux(TipoDelimiter tipodelimiterAux) {
		this.tipodelimiterAux = tipodelimiterAux;
	}				
	
	public TipoDelimiter gettipodelimiterAnterior() {
		return this.tipodelimiterAnterior;
	}

	public void settipodelimiterAnterior(TipoDelimiter tipodelimiterAnterior) {
		this.tipodelimiterAnterior = tipodelimiterAnterior;
	}	
	
	public TipoDelimiter gettipodelimiterTotales() {
		return this.tipodelimiterTotales;
	}

	public void settipodelimiterTotales(TipoDelimiter tipodelimiterTotales) {
		this.tipodelimiterTotales = tipodelimiterTotales;
	}	
	
	public TipoDelimiter gettipodelimiterBean() {
		return this.tipodelimiterBean;
	}

	public void settipodelimiterBean(TipoDelimiter tipodelimiterBean) {
		this.tipodelimiterBean = tipodelimiterBean;
	}	
	
	public TipoDelimiterParameterReturnGeneral gettipodelimiterReturnGeneral() {
		return this.tipodelimiterReturnGeneral;
	}

	public void settipodelimiterReturnGeneral(TipoDelimiterParameterReturnGeneral tipodelimiterReturnGeneral) {
		this.tipodelimiterReturnGeneral = tipodelimiterReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoDelimiterLogic getTipoDelimiterLogic()	{		
		return tipodelimiterLogic;
	}

	public void setTipoDelimiterLogic(TipoDelimiterLogic tipodelimiterLogic) {
		this.tipodelimiterLogic = tipodelimiterLogic;
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
	
	public Boolean getIsEsNuevoTipoDelimiter() {
		return isEsNuevoTipoDelimiter;
	}

	public void setIsEsNuevoTipoDelimiter(Boolean isEsNuevoTipoDelimiter) {
		this.isEsNuevoTipoDelimiter = isEsNuevoTipoDelimiter;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDelimiter() {
		return esParaAccionDesdeFormularioTipoDelimiter;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDelimiter(Boolean esParaAccionDesdeFormularioTipoDelimiter) {
		this.esParaAccionDesdeFormularioTipoDelimiter = esParaAccionDesdeFormularioTipoDelimiter;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoDelimiter() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDelimiterConstantesFunciones.refrescarForeignKeysDescripcionesTipoDelimiter(this.tipodelimiterLogic.getTipoDelimiters());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDelimiterConstantesFunciones.refrescarForeignKeysDescripcionesTipoDelimiter(this.tipodelimiters);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodelimiterLogic.setTipoDelimiters(this.tipodelimiters);
			tipodelimiterLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDelimiterParameterReturnGeneral getTipoDelimiterParameterGeneral() {
		return this.tipodelimiterParameterGeneral;
	}
	
	public void setTipoDelimiterParameterGeneral(TipoDelimiterParameterReturnGeneral tipodelimiterParameterGeneral) {
		this.tipodelimiterParameterGeneral = tipodelimiterParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDelimiter() {
		return isPermisoTodoTipoDelimiter;
	}

	public void setIsPermisoTodoTipoDelimiter(Boolean isPermisoTodoTipoDelimiter) {
		this.isPermisoTodoTipoDelimiter = isPermisoTodoTipoDelimiter;
	}

	public Boolean getIsPermisoNuevoTipoDelimiter() {
		return isPermisoNuevoTipoDelimiter;
	}

	public void setIsPermisoNuevoTipoDelimiter(Boolean isPermisoNuevoTipoDelimiter) {
		this.isPermisoNuevoTipoDelimiter = isPermisoNuevoTipoDelimiter;
	}

	public Boolean getIsPermisoActualizarTipoDelimiter() {
		return isPermisoActualizarTipoDelimiter;
	}

	public void setIsPermisoActualizarTipoDelimiter(Boolean isPermisoActualizarTipoDelimiter) {
		this.isPermisoActualizarTipoDelimiter = isPermisoActualizarTipoDelimiter;
	}

	public Boolean getIsPermisoEliminarTipoDelimiter() {
		return isPermisoEliminarTipoDelimiter;
	}

	public void setIsPermisoEliminarTipoDelimiter(Boolean isPermisoEliminarTipoDelimiter) {
		this.isPermisoEliminarTipoDelimiter = isPermisoEliminarTipoDelimiter;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDelimiter() {
		return isPermisoGuardarCambiosTipoDelimiter;
	}

	public void setIsPermisoGuardarCambiosTipoDelimiter(Boolean isPermisoGuardarCambiosTipoDelimiter) {
		this.isPermisoGuardarCambiosTipoDelimiter = isPermisoGuardarCambiosTipoDelimiter;
	}
	
	public Boolean getIsPermisoConsultaTipoDelimiter() {
		return isPermisoConsultaTipoDelimiter;
	}

	public void setIsPermisoConsultaTipoDelimiter(Boolean isPermisoConsultaTipoDelimiter) {
		this.isPermisoConsultaTipoDelimiter = isPermisoConsultaTipoDelimiter;
	}

	public Boolean getIsPermisoBusquedaTipoDelimiter() {
		return isPermisoBusquedaTipoDelimiter;
	}

	public void setIsPermisoBusquedaTipoDelimiter(Boolean isPermisoBusquedaTipoDelimiter) {
		this.isPermisoBusquedaTipoDelimiter = isPermisoBusquedaTipoDelimiter;
	}

	public Boolean getIsPermisoReporteTipoDelimiter() {
		return isPermisoReporteTipoDelimiter;
	}

	public void setIsPermisoReporteTipoDelimiter(Boolean isPermisoReporteTipoDelimiter) {
		this.isPermisoReporteTipoDelimiter = isPermisoReporteTipoDelimiter;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDelimiter() {
		return isPermisoPaginacionMedioTipoDelimiter;
	}

	public void setIsPermisoPaginacionMedioTipoDelimiter(Boolean isPermisoPaginacionMedioTipoDelimiter) {
		this.isPermisoPaginacionMedioTipoDelimiter = isPermisoPaginacionMedioTipoDelimiter;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDelimiter() {
		return isPermisoPaginacionTodoTipoDelimiter;
	}

	public void setIsPermisoPaginacionTodoTipoDelimiter(Boolean isPermisoPaginacionTodoTipoDelimiter) {
		this.isPermisoPaginacionTodoTipoDelimiter = isPermisoPaginacionTodoTipoDelimiter;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDelimiter() {
		return isPermisoPaginacionAltoTipoDelimiter;
	}

	public void setIsPermisoPaginacionAltoTipoDelimiter(Boolean isPermisoPaginacionAltoTipoDelimiter) {
		this.isPermisoPaginacionAltoTipoDelimiter = isPermisoPaginacionAltoTipoDelimiter;
	}
	
	public Boolean getIsPermisoCopiarTipoDelimiter() {
		return isPermisoCopiarTipoDelimiter;
	}

	public void setIsPermisoCopiarTipoDelimiter(Boolean isPermisoCopiarTipoDelimiter) {
		this.isPermisoCopiarTipoDelimiter = isPermisoCopiarTipoDelimiter;
	}
	
	public Boolean getIsPermisoVerFormTipoDelimiter() {
		return isPermisoVerFormTipoDelimiter;
	}

	public void setIsPermisoVerFormTipoDelimiter(Boolean isPermisoVerFormTipoDelimiter) {
		this.isPermisoVerFormTipoDelimiter = isPermisoVerFormTipoDelimiter;
	}
	
	public Boolean getIsPermisoDuplicarTipoDelimiter() {
		return isPermisoDuplicarTipoDelimiter;
	}

	public void setIsPermisoDuplicarTipoDelimiter(Boolean isPermisoDuplicarTipoDelimiter) {
		this.isPermisoDuplicarTipoDelimiter = isPermisoDuplicarTipoDelimiter;
	}
	
	public Boolean getIsPermisoOrdenTipoDelimiter() {
		return isPermisoOrdenTipoDelimiter;
	}

	public void setIsPermisoOrdenTipoDelimiter(Boolean isPermisoOrdenTipoDelimiter) {
		this.isPermisoOrdenTipoDelimiter = isPermisoOrdenTipoDelimiter;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDelimiter() {
		return isVisibilidadCeldaNuevoTipoDelimiter;
	}

	public void setIsVisibilidadCeldaNuevoTipoDelimiter(Boolean isVisibilidadCeldaNuevoTipoDelimiter) {
		this.isVisibilidadCeldaNuevoTipoDelimiter = isVisibilidadCeldaNuevoTipoDelimiter;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDelimiter() {
		return isVisibilidadCeldaDuplicarTipoDelimiter;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDelimiter(Boolean isVisibilidadCeldaDuplicarTipoDelimiter) {
		this.isVisibilidadCeldaDuplicarTipoDelimiter = isVisibilidadCeldaDuplicarTipoDelimiter;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDelimiter() {
		return isVisibilidadCeldaCopiarTipoDelimiter;
	}

	public void setIsVisibilidadCeldaCopiarTipoDelimiter(Boolean isVisibilidadCeldaCopiarTipoDelimiter) {
		this.isVisibilidadCeldaCopiarTipoDelimiter = isVisibilidadCeldaCopiarTipoDelimiter;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDelimiter() {
		return isVisibilidadCeldaVerFormTipoDelimiter;
	}

	public void setIsVisibilidadCeldaVerFormTipoDelimiter(Boolean isVisibilidadCeldaVerFormTipoDelimiter) {
		this.isVisibilidadCeldaVerFormTipoDelimiter = isVisibilidadCeldaVerFormTipoDelimiter;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDelimiter() {
		return isVisibilidadCeldaOrdenTipoDelimiter;
	}

	public void setIsVisibilidadCeldaOrdenTipoDelimiter(Boolean isVisibilidadCeldaOrdenTipoDelimiter) {
		this.isVisibilidadCeldaOrdenTipoDelimiter = isVisibilidadCeldaOrdenTipoDelimiter;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDelimiter() {
		return isVisibilidadCeldaNuevoRelacionesTipoDelimiter;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDelimiter(Boolean isVisibilidadCeldaNuevoRelacionesTipoDelimiter) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter = isVisibilidadCeldaNuevoRelacionesTipoDelimiter;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDelimiter() {
		return isVisibilidadCeldaModificarTipoDelimiter;
	}

	public void setIsVisibilidadCeldaModificarTipoDelimiter(Boolean isVisibilidadCeldaModificarTipoDelimiter) {
		this.isVisibilidadCeldaModificarTipoDelimiter = isVisibilidadCeldaModificarTipoDelimiter;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDelimiter() {
		return isVisibilidadCeldaActualizarTipoDelimiter;
	}

	public void setIsVisibilidadCeldaActualizarTipoDelimiter(Boolean isVisibilidadCeldaActualizarTipoDelimiter) {
		this.isVisibilidadCeldaActualizarTipoDelimiter = isVisibilidadCeldaActualizarTipoDelimiter;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDelimiter() {
		return isVisibilidadCeldaEliminarTipoDelimiter;
	}

	public void setIsVisibilidadCeldaEliminarTipoDelimiter(Boolean isVisibilidadCeldaEliminarTipoDelimiter) {
		this.isVisibilidadCeldaEliminarTipoDelimiter = isVisibilidadCeldaEliminarTipoDelimiter;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDelimiter() {
		return isVisibilidadCeldaCancelarTipoDelimiter;
	}

	public void setIsVisibilidadCeldaCancelarTipoDelimiter(Boolean isVisibilidadCeldaCancelarTipoDelimiter) {
		this.isVisibilidadCeldaCancelarTipoDelimiter = isVisibilidadCeldaCancelarTipoDelimiter;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDelimiter() {
		return isVisibilidadCeldaGuardarTipoDelimiter;
	}

	public void setIsVisibilidadCeldaGuardarTipoDelimiter(Boolean isVisibilidadCeldaGuardarTipoDelimiter) {
		this.isVisibilidadCeldaGuardarTipoDelimiter = isVisibilidadCeldaGuardarTipoDelimiter;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDelimiter() {
		return isVisibilidadCeldaGuardarCambiosTipoDelimiter;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDelimiter(Boolean isVisibilidadCeldaGuardarCambiosTipoDelimiter) {
		this.isVisibilidadCeldaGuardarCambiosTipoDelimiter = isVisibilidadCeldaGuardarCambiosTipoDelimiter;
	}
		
	public TipoDelimiterSessionBean gettipodelimiterSessionBean() {
		return this.tipodelimiterSessionBean;
	}
	
	public void settipodelimiterSessionBean(TipoDelimiterSessionBean tipodelimiterSessionBean) {
		this.tipodelimiterSessionBean=tipodelimiterSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(TipoDelimiter tipodelimiter)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoDelimiter tipodelimiter,TipoDelimiter tipodelimiterAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDelimiter(tipodelimiter);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodelimiterAux.setId(tipodelimiter.getId());
		tipodelimiterAux.setVersionRow(tipodelimiter.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDelimiter();
		
			int intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiter =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodelimiter =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDelimiter(this.tipodelimiter,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(this.tipodelimiter);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodelimiterValidator.getInvalidValues(this.tipodelimiter);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodelimiterLogic.setDatosCliente(datosCliente);
			tipodelimiterLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodelimiterAux=new  TipoDelimiter();
				
				tipodelimiterAux.setIsNew(true);
				tipodelimiterAux.setIsChanged(true);
				
				tipodelimiterAux.setTipoDelimiterOriginal(this.tipodelimiter);
				
				tipodelimiterAux.setId(this.tipodelimiter.getId());	
				tipodelimiterAux.setVersionRow(this.tipodelimiter.getVersionRow());	
				tipodelimiterAux.setcodigo(this.tipodelimiter.getcodigo());	
				tipodelimiterAux.setnombre(this.tipodelimiter.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodelimiterSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodelimiterSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodelimiterAux,tipodelimiterLogic.getTipoDelimiters());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodelimiterAux,tipodelimiters);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodelimiterSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodelimiterSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodelimiterLogic.saveTipoDelimiters();//WithConnection
						//tipodelimiterLogic.getSetVersionRowTipoDelimiters();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodelimiter,tipodelimiterAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodelimiterAux=new  TipoDelimiter();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodelimiterSessionBean.getEsGuardarRelacionado() && this.tipodelimiter.getId()>=0)) {
						
					tipodelimiterAux.setIsNew(false);
				}
				
				tipodelimiterAux.setIsDeleted(false);
			
				tipodelimiterAux.setId(this.tipodelimiter.getId());	
				tipodelimiterAux.setVersionRow(this.tipodelimiter.getVersionRow());	
				tipodelimiterAux.setcodigo(this.tipodelimiter.getcodigo());	
				tipodelimiterAux.setnombre(this.tipodelimiter.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodelimiterAux,tipodelimiterLogic.getTipoDelimiters());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodelimiterAux,tipodelimiters);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodelimiterSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodelimiterSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodelimiterLogic.saveTipoDelimiters();//WithConnection
						//tipodelimiterLogic.getSetVersionRowTipoDelimiters();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodelimiter,tipodelimiterAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodelimiterAux=new  TipoDelimiter();
				
				tipodelimiterAux.setIsNew(false);
				tipodelimiterAux.setIsChanged(false);
				
				tipodelimiterAux.setIsDeleted(true);
				
				tipodelimiterAux.setId(this.tipodelimiter.getId());	
				tipodelimiterAux.setVersionRow(this.tipodelimiter.getVersionRow());	
				tipodelimiterAux.setcodigo(this.tipodelimiter.getcodigo());	
				tipodelimiterAux.setnombre(this.tipodelimiter.getnombre());	
				
				if(this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodelimiterAux.getId()>=0) {	
						this.tipodelimitersEliminados.add(tipodelimiterAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodelimiterAux,tipodelimiterLogic.getTipoDelimiters());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodelimiterAux,tipodelimiters);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodelimiterSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodelimiterSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodelimiterLogic.saveTipoDelimiters();//WithConnection
						//tipodelimiterLogic.getSetVersionRowTipoDelimiters();//WithConnection
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
					this.tipodelimiterLogic.getTipoDelimiters().addAll(this.tipodelimitersEliminados);
					
					tipodelimiterLogic.saveTipoDelimiters();//WithConnection
					//tipodelimiterLogic.getSetVersionRowTipoDelimiters();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipodelimitersEliminados= new ArrayList<TipoDelimiter>();		
			}
			
			if(this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Delimiter GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Delimiter",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodelimiter=tipodelimiterAux;
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
      		//this.finishProcessTipoDelimiter();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDelimiter tipodelimiterLocal) throws Exception {
		
		if(this.tipodelimiterSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDelimiter tipodelimiterLocal) throws Exception {	
		if(this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoDelimiterActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodelimiter =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodelimiter =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodelimiterValidator.getInvalidValues(this.tipodelimiter);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDelimiter tipodelimiter,List<TipoDelimiter> tipodelimiters) throws Exception {
		try	{		
			TipoDelimiterConstantesFunciones.actualizarLista(tipodelimiter,tipodelimiters,this.tipodelimiterSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDelimiter tipodelimiter,List<TipoDelimiter> tipodelimiters) throws Exception {
		try	{			
			TipoDelimiterConstantesFunciones.actualizarSelectedLista(tipodelimiter,tipodelimiters);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDelimiter> tipodelimitersLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodelimitersLocal=this.tipodelimiterLogic.getTipoDelimiters();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodelimitersLocal=this.tipodelimiters;
			}
			//ARCHITECTURE
		
			for(TipoDelimiter tipodelimiterLocal:tipodelimitersLocal) {
				if(this.permiteMantenimiento(tipodelimiterLocal) && tipodelimiterLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDelimiterConstantesFunciones.getTipoDelimiterLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDelimiterConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDelimiter.jLabelcodigoTipoDelimiter,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDelimiterConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDelimiter.jLabelnombreTipoDelimiter,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDelimiter.jLabelcodigoTipoDelimiter,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDelimiter.jLabelnombreTipoDelimiter,"");
		
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
		this.iIdNuevoTipoDelimiter--;	
		
		
		this.tipodelimiterAux=new TipoDelimiter();
		
		this.tipodelimiterAux.setId(this.iIdNuevoTipoDelimiter);
		this.tipodelimiterAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodelimiterLogic.getTipoDelimiters().add(this.tipodelimiterAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodelimiters.add(this.tipodelimiterAux);
		}
		//ARCHITECTURE
		
		this.tipodelimiter=this.tipodelimiterAux;
		
		if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDelimiter(this.tipodelimiter);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDelimiter(this.tipodelimiter);
		}
				
		//this.setDefaultControlesTipoDelimiter();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDelimiter();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDelimiter();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDelimiter();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDelimiter(this.tipodelimiterBean,this.tipodelimiter,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(this.tipodelimiter);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDelimiterConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodelimiterSessionBean.getConGuardarRelaciones()) {
			classes=TipoDelimiterConstantesFunciones.getClassesRelationshipsOfTipoDelimiter(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodelimiterReturnGeneral=tipodelimiterLogic.procesarEventosTipoDelimitersWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodelimiterLogic.getTipoDelimiters(),this.tipodelimiter,this.tipodelimiterParameterGeneral,this.isEsNuevoTipoDelimiter,classes);//this.tipodelimiterLogic.getTipoDelimiter()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDelimiter(this.tipodelimiterReturnGeneral,this.tipodelimiterBean,false);
		
		if(this.tipodelimiterReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDelimiter(this.tipodelimiterReturnGeneral.getTipoDelimiter());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDelimiter(this.tipodelimiterReturnGeneral.getTipoDelimiter());
		}
		
		if(this.tipodelimiterReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDelimiter(this.tipodelimiterReturnGeneral.getTipoDelimiter(),classes);//this.tipodelimiterBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDelimiter(this.tipodelimiter,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDelimiter();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDelimiter();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDelimiter(false);
						
			if(tipodelimiterSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDelimiter();
			}
			
			this.actualizarVisualTableDatosTipoDelimiter();
			
			this.jTableDatosTipoDelimiter.setRowSelectionInterval(this.getIndiceNuevoTipoDelimiter(), this.getIndiceNuevoTipoDelimiter());
			
			this.seleccionarFilaTablaTipoDelimiterActual();
						
			this.actualizarEstadoCeldasBotonesTipoDelimiter("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDelimiter(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldcodigoTipoDelimiter.setEnabled(isHabilitar && this.tipodelimiterConstantesFunciones.activarcodigoTipoDelimiter);
		this.jInternalFrameDetalleFormTipoDelimiter.jTextAreanombreTipoDelimiter.setEnabled(isHabilitar && this.tipodelimiterConstantesFunciones.activarnombreTipoDelimiter);	
		
	};
	
	public void setDefaultControlesTipoDelimiter() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDelimiter(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodelimiterSessionBean.setConGuardarRelaciones(true);			
			this.tipodelimiterSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDelimiter.jTabbedPaneRelacionesTipoDelimiter.setVisible(true);
			
					
		} else {
			//this.tipodelimiterSessionBean.setConGuardarRelaciones(false);			
			this.tipodelimiterSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDelimiter.jTabbedPaneRelacionesTipoDelimiter.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoDelimiter() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDelimiter tipodelimiterAux:this.tipodelimiterLogic.getTipoDelimiters()) {
				if(tipodelimiterAux.getId().equals(this.iIdNuevoTipoDelimiter)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDelimiter tipodelimiterAux:this.tipodelimiters) {
				if(tipodelimiterAux.getId().equals(this.iIdNuevoTipoDelimiter)) {
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
	
	public int getIndiceActualTipoDelimiter(TipoDelimiter tipodelimiter,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDelimiter tipodelimiterAux:this.tipodelimiterLogic.getTipoDelimiters()) {
				if(tipodelimiterAux.getId().equals(tipodelimiter.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDelimiter tipodelimiterAux:this.tipodelimiters) {
				if(tipodelimiterAux.getId().equals(tipodelimiter.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDelimiter(TipoDelimiter tipodelimiterOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDelimiter tipodelimiterAux:this.tipodelimiterLogic.getTipoDelimiters()) {
				if(tipodelimiterAux.getTipoDelimiterOriginal().getId().equals(tipodelimiterOriginal.getId())) {
					existe=true;
					tipodelimiterOriginal.setId(tipodelimiterAux.getId());
					tipodelimiterOriginal.setVersionRow(tipodelimiterAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDelimiter tipodelimiterAux:this.tipodelimiters) {
				if(tipodelimiterAux.getTipoDelimiterOriginal().getId().equals(tipodelimiterOriginal.getId())) {
					existe=true;
					tipodelimiterOriginal.setId(tipodelimiterAux.getId());
					tipodelimiterOriginal.setVersionRow(tipodelimiterAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDelimiter(Boolean esParaCancelar) throws Exception {
		tipodelimitersAux=new ArrayList<TipoDelimiter>();
		tipodelimiterAux=new TipoDelimiter();
		
		if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDelimiter tipodelimiterAux:this.tipodelimiterLogic.getTipoDelimiters()) {
					if(tipodelimiterAux.getId()<0) {
						tipodelimitersAux.add(tipodelimiterAux);
					}		
				}
				this.iIdNuevoTipoDelimiter=0L;
				this.tipodelimiterLogic.getTipoDelimiters().removeAll(tipodelimitersAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDelimiter tipodelimiterAux:this.tipodelimiters) {
					if(tipodelimiterAux.getId()<0) {
						tipodelimitersAux.add(tipodelimiterAux);
					}		
				}
				this.iIdNuevoTipoDelimiter=0L;
				this.tipodelimiters.removeAll(tipodelimitersAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDelimiter 
					&& this.tipodelimiterLogic.getTipoDelimiters().size()>0
					) {
					tipodelimiterAux=this.tipodelimiterLogic.getTipoDelimiters().get(this.tipodelimiterLogic.getTipoDelimiters().size() - 1);
				
					if(tipodelimiterAux.getId()<0) {
						this.tipodelimiterLogic.getTipoDelimiters().remove(tipodelimiterAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDelimiter && this.tipodelimiters.size()>0) {
					tipodelimiterAux=this.tipodelimiters.get(this.tipodelimiters.size() - 1);
				
					if(tipodelimiterAux.getId()<0) {
						this.tipodelimiters.remove(tipodelimiterAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDelimiter(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodelimiter.getId()<0) {
				this.tipodelimiterLogic.getTipoDelimiters().remove(this.tipodelimiter);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodelimiter.getId()<0) {
				this.tipodelimiters.remove(this.tipodelimiter);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDelimiter(List<TipoDelimiter> tipodelimitersAux) throws Exception {
		TipoDelimiterConstantesFunciones.setEstadosInicialesTipoDelimiter(tipodelimitersAux);
	}
	
	public void setEstadosInicialesTipoDelimiter(TipoDelimiter tipodelimiterAux) throws Exception {
		TipoDelimiterConstantesFunciones.setEstadosInicialesTipoDelimiter(tipodelimiterAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDelimiterActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDelimiter("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDelimiterActual()) {
				if(!this.isEsNuevoTipoDelimiter) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDelimiter("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDelimiter=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDelimiterActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Delimiter ?", "MANTENIMIENTO DE Tipo Delimiter", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDelimiter("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDelimiter tipodelimiter) throws Exception {
		TipoDelimiterConstantesFunciones.seleccionarAsignar(this.tipodelimiter,tipodelimiter);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDelimiter=this.isPermisoActualizarOriginalTipoDelimiter;
			
			
			this.seleccionarAsignar(tipodelimiter);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDelimiterConstantesFunciones.quitarEspaciosTipoDelimiter(this.tipodelimiter,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDelimiter("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodelimiterSessionBean.setsFuncionBusquedaRapida(this.tipodelimiterSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDelimiter) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDelimiter(esParaCancelar);				
				this.cancelarNuevoTipoDelimiter(esParaCancelar);								
			}
			
			this.tipodelimiter=new TipoDelimiter();
			
			this.inicializarTipoDelimiter();
			
			this.actualizarEstadoCeldasBotonesTipoDelimiter("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDelimiter() throws Exception {
		try {
			TipoDelimiterConstantesFunciones.inicializarTipoDelimiter(this.tipodelimiter);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodelimiterLogic.getTipoDelimiters().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDelimiters(String sAccionBusqueda,List<TipoDelimiter> tipodelimitersParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDelimiter"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDelimiterMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDelimiterMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDelimiter"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Delimiters");		
		parameters.put("busquedapor", TipoDelimiterConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDelimiter=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDelimiterConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDelimiterConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDelimiter=new JRBeanArrayDataSource(TipoDelimiterJInternalFrame.TraerTipoDelimiterBeans(tipodelimitersParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDelimiter);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDelimiterConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDelimiterConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDelimiterBean.TraerTipoDelimiterBeans(tipodelimitersParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDelimiters(sAccionBusqueda,sTipoArchivoReporte,tipodelimitersParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDelimiters(sAccionBusqueda,sTipoArchivoReporte,tipodelimitersParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDelimiterActionPerformed(null);
					//this.generarExcelReporteTipoDelimiters(sAccionBusqueda,sTipoArchivoReporte,tipodelimitersParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDelimiters(sAccionBusqueda,sTipoArchivoReporte,tipodelimitersParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDelimiters(sAccionBusqueda,sTipoArchivoReporte,tipodelimitersParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDelimiters(sAccionBusqueda,sTipoArchivoReporte,tipodelimitersParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDelimiters(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDelimiter> tipodelimitersParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodelimiter";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDelimiters");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDelimiter("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDelimiter tipodelimiter : tipodelimitersParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDelimiterConstantesFunciones.generarExcelReporteDataTipoDelimiter("NORMAL",row,workbook,tipodelimiter,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Delimiter",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDelimiter(String sTipo,Row row,Workbook workbook) {
		
		TipoDelimiterConstantesFunciones.generarExcelReporteHeaderTipoDelimiter(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDelimiters(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDelimiter> tipodelimitersParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodelimiter_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDelimiters");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDelimiter tipodelimiter : tipodelimitersParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDelimiterConstantesFunciones.getTipoDelimiterDescripcion(tipodelimiter));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDelimiterConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDelimiterConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodelimiter.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDelimiterConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDelimiterConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodelimiter.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Delimiter",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDelimiters(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDelimiter> tipodelimitersParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDelimiter> tipodelimitersRespaldo=null;
		
		classes=TipoDelimiterConstantesFunciones.getClassesRelationshipsOfTipoDelimiter(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodelimiterLogic.setDatosCliente(this.datosCliente);
		this.tipodelimiterLogic.setDatosDeep(this.datosDeep);
		this.tipodelimiterLogic.setIsConDeep(true);
		
		tipodelimitersRespaldo=this.tipodelimiterLogic.getTipoDelimiters();
		
		this.tipodelimiterLogic.setTipoDelimiters(tipodelimitersParaReportes);	
		this.tipodelimiterLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodelimitersParaReportes=this.tipodelimiterLogic.getTipoDelimiters();
		this.tipodelimiterLogic.setTipoDelimiters(tipodelimitersRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodelimiter_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDelimiters");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDelimiter("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDelimiter tipodelimiter : tipodelimitersParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDelimiter("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDelimiterConstantesFunciones.generarExcelReporteDataTipoDelimiter("NORMAL",row,workbook,tipodelimiter,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoDelimiterConstantesFunciones.getTipoDelimiterDescripcion(tipodelimiter));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Delimiter",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDelimiter.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDelimiter.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDelimiter.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDelimiter.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDelimiter() throws Exception {		
		this.startProcessTipoDelimiter(true);
	}
	
	public void startProcessTipoDelimiter(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoDelimiter, this.jScrollPanelDatosTipoDelimiter,this.jPanelPaginacionTipoDelimiter, this.jScrollPanelDatosEdicionTipoDelimiter, this.jPanelAccionesTipoDelimiter,this.jPanelAccionesFormularioTipoDelimiter,this.jmenuBarTipoDelimiter,this.jmenuBarDetalleTipoDelimiter,this.jTtoolBarTipoDelimiter,this.jTtoolBarDetalleTipoDelimiter);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDelimiter=null; 
		
		final JPanel jPanelParametrosReportesTipoDelimiter=this.jPanelParametrosReportesTipoDelimiter;
		//final JScrollPane jScrollPanelDatosTipoDelimiter=this.jScrollPanelDatosTipoDelimiter;
		final JTable jTableDatosTipoDelimiter=this.jTableDatosTipoDelimiter;		
		final JPanel jPanelPaginacionTipoDelimiter=this.jPanelPaginacionTipoDelimiter;
		//final JScrollPane jScrollPanelDatosEdicionTipoDelimiter=this.jScrollPanelDatosEdicionTipoDelimiter;
		final JPanel jPanelAccionesTipoDelimiter=this.jPanelAccionesTipoDelimiter;
		
		JPanel jPanelCamposAuxiliarTipoDelimiter=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDelimiter=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
			jPanelCamposAuxiliarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jPanelCamposTipoDelimiter;
			jPanelAccionesFormularioAuxiliarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jPanelAccionesFormularioTipoDelimiter;
		}
		
		final JPanel jPanelCamposTipoDelimiter=jPanelCamposAuxiliarTipoDelimiter;
		final JPanel jPanelAccionesFormularioTipoDelimiter=jPanelAccionesFormularioAuxiliarTipoDelimiter;
		
		
		final JMenuBar jmenuBarTipoDelimiter=this.jmenuBarTipoDelimiter;
		final JToolBar jTtoolBarTipoDelimiter=this.jTtoolBarTipoDelimiter;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDelimiter=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDelimiter=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
			jmenuBarDetalleAuxiliarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jmenuBarDetalleTipoDelimiter;
			jTtoolBarDetalleAuxiliarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jTtoolBarDetalleTipoDelimiter;
		}
		
		final JMenuBar jmenuBarDetalleTipoDelimiter=jmenuBarDetalleAuxiliarTipoDelimiter;
		final JToolBar jTtoolBarDetalleTipoDelimiter=jTtoolBarDetalleAuxiliarTipoDelimiter;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDelimiter;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDelimiter;
			processRunnable.jTableDatos=jTableDatosTipoDelimiter;
			processRunnable.jPanelCampos=jPanelCamposTipoDelimiter;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDelimiter;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDelimiter;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDelimiter;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDelimiter;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDelimiter;
			processRunnable.jTtoolBar=jTtoolBarTipoDelimiter;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDelimiter;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDelimiter ,jPanelParametrosReportesTipoDelimiter,jTableDatosTipoDelimiter, /*jScrollPanelDatosTipoDelimiter,*/jPanelCamposTipoDelimiter,jPanelPaginacionTipoDelimiter, /*jScrollPanelDatosEdicionTipoDelimiter,*/ jPanelAccionesTipoDelimiter,jPanelAccionesFormularioTipoDelimiter,jmenuBarTipoDelimiter,jmenuBarDetalleTipoDelimiter,jTtoolBarTipoDelimiter,jTtoolBarDetalleTipoDelimiter);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoDelimiter, jScrollPanelDatosTipoDelimiter,jPanelPaginacionTipoDelimiter, jScrollPanelDatosEdicionTipoDelimiter, jPanelAccionesTipoDelimiter,jPanelAccionesFormularioTipoDelimiter,jmenuBarTipoDelimiter,jmenuBarDetalleTipoDelimiter,jTtoolBarTipoDelimiter,jTtoolBarDetalleTipoDelimiter);
						
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
	
	public void finishProcessTipoDelimiter() {// throws Exception 
		this.finishProcessTipoDelimiter(true);
	}
	
	public void finishProcessTipoDelimiter(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoDelimiter, this.jScrollPanelDatosTipoDelimiter,this.jPanelPaginacionTipoDelimiter, this.jScrollPanelDatosEdicionTipoDelimiter, this.jPanelAccionesTipoDelimiter,this.jPanelAccionesFormularioTipoDelimiter,this.jmenuBarTipoDelimiter,this.jmenuBarDetalleTipoDelimiter,this.jTtoolBarTipoDelimiter,this.jTtoolBarDetalleTipoDelimiter);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDelimiter=null; 
		
		final JPanel jPanelParametrosReportesTipoDelimiter=this.jPanelParametrosReportesTipoDelimiter;
		//final JScrollPane jScrollPanelDatosTipoDelimiter=this.jScrollPanelDatosTipoDelimiter;
		final JTable jTableDatosTipoDelimiter=this.jTableDatosTipoDelimiter;		
		final JPanel jPanelPaginacionTipoDelimiter=this.jPanelPaginacionTipoDelimiter;
		//final JScrollPane jScrollPanelDatosEdicionTipoDelimiter=this.jScrollPanelDatosEdicionTipoDelimiter;
		final JPanel jPanelAccionesTipoDelimiter=this.jPanelAccionesTipoDelimiter;
		
		JPanel jPanelCamposAuxiliarTipoDelimiter=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDelimiter=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
			jPanelCamposAuxiliarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jPanelCamposTipoDelimiter;
			jPanelAccionesFormularioAuxiliarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jPanelAccionesFormularioTipoDelimiter;
		}
		
		final JPanel jPanelCamposTipoDelimiter=jPanelCamposAuxiliarTipoDelimiter;
		final JPanel jPanelAccionesFormularioTipoDelimiter=jPanelAccionesFormularioAuxiliarTipoDelimiter;
		
		
		final JMenuBar jmenuBarTipoDelimiter=this.jmenuBarTipoDelimiter;		
		final JToolBar jTtoolBarTipoDelimiter=this.jTtoolBarTipoDelimiter;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDelimiter=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDelimiter=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
			jmenuBarDetalleAuxiliarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jmenuBarDetalleTipoDelimiter;
			jTtoolBarDetalleAuxiliarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jTtoolBarDetalleTipoDelimiter;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDelimiter=jmenuBarDetalleAuxiliarTipoDelimiter;
		final JToolBar jTtoolBarDetalleTipoDelimiter=jTtoolBarDetalleAuxiliarTipoDelimiter;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDelimiter;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDelimiter;
			processRunnable.jTableDatos=jTableDatosTipoDelimiter;
			processRunnable.jPanelCampos=jPanelCamposTipoDelimiter;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDelimiter;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDelimiter;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDelimiter;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDelimiter;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDelimiter;
			processRunnable.jTtoolBar=jTtoolBarTipoDelimiter;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDelimiter;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDelimiter ,jPanelParametrosReportesTipoDelimiter, jTableDatosTipoDelimiter,/*jScrollPanelDatosTipoDelimiter,*/jPanelCamposTipoDelimiter,jPanelPaginacionTipoDelimiter, /*jScrollPanelDatosEdicionTipoDelimiter,*/ jPanelAccionesTipoDelimiter,jPanelAccionesFormularioTipoDelimiter,jmenuBarTipoDelimiter,jmenuBarDetalleTipoDelimiter,jTtoolBarTipoDelimiter,jTtoolBarDetalleTipoDelimiter));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDelimiter(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDelimiter(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDelimiter(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDelimiter(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDelimiter,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDelimiter,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDelimiter(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDelimiter,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDelimiter,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodelimiterConstantesFunciones.getsFinalQueryTipoDelimiter();
		String  finalQueryPaginacionTodos=this.tipodelimiterConstantesFunciones.getsFinalQueryTipoDelimiter();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDelimiterConstantesFunciones.getArrayColumnasGlobalesNoTipoDelimiter(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDelimiterConstantesFunciones.getArrayColumnasGlobalesTipoDelimiter(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDelimiterConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodelimitersEliminados= new ArrayList<TipoDelimiter>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDelimiter();
		
				///*TipoDelimiterSessionBean*/this.tipodelimiterSessionBean=new TipoDelimiterSessionBean();
			
			if(this.tipodelimiterSessionBean==null) {
				this.tipodelimiterSessionBean=new TipoDelimiterSessionBean();
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
					this.iNumeroPaginacion=TipoDelimiterConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDelimiterConstantesFunciones.getClassesForeignKeysOfTipoDelimiter(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodelimiter."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodelimitersAux= new ArrayList<TipoDelimiter>();
			
				
			tipodelimiterLogic.setDatosCliente(this.datosCliente);
			tipodelimiterLogic.setDatosDeep(this.datosDeep);
			tipodelimiterLogic.setIsConDeep(true);
			
			
			tipodelimiterLogic.getTipoDelimiterDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodelimiterLogic.getTodosTipoDelimiters(finalQueryGlobal,pagination);
					
					//tipodelimiterLogic.getTodosTipoDelimitersWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodelimiterLogic.getTipoDelimiters()==null|| tipodelimiterLogic.getTipoDelimiters().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodelimitersAux= new ArrayList<TipoDelimiter>();
							tipodelimitersAux.addAll(tipodelimiterLogic.getTipoDelimiters());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodelimitersAux= new ArrayList<TipoDelimiter>();
							tipodelimitersAux.addAll(tipodelimiters);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodelimiterLogic.getTodosTipoDelimiters(finalQueryGlobal+"",this.pagination);												
							
							//tipodelimiterLogic.getTodosTipoDelimitersWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDelimiters("Todos",tipodelimiterLogic.getTipoDelimiters() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodelimiterLogic.setTipoDelimiters(new ArrayList<TipoDelimiter>());					
							tipodelimiterLogic.getTipoDelimiters().addAll(tipodelimitersAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodelimiters=new ArrayList<TipoDelimiter>();
							tipodelimiters.addAll(tipodelimitersAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDelimiter=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDelimiter=this.idActual;
				
				} else if(this.idTipoDelimiterActual!=null && this.idTipoDelimiterActual!=0L) {
					idTipoDelimiter=idTipoDelimiterActual;
				}
				
					
				this.sDetalleReporte=TipoDelimiterConstantesFunciones.getDetalleIndicePorId(idTipoDelimiter);
				
				this.tipodelimiters=new ArrayList<TipoDelimiter>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodelimiterLogic.getEntity(idTipoDelimiter);
					
					//tipodelimiterLogic.getEntityWithConnection(idTipoDelimiter);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodelimiterLogic.setTipoDelimiters(new ArrayList<TipoDelimiter>());
					tipodelimiterLogic.getTipoDelimiters().add(tipodelimiterLogic.getTipoDelimiter());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodelimiters=new ArrayList<TipoDelimiter>();
					this.tipodelimiters.add(tipodelimiter);
				}
				
				if(tipodelimiterLogic.getTipoDelimiter()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDelimiter();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDelimiter();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodelimiterLogic.getTipoDelimiters().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodelimiters.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodelimiterLogic.getTipoDelimiters().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodelimiters.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDelimiter tipodelimiter) {
		Boolean permite=true;
		
		if(this.tipodelimiter.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDelimiterConstantesFunciones.getOrderByListaTipoDelimiter();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDelimiterConstantesFunciones.getOrderByListaTipoDelimiter();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDelimiter tipodelimiter:tipodelimiterLogic.getTipoDelimiters()) {
				if(tipodelimiter.getsType().equals(Constantes2.S_TOTALES)) {
					tipodelimiterTotales=tipodelimiter;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDelimiter tipodelimiter:this.tipodelimiters) {
				if(tipodelimiter.getsType().equals(Constantes2.S_TOTALES)) {
					tipodelimiterTotales=tipodelimiter;
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
			this.tipodelimiterAux=new TipoDelimiter();
			this.tipodelimiterAux.setsType(Constantes2.S_TOTALES);
			this.tipodelimiterAux.setIsNew(false);
			this.tipodelimiterAux.setIsChanged(false);
			this.tipodelimiterAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDelimiterConstantesFunciones.TotalizarValoresFilaTipoDelimiter(this.tipodelimiterLogic.getTipoDelimiters(),this.tipodelimiterAux);
				
				this.tipodelimiterLogic.getTipoDelimiters().add(this.tipodelimiterAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDelimiterConstantesFunciones.TotalizarValoresFilaTipoDelimiter(this.tipodelimiters,this.tipodelimiterAux);
				
				this.tipodelimiters.add(this.tipodelimiterAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodelimiterTotales=new TipoDelimiter();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodelimiterLogic.getTipoDelimiters().remove(tipodelimiterTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodelimiters.remove(tipodelimiterTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodelimiterTotales=new TipoDelimiter();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDelimiter tipodelimiter:tipodelimiterLogic.getTipoDelimiters()) {
				if(tipodelimiter.getsType().equals(Constantes2.S_TOTALES)) {
					tipodelimiterTotales=tipodelimiter;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDelimiterConstantesFunciones.TotalizarValoresFilaTipoDelimiter(this.tipodelimiterLogic.getTipoDelimiters(),tipodelimiterTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDelimiter tipodelimiter:this.tipodelimiters) {
				if(tipodelimiter.getsType().equals(Constantes2.S_TOTALES)) {
					tipodelimiterTotales=tipodelimiter;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDelimiterConstantesFunciones.TotalizarValoresFilaTipoDelimiter(this.tipodelimiters,tipodelimiterTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoDelimiter() {
		this.isPermisoTodoTipoDelimiter=false;
		this.isPermisoNuevoTipoDelimiter=false;
		this.isPermisoActualizarTipoDelimiter=false;
		this.isPermisoActualizarOriginalTipoDelimiter=false;
		this.isPermisoEliminarTipoDelimiter=false;
		this.isPermisoGuardarCambiosTipoDelimiter=false;
		this.isPermisoConsultaTipoDelimiter=false;
		this.isPermisoBusquedaTipoDelimiter=false;
		this.isPermisoReporteTipoDelimiter=false;		
		this.isPermisoOrdenTipoDelimiter=false;		
		this.isPermisoPaginacionMedioTipoDelimiter=false;		
		this.isPermisoPaginacionAltoTipoDelimiter=false;
		this.isPermisoPaginacionTodoTipoDelimiter=false;
		this.isPermisoCopiarTipoDelimiter=false;		
		this.isPermisoVerFormTipoDelimiter=false;		
		this.isPermisoDuplicarTipoDelimiter=false;		
		this.isPermisoOrdenTipoDelimiter=false;		
	}
	
	public void setPermisosUsuarioTipoDelimiter(Boolean isPermiso) {
		this.isPermisoTodoTipoDelimiter=isPermiso;
		this.isPermisoNuevoTipoDelimiter=isPermiso;
		this.isPermisoActualizarTipoDelimiter=isPermiso;
		this.isPermisoActualizarOriginalTipoDelimiter=isPermiso;
		this.isPermisoEliminarTipoDelimiter=isPermiso;
		this.isPermisoGuardarCambiosTipoDelimiter=isPermiso;
		this.isPermisoConsultaTipoDelimiter=isPermiso;
		this.isPermisoBusquedaTipoDelimiter=isPermiso;
		this.isPermisoReporteTipoDelimiter=isPermiso;
		this.isPermisoOrdenTipoDelimiter=isPermiso;		
		this.isPermisoPaginacionMedioTipoDelimiter=isPermiso;		
		this.isPermisoPaginacionAltoTipoDelimiter=isPermiso;		
		this.isPermisoPaginacionTodoTipoDelimiter=isPermiso;		
		this.isPermisoCopiarTipoDelimiter=isPermiso;		
		this.isPermisoVerFormTipoDelimiter=isPermiso;		
		this.isPermisoDuplicarTipoDelimiter=isPermiso;
		this.isPermisoOrdenTipoDelimiter=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDelimiter(Boolean isPermiso) {
		//this.isPermisoTodoTipoDelimiter=isPermiso;
		this.isPermisoNuevoTipoDelimiter=isPermiso;
		this.isPermisoActualizarTipoDelimiter=isPermiso;
		this.isPermisoActualizarOriginalTipoDelimiter=isPermiso;
		this.isPermisoEliminarTipoDelimiter=isPermiso;
		this.isPermisoGuardarCambiosTipoDelimiter=isPermiso;
		//this.isPermisoConsultaTipoDelimiter=isPermiso;
		//this.isPermisoBusquedaTipoDelimiter=isPermiso;
		//this.isPermisoReporteTipoDelimiter=isPermiso;
		//this.isPermisoOrdenTipoDelimiter=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDelimiter=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDelimiter=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDelimiter=isPermiso;		
		//this.isPermisoCopiarTipoDelimiter=isPermiso;		
		//this.isPermisoDuplicarTipoDelimiter=isPermiso;
		//this.isPermisoOrdenTipoDelimiter=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDelimiterClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoDelimiterJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDelimiter(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDelimiterClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDelimiterClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDelimiterClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDelimiterClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoDelimiter() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDelimiterJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDelimiterConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDelimiter=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDelimiter=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDelimiter=this.isPermisoActualizarTipoDelimiter;
			this.isPermisoEliminarTipoDelimiter=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDelimiter=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDelimiter=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDelimiter=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDelimiter=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDelimiter=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDelimiter=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDelimiter=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDelimiter=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDelimiter=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDelimiter=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDelimiter=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDelimiter=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDelimiter=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDelimiter.setToolTipText(this.jTableDatosTipoDelimiter.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDelimiter(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDelimiter(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDelimiterJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDelimiterJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDelimiter() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoDelimiterListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDelimiterListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDelimiterJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDelimiterListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoDelimiterListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDelimiter()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoDelimiter()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDelimiter(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDelimiter()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDelimiter();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDelimiter(TipoDelimiter tipodelimiter)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDelimiter(TipoDelimiter tipodelimiter,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDelimiter()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDelimiter()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDelimiter()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDelimiter()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDelimiter()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDelimiter()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDelimiter(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDelimiter()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoDelimiterBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDelimiterBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDelimiterBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodelimiterSessionBean=new TipoDelimiterSessionBean(); 
		this.tipodelimiterConstantesFunciones=new TipoDelimiterConstantesFunciones(); 
		this.tipodelimiterBean=new TipoDelimiter();//(this.tipodelimiterConstantesFunciones); 		
		this.tipodelimiterReturnGeneral=new TipoDelimiterParameterReturnGeneral(); 
		
		this.tipodelimiterSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodelimiterSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDelimiterBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDelimiterBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDelimiterBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDelimiter(true);
			
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
			
			this.tipodelimiterConstantesFunciones=new TipoDelimiterConstantesFunciones(); 
			this.tipodelimiterBean=new TipoDelimiter();//this.tipodelimiterConstantesFunciones); 			
			this.tipodelimiterReturnGeneral=new TipoDelimiterParameterReturnGeneral(); 
		
			TipoDelimiterBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Delimiter Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodelimiter=new TipoDelimiter();
			this.tipodelimiters = new ArrayList<TipoDelimiter>();
			this.tipodelimitersAux = new ArrayList<TipoDelimiter>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic=new TipoDelimiterLogic();
				this.tipodelimiterLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodelimiterSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodelimiterSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDelimiter);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDelimiter!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDelimiter);	
					}
					
					if(this.jInternalFrameImportacionTipoDelimiter!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDelimiter);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDelimiter!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDelimiter);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDelimiter);
				this.jInternalFrameDetalleFormTipoDelimiter.setVisible(false);
				this.jInternalFrameDetalleFormTipoDelimiter.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDelimiter!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDelimiter);
					this.jInternalFrameReporteDinamicoTipoDelimiter.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDelimiter.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDelimiter!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDelimiter);
					this.jInternalFrameImportacionTipoDelimiter.setVisible(false);
					this.jInternalFrameImportacionTipoDelimiter.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDelimiter!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDelimiter);
					this.jInternalFrameOrderByTipoDelimiter.setVisible(false);
					this.jInternalFrameOrderByTipoDelimiter.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDelimiterActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDelimiterConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodelimiterReturnGeneral=new TipoDelimiterParameterReturnGeneral();
			
			this.tipodelimiterParameterGeneral=new TipoDelimiterParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodelimiterLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDelimiterJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDelimiterConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodelimiterSessionBean.getEsGuardarRelacionado(),this.tipodelimiterSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDelimiterConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodelimiterSessionBean.getEsGuardarRelacionado(),this.tipodelimiterSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDelimiter=false;
			this.isVisibilidadCeldaDuplicarTipoDelimiter=true;
			this.isVisibilidadCeldaCopiarTipoDelimiter=true;
			this.isVisibilidadCeldaVerFormTipoDelimiter=true;
			this.isVisibilidadCeldaOrdenTipoDelimiter=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=false;
			this.isVisibilidadCeldaModificarTipoDelimiter=false;
			this.isVisibilidadCeldaActualizarTipoDelimiter=false;
			this.isVisibilidadCeldaEliminarTipoDelimiter=false;
			this.isVisibilidadCeldaCancelarTipoDelimiter=false;
			this.isVisibilidadCeldaGuardarTipoDelimiter=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDelimiter=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDelimiter("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDelimiter();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDelimiter(false);
			
			this.setPermisosUsuarioTipoDelimiter();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodelimiterSessionBean.getEsGuardarRelacionado() && this.tipodelimiterSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDelimiterClasesRelacionadas();
			}
			
			if(this.tipodelimiterSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDelimiterClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDelimiterJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDelimiter();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDelimiter();
			}
			
			if(!this.isPermisoBusquedaTipoDelimiter) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDelimiter,this.isPermisoPaginacionMedioTipoDelimiter,this.isPermisoPaginacionTodoTipoDelimiter);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDelimiterConstantesFunciones.getTiposSeleccionarTipoDelimiter());
				
				this.tiposColumnasSelect=TipoDelimiterConstantesFunciones.getTiposSeleccionarTipoDelimiter(true);
				
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
			//if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDelimiter();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoDelimiter(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoDelimiter(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDelimiter() ;
			
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
				tipodelimiterImplementable= (TipoDelimiterImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDelimiterConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodelimiterImplementableHome= (TipoDelimiterImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDelimiterConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodelimiters= new ArrayList<TipoDelimiter>();
			this.tipodelimitersEliminados= new ArrayList<TipoDelimiter>();
						
			this.isEsNuevoTipoDelimiter=false;
			this.esParaAccionDesdeFormularioTipoDelimiter=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDelimiter(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDelimiter();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDelimiterConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDelimiter("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDelimiter(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDelimiter();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDelimiter();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDelimiter(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDelimiter: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDelimiter() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDelimiter")) {
				iIndex=this.jInternalFrameDetalleFormTipoDelimiter.jTabbedPaneRelacionesTipoDelimiter.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDelimiter.jTabbedPaneRelacionesTipoDelimiter.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDelimiter();	
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
	
	public void cargarCombosForeignKeyTipoDelimiter(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDelimiter(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDelimiter(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDelimiterListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDelimiter();
		
		this.cargarCombosFrameForeignKeyTipoDelimiter();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDelimiter();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDelimiter();
		}
	}
	
	
	
	public void jButtonNuevoTipoDelimiterActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodelimiterSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDelimiter==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			
			
			if(jTableDatosTipoDelimiter.getRowCount()>=1) {
				jTableDatosTipoDelimiter.removeRowSelectionInterval(0, jTableDatosTipoDelimiter.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDelimiter=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDelimiter(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDelimiter(true);			
			//this.tipodelimiter=new TipoDelimiter();
			//this.tipodelimiter.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDelimiter(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDelimiter() ;
			
			if(TipoDelimiterJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDelimiter(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodelimiter);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);				
			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			
			if(this.tipodelimiterSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDelimiter: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDelimiterActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDelimiter.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDelimiter.getSelectedRows().length;			
			}
			
			tipodelimitersSeleccionados=this.getTipoDelimitersSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDelimiter--;			
				//TipoDelimiter tipodelimiterAux= new TipoDelimiter();			
				//tipodelimiterAux.setId(this.iIdNuevoTipoDelimiter);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDelimiter tipodelimiterOrigen=new TipoDelimiter();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDelimiter tipodelimiterOrigen : tipodelimitersSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodelimiterOrigen =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodelimiterOrigen =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDelimiter();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodelimiter.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDelimiter(tipodelimiterOrigen,this.tipodelimiter,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(this.tipodelimiter);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodelimiterLogic.getTipoDelimiters().add(this.tipodelimiterAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodelimiters.add(this.tipodelimiterAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDelimiter(false);
				
				this.jTableDatosTipoDelimiter.setRowSelectionInterval(this.getIndiceNuevoTipoDelimiter(), this.getIndiceNuevoTipoDelimiter());
				
				int iLastRow =  this.jTableDatosTipoDelimiter.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDelimiter.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDelimiter.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDelimiter(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();									
		
			TipoDelimiter tipodelimiterOrigen=new TipoDelimiter();
			TipoDelimiter tipodelimiterDestino=new TipoDelimiter();
				
			tipodelimitersSeleccionados=this.getTipoDelimitersSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDelimiter.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodelimitersSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDelimiter.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodelimiterOrigen =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodelimiterOrigen =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodelimiterDestino =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodelimiterDestino =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodelimiterOrigen =tipodelimitersSeleccionados.get(0);
				tipodelimiterDestino =tipodelimitersSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDelimiter(tipodelimiterOrigen,tipodelimiterDestino,true,false);
				
				tipodelimiterDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodelimiterDestino,tipodelimiterLogic.getTipoDelimiters());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodelimiterDestino,tipodelimiters);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDelimiter(false);
				
				//this.jTableDatosTipoDelimiter.setRowSelectionInterval(this.getIndiceNuevoTipoDelimiter(), this.getIndiceNuevoTipoDelimiter());
				
				int iLastRow =  this.jTableDatosTipoDelimiter.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDelimiter.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDelimiter.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDelimiter(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDelimiter==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDelimiter.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDelimiter.isVisible();
			
			
			this.jPanelParametrosReportesTipoDelimiter.setVisible(!isVisible);
			this.jPanelPaginacionTipoDelimiter.setVisible(!isVisible);
			this.jPanelAccionesTipoDelimiter.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDelimiter();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDelimiter();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDelimiter();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDelimiter();
			
			this.abrirFrameOrderByTipoDelimiter();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDelimiter();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDelimiter(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDelimiter);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDelimiter.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDelimiter.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDelimiter.setSize(this.jInternalFrameDetalleFormTipoDelimiter.iWidthFormulario,this.jInternalFrameDetalleFormTipoDelimiter.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDelimiter.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDelimiter.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDelimiter.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDelimiter.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDelimiter.jContentPaneDetalleTipoDelimiter.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDelimiter.jTabbedPaneRelacionesTipoDelimiter.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDelimiter.jContentPaneDetalleTipoDelimiter.getWidth(),TipoDelimiterConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDelimiter.jTabbedPaneRelacionesTipoDelimiter.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDelimiter.jContentPaneDetalleTipoDelimiter.getWidth(),TipoDelimiterConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDelimiter.jTabbedPaneRelacionesTipoDelimiter.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDelimiter.jContentPaneDetalleTipoDelimiter.getWidth(),TipoDelimiterConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDelimiter.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDelimiter.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDelimiter() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDelimiter==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDelimiter=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDelimiter,false,this);
				} else {
					this.jInternalFrameOrderByTipoDelimiter=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDelimiter,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDelimiter);
				this.jInternalFrameOrderByTipoDelimiter.setVisible(false);
				this.jInternalFrameOrderByTipoDelimiter.setSelected(false);
				
				this.jInternalFrameOrderByTipoDelimiter.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDelimiter"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDelimiter();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDelimiter() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDelimiter==null) {
				
				this.jInternalFrameImportacionTipoDelimiter=new ImportacionJInternalFrame(TipoDelimiterConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDelimiter);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDelimiter);
				this.jInternalFrameImportacionTipoDelimiter.setVisible(false);
				this.jInternalFrameImportacionTipoDelimiter.setSelected(false);


				this.jInternalFrameImportacionTipoDelimiter.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDelimiter"));
				this.jInternalFrameImportacionTipoDelimiter.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDelimiter"));
				this.jInternalFrameImportacionTipoDelimiter.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDelimiter"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDelimiter() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDelimiter==null) {
				this.jInternalFrameReporteDinamicoTipoDelimiter=new ReporteDinamicoJInternalFrame(TipoDelimiterConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDelimiter);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDelimiter);
				this.jInternalFrameReporteDinamicoTipoDelimiter.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDelimiter.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDelimiter.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDelimiter"));
				this.jInternalFrameReporteDinamicoTipoDelimiter.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDelimiter"));
				this.jInternalFrameReporteDinamicoTipoDelimiter.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDelimiter"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDelimiter();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoDelimiter() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDelimiter);
			
	       	this.jInternalFrameDetalleFormTipoDelimiter.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDelimiter.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDelimiter.dispose();
			//this.jInternalFrameDetalleFormTipoDelimiter=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDelimiter() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDelimiter.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDelimiter.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDelimiter() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDelimiter.setVisible(true);
	        this.jInternalFrameImportacionTipoDelimiter.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDelimiter() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDelimiter.setVisible(true);
	        this.jInternalFrameOrderByTipoDelimiter.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDelimiter() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDelimiter.setVisible(false);
	        this.jInternalFrameOrderByTipoDelimiter.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDelimiter() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDelimiter.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDelimiter.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDelimiter() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDelimiter.setVisible(false);
	        this.jInternalFrameImportacionTipoDelimiter.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDelimiter(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDelimiter(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDelimiter(true);
			//this.isEsNuevoTipoDelimiter=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiter =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodelimiter =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDelimiter("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDelimiter(false) ;
			
			if(tipodelimiterSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoDelimiterJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDelimiter(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDelimiter(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDelimiterActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiter =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodelimiter =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDelimiter(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDelimiter==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDelimiter(true);
			//this.isEsNuevoTipoDelimiter=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiter =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodelimiter =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodelimiter.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDelimiter("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDelimiter(false) ;
			
			if(TipoDelimiterJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDelimiter(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDelimiter(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDelimiter(false);
			
			//if(!this.isEsNuevoTipoDelimiter) {								
				int intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiter =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodelimiter =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDelimiter(this.tipodelimiter,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(this.tipodelimiter);
				
			}
			
			if(this.permiteMantenimiento(this.tipodelimiter)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDelimiter=true;
					this.inicializarActualizarBindingTablaTipoDelimiter(false);
					this.isEsNuevoTipoDelimiter=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDelimiter=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDelimiter=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDelimiter(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDelimiter(false);
				
				this.habilitarDeshabilitarControlesTipoDelimiter(false);
			
												
				
				if(TipoDelimiterJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDelimiter();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDelimiterActionPerformed(evt,tipodelimiterSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDelimiter(this.tipodelimiter,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDelimiter.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodelimiterSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodelimiter.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDelimiter.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDelimiter.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiter =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				this.tipodelimiter.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodelimiter =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				this.tipodelimiter.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodelimiter)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDelimiterModel) this.jTableDatosTipoDelimiter.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDelimiter=true;
				this.inicializarActualizarBindingTablaTipoDelimiter(false);
				this.isEsNuevoTipoDelimiter=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDelimiter(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDelimiter(false);
				
				this.habilitarDeshabilitarControlesTipoDelimiter(false);
				
				
				
				if(TipoDelimiterJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDelimiter();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDelimiter.getRowCount()>=1) {
				jTableDatosTipoDelimiter.removeRowSelectionInterval(0, jTableDatosTipoDelimiter.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDelimiter(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDelimiter(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDelimiter(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDelimiter(false) ;
			
			this.isEsNuevoTipoDelimiter=false;
			
			if(TipoDelimiterJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDelimiter();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDelimiter(false);
				
				//SI ES MANUAL
				if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDelimiter();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDelimiter--;			
			//TipoDelimiter tipodelimiterAux= new TipoDelimiter();			
			//tipodelimiterAux.setId(this.iIdNuevoTipoDelimiter);
			
			if(this.jInternalFrameDetalleFormTipoDelimiter==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDelimiter();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(this.tipodelimiter);
			
			this.tipodelimiter.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodelimiterLogic.getTipoDelimiters().add(this.tipodelimiterAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodelimiters.add(this.tipodelimiterAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDelimiter(false);
			
			this.jTableDatosTipoDelimiter.setRowSelectionInterval(this.getIndiceNuevoTipoDelimiter(), this.getIndiceNuevoTipoDelimiter());
			
			int iLastRow =  this.jTableDatosTipoDelimiter.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDelimiter.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDelimiter.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDelimiter(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDelimiter(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDelimiter(false);
			
			//SI ES MANUAL
			if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDelimiter();
			}
			
			//this.abrirFrameTreeTipoDelimiter();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo DelimiterS ?", "MANTENIMIENTO DE Tipo Delimiter", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDelimiter.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDelimiter();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodelimiterReturnGeneral=tipodelimiterLogic.procesarImportacionTipoDelimitersWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodelimiterParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDelimiterReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDelimiter.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDelimiter.setFileImportacion(this.jInternalFrameImportacionTipoDelimiter.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDelimiter.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDelimiter.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDelimiter.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDelimiter.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();		

		tipodelimitersSeleccionados=this.getTipoDelimitersSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDelimiter.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDelimiter.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDelimiterBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDelimiterBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDelimiters("Todos",tipodelimitersSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Delimiter",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDelimiter.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDelimiter.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDelimiterConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDelimiterConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoDelimiter.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDelimiter.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDelimiter.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDelimiterConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoDelimiterConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDelimiter.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDelimiterConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoDelimiterConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDelimiter.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDelimiter.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDelimiterConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoDelimiterConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();		
		
		tipodelimitersSeleccionados=this.getTipoDelimitersSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodelimiter";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDelimiters");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDelimiter.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDelimiter.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDelimiterConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDelimiterConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoDelimiter tipodelimiter:tipodelimitersSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodelimiter.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDelimiterConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDelimiterConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDelimiter tipodelimiter:tipodelimitersSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodelimiter.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoDelimiter(row);				
			//	iRow++;
			//}				
			
			//for(TipoDelimiter tipodelimiterAux:tipodelimitersSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDelimiter(tipodelimiterAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Delimiter",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodelimiterLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDelimiter(false);
			
			//SI ES MANUAL
			if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDelimiter();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDelimiter(false);
			
			//SI ES MANUAL
			if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDelimiter();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDelimiterActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDelimiter(false);
			
			//SI ES MANUAL
			if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDelimiter();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodelimiterLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDelimiter() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDelimiter.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDelimiter.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDelimiter.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDelimiter.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDelimiter.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDelimiter.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDelimiter.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDelimiter(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDelimiter(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDelimiter(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDelimiter(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDelimiter(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDelimiter(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDelimiter(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDelimiter(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDelimiterJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDelimiterJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDelimiter() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDelimiter();
		
		this.inicializarActualizarBindingBotonesManualTipoDelimiter(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDelimiter();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDelimiter() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDelimiter(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDelimiter(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDelimiter.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDelimiter.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDelimiter.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDelimiter.jCheckBoxPostAccionNuevoTipoDelimiter.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDelimiter.jCheckBoxPostAccionSinCerrarTipoDelimiter.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDelimiter.jCheckBoxPostAccionSinMensajeTipoDelimiter.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDelimiter.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDelimiter.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDelimiter.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
				this.jInternalFrameDetalleFormTipoDelimiter.jCheckBoxPostAccionNuevoTipoDelimiter.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDelimiter.jCheckBoxPostAccionSinCerrarTipoDelimiter.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDelimiter.jCheckBoxPostAccionSinMensajeTipoDelimiter.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDelimiter.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDelimiter.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDelimiter.jComboBoxTiposAccionesFormularioTipoDelimiter.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDelimiter.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDelimiter!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDelimiter.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDelimiter.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDelimiter.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDelimiter.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDelimiter.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDelimiter!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDelimiter.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDelimiter.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDelimiter.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDelimiter(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDelimiter(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDelimiter() throws Exception {
		try	{
			if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDelimiter();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDelimiter() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDelimiter.jComboBoxTiposAccionesFormularioTipoDelimiter.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDelimiter.jComboBoxTiposAccionesFormularioTipoDelimiter.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDelimiter() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDelimiter.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDelimiter.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDelimiter.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDelimiter.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDelimiter.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDelimiter.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDelimiter.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDelimiter.addItem(reporte);
			}
			
			
			if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDelimiter.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDelimiter.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDelimiter.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDelimiter.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDelimiter.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDelimiter.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDelimiter.jComboBoxTiposAccionesFormularioTipoDelimiter.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDelimiter.jComboBoxTiposAccionesFormularioTipoDelimiter.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDelimiter.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDelimiter.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDelimiter.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDelimiter();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDelimiter() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDelimiter!=null) {
				this.jInternalFrameReporteDinamicoTipoDelimiter.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDelimiter.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDelimiter!=null) {
				this.jInternalFrameReporteDinamicoTipoDelimiter.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDelimiter.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDelimiter!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDelimiter.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDelimiter.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDelimiter.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDelimiter.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDelimiter.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDelimiter.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDelimiter()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDelimiter(Boolean esInicializar) throws Exception {				
		if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDelimiter();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDelimiter() throws Exception {
		this.inicializarActualizarBindingTablaTipoDelimiter(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDelimiter() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDelimiterPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDelimiterPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDelimiterOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDelimiterOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDelimiterPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDelimiterPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDelimiter(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodelimiterLogic.getTipoDelimiters().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodelimiters.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDelimiter.setModel(new TipoDelimiterModel(this.tipodelimiterLogic.getTipoDelimiters(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDelimiter.setModel(new TipoDelimiterModel(this.tipodelimiters,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDelimiter!=null && this.jInternalFrameOrderByTipoDelimiter.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDelimiter();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDelimiter.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDelimiter,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDelimiterPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO,tipodelimiterConstantesFunciones.resaltarSeleccionarTipoDelimiter,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO,tipodelimiterConstantesFunciones.resaltarSeleccionarTipoDelimiter,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDelimiter.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDelimiter,TipoDelimiterConstantesFunciones.LABEL_ID));

		if(this.tipodelimiterConstantesFunciones.mostraridTipoDelimiter && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDelimiterConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodelimiterConstantesFunciones.resaltaridTipoDelimiter,this.tipodelimiterConstantesFunciones.activaridTipoDelimiter,this,true,"idTipoDelimiter","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodelimiterConstantesFunciones.resaltaridTipoDelimiter,this.tipodelimiterConstantesFunciones.activaridTipoDelimiter,this,true,"idTipoDelimiter","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDelimiter.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDelimiter,TipoDelimiterConstantesFunciones.LABEL_CODIGO));

		if(this.tipodelimiterConstantesFunciones.mostrarcodigoTipoDelimiter && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDelimiterConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodelimiterConstantesFunciones.resaltarcodigoTipoDelimiter,this.tipodelimiterConstantesFunciones.activarcodigoTipoDelimiter,this,true,"codigoTipoDelimiter","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodelimiterConstantesFunciones.resaltarcodigoTipoDelimiter,this.tipodelimiterConstantesFunciones.activarcodigoTipoDelimiter,this,true,"codigoTipoDelimiter","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDelimiterPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDelimiter.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDelimiter,TipoDelimiterConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodelimiterConstantesFunciones.mostrarnombreTipoDelimiter && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDelimiterConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodelimiterConstantesFunciones.resaltarnombreTipoDelimiter,this.tipodelimiterConstantesFunciones.activarnombreTipoDelimiter,this,true,"nombreTipoDelimiter","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodelimiterConstantesFunciones.resaltarnombreTipoDelimiter,this.tipodelimiterConstantesFunciones.activarnombreTipoDelimiter,this,true,"nombreTipoDelimiter","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDelimiterPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodelimiterSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodelimiterSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDelimiter.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodelimiterSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodelimiterSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDelimiter.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDelimiter && this.isPermisoGuardarCambiosTipoDelimiter) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodelimiterSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodelimiterSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDelimiter.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDelimiter.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDelimiter && this.isPermisoGuardarCambiosTipoDelimiter) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDelimiter && this.isPermisoGuardarCambiosTipoDelimiter) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDelimiter.moveColumn(this.jTableDatosTipoDelimiter.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDelimiter.moveColumn(this.jTableDatosTipoDelimiter.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDelimiter.moveColumn(this.jTableDatosTipoDelimiter.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDelimiter.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDelimiter.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDelimiter,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDelimiterJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDelimiter.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDelimiter.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDelimiterJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDelimiterJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDelimiter.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDelimiter.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDelimiter.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodelimiterLogic.getTipoDelimiters().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodelimiters.size()-1;
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
		//this.jTableDatosTipoDelimiter.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDelimiter.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDelimiter();
			
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
				
				//this.isEsNuevoTipoDelimiter=false;
					
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			
				if(this.tipodelimiterSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDelimiter==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDelimiter.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDelimiter.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiter =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodelimiter =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodelimiter.getsType().equals("DUPLICADO")
				   || this.tipodelimiter.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDelimiter=true;
				
				} else {
					this.isEsNuevoTipoDelimiter=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodelimiter.getId()>=0 && !this.tipodelimiter.getIsNew()) {						
						this.isEsNuevoTipoDelimiter=false;
						
					} else {
						this.isEsNuevoTipoDelimiter=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDelimiter(esRelaciones);						
				
				this.seleccionarTipoDelimiter(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodelimiter.getId()<0) {
					this.isEsNuevoTipoDelimiter=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDelimiter(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDelimiter(evt,rowIndex);
				}	
				
				if(this.tipodelimiterSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDelimiter: " + this.dDif); 
					}
				}								
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDelimiter(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodelimiter)) {
					if(this.tipodelimiter.getId()>0) {
						this.tipodelimiter.setIsDeleted(true);
						
						this.tipodelimitersEliminados.add(this.tipodelimiter);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodelimiterLogic.getTipoDelimiters().remove(this.tipodelimiter);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodelimiters.remove(this.tipodelimiter);				
					}
					
					
					((TipoDelimiterModel) this.jTableDatosTipoDelimiter.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDelimiter(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDelimiter(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDelimiter) {
			
			if(this.jInternalFrameDetalleFormTipoDelimiter==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDelimiter.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDelimiter.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiter =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodelimiter =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDelimiter(this.tipodelimiter);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDelimiter("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDelimiter(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDelimiter() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDelimiter(TipoDelimiter tipodelimiter) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDelimiter(tipodelimiter,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDelimiter(TipoDelimiter tipodelimiter,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDelimiter(tipodelimiter);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDelimiter(tipodelimiter,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDelimiter(tipodelimiter);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDelimiter(TipoDelimiter tipodelimiter) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDelimiter==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldidTipoDelimiter.setText(tipodelimiter.getId().toString());
			this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldcodigoTipoDelimiter.setText(tipodelimiter.getcodigo());
			this.jInternalFrameDetalleFormTipoDelimiter.jTextAreanombreTipoDelimiter.setText(tipodelimiter.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDelimiter tipodelimiterLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodelimiterLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDelimiter tipodelimiterLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodelimiterLocal=this.tipodelimiter;
			} else {
				tipodelimiterLocal=this.tipodelimiterAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodelimiterLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDelimiter(tipodelimiterLocal,true);
					
					if(tipodelimiterSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodelimiterLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodelimiterLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDelimiter(TipoDelimiter tipodelimiter,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDelimiter(tipodelimiter,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(tipodelimiter);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDelimiter(TipoDelimiter tipodelimiter,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDelimiter(tipodelimiter,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDelimiter(TipoDelimiter tipodelimiter,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDelimiter==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldidTipoDelimiter.getText()==null || this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldidTipoDelimiter.getText()=="" || this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldidTipoDelimiter.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldidTipoDelimiter.setText("0");
			}

			if(conColumnasBase) {tipodelimiter.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldidTipoDelimiter.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDelimiterConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDelimiter.jLabelIdTipoDelimiter,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodelimiter.setcodigo(this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldcodigoTipoDelimiter.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDelimiterConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDelimiter.jLabelcodigoTipoDelimiter,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodelimiter.setnombre(this.jInternalFrameDetalleFormTipoDelimiter.jTextAreanombreTipoDelimiter.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDelimiterConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDelimiter.jLabelnombreTipoDelimiter,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDelimiter(TipoDelimiter tipodelimiterBean,TipoDelimiter tipodelimiter,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDelimiter(TipoDelimiter tipodelimiterOrigen,TipoDelimiter tipodelimiter,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodelimiterOrigen.getId()!=null && !tipodelimiterOrigen.getId().equals(0L))) {tipodelimiter.setId(tipodelimiterOrigen.getId());}}
			if(conDefault || (!conDefault && tipodelimiterOrigen.getcodigo()!=null && !tipodelimiterOrigen.getcodigo().equals(""))) {tipodelimiter.setcodigo(tipodelimiterOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipodelimiterOrigen.getnombre()!=null && !tipodelimiterOrigen.getnombre().equals(""))) {tipodelimiter.setnombre(tipodelimiterOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDelimiter(TipoDelimiter tipodelimiter) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldidTipoDelimiter.setText(tipodelimiter.getId().toString());
			this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldcodigoTipoDelimiter.setText(tipodelimiter.getcodigo());
			this.jInternalFrameDetalleFormTipoDelimiter.jTextAreanombreTipoDelimiter.setText(tipodelimiter.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDelimiter(TipoDelimiterBean tipodelimiterBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldidTipoDelimiter.setText(tipodelimiterBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldcodigoTipoDelimiter.setText(tipodelimiterBean.getcodigo());
			this.jInternalFrameDetalleFormTipoDelimiter.jTextAreanombreTipoDelimiter.setText(tipodelimiterBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDelimiter(TipoDelimiterParameterReturnGeneral tipodelimiterReturnGeneral,TipoDelimiterBean tipodelimiterBean,Boolean conDefault) throws Exception { 
		try {
			TipoDelimiter tipodelimiterLocal=new TipoDelimiter();
			
			tipodelimiterLocal=tipodelimiterReturnGeneral.getTipoDelimiter();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodelimiterLocal.getId()!=null && !tipodelimiterLocal.getId().equals(0L))) {tipodelimiterBean.setId(tipodelimiterLocal.getId());}}
			if(conDefault || (!conDefault && tipodelimiterLocal.getcodigo()!=null && !tipodelimiterLocal.getcodigo().equals(""))) {tipodelimiterBean.setcodigo(tipodelimiterLocal.getcodigo());}
			if(conDefault || (!conDefault && tipodelimiterLocal.getnombre()!=null && !tipodelimiterLocal.getnombre().equals(""))) {tipodelimiterBean.setnombre(tipodelimiterLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDelimiterGenerico(Long idTipoDelimiterSeleccionado,JComboBox jComboBoxTipoDelimiter,List<TipoDelimiter> tipodelimitersLocal)throws Exception {
		try {
			TipoDelimiter  tipodelimiterTemp=null;

			for(TipoDelimiter tipodelimiterAux:tipodelimitersLocal) {
				if(tipodelimiterAux.getId()!=null && tipodelimiterAux.getId().equals(idTipoDelimiterSeleccionado)) {
					tipodelimiterTemp=tipodelimiterAux;
					break;
				}
			}

			jComboBoxTipoDelimiter.setSelectedItem(tipodelimiterTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDelimiterGenerico(JComboBox jComboBoxTipoDelimiter,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDelimiter.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDelimiter.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDelimiter.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDelimiter.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDelimiter.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDelimiter.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDelimiter.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDelimiter.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDelimiter.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDelimiter.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodelimiter=(TipoDelimiter) tipodelimiterLogic.getTipoDelimiters().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodelimiter =(TipoDelimiter) tipodelimiters.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDelimiter tipodelimiterRow=new TipoDelimiter();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodelimiterRow=(TipoDelimiter) tipodelimiterLogic.getTipoDelimiters().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodelimiterRow=(TipoDelimiter) tipodelimiters.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDelimiter(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDelimiter.setVisible((this.isVisibilidadCeldaNuevoTipoDelimiter && this.isPermisoNuevoTipoDelimiter));			
			this.jButtonDuplicarTipoDelimiter.setVisible((this.isVisibilidadCeldaDuplicarTipoDelimiter && this.isPermisoDuplicarTipoDelimiter));			
			this.jButtonCopiarTipoDelimiter.setVisible((this.isVisibilidadCeldaCopiarTipoDelimiter && this.isPermisoCopiarTipoDelimiter));
			this.jButtonVerFormTipoDelimiter.setVisible((this.isVisibilidadCeldaVerFormTipoDelimiter && this.isPermisoVerFormTipoDelimiter));
			
			this.jButtonAbrirOrderByTipoDelimiter.setVisible((this.isVisibilidadCeldaOrdenTipoDelimiter && this.isPermisoOrdenTipoDelimiter));			
			
			this.jButtonNuevoRelacionesTipoDelimiter.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter && this.isPermisoNuevoTipoDelimiter));			
			this.jButtonNuevoGuardarCambiosTipoDelimiter.setVisible((this.isVisibilidadCeldaNuevoTipoDelimiter && this.isPermisoNuevoTipoDelimiter && this.isPermisoGuardarCambiosTipoDelimiter));
			
			if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonModificarTipoDelimiter.setVisible((this.isVisibilidadCeldaModificarTipoDelimiter && this.isPermisoActualizarTipoDelimiter));	
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonActualizarTipoDelimiter.setVisible((this.isVisibilidadCeldaActualizarTipoDelimiter && this.isPermisoActualizarTipoDelimiter));	
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonEliminarTipoDelimiter.setVisible((this.isVisibilidadCeldaEliminarTipoDelimiter && this.isPermisoEliminarTipoDelimiter));
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonCancelarTipoDelimiter.setVisible(this.isVisibilidadCeldaCancelarTipoDelimiter);							
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonGuardarCambiosTipoDelimiter.setVisible((this.isVisibilidadCeldaGuardarTipoDelimiter && this.isPermisoGuardarCambiosTipoDelimiter));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDelimiter.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDelimiter && this.isPermisoGuardarCambiosTipoDelimiter));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDelimiter.setVisible((this.isVisibilidadCeldaNuevoTipoDelimiter && this.isPermisoNuevoTipoDelimiter));						
			this.jButtonDuplicarToolBarTipoDelimiter.setVisible((this.isVisibilidadCeldaDuplicarTipoDelimiter && this.isPermisoDuplicarTipoDelimiter));						
			this.jButtonCopiarToolBarTipoDelimiter.setVisible((this.isVisibilidadCeldaCopiarTipoDelimiter && this.isPermisoCopiarTipoDelimiter));			
			this.jButtonVerFormToolBarTipoDelimiter.setVisible((this.isVisibilidadCeldaVerFormTipoDelimiter && this.isPermisoVerFormTipoDelimiter));			
			this.jButtonAbrirOrderByToolBarTipoDelimiter.setVisible((this.isVisibilidadCeldaOrdenTipoDelimiter && this.isPermisoOrdenTipoDelimiter));
			this.jButtonNuevoRelacionesToolBarTipoDelimiter.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter && this.isPermisoNuevoTipoDelimiter));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDelimiter.setVisible((this.isVisibilidadCeldaNuevoTipoDelimiter && this.isPermisoNuevoTipoDelimiter && this.isPermisoGuardarCambiosTipoDelimiter));			
			
			if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonModificarToolBarTipoDelimiter.setVisible((this.isVisibilidadCeldaModificarTipoDelimiter && this.isPermisoActualizarTipoDelimiter));	
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonActualizarToolBarTipoDelimiter.setVisible((this.isVisibilidadCeldaActualizarTipoDelimiter  && this.isPermisoActualizarTipoDelimiter));	
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonEliminarToolBarTipoDelimiter.setVisible((this.isVisibilidadCeldaEliminarTipoDelimiter && this.isPermisoEliminarTipoDelimiter));
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonCancelarToolBarTipoDelimiter.setVisible(this.isVisibilidadCeldaCancelarTipoDelimiter);				
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonGuardarCambiosToolBarTipoDelimiter.setVisible((this.isVisibilidadCeldaGuardarTipoDelimiter && this.isPermisoGuardarCambiosTipoDelimiter));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDelimiter.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDelimiter && this.isPermisoGuardarCambiosTipoDelimiter));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDelimiter.setVisible((this.isVisibilidadCeldaNuevoTipoDelimiter && this.isPermisoNuevoTipoDelimiter));			
			this.jMenuItemDuplicarTipoDelimiter.setVisible((this.isVisibilidadCeldaDuplicarTipoDelimiter && this.isPermisoDuplicarTipoDelimiter));			
			this.jMenuItemCopiarTipoDelimiter.setVisible((this.isVisibilidadCeldaCopiarTipoDelimiter && this.isPermisoCopiarTipoDelimiter));			
			this.jMenuItemVerFormTipoDelimiter.setVisible((this.isVisibilidadCeldaVerFormTipoDelimiter && this.isPermisoVerFormTipoDelimiter));			
			this.jMenuItemAbrirOrderByTipoDelimiter.setVisible((this.isVisibilidadCeldaOrdenTipoDelimiter && this.isPermisoOrdenTipoDelimiter));			
			//this.jMenuItemMostrarOcultarTipoDelimiter.setVisible((this.isVisibilidadCeldaOrdenTipoDelimiter && this.isPermisoOrdenTipoDelimiter));
			this.jMenuItemDetalleAbrirOrderByTipoDelimiter.setVisible((this.isVisibilidadCeldaOrdenTipoDelimiter && this.isPermisoOrdenTipoDelimiter));			
			//this.jMenuItemDetalleMostrarOcultarTipoDelimiter.setVisible((this.isVisibilidadCeldaOrdenTipoDelimiter && this.isPermisoOrdenTipoDelimiter));			
			this.jMenuItemNuevoRelacionesTipoDelimiter.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter && this.isPermisoNuevoTipoDelimiter));			
			this.jMenuItemNuevoGuardarCambiosTipoDelimiter.setVisible((this.isVisibilidadCeldaNuevoTipoDelimiter && this.isPermisoNuevoTipoDelimiter && this.isPermisoGuardarCambiosTipoDelimiter));									
			
			if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
			this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemModificarTipoDelimiter.setVisible((this.isVisibilidadCeldaModificarTipoDelimiter && this.isPermisoActualizarTipoDelimiter));	
			this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemActualizarTipoDelimiter.setVisible((this.isVisibilidadCeldaActualizarTipoDelimiter && this.isPermisoActualizarTipoDelimiter));	
			this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemEliminarTipoDelimiter.setVisible((this.isVisibilidadCeldaEliminarTipoDelimiter && this.isPermisoEliminarTipoDelimiter));
			this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemCancelarTipoDelimiter.setVisible(this.isVisibilidadCeldaCancelarTipoDelimiter);				
			}
			
			this.jMenuItemGuardarCambiosTipoDelimiter.setVisible((this.isVisibilidadCeldaGuardarTipoDelimiter && this.isPermisoGuardarCambiosTipoDelimiter));						
			this.jMenuItemGuardarCambiosTablaTipoDelimiter.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDelimiter && this.isPermisoGuardarCambiosTipoDelimiter));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDelimiter=this.jButtonNuevoTipoDelimiter.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDelimiter=this.jButtonDuplicarTipoDelimiter.isVisible();
			this.isVisibilidadCeldaCopiarTipoDelimiter=this.jButtonCopiarTipoDelimiter.isVisible();
			this.isVisibilidadCeldaVerFormTipoDelimiter=this.jButtonVerFormTipoDelimiter.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDelimiter=this.jButtonAbrirOrderByTipoDelimiter.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=this.jButtonNuevoRelacionesTipoDelimiter.isVisible();
			this.isVisibilidadCeldaModificarTipoDelimiter=this.jButtonModificarTipoDelimiter.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
			this.isVisibilidadCeldaActualizarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jButtonActualizarTipoDelimiter.isVisible();
			this.isVisibilidadCeldaEliminarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jButtonEliminarTipoDelimiter.isVisible();
			this.isVisibilidadCeldaCancelarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jButtonCancelarTipoDelimiter.isVisible();
			this.isVisibilidadCeldaGuardarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jButtonGuardarCambiosTipoDelimiter.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDelimiter=this.jButtonGuardarCambiosTablaTipoDelimiter.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDelimiter=this.jButtonNuevoToolBarTipoDelimiter.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=this.jButtonNuevoRelacionesToolBarTipoDelimiter.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
			this.isVisibilidadCeldaModificarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jButtonModificarToolBarTipoDelimiter.isVisible();
			this.isVisibilidadCeldaActualizarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jButtonActualizarToolBarTipoDelimiter.isVisible();
			this.isVisibilidadCeldaEliminarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jButtonEliminarToolBarTipoDelimiter.isVisible();
			this.isVisibilidadCeldaCancelarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jButtonCancelarToolBarTipoDelimiter.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDelimiter=this.jButtonGuardarCambiosToolBarTipoDelimiter.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDelimiter=this.jButtonGuardarCambiosTablaToolBarTipoDelimiter.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDelimiter=this.jMenuItemNuevoTipoDelimiter.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=this.jMenuItemNuevoRelacionesTipoDelimiter.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
			this.isVisibilidadCeldaModificarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemModificarTipoDelimiter.isVisible();
			this.isVisibilidadCeldaActualizarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemActualizarTipoDelimiter.isVisible();
			this.isVisibilidadCeldaEliminarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemEliminarTipoDelimiter.isVisible();
			this.isVisibilidadCeldaCancelarTipoDelimiter=this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemCancelarTipoDelimiter.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDelimiter=this.jMenuItemGuardarCambiosTipoDelimiter.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDelimiter=this.jMenuItemGuardarCambiosTablaTipoDelimiter.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDelimiter(Boolean esInicializar) {
		if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodelimiterSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDelimiter();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDelimiter(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDelimiter() {
		this.jButtonNuevoTipoDelimiter.setVisible(this.isPermisoNuevoTipoDelimiter);			
		this.jButtonDuplicarTipoDelimiter.setVisible(this.isPermisoDuplicarTipoDelimiter);			
		this.jButtonCopiarTipoDelimiter.setVisible(this.isPermisoCopiarTipoDelimiter);			
		this.jButtonVerFormTipoDelimiter.setVisible(this.isPermisoVerFormTipoDelimiter);			
		
		this.jButtonAbrirOrderByTipoDelimiter.setVisible(this.isPermisoOrdenTipoDelimiter);					
		
		this.jButtonNuevoRelacionesTipoDelimiter.setVisible(this.isPermisoNuevoTipoDelimiter);			
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonModificarTipoDelimiter.setVisible(this.isPermisoActualizarTipoDelimiter);	
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonActualizarTipoDelimiter.setVisible(this.isPermisoActualizarTipoDelimiter);	
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonEliminarTipoDelimiter.setVisible(this.isPermisoEliminarTipoDelimiter);
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonCancelarTipoDelimiter.setVisible(this.isVisibilidadCeldaCancelarTipoDelimiter);						
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonGuardarCambiosTipoDelimiter.setVisible(this.isPermisoGuardarCambiosTipoDelimiter);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDelimiter.setVisible(this.isPermisoActualizarTipoDelimiter);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDelimiter() {
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonModificarTipoDelimiter.setVisible(this.isPermisoActualizarTipoDelimiter);	
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonActualizarTipoDelimiter.setVisible(this.isPermisoActualizarTipoDelimiter);	
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonEliminarTipoDelimiter.setVisible(this.isPermisoEliminarTipoDelimiter);
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonCancelarTipoDelimiter.setVisible(this.isVisibilidadCeldaCancelarTipoDelimiter);							
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonGuardarCambiosTipoDelimiter.setVisible((this.isVisibilidadCeldaGuardarTipoDelimiter && this.isPermisoGuardarCambiosTipoDelimiter));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDelimiter() {
		if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDelimiter();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDelimiter() {
	}
	
	public void jTableDatosTipoDelimiterListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDelimiter(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDelimiterBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDelimiter(this.gettipodelimiter(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(this.tipodelimiter);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodelimiter =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodelimiter =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodelimiter==null) {
						this.tipodelimiter = new TipoDelimiter();
					}

					this.setVariablesFormularioToObjetoActualTipoDelimiter(this.tipodelimiter,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(this.tipodelimiter);
				}

				if(this.tipodelimiter.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodelimiter.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDelimiter(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoDelimiterBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDelimiter(this.gettipodelimiter(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(this.tipodelimiter);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodelimiter =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodelimiter =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodelimiter==null) {
						this.tipodelimiter = new TipoDelimiter();
					}

					this.setVariablesFormularioToObjetoActualTipoDelimiter(this.tipodelimiter,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(this.tipodelimiter);
				}

				if(this.tipodelimiter.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipodelimiter.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDelimiter(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDelimiterBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDelimiter(this.gettipodelimiter(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(this.tipodelimiter);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodelimiter =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodelimiter =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodelimiter==null) {
						this.tipodelimiter = new TipoDelimiter();
					}

					this.setVariablesFormularioToObjetoActualTipoDelimiter(this.tipodelimiter,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(this.tipodelimiter);
				}

				if(this.tipodelimiter.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodelimiter.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDelimiter(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoDelimiter() {
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
			this.jInternalFrameDetalleFormTipoDelimiter.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDelimiter.dispose();
			this.jInternalFrameDetalleFormTipoDelimiter=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDelimiter!=null) {
			this.jInternalFrameReporteDinamicoTipoDelimiter.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDelimiter.dispose();
			this.jInternalFrameReporteDinamicoTipoDelimiter=null;
		}
		
		if(this.jInternalFrameImportacionTipoDelimiter!=null) {
			this.jInternalFrameImportacionTipoDelimiter.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDelimiter.dispose();
			this.jInternalFrameImportacionTipoDelimiter=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDelimiter();
			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDelimiter")) {
				jButtonNuevoTipoDelimiterActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDelimiter")) {
				jButtonDuplicarTipoDelimiterActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDelimiter")) {
				jButtonCopiarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDelimiter")) {
				jButtonVerFormTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDelimiter")) {
				jButtonNuevoTipoDelimiterActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDelimiter")) {
				jButtonDuplicarTipoDelimiterActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDelimiter")) {
				jButtonNuevoTipoDelimiterActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDelimiter")) {
				jButtonDuplicarTipoDelimiterActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDelimiter")) {
				jButtonNuevoTipoDelimiterActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDelimiter")) {
				jButtonNuevoTipoDelimiterActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDelimiter")) {
				jButtonNuevoTipoDelimiterActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDelimiter")) {
				jButtonModificarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDelimiter")) {
				jButtonModificarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDelimiter")) {
				jButtonModificarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDelimiter")) {
				jButtonActualizarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDelimiter")) {
				jButtonActualizarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDelimiter")) {
				jButtonActualizarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDelimiter")) {
				jButtonEliminarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDelimiter")) {
				jButtonEliminarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDelimiter")) {
				jButtonEliminarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDelimiter")) {
				jButtonCancelarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDelimiter")) {
				jButtonCancelarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDelimiter")) {
				jButtonCancelarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDelimiter")) {
				jButtonCerrarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDelimiter")) {
				jButtonCerrarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDelimiter")) {
				jButtonCerrarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDelimiter")) {
				jButtonMostrarOcultarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDelimiter")) {
				jButtonCancelarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDelimiter")) {
				jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDelimiter")) {
				jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDelimiter")) {
				jButtonCopiarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDelimiter")) {
				jButtonVerFormTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDelimiter")) {
				jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDelimiter")) {
				jButtonCopiarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDelimiter")) {
				jButtonVerFormTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDelimiter")) {
				jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDelimiter")) {
				jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDelimiter")) {
				jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDelimiter")) {
				jButtonRecargarInformacionTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDelimiter")) {
				jButtonRecargarInformacionTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDelimiter")) {
				jButtonRecargarInformacionTipoDelimiterActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDelimiter")) {
				jButtonAnterioresTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDelimiter")) {
				jButtonAnterioresTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDelimiter")) {
				jButtonAnterioresTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDelimiter")) {
				jButtonSiguientesTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDelimiter")) {
				jButtonSiguientesTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDelimiter")) {
				jButtonSiguientesTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDelimiter") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDelimiter")) {
				jButtonAbrirOrderByTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDelimiter") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDelimiter")) {
				jButtonMostrarOcultarTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDelimiter")) {
				jButtonNuevoGuardarCambiosTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDelimiter")) {
				jButtonNuevoGuardarCambiosTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDelimiter")) {
				jButtonNuevoGuardarCambiosTipoDelimiterActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDelimiter")) {
				jButtonCerrarReporteDinamicoTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDelimiter")) {
				jButtonGenerarReporteDinamicoTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDelimiter")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDelimiterActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDelimiter")) {
				jButtonCerrarImportacionTipoDelimiterActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDelimiter")) {
				
				jButtonGenerarImportacionTipoDelimiterActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDelimiter")) {
				
				jButtonAbrirImportacionTipoDelimiterActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDelimiter")) {
				jComboBoxTiposAccionesTipoDelimiterActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDelimiter")) {
				jComboBoxTiposRelacionesTipoDelimiterActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDelimiter")) {
				jComboBoxTiposAccionesTipoDelimiterActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDelimiter")) {
				
				jComboBoxTiposSeleccionarTipoDelimiterActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDelimiter")) {
				jTextFieldValorCampoGeneralTipoDelimiterActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDelimiter")) {
				jButtonAbrirOrderByTipoDelimiterActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDelimiter")) {
				jButtonAbrirOrderByTipoDelimiterActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDelimiter")) {
				jButtonCerrarOrderByTipoDelimiterActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDelimiterBusqueda")) {
				this.jButtonidTipoDelimiterBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDelimiterBusqueda")) {
				this.jButtoncodigoTipoDelimiterBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDelimiterBusqueda")) {
				this.jButtonnombreTipoDelimiterBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDelimiter();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDelimiterActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				


				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDelimiter.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDelimiter.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDelimiter tipodelimiterLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodelimiterLocal=this.tipodelimiter;
			} else {
				tipodelimiterLocal=this.tipodelimiterAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
							
				
				


				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDelimiter.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDelimiter.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDelimiterActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
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
			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			
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
			
			


			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDelimiterActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
								
						
				


				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDelimiter.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDelimiter.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
								
				
				


				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDelimiter.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDelimiter.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDelimiterActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDelimiterActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDelimiterActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
							
				
				


				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDelimiter.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDelimiter.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDelimiterActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
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
			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			
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
			
			


			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDelimiterActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
								
				
				


				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDelimiter.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDelimiter.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDelimiterActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDelimiterActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDelimiterActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDelimiter")) {
					jCheckBoxSeleccionarTodosTipoDelimiterItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDelimiter")) {
					jCheckBoxSeleccionadosTipoDelimiterItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDelimiter")) {
					
				}
				
				


				
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDelimiter.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDelimiter.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
												
				
				


				
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDelimiter.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDelimiter.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDelimiterActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDelimiterActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
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
			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
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
			
			


			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDelimiterActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDelimiter.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDelimiter.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodelimiter);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodelimiter);
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
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
				
				


				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDelimiter.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDelimiter.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDelimiterActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodelimiterAnterior =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDelimiter")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDelimiterListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDelimiter.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodelimiter =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodelimiter =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodelimiter);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDelimiter")) {
				
				}
				
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDelimiter")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDelimiter.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDelimiter")) {
			
			}
			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDelimiter();
			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDelimiter")) {
				jButtonNuevoTipoDelimiterActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDelimiter")) {
				jButtonDuplicarTipoDelimiterActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDelimiter")) {
				jButtonCopiarTipoDelimiterActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDelimiter")) {
				jButtonVerFormTipoDelimiterActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDelimiter")) {
				jButtonNuevoTipoDelimiterActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDelimiter")) {
				jButtonModificarTipoDelimiterActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDelimiter")) {
				jButtonActualizarTipoDelimiterActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDelimiter")) {
				jButtonEliminarTipoDelimiterActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDelimiter")) {
				jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDelimiter")) {
				jButtonCancelarTipoDelimiterActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDelimiter")) {
				jButtonCerrarTipoDelimiterActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDelimiter")) {
				jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDelimiter")) {
				jButtonNuevoGuardarCambiosTipoDelimiterActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDelimiter")) {
				jButtonAbrirOrderByTipoDelimiterActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDelimiter")) {
				jButtonRecargarInformacionTipoDelimiterActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDelimiter")) {
				jButtonAnterioresTipoDelimiterActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDelimiter")) {
				jButtonSiguientesTipoDelimiterActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDelimiterBusqueda")) {
				this.jButtonidTipoDelimiterBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDelimiterBusqueda")) {
				this.jButtoncodigoTipoDelimiterBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDelimiterBusqueda")) {
				this.jButtonnombreTipoDelimiterBusquedaActionPerformed(evt);
			}
			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDelimiter();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDelimiter")) {
				closingInternalFrameTipoDelimiter();
				
			} else if(sTipo.equals("jButtonCancelarTipoDelimiter")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDelimiter = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDelimiterBeanSwingJInternalFrame jInternalFrameParent=(TipoDelimiterBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDelimiter.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDelimiterActionPerformed(null);
			}
			
			TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodelimiter,new Object(),this.tipodelimiterParameterGeneral,this.tipodelimiterReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDelimiter(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDelimiter(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDelimiter(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodelimiter)) {
			if(!esControlTabla) {
				if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDelimiter(this.tipodelimiter,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(this.tipodelimiter);			
				}
				
				if(this.tipodelimiterSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDelimiter(this.tipodelimiter,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodelimiterReturnGeneral=tipodelimiterLogic.procesarEventosTipoDelimitersWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodelimiterLogic.getTipoDelimiters(),this.tipodelimiter,this.tipodelimiterParameterGeneral,this.isEsNuevoTipoDelimiter,classes);//this.tipodelimiterLogic.getTipoDelimiter()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDelimiter(this.tipodelimiterReturnGeneral,this.tipodelimiterBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodelimiterSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDelimiter(classes,this.tipodelimiterReturnGeneral,this.tipodelimiterBean,false);
					}
						
					if(this.tipodelimiterReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDelimiter(this.tipodelimiterReturnGeneral.getTipoDelimiter());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDelimiter(this.tipodelimiterReturnGeneral.getTipoDelimiter());	
					}
						
					if(this.tipodelimiterReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDelimiter(this.tipodelimiterReturnGeneral.getTipoDelimiter(),classes);//this.tipodelimiterBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDelimiter(this.tipodelimiter,classes);//this.tipodelimiterBean);									
				}
			
				if(TipoDelimiterJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDelimiter(this.tipodelimiter,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDelimiter(this.tipodelimiter);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodelimiterAnterior!=null) {
						this.tipodelimiter=this.tipodelimiterAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodelimiterReturnGeneral=tipodelimiterLogic.procesarEventosTipoDelimitersWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodelimiterLogic.getTipoDelimiters(),this.tipodelimiter,this.tipodelimiterParameterGeneral,this.isEsNuevoTipoDelimiter,classes);//this.tipodelimiterLogic.getTipoDelimiter()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodelimiterSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodelimiterSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodelimiterReturnGeneral.getTipoDelimiter(),tipodelimiterLogic.getTipoDelimiters());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodelimiterReturnGeneral.getTipoDelimiter(),this.tipodelimiters);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDelimiter.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDelimiter.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDelimiter();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDelimiter() throws Exception {
		
		TipoDelimiterModel tipodelimiterModel=(TipoDelimiterModel)this.jTableDatosTipoDelimiter.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodelimiterModel.tipodelimiters=this.tipodelimiterLogic.getTipoDelimiters();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodelimiterModel.tipodelimiters=this.tipodelimiters;
		}
		
		
		((TipoDelimiterModel) this.jTableDatosTipoDelimiter.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDelimiter() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodelimiterAnterior(),this.tipodelimiterLogic.getTipoDelimiters());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodelimiterAnterior(),this.tipodelimiters);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDelimiter();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDelimiter(TipoDelimiter tipodelimiter,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
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
										
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodelimiter,new Object(),generalEntityParameterGeneral,this.tipodelimiterReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodelimiterSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDelimiterConstantesFunciones.getClassesRelationshipsOfTipoDelimiter(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDelimiterConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDelimiter(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDelimiter(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDelimiterBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodelimiter,new Object(),generalEntityParameterGeneral,this.tipodelimiterReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDelimiter(TipoDelimiterBean tipodelimiterBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDelimiter(ArrayList<Classe> classes,TipoDelimiterReturnGeneral tipodelimiterReturnGeneral,TipoDelimiterBean tipodelimiterBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDelimiter(TipoDelimiter tipodelimiter,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipodelimiter)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDelimiter = new TipoDelimiterDetalleFormJInternalFrame(jDesktopPane,this.tipodelimiterSessionBean.getConGuardarRelaciones(),this.tipodelimiterSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDelimiter);
		this.jInternalFrameDetalleFormTipoDelimiter.setVisible(false);
		this.jInternalFrameDetalleFormTipoDelimiter.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDelimiter.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDelimiter.tipodelimiterLogic=this.tipodelimiterLogic;
		
		this.cargarCombosFrameForeignKeyTipoDelimiter("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDelimiter();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDelimiter();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDelimiter("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDelimiter();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDelimiter.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDelimiter"));
		
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonModificarTipoDelimiter.addActionListener(new ButtonActionListener(this,"ModificarTipoDelimiter"));

		
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonModificarToolBarTipoDelimiter.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDelimiter"));
					
		this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemModificarTipoDelimiter.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDelimiter"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonActualizarTipoDelimiter.addActionListener (new ButtonActionListener(this,"ActualizarTipoDelimiter"));
		
		
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonActualizarToolBarTipoDelimiter.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDelimiter"));
						
		this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemActualizarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDelimiter"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonEliminarTipoDelimiter.addActionListener (new ButtonActionListener(this,"EliminarTipoDelimiter"));
		
		
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonEliminarToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDelimiter"));
								
		this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemEliminarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDelimiter"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonCancelarTipoDelimiter.addActionListener (new ButtonActionListener(this,"CancelarTipoDelimiter"));
		
		
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonCancelarToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDelimiter"));
					
		this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemCancelarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDelimiter"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemDetalleCerrarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDelimiter"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonGuardarCambiosToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDelimiter"));
		
		
		
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonGuardarCambiosToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDelimiter"));
		
		
		
		this.jInternalFrameDetalleFormTipoDelimiter.jComboBoxTiposAccionesFormularioTipoDelimiter.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDelimiter"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonidTipoDelimiterBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDelimiterBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDelimiter.jButtoncodigoTipoDelimiterBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDelimiterBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonnombreTipoDelimiterBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDelimiterBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDelimiter.jTabbedPaneRelacionesTipoDelimiter.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDelimiter"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDelimiter"));
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDelimiter"));
		}
		
		this.jTableDatosTipoDelimiter.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDelimiter"));
		
		this.jTableDatosTipoDelimiter.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDelimiter"));
		
		this.jButtonNuevoTipoDelimiter.addActionListener(new ButtonActionListener(this,"NuevoTipoDelimiter"));
		
		this.jButtonDuplicarTipoDelimiter.addActionListener(new ButtonActionListener(this,"DuplicarTipoDelimiter"));
		
		this.jButtonCopiarTipoDelimiter.addActionListener(new ButtonActionListener(this,"CopiarTipoDelimiter"));
		
		this.jButtonVerFormTipoDelimiter.addActionListener(new ButtonActionListener(this,"VerFormTipoDelimiter"));
		
		
		this.jButtonNuevoToolBarTipoDelimiter.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDelimiter"));
			
		this.jButtonDuplicarToolBarTipoDelimiter.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDelimiter"));
			
		this.jMenuItemNuevoTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDelimiter"));
			
		this.jMenuItemDuplicarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDelimiter"));		
		
		
		this.jButtonNuevoRelacionesTipoDelimiter.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDelimiter"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDelimiter.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDelimiter"));
			
		this.jMenuItemNuevoRelacionesTipoDelimiter.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDelimiter"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonModificarTipoDelimiter.addActionListener(new ButtonActionListener(this,"ModificarTipoDelimiter"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonModificarToolBarTipoDelimiter.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDelimiter"));
			
			this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemModificarTipoDelimiter.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDelimiter"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonActualizarTipoDelimiter.addActionListener (new ButtonActionListener(this,"ActualizarTipoDelimiter"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonActualizarToolBarTipoDelimiter.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDelimiter"));
				
			this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemActualizarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDelimiter"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonEliminarTipoDelimiter.addActionListener (new ButtonActionListener(this,"EliminarTipoDelimiter"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonEliminarToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDelimiter"));
						
			this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemEliminarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDelimiter"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonCancelarTipoDelimiter.addActionListener (new ButtonActionListener(this,"CancelarTipoDelimiter"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonCancelarToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDelimiter"));
			
			this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemCancelarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDelimiter"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDelimiter"));		
		
		
		this.jButtonCerrarTipoDelimiter.addActionListener (new ButtonActionListener(this,"CerrarTipoDelimiter"));
		
		
		this.jButtonCerrarToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDelimiter"));
			
		this.jMenuItemCerrarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDelimiter"));
			
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.jMenuItemDetalleCerrarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDelimiter"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonGuardarCambiosTipoDelimiter.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDelimiter"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.jButtonGuardarCambiosToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDelimiter"));
		}
		
		this.jButtonCopiarToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDelimiter"));
			
		this.jButtonVerFormToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDelimiter"));
		
		this.jMenuItemGuardarCambiosTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDelimiter"));
			
		this.jMenuItemCopiarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDelimiter"));		
		
		this.jMenuItemVerFormTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDelimiter"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDelimiter.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDelimiter"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDelimiter"));
			
		this.jMenuItemGuardarCambiosTablaTipoDelimiter.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDelimiter"));		
		
		
		
		this.jButtonRecargarInformacionTipoDelimiter.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDelimiter"));
					
		this.jButtonRecargarInformacionToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDelimiter"));
		
		this.jMenuItemRecargarInformacionTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDelimiter"));		
		
		
		
		this.jButtonAnterioresTipoDelimiter.addActionListener (new ButtonActionListener(this,"AnterioresTipoDelimiter"));
		
		
		this.jButtonAnterioresToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDelimiter"));
		
		this.jMenuItemAnterioresTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDelimiter"));		
		
		
		this.jButtonSiguientesTipoDelimiter.addActionListener (new ButtonActionListener(this,"SiguientesTipoDelimiter"));
		
		
		this.jButtonSiguientesToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDelimiter"));
			
		this.jMenuItemSiguientesTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDelimiter"));
			
		this.jMenuItemAbrirOrderByTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDelimiter"));
			
		this.jMenuItemMostrarOcultarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDelimiter"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDelimiter"));
			
		this.jMenuItemDetalleMostarOcultarTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDelimiter"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDelimiter.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDelimiter"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDelimiter"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDelimiter.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDelimiter"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDelimiter.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDelimiter"));

		this.jCheckBoxSeleccionadosTipoDelimiter.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDelimiter"));
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.jComboBoxTiposAccionesFormularioTipoDelimiter.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDelimiter"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDelimiter.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDelimiter"));
			
		this.jComboBoxTiposAccionesTipoDelimiter.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDelimiter"));
					
		this.jComboBoxTiposSeleccionarTipoDelimiter.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDelimiter"));
			
		this.jTextFieldValorCampoGeneralTipoDelimiter.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDelimiter"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonidTipoDelimiterBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDelimiterBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDelimiter.jButtoncodigoTipoDelimiterBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDelimiterBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonnombreTipoDelimiterBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDelimiterBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDelimiter!=null) {
				this.jInternalFrameReporteDinamicoTipoDelimiter.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDelimiter"));
				this.jInternalFrameReporteDinamicoTipoDelimiter.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDelimiter"));
				this.jInternalFrameReporteDinamicoTipoDelimiter.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDelimiter"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDelimiter.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDelimiter"));				
			//this.jButtonGenerarReporteDinamicoTipoDelimiter.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDelimiter"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDelimiter.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDelimiter"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDelimiter!=null) {
				this.jInternalFrameImportacionTipoDelimiter.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDelimiter"));
				this.jInternalFrameImportacionTipoDelimiter.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDelimiter"));
				this.jInternalFrameImportacionTipoDelimiter.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDelimiter"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDelimiter.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDelimiter"));
			
			this.jButtonAbrirOrderByToolBarTipoDelimiter.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDelimiter"));			
			
			if(this.jInternalFrameOrderByTipoDelimiter!=null) {
				this.jInternalFrameOrderByTipoDelimiter.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDelimiter"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDelimiter.jTabbedPaneRelacionesTipoDelimiter.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDelimiter"));
		
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
            		closingInternalFrameTipoDelimiter();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDelimiter.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDelimiter = (JInternalFrameBase)event.getSource();
	            	
	            TipoDelimiterBeanSwingJInternalFrame jInternalFrameParent=(TipoDelimiterBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDelimiter.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDelimiterActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDelimiter.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDelimiterListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDelimiter.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDelimiter.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDelimiterActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDelimiterActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDelimiterActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDelimiter";
		inputMap = this.jButtonNuevoTipoDelimiter.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDelimiter.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDelimiterActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDelimiterActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDelimiterActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDelimiterActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDelimiter";
		inputMap = this.jButtonNuevoRelacionesTipoDelimiter.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDelimiter.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDelimiterActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDelimiter";
		inputMap = this.jButtonModificarTipoDelimiter.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDelimiter.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDelimiterActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDelimiter";
		inputMap = this.jButtonActualizarTipoDelimiter.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDelimiter.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDelimiterActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDelimiter";
		inputMap = this.jButtonEliminarTipoDelimiter.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDelimiter.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDelimiterActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDelimiter";
		inputMap = this.jButtonCancelarTipoDelimiter.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDelimiter.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDelimiterActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDelimiter";
		inputMap = this.jButtonCerrarTipoDelimiter.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDelimiter.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDelimiterActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonGuardarCambiosTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDelimiter";
		inputMap = this.jInternalFrameDetalleFormTipoDelimiter.jButtonGuardarCambiosTipoDelimiter.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonGuardarCambiosTipoDelimiter.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDelimiterActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDelimiter.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDelimiterItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDelimiter.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDelimiterActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDelimiter.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDelimiterActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDelimiter.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDelimiterActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonidTipoDelimiterBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDelimiterBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDelimiter.jButtoncodigoTipoDelimiterBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDelimiterBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDelimiter.jButtonnombreTipoDelimiterBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDelimiterBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDelimiter.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDelimiterActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDelimiterActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDelimiter.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDelimiter(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDelimiter tipodelimiterAux:this.tipodelimiterLogic.getTipoDelimiters()) {
					tipodelimiterAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDelimiter tipodelimiterAux:tipodelimiters) {
					tipodelimiterAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDelimiterItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDelimiter(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDelimiter tipodelimiterAux:this.tipodelimiterLogic.getTipoDelimiters()) {
						tipodelimiterAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDelimiter tipodelimiterAux:tipodelimiters) {
						tipodelimiterAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDelimiter tipodelimiterAux:this.tipodelimiterLogic.getTipoDelimiters()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDelimiter tipodelimiterAux:tipodelimiters) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDelimiter(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDelimiter.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDelimiter.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDelimiter,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDelimiterItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDelimiter(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDelimiter.getSelectedRows();
			
			TipoDelimiter tipodelimiterLocal=new TipoDelimiter();
			
			//this.seleccionarTodosTipoDelimiter(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodelimiterLocal =(TipoDelimiter) this.tipodelimiterLogic.getTipoDelimiters().toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodelimiterLocal =(TipoDelimiter) this.tipodelimiters.toArray()[this.jTableDatosTipoDelimiter.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodelimiterLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDelimiter tipodelimiterAux:this.tipodelimiterLogic.getTipoDelimiters()) {
						tipodelimiterAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDelimiter tipodelimiterAux:tipodelimiters) {
						tipodelimiterAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDelimiter(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDelimiter.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDelimiter.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDelimiter,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDelimiterItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDelimiterParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDelimiterActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDelimiter(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDelimiter.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDelimiter tipodelimiterAux:this.tipodelimiterLogic.getTipoDelimiters()) {
				
						if(sTipoSeleccionar.equals(TipoDelimiterConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodelimiterAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDelimiterConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodelimiterAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDelimiter tipodelimiterAux:tipodelimiters) {
					
						if(sTipoSeleccionar.equals(TipoDelimiterConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodelimiterAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDelimiterConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodelimiterAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDelimiter(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDelimiterActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDelimiter(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDelimiter=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDelimiter.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDelimiter.jComboBoxTiposAccionesFormularioTipoDelimiter.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDelimiter) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDelimiter(conSplash);
				
					this.generarReporteTipoDelimitersSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDelimiter.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDelimiter.jComboBoxTiposAccionesFormularioTipoDelimiter.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDelimitersSeleccionados();
				//this.jComboBoxTiposAccionesTipoDelimiter.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDelimitersSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDelimiter.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDelimitersSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDelimiter.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDelimiter();
				
				this.exportarTipoDelimitersSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDelimiter.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDelimiter.jComboBoxTiposAccionesFormularioTipoDelimiter.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDelimiters();
				//this.importarTipoDelimiters();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDelimiter.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDelimiter.jComboBoxTiposAccionesFormularioTipoDelimiter.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDelimiter();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDelimitersSeleccionados();
				//this.jComboBoxTiposAccionesTipoDelimiter.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Delimiter", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDelimiter();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDelimiter)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDelimiter(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Delimiter",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDelimiter.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDelimiter.jComboBoxTiposAccionesFormularioTipoDelimiter.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDelimiter();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDelimiter(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDelimiterActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDelimiter();
			
			if(this.jInternalFrameDetalleFormTipoDelimiter==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();		
			TipoDelimiter tipodelimiter=new TipoDelimiter();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDelimiter(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDelimiter.getSelectedItem();
			
			
			
			
			tipodelimitersSeleccionados=this.getTipoDelimitersSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodelimitersSeleccionados.size()==1) {
				for(TipoDelimiter tipodelimiterAux:tipodelimitersSeleccionados) {
					tipodelimiter=tipodelimiterAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDelimiter();
			
      		//this.finishProcessTipoDelimiter(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDelimiterReturnGeneral() throws Exception {
		if(this.tipodelimiterReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodelimiterReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodelimiterReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodelimiterReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodelimiterReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodelimiterReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDelimiter(false);
		}
		
		if(this.tipodelimiterReturnGeneral.getConRetornoLista() || this.tipodelimiterReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodelimiterReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodelimiterLogic.setTipoDelimiters(this.tipodelimiterReturnGeneral.getTipoDelimiters());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodelimiterReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodelimiterLogic.setTipoDelimiter(this.tipodelimiterReturnGeneral.getTipoDelimiter());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDelimiter(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDelimiter() throws Exception {
		
		
	}
	
	public ArrayList<TipoDelimiter> getTipoDelimitersSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDelimiter) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDelimiter tipodelimiterAux:tipodelimiterLogic.getTipoDelimiters()) {
					if(tipodelimiterAux.getIsSelected()) {
						tipodelimitersSeleccionados.add(tipodelimiterAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDelimiter tipodelimiterAux:this.tipodelimiters) {
					if(tipodelimiterAux.getIsSelected()) {
						tipodelimitersSeleccionados.add(tipodelimiterAux);				
					}
				}
			}
			
			if(tipodelimitersSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodelimitersSeleccionados.addAll(this.tipodelimiterLogic.getTipoDelimiters());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodelimitersSeleccionados.addAll(this.tipodelimiters);				
					}
				}
			}
		} else {
			tipodelimitersSeleccionados.add(this.tipodelimiter);
		}
		
		return tipodelimitersSeleccionados;
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
	
	public void generarReporteTipoDelimitersSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDelimitersSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDelimitersSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDelimitersSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDelimitersSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Delimiter",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDelimitersSeleccionados() throws Exception {
		ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();		
		
		tipodelimitersSeleccionados=this.getTipoDelimitersSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDelimiters("Todos",tipodelimitersSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDelimitersSeleccionados() throws Exception {
		ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();		
		
		tipodelimitersSeleccionados=this.getTipoDelimitersSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDelimiters("Todos",tipodelimitersSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDelimitersSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();
		
		tipodelimitersSeleccionados=this.getTipoDelimitersSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDelimiters("Todos",tipodelimitersSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDelimitersSeleccionados() throws Exception {
		ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDelimiter();
		
		
		tipodelimitersSeleccionados=this.getTipoDelimitersSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDelimiter();
		
		
		//this.generarReporteTipoDelimiters("Todos",tipodelimitersSeleccionados ,tipodelimiterImplementable,tipodelimiterImplementableHome);
	}
	
	public void mostrarImportacionTipoDelimiters() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDelimiter();
		
		this.abrirFrameImportacionTipoDelimiter();		
		
			
		//this.generarReporteTipoDelimiters("Todos",tipodelimitersSeleccionados ,tipodelimiterImplementable,tipodelimiterImplementableHome);
	}
	
	public void importarTipoDelimiters() throws Exception {		
	
	}
	
	public void exportarTipoDelimitersSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDelimitersSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDelimitersSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDelimitersSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Delimiter",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDelimitersSeleccionados() throws Exception {
		ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();		
		
		tipodelimitersSeleccionados=this.getTipoDelimitersSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodelimiter."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDelimiter(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDelimiter tipodelimiterAux:tipodelimitersSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDelimiter(tipodelimiterAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodelimiterAux.setsDetalleGeneralEntityReporte(tipodelimiterAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Delimiter",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDelimiter(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDelimiterConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDelimiterConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDelimiterConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDelimiterConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDelimiter(TipoDelimiter tipodelimiter,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodelimiter.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodelimiter.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodelimiter.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodelimiter.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDelimitersSeleccionados() throws Exception {
		ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();		
		
		tipodelimitersSeleccionados=this.getTipoDelimitersSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodelimiter.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDelimiters");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDelimiter(row);				
				iRow++;
			}				
			
			for(TipoDelimiter tipodelimiterAux:tipodelimitersSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDelimiter(tipodelimiterAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Delimiter",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDelimitersSeleccionados() throws Exception {
		ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();		
		
		tipodelimitersSeleccionados=this.getTipoDelimitersSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodelimiter.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodelimiters");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodelimiter");
			//elementRoot.appendChild(element);
		
			for(TipoDelimiter tipodelimiterAux:tipodelimitersSeleccionados) {
				element = document.createElement("tipodelimiter");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDelimiter(tipodelimiterAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Delimiter",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDelimiter(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDelimiterConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDelimiterConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDelimiterConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDelimiterConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDelimiter(TipoDelimiter tipodelimiter,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodelimiter.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodelimiter.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodelimiter.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoDelimiter(TipoDelimiter tipodelimiter,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDelimiterConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodelimiter.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDelimiterConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodelimiter.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoDelimiterConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipodelimiter.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoDelimiterConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodelimiter.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoDelimitersSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDelimiter> tipodelimitersSeleccionados=new ArrayList<TipoDelimiter>();
		
		tipodelimitersSeleccionados=this.getTipoDelimitersSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDelimiter(tipodelimitersSeleccionados);
		
		this.generarReporteTipoDelimiters("Todos",tipodelimitersSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDelimiter(ArrayList<TipoDelimiter> tipodelimitersSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDelimiter tipodelimiterAux:tipodelimitersSeleccionados) {
				tipodelimiterAux.setsDetalleGeneralEntityReporte(tipodelimiterAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDelimiterConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipodelimiterAux.setsDescripcionGeneralEntityReporte1(tipodelimiterAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoDelimiterConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodelimiterAux.setsDescripcionGeneralEntityReporte1(tipodelimiterAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDelimiterConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDelimiter(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDelimiter=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDelimiter=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDelimiter=false;
			this.isVisibilidadCeldaActualizarTipoDelimiter=false;
			this.isVisibilidadCeldaEliminarTipoDelimiter=false;
			this.isVisibilidadCeldaCancelarTipoDelimiter=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDelimiter=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDelimiter=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDelimiter=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDelimiter=false;
			this.isVisibilidadCeldaModificarTipoDelimiter=false;
			this.isVisibilidadCeldaActualizarTipoDelimiter=true;
			this.isVisibilidadCeldaEliminarTipoDelimiter=false;
			this.isVisibilidadCeldaCancelarTipoDelimiter=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDelimiter=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDelimiter=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDelimiter=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDelimiter=false;
			this.isVisibilidadCeldaModificarTipoDelimiter=false;
			this.isVisibilidadCeldaActualizarTipoDelimiter=true;
			this.isVisibilidadCeldaEliminarTipoDelimiter=true;
			this.isVisibilidadCeldaCancelarTipoDelimiter=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDelimiter=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDelimiter=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDelimiter=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDelimiter=false;
			this.isVisibilidadCeldaModificarTipoDelimiter=false;
			this.isVisibilidadCeldaActualizarTipoDelimiter=true;
			this.isVisibilidadCeldaEliminarTipoDelimiter=false;
			this.isVisibilidadCeldaCancelarTipoDelimiter=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDelimiter=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDelimiter=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDelimiter=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDelimiter=true;
			this.isVisibilidadCeldaModificarTipoDelimiter=false;
			this.isVisibilidadCeldaActualizarTipoDelimiter=false;
			this.isVisibilidadCeldaEliminarTipoDelimiter=false;
			this.isVisibilidadCeldaCancelarTipoDelimiter=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDelimiter=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDelimiter=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDelimiter=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDelimiter=false;
			this.isVisibilidadCeldaActualizarTipoDelimiter=false;
			this.isVisibilidadCeldaEliminarTipoDelimiter=false;
			this.isVisibilidadCeldaCancelarTipoDelimiter=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDelimiter=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDelimiter=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDelimiter=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDelimiter=false;
			this.isVisibilidadCeldaModificarTipoDelimiter=true;
			this.isVisibilidadCeldaActualizarTipoDelimiter=false;
			this.isVisibilidadCeldaEliminarTipoDelimiter=false;
			this.isVisibilidadCeldaCancelarTipoDelimiter=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDelimiter=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDelimiter=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDelimiterJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDelimiter=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDelimiter=true;
		} else {
			this.actualizarEstadoPanelsTipoDelimiter(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDelimiter=false;
			//this.isVisibilidadCeldaVerFormTipoDelimiter=false;
			this.isVisibilidadCeldaDuplicarTipoDelimiter=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodelimiterSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDelimiter=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDelimiter=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodelimiterSessionBean.getEsGuardarRelacionado()) {
			if(!tipodelimiterSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=false;												
			}
			
			this.jButtonCerrarTipoDelimiter.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDelimiter=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodelimiter)) {
			this.isVisibilidadCeldaActualizarTipoDelimiter=false;
			this.isVisibilidadCeldaEliminarTipoDelimiter=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDelimiter() {
	}
	
	public void actualizarEstadoPanelsTipoDelimiter(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDelimiter!=null) {
				this.jScrollPanelDatosEdicionTipoDelimiter.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDelimiter!=null) {
				this.jScrollPanelDatosTipoDelimiter.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDelimiter!=null) {
				this.jPanelPaginacionTipoDelimiter.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDelimiter!=null) {
				this.jPanelParametrosReportesTipoDelimiter.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDelimiter!=null) {
				this.jScrollPanelDatosEdicionTipoDelimiter.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDelimiter!=null) {
				this.jScrollPanelDatosTipoDelimiter.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDelimiter!=null) {
				this.jPanelPaginacionTipoDelimiter.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDelimiter!=null) {
				this.jPanelParametrosReportesTipoDelimiter.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDelimiter!=null) {
				this.jScrollPanelDatosEdicionTipoDelimiter.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoDelimiter!=null) {
				this.jScrollPanelDatosTipoDelimiter.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDelimiter!=null) {
				this.jPanelPaginacionTipoDelimiter.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDelimiter!=null) {
				this.jPanelParametrosReportesTipoDelimiter.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDelimiter!=null) {
				this.jScrollPanelDatosEdicionTipoDelimiter.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDelimiter!=null) {
				this.jScrollPanelDatosTipoDelimiter.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDelimiter!=null) {
				this.jPanelPaginacionTipoDelimiter.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDelimiter!=null) {
				this.jPanelParametrosReportesTipoDelimiter.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDelimiter!=null) {
				this.jScrollPanelDatosEdicionTipoDelimiter.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDelimiter!=null) {
				this.jScrollPanelDatosTipoDelimiter.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDelimiter!=null) {
				this.jPanelPaginacionTipoDelimiter.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDelimiter!=null) {
				this.jPanelParametrosReportesTipoDelimiter.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDelimiter!=null) {
				this.jScrollPanelDatosEdicionTipoDelimiter.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoDelimiter!=null) {
				this.jScrollPanelDatosTipoDelimiter.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDelimiter!=null) {
				this.jPanelPaginacionTipoDelimiter.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDelimiter!=null) {
				this.jPanelParametrosReportesTipoDelimiter.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDelimiter!=null) {
				this.jScrollPanelDatosEdicionTipoDelimiter.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoDelimiter!=null) {
				this.jScrollPanelDatosTipoDelimiter.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDelimiter!=null) {
				this.jPanelPaginacionTipoDelimiter.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDelimiter!=null) {
				this.jPanelParametrosReportesTipoDelimiter.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDelimiterSessionBean tipodelimiterSessionBean=new TipoDelimiterSessionBean();
		
		if(this.tipodelimiterSessionBean==null) {
			this.tipodelimiterSessionBean=new TipoDelimiterSessionBean();
		}
		
		this.tipodelimiterSessionBean.setsUltimaBusquedaTipoDelimiter(this.getsAccionBusqueda());
		this.tipodelimiterSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodelimiterSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDelimiterSessionBean tipodelimiterSessionBean=new TipoDelimiterSessionBean();
		
		if(this.tipodelimiterSessionBean==null) {
			this.tipodelimiterSessionBean=new TipoDelimiterSessionBean();
		}
		
		if(this.tipodelimiterSessionBean.getsUltimaBusquedaTipoDelimiter()!=null&&!this.tipodelimiterSessionBean.getsUltimaBusquedaTipoDelimiter().equals("")) {
			this.setsAccionBusqueda(tipodelimiterSessionBean.getsUltimaBusquedaTipoDelimiter());
			this.setiNumeroPaginacion(tipodelimiterSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodelimiterSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipodelimiterSessionBean.setsUltimaBusquedaTipoDelimiter("");
		this.tipodelimiterSessionBean.setiNumeroPaginacion(TipoDelimiterConstantesFunciones.INUMEROPAGINACION);
		this.tipodelimiterSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDelimiter(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDelimiter() {
		this.updateBorderResaltarBusquedasFormularioTipoDelimiter();
		this.updateVisibilidadBusquedasFormularioTipoDelimiter();
		this.updateHabilitarBusquedasFormularioTipoDelimiter();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDelimiter() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDelimiter() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoDelimiter() {
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
	
	public void updateControlesFormularioTipoDelimiter() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDelimiter==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDelimiter();
		this.updateVisibilidadResaltarControlesFormularioTipoDelimiter();
		this.updateHabilitarResaltarControlesFormularioTipoDelimiter();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDelimiter() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDelimiter==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodelimiterConstantesFunciones.resaltaridTipoDelimiter!=null && this.jInternalFrameDetalleFormTipoDelimiter!=null) {this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldidTipoDelimiter.setBorder(this.tipodelimiterConstantesFunciones.resaltaridTipoDelimiter);}
		if(this.tipodelimiterConstantesFunciones.resaltarcodigoTipoDelimiter!=null && this.jInternalFrameDetalleFormTipoDelimiter!=null) {this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldcodigoTipoDelimiter.setBorder(this.tipodelimiterConstantesFunciones.resaltarcodigoTipoDelimiter);}
		if(this.tipodelimiterConstantesFunciones.resaltarnombreTipoDelimiter!=null && this.jInternalFrameDetalleFormTipoDelimiter!=null) {this.jInternalFrameDetalleFormTipoDelimiter.jTextAreanombreTipoDelimiter.setBorder(this.tipodelimiterConstantesFunciones.resaltarnombreTipoDelimiter);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDelimiter() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDelimiter==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
	
		//this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldidTipoDelimiter.setVisible(this.tipodelimiterConstantesFunciones.mostraridTipoDelimiter);
		this.jInternalFrameDetalleFormTipoDelimiter.jPanelidTipoDelimiter.setVisible(this.tipodelimiterConstantesFunciones.mostraridTipoDelimiter);
		//this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldcodigoTipoDelimiter.setVisible(this.tipodelimiterConstantesFunciones.mostrarcodigoTipoDelimiter);
		this.jInternalFrameDetalleFormTipoDelimiter.jPanelcodigoTipoDelimiter.setVisible(this.tipodelimiterConstantesFunciones.mostrarcodigoTipoDelimiter);
		//this.jInternalFrameDetalleFormTipoDelimiter.jTextAreanombreTipoDelimiter.setVisible(this.tipodelimiterConstantesFunciones.mostrarnombreTipoDelimiter);
		this.jInternalFrameDetalleFormTipoDelimiter.jPanelnombreTipoDelimiter.setVisible(this.tipodelimiterConstantesFunciones.mostrarnombreTipoDelimiter);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDelimiter() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDelimiter==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDelimiter!=null) {
	
		this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldidTipoDelimiter.setEnabled(this.tipodelimiterConstantesFunciones.activaridTipoDelimiter);
		this.jInternalFrameDetalleFormTipoDelimiter.jTextFieldcodigoTipoDelimiter.setEnabled(this.tipodelimiterConstantesFunciones.activarcodigoTipoDelimiter);
		this.jInternalFrameDetalleFormTipoDelimiter.jTextAreanombreTipoDelimiter.setEnabled(this.tipodelimiterConstantesFunciones.activarnombreTipoDelimiter);
		}
	}
	
		
}