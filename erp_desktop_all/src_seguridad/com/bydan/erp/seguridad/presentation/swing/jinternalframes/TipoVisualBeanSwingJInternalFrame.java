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

import com.bydan.erp.seguridad.util.TipoVisualConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoVisualParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoVisualParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoVisualBean;
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
public class TipoVisualBeanSwingJInternalFrame extends TipoVisualJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoVisualBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoVisual> tipovisualValidator = new ClassValidator<TipoVisual>(TipoVisual.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoVisual tipovisual;	
	public TipoVisual tipovisualAux;
	public TipoVisual tipovisualAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoVisual tipovisualTotales;
	public Long idTipoVisualActual;
	public Long iIdNuevoTipoVisual=0L;
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
	
	public Boolean isPermisoTodoTipoVisual;
	public Boolean isPermisoNuevoTipoVisual;
	public Boolean isPermisoActualizarTipoVisual;
	public Boolean isPermisoActualizarOriginalTipoVisual;
	public Boolean isPermisoEliminarTipoVisual;
	public Boolean isPermisoGuardarCambiosTipoVisual;
	public Boolean isPermisoConsultaTipoVisual;
	public Boolean isPermisoBusquedaTipoVisual;
	public Boolean isPermisoReporteTipoVisual;
	public Boolean isPermisoPaginacionMedioTipoVisual;
	public Boolean isPermisoPaginacionAltoTipoVisual;
	public Boolean isPermisoPaginacionTodoTipoVisual;
	public Boolean isPermisoCopiarTipoVisual;
	public Boolean isPermisoVerFormTipoVisual;
	public Boolean isPermisoDuplicarTipoVisual;
	public Boolean isPermisoOrdenTipoVisual;
	
	
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
	
	public TipoVisualParameterReturnGeneral tipovisualReturnGeneral;
	public TipoVisualParameterReturnGeneral tipovisualParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoVisual=false;
	public Boolean esParaAccionDesdeFormularioTipoVisual=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoVisualLogic tipovisualLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoVisual tipovisualBean;
	public TipoVisualConstantesFunciones tipovisualConstantesFunciones;
	//public TipoVisualParameterReturnGeneral tipovisualReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoVisual> tipovisuals;	
	//public List<TipoVisual> tipovisualsEliminados;
	//public List<TipoVisual> tipovisualsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoVisual=false;
	public Boolean isVisibilidadCeldaDuplicarTipoVisual=true;
	public Boolean isVisibilidadCeldaCopiarTipoVisual=true;
	public Boolean isVisibilidadCeldaVerFormTipoVisual=true;
	public Boolean isVisibilidadCeldaOrdenTipoVisual=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoVisual=false;
	public Boolean isVisibilidadCeldaModificarTipoVisual=false;
	public Boolean isVisibilidadCeldaActualizarTipoVisual=false;
	public Boolean isVisibilidadCeldaEliminarTipoVisual=false;
	public Boolean isVisibilidadCeldaCancelarTipoVisual=false;
	public Boolean isVisibilidadCeldaGuardarTipoVisual=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoVisual=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoVisual() {
		return this.iIdNuevoTipoVisual;
	}

	public void setiIdNuevoTipoVisual(Long iIdNuevoTipoVisual) {
		this.iIdNuevoTipoVisual = iIdNuevoTipoVisual;
	}
	
	public Long getidTipoVisualActual() {
		return this.idTipoVisualActual;
	}

	public void setidTipoVisualActual(Long idTipoVisualActual) {
		this.idTipoVisualActual = idTipoVisualActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoVisual gettipovisual() {
		return this.tipovisual;
	}

	public void settipovisual(TipoVisual tipovisual) {
		this.tipovisual = tipovisual;
	}
	
	public TipoVisual gettipovisualAux() {
		return this.tipovisualAux;
	}

	public void settipovisualAux(TipoVisual tipovisualAux) {
		this.tipovisualAux = tipovisualAux;
	}				
	
	public TipoVisual gettipovisualAnterior() {
		return this.tipovisualAnterior;
	}

	public void settipovisualAnterior(TipoVisual tipovisualAnterior) {
		this.tipovisualAnterior = tipovisualAnterior;
	}	
	
	public TipoVisual gettipovisualTotales() {
		return this.tipovisualTotales;
	}

	public void settipovisualTotales(TipoVisual tipovisualTotales) {
		this.tipovisualTotales = tipovisualTotales;
	}	
	
	public TipoVisual gettipovisualBean() {
		return this.tipovisualBean;
	}

	public void settipovisualBean(TipoVisual tipovisualBean) {
		this.tipovisualBean = tipovisualBean;
	}	
	
	public TipoVisualParameterReturnGeneral gettipovisualReturnGeneral() {
		return this.tipovisualReturnGeneral;
	}

	public void settipovisualReturnGeneral(TipoVisualParameterReturnGeneral tipovisualReturnGeneral) {
		this.tipovisualReturnGeneral = tipovisualReturnGeneral;
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
	
	
	public TipoVisualLogic getTipoVisualLogic()	{		
		return tipovisualLogic;
	}

	public void setTipoVisualLogic(TipoVisualLogic tipovisualLogic) {
		this.tipovisualLogic = tipovisualLogic;
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
	
	public Boolean getIsEsNuevoTipoVisual() {
		return isEsNuevoTipoVisual;
	}

	public void setIsEsNuevoTipoVisual(Boolean isEsNuevoTipoVisual) {
		this.isEsNuevoTipoVisual = isEsNuevoTipoVisual;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoVisual() {
		return esParaAccionDesdeFormularioTipoVisual;
	}
	
	public void setEsParaAccionDesdeFormularioTipoVisual(Boolean esParaAccionDesdeFormularioTipoVisual) {
		this.esParaAccionDesdeFormularioTipoVisual = esParaAccionDesdeFormularioTipoVisual;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoVisual() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoVisualConstantesFunciones.refrescarForeignKeysDescripcionesTipoVisual(this.tipovisualLogic.getTipoVisuals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoVisualConstantesFunciones.refrescarForeignKeysDescripcionesTipoVisual(this.tipovisuals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipovisualLogic.setTipoVisuals(this.tipovisuals);
			tipovisualLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoVisualParameterReturnGeneral getTipoVisualParameterGeneral() {
		return this.tipovisualParameterGeneral;
	}
	
	public void setTipoVisualParameterGeneral(TipoVisualParameterReturnGeneral tipovisualParameterGeneral) {
		this.tipovisualParameterGeneral = tipovisualParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoVisual() {
		return isPermisoTodoTipoVisual;
	}

	public void setIsPermisoTodoTipoVisual(Boolean isPermisoTodoTipoVisual) {
		this.isPermisoTodoTipoVisual = isPermisoTodoTipoVisual;
	}

	public Boolean getIsPermisoNuevoTipoVisual() {
		return isPermisoNuevoTipoVisual;
	}

	public void setIsPermisoNuevoTipoVisual(Boolean isPermisoNuevoTipoVisual) {
		this.isPermisoNuevoTipoVisual = isPermisoNuevoTipoVisual;
	}

	public Boolean getIsPermisoActualizarTipoVisual() {
		return isPermisoActualizarTipoVisual;
	}

	public void setIsPermisoActualizarTipoVisual(Boolean isPermisoActualizarTipoVisual) {
		this.isPermisoActualizarTipoVisual = isPermisoActualizarTipoVisual;
	}

	public Boolean getIsPermisoEliminarTipoVisual() {
		return isPermisoEliminarTipoVisual;
	}

	public void setIsPermisoEliminarTipoVisual(Boolean isPermisoEliminarTipoVisual) {
		this.isPermisoEliminarTipoVisual = isPermisoEliminarTipoVisual;
	}

	public Boolean getIsPermisoGuardarCambiosTipoVisual() {
		return isPermisoGuardarCambiosTipoVisual;
	}

	public void setIsPermisoGuardarCambiosTipoVisual(Boolean isPermisoGuardarCambiosTipoVisual) {
		this.isPermisoGuardarCambiosTipoVisual = isPermisoGuardarCambiosTipoVisual;
	}
	
	public Boolean getIsPermisoConsultaTipoVisual() {
		return isPermisoConsultaTipoVisual;
	}

	public void setIsPermisoConsultaTipoVisual(Boolean isPermisoConsultaTipoVisual) {
		this.isPermisoConsultaTipoVisual = isPermisoConsultaTipoVisual;
	}

	public Boolean getIsPermisoBusquedaTipoVisual() {
		return isPermisoBusquedaTipoVisual;
	}

	public void setIsPermisoBusquedaTipoVisual(Boolean isPermisoBusquedaTipoVisual) {
		this.isPermisoBusquedaTipoVisual = isPermisoBusquedaTipoVisual;
	}

	public Boolean getIsPermisoReporteTipoVisual() {
		return isPermisoReporteTipoVisual;
	}

	public void setIsPermisoReporteTipoVisual(Boolean isPermisoReporteTipoVisual) {
		this.isPermisoReporteTipoVisual = isPermisoReporteTipoVisual;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoVisual() {
		return isPermisoPaginacionMedioTipoVisual;
	}

	public void setIsPermisoPaginacionMedioTipoVisual(Boolean isPermisoPaginacionMedioTipoVisual) {
		this.isPermisoPaginacionMedioTipoVisual = isPermisoPaginacionMedioTipoVisual;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoVisual() {
		return isPermisoPaginacionTodoTipoVisual;
	}

	public void setIsPermisoPaginacionTodoTipoVisual(Boolean isPermisoPaginacionTodoTipoVisual) {
		this.isPermisoPaginacionTodoTipoVisual = isPermisoPaginacionTodoTipoVisual;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoVisual() {
		return isPermisoPaginacionAltoTipoVisual;
	}

	public void setIsPermisoPaginacionAltoTipoVisual(Boolean isPermisoPaginacionAltoTipoVisual) {
		this.isPermisoPaginacionAltoTipoVisual = isPermisoPaginacionAltoTipoVisual;
	}
	
	public Boolean getIsPermisoCopiarTipoVisual() {
		return isPermisoCopiarTipoVisual;
	}

	public void setIsPermisoCopiarTipoVisual(Boolean isPermisoCopiarTipoVisual) {
		this.isPermisoCopiarTipoVisual = isPermisoCopiarTipoVisual;
	}
	
	public Boolean getIsPermisoVerFormTipoVisual() {
		return isPermisoVerFormTipoVisual;
	}

	public void setIsPermisoVerFormTipoVisual(Boolean isPermisoVerFormTipoVisual) {
		this.isPermisoVerFormTipoVisual = isPermisoVerFormTipoVisual;
	}
	
	public Boolean getIsPermisoDuplicarTipoVisual() {
		return isPermisoDuplicarTipoVisual;
	}

	public void setIsPermisoDuplicarTipoVisual(Boolean isPermisoDuplicarTipoVisual) {
		this.isPermisoDuplicarTipoVisual = isPermisoDuplicarTipoVisual;
	}
	
	public Boolean getIsPermisoOrdenTipoVisual() {
		return isPermisoOrdenTipoVisual;
	}

	public void setIsPermisoOrdenTipoVisual(Boolean isPermisoOrdenTipoVisual) {
		this.isPermisoOrdenTipoVisual = isPermisoOrdenTipoVisual;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoVisual() {
		return isVisibilidadCeldaNuevoTipoVisual;
	}

	public void setIsVisibilidadCeldaNuevoTipoVisual(Boolean isVisibilidadCeldaNuevoTipoVisual) {
		this.isVisibilidadCeldaNuevoTipoVisual = isVisibilidadCeldaNuevoTipoVisual;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoVisual() {
		return isVisibilidadCeldaDuplicarTipoVisual;
	}

	public void setIsVisibilidadCeldaDuplicarTipoVisual(Boolean isVisibilidadCeldaDuplicarTipoVisual) {
		this.isVisibilidadCeldaDuplicarTipoVisual = isVisibilidadCeldaDuplicarTipoVisual;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoVisual() {
		return isVisibilidadCeldaCopiarTipoVisual;
	}

	public void setIsVisibilidadCeldaCopiarTipoVisual(Boolean isVisibilidadCeldaCopiarTipoVisual) {
		this.isVisibilidadCeldaCopiarTipoVisual = isVisibilidadCeldaCopiarTipoVisual;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoVisual() {
		return isVisibilidadCeldaVerFormTipoVisual;
	}

	public void setIsVisibilidadCeldaVerFormTipoVisual(Boolean isVisibilidadCeldaVerFormTipoVisual) {
		this.isVisibilidadCeldaVerFormTipoVisual = isVisibilidadCeldaVerFormTipoVisual;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoVisual() {
		return isVisibilidadCeldaOrdenTipoVisual;
	}

	public void setIsVisibilidadCeldaOrdenTipoVisual(Boolean isVisibilidadCeldaOrdenTipoVisual) {
		this.isVisibilidadCeldaOrdenTipoVisual = isVisibilidadCeldaOrdenTipoVisual;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoVisual() {
		return isVisibilidadCeldaNuevoRelacionesTipoVisual;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoVisual(Boolean isVisibilidadCeldaNuevoRelacionesTipoVisual) {
		this.isVisibilidadCeldaNuevoRelacionesTipoVisual = isVisibilidadCeldaNuevoRelacionesTipoVisual;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoVisual() {
		return isVisibilidadCeldaModificarTipoVisual;
	}

	public void setIsVisibilidadCeldaModificarTipoVisual(Boolean isVisibilidadCeldaModificarTipoVisual) {
		this.isVisibilidadCeldaModificarTipoVisual = isVisibilidadCeldaModificarTipoVisual;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoVisual() {
		return isVisibilidadCeldaActualizarTipoVisual;
	}

	public void setIsVisibilidadCeldaActualizarTipoVisual(Boolean isVisibilidadCeldaActualizarTipoVisual) {
		this.isVisibilidadCeldaActualizarTipoVisual = isVisibilidadCeldaActualizarTipoVisual;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoVisual() {
		return isVisibilidadCeldaEliminarTipoVisual;
	}

	public void setIsVisibilidadCeldaEliminarTipoVisual(Boolean isVisibilidadCeldaEliminarTipoVisual) {
		this.isVisibilidadCeldaEliminarTipoVisual = isVisibilidadCeldaEliminarTipoVisual;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoVisual() {
		return isVisibilidadCeldaCancelarTipoVisual;
	}

	public void setIsVisibilidadCeldaCancelarTipoVisual(Boolean isVisibilidadCeldaCancelarTipoVisual) {
		this.isVisibilidadCeldaCancelarTipoVisual = isVisibilidadCeldaCancelarTipoVisual;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoVisual() {
		return isVisibilidadCeldaGuardarTipoVisual;
	}

	public void setIsVisibilidadCeldaGuardarTipoVisual(Boolean isVisibilidadCeldaGuardarTipoVisual) {
		this.isVisibilidadCeldaGuardarTipoVisual = isVisibilidadCeldaGuardarTipoVisual;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoVisual() {
		return isVisibilidadCeldaGuardarCambiosTipoVisual;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoVisual(Boolean isVisibilidadCeldaGuardarCambiosTipoVisual) {
		this.isVisibilidadCeldaGuardarCambiosTipoVisual = isVisibilidadCeldaGuardarCambiosTipoVisual;
	}
		
	public TipoVisualSessionBean gettipovisualSessionBean() {
		return this.tipovisualSessionBean;
	}
	
	public void settipovisualSessionBean(TipoVisualSessionBean tipovisualSessionBean) {
		this.tipovisualSessionBean=tipovisualSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoVisual(TipoVisual tipovisual)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoVisual tipovisual,TipoVisual tipovisualAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoVisual(tipovisual);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipovisualAux.setId(tipovisual.getId());
		tipovisualAux.setVersionRow(tipovisual.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoVisual();
		
			int intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisual =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipovisual =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoVisualJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoVisual(this.tipovisual,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(this.tipovisual);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipovisualValidator.getInvalidValues(this.tipovisual);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipovisualLogic.setDatosCliente(datosCliente);
			tipovisualLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipovisualAux=new  TipoVisual();
				
				tipovisualAux.setIsNew(true);
				tipovisualAux.setIsChanged(true);
				
				tipovisualAux.setTipoVisualOriginal(this.tipovisual);
				
				tipovisualAux.setId(this.tipovisual.getId());	
				tipovisualAux.setVersionRow(this.tipovisual.getVersionRow());	
				tipovisualAux.setcodigo(this.tipovisual.getcodigo());	
				tipovisualAux.setnombre(this.tipovisual.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipovisualSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipovisualSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipovisualAux,tipovisualLogic.getTipoVisuals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovisualAux,tipovisuals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipovisualSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovisualSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovisualLogic.saveTipoVisuals();//WithConnection
						//tipovisualLogic.getSetVersionRowTipoVisuals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipovisual,tipovisualAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipovisualAux=new  TipoVisual();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipovisualSessionBean.getEsGuardarRelacionado() 
					|| (this.tipovisualSessionBean.getEsGuardarRelacionado() && this.tipovisual.getId()>=0)) {
						
					tipovisualAux.setIsNew(false);
				}
				
				tipovisualAux.setIsDeleted(false);
			
				tipovisualAux.setId(this.tipovisual.getId());	
				tipovisualAux.setVersionRow(this.tipovisual.getVersionRow());	
				tipovisualAux.setcodigo(this.tipovisual.getcodigo());	
				tipovisualAux.setnombre(this.tipovisual.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipovisualAux,tipovisualLogic.getTipoVisuals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovisualAux,tipovisuals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipovisualSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovisualSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovisualLogic.saveTipoVisuals();//WithConnection
						//tipovisualLogic.getSetVersionRowTipoVisuals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipovisual,tipovisualAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipovisualAux=new  TipoVisual();
				
				tipovisualAux.setIsNew(false);
				tipovisualAux.setIsChanged(false);
				
				tipovisualAux.setIsDeleted(true);
				
				tipovisualAux.setId(this.tipovisual.getId());	
				tipovisualAux.setVersionRow(this.tipovisual.getVersionRow());	
				tipovisualAux.setcodigo(this.tipovisual.getcodigo());	
				tipovisualAux.setnombre(this.tipovisual.getnombre());	
				
				if(this.tipovisualSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipovisualAux.getId()>=0) {	
						this.tipovisualsEliminados.add(tipovisualAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipovisualAux,tipovisualLogic.getTipoVisuals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovisualAux,tipovisuals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipovisualSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovisualSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovisualLogic.saveTipoVisuals();//WithConnection
						//tipovisualLogic.getSetVersionRowTipoVisuals();//WithConnection
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
					this.tipovisualLogic.getTipoVisuals().addAll(this.tipovisualsEliminados);
					
					tipovisualLogic.saveTipoVisuals();//WithConnection
					//tipovisualLogic.getSetVersionRowTipoVisuals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipovisualsEliminados= new ArrayList<TipoVisual>();		
			}
			
			if(this.tipovisualSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Visual GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Visual",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipovisual=tipovisualAux;
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
      		//this.finishProcessTipoVisual();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoVisual tipovisualLocal) throws Exception {
		
		if(this.tipovisualSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoVisual tipovisualLocal) throws Exception {	
		if(this.tipovisualSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoVisualActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipovisual =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipovisual =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipovisualValidator.getInvalidValues(this.tipovisual);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoVisual tipovisual,List<TipoVisual> tipovisuals) throws Exception {
		try	{		
			TipoVisualConstantesFunciones.actualizarLista(tipovisual,tipovisuals,this.tipovisualSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoVisual tipovisual,List<TipoVisual> tipovisuals) throws Exception {
		try	{			
			TipoVisualConstantesFunciones.actualizarSelectedLista(tipovisual,tipovisuals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoVisual> tipovisualsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipovisualsLocal=this.tipovisualLogic.getTipoVisuals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipovisualsLocal=this.tipovisuals;
			}
			//ARCHITECTURE
		
			for(TipoVisual tipovisualLocal:tipovisualsLocal) {
				if(this.permiteMantenimiento(tipovisualLocal) && tipovisualLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoVisualConstantesFunciones.getTipoVisualLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoVisualConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVisual.jLabelcodigoTipoVisual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoVisualConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVisual.jLabelnombreTipoVisual,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoVisual.jLabelcodigoTipoVisual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoVisual.jLabelnombreTipoVisual,"");
		
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
		this.iIdNuevoTipoVisual--;	
		
		
		this.tipovisualAux=new TipoVisual();
		
		this.tipovisualAux.setId(this.iIdNuevoTipoVisual);
		this.tipovisualAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipovisualLogic.getTipoVisuals().add(this.tipovisualAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipovisuals.add(this.tipovisualAux);
		}
		//ARCHITECTURE
		
		this.tipovisual=this.tipovisualAux;
		
		if(TipoVisualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoVisual(this.tipovisual);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoVisual(this.tipovisual);
		}
				
		//this.setDefaultControlesTipoVisual();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoVisual();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoVisual();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVisual();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoVisual(this.tipovisualBean,this.tipovisual,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(this.tipovisual);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoVisualConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipovisualSessionBean.getConGuardarRelaciones()) {
			classes=TipoVisualConstantesFunciones.getClassesRelationshipsOfTipoVisual(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipovisualReturnGeneral=tipovisualLogic.procesarEventosTipoVisualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovisualLogic.getTipoVisuals(),this.tipovisual,this.tipovisualParameterGeneral,this.isEsNuevoTipoVisual,classes);//this.tipovisualLogic.getTipoVisual()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoVisual(this.tipovisualReturnGeneral,this.tipovisualBean,false);
		
		if(this.tipovisualReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoVisual(this.tipovisualReturnGeneral.getTipoVisual());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoVisual(this.tipovisualReturnGeneral.getTipoVisual());
		}
		
		if(this.tipovisualReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoVisual(this.tipovisualReturnGeneral.getTipoVisual(),classes);//this.tipovisualBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoVisual(this.tipovisual,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoVisual();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoVisual();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoVisual(false);
						
			if(tipovisualSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoVisualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVisual();
			}
			
			this.actualizarVisualTableDatosTipoVisual();
			
			this.jTableDatosTipoVisual.setRowSelectionInterval(this.getIndiceNuevoTipoVisual(), this.getIndiceNuevoTipoVisual());
			
			this.seleccionarFilaTablaTipoVisualActual();
						
			this.actualizarEstadoCeldasBotonesTipoVisual("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoVisual(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoVisual.jTextFieldcodigoTipoVisual.setEnabled(isHabilitar && this.tipovisualConstantesFunciones.activarcodigoTipoVisual);
		this.jInternalFrameDetalleFormTipoVisual.jTextAreanombreTipoVisual.setEnabled(isHabilitar && this.tipovisualConstantesFunciones.activarnombreTipoVisual);	
		
	};
	
	public void setDefaultControlesTipoVisual() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoVisual(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipovisualSessionBean.setConGuardarRelaciones(true);			
			this.tipovisualSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoVisual.jTabbedPaneRelacionesTipoVisual.setVisible(true);
			
					
		} else {
			//this.tipovisualSessionBean.setConGuardarRelaciones(false);			
			this.tipovisualSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoVisual.jTabbedPaneRelacionesTipoVisual.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoVisual() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVisual tipovisualAux:this.tipovisualLogic.getTipoVisuals()) {
				if(tipovisualAux.getId().equals(this.iIdNuevoTipoVisual)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVisual tipovisualAux:this.tipovisuals) {
				if(tipovisualAux.getId().equals(this.iIdNuevoTipoVisual)) {
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
	
	public int getIndiceActualTipoVisual(TipoVisual tipovisual,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVisual tipovisualAux:this.tipovisualLogic.getTipoVisuals()) {
				if(tipovisualAux.getId().equals(tipovisual.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVisual tipovisualAux:this.tipovisuals) {
				if(tipovisualAux.getId().equals(tipovisual.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoVisual(TipoVisual tipovisualOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVisual tipovisualAux:this.tipovisualLogic.getTipoVisuals()) {
				if(tipovisualAux.getTipoVisualOriginal().getId().equals(tipovisualOriginal.getId())) {
					existe=true;
					tipovisualOriginal.setId(tipovisualAux.getId());
					tipovisualOriginal.setVersionRow(tipovisualAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVisual tipovisualAux:this.tipovisuals) {
				if(tipovisualAux.getTipoVisualOriginal().getId().equals(tipovisualOriginal.getId())) {
					existe=true;
					tipovisualOriginal.setId(tipovisualAux.getId());
					tipovisualOriginal.setVersionRow(tipovisualAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoVisual(Boolean esParaCancelar) throws Exception {
		tipovisualsAux=new ArrayList<TipoVisual>();
		tipovisualAux=new TipoVisual();
		
		if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoVisual tipovisualAux:this.tipovisualLogic.getTipoVisuals()) {
					if(tipovisualAux.getId()<0) {
						tipovisualsAux.add(tipovisualAux);
					}		
				}
				this.iIdNuevoTipoVisual=0L;
				this.tipovisualLogic.getTipoVisuals().removeAll(tipovisualsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVisual tipovisualAux:this.tipovisuals) {
					if(tipovisualAux.getId()<0) {
						tipovisualsAux.add(tipovisualAux);
					}		
				}
				this.iIdNuevoTipoVisual=0L;
				this.tipovisuals.removeAll(tipovisualsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoVisual 
					&& this.tipovisualLogic.getTipoVisuals().size()>0
					) {
					tipovisualAux=this.tipovisualLogic.getTipoVisuals().get(this.tipovisualLogic.getTipoVisuals().size() - 1);
				
					if(tipovisualAux.getId()<0) {
						this.tipovisualLogic.getTipoVisuals().remove(tipovisualAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoVisual && this.tipovisuals.size()>0) {
					tipovisualAux=this.tipovisuals.get(this.tipovisuals.size() - 1);
				
					if(tipovisualAux.getId()<0) {
						this.tipovisuals.remove(tipovisualAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoVisual(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipovisual.getId()<0) {
				this.tipovisualLogic.getTipoVisuals().remove(this.tipovisual);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipovisual.getId()<0) {
				this.tipovisuals.remove(this.tipovisual);
			}
		}			
	}
	
	public void setEstadosInicialesTipoVisual(List<TipoVisual> tipovisualsAux) throws Exception {
		TipoVisualConstantesFunciones.setEstadosInicialesTipoVisual(tipovisualsAux);
	}
	
	public void setEstadosInicialesTipoVisual(TipoVisual tipovisualAux) throws Exception {
		TipoVisualConstantesFunciones.setEstadosInicialesTipoVisual(tipovisualAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoVisualActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoVisual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoVisualActual()) {
				if(!this.isEsNuevoTipoVisual) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoVisual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoVisual=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoVisualActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Visual ?", "MANTENIMIENTO DE Tipo Visual", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoVisual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoVisual tipovisual) throws Exception {
		TipoVisualConstantesFunciones.seleccionarAsignar(this.tipovisual,tipovisual);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoVisual=this.isPermisoActualizarOriginalTipoVisual;
			
			
			this.seleccionarAsignar(tipovisual);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoVisualConstantesFunciones.quitarEspaciosTipoVisual(this.tipovisual,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoVisual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipovisualSessionBean.setsFuncionBusquedaRapida(this.tipovisualSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoVisual) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoVisual(esParaCancelar);				
				this.cancelarNuevoTipoVisual(esParaCancelar);								
			}
			
			this.tipovisual=new TipoVisual();
			
			this.inicializarTipoVisual();
			
			this.actualizarEstadoCeldasBotonesTipoVisual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoVisual() throws Exception {
		try {
			TipoVisualConstantesFunciones.inicializarTipoVisual(this.tipovisual);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipovisualLogic.getTipoVisuals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoVisuals(String sAccionBusqueda,List<TipoVisual> tipovisualsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoVisual"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoVisualMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoVisualMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoVisual"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Visuals");		
		parameters.put("busquedapor", TipoVisualConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoVisual=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoVisualConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoVisualConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoVisual=new JRBeanArrayDataSource(TipoVisualJInternalFrame.TraerTipoVisualBeans(tipovisualsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoVisual);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoVisualConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoVisualConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoVisualBean.TraerTipoVisualBeans(tipovisualsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoVisuals(sAccionBusqueda,sTipoArchivoReporte,tipovisualsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoVisuals(sAccionBusqueda,sTipoArchivoReporte,tipovisualsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoVisualActionPerformed(null);
					//this.generarExcelReporteTipoVisuals(sAccionBusqueda,sTipoArchivoReporte,tipovisualsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoVisuals(sAccionBusqueda,sTipoArchivoReporte,tipovisualsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoVisuals(sAccionBusqueda,sTipoArchivoReporte,tipovisualsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoVisuals(sAccionBusqueda,sTipoArchivoReporte,tipovisualsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoVisuals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVisual> tipovisualsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovisual";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoVisuals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoVisual("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoVisual tipovisual : tipovisualsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoVisualConstantesFunciones.generarExcelReporteDataTipoVisual("NORMAL",row,workbook,tipovisual,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Visual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoVisual(String sTipo,Row row,Workbook workbook) {
		
		TipoVisualConstantesFunciones.generarExcelReporteHeaderTipoVisual(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoVisuals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVisual> tipovisualsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovisual_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoVisuals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoVisual tipovisual : tipovisualsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoVisualConstantesFunciones.getTipoVisualDescripcion(tipovisual));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoVisualConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoVisualConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovisual.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoVisualConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoVisualConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovisual.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Visual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoVisuals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVisual> tipovisualsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoVisual> tipovisualsRespaldo=null;
		
		classes=TipoVisualConstantesFunciones.getClassesRelationshipsOfTipoVisual(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipovisualLogic.setDatosCliente(this.datosCliente);
		this.tipovisualLogic.setDatosDeep(this.datosDeep);
		this.tipovisualLogic.setIsConDeep(true);
		
		tipovisualsRespaldo=this.tipovisualLogic.getTipoVisuals();
		
		this.tipovisualLogic.setTipoVisuals(tipovisualsParaReportes);	
		this.tipovisualLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipovisualsParaReportes=this.tipovisualLogic.getTipoVisuals();
		this.tipovisualLogic.setTipoVisuals(tipovisualsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovisual_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoVisuals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoVisual("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoVisual tipovisual : tipovisualsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoVisual("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoVisualConstantesFunciones.generarExcelReporteDataTipoVisual("NORMAL",row,workbook,tipovisual,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoVisualConstantesFunciones.getTipoVisualDescripcion(tipovisual));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Visual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVisual.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVisual.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVisual.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVisual.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoVisual() throws Exception {		
		this.startProcessTipoVisual(true);
	}
	
	public void startProcessTipoVisual(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoVisual ,this.jPanelParametrosReportesTipoVisual, this.jScrollPanelDatosTipoVisual,this.jPanelPaginacionTipoVisual, this.jScrollPanelDatosEdicionTipoVisual, this.jPanelAccionesTipoVisual,this.jPanelAccionesFormularioTipoVisual,this.jmenuBarTipoVisual,this.jmenuBarDetalleTipoVisual,this.jTtoolBarTipoVisual,this.jTtoolBarDetalleTipoVisual);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoVisual=this.jTabbedPaneBusquedasTipoVisual; 
		
		final JPanel jPanelParametrosReportesTipoVisual=this.jPanelParametrosReportesTipoVisual;
		//final JScrollPane jScrollPanelDatosTipoVisual=this.jScrollPanelDatosTipoVisual;
		final JTable jTableDatosTipoVisual=this.jTableDatosTipoVisual;		
		final JPanel jPanelPaginacionTipoVisual=this.jPanelPaginacionTipoVisual;
		//final JScrollPane jScrollPanelDatosEdicionTipoVisual=this.jScrollPanelDatosEdicionTipoVisual;
		final JPanel jPanelAccionesTipoVisual=this.jPanelAccionesTipoVisual;
		
		JPanel jPanelCamposAuxiliarTipoVisual=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoVisual=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) {
			jPanelCamposAuxiliarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jPanelCamposTipoVisual;
			jPanelAccionesFormularioAuxiliarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jPanelAccionesFormularioTipoVisual;
		}
		
		final JPanel jPanelCamposTipoVisual=jPanelCamposAuxiliarTipoVisual;
		final JPanel jPanelAccionesFormularioTipoVisual=jPanelAccionesFormularioAuxiliarTipoVisual;
		
		
		final JMenuBar jmenuBarTipoVisual=this.jmenuBarTipoVisual;
		final JToolBar jTtoolBarTipoVisual=this.jTtoolBarTipoVisual;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoVisual=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoVisual=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) {
			jmenuBarDetalleAuxiliarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jmenuBarDetalleTipoVisual;
			jTtoolBarDetalleAuxiliarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jTtoolBarDetalleTipoVisual;
		}
		
		final JMenuBar jmenuBarDetalleTipoVisual=jmenuBarDetalleAuxiliarTipoVisual;
		final JToolBar jTtoolBarDetalleTipoVisual=jTtoolBarDetalleAuxiliarTipoVisual;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoVisual;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoVisual;
			processRunnable.jTableDatos=jTableDatosTipoVisual;
			processRunnable.jPanelCampos=jPanelCamposTipoVisual;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoVisual;
			processRunnable.jPanelAcciones=jPanelAccionesTipoVisual;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoVisual;
			
			
			processRunnable.jmenuBar=jmenuBarTipoVisual;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoVisual;
			processRunnable.jTtoolBar=jTtoolBarTipoVisual;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoVisual;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoVisual ,jPanelParametrosReportesTipoVisual,jTableDatosTipoVisual, /*jScrollPanelDatosTipoVisual,*/jPanelCamposTipoVisual,jPanelPaginacionTipoVisual, /*jScrollPanelDatosEdicionTipoVisual,*/ jPanelAccionesTipoVisual,jPanelAccionesFormularioTipoVisual,jmenuBarTipoVisual,jmenuBarDetalleTipoVisual,jTtoolBarTipoVisual,jTtoolBarDetalleTipoVisual);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoVisual ,jPanelParametrosReportesTipoVisual, jScrollPanelDatosTipoVisual,jPanelPaginacionTipoVisual, jScrollPanelDatosEdicionTipoVisual, jPanelAccionesTipoVisual,jPanelAccionesFormularioTipoVisual,jmenuBarTipoVisual,jmenuBarDetalleTipoVisual,jTtoolBarTipoVisual,jTtoolBarDetalleTipoVisual);
						
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
	
	public void finishProcessTipoVisual() {// throws Exception 
		this.finishProcessTipoVisual(true);
	}
	
	public void finishProcessTipoVisual(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoVisual ,this.jPanelParametrosReportesTipoVisual, this.jScrollPanelDatosTipoVisual,this.jPanelPaginacionTipoVisual, this.jScrollPanelDatosEdicionTipoVisual, this.jPanelAccionesTipoVisual,this.jPanelAccionesFormularioTipoVisual,this.jmenuBarTipoVisual,this.jmenuBarDetalleTipoVisual,this.jTtoolBarTipoVisual,this.jTtoolBarDetalleTipoVisual);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoVisual=this.jTabbedPaneBusquedasTipoVisual; 
		
		final JPanel jPanelParametrosReportesTipoVisual=this.jPanelParametrosReportesTipoVisual;
		//final JScrollPane jScrollPanelDatosTipoVisual=this.jScrollPanelDatosTipoVisual;
		final JTable jTableDatosTipoVisual=this.jTableDatosTipoVisual;		
		final JPanel jPanelPaginacionTipoVisual=this.jPanelPaginacionTipoVisual;
		//final JScrollPane jScrollPanelDatosEdicionTipoVisual=this.jScrollPanelDatosEdicionTipoVisual;
		final JPanel jPanelAccionesTipoVisual=this.jPanelAccionesTipoVisual;
		
		JPanel jPanelCamposAuxiliarTipoVisual=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoVisual=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) {
			jPanelCamposAuxiliarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jPanelCamposTipoVisual;
			jPanelAccionesFormularioAuxiliarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jPanelAccionesFormularioTipoVisual;
		}
		
		final JPanel jPanelCamposTipoVisual=jPanelCamposAuxiliarTipoVisual;
		final JPanel jPanelAccionesFormularioTipoVisual=jPanelAccionesFormularioAuxiliarTipoVisual;
		
		
		final JMenuBar jmenuBarTipoVisual=this.jmenuBarTipoVisual;		
		final JToolBar jTtoolBarTipoVisual=this.jTtoolBarTipoVisual;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoVisual=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoVisual=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) {
			jmenuBarDetalleAuxiliarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jmenuBarDetalleTipoVisual;
			jTtoolBarDetalleAuxiliarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jTtoolBarDetalleTipoVisual;		
		}
		
		final JMenuBar jmenuBarDetalleTipoVisual=jmenuBarDetalleAuxiliarTipoVisual;
		final JToolBar jTtoolBarDetalleTipoVisual=jTtoolBarDetalleAuxiliarTipoVisual;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoVisual;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoVisual;
			processRunnable.jTableDatos=jTableDatosTipoVisual;
			processRunnable.jPanelCampos=jPanelCamposTipoVisual;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoVisual;
			processRunnable.jPanelAcciones=jPanelAccionesTipoVisual;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoVisual;
			
			
			processRunnable.jmenuBar=jmenuBarTipoVisual;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoVisual;
			processRunnable.jTtoolBar=jTtoolBarTipoVisual;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoVisual;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoVisual ,jPanelParametrosReportesTipoVisual, jTableDatosTipoVisual,/*jScrollPanelDatosTipoVisual,*/jPanelCamposTipoVisual,jPanelPaginacionTipoVisual, /*jScrollPanelDatosEdicionTipoVisual,*/ jPanelAccionesTipoVisual,jPanelAccionesFormularioTipoVisual,jmenuBarTipoVisual,jmenuBarDetalleTipoVisual,jTtoolBarTipoVisual,jTtoolBarDetalleTipoVisual));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoVisual(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoVisual(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoVisual(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoVisual(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoVisual,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoVisual,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoVisual(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoVisual,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoVisual,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipovisualConstantesFunciones.getsFinalQueryTipoVisual();
		String  finalQueryPaginacionTodos=this.tipovisualConstantesFunciones.getsFinalQueryTipoVisual();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoVisualConstantesFunciones.getArrayColumnasGlobalesNoTipoVisual(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoVisualConstantesFunciones.getArrayColumnasGlobalesTipoVisual(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoVisualConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipovisualsEliminados= new ArrayList<TipoVisual>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoVisual();
		
				///*TipoVisualSessionBean*/this.tipovisualSessionBean=new TipoVisualSessionBean();
			
			if(this.tipovisualSessionBean==null) {
				this.tipovisualSessionBean=new TipoVisualSessionBean();
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
					this.iNumeroPaginacion=TipoVisualConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoVisualConstantesFunciones.getClassesForeignKeysOfTipoVisual(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipovisual."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipovisualsAux= new ArrayList<TipoVisual>();
			
				
			tipovisualLogic.setDatosCliente(this.datosCliente);
			tipovisualLogic.setDatosDeep(this.datosDeep);
			tipovisualLogic.setIsConDeep(true);
			
			
			tipovisualLogic.getTipoVisualDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipovisualLogic.getTodosTipoVisuals(finalQueryGlobal,pagination);
					
					//tipovisualLogic.getTodosTipoVisualsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipovisualLogic.getTipoVisuals()==null|| tipovisualLogic.getTipoVisuals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovisualsAux= new ArrayList<TipoVisual>();
							tipovisualsAux.addAll(tipovisualLogic.getTipoVisuals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovisualsAux= new ArrayList<TipoVisual>();
							tipovisualsAux.addAll(tipovisuals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovisualLogic.getTodosTipoVisuals(finalQueryGlobal+"",this.pagination);												
							
							//tipovisualLogic.getTodosTipoVisualsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoVisuals("Todos",tipovisualLogic.getTipoVisuals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovisualLogic.setTipoVisuals(new ArrayList<TipoVisual>());					
							tipovisualLogic.getTipoVisuals().addAll(tipovisualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovisuals=new ArrayList<TipoVisual>();
							tipovisuals.addAll(tipovisualsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoVisual=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoVisual=this.idActual;
				
				} else if(this.idTipoVisualActual!=null && this.idTipoVisualActual!=0L) {
					idTipoVisual=idTipoVisualActual;
				}
				
					
				this.sDetalleReporte=TipoVisualConstantesFunciones.getDetalleIndicePorId(idTipoVisual);
				
				this.tipovisuals=new ArrayList<TipoVisual>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipovisualLogic.getEntity(idTipoVisual);
					
					//tipovisualLogic.getEntityWithConnection(idTipoVisual);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovisualLogic.setTipoVisuals(new ArrayList<TipoVisual>());
					tipovisualLogic.getTipoVisuals().add(tipovisualLogic.getTipoVisual());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipovisuals=new ArrayList<TipoVisual>();
					this.tipovisuals.add(tipovisual);
				}
				
				if(tipovisualLogic.getTipoVisual()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoVisualConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipovisualLogic.getTipoVisualsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoVisualConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoVisualConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipovisualLogic.getTipoVisuals()==null||tipovisualLogic.getTipoVisuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipovisuals==null|| tipovisuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovisualsAux=new ArrayList<TipoVisual>();
						tipovisualsAux.addAll(tipovisualLogic.getTipoVisuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovisualsAux=new ArrayList<TipoVisual>();
							tipovisualsAux.addAll(tipovisuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipovisualLogic.getTipoVisualsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoVisualConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoVisualConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoVisuals("BusquedaPorNombre",tipovisualLogic.getTipoVisuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoVisuals("BusquedaPorNombre",tipovisuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovisualLogic.setTipoVisuals(new ArrayList<TipoVisual>());
						tipovisualLogic.getTipoVisuals().addAll(tipovisualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovisuals=new ArrayList<TipoVisual>();
							tipovisuals.addAll(tipovisualsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoVisual();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoVisual();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipovisualLogic.getTipoVisuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovisuals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipovisualLogic.getTipoVisuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovisuals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoVisual tipovisual) {
		Boolean permite=true;
		
		if(this.tipovisual.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoVisualConstantesFunciones.getOrderByListaTipoVisual();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoVisualConstantesFunciones.getOrderByListaTipoVisual();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVisual tipovisual:tipovisualLogic.getTipoVisuals()) {
				if(tipovisual.getsType().equals(Constantes2.S_TOTALES)) {
					tipovisualTotales=tipovisual;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVisual tipovisual:this.tipovisuals) {
				if(tipovisual.getsType().equals(Constantes2.S_TOTALES)) {
					tipovisualTotales=tipovisual;
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
			this.tipovisualAux=new TipoVisual();
			this.tipovisualAux.setsType(Constantes2.S_TOTALES);
			this.tipovisualAux.setIsNew(false);
			this.tipovisualAux.setIsChanged(false);
			this.tipovisualAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoVisualConstantesFunciones.TotalizarValoresFilaTipoVisual(this.tipovisualLogic.getTipoVisuals(),this.tipovisualAux);
				
				this.tipovisualLogic.getTipoVisuals().add(this.tipovisualAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoVisualConstantesFunciones.TotalizarValoresFilaTipoVisual(this.tipovisuals,this.tipovisualAux);
				
				this.tipovisuals.add(this.tipovisualAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipovisualTotales=new TipoVisual();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipovisualLogic.getTipoVisuals().remove(tipovisualTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipovisuals.remove(tipovisualTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipovisualTotales=new TipoVisual();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVisual tipovisual:tipovisualLogic.getTipoVisuals()) {
				if(tipovisual.getsType().equals(Constantes2.S_TOTALES)) {
					tipovisualTotales=tipovisual;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoVisualConstantesFunciones.TotalizarValoresFilaTipoVisual(this.tipovisualLogic.getTipoVisuals(),tipovisualTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVisual tipovisual:this.tipovisuals) {
				if(tipovisual.getsType().equals(Constantes2.S_TOTALES)) {
					tipovisualTotales=tipovisual;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoVisualConstantesFunciones.TotalizarValoresFilaTipoVisual(this.tipovisuals,tipovisualTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoVisualsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoVisualsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovisualLogic.getTipoVisualsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
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
	
	public void inicializarPermisosTipoVisual() {
		this.isPermisoTodoTipoVisual=false;
		this.isPermisoNuevoTipoVisual=false;
		this.isPermisoActualizarTipoVisual=false;
		this.isPermisoActualizarOriginalTipoVisual=false;
		this.isPermisoEliminarTipoVisual=false;
		this.isPermisoGuardarCambiosTipoVisual=false;
		this.isPermisoConsultaTipoVisual=false;
		this.isPermisoBusquedaTipoVisual=false;
		this.isPermisoReporteTipoVisual=false;		
		this.isPermisoOrdenTipoVisual=false;		
		this.isPermisoPaginacionMedioTipoVisual=false;		
		this.isPermisoPaginacionAltoTipoVisual=false;
		this.isPermisoPaginacionTodoTipoVisual=false;
		this.isPermisoCopiarTipoVisual=false;		
		this.isPermisoVerFormTipoVisual=false;		
		this.isPermisoDuplicarTipoVisual=false;		
		this.isPermisoOrdenTipoVisual=false;		
	}
	
	public void setPermisosUsuarioTipoVisual(Boolean isPermiso) {
		this.isPermisoTodoTipoVisual=isPermiso;
		this.isPermisoNuevoTipoVisual=isPermiso;
		this.isPermisoActualizarTipoVisual=isPermiso;
		this.isPermisoActualizarOriginalTipoVisual=isPermiso;
		this.isPermisoEliminarTipoVisual=isPermiso;
		this.isPermisoGuardarCambiosTipoVisual=isPermiso;
		this.isPermisoConsultaTipoVisual=isPermiso;
		this.isPermisoBusquedaTipoVisual=isPermiso;
		this.isPermisoReporteTipoVisual=isPermiso;
		this.isPermisoOrdenTipoVisual=isPermiso;		
		this.isPermisoPaginacionMedioTipoVisual=isPermiso;		
		this.isPermisoPaginacionAltoTipoVisual=isPermiso;		
		this.isPermisoPaginacionTodoTipoVisual=isPermiso;		
		this.isPermisoCopiarTipoVisual=isPermiso;		
		this.isPermisoVerFormTipoVisual=isPermiso;		
		this.isPermisoDuplicarTipoVisual=isPermiso;
		this.isPermisoOrdenTipoVisual=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoVisual(Boolean isPermiso) {
		//this.isPermisoTodoTipoVisual=isPermiso;
		this.isPermisoNuevoTipoVisual=isPermiso;
		this.isPermisoActualizarTipoVisual=isPermiso;
		this.isPermisoActualizarOriginalTipoVisual=isPermiso;
		this.isPermisoEliminarTipoVisual=isPermiso;
		this.isPermisoGuardarCambiosTipoVisual=isPermiso;
		//this.isPermisoConsultaTipoVisual=isPermiso;
		//this.isPermisoBusquedaTipoVisual=isPermiso;
		//this.isPermisoReporteTipoVisual=isPermiso;
		//this.isPermisoOrdenTipoVisual=isPermiso;		
		//this.isPermisoPaginacionMedioTipoVisual=isPermiso;		
		//this.isPermisoPaginacionAltoTipoVisual=isPermiso;		
		//this.isPermisoPaginacionTodoTipoVisual=isPermiso;		
		//this.isPermisoCopiarTipoVisual=isPermiso;		
		//this.isPermisoDuplicarTipoVisual=isPermiso;
		//this.isPermisoOrdenTipoVisual=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoVisualClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoVisualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoVisual(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoVisualClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoVisualClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoVisualClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoVisualClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoVisual() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoVisualJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipovisualSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoVisualConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoVisual=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoVisual=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoVisual=this.isPermisoActualizarTipoVisual;
			this.isPermisoEliminarTipoVisual=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoVisual=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoVisual=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoVisual=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoVisual=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoVisual=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoVisual=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoVisual=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoVisual=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoVisual=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoVisual=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoVisual=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoVisual=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoVisual=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipovisualSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoVisual.setToolTipText(this.jTableDatosTipoVisual.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoVisual(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoVisual(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoVisualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoVisualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoVisual() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoVisualListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoVisualListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoVisualJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoVisualListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoVisualListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoVisual()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoVisual()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoVisual(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoVisual()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVisual();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoVisual(TipoVisual tipovisual)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoVisual(TipoVisual tipovisual,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoVisual()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVisual()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoVisual()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoVisual()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoVisual()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoVisual()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoVisual(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoVisual()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoVisualBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoVisualBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoVisualBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipovisualSessionBean=new TipoVisualSessionBean(); 
		this.tipovisualConstantesFunciones=new TipoVisualConstantesFunciones(); 
		this.tipovisualBean=new TipoVisual();//(this.tipovisualConstantesFunciones); 		
		this.tipovisualReturnGeneral=new TipoVisualParameterReturnGeneral(); 
		
		this.tipovisualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovisualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoVisualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoVisualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoVisualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoVisual(true);
			
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
			
			this.tipovisualConstantesFunciones=new TipoVisualConstantesFunciones(); 
			this.tipovisualBean=new TipoVisual();//this.tipovisualConstantesFunciones); 			
			this.tipovisualReturnGeneral=new TipoVisualParameterReturnGeneral(); 
		
			TipoVisualBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Visual Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipovisual=new TipoVisual();
			this.tipovisuals = new ArrayList<TipoVisual>();
			this.tipovisualsAux = new ArrayList<TipoVisual>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic=new TipoVisualLogic();
				this.tipovisualLogic.getNewConnexionToDeep("");
			}
			
			//this.tipovisualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipovisualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoVisual);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoVisual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoVisual);	
					}
					
					if(this.jInternalFrameImportacionTipoVisual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoVisual);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoVisual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoVisual);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoVisual!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoVisual);
				this.jInternalFrameDetalleFormTipoVisual.setVisible(false);
				this.jInternalFrameDetalleFormTipoVisual.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoVisual!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoVisual);
					this.jInternalFrameReporteDinamicoTipoVisual.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoVisual.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoVisual!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoVisual);
					this.jInternalFrameImportacionTipoVisual.setVisible(false);
					this.jInternalFrameImportacionTipoVisual.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoVisual!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoVisual);
					this.jInternalFrameOrderByTipoVisual.setVisible(false);
					this.jInternalFrameOrderByTipoVisual.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoVisualActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoVisualConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipovisualReturnGeneral=new TipoVisualParameterReturnGeneral();
			
			this.tipovisualParameterGeneral=new TipoVisualParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipovisualLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoVisualJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipovisualSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoVisualConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipovisualSessionBean.getEsGuardarRelacionado(),this.tipovisualSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoVisualConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipovisualSessionBean.getEsGuardarRelacionado(),this.tipovisualSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoVisual=false;
			this.isVisibilidadCeldaDuplicarTipoVisual=true;
			this.isVisibilidadCeldaCopiarTipoVisual=true;
			this.isVisibilidadCeldaVerFormTipoVisual=true;
			this.isVisibilidadCeldaOrdenTipoVisual=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVisual=false;
			this.isVisibilidadCeldaModificarTipoVisual=false;
			this.isVisibilidadCeldaActualizarTipoVisual=false;
			this.isVisibilidadCeldaEliminarTipoVisual=false;
			this.isVisibilidadCeldaCancelarTipoVisual=false;
			this.isVisibilidadCeldaGuardarTipoVisual=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVisual=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoVisual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoVisual();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoVisual(false);
			
			this.setPermisosUsuarioTipoVisual();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovisualSessionBean.getEsGuardarRelacionado() 
				|| (this.tipovisualSessionBean.getEsGuardarRelacionado() && this.tipovisualSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoVisualClasesRelacionadas();
			}
			
			if(this.tipovisualSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoVisualClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoVisualJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoVisual();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoVisual();
			}
			
			if(!this.isPermisoBusquedaTipoVisual) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoVisual.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoVisual,this.isPermisoPaginacionMedioTipoVisual,this.isPermisoPaginacionTodoTipoVisual);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoVisualConstantesFunciones.getTiposSeleccionarTipoVisual());
				
				this.tiposColumnasSelect=TipoVisualConstantesFunciones.getTiposSeleccionarTipoVisual(true);
				
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
			//if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoVisual();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoVisual(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoVisual(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVisual() ;
			
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
				tipovisualImplementable= (TipoVisualImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoVisualConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipovisualImplementableHome= (TipoVisualImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoVisualConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipovisuals= new ArrayList<TipoVisual>();
			this.tipovisualsEliminados= new ArrayList<TipoVisual>();
						
			this.isEsNuevoTipoVisual=false;
			this.esParaAccionDesdeFormularioTipoVisual=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoVisual(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoVisual();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoVisualConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoVisual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoVisual(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoVisual!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoVisual();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoVisual();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoVisual.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoVisual.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoVisual.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoVisual(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoVisual: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoVisual() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoVisual")) {
				iIndex=this.jInternalFrameDetalleFormTipoVisual.jTabbedPaneRelacionesTipoVisual.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoVisual.jTabbedPaneRelacionesTipoVisual.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoVisual();	
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
	
	public void cargarCombosForeignKeyTipoVisual(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoVisual(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoVisual(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoVisualListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoVisual();
		
		this.cargarCombosFrameForeignKeyTipoVisual();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoVisual();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoVisual();
		}
	}
	
	
	
	public void jButtonNuevoTipoVisualActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipovisualSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoVisual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			
			
			if(jTableDatosTipoVisual.getRowCount()>=1) {
				jTableDatosTipoVisual.removeRowSelectionInterval(0, jTableDatosTipoVisual.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoVisual=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoVisual(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoVisual(true);			
			//this.tipovisual=new TipoVisual();
			//this.tipovisual.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVisual(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVisual() ;
			
			if(TipoVisualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVisual(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipovisual);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);				
			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			
			if(this.tipovisualSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoVisual: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoVisualActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoVisual.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoVisual.getSelectedRows().length;			
			}
			
			tipovisualsSeleccionados=this.getTipoVisualsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoVisual--;			
				//TipoVisual tipovisualAux= new TipoVisual();			
				//tipovisualAux.setId(this.iIdNuevoTipoVisual);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoVisual tipovisualOrigen=new TipoVisual();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoVisual tipovisualOrigen : tipovisualsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipovisualOrigen =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovisualOrigen =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoVisual();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipovisual.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoVisual(tipovisualOrigen,this.tipovisual,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(this.tipovisual);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipovisualLogic.getTipoVisuals().add(this.tipovisualAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipovisuals.add(this.tipovisualAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoVisual(false);
				
				this.jTableDatosTipoVisual.setRowSelectionInterval(this.getIndiceNuevoTipoVisual(), this.getIndiceNuevoTipoVisual());
				
				int iLastRow =  this.jTableDatosTipoVisual.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoVisual.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoVisual.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVisual(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoVisualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();									
		
			TipoVisual tipovisualOrigen=new TipoVisual();
			TipoVisual tipovisualDestino=new TipoVisual();
				
			tipovisualsSeleccionados=this.getTipoVisualsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoVisual.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipovisualsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoVisual.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovisualOrigen =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipovisualOrigen =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovisualDestino =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipovisualDestino =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipovisualOrigen =tipovisualsSeleccionados.get(0);
				tipovisualDestino =tipovisualsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoVisual(tipovisualOrigen,tipovisualDestino,true,false);
				
				tipovisualDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipovisualDestino,tipovisualLogic.getTipoVisuals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovisualDestino,tipovisuals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoVisual(false);
				
				//this.jTableDatosTipoVisual.setRowSelectionInterval(this.getIndiceNuevoTipoVisual(), this.getIndiceNuevoTipoVisual());
				
				int iLastRow =  this.jTableDatosTipoVisual.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoVisual.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoVisual.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVisual(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoVisualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoVisual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoVisual.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoVisualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoVisual.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoVisual.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoVisual.setVisible(!isVisible);
			this.jPanelPaginacionTipoVisual.setVisible(!isVisible);
			this.jPanelAccionesTipoVisual.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoVisualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoVisual();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoVisualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoVisual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoVisualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoVisual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoVisualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoVisual();
			
			this.abrirFrameOrderByTipoVisual();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoVisualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoVisual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoVisual(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoVisual);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoVisual.isMaximum()) {
					this.jInternalFrameDetalleFormTipoVisual.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoVisual.setSize(this.jInternalFrameDetalleFormTipoVisual.iWidthFormulario,this.jInternalFrameDetalleFormTipoVisual.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoVisual.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoVisual.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoVisual.isMaximum()) {
						this.jInternalFrameDetalleFormTipoVisual.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoVisual.jContentPaneDetalleTipoVisual.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoVisual.jTabbedPaneRelacionesTipoVisual.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoVisual.jContentPaneDetalleTipoVisual.getWidth(),TipoVisualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoVisual.jTabbedPaneRelacionesTipoVisual.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoVisual.jContentPaneDetalleTipoVisual.getWidth(),TipoVisualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoVisual.jTabbedPaneRelacionesTipoVisual.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoVisual.jContentPaneDetalleTipoVisual.getWidth(),TipoVisualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoVisual.setVisible(true);
	        this.jInternalFrameDetalleFormTipoVisual.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoVisual() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoVisual==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoVisual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVisual,false,this);
				} else {
					this.jInternalFrameOrderByTipoVisual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVisual,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoVisual);
				this.jInternalFrameOrderByTipoVisual.setVisible(false);
				this.jInternalFrameOrderByTipoVisual.setSelected(false);
				
				this.jInternalFrameOrderByTipoVisual.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoVisual"));
				
				this.inicializarActualizarBindingTablaOrderByTipoVisual();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoVisual() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoVisual==null) {
				
				this.jInternalFrameImportacionTipoVisual=new ImportacionJInternalFrame(TipoVisualConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoVisual);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoVisual);
				this.jInternalFrameImportacionTipoVisual.setVisible(false);
				this.jInternalFrameImportacionTipoVisual.setSelected(false);


				this.jInternalFrameImportacionTipoVisual.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoVisual"));
				this.jInternalFrameImportacionTipoVisual.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoVisual"));
				this.jInternalFrameImportacionTipoVisual.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoVisual"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoVisual() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoVisual==null) {
				this.jInternalFrameReporteDinamicoTipoVisual=new ReporteDinamicoJInternalFrame(TipoVisualConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoVisual);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoVisual);
				this.jInternalFrameReporteDinamicoTipoVisual.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoVisual.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoVisual.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVisual"));
				this.jInternalFrameReporteDinamicoTipoVisual.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVisual"));
				this.jInternalFrameReporteDinamicoTipoVisual.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVisual"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVisual();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoVisual() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoVisual);
			
	       	this.jInternalFrameDetalleFormTipoVisual.setVisible(false);
	        this.jInternalFrameDetalleFormTipoVisual.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoVisual.dispose();
			//this.jInternalFrameDetalleFormTipoVisual=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoVisual() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoVisual.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoVisual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoVisual() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoVisual.setVisible(true);
	        this.jInternalFrameImportacionTipoVisual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoVisual() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoVisual.setVisible(true);
	        this.jInternalFrameOrderByTipoVisual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoVisual() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoVisual.setVisible(false);
	        this.jInternalFrameOrderByTipoVisual.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoVisual() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoVisual.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoVisual.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoVisual() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoVisual.setVisible(false);
	        this.jInternalFrameImportacionTipoVisual.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoVisualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoVisual(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoVisual(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoVisual(true);
			//this.isEsNuevoTipoVisual=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisual =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovisual =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoVisual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVisual(false) ;
			
			if(tipovisualSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoVisualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVisual(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVisual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoVisualActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisual =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovisual =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoVisual(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoVisual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoVisual(true);
			//this.isEsNuevoTipoVisual=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisual =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovisual =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipovisual.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoVisual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoVisual(false) ;
			
			if(TipoVisualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVisual(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVisual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoVisualActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoVisual(false);
			
			//if(!this.isEsNuevoTipoVisual) {								
				int intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisual =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipovisual =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoVisualJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoVisual(this.tipovisual,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(this.tipovisual);
				
			}
			
			if(this.permiteMantenimiento(this.tipovisual)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoVisual=true;
					this.inicializarActualizarBindingTablaTipoVisual(false);
					this.isEsNuevoTipoVisual=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoVisual=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoVisual=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoVisual(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVisual(false);
				
				this.habilitarDeshabilitarControlesTipoVisual(false);
			
												
				
				if(TipoVisualJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoVisual();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoVisualActionPerformed(evt,tipovisualSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoVisual(this.tipovisual,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoVisual.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipovisualSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipovisual.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoVisual.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVisual.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoVisualActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisual =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				this.tipovisual.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovisual =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				this.tipovisual.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipovisual)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoVisualModel) this.jTableDatosTipoVisual.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoVisual=true;
				this.inicializarActualizarBindingTablaTipoVisual(false);
				this.isEsNuevoTipoVisual=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoVisual(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVisual(false);
				
				this.habilitarDeshabilitarControlesTipoVisual(false);
				
				
				
				if(TipoVisualJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoVisual();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoVisualActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoVisual.getRowCount()>=1) {
				jTableDatosTipoVisual.removeRowSelectionInterval(0, jTableDatosTipoVisual.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoVisual(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoVisual(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVisual(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVisual(false) ;
			
			this.isEsNuevoTipoVisual=false;
			
			if(TipoVisualJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoVisual();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoVisualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoVisual(false);
				
				//SI ES MANUAL
				if(TipoVisualJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoVisual();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoVisualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoVisual--;			
			//TipoVisual tipovisualAux= new TipoVisual();			
			//tipovisualAux.setId(this.iIdNuevoTipoVisual);
			
			if(this.jInternalFrameDetalleFormTipoVisual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoVisual();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(this.tipovisual);
			
			this.tipovisual.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipovisualLogic.getTipoVisuals().add(this.tipovisualAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipovisuals.add(this.tipovisualAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoVisual(false);
			
			this.jTableDatosTipoVisual.setRowSelectionInterval(this.getIndiceNuevoTipoVisual(), this.getIndiceNuevoTipoVisual());
			
			int iLastRow =  this.jTableDatosTipoVisual.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoVisual.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoVisual.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoVisual(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoVisualActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoVisual(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVisual(false);
			
			//SI ES MANUAL
			if(TipoVisualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVisual();
			}
			
			//this.abrirFrameTreeTipoVisual();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoVisualActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo VisualS ?", "MANTENIMIENTO DE Tipo Visual", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoVisual.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoVisual();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipovisualReturnGeneral=tipovisualLogic.procesarImportacionTipoVisualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipovisualParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoVisualReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoVisualActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoVisual.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoVisual.setFileImportacion(this.jInternalFrameImportacionTipoVisual.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoVisual.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoVisual.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoVisual.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoVisual.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoVisualActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();		

		tipovisualsSeleccionados=this.getTipoVisualsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVisual.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVisual.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoVisualBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoVisualBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoVisuals("Todos",tipovisualsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Visual",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVisual.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVisual.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoVisualConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoVisualConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoVisual.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoVisual.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoVisual.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoVisualConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoVisualConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoVisual.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoVisualConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoVisualConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoVisual.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVisual.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoVisualConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Código",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoVisualConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoVisualActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();		
		
		tipovisualsSeleccionados=this.getTipoVisualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovisual";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoVisuals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoVisual.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVisual.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoVisualConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoVisualConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoVisual tipovisual:tipovisualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovisual.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoVisualConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoVisualConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoVisual tipovisual:tipovisualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovisual.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoVisual(row);				
			//	iRow++;
			//}				
			
			//for(TipoVisual tipovisualAux:tipovisualsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoVisual(tipovisualAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Visual",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipovisualLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVisual(false);
			
			//SI ES MANUAL
			if(TipoVisualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVisual();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoVisualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVisual(false);
			
			//SI ES MANUAL
			if(TipoVisualJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoVisual();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoVisualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVisual(false);
			
			//SI ES MANUAL
			if(TipoVisualJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoVisual();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoVisual() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoVisual.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoVisual.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoVisual.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoVisual.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoVisual.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoVisual.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoVisual.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoVisual(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoVisual(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoVisual(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoVisual(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoVisual(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoVisual(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVisual(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoVisual(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoVisualJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoVisualJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoVisual() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoVisual();
		
		this.inicializarActualizarBindingBotonesManualTipoVisual(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoVisual();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVisual() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVisual(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVisual(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoVisual.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoVisual.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoVisual.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoVisual!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoVisual.jCheckBoxPostAccionNuevoTipoVisual.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoVisual.jCheckBoxPostAccionSinCerrarTipoVisual.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoVisual.jCheckBoxPostAccionSinMensajeTipoVisual.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoVisual.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoVisual.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoVisual.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoVisual!=null) {
				this.jInternalFrameDetalleFormTipoVisual.jCheckBoxPostAccionNuevoTipoVisual.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoVisual.jCheckBoxPostAccionSinCerrarTipoVisual.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoVisual.jCheckBoxPostAccionSinMensajeTipoVisual.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoVisual.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoVisual.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoVisual!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoVisual.jComboBoxTiposAccionesFormularioTipoVisual.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoVisual.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoVisual!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVisual.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoVisual.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoVisual.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoVisual.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoVisual.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoVisual!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVisual.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoVisual.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoVisual.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoVisual(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoVisualJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVisual(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoVisual() throws Exception {
		try	{
			if(TipoVisualJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoVisual();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoVisual() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoVisual.jComboBoxTiposAccionesFormularioTipoVisual.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoVisual.jComboBoxTiposAccionesFormularioTipoVisual.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoVisual() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoVisual.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoVisual.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoVisual.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoVisual.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoVisual.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoVisual.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoVisual.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoVisual.addItem(reporte);
			}
			
			
			if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoVisual.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoVisual.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoVisual.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoVisual.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoVisual.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoVisual.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoVisual.jComboBoxTiposAccionesFormularioTipoVisual.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoVisual.jComboBoxTiposAccionesFormularioTipoVisual.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoVisual.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoVisual.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoVisual.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVisual();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVisual() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoVisual!=null) {
				this.jInternalFrameReporteDinamicoTipoVisual.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoVisual.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoVisual!=null) {
				this.jInternalFrameReporteDinamicoTipoVisual.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoVisual.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoVisual!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoVisual.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoVisual.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoVisual.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoVisual.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoVisual.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoVisual.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoVisual()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoVisual.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoVisual(Boolean esInicializar) throws Exception {				
		if(TipoVisualJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoVisual();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoVisual() throws Exception {
		this.inicializarActualizarBindingTablaTipoVisual(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoVisual() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoVisualPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoVisualPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoVisualOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVisualOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoVisualPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoVisualPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoVisual(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipovisualLogic.getTipoVisuals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipovisuals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoVisualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoVisual.setModel(new TipoVisualModel(this.tipovisualLogic.getTipoVisuals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoVisual.setModel(new TipoVisualModel(this.tipovisuals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoVisual!=null && this.jInternalFrameOrderByTipoVisual.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoVisual();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoVisual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVisual,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoVisualPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoVisualConstantesFunciones.SCLASSWEBTITULO,tipovisualConstantesFunciones.resaltarSeleccionarTipoVisual,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoVisualConstantesFunciones.SCLASSWEBTITULO,tipovisualConstantesFunciones.resaltarSeleccionarTipoVisual,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoVisual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVisual,TipoVisualConstantesFunciones.LABEL_ID));

		if(this.tipovisualConstantesFunciones.mostraridTipoVisual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVisualConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipovisualConstantesFunciones.resaltaridTipoVisual,this.tipovisualConstantesFunciones.activaridTipoVisual,this,true,"idTipoVisual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovisualConstantesFunciones.resaltaridTipoVisual,this.tipovisualConstantesFunciones.activaridTipoVisual,this,true,"idTipoVisual","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoVisual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVisual,TipoVisualConstantesFunciones.LABEL_CODIGO));

		if(this.tipovisualConstantesFunciones.mostrarcodigoTipoVisual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVisualConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipovisualConstantesFunciones.resaltarcodigoTipoVisual,this.tipovisualConstantesFunciones.activarcodigoTipoVisual,this,true,"codigoTipoVisual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovisualConstantesFunciones.resaltarcodigoTipoVisual,this.tipovisualConstantesFunciones.activarcodigoTipoVisual,this,true,"codigoTipoVisual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoVisualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoVisual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVisual,TipoVisualConstantesFunciones.LABEL_NOMBRE));

		if(this.tipovisualConstantesFunciones.mostrarnombreTipoVisual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVisualConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipovisualConstantesFunciones.resaltarnombreTipoVisual,this.tipovisualConstantesFunciones.activarnombreTipoVisual,this,true,"nombreTipoVisual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovisualConstantesFunciones.resaltarnombreTipoVisual,this.tipovisualConstantesFunciones.activarnombreTipoVisual,this,true,"nombreTipoVisual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoVisualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipovisualSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipovisualSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipovisualSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoVisual.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipovisualSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipovisualSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoVisual.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoVisual && this.isPermisoGuardarCambiosTipoVisual) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipovisualSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipovisualSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoVisual.addColumn(tableColumn);
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
			
			this.jTableDatosTipoVisual.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoVisual && this.isPermisoGuardarCambiosTipoVisual) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoVisual && this.isPermisoGuardarCambiosTipoVisual) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoVisual.moveColumn(this.jTableDatosTipoVisual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoVisual.moveColumn(this.jTableDatosTipoVisual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoVisual.moveColumn(this.jTableDatosTipoVisual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoVisual.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoVisual.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoVisual,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoVisualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoVisual.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoVisual.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoVisualJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoVisualJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoVisual.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoVisual.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoVisual.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipovisualLogic.getTipoVisuals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipovisuals.size()-1;
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
		//this.jTableDatosTipoVisual.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoVisual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoVisual();
			
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
				
				//this.isEsNuevoTipoVisual=false;
					
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			
				if(this.tipovisualSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoVisual==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoVisual.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoVisual.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisual =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovisual =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipovisual.getsType().equals("DUPLICADO")
				   || this.tipovisual.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoVisual=true;
				
				} else {
					this.isEsNuevoTipoVisual=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipovisualSessionBean.getEsGuardarRelacionado()) {
					if(this.tipovisual.getId()>=0 && !this.tipovisual.getIsNew()) {						
						this.isEsNuevoTipoVisual=false;
						
					} else {
						this.isEsNuevoTipoVisual=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoVisual(esRelaciones);						
				
				this.seleccionarTipoVisual(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipovisual.getId()<0) {
					this.isEsNuevoTipoVisual=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoVisual(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoVisual(evt,rowIndex);
				}	
				
				if(this.tipovisualSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoVisual: " + this.dDif); 
					}
				}								
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoVisual(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipovisual)) {
					if(this.tipovisual.getId()>0) {
						this.tipovisual.setIsDeleted(true);
						
						this.tipovisualsEliminados.add(this.tipovisual);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipovisualLogic.getTipoVisuals().remove(this.tipovisual);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipovisuals.remove(this.tipovisual);				
					}
					
					
					((TipoVisualModel) this.jTableDatosTipoVisual.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVisual(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoVisual(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoVisual) {
			
			if(this.jInternalFrameDetalleFormTipoVisual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoVisual.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoVisual.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisual =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovisual =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoVisualJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoVisual(this.tipovisual);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoVisual("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoVisual(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVisual() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoVisual(TipoVisual tipovisual) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoVisual(tipovisual,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoVisual(TipoVisual tipovisual,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoVisual(tipovisual);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoVisual(tipovisual,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoVisual(tipovisual);
	}
	
	public void setVariablesObjetoActualToFormularioTipoVisual(TipoVisual tipovisual) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoVisual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoVisual.jTextFieldidTipoVisual.setText(tipovisual.getId().toString());
			this.jInternalFrameDetalleFormTipoVisual.jTextFieldcodigoTipoVisual.setText(tipovisual.getcodigo());
			this.jInternalFrameDetalleFormTipoVisual.jTextAreanombreTipoVisual.setText(tipovisual.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoVisual tipovisualLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipovisualLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoVisual tipovisualLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipovisualLocal=this.tipovisual;
			} else {
				tipovisualLocal=this.tipovisualAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipovisualLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoVisual(tipovisualLocal,true);
					
					if(tipovisualSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipovisualLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipovisualSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipovisualLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoVisual(TipoVisual tipovisual,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoVisual(tipovisual,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(tipovisual);
	}
	
	public void setVariablesFormularioToObjetoActualTipoVisual(TipoVisual tipovisual,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoVisual(tipovisual,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoVisual(TipoVisual tipovisual,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoVisual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoVisual.jTextFieldidTipoVisual.getText()==null || this.jInternalFrameDetalleFormTipoVisual.jTextFieldidTipoVisual.getText()=="" || this.jInternalFrameDetalleFormTipoVisual.jTextFieldidTipoVisual.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoVisual.jTextFieldidTipoVisual.setText("0");
			}

			if(conColumnasBase) {tipovisual.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoVisual.jTextFieldidTipoVisual.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoVisualConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVisual.jLabelIdTipoVisual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipovisual.setcodigo(this.jInternalFrameDetalleFormTipoVisual.jTextFieldcodigoTipoVisual.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoVisualConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVisual.jLabelcodigoTipoVisual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipovisual.setnombre(this.jInternalFrameDetalleFormTipoVisual.jTextAreanombreTipoVisual.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoVisualConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVisual.jLabelnombreTipoVisual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoVisual(TipoVisual tipovisualBean,TipoVisual tipovisual,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoVisual(TipoVisual tipovisualOrigen,TipoVisual tipovisual,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipovisualOrigen.getId()!=null && !tipovisualOrigen.getId().equals(0L))) {tipovisual.setId(tipovisualOrigen.getId());}}
			if(conDefault || (!conDefault && tipovisualOrigen.getcodigo()!=null && !tipovisualOrigen.getcodigo().equals(""))) {tipovisual.setcodigo(tipovisualOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipovisualOrigen.getnombre()!=null && !tipovisualOrigen.getnombre().equals(""))) {tipovisual.setnombre(tipovisualOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoVisual(TipoVisual tipovisual) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoVisual.jTextFieldidTipoVisual.setText(tipovisual.getId().toString());
			this.jInternalFrameDetalleFormTipoVisual.jTextFieldcodigoTipoVisual.setText(tipovisual.getcodigo());
			this.jInternalFrameDetalleFormTipoVisual.jTextAreanombreTipoVisual.setText(tipovisual.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoVisual(TipoVisualBean tipovisualBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoVisual.jTextFieldidTipoVisual.setText(tipovisualBean.getId().toString());
			this.jInternalFrameDetalleFormTipoVisual.jTextFieldcodigoTipoVisual.setText(tipovisualBean.getcodigo());
			this.jInternalFrameDetalleFormTipoVisual.jTextAreanombreTipoVisual.setText(tipovisualBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoVisual(TipoVisualParameterReturnGeneral tipovisualReturnGeneral,TipoVisualBean tipovisualBean,Boolean conDefault) throws Exception { 
		try {
			TipoVisual tipovisualLocal=new TipoVisual();
			
			tipovisualLocal=tipovisualReturnGeneral.getTipoVisual();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipovisualLocal.getId()!=null && !tipovisualLocal.getId().equals(0L))) {tipovisualBean.setId(tipovisualLocal.getId());}}
			if(conDefault || (!conDefault && tipovisualLocal.getcodigo()!=null && !tipovisualLocal.getcodigo().equals(""))) {tipovisualBean.setcodigo(tipovisualLocal.getcodigo());}
			if(conDefault || (!conDefault && tipovisualLocal.getnombre()!=null && !tipovisualLocal.getnombre().equals(""))) {tipovisualBean.setnombre(tipovisualLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoVisualGenerico(Long idTipoVisualSeleccionado,JComboBox jComboBoxTipoVisual,List<TipoVisual> tipovisualsLocal)throws Exception {
		try {
			TipoVisual  tipovisualTemp=null;

			for(TipoVisual tipovisualAux:tipovisualsLocal) {
				if(tipovisualAux.getId()!=null && tipovisualAux.getId().equals(idTipoVisualSeleccionado)) {
					tipovisualTemp=tipovisualAux;
					break;
				}
			}

			jComboBoxTipoVisual.setSelectedItem(tipovisualTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoVisualGenerico(JComboBox jComboBoxTipoVisual,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoVisual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoVisual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoVisual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoVisual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoVisual.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoVisual.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoVisual.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoVisual.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoVisual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoVisual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovisual=(TipoVisual) tipovisualLogic.getTipoVisuals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipovisual =(TipoVisual) tipovisuals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoVisual tipovisualRow=new TipoVisual();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovisualRow=(TipoVisual) tipovisualLogic.getTipoVisuals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipovisualRow=(TipoVisual) tipovisuals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoVisual(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoVisual.setVisible((this.isVisibilidadCeldaNuevoTipoVisual && this.isPermisoNuevoTipoVisual));			
			this.jButtonDuplicarTipoVisual.setVisible((this.isVisibilidadCeldaDuplicarTipoVisual && this.isPermisoDuplicarTipoVisual));			
			this.jButtonCopiarTipoVisual.setVisible((this.isVisibilidadCeldaCopiarTipoVisual && this.isPermisoCopiarTipoVisual));
			this.jButtonVerFormTipoVisual.setVisible((this.isVisibilidadCeldaVerFormTipoVisual && this.isPermisoVerFormTipoVisual));
			
			this.jButtonAbrirOrderByTipoVisual.setVisible((this.isVisibilidadCeldaOrdenTipoVisual && this.isPermisoOrdenTipoVisual));			
			
			this.jButtonNuevoRelacionesTipoVisual.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVisual && this.isPermisoNuevoTipoVisual));			
			this.jButtonNuevoGuardarCambiosTipoVisual.setVisible((this.isVisibilidadCeldaNuevoTipoVisual && this.isPermisoNuevoTipoVisual && this.isPermisoGuardarCambiosTipoVisual));
			
			if(this.jInternalFrameDetalleFormTipoVisual!=null) {
			this.jInternalFrameDetalleFormTipoVisual.jButtonModificarTipoVisual.setVisible((this.isVisibilidadCeldaModificarTipoVisual && this.isPermisoActualizarTipoVisual));	
			this.jInternalFrameDetalleFormTipoVisual.jButtonActualizarTipoVisual.setVisible((this.isVisibilidadCeldaActualizarTipoVisual && this.isPermisoActualizarTipoVisual));	
			this.jInternalFrameDetalleFormTipoVisual.jButtonEliminarTipoVisual.setVisible((this.isVisibilidadCeldaEliminarTipoVisual && this.isPermisoEliminarTipoVisual));
			this.jInternalFrameDetalleFormTipoVisual.jButtonCancelarTipoVisual.setVisible(this.isVisibilidadCeldaCancelarTipoVisual);							
			this.jInternalFrameDetalleFormTipoVisual.jButtonGuardarCambiosTipoVisual.setVisible((this.isVisibilidadCeldaGuardarTipoVisual && this.isPermisoGuardarCambiosTipoVisual));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoVisual.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVisual && this.isPermisoGuardarCambiosTipoVisual));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoVisual.setVisible((this.isVisibilidadCeldaNuevoTipoVisual && this.isPermisoNuevoTipoVisual));						
			this.jButtonDuplicarToolBarTipoVisual.setVisible((this.isVisibilidadCeldaDuplicarTipoVisual && this.isPermisoDuplicarTipoVisual));						
			this.jButtonCopiarToolBarTipoVisual.setVisible((this.isVisibilidadCeldaCopiarTipoVisual && this.isPermisoCopiarTipoVisual));			
			this.jButtonVerFormToolBarTipoVisual.setVisible((this.isVisibilidadCeldaVerFormTipoVisual && this.isPermisoVerFormTipoVisual));			
			this.jButtonAbrirOrderByToolBarTipoVisual.setVisible((this.isVisibilidadCeldaOrdenTipoVisual && this.isPermisoOrdenTipoVisual));
			this.jButtonNuevoRelacionesToolBarTipoVisual.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVisual && this.isPermisoNuevoTipoVisual));			
			this.jButtonNuevoGuardarCambiosToolBarTipoVisual.setVisible((this.isVisibilidadCeldaNuevoTipoVisual && this.isPermisoNuevoTipoVisual && this.isPermisoGuardarCambiosTipoVisual));			
			
			if(this.jInternalFrameDetalleFormTipoVisual!=null) {
			this.jInternalFrameDetalleFormTipoVisual.jButtonModificarToolBarTipoVisual.setVisible((this.isVisibilidadCeldaModificarTipoVisual && this.isPermisoActualizarTipoVisual));	
			this.jInternalFrameDetalleFormTipoVisual.jButtonActualizarToolBarTipoVisual.setVisible((this.isVisibilidadCeldaActualizarTipoVisual  && this.isPermisoActualizarTipoVisual));	
			this.jInternalFrameDetalleFormTipoVisual.jButtonEliminarToolBarTipoVisual.setVisible((this.isVisibilidadCeldaEliminarTipoVisual && this.isPermisoEliminarTipoVisual));
			this.jInternalFrameDetalleFormTipoVisual.jButtonCancelarToolBarTipoVisual.setVisible(this.isVisibilidadCeldaCancelarTipoVisual);				
			this.jInternalFrameDetalleFormTipoVisual.jButtonGuardarCambiosToolBarTipoVisual.setVisible((this.isVisibilidadCeldaGuardarTipoVisual && this.isPermisoGuardarCambiosTipoVisual));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoVisual.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVisual && this.isPermisoGuardarCambiosTipoVisual));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoVisual.setVisible((this.isVisibilidadCeldaNuevoTipoVisual && this.isPermisoNuevoTipoVisual));			
			this.jMenuItemDuplicarTipoVisual.setVisible((this.isVisibilidadCeldaDuplicarTipoVisual && this.isPermisoDuplicarTipoVisual));			
			this.jMenuItemCopiarTipoVisual.setVisible((this.isVisibilidadCeldaCopiarTipoVisual && this.isPermisoCopiarTipoVisual));			
			this.jMenuItemVerFormTipoVisual.setVisible((this.isVisibilidadCeldaVerFormTipoVisual && this.isPermisoVerFormTipoVisual));			
			this.jMenuItemAbrirOrderByTipoVisual.setVisible((this.isVisibilidadCeldaOrdenTipoVisual && this.isPermisoOrdenTipoVisual));			
			//this.jMenuItemMostrarOcultarTipoVisual.setVisible((this.isVisibilidadCeldaOrdenTipoVisual && this.isPermisoOrdenTipoVisual));
			this.jMenuItemDetalleAbrirOrderByTipoVisual.setVisible((this.isVisibilidadCeldaOrdenTipoVisual && this.isPermisoOrdenTipoVisual));			
			//this.jMenuItemDetalleMostrarOcultarTipoVisual.setVisible((this.isVisibilidadCeldaOrdenTipoVisual && this.isPermisoOrdenTipoVisual));			
			this.jMenuItemNuevoRelacionesTipoVisual.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVisual && this.isPermisoNuevoTipoVisual));			
			this.jMenuItemNuevoGuardarCambiosTipoVisual.setVisible((this.isVisibilidadCeldaNuevoTipoVisual && this.isPermisoNuevoTipoVisual && this.isPermisoGuardarCambiosTipoVisual));									
			
			if(this.jInternalFrameDetalleFormTipoVisual!=null) {
			this.jInternalFrameDetalleFormTipoVisual.jMenuItemModificarTipoVisual.setVisible((this.isVisibilidadCeldaModificarTipoVisual && this.isPermisoActualizarTipoVisual));	
			this.jInternalFrameDetalleFormTipoVisual.jMenuItemActualizarTipoVisual.setVisible((this.isVisibilidadCeldaActualizarTipoVisual && this.isPermisoActualizarTipoVisual));	
			this.jInternalFrameDetalleFormTipoVisual.jMenuItemEliminarTipoVisual.setVisible((this.isVisibilidadCeldaEliminarTipoVisual && this.isPermisoEliminarTipoVisual));
			this.jInternalFrameDetalleFormTipoVisual.jMenuItemCancelarTipoVisual.setVisible(this.isVisibilidadCeldaCancelarTipoVisual);				
			}
			
			this.jMenuItemGuardarCambiosTipoVisual.setVisible((this.isVisibilidadCeldaGuardarTipoVisual && this.isPermisoGuardarCambiosTipoVisual));						
			this.jMenuItemGuardarCambiosTablaTipoVisual.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVisual && this.isPermisoGuardarCambiosTipoVisual));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoVisual=this.jButtonNuevoTipoVisual.isVisible();
			this.isVisibilidadCeldaDuplicarTipoVisual=this.jButtonDuplicarTipoVisual.isVisible();
			this.isVisibilidadCeldaCopiarTipoVisual=this.jButtonCopiarTipoVisual.isVisible();
			this.isVisibilidadCeldaVerFormTipoVisual=this.jButtonVerFormTipoVisual.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoVisual=this.jButtonAbrirOrderByTipoVisual.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoVisual=this.jButtonNuevoRelacionesTipoVisual.isVisible();
			this.isVisibilidadCeldaModificarTipoVisual=this.jButtonModificarTipoVisual.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVisual!=null) {
			this.isVisibilidadCeldaActualizarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jButtonActualizarTipoVisual.isVisible();
			this.isVisibilidadCeldaEliminarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jButtonEliminarTipoVisual.isVisible();
			this.isVisibilidadCeldaCancelarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jButtonCancelarTipoVisual.isVisible();
			this.isVisibilidadCeldaGuardarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jButtonGuardarCambiosTipoVisual.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoVisual=this.jButtonGuardarCambiosTablaTipoVisual.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoVisual=this.jButtonNuevoToolBarTipoVisual.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoVisual=this.jButtonNuevoRelacionesToolBarTipoVisual.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVisual!=null) {
			this.isVisibilidadCeldaModificarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jButtonModificarToolBarTipoVisual.isVisible();
			this.isVisibilidadCeldaActualizarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jButtonActualizarToolBarTipoVisual.isVisible();
			this.isVisibilidadCeldaEliminarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jButtonEliminarToolBarTipoVisual.isVisible();
			this.isVisibilidadCeldaCancelarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jButtonCancelarToolBarTipoVisual.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoVisual=this.jButtonGuardarCambiosToolBarTipoVisual.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoVisual=this.jButtonGuardarCambiosTablaToolBarTipoVisual.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoVisual=this.jMenuItemNuevoTipoVisual.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoVisual=this.jMenuItemNuevoRelacionesTipoVisual.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVisual!=null) {
			this.isVisibilidadCeldaModificarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jMenuItemModificarTipoVisual.isVisible();
			this.isVisibilidadCeldaActualizarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jMenuItemActualizarTipoVisual.isVisible();
			this.isVisibilidadCeldaEliminarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jMenuItemEliminarTipoVisual.isVisible();
			this.isVisibilidadCeldaCancelarTipoVisual=this.jInternalFrameDetalleFormTipoVisual.jMenuItemCancelarTipoVisual.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoVisual=this.jMenuItemGuardarCambiosTipoVisual.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoVisual=this.jMenuItemGuardarCambiosTablaTipoVisual.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoVisual(Boolean esInicializar) {
		if(TipoVisualJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipovisualSessionBean.getConGuardarRelaciones()) {
				//if(this.tipovisualSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoVisual();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoVisual(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoVisual() {
		this.jButtonNuevoTipoVisual.setVisible(this.isPermisoNuevoTipoVisual);			
		this.jButtonDuplicarTipoVisual.setVisible(this.isPermisoDuplicarTipoVisual);			
		this.jButtonCopiarTipoVisual.setVisible(this.isPermisoCopiarTipoVisual);			
		this.jButtonVerFormTipoVisual.setVisible(this.isPermisoVerFormTipoVisual);			
		
		this.jButtonAbrirOrderByTipoVisual.setVisible(this.isPermisoOrdenTipoVisual);					
		
		this.jButtonNuevoRelacionesTipoVisual.setVisible(this.isPermisoNuevoTipoVisual);			
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.jButtonModificarTipoVisual.setVisible(this.isPermisoActualizarTipoVisual);	
			this.jInternalFrameDetalleFormTipoVisual.jButtonActualizarTipoVisual.setVisible(this.isPermisoActualizarTipoVisual);	
			this.jInternalFrameDetalleFormTipoVisual.jButtonEliminarTipoVisual.setVisible(this.isPermisoEliminarTipoVisual);
			this.jInternalFrameDetalleFormTipoVisual.jButtonCancelarTipoVisual.setVisible(this.isVisibilidadCeldaCancelarTipoVisual);						
			this.jInternalFrameDetalleFormTipoVisual.jButtonGuardarCambiosTipoVisual.setVisible(this.isPermisoGuardarCambiosTipoVisual);							
		}
		
		this.jButtonGuardarCambiosTablaTipoVisual.setVisible(this.isPermisoActualizarTipoVisual);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoVisual() {
		this.jInternalFrameDetalleFormTipoVisual.jButtonModificarTipoVisual.setVisible(this.isPermisoActualizarTipoVisual);	
		this.jInternalFrameDetalleFormTipoVisual.jButtonActualizarTipoVisual.setVisible(this.isPermisoActualizarTipoVisual);	
		this.jInternalFrameDetalleFormTipoVisual.jButtonEliminarTipoVisual.setVisible(this.isPermisoEliminarTipoVisual);
		this.jInternalFrameDetalleFormTipoVisual.jButtonCancelarTipoVisual.setVisible(this.isVisibilidadCeldaCancelarTipoVisual);							
		this.jInternalFrameDetalleFormTipoVisual.jButtonGuardarCambiosTipoVisual.setVisible((this.isVisibilidadCeldaGuardarTipoVisual && this.isPermisoGuardarCambiosTipoVisual));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoVisual() {
		if(TipoVisualJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoVisual();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoVisual() {
	}
	
	public void jTableDatosTipoVisualListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoVisual(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoVisualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVisual(this.gettipovisual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(this.tipovisual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovisual =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovisual =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovisual==null) {
						this.tipovisual = new TipoVisual();
					}

					this.setVariablesFormularioToObjetoActualTipoVisual(this.tipovisual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(this.tipovisual);
				}

				if(this.tipovisual.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipovisual.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVisual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoVisualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVisual(this.gettipovisual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(this.tipovisual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovisual =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovisual =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovisual==null) {
						this.tipovisual = new TipoVisual();
					}

					this.setVariablesFormularioToObjetoActualTipoVisual(this.tipovisual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(this.tipovisual);
				}

				if(this.tipovisual.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipovisual.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVisual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoVisualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVisual(this.gettipovisual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(this.tipovisual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovisual =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovisual =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovisual==null) {
						this.tipovisual = new TipoVisual();
					}

					this.setVariablesFormularioToObjetoActualTipoVisual(this.tipovisual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(this.tipovisual);
				}

				if(this.tipovisual.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipovisual.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVisual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoVisualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoVisual(false,false);

			this.getTipoVisualsBusquedaPorNombre();

			this.inicializarActualizarBindingTipoVisual(false);

			//if(TipoVisualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoVisual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovisualLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoVisual() {
		if(this.jInternalFrameDetalleFormTipoVisual!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) {
			this.jInternalFrameDetalleFormTipoVisual.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoVisual.dispose();
			this.jInternalFrameDetalleFormTipoVisual=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoVisual!=null) {
			this.jInternalFrameReporteDinamicoTipoVisual.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoVisual.dispose();
			this.jInternalFrameReporteDinamicoTipoVisual=null;
		}
		
		if(this.jInternalFrameImportacionTipoVisual!=null) {
			this.jInternalFrameImportacionTipoVisual.setVisible(false);	    			
			this.jInternalFrameImportacionTipoVisual.dispose();
			this.jInternalFrameImportacionTipoVisual=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoVisual();
			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoVisual")) {
				jButtonNuevoTipoVisualActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoVisual")) {
				jButtonDuplicarTipoVisualActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoVisual")) {
				jButtonCopiarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoVisual")) {
				jButtonVerFormTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoVisual")) {
				jButtonNuevoTipoVisualActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoVisual")) {
				jButtonDuplicarTipoVisualActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoVisual")) {
				jButtonNuevoTipoVisualActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoVisual")) {
				jButtonDuplicarTipoVisualActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoVisual")) {
				jButtonNuevoTipoVisualActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoVisual")) {
				jButtonNuevoTipoVisualActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoVisual")) {
				jButtonNuevoTipoVisualActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoVisual")) {
				jButtonModificarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoVisual")) {
				jButtonModificarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoVisual")) {
				jButtonModificarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoVisual")) {
				jButtonActualizarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoVisual")) {
				jButtonActualizarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoVisual")) {
				jButtonActualizarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoVisual")) {
				jButtonEliminarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoVisual")) {
				jButtonEliminarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoVisual")) {
				jButtonEliminarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoVisual")) {
				jButtonCancelarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoVisual")) {
				jButtonCancelarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoVisual")) {
				jButtonCancelarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoVisual")) {
				jButtonCerrarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoVisual")) {
				jButtonCerrarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoVisual")) {
				jButtonCerrarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoVisual")) {
				jButtonMostrarOcultarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoVisual")) {
				jButtonCancelarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoVisual")) {
				jButtonGuardarCambiosTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoVisual")) {
				jButtonGuardarCambiosTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoVisual")) {
				jButtonCopiarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoVisual")) {
				jButtonVerFormTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoVisual")) {
				jButtonGuardarCambiosTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoVisual")) {
				jButtonCopiarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoVisual")) {
				jButtonVerFormTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoVisual")) {
				jButtonGuardarCambiosTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoVisual")) {
				jButtonGuardarCambiosTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoVisual")) {
				jButtonGuardarCambiosTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoVisual")) {
				jButtonRecargarInformacionTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoVisual")) {
				jButtonRecargarInformacionTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoVisual")) {
				jButtonRecargarInformacionTipoVisualActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoVisual")) {
				jButtonAnterioresTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoVisual")) {
				jButtonAnterioresTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoVisual")) {
				jButtonAnterioresTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoVisual")) {
				jButtonSiguientesTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoVisual")) {
				jButtonSiguientesTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoVisual")) {
				jButtonSiguientesTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoVisual") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoVisual")) {
				jButtonAbrirOrderByTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoVisual") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoVisual")) {
				jButtonMostrarOcultarTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoVisual")) {
				jButtonNuevoGuardarCambiosTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoVisual")) {
				jButtonNuevoGuardarCambiosTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoVisual")) {
				jButtonNuevoGuardarCambiosTipoVisualActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoVisual")) {
				jButtonCerrarReporteDinamicoTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoVisual")) {
				jButtonGenerarReporteDinamicoTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoVisual")) {
				
				jButtonGenerarExcelReporteDinamicoTipoVisualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoVisual")) {
				jButtonCerrarImportacionTipoVisualActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoVisual")) {
				
				jButtonGenerarImportacionTipoVisualActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoVisual")) {
				
				jButtonAbrirImportacionTipoVisualActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoVisual")) {
				jComboBoxTiposAccionesTipoVisualActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoVisual")) {
				jComboBoxTiposRelacionesTipoVisualActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoVisual")) {
				jComboBoxTiposAccionesTipoVisualActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoVisual")) {
				
				jComboBoxTiposSeleccionarTipoVisualActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoVisual")) {
				jTextFieldValorCampoGeneralTipoVisualActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoVisual")) {
				jButtonAbrirOrderByTipoVisualActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoVisual")) {
				jButtonAbrirOrderByTipoVisualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoVisual")) {
				jButtonCerrarOrderByTipoVisualActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoVisualBusqueda")) {
				this.jButtonidTipoVisualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoVisualBusqueda")) {
				this.jButtoncodigoTipoVisualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoVisualBusqueda")) {
				this.jButtonnombreTipoVisualBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoVisual")) {
				this.jButtonBusquedaPorNombreTipoVisualActionPerformed(evt);
			}
			
			;
			
			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoVisual();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVisualActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				


				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVisual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVisual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoVisual tipovisualLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipovisualLocal=this.tipovisual;
			} else {
				tipovisualLocal=this.tipovisualAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
							
				
				


				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVisual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVisual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVisualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualAnterior =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovisualAnterior =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
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
			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			
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
			
			


			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVisualActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
								
						
				


				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVisual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVisual.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
								
				
				


				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVisual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVisual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVisualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualAnterior =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovisualAnterior =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVisualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualAnterior =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovisualAnterior =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVisualActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
							
				
				


				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVisual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVisual.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVisualActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovisualAnterior =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipovisualAnterior =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
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
			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			
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
			
			


			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVisualActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
								
				
				


				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVisual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVisual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVisualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualAnterior =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovisualAnterior =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVisualActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVisualActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoVisual")) {
					jCheckBoxSeleccionarTodosTipoVisualItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoVisual")) {
					jCheckBoxSeleccionadosTipoVisualItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoVisual")) {
					
				}
				
				


				
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVisual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVisual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
												
				
				


				
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVisual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVisual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVisualActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovisualAnterior =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipovisualAnterior =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVisualActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
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
			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
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
			
			


			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVisualActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVisual.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVisual.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovisual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovisual);
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
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
				
				


				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVisual.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVisual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVisualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovisualAnterior =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovisualAnterior =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoVisual")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoVisualListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoVisual.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipovisual =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipovisual =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipovisual);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoVisual")) {
				
				}
				
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoVisual")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoVisual.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoVisual")) {
			
			}
			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoVisual();
			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			
			if(sTipo.equals("NuevoTipoVisual")) {
				jButtonNuevoTipoVisualActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoVisual")) {
				jButtonDuplicarTipoVisualActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoVisual")) {
				jButtonCopiarTipoVisualActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoVisual")) {
				jButtonVerFormTipoVisualActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoVisual")) {
				jButtonNuevoTipoVisualActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoVisual")) {
				jButtonModificarTipoVisualActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoVisual")) {
				jButtonActualizarTipoVisualActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoVisual")) {
				jButtonEliminarTipoVisualActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoVisual")) {
				jButtonGuardarCambiosTipoVisualActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoVisual")) {
				jButtonCancelarTipoVisualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoVisual")) {
				jButtonCerrarTipoVisualActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoVisual")) {
				jButtonGuardarCambiosTipoVisualActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoVisual")) {
				jButtonNuevoGuardarCambiosTipoVisualActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoVisual")) {
				jButtonAbrirOrderByTipoVisualActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoVisual")) {
				jButtonRecargarInformacionTipoVisualActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoVisual")) {
				jButtonAnterioresTipoVisualActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoVisual")) {
				jButtonSiguientesTipoVisualActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoVisualBusqueda")) {
				this.jButtonidTipoVisualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoVisualBusqueda")) {
				this.jButtoncodigoTipoVisualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoVisualBusqueda")) {
				this.jButtonnombreTipoVisualBusquedaActionPerformed(evt);
			}
			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoVisual();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoVisual")) {
				closingInternalFrameTipoVisual();
				
			} else if(sTipo.equals("jButtonCancelarTipoVisual")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoVisual = (JInternalFrameBase)evt.getSource();
	            	
	            TipoVisualBeanSwingJInternalFrame jInternalFrameParent=(TipoVisualBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoVisual.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoVisualActionPerformed(null);
			}
			
			TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipovisual,new Object(),this.tipovisualParameterGeneral,this.tipovisualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoVisual(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoVisual(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoVisual(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipovisual)) {
			if(!esControlTabla) {
				if(TipoVisualJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoVisual(this.tipovisual,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(this.tipovisual);			
				}
				
				if(this.tipovisualSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoVisual(this.tipovisual,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipovisualReturnGeneral=tipovisualLogic.procesarEventosTipoVisualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovisualLogic.getTipoVisuals(),this.tipovisual,this.tipovisualParameterGeneral,this.isEsNuevoTipoVisual,classes);//this.tipovisualLogic.getTipoVisual()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoVisual(this.tipovisualReturnGeneral,this.tipovisualBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipovisualSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoVisual(classes,this.tipovisualReturnGeneral,this.tipovisualBean,false);
					}
						
					if(this.tipovisualReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoVisual(this.tipovisualReturnGeneral.getTipoVisual());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoVisual(this.tipovisualReturnGeneral.getTipoVisual());	
					}
						
					if(this.tipovisualReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoVisual(this.tipovisualReturnGeneral.getTipoVisual(),classes);//this.tipovisualBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoVisual(this.tipovisual,classes);//this.tipovisualBean);									
				}
			
				if(TipoVisualJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoVisual(this.tipovisual,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVisual(this.tipovisual);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipovisualAnterior!=null) {
						this.tipovisual=this.tipovisualAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipovisualReturnGeneral=tipovisualLogic.procesarEventosTipoVisualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovisualLogic.getTipoVisuals(),this.tipovisual,this.tipovisualParameterGeneral,this.isEsNuevoTipoVisual,classes);//this.tipovisualLogic.getTipoVisual()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipovisualSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipovisualSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipovisualReturnGeneral.getTipoVisual(),tipovisualLogic.getTipoVisuals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipovisualReturnGeneral.getTipoVisual(),this.tipovisuals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoVisual.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoVisual.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoVisual();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoVisual() throws Exception {
		
		TipoVisualModel tipovisualModel=(TipoVisualModel)this.jTableDatosTipoVisual.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovisualModel.tipovisuals=this.tipovisualLogic.getTipoVisuals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipovisualModel.tipovisuals=this.tipovisuals;
		}
		
		
		((TipoVisualModel) this.jTableDatosTipoVisual.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoVisual() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipovisualAnterior(),this.tipovisualLogic.getTipoVisuals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipovisualAnterior(),this.tipovisuals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoVisual();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoVisual(TipoVisual tipovisual,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
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
										
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovisual,new Object(),generalEntityParameterGeneral,this.tipovisualReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipovisualSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoVisualConstantesFunciones.getClassesRelationshipsOfTipoVisual(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoVisualConstantesFunciones.getClassesRelationshipsFromStringsOfTipoVisual(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoVisual(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoVisualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovisual,new Object(),generalEntityParameterGeneral,this.tipovisualReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoVisual(TipoVisualBean tipovisualBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoVisual(ArrayList<Classe> classes,TipoVisualReturnGeneral tipovisualReturnGeneral,TipoVisualBean tipovisualBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoVisual(TipoVisual tipovisual,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipovisual)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoVisual = new TipoVisualDetalleFormJInternalFrame(jDesktopPane,this.tipovisualSessionBean.getConGuardarRelaciones(),this.tipovisualSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoVisual);
		this.jInternalFrameDetalleFormTipoVisual.setVisible(false);
		this.jInternalFrameDetalleFormTipoVisual.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoVisual.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoVisual.tipovisualLogic=this.tipovisualLogic;
		
		this.cargarCombosFrameForeignKeyTipoVisual("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoVisual();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoVisual();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoVisual("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoVisual();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoVisual.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoVisual"));
		
		this.jInternalFrameDetalleFormTipoVisual.jButtonModificarTipoVisual.addActionListener(new ButtonActionListener(this,"ModificarTipoVisual"));

		
		this.jInternalFrameDetalleFormTipoVisual.jButtonModificarToolBarTipoVisual.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoVisual"));
					
		this.jInternalFrameDetalleFormTipoVisual.jMenuItemModificarTipoVisual.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoVisual"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVisual.jButtonActualizarTipoVisual.addActionListener (new ButtonActionListener(this,"ActualizarTipoVisual"));
		
		
		this.jInternalFrameDetalleFormTipoVisual.jButtonActualizarToolBarTipoVisual.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoVisual"));
						
		this.jInternalFrameDetalleFormTipoVisual.jMenuItemActualizarTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoVisual"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVisual.jButtonEliminarTipoVisual.addActionListener (new ButtonActionListener(this,"EliminarTipoVisual"));
		
		
		this.jInternalFrameDetalleFormTipoVisual.jButtonEliminarToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoVisual"));
								
		this.jInternalFrameDetalleFormTipoVisual.jMenuItemEliminarTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoVisual"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVisual.jButtonCancelarTipoVisual.addActionListener (new ButtonActionListener(this,"CancelarTipoVisual"));
		
		
		this.jInternalFrameDetalleFormTipoVisual.jButtonCancelarToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoVisual"));
					
		this.jInternalFrameDetalleFormTipoVisual.jMenuItemCancelarTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoVisual"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoVisual.jMenuItemDetalleCerrarTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoVisual"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVisual.jButtonGuardarCambiosToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVisual"));
		
		
		
		this.jInternalFrameDetalleFormTipoVisual.jButtonGuardarCambiosToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVisual"));
		
		
		
		this.jInternalFrameDetalleFormTipoVisual.jComboBoxTiposAccionesFormularioTipoVisual.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoVisual"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVisual.jButtonidTipoVisualBusqueda.addActionListener(new ButtonActionListener(this,"idTipoVisualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVisual.jButtoncodigoTipoVisualBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoVisualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVisual.jButtonnombreTipoVisualBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoVisualBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoVisual.jTabbedPaneRelacionesTipoVisual.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoVisual"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoVisual"));
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoVisual"));
		}
		
		this.jTableDatosTipoVisual.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoVisual"));
		
		this.jTableDatosTipoVisual.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoVisual"));
		
		this.jButtonNuevoTipoVisual.addActionListener(new ButtonActionListener(this,"NuevoTipoVisual"));
		
		this.jButtonDuplicarTipoVisual.addActionListener(new ButtonActionListener(this,"DuplicarTipoVisual"));
		
		this.jButtonCopiarTipoVisual.addActionListener(new ButtonActionListener(this,"CopiarTipoVisual"));
		
		this.jButtonVerFormTipoVisual.addActionListener(new ButtonActionListener(this,"VerFormTipoVisual"));
		
		
		this.jButtonNuevoToolBarTipoVisual.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoVisual"));
			
		this.jButtonDuplicarToolBarTipoVisual.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoVisual"));
			
		this.jMenuItemNuevoTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoVisual"));
			
		this.jMenuItemDuplicarTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoVisual"));		
		
		
		this.jButtonNuevoRelacionesTipoVisual.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoVisual"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoVisual.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoVisual"));
			
		this.jMenuItemNuevoRelacionesTipoVisual.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoVisual"));		
		
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.jButtonModificarTipoVisual.addActionListener(new ButtonActionListener(this,"ModificarTipoVisual"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.jButtonModificarToolBarTipoVisual.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoVisual"));
			
			this.jInternalFrameDetalleFormTipoVisual.jMenuItemModificarTipoVisual.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoVisual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoVisual.jButtonActualizarTipoVisual.addActionListener (new ButtonActionListener(this,"ActualizarTipoVisual"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.jButtonActualizarToolBarTipoVisual.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoVisual"));
				
			this.jInternalFrameDetalleFormTipoVisual.jMenuItemActualizarTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoVisual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.jButtonEliminarTipoVisual.addActionListener (new ButtonActionListener(this,"EliminarTipoVisual"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.jButtonEliminarToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoVisual"));
						
			this.jInternalFrameDetalleFormTipoVisual.jMenuItemEliminarTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoVisual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.jButtonCancelarTipoVisual.addActionListener (new ButtonActionListener(this,"CancelarTipoVisual"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.jButtonCancelarToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoVisual"));
			
			this.jInternalFrameDetalleFormTipoVisual.jMenuItemCancelarTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoVisual"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoVisual"));		
		
		
		this.jButtonCerrarTipoVisual.addActionListener (new ButtonActionListener(this,"CerrarTipoVisual"));
		
		
		this.jButtonCerrarToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoVisual"));
			
		this.jMenuItemCerrarTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoVisual"));
			
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.jMenuItemDetalleCerrarTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoVisual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.jButtonGuardarCambiosTipoVisual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoVisual"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.jButtonGuardarCambiosToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVisual"));
		}
		
		this.jButtonCopiarToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoVisual"));
			
		this.jButtonVerFormToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoVisual"));
		
		this.jMenuItemGuardarCambiosTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoVisual"));
			
		this.jMenuItemCopiarTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoVisual"));		
		
		this.jMenuItemVerFormTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoVisual"));		
		
		
		this.jButtonGuardarCambiosTablaTipoVisual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoVisual"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoVisual"));
			
		this.jMenuItemGuardarCambiosTablaTipoVisual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoVisual"));		
		
		
		
		this.jButtonRecargarInformacionTipoVisual.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoVisual"));
					
		this.jButtonRecargarInformacionToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoVisual"));
		
		this.jMenuItemRecargarInformacionTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoVisual"));		
		
		
		
		this.jButtonAnterioresTipoVisual.addActionListener (new ButtonActionListener(this,"AnterioresTipoVisual"));
		
		
		this.jButtonAnterioresToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoVisual"));
		
		this.jMenuItemAnterioresTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoVisual"));		
		
		
		this.jButtonSiguientesTipoVisual.addActionListener (new ButtonActionListener(this,"SiguientesTipoVisual"));
		
		
		this.jButtonSiguientesToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoVisual"));
			
		this.jMenuItemSiguientesTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoVisual"));
			
		this.jMenuItemAbrirOrderByTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoVisual"));
			
		this.jMenuItemMostrarOcultarTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoVisual"));
			
		this.jMenuItemDetalleAbrirOrderByTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoVisual"));
			
		this.jMenuItemDetalleMostarOcultarTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoVisual"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoVisual.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoVisual"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoVisual"));
			
		this.jMenuItemNuevoGuardarCambiosTipoVisual.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoVisual"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoVisual.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoVisual"));

		this.jCheckBoxSeleccionadosTipoVisual.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoVisual"));
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.jComboBoxTiposAccionesFormularioTipoVisual.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoVisual"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoVisual.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoVisual"));
			
		this.jComboBoxTiposAccionesTipoVisual.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoVisual"));
					
		this.jComboBoxTiposSeleccionarTipoVisual.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoVisual"));
			
		this.jTextFieldValorCampoGeneralTipoVisual.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoVisual"));		
		
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVisual.jButtonidTipoVisualBusqueda.addActionListener(new ButtonActionListener(this,"idTipoVisualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVisual.jButtoncodigoTipoVisualBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoVisualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVisual.jButtonnombreTipoVisualBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoVisualBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoVisual.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoVisual"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoVisual!=null) {
				this.jInternalFrameReporteDinamicoTipoVisual.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVisual"));
				this.jInternalFrameReporteDinamicoTipoVisual.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVisual"));
				this.jInternalFrameReporteDinamicoTipoVisual.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVisual"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoVisual.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVisual"));				
			//this.jButtonGenerarReporteDinamicoTipoVisual.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVisual"));
			//this.jButtonGenerarExcelReporteDinamicoTipoVisual.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVisual"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoVisual!=null) {
				this.jInternalFrameImportacionTipoVisual.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoVisual"));
				this.jInternalFrameImportacionTipoVisual.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoVisual"));
				this.jInternalFrameImportacionTipoVisual.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoVisual"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoVisual.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoVisual"));
			
			this.jButtonAbrirOrderByToolBarTipoVisual.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoVisual"));			
			
			if(this.jInternalFrameOrderByTipoVisual!=null) {
				this.jInternalFrameOrderByTipoVisual.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoVisual"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoVisual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVisual.jTabbedPaneRelacionesTipoVisual.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoVisual"));
		
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
            		closingInternalFrameTipoVisual();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoVisual.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoVisual = (JInternalFrameBase)event.getSource();
	            	
	            TipoVisualBeanSwingJInternalFrame jInternalFrameParent=(TipoVisualBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoVisual.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoVisualActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoVisual.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoVisualListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoVisual.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoVisual.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVisualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVisualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVisualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoVisual";
		inputMap = this.jButtonNuevoTipoVisual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoVisual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoVisualActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVisualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVisualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVisualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoVisual";
		inputMap = this.jButtonNuevoRelacionesTipoVisual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoVisual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoVisualActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoVisual";
		inputMap = this.jButtonModificarTipoVisual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoVisual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoVisualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoVisual";
		inputMap = this.jButtonActualizarTipoVisual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoVisual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoVisualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoVisual";
		inputMap = this.jButtonEliminarTipoVisual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoVisual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoVisualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoVisual";
		inputMap = this.jButtonCancelarTipoVisual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoVisual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoVisualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoVisual";
		inputMap = this.jButtonCerrarTipoVisual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoVisual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoVisualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoVisual.jButtonGuardarCambiosTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoVisual";
		inputMap = this.jInternalFrameDetalleFormTipoVisual.jButtonGuardarCambiosTipoVisual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoVisual.jButtonGuardarCambiosTipoVisual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoVisualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoVisual.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoVisualItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoVisual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoVisualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoVisual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoVisualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoVisual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoVisualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVisual.jButtonidTipoVisualBusqueda.addActionListener(new ButtonActionListener(this,"idTipoVisualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVisual.jButtoncodigoTipoVisualBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoVisualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVisual.jButtonnombreTipoVisualBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoVisualBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoVisual.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoVisual"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoVisual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoVisualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoVisualActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoVisual.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoVisual(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoVisual tipovisualAux:this.tipovisualLogic.getTipoVisuals()) {
					tipovisualAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVisual tipovisualAux:tipovisuals) {
					tipovisualAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoVisualItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoVisual(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoVisual tipovisualAux:this.tipovisualLogic.getTipoVisuals()) {
						tipovisualAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVisual tipovisualAux:tipovisuals) {
						tipovisualAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoVisual tipovisualAux:this.tipovisualLogic.getTipoVisuals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVisual tipovisualAux:tipovisuals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoVisual(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoVisual.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoVisual.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoVisual,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoVisualItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoVisual(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoVisual.getSelectedRows();
			
			TipoVisual tipovisualLocal=new TipoVisual();
			
			//this.seleccionarTodosTipoVisual(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovisualLocal =(TipoVisual) this.tipovisualLogic.getTipoVisuals().toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipovisualLocal =(TipoVisual) this.tipovisuals.toArray()[this.jTableDatosTipoVisual.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipovisualLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoVisual tipovisualAux:this.tipovisualLogic.getTipoVisuals()) {
						tipovisualAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVisual tipovisualAux:tipovisuals) {
						tipovisualAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoVisual(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoVisual.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoVisual.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoVisual,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoVisualItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoVisualParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoVisualActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoVisual(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoVisual.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoVisual tipovisualAux:this.tipovisualLogic.getTipoVisuals()) {
				
						if(sTipoSeleccionar.equals(TipoVisualConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipovisualAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoVisualConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipovisualAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVisual tipovisualAux:tipovisuals) {
					
						if(sTipoSeleccionar.equals(TipoVisualConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipovisualAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoVisualConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipovisualAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoVisual(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoVisualActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoVisual(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoVisual=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoVisual.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoVisual.jComboBoxTiposAccionesFormularioTipoVisual.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoVisual) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoVisual(conSplash);
				
					this.generarReporteTipoVisualsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVisual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVisual.jComboBoxTiposAccionesFormularioTipoVisual.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoVisualsSeleccionados();
				//this.jComboBoxTiposAccionesTipoVisual.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoVisualsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoVisual.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoVisualsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoVisual.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoVisual();
				
				this.exportarTipoVisualsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVisual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVisual.jComboBoxTiposAccionesFormularioTipoVisual.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoVisuals();
				//this.importarTipoVisuals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVisual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVisual.jComboBoxTiposAccionesFormularioTipoVisual.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoVisual();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoVisualsSeleccionados();
				//this.jComboBoxTiposAccionesTipoVisual.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Visual", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoVisual();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoVisual)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoVisual(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Visual",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVisual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVisual.jComboBoxTiposAccionesFormularioTipoVisual.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoVisual();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoVisual(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoVisualActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoVisual();
			
			if(this.jInternalFrameDetalleFormTipoVisual==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();		
			TipoVisual tipovisual=new TipoVisual();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoVisual(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoVisual.getSelectedItem();
			
			
			
			
			tipovisualsSeleccionados=this.getTipoVisualsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipovisualsSeleccionados.size()==1) {
				for(TipoVisual tipovisualAux:tipovisualsSeleccionados) {
					tipovisual=tipovisualAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoVisual();
			
      		//this.finishProcessTipoVisual(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoVisualReturnGeneral() throws Exception {
		if(this.tipovisualReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipovisualReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipovisualReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipovisualReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipovisualReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipovisualReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoVisual(false);
		}
		
		if(this.tipovisualReturnGeneral.getConRetornoLista() || this.tipovisualReturnGeneral.getConRetornoObjeto()) {
			if(this.tipovisualReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipovisualLogic.setTipoVisuals(this.tipovisualReturnGeneral.getTipoVisuals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipovisualReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipovisualLogic.setTipoVisual(this.tipovisualReturnGeneral.getTipoVisual());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoVisual(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoVisual() throws Exception {
		
		
	}
	
	public ArrayList<TipoVisual> getTipoVisualsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoVisual) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoVisual tipovisualAux:tipovisualLogic.getTipoVisuals()) {
					if(tipovisualAux.getIsSelected()) {
						tipovisualsSeleccionados.add(tipovisualAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVisual tipovisualAux:this.tipovisuals) {
					if(tipovisualAux.getIsSelected()) {
						tipovisualsSeleccionados.add(tipovisualAux);				
					}
				}
			}
			
			if(tipovisualsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipovisualsSeleccionados.addAll(this.tipovisualLogic.getTipoVisuals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipovisualsSeleccionados.addAll(this.tipovisuals);				
					}
				}
			}
		} else {
			tipovisualsSeleccionados.add(this.tipovisual);
		}
		
		return tipovisualsSeleccionados;
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
	
	public void generarReporteTipoVisualsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoVisualsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoVisualsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoVisualsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoVisualsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Visual",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoVisualsSeleccionados() throws Exception {
		ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();		
		
		tipovisualsSeleccionados=this.getTipoVisualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoVisuals("Todos",tipovisualsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoVisualsSeleccionados() throws Exception {
		ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();		
		
		tipovisualsSeleccionados=this.getTipoVisualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoVisuals("Todos",tipovisualsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoVisualsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();
		
		tipovisualsSeleccionados=this.getTipoVisualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoVisuals("Todos",tipovisualsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoVisualsSeleccionados() throws Exception {
		ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoVisual();
		
		
		tipovisualsSeleccionados=this.getTipoVisualsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoVisual();
		
		
		//this.generarReporteTipoVisuals("Todos",tipovisualsSeleccionados ,tipovisualImplementable,tipovisualImplementableHome);
	}
	
	public void mostrarImportacionTipoVisuals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoVisual();
		
		this.abrirFrameImportacionTipoVisual();		
		
			
		//this.generarReporteTipoVisuals("Todos",tipovisualsSeleccionados ,tipovisualImplementable,tipovisualImplementableHome);
	}
	
	public void importarTipoVisuals() throws Exception {		
	
	}
	
	public void exportarTipoVisualsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoVisualsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoVisualsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoVisualsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Visual",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoVisualsSeleccionados() throws Exception {
		ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();		
		
		tipovisualsSeleccionados=this.getTipoVisualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovisual."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoVisual(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoVisual tipovisualAux:tipovisualsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoVisual(tipovisualAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipovisualAux.setsDetalleGeneralEntityReporte(tipovisualAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Visual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoVisual(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoVisualConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVisualConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVisualConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVisualConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoVisual(TipoVisual tipovisual,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipovisual.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovisual.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovisual.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovisual.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoVisualsSeleccionados() throws Exception {
		ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();		
		
		tipovisualsSeleccionados=this.getTipoVisualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovisual.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoVisuals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoVisual(row);				
				iRow++;
			}				
			
			for(TipoVisual tipovisualAux:tipovisualsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoVisual(tipovisualAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Visual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoVisualsSeleccionados() throws Exception {
		ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();		
		
		tipovisualsSeleccionados=this.getTipoVisualsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovisual.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipovisuals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipovisual");
			//elementRoot.appendChild(element);
		
			for(TipoVisual tipovisualAux:tipovisualsSeleccionados) {
				element = document.createElement("tipovisual");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoVisual(tipovisualAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Visual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoVisual(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVisualConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVisualConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoVisualConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVisualConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoVisual(TipoVisual tipovisual,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipovisual.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovisual.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovisual.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoVisual(TipoVisual tipovisual,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoVisualConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipovisual.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoVisualConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipovisual.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoVisualConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipovisual.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoVisualConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipovisual.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoVisualsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoVisual> tipovisualsSeleccionados=new ArrayList<TipoVisual>();
		
		tipovisualsSeleccionados=this.getTipoVisualsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoVisual(tipovisualsSeleccionados);
		
		this.generarReporteTipoVisuals("Todos",tipovisualsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoVisual(ArrayList<TipoVisual> tipovisualsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoVisual tipovisualAux:tipovisualsSeleccionados) {
				tipovisualAux.setsDetalleGeneralEntityReporte(tipovisualAux.toString());
			
				if(sTipoSeleccionar.equals(TipoVisualConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipovisualAux.setsDescripcionGeneralEntityReporte1(tipovisualAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoVisualConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipovisualAux.setsDescripcionGeneralEntityReporte1(tipovisualAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVisualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoVisual(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoVisual=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoVisual=true;
				this.isVisibilidadCeldaGuardarCambiosTipoVisual=true;
			}
			
			this.isVisibilidadCeldaModificarTipoVisual=false;
			this.isVisibilidadCeldaActualizarTipoVisual=false;
			this.isVisibilidadCeldaEliminarTipoVisual=false;
			this.isVisibilidadCeldaCancelarTipoVisual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVisual=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVisual=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoVisual=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVisual=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVisual=false;
			this.isVisibilidadCeldaModificarTipoVisual=false;
			this.isVisibilidadCeldaActualizarTipoVisual=true;
			this.isVisibilidadCeldaEliminarTipoVisual=false;
			this.isVisibilidadCeldaCancelarTipoVisual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVisual=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVisual=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoVisual=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVisual=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVisual=false;
			this.isVisibilidadCeldaModificarTipoVisual=false;
			this.isVisibilidadCeldaActualizarTipoVisual=true;
			this.isVisibilidadCeldaEliminarTipoVisual=true;
			this.isVisibilidadCeldaCancelarTipoVisual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVisual=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVisual=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoVisual=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVisual=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVisual=false;
			this.isVisibilidadCeldaModificarTipoVisual=false;
			this.isVisibilidadCeldaActualizarTipoVisual=true;
			this.isVisibilidadCeldaEliminarTipoVisual=false;
			this.isVisibilidadCeldaCancelarTipoVisual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVisual=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVisual=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoVisual=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVisual=true;
			this.isVisibilidadCeldaGuardarCambiosTipoVisual=true;
			this.isVisibilidadCeldaModificarTipoVisual=false;
			this.isVisibilidadCeldaActualizarTipoVisual=false;
			this.isVisibilidadCeldaEliminarTipoVisual=false;
			this.isVisibilidadCeldaCancelarTipoVisual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVisual=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVisual=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoVisual=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVisual=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVisual=false;
			this.isVisibilidadCeldaActualizarTipoVisual=false;
			this.isVisibilidadCeldaEliminarTipoVisual=false;
			this.isVisibilidadCeldaCancelarTipoVisual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVisual=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVisual=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoVisual=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVisual=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVisual=false;
			this.isVisibilidadCeldaModificarTipoVisual=true;
			this.isVisibilidadCeldaActualizarTipoVisual=false;
			this.isVisibilidadCeldaEliminarTipoVisual=false;
			this.isVisibilidadCeldaCancelarTipoVisual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVisual=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVisual=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoVisualJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoVisual=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVisual=true;
			this.isVisibilidadCeldaGuardarCambiosTipoVisual=true;
		} else {
			this.actualizarEstadoPanelsTipoVisual(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoVisual=false;
			//this.isVisibilidadCeldaVerFormTipoVisual=false;
			this.isVisibilidadCeldaDuplicarTipoVisual=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipovisualSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoVisual=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoVisual=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVisual=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipovisualSessionBean.getEsGuardarRelacionado()) {
			if(!tipovisualSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoVisual=false;												
			}
			
			this.jButtonCerrarTipoVisual.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoVisual=false;
		}
		
		if(!this.permiteMantenimiento(this.tipovisual)) {
			this.isVisibilidadCeldaActualizarTipoVisual=false;
			this.isVisibilidadCeldaEliminarTipoVisual=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoVisual() {
	}
	
	public void actualizarEstadoPanelsTipoVisual(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoVisual!=null) {
				this.jScrollPanelDatosEdicionTipoVisual.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVisual!=null) {
				this.jTabbedPaneBusquedasTipoVisual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVisual!=null) {
				this.jScrollPanelDatosTipoVisual.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVisual!=null) {
				this.jPanelPaginacionTipoVisual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVisual!=null) {
				this.jPanelParametrosReportesTipoVisual.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoVisual!=null) {
				this.jScrollPanelDatosEdicionTipoVisual.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVisual!=null) {
				this.jTabbedPaneBusquedasTipoVisual.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoVisual!=null) {
				this.jScrollPanelDatosTipoVisual.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVisual!=null) {
				this.jPanelPaginacionTipoVisual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVisual!=null) {
				this.jPanelParametrosReportesTipoVisual.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoVisual!=null) {
				this.jScrollPanelDatosEdicionTipoVisual.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVisual!=null) {
				this.jTabbedPaneBusquedasTipoVisual.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoVisual!=null) {
				this.jScrollPanelDatosTipoVisual.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVisual!=null) {
				this.jPanelPaginacionTipoVisual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVisual!=null) {
				this.jPanelParametrosReportesTipoVisual.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoVisual!=null) {
				this.jScrollPanelDatosEdicionTipoVisual.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVisual!=null) {
				this.jTabbedPaneBusquedasTipoVisual.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoVisual!=null) {
				this.jScrollPanelDatosTipoVisual.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVisual!=null) {
				this.jPanelPaginacionTipoVisual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVisual!=null) {
				this.jPanelParametrosReportesTipoVisual.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoVisual!=null) {
				this.jScrollPanelDatosEdicionTipoVisual.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVisual!=null) {
				this.jTabbedPaneBusquedasTipoVisual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVisual!=null) {
				this.jScrollPanelDatosTipoVisual.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVisual!=null) {
				this.jPanelPaginacionTipoVisual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVisual!=null) {
				this.jPanelParametrosReportesTipoVisual.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoVisual!=null) {
				this.jScrollPanelDatosEdicionTipoVisual.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVisual!=null) {
				this.jTabbedPaneBusquedasTipoVisual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVisual!=null) {
				this.jScrollPanelDatosTipoVisual.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVisual!=null) {
				this.jPanelPaginacionTipoVisual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVisual!=null) {
				this.jPanelParametrosReportesTipoVisual.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoVisual!=null) {
				this.jScrollPanelDatosEdicionTipoVisual.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVisual!=null) {
				this.jTabbedPaneBusquedasTipoVisual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVisual!=null) {
				this.jScrollPanelDatosTipoVisual.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVisual!=null) {
				this.jPanelPaginacionTipoVisual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVisual!=null) {
				this.jPanelParametrosReportesTipoVisual.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipovisualSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoVisual!=null) {
					this.jTabbedPaneBusquedasTipoVisual.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoVisual!=null) {
				this.jPanelParametrosReportesTipoVisual.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipovisualSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVisual!=null) {
				this.jTabbedPaneBusquedasTipoVisual.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoVisual!=null) {
				this.jPanelParametrosReportesTipoVisual.setVisible(true);
			}
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoVisualSessionBean tipovisualSessionBean=new TipoVisualSessionBean();
		
		if(this.tipovisualSessionBean==null) {
			this.tipovisualSessionBean=new TipoVisualSessionBean();
		}
		
		this.tipovisualSessionBean.setsUltimaBusquedaTipoVisual(this.getsAccionBusqueda());
		this.tipovisualSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipovisualSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipovisualSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoVisualSessionBean tipovisualSessionBean=new TipoVisualSessionBean();
		
		if(this.tipovisualSessionBean==null) {
			this.tipovisualSessionBean=new TipoVisualSessionBean();
		}
		
		if(this.tipovisualSessionBean.getsUltimaBusquedaTipoVisual()!=null&&!this.tipovisualSessionBean.getsUltimaBusquedaTipoVisual().equals("")) {
			this.setsAccionBusqueda(tipovisualSessionBean.getsUltimaBusquedaTipoVisual());
			this.setiNumeroPaginacion(tipovisualSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipovisualSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipovisualSessionBean.getnombre());
				tipovisualSessionBean.setnombre("");
			}
		}
		
		this.tipovisualSessionBean.setsUltimaBusquedaTipoVisual("");
		this.tipovisualSessionBean.setiNumeroPaginacion(TipoVisualConstantesFunciones.INUMEROPAGINACION);
		this.tipovisualSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoVisual(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoVisual() {
		this.updateBorderResaltarBusquedasFormularioTipoVisual();
		this.updateVisibilidadBusquedasFormularioTipoVisual();
		this.updateHabilitarBusquedasFormularioTipoVisual();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoVisual() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoVisual.getComponents().length>0) {
	

		if(this.tipovisualConstantesFunciones.resaltarBusquedaPorNombreTipoVisual!=null) {
			index= this.jTabbedPaneBusquedasTipoVisual.indexOfComponent(this.jPanelBusquedaPorNombreTipoVisual);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoVisual.getComponent(index);
				jPanel.setBorder(this.tipovisualConstantesFunciones.resaltarBusquedaPorNombreTipoVisual);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoVisual() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoVisual.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoVisual.indexOfComponent(this.jPanelBusquedaPorNombreTipoVisual);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoVisual.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipovisualConstantesFunciones.mostrarBusquedaPorNombreTipoVisual);
			if(!this.tipovisualConstantesFunciones.mostrarBusquedaPorNombreTipoVisual && index>-1) {
				this.jTabbedPaneBusquedasTipoVisual.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoVisual() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoVisual.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoVisual.indexOfComponent(this.jPanelBusquedaPorNombreTipoVisual);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoVisual.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipovisualConstantesFunciones.activarBusquedaPorNombreTipoVisual);
				this.jTabbedPaneBusquedasTipoVisual.setEnabledAt(index,this.tipovisualConstantesFunciones.activarBusquedaPorNombreTipoVisual);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoVisual(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoVisual.indexOfComponent(this.jPanelBusquedaPorNombreTipoVisual);

			this.jTabbedPaneBusquedasTipoVisual.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoVisual.getComponent(index);

			this.tipovisualConstantesFunciones.setResaltarBusquedaPorNombreTipoVisual(resaltar);

			jPanel.setBorder(this.tipovisualConstantesFunciones.resaltarBusquedaPorNombreTipoVisual);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoVisual.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoVisual() throws Exception {

		if(this.jInternalFrameDetalleFormTipoVisual==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoVisual();
		this.updateVisibilidadResaltarControlesFormularioTipoVisual();
		this.updateHabilitarResaltarControlesFormularioTipoVisual();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoVisual() throws Exception {
		if(this.jInternalFrameDetalleFormTipoVisual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipovisualConstantesFunciones.resaltaridTipoVisual!=null && this.jInternalFrameDetalleFormTipoVisual!=null) {this.jInternalFrameDetalleFormTipoVisual.jTextFieldidTipoVisual.setBorder(this.tipovisualConstantesFunciones.resaltaridTipoVisual);}
		if(this.tipovisualConstantesFunciones.resaltarcodigoTipoVisual!=null && this.jInternalFrameDetalleFormTipoVisual!=null) {this.jInternalFrameDetalleFormTipoVisual.jTextFieldcodigoTipoVisual.setBorder(this.tipovisualConstantesFunciones.resaltarcodigoTipoVisual);}
		if(this.tipovisualConstantesFunciones.resaltarnombreTipoVisual!=null && this.jInternalFrameDetalleFormTipoVisual!=null) {this.jInternalFrameDetalleFormTipoVisual.jTextAreanombreTipoVisual.setBorder(this.tipovisualConstantesFunciones.resaltarnombreTipoVisual);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoVisual() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoVisual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) {
	
		//this.jInternalFrameDetalleFormTipoVisual.jTextFieldidTipoVisual.setVisible(this.tipovisualConstantesFunciones.mostraridTipoVisual);
		this.jInternalFrameDetalleFormTipoVisual.jPanelidTipoVisual.setVisible(this.tipovisualConstantesFunciones.mostraridTipoVisual);
		//this.jInternalFrameDetalleFormTipoVisual.jTextFieldcodigoTipoVisual.setVisible(this.tipovisualConstantesFunciones.mostrarcodigoTipoVisual);
		this.jInternalFrameDetalleFormTipoVisual.jPanelcodigoTipoVisual.setVisible(this.tipovisualConstantesFunciones.mostrarcodigoTipoVisual);
		//this.jInternalFrameDetalleFormTipoVisual.jTextAreanombreTipoVisual.setVisible(this.tipovisualConstantesFunciones.mostrarnombreTipoVisual);
		this.jInternalFrameDetalleFormTipoVisual.jPanelnombreTipoVisual.setVisible(this.tipovisualConstantesFunciones.mostrarnombreTipoVisual);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoVisual() throws Exception {
		if(this.jInternalFrameDetalleFormTipoVisual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoVisual!=null) {
	
		this.jInternalFrameDetalleFormTipoVisual.jTextFieldidTipoVisual.setEnabled(this.tipovisualConstantesFunciones.activaridTipoVisual);
		this.jInternalFrameDetalleFormTipoVisual.jTextFieldcodigoTipoVisual.setEnabled(this.tipovisualConstantesFunciones.activarcodigoTipoVisual);
		this.jInternalFrameDetalleFormTipoVisual.jTextAreanombreTipoVisual.setEnabled(this.tipovisualConstantesFunciones.activarnombreTipoVisual);
		}
	}
	
		
}